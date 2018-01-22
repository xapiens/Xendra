/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
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
 * Contributor(s): Teo Sarca                                                  *
 *****************************************************************************/
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Properties;
import java.util.logging.Level;

import org.compiere.model.persistence.X_M_CostCalc;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.xendra.cost.CostAverageCalc;

/**
 * Product Cost Calc Entry Model
 * 
 * @author carana
 * redesigned by xapiens
 */
public class MCostCalc extends X_M_CostCalc {

	/** Logger */
	private static CLogger s_log = CLogger.getCLogger(MCostCalc.class);

	/*********************************************************************
	 * FOR ALL COST SUPPORTED
	 ********************************************************************/



	/**
	 * Delete all associated cost entries for a product , for an specific client
	 * id . Actually all the costs created never use org id , in that case use
	 * zero.
	 * 
	 * IMPORTANT: Delete all the entries without any checks , please call this
	 * method only when its necessary , for example when a product its deleted.
	 * 
	 * @param client_id
	 *            the client id
	 * @param product_id
	 *            the product id
	 * @param org_id
	 *            The organization id - Actually all the costs are for the
	 *            client id, use zero by default.
	 * @param trxName
	 *            transaction name if null out of global transaction.
	 * @return -1 if fails , >= 0 as the number of records affected.
	 */
	public static final int deleteCostsForProduct(int client_id, int org_id,
			int product_id, String trxName) {
		int numAffected = 0;

		String sql = "delete from m_costCalc where m_product_id = "
				+ product_id + " and AD_Client_ID = " + client_id
				+ " and AD_Org_ID = " + org_id;

		try {
			numAffected = DB.executeUpdate(sql, trxName);
		} catch (Exception ex) {
			numAffected = -1;
		} finally {
			sql = null;
		}
		return numAffected;

	}

	public static int deleteCostsForAll(int client_id, int org_id, int costelement_id, int product_id, String trxName) {
		int numAffected = 0;
		String sql = "";
		if (product_id > 0)
		{
			sql = "DELETE from m_costCalc where IsManual='N' ";
			sql += " AND AD_Client_ID = " + client_id; 
			//sql += " and AD_Org_ID = " + org_id;
			sql += " AND M_Product_ID = " + product_id;
			sql += " and M_CostElement_ID = " + costelement_id;
		}
		else
		{
			sql = "DELETE from m_costCalc where IsManual='N' ";
			sql += " AND AD_Client_ID = " + client_id; 
			//sql += " and AD_Org_ID = " + org_id;
			sql += " and M_CostElement_ID = " + costelement_id;
		}
		try {
			numAffected = DB.executeUpdate(sql, trxName);
		} catch (Exception ex) {
			numAffected = -1;
		} finally {
			sql = null;
		}
		return numAffected;
	}
	
	public static final int ERROR_PRODUCT_NOT_COSTABLE = -1;
	public static final int ERROR_EXIST_INVALID_COSTS = -2;
	public static final int ERROR_NEED_RECALCULATION = -3;
	public static final int ERROR_NO_COSTS_GENERATED = -4;
	public static final int ERROR_NO_COSTELEMENT_DEFINED = -5;

	/**
	 * Get
	 * 
	 * @param errorCode
	 *            , values accepted are : -1 If the product is not costable -2
	 *            Exist invalid costs previos to the required date -3 Existing
	 *            pending movements to calculate after the required date or the
	 *            treuired date is out of the claculated range. -4 No costs
	 *            generated -5 No cost element defined for average cost.
	 */
	public static final String getTextError(int errorCode, String toAppend) {
		String error;
		switch (errorCode) {

		case ERROR_PRODUCT_NOT_COSTABLE:
			error = "Product not Costeable";
			break;

		case ERROR_EXIST_INVALID_COSTS:
			error = "Exist invalid costs for the product";
			break;

		case ERROR_NEED_RECALCULATION:
			error = "The costs for the product need to be recalculated";
			break;

		case ERROR_NO_COSTS_GENERATED:
			error = "Costs not generated for the product";
			break;

		case ERROR_NO_COSTELEMENT_DEFINED:
			error = "No Costs Element defined for the cost type in use";
			break;

		default:
			error = "Unknown Error";
		}

		if (toAppend != null) {
			error += toAppend;
		}
		return error;
	}

	/**************************************************************************
	 * Standard Constructor
	 * 
	 * @param ctx
	 *            context
	 * @param ignored
	 *            multi-key
	 * @param trxName
	 *            trx
	 */
	public MCostCalc(final Properties ctx, final int ignored,
			final String trxName) {
		super(ctx, ignored, trxName);
		if (ignored == 0) {
			setCost(Env.ZERO);
			setInCost(Env.ZERO);
			setIsCostedOk(false);
			setStock(Env.ZERO);
			setMovementDate(new java.sql.Timestamp(0));
			setOMovementDate(new java.sql.Timestamp(0));

			setIsActive(true);
			setIsCostedOk(false);
			setM_Warehouse_ID(0);
		} else
			throw new IllegalArgumentException("Multi-Key");
	} // MCostCalc

	/**
	 * Load Constructor
	 * 
	 * @param ctx
	 *            context
	 * @param rs
	 *            result set
	 * @param trxName
	 *            trx
	 */
	public MCostCalc(final Properties ctx, final ResultSet rs,
			final String trxName) {
		super(ctx, rs, trxName);
	} // MCost

	/**
	 * String Representation
	 * 
	 * @return info
	 */
	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("MCostCalc[");
		sb.append("AD_Client_ID=").append(getAD_Client_ID());
		if (getAD_Org_ID() != 0)
			sb.append(",AD_Org_ID=").append(getAD_Org_ID());
		sb.append(",Product=").append(MProduct.get(Env.getCtx(), getM_Product_ID(), null).getName());
		sb.append(", Cost=").append(getCost());
		sb.append(", Stock=").append(getStock());
		sb.append(", MovementDate=").append(getMovementDate());
		sb.append(", OMovementDate=").append(getOMovementDate());

		return sb.toString();
	} // toString

	/**
	 * Before Save
	 * 
	 * @param newRecord
	 *            new
	 * @return true if can be saved
	 */
	@Override
	protected boolean beforeSave(final boolean newRecord) {
		return true;
	} // beforeSave

	/**
	 * Before Delete
	 * 
	 * @return true
	 */
	@Override
	protected boolean beforeDelete() {
		return true;
	} // beforeDelete

	public static MCostCalc get(int table_id, int record_id,int master_id, int parent_id, String trxName) {
		String where = "AD_Table_ID = ? AND Record_ID = ? AND Master_ID = ? AND Parent_ID = ?";
		MCostCalc  cc = null;
		cc = new org.compiere.model.Query(Env.getCtx(), MCostCalc.Table_Name, where, trxName )
		.setParameters(table_id, record_id, master_id, parent_id).first();
		if (cc == null)
			cc = new MCostCalc(Env.getCtx(), 0, trxName);
		return cc;
	}

} // MCostClac
