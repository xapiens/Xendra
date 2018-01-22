/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                        *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.process;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import org.compiere.model.MAcctSchema;
import org.compiere.model.MClient;
import org.compiere.model.MCostCalc;
import org.compiere.model.MCostElement;
import org.compiere.model.reference.REF_C_AcctSchemaCostingMethod;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.XendraUserError;
import org.xendra.annotations.XendraProcess;

/**
 * PRepare the cost records for recalculation.
 * Basically take a  product (or all) and for the specified date
 * invalidate all records to allow the cost processor to
 * recalc the costs.
 * 
 * @author carana
 * @version $Id: CostUpdate.java 5583 2015-08-05 14:11:58Z xapiens $
 */
public class CostUpdate extends SvrProcess {
	/** Product to process <= 0 all */
	private int p_M_Product_ID = 0;
	/** Invalidate form date */
	private Timestamp p_FromDate = null;

	/**
	 * Prepare
	 */
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++) {
			String name = para[i].getParameterName();
			// log.fine("prepare - " + para[i]);
			if (para[i].getParameter() == null)
				;
			else if (name.equals("M_Product_ID"))
				p_M_Product_ID = para[i].getParameterAsInt();
			else if (name.equals("DateFrom"))
				p_FromDate = (Timestamp) para[i].getParameter();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	} // prepare

	/**
	 * Process , invalidate all the calculated costs for the specified products
	 * from the requiered date.
	 * 
	 * @return info
	 * @throws Exception
	 */
//	@XendraProcess(value="M_Cost_Update",
//	name="Standard Cost Update",
//	description="Set standard and future cost price",
//	help="For Standard Costs you can set/recalculate the current or future cost price (for the cost type of the accounting schema). If the Costing Level of the Accounting Schema is set to Client, missing cost records are created. The historical costs are calculated based on the accumulated amount/quantity of the costing method.",
//	id="7311bc15-8e71-0a88-e636-41fae5daf100",
//	ParametersName={"M_Product_Category_ID",
//	"SetStandardCostTo",
//	"SetFutureCostTo",
//	"M_PriceList_Version_ID"},
//	ParametersType={DisplayType.TableDir,
//	DisplayType.List,
//	DisplayType.List,
//	DisplayType.TableDir},
//	ParametersSeqNo={10,20,30,40},
//	ParametersReference={"3cefd939-fdfe-f99a-8105-07955b81a4cd",
//	"8846760d-b892-c47e-5f24-cbfc1d7dcb31",
//	"8846760d-b892-c47e-5f24-cbfc1d7dcb31",
//	"3cefd939-fdfe-f99a-8105-07955b81a4cd"},
//	ParametersReferenceValue={"",
//	"",
//	"",
//	""},
//	ParametersIsMandatory={"N","N","N","N"},
//	ParametersIsRange={"N","N","N","N"},
//	ParametersDefaultValue={"-1","","",""},
//	ParametersDefaultValue2={"","","",""},
//	ParametersvFormat={"","","",""},
//	ParametersvalueMin={"","","",""},
//	ParametersvalueMax={"","","",""},
//	ParametersDisplayLogic={"","","",""},
//	ParametersReadOnlyLogic={"","","",""})	
	protected String doIt() throws Exception {
		log.info("M_Product_ID=" + p_M_Product_ID + ", Date From ="
				+ p_FromDate.toString());
		if (p_FromDate == null)
			throw new XendraUserError("@FillMandatory@  @FromDate@");

		// Prepare
		MClient client = MClient.get(getCtx());

		MAcctSchema as = MClient.get(getCtx(), getAD_Client_ID()).getAcctSchema();

		MCostElement ce = new MCostElement (Env.getCtx(), as.getM_CostElement_ID(), null);
		// Update Cost
		int counter = 0;

		List<Integer> lproducts = null;
		// Get all the cost methods to process
		if (p_M_Product_ID > 0) {
			//if (ce.invalidateCostForProduct(client.getAD_Client_ID(), 0,p_M_Product_ID, p_FromDate, null) > 0)
				counter++;
		} else {
			// All products
			lproducts = getCostedProducts(client.getAD_Client_ID(),
					REF_C_AcctSchemaCostingMethod.AveragePO);
			if (lproducts != null) {
				for (Integer product_id : lproducts) {
					// Dont need transactions here , each product is
					// indepndent , if one fails the other can
					// work.
					//if (ce.invalidateCostForProduct(client.getAD_Client_ID(), 0,product_id, p_FromDate,  null) > 0)
						counter++;
				}
			}
		}
		return "#" + counter;
	} // doIt

	/**
	 * Get all the products that are previously costed , this will be associated
	 * to the client_id and not the org id.
	 * 
	 * @return a List<Integer> with the products ids or null on error or nothing
	 *         to process.
	 */
	private final List<Integer> getCostedProducts(int m_ad_client_id,
			String m_costingMethod) {
		int m_costelement_id = 0;
		List<Integer> products_id = null;
		Statement pstmt = null;
		ResultSet rs = null;
		boolean onError = false;

		// Get the costelement id
		m_costelement_id = getCostElementId(m_costingMethod);
		if (m_costelement_id < 0) {
			addLog("CostUpdate::getCostedProducts() cant process no existing"
					+ " cost element associated to the cost method = "
					+ m_costingMethod);
			return null;
		}

		String sql = "select distinct(m.m_product_id) from m_costCalc m "
				+ "where m.ad_client_id = " + m_ad_client_id
				+ " and m_costelement_id=" + m_costelement_id
				+ " and ismanual = 'N'"
				+ " order by m.m_product_id";

		// Get products with movement.
		//
		try {
			pstmt = DB.createStatement();
			rs = pstmt.executeQuery(sql);
			// Do the product cost process for each one
			while (rs.next()) {
				if (products_id == null) {
					products_id = new ArrayList<Integer>();
				}
				products_id.add(rs.getInt(1));
			}
		} catch (Exception ex) {
			onError = true;
			addLog("CostUpdate::getCostedProducts() -Cant read product list executing : "
					+ sql.toString() + " Exception : " + ex.getLocalizedMessage());
		} finally {
			// Cleanup
			DB.close(rs, pstmt);
			rs = null;
			pstmt = null;

		}

		if (onError == false) {
			return products_id;
		} else {
			if (products_id != null)
				products_id.clear();
			return null;
		}

	}

	/**
	 * Get Cost Element Id for an specific Costing Method
	 * 
	 * @param CostingMethod
	 *            method
	 * @return costing element id or -1 if not exist.
	 */
	private int getCostElementId(String CostingMethod) {
		return MCostElement.getCostElementID(getCtx(), CostingMethod);
	} // getCostElementId

} // CostUpdate
