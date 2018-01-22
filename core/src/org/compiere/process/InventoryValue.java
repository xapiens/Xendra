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

import java.sql.*;

import org.compiere.model.MAcctSchema;
import org.compiere.model.MClient;
import org.compiere.model.MWarehouse;
import org.compiere.util.*;

import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;
/**
 *  Inventory Valuation.
 *  Process to fill T_InventoryValue
 *
 *  @author     Jorg Janke
 *  @version    $Id: InventoryValue.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="InventoryValue",
name="Inventory Valuation Report",
description="Inventory Valuation Report",
help="Report lists products with their on-hand quantity and values at the valuation date. In addition to several prices, standard costs and an optional other cost element is used to calculate the inventory of the particular warehouse.",
Identifier="68c96842-7d4a-6c5f-5af3-ff4fd8faf46c",
classname="org.compiere.process.InventoryValue",
updated="2015-06-20 10:10:12")
public class InventoryValue extends SvrProcess
{
	/** Price List Used         */
	@XendraProcessParameter(Name="Price List Version",
			                ColumnName="M_PriceList_Version_ID",
			                Description="Identifies a unique instance of a Price List",
			                Help="Each Price List can have multiple versions.  The most common use is to indicate the dates that a Price List is valid for.",
			                AD_Reference_ID=DisplayType.TableDir,
			                SeqNo=30,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="7bb762f8-3fd4-f36d-5aa8-28d5ea5e1516")	
	private int         p_M_PriceList_Version_ID;
	/** Valuation Date          */
	@XendraProcessParameter(Name="Valuation Date",
			                ColumnName="DateValue",
			                Description="Date of valuation",
			                Help="",
			                AD_Reference_ID=DisplayType.Date,
			                SeqNo=40,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="79e8620d-b92a-7ec5-6ca8-21b1d48233ec")	
	private Timestamp   p_DateValue;
	/** Warehouse               */
	@XendraProcessParameter(Name="Warehouse",
			                ColumnName="M_Warehouse_ID",
			                Description="Storage Warehouse and Service Point",
			                Help="The Warehouse identifies a unique Warehouse where products are stored or Services are provided.",
			                AD_Reference_ID=DisplayType.TableDir,
			                SeqNo=10,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="6eeba39b-1376-7be1-46ec-a52e41ffa1f2")		
	private int         p_M_Warehouse_ID;
	/** Currency                */
	@XendraProcessParameter(Name="Currency",
			                ColumnName="C_Currency_ID",
			                Description="The Currency for this record",
			                Help="Indicates the Currency to be used when processing or reporting on this record",
			                AD_Reference_ID=DisplayType.TableDir,
			                SeqNo=20,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="cc0bcc50-56ac-d08d-2e43-9873fcbd0c13")	
	private int         p_C_Currency_ID;
	/** Optional Cost Element	*/
	@XendraProcessParameter(Name="Cost Element",
			                ColumnName="M_CostElement_ID",
			                Description="Product Cost Element",
			                Help="",
			                AD_Reference_ID=DisplayType.TableDir,
			                SeqNo=50,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="21d0efc9-8702-5394-a160-d542f8dacecc")	
	private int			p_M_CostElement_ID;

	/**
	 *  Prepare - get Parameters.
	 */
	protected void prepare()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("M_PriceList_Version_ID"))
				p_M_PriceList_Version_ID = para[i].getParameterAsInt();
			else if (name.equals("DateValue"))
				p_DateValue = (Timestamp)para[i].getParameter();
			else if (name.equals("M_Warehouse_ID"))
				p_M_Warehouse_ID = para[i].getParameterAsInt();
			else if (name.equals("C_Currency_ID"))
				p_C_Currency_ID = para[i].getParameterAsInt();
			else if (name.equals("M_CostElement_ID"))
				p_M_CostElement_ID = para[i].getParameterAsInt();
		}
		if (p_DateValue == null)
			p_DateValue = new Timestamp (System.currentTimeMillis());
	}   //  prepare

	/**
	 *  Perrform process.
	 *  <pre>
	 *  - Fill Table with QtyOnHand for Warehouse and Valuation Date
	 *  - Perform Price Calculations
	 *  </pre>
	 * @return Message
	 * @throws Exception
	 */
	protected String doIt() throws Exception
	{
		log.info("M_Warehouse_ID=" + p_M_Warehouse_ID
			+ ",C_Currency_ID=" + p_C_Currency_ID
			+ ",DateValue=" + p_DateValue
			+ ",M_PriceList_Version_ID=" + p_M_PriceList_Version_ID
			+ ",M_CostElement_ID=" + p_M_CostElement_ID);
		
		MWarehouse wh = MWarehouse.get(getCtx(), p_M_Warehouse_ID);
		MClient c = MClient.get(getCtx(), wh.getAD_Client_ID());
		MAcctSchema as = c.getAcctSchema();
		
		//  Delete (just to be sure)
		StringBuffer sql = new StringBuffer ("DELETE FROM T_InventoryValue WHERE AD_PInstance_ID=");
		sql.append(getAD_PInstance_ID());
		int no = DB.executeUpdate(sql.toString(), get_TrxName());

		//	Insert Standard Costs
		sql = new StringBuffer ("INSERT INTO T_InventoryValue "
			+ "(AD_PInstance_ID, M_Warehouse_ID, M_Product_ID, M_AttributeSetInstance_ID,"
			+ " AD_Client_ID, AD_Org_ID, CostStandard) "
			+ "SELECT ").append(getAD_PInstance_ID())
			.append(", w.M_Warehouse_ID, c.M_Product_ID, c.M_AttributeSetInstance_ID,"
			+ " w.AD_Client_ID, w.AD_Org_ID, c.CurrentCostPrice "
			+ "FROM M_Warehouse w"
			+ " INNER JOIN AD_ClientInfo ci ON (w.AD_Client_ID=ci.AD_Client_ID)"
			+ " INNER JOIN C_AcctSchema acs ON (ci.C_AcctSchema1_ID=acs.C_AcctSchema_ID)"
			+ " INNER JOIN M_Cost c ON (acs.C_AcctSchema_ID=c.C_AcctSchema_ID AND acs.M_CostType_ID=c.M_CostType_ID AND c.AD_Org_ID IN (0, w.AD_Org_ID))"
			+ " INNER JOIN M_CostElement ce ON (c.M_CostElement_ID=ce.M_CostElement_ID AND ce.CostingMethod='S' AND ce.CostElementType='M') "
			+ "WHERE w.M_Warehouse_ID=").append(p_M_Warehouse_ID);
		int noInsertStd = DB.executeUpdate(sql.toString(), get_TrxName());
		log.fine("Inserted Std=" + noInsertStd);
		if (noInsertStd == 0)
			return "No Standard Costs found";

		//	Insert addl Costs
		int noInsertCost = 0;
		if (p_M_CostElement_ID != 0)
		{
			sql = new StringBuffer ("INSERT INTO T_InventoryValue "
				+ "(AD_PInstance_ID, M_Warehouse_ID, M_Product_ID, M_AttributeSetInstance_ID,"
				+ " AD_Client_ID, AD_Org_ID, CostStandard, Cost, M_CostElement_ID) "
				+ "SELECT ").append(getAD_PInstance_ID())
				.append(", w.M_Warehouse_ID, c.M_Product_ID, c.M_AttributeSetInstance_ID,"
				+ " w.AD_Client_ID, w.AD_Org_ID, 0, c.CurrentCostPrice, c.M_CostElement_ID "
				+ "FROM M_Warehouse w"
				+ " INNER JOIN AD_ClientInfo ci ON (w.AD_Client_ID=ci.AD_Client_ID)"
				+ " INNER JOIN C_AcctSchema acs ON (ci.C_AcctSchema1_ID=acs.C_AcctSchema_ID)"
				+ " INNER JOIN M_Cost c ON (acs.C_AcctSchema_ID=c.C_AcctSchema_ID AND acs.M_CostType_ID=c.M_CostType_ID AND c.AD_Org_ID IN (0, w.AD_Org_ID)) "
				+ "WHERE w.M_Warehouse_ID=").append(p_M_Warehouse_ID)
				.append(" AND c.M_CostElement_ID=").append(p_M_CostElement_ID)
				.append(" AND NOT EXISTS (SELECT * FROM T_InventoryValue iv "
					+ "WHERE iv.AD_PInstance_ID=").append(getAD_PInstance_ID())
					.append(" AND iv.M_Warehouse_ID=w.M_Warehouse_ID"
					+ " AND iv.M_Product_ID=c.M_Product_ID"
					+ " AND iv.M_AttributeSetInstance_ID=c.M_AttributeSetInstance_ID)");
			noInsertCost = DB.executeUpdate(sql.toString(), get_TrxName());
			log.fine("Inserted Cost=" + noInsertCost);
			//	Update Std Cost Records
			sql = new StringBuffer ("UPDATE T_InventoryValue iv "
				+ "SET (Cost, M_CostElement_ID)="
					+ "(SELECT c.CurrentCostPrice, c.M_CostElement_ID "
					+ "FROM M_Warehouse w"
					+ " INNER JOIN AD_ClientInfo ci ON (w.AD_Client_ID=ci.AD_Client_ID)"
					+ " INNER JOIN C_AcctSchema acs ON (ci.C_AcctSchema1_ID=acs.C_AcctSchema_ID)"
					+ " INNER JOIN M_Cost c ON (acs.C_AcctSchema_ID=c.C_AcctSchema_ID"
						+ " AND acs.M_CostType_ID=c.M_CostType_ID AND c.AD_Org_ID IN (0, w.AD_Org_ID)) "
					+ "WHERE c.M_CostElement_ID=" + p_M_CostElement_ID
					+ " AND iv.M_Warehouse_ID=w.M_Warehouse_ID"
					+ " AND iv.M_Product_ID=c.M_Product_ID"
					+ " AND iv.M_AttributeSetInstance_ID=c.M_AttributeSetInstance_ID) "
				+ "WHERE EXISTS (SELECT * FROM T_InventoryValue ivv "
					+ "WHERE ivv.AD_PInstance_ID=" + getAD_PInstance_ID()
					+ " AND ivv.M_CostElement_ID IS NULL)");
			int noUpdatedCost = DB.executeUpdate(sql.toString(), get_TrxName());
			log.fine("Updated Cost=" + noUpdatedCost);
		}		
		if ((noInsertStd+noInsertCost) == 0)
			return "No Costs found";
		
		//  Update Constants
		//  YYYY-MM-DD HH24:MI:SS.mmmm  JDBC Timestamp format
		String myDate = p_DateValue.toString();
		sql = new StringBuffer ("UPDATE T_InventoryValue SET ")
			.append("DateValue=TO_DATE('").append(myDate.substring(0,10))
			.append(" 23:59:59','YYYY-MM-DD HH24:MI:SS'),")
			.append("M_PriceList_Version_ID=").append(p_M_PriceList_Version_ID).append(",")
			.append("C_Currency_ID=").append(p_C_Currency_ID);
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		log.fine("Constants=" + no);

		//  Get current QtyOnHand with ASI
		sql = new StringBuffer ("UPDATE T_InventoryValue iv SET QtyOnHand = "
				+ "(SELECT SUM(QtyOnHand) FROM M_Storage s"
				+ " INNER JOIN M_Locator l ON (l.M_Locator_ID=s.M_Locator_ID) "
				+ "WHERE iv.M_Product_ID=s.M_Product_ID"
				+ " AND iv.M_Warehouse_ID=l.M_Warehouse_ID"
				+ " AND iv.M_AttributeSetInstance_ID=s.M_AttributeSetInstance_ID) "
			+ "WHERE AD_PInstance_ID=").append(getAD_PInstance_ID())
			.append(" AND iv.M_AttributeSetInstance_ID<>0");
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		log.fine("QtHand with ASI=" + no);
		//  Get current QtyOnHand without ASI
		sql = new StringBuffer ("UPDATE T_InventoryValue iv SET QtyOnHand = "
				+ "(SELECT SUM(QtyOnHand) FROM M_Storage s"
				+ " INNER JOIN M_Locator l ON (l.M_Locator_ID=s.M_Locator_ID) "
				+ "WHERE iv.M_Product_ID=s.M_Product_ID"
				+ " AND iv.M_Warehouse_ID=l.M_Warehouse_ID) "
			+ "WHERE AD_PInstance_ID=").append(getAD_PInstance_ID())
			.append(" AND iv.M_AttributeSetInstance_ID=0");
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		log.fine("QtHand w/o ASI=" + no);
		
		//  Adjust for Valuation Date
		sql = new StringBuffer("UPDATE T_InventoryValue iv "
			+ "SET QtyOnHand="
				+ "(SELECT iv.QtyOnHand - COALESCE(SUM(t.MovementQty), 0) "
				+ "FROM M_Transaction t"
				+ " INNER JOIN M_Locator l ON (t.M_Locator_ID=l.M_Locator_ID) "
				+ "WHERE t.M_Product_ID=iv.M_Product_ID"
				+ " AND t.M_AttributeSetInstance_ID=iv.M_AttributeSetInstance_ID"
				+ " AND t.MovementDate > iv.DateValue"
				+ " AND l.M_Warehouse_ID=iv.M_Warehouse_ID) "
			+ "WHERE iv.M_AttributeSetInstance_ID<>0");
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		log.fine("Update with ASI=" + no);
		//
		sql = new StringBuffer("UPDATE T_InventoryValue iv "
			+ "SET QtyOnHand="
				+ "(SELECT iv.QtyOnHand - COALESCE(SUM(t.MovementQty), 0) "
				+ "FROM M_Transaction t"
				+ " INNER JOIN M_Locator l ON (t.M_Locator_ID=l.M_Locator_ID) "
				+ "WHERE t.M_Product_ID=iv.M_Product_ID"
				+ " AND t.MovementDate > iv.DateValue"
				+ " AND l.M_Warehouse_ID=iv.M_Warehouse_ID) "
			+ "WHERE iv.M_AttributeSetInstance_ID=0");
		no = DB.executeUpdate(sql.toString(), get_TrxName());
		log.fine("Update w/o ASI=" + no);
		
		//  Delete Records w/o OnHand Qty
		sql = new StringBuffer("DELETE FROM T_InventoryValue "
			+ "WHERE (QtyOnHand=0 OR QtyOnHand IS NULL) AND AD_PInstance_ID=").append(getAD_PInstance_ID());
		int noQty = DB.executeUpdate (sql.toString(), get_TrxName());
		log.fine("NoQty Deleted=" + noQty);

		//  Update Prices
		no = DB.executeUpdate ("UPDATE T_InventoryValue iv "
			+ "SET PricePO = "
				+ "(SELECT MAX(currencyConvert (po.PriceList,0,po.C_Currency_ID,iv.C_Currency_ID,iv.DateValue,null, po.AD_Client_ID,po.AD_Org_ID))"
				+ " FROM M_Product_PO po WHERE po.M_Product_ID=iv.M_Product_ID"
				+ " AND po.IsCurrentVendor='Y'), "
			+ "PriceList = "
				+ "(SELECT currencyConvert(pp.PriceList,0,pl.C_Currency_ID,iv.C_Currency_ID,iv.DateValue,null, pl.AD_Client_ID,pl.AD_Org_ID)"
				+ " FROM M_PriceList pl, M_PriceList_Version plv, M_ProductPrice pp"
				+ " WHERE pp.M_Product_ID=iv.M_Product_ID AND pp.M_PriceList_Version_ID=iv.M_PriceList_Version_ID"
				+ " AND pp.M_PriceList_Version_ID=plv.M_PriceList_Version_ID"
				+ " AND plv.M_PriceList_ID=pl.M_PriceList_ID), "
			+ "PriceStd = "
				+ "(SELECT currencyConvert(pp.PriceStd,0,pl.C_Currency_ID,iv.C_Currency_ID,iv.DateValue,null, pl.AD_Client_ID,pl.AD_Org_ID)"
				+ " FROM M_PriceList pl, M_PriceList_Version plv, M_ProductPrice pp"
				+ " WHERE pp.M_Product_ID=iv.M_Product_ID AND pp.M_PriceList_Version_ID=iv.M_PriceList_Version_ID"
				+ " AND pp.M_PriceList_Version_ID=plv.M_PriceList_Version_ID"
				+ " AND plv.M_PriceList_ID=pl.M_PriceList_ID), "
			+ "PriceLimit = "
				+ "(SELECT currencyConvert(pp.PriceLimit,0,pl.C_Currency_ID,iv.C_Currency_ID,iv.DateValue,null, pl.AD_Client_ID,pl.AD_Org_ID)"
				+ " FROM M_PriceList pl, M_PriceList_Version plv, M_ProductPrice pp"
				+ " WHERE pp.M_Product_ID=iv.M_Product_ID AND pp.M_PriceList_Version_ID=iv.M_PriceList_Version_ID"
				+ " AND pp.M_PriceList_Version_ID=plv.M_PriceList_Version_ID"
				+ " AND plv.M_PriceList_ID=pl.M_PriceList_ID)"
				, get_TrxName());
		String msg = "";
		if (no == 0)
			msg = "No Prices";

		//	Convert if different Currency
		if (as.getC_Currency_ID() != p_C_Currency_ID)
		{
			sql = new StringBuffer ("UPDATE T_InventoryValue iv "
				+ "SET CostStandard= "
					+ "(SELECT currencyConvert(iv.CostStandard,0,acs.C_Currency_ID,iv.C_Currency_ID,iv.DateValue,null, iv.AD_Client_ID,iv.AD_Org_ID) "
					+ "FROM C_AcctSchema acs WHERE acs.C_AcctSchema_ID=" + as.getC_AcctSchema_ID() + "),"
				+ "	Cost= "
					+ "(SELECT currencyConvert(iv.Cost,0,acs.C_Currency_ID,iv.C_Currency_ID,iv.DateValue,null, iv.AD_Client_ID,iv.AD_Org_ID) "
					+ "FROM C_AcctSchema acs WHERE acs.C_AcctSchema_ID=" + as.getC_AcctSchema_ID() + ") "
				+ "WHERE AD_PInstance_ID=" + getAD_PInstance_ID());
			no = DB.executeUpdate (sql.toString(), get_TrxName());
			log.fine("Convered=" + no);
		}
		
		//  Update Values
		no = DB.executeUpdate("UPDATE T_InventoryValue SET "
			+ "PricePOAmt = QtyOnHand * PricePO, "
			+ "PriceListAmt = QtyOnHand * PriceList, "
			+ "PriceStdAmt = QtyOnHand * PriceStd, "
			+ "PriceLimitAmt = QtyOnHand * PriceLimit, "
			+ "CostStandardAmt = QtyOnHand * CostStandard, "
			+ "CostAmt = QtyOnHand * Cost "
			+ "WHERE AD_PInstance_ID=" + getAD_PInstance_ID()
			, get_TrxName());
		log.fine("Calculation=" + no);
		//
		return msg;
	}   //  doIt

}   //  InventoryValue
