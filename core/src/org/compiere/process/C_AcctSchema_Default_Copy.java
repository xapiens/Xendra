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
 * Portions created by Carlos Ruiz are Copyright (C) 2005 QSS Ltda.
 * Contributor(s): Carlos Ruiz (globalqss)
 *****************************************************************************/
package org.compiere.process;

import java.sql.*;
import java.util.logging.*;

import org.compiere.model.persistence.X_C_AcctSchema_Default;
import org.compiere.model.persistence.X_C_BOE_Acct;
import org.compiere.model.persistence.X_C_BP_Employee_Acct;
import org.compiere.model.persistence.X_C_BP_Group;
import org.compiere.model.persistence.X_C_BP_Group_Acct;
import org.compiere.model.persistence.X_C_BPartner;
import org.compiere.model.persistence.X_C_BankAccount;
import org.compiere.model.persistence.X_C_BankAccount_Acct;
import org.compiere.model.persistence.X_C_CashBook;
import org.compiere.model.persistence.X_C_CashBook_Acct;
import org.compiere.model.persistence.X_C_Charge;
import org.compiere.model.persistence.X_C_Charge_Acct;
import org.compiere.model.persistence.X_C_Currency;
import org.compiere.model.persistence.X_C_Currency_Acct;
import org.compiere.model.persistence.X_C_Project;
import org.compiere.model.persistence.X_C_Project_Acct;
import org.compiere.model.persistence.X_C_Tax;
import org.compiere.model.persistence.X_C_Tax_Acct;
import org.compiere.model.persistence.X_C_Withholding;
import org.compiere.model.persistence.X_C_Withholding_Acct;
import org.compiere.model.persistence.X_M_Product;
import org.compiere.model.persistence.X_M_Product_Acct;
import org.compiere.model.persistence.X_M_Product_Category;
import org.compiere.model.persistence.X_M_Product_Category_Acct;
import org.compiere.model.persistence.X_M_Warehouse;
import org.compiere.model.persistence.X_M_Warehouse_Acct;
import org.compiere.util.*;
import org.xendra.Constants;
import org.xendra.util.SelectPO;
import org.xendra.util.UpdatePO;
/**
 * Title:	Copy Acct Info
 * Description:	
 *		Copy Accounting Schema information to elements 
 *		(Existing entities are overwritten) cascade all!
 *	
 *  @author Carlos Ruiz (globalqss)
 *  @version $Id: C_AcctSchema_Default_Copy.java 5583 2015-08-05 14:11:58Z xapiens $
 */
public class C_AcctSchema_Default_Copy extends SvrProcess
{

	/*
	 * NOTE: The original oracle procedure C_AcctSchema_Default_Copy had a
	 *       Client_ID parameter for Direct Call not implemented in this class
	 */

	/** The Business Partner Group		*/
	private int		AD_Client_ID = -1;
	/** The Record						*/
	private int		p_Record_ID = 0;

	/**
	 *  Prepare - e.g., get Parameters.
	 */
	protected void prepare()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;			
			else if (name.equals("AD_Client_ID"))
				AD_Client_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
		p_Record_ID = getRecord_ID();
	}	//	prepare

	/**
	 * 	Process
	 *	@return message
	 *	@throws Exception
	 */
	protected String doIt() throws Exception
	{
		String sql;
		String sqlupd;
		String sqlins;
		int cntu = 0;
		int cnti = 0;
		int totu = 0;
		int toti = 0;

		log.info("For all Accounting Schema");
		/**
		 *	For all Accounting Schema
		 */
		sql = "SELECT * FROM C_AcctSchema_Default WHERE AD_Client_ID = " + AD_Client_ID;
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql, get_TrxName());
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				UpdatePO o = new UpdatePO();
				o.setTablename(X_M_Product_Category_Acct.Table_Name);
				o.setField(X_M_Product_Category_Acct.COLUMNNAME_P_Revenue_Acct, rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_Revenue_Acct));
				o.setField(X_M_Product_Category_Acct.COLUMNNAME_P_Expense_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_Expense_Acct));
				o.setField(X_M_Product_Category_Acct.COLUMNNAME_P_Asset_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_Asset_Acct));
				o.setField(X_M_Product_Category_Acct.COLUMNNAME_P_COGS_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_COGS_Acct));				
				o.setField(X_M_Product_Category_Acct.COLUMNNAME_P_PurchasePriceVariance_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_PurchasePriceVariance_Acct));
				o.setField(X_M_Product_Category_Acct.COLUMNNAME_P_InvoicePriceVariance_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_InvoicePriceVariance_Acct));
				o.setField(X_M_Product_Category_Acct.COLUMNNAME_P_TradeDiscountRec_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_TradeDiscountRec_Acct));
				o.setField(X_M_Product_Category_Acct.COLUMNNAME_P_TradeDiscountGrant_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_TradeDiscountGrant_Acct));
				o.setField(X_M_Product_Category_Acct.COLUMNNAME_P_InventoryClearing_Acct, rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_InventoryClearing_Acct));
				o.setField(X_M_Product_Category_Acct.COLUMNNAME_P_CostAdjustment_Acct, rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_CostAdjustment_Acct));
				o.setFieldExpr(Constants.COLUMNNAME_Updated, "CURRENT_TIMESTAMP");
				o.setField(Constants.COLUMNNAME_UpdatedBy, 0);
				String where = String.format("M_Product_Category_Acct.C_AcctSchema_ID=%s AND EXISTS (SELECT * FROM M_Product_Category p WHERE p.M_Product_Category_ID=M_Product_Category_Acct.M_Product_Category_ID)", rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID)); 
				cntu = o.update(where, get_TrxName());
				totu += cntu;
				// Insert new Product Category
				SelectPO s = new SelectPO();
				s.setTablename(X_M_Product_Category.Table_Name);
				s.setAlias("p");
				s.setField(X_M_Product_Category.COLUMNNAME_M_Product_Category_ID);
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID));
				s.setField(Constants.COLUMNNAME_AD_Client_ID);
				s.setField(Constants.COLUMNNAME_AD_Org_ID);
				s.setFieldExpr(Constants.YES);
				s.setField("CURRENT_TIMESTAMP");
				s.setField("0");
				s.setField("CURRENT_TIMESTAMP");
				s.setField("0");
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_Revenue_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_Expense_Acct)); 
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_Asset_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_COGS_Acct)); 
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_PurchasePriceVariance_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_InvoicePriceVariance_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_TradeDiscountRec_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_TradeDiscountGrant_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_InventoryClearing_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_CostAdjustment_Acct));

				where = String.format("AD_Client_ID=%s  AND NOT EXISTS (SELECT * FROM M_Product_Category_Acct pa WHERE pa.M_Product_Category_ID=p.M_Product_Category_ID AND pa.C_AcctSchema_ID=%s)", rs.getInt(Constants.COLUMNNAME_AD_Client_ID), rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID)); 
				s.setWhere(where);				
				o = new UpdatePO();
				o.setTablename(X_M_Product_Category_Acct.Table_Name);
				o.setFieldInsert(X_M_Product_Category_Acct.COLUMNNAME_M_Product_Category_ID);
				o.setFieldInsert(X_M_Product_Category_Acct.COLUMNNAME_C_AcctSchema_ID);
				o.setFieldInsert(Constants.COLUMNNAME_AD_Client_ID); 
				o.setFieldInsert(Constants.COLUMNNAME_AD_Org_ID); 
				o.setFieldInsert(Constants.COLUMNNAME_IsActive); 
				o.setFieldInsert(Constants.COLUMNNAME_Created); 
				o.setFieldInsert(Constants.COLUMNNAME_CreatedBy); 
				o.setFieldInsert(Constants.COLUMNNAME_Updated); 
				o.setFieldInsert(Constants.COLUMNNAME_UpdatedBy);
				o.setFieldInsert(X_M_Product_Category_Acct.COLUMNNAME_P_Revenue_Acct); 
				o.setFieldInsert(X_M_Product_Category_Acct.COLUMNNAME_P_Expense_Acct); 
				o.setFieldInsert(X_M_Product_Category_Acct.COLUMNNAME_P_Asset_Acct); 
				o.setFieldInsert(X_M_Product_Category_Acct.COLUMNNAME_P_COGS_Acct); 
				o.setFieldInsert(X_M_Product_Category_Acct.COLUMNNAME_P_PurchasePriceVariance_Acct); 
				o.setFieldInsert(X_M_Product_Category_Acct.COLUMNNAME_P_InvoicePriceVariance_Acct);
				o.setFieldInsert(X_M_Product_Category_Acct.COLUMNNAME_P_TradeDiscountRec_Acct); 
				o.setFieldInsert(X_M_Product_Category_Acct.COLUMNNAME_P_TradeDiscountGrant_Acct);
				o.setFieldInsert(X_M_Product_Category_Acct.COLUMNNAME_P_InventoryClearing_Acct);
				o.setFieldInsert(X_M_Product_Category_Acct.COLUMNNAME_P_CostAdjustment_Acct);

				cnti = o.insertfromSelect(s, get_TrxName());								
				toti += cnti;
				log.info("Product Category = " + cntu + " / " + cnti);
				// Product
				o = new UpdatePO();
				o.setTablename(X_M_Product_Acct.Table_Name);
				o.setField(X_M_Product_Acct.COLUMNNAME_P_Revenue_Acct, rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_Revenue_Acct));
				o.setField(X_M_Product_Acct.COLUMNNAME_P_Expense_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_Expense_Acct));
				o.setField(X_M_Product_Acct.COLUMNNAME_P_Asset_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_Asset_Acct));
				o.setField(X_M_Product_Acct.COLUMNNAME_P_COGS_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_COGS_Acct));				
				o.setField(X_M_Product_Acct.COLUMNNAME_P_PurchasePriceVariance_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_PurchasePriceVariance_Acct));
				o.setField(X_M_Product_Acct.COLUMNNAME_P_InvoicePriceVariance_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_InvoicePriceVariance_Acct));
				o.setField(X_M_Product_Acct.COLUMNNAME_P_TradeDiscountRec_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_TradeDiscountRec_Acct));
				o.setField(X_M_Product_Acct.COLUMNNAME_P_TradeDiscountGrant_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_TradeDiscountGrant_Acct));
				o.setField(X_M_Product_Acct.COLUMNNAME_P_InventoryClearing_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_InventoryClearing_Acct));
				o.setField(X_M_Product_Acct.COLUMNNAME_P_CostAdjustment_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_CostAdjustment_Acct));
				o.setFieldExpr(Constants.COLUMNNAME_Updated, "CURRENT_TIMESTAMP");
				o.setField(Constants.COLUMNNAME_UpdatedBy, 0);
				where = String.format("M_Product_Acct.C_AcctSchema_ID=%s AND EXISTS (SELECT * FROM M_Product p WHERE p.M_Product_ID=M_Product_Acct.M_Product_ID)", rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID)); 
				cntu = o.update(where, get_TrxName());
				totu += cntu;
				s = new SelectPO();
				s.setTablename(X_M_Product.Table_Name);
				s.setAlias("p");
				s.setField(X_M_Product.COLUMNNAME_M_Product_ID);
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID));
				s.setField(Constants.COLUMNNAME_AD_Client_ID);
				s.setField(Constants.COLUMNNAME_AD_Org_ID);
				s.setFieldExpr(Constants.YES);
				s.setField("CURRENT_TIMESTAMP");
				s.setField("0");
				s.setField("CURRENT_TIMESTAMP");
				s.setField("0");
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_Revenue_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_Expense_Acct)); 
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_Asset_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_COGS_Acct)); 
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_PurchasePriceVariance_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_InvoicePriceVariance_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_TradeDiscountRec_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_TradeDiscountGrant_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_InventoryClearing_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_P_CostAdjustment_Acct));
				
				where = String.format("AD_Client_ID=%s  AND NOT EXISTS (SELECT * FROM M_Product_Acct pa WHERE pa.M_Product_ID=p.M_Product_ID AND pa.C_AcctSchema_ID=%s)", rs.getInt(Constants.COLUMNNAME_AD_Client_ID), rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID)); 
				s.setWhere(where);				
				o = new UpdatePO();
				o.setTablename(X_M_Product_Acct.Table_Name);
				o.setFieldInsert(X_M_Product_Acct.COLUMNNAME_M_Product_ID);
				o.setFieldInsert(X_M_Product_Acct.COLUMNNAME_C_AcctSchema_ID);
				o.setFieldInsert(Constants.COLUMNNAME_AD_Client_ID); 
				o.setFieldInsert(Constants.COLUMNNAME_AD_Org_ID); 
				o.setFieldInsert(Constants.COLUMNNAME_IsActive); 
				o.setFieldInsert(Constants.COLUMNNAME_Created); 
				o.setFieldInsert(Constants.COLUMNNAME_CreatedBy); 
				o.setFieldInsert(Constants.COLUMNNAME_Updated); 
				o.setFieldInsert(Constants.COLUMNNAME_UpdatedBy);
				o.setFieldInsert(X_M_Product_Acct.COLUMNNAME_P_Revenue_Acct); 
				o.setFieldInsert(X_M_Product_Acct.COLUMNNAME_P_Expense_Acct); 
				o.setFieldInsert(X_M_Product_Acct.COLUMNNAME_P_Asset_Acct); 
				o.setFieldInsert(X_M_Product_Acct.COLUMNNAME_P_COGS_Acct); 
				o.setFieldInsert(X_M_Product_Acct.COLUMNNAME_P_PurchasePriceVariance_Acct); 
				o.setFieldInsert(X_M_Product_Acct.COLUMNNAME_P_InvoicePriceVariance_Acct);
				o.setFieldInsert(X_M_Product_Acct.COLUMNNAME_P_TradeDiscountRec_Acct); 
				o.setFieldInsert(X_M_Product_Acct.COLUMNNAME_P_TradeDiscountGrant_Acct);
				o.setFieldInsert(X_M_Product_Acct.COLUMNNAME_P_InventoryClearing_Acct);
				o.setFieldInsert(X_M_Product_Acct.COLUMNNAME_P_CostAdjustment_Acct);				
				cnti = o.insertfromSelect(s, get_TrxName());								
				toti += cnti;
				log.info("Product Category = " + cntu + " / " + cnti);
				
				// Business Partner Group
				o = new UpdatePO();
				o.setTablename(X_C_BP_Group_Acct.Table_Name);
				o.setField(X_C_BP_Group_Acct.COLUMNNAME_C_Receivable_Acct, rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_Receivable_Acct));				
				o.setField(X_C_BP_Group_Acct.COLUMNNAME_C_Prepayment_Acct, rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_Prepayment_Acct)); 
				o.setField(X_C_BP_Group_Acct.COLUMNNAME_V_Liability_Acct, rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_V_Liability_Acct)); 
				o.setField(X_C_BP_Group_Acct.COLUMNNAME_V_Liability_Services_Acct, rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_V_Liability_Services_Acct)); 
				o.setField(X_C_BP_Group_Acct.COLUMNNAME_V_Prepayment_Acct, rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_V_Prepayment_Acct));
				o.setField(X_C_BP_Group_Acct.COLUMNNAME_PayDiscount_Exp_Acct, rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_PayDiscount_Exp_Acct)); 
				o.setField(X_C_BP_Group_Acct.COLUMNNAME_PayDiscount_Rev_Acct, rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_PayDiscount_Rev_Acct)); 
				o.setField(X_C_BP_Group_Acct.COLUMNNAME_WriteOffGain_Acct, rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_WriteOffGain_Acct));
				o.setField(X_C_BP_Group_Acct.COLUMNNAME_WriteOffLoss_Acct, rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_WriteOffLoss_Acct));
				o.setField(X_C_BP_Group_Acct.COLUMNNAME_NotInvoicedReceipts_Acct, rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_NotInvoicedReceipts_Acct)); 
				o.setField(X_C_BP_Group_Acct.COLUMNNAME_UnEarnedRevenue_Acct, rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_UnEarnedRevenue_Acct)); 
				o.setField(X_C_BP_Group_Acct.COLUMNNAME_NotInvoicedRevenue_Acct, rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_NotInvoicedRevenue_Acct)); 
				o.setField(X_C_BP_Group_Acct.COLUMNNAME_NotInvoicedReceivables_Acct, rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_NotInvoicedReceivables_Acct));
				where = String.format("C_BP_Group_Acct.C_AcctSchema_ID=%s AND EXISTS (SELECT * FROM C_BP_Group_Acct x WHERE x.C_BP_Group_ID=C_BP_Group_Acct.C_BP_Group_ID)", rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID));
				cntu = o.update(where, get_TrxName());
				totu += cntu;
				// Insert new

				s = new SelectPO();
				s.setAlias("x");
				s.setTablename(X_C_BP_Group.Table_Name);
				s.setField(X_C_BP_Group.COLUMNNAME_C_BP_Group_ID);
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID));
				s.setField(Constants.COLUMNNAME_AD_Client_ID);
				s.setField(Constants.COLUMNNAME_AD_Org_ID);
				s.setFieldExpr(Constants.YES);
				s.setField("CURRENT_TIMESTAMP");
				s.setField("0");
				s.setField("CURRENT_TIMESTAMP");
				s.setField("0");
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_Receivable_Acct)); 
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_Prepayment_Acct)); 
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_V_Liability_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_V_Liability_Services_Acct)); 
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_V_Prepayment_Acct)); 
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_PayDiscount_Exp_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_PayDiscount_Rev_Acct)); 
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_WriteOffGain_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_WriteOffLoss_Acct)); 
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_NotInvoicedReceipts_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_UnEarnedRevenue_Acct)); 
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_NotInvoicedRevenue_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_NotInvoicedReceivables_Acct));
				where = String.format("AD_Client_ID=%s AND NOT EXISTS (SELECT * FROM C_BP_Group_Acct a WHERE a.C_BP_Group_ID=x.C_BP_Group_ID AND a.C_AcctSchema_ID=%s)",rs.getInt(Constants.COLUMNNAME_AD_Client_ID),rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID));
				s.setWhere(where);
				o = new UpdatePO();
				o.setTablename(X_C_BP_Group_Acct.Table_Name);
				o.setFieldInsert(X_C_BP_Group_Acct.COLUMNNAME_C_BP_Group_ID);
				o.setFieldInsert(X_C_BP_Group_Acct.COLUMNNAME_C_AcctSchema_ID);
				o.setFieldInsert(Constants.COLUMNNAME_AD_Client_ID); 
				o.setFieldInsert(Constants.COLUMNNAME_AD_Org_ID); 
				o.setFieldInsert(Constants.COLUMNNAME_IsActive); 
				o.setFieldInsert(Constants.COLUMNNAME_Created); 
				o.setFieldInsert(Constants.COLUMNNAME_CreatedBy); 
				o.setFieldInsert(Constants.COLUMNNAME_Updated); 
				o.setFieldInsert(Constants.COLUMNNAME_UpdatedBy);
				o.setFieldInsert(X_C_BP_Group_Acct.COLUMNNAME_C_Receivable_Acct);
				o.setFieldInsert(X_C_BP_Group_Acct.COLUMNNAME_C_Prepayment_Acct); 
				o.setFieldInsert(X_C_BP_Group_Acct.COLUMNNAME_V_Liability_Acct); 
				o.setFieldInsert(X_C_BP_Group_Acct.COLUMNNAME_V_Liability_Services_Acct); 
				o.setFieldInsert(X_C_BP_Group_Acct.COLUMNNAME_V_Prepayment_Acct);
				o.setFieldInsert(X_C_BP_Group_Acct.COLUMNNAME_PayDiscount_Exp_Acct); 
				o.setFieldInsert(X_C_BP_Group_Acct.COLUMNNAME_PayDiscount_Rev_Acct); 
				o.setFieldInsert(X_C_BP_Group_Acct.COLUMNNAME_WriteOffGain_Acct);
				o.setFieldInsert(X_C_BP_Group_Acct.COLUMNNAME_WriteOffLoss_Acct);
				o.setFieldInsert(X_C_BP_Group_Acct.COLUMNNAME_NotInvoicedReceipts_Acct); 
				o.setFieldInsert(X_C_BP_Group_Acct.COLUMNNAME_UnEarnedRevenue_Acct); 
				o.setFieldInsert(X_C_BP_Group_Acct.COLUMNNAME_NotInvoicedRevenue_Acct);
				o.setFieldInsert(X_C_BP_Group_Acct.COLUMNNAME_NotInvoicedReceivables_Acct);
				cnti = o.insertfromSelect(s, get_TrxName());						   
				toti += cnti;
				log.info("Business Group = " + cntu + " / " + cnti);

				// Business Partner Employee
				o = new UpdatePO();
				o.setTablename(X_C_BP_Employee_Acct.Table_Name);
				o.setField(X_C_BP_Employee_Acct.COLUMNNAME_E_Expense_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_E_Expense_Acct));
				o.setField(X_C_BP_Employee_Acct.COLUMNNAME_E_Prepayment_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_E_Prepayment_Acct));
				o.setFieldExpr(Constants.COLUMNNAME_Updated, "CURRENT_TIMESTAMP");
				o.setField(Constants.COLUMNNAME_UpdatedBy, 0);
				where = String.format("C_BP_Employee_Acct.C_AcctSchema_ID=%s AND EXISTS (SELECT * FROM C_BP_Employee_Acct x WHERE x.C_BPartner_ID=C_BP_Employee_Acct.C_BPartner_ID)",rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID));						
				cntu = o.update(where, get_TrxName());
				totu += cntu;

				// Insert new
				s = new SelectPO();
				s.setTablename(X_C_BPartner.Table_Name);
				s.setAlias("x");
				s.setField(X_C_BPartner.COLUMNNAME_C_BPartner_ID);
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID));
				s.setField(Constants.COLUMNNAME_AD_Client_ID);
				s.setField(Constants.COLUMNNAME_AD_Org_ID);
				s.setFieldExpr(Constants.YES);
				s.setField("CURRENT_TIMESTAMP");
				s.setField("0");
				s.setField("CURRENT_TIMESTAMP");
				s.setField("0");
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_E_Expense_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_E_Prepayment_Acct));
				where = String.format("AD_Client_ID=%s AND NOT EXISTS (SELECT * FROM C_BP_Employee_Acct a WHERE a.C_BPartner_ID=x.C_BPartner_ID AND a.C_AcctSchema_ID=%s)",rs.getInt(Constants.COLUMNNAME_AD_Client_ID),rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID));
				s.setWhere(where);
				o = new UpdatePO();
				o.setTablename(X_C_BP_Employee_Acct.Table_Name);
				o.setFieldInsert(X_C_BP_Employee_Acct.COLUMNNAME_C_BPartner_ID);
				o.setFieldInsert(X_C_BP_Employee_Acct.COLUMNNAME_C_AcctSchema_ID);
				o.setFieldInsert(Constants.COLUMNNAME_AD_Client_ID); 
				o.setFieldInsert(Constants.COLUMNNAME_AD_Org_ID); 
				o.setFieldInsert(Constants.COLUMNNAME_IsActive); 
				o.setFieldInsert(Constants.COLUMNNAME_Created); 
				o.setFieldInsert(Constants.COLUMNNAME_CreatedBy); 
				o.setFieldInsert(Constants.COLUMNNAME_Updated); 
				o.setFieldInsert(Constants.COLUMNNAME_UpdatedBy);
				o.setFieldInsert(X_C_BP_Employee_Acct.COLUMNNAME_E_Expense_Acct);
				o.setFieldInsert(X_C_BP_Employee_Acct.COLUMNNAME_E_Prepayment_Acct);
				cnti = o.insertfromSelect(s, get_TrxName());
				toti += cnti;
				log.info("Employees = " + cntu + " / " + cnti);

				// Warehouse
				o = new UpdatePO();
				o.setTablename(X_M_Warehouse_Acct.Table_Name);
				o.setField(X_M_Warehouse_Acct.COLUMNNAME_W_Inventory_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_W_Inventory_Acct));
				o.setField(X_M_Warehouse_Acct.COLUMNNAME_W_Differences_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_W_Differences_Acct));
				o.setField(X_M_Warehouse_Acct.COLUMNNAME_W_Revaluation_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_W_Revaluation_Acct));
				o.setField(X_M_Warehouse_Acct.COLUMNNAME_W_InvActualAdjust_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_W_InvActualAdjust_Acct));
				where = String.format("M_Warehouse_Acct.C_AcctSchema_ID=%s AND EXISTS (SELECT * FROM M_Warehouse_Acct x WHERE x.M_Warehouse_ID=M_Warehouse_Acct.M_Warehouse_ID)",rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID));
				cntu = o.update(where, get_TrxName());
				totu += cntu;

				// Insert new
				s = new SelectPO();
				s.setTablename(X_M_Warehouse.Table_Name);
				s.setAlias("x");
				s.setField(X_M_Warehouse.COLUMNNAME_M_Warehouse_ID);
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID));
				s.setField(Constants.COLUMNNAME_AD_Client_ID);
				s.setField(Constants.COLUMNNAME_AD_Org_ID);
				s.setFieldExpr(Constants.YES);
				s.setField("CURRENT_TIMESTAMP");
				s.setField("0");
				s.setField("CURRENT_TIMESTAMP");
				s.setField("0");
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_W_Inventory_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_W_Differences_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_W_Revaluation_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_W_InvActualAdjust_Acct));
				where = String.format("AD_Client_ID=%s AND NOT EXISTS (SELECT * FROM M_Warehouse_Acct a WHERE a.M_Warehouse_ID=x.M_Warehouse_ID AND a.C_AcctSchema_ID=%s)", rs.getInt("AD_Client_ID"),rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID));
				s.setWhere(where);				
				o = new UpdatePO();
				o.setTablename(X_M_Warehouse_Acct.Table_Name);
				o.setFieldInsert(X_M_Warehouse_Acct.COLUMNNAME_M_Warehouse_ID);
				o.setFieldInsert(X_M_Warehouse_Acct.COLUMNNAME_C_AcctSchema_ID);
				o.setFieldInsert(Constants.COLUMNNAME_AD_Client_ID); 
				o.setFieldInsert(Constants.COLUMNNAME_AD_Org_ID); 
				o.setFieldInsert(Constants.COLUMNNAME_IsActive); 
				o.setFieldInsert(Constants.COLUMNNAME_Created); 
				o.setFieldInsert(Constants.COLUMNNAME_CreatedBy); 
				o.setFieldInsert(Constants.COLUMNNAME_Updated); 
				o.setFieldInsert(Constants.COLUMNNAME_UpdatedBy);
				o.setFieldInsert(X_M_Warehouse_Acct.COLUMNNAME_W_Inventory_Acct);
				o.setFieldInsert(X_M_Warehouse_Acct.COLUMNNAME_W_Differences_Acct);
				o.setFieldInsert(X_M_Warehouse_Acct.COLUMNNAME_W_Revaluation_Acct);
				o.setFieldInsert(X_M_Warehouse_Acct.COLUMNNAME_W_InvActualAdjust_Acct);				
				cnti = o.insertfromSelect(s, get_TrxName());
				toti += cnti;
				log.info("Warehouse = " + cntu + " / " + cnti);

				// Currency
				o = new UpdatePO();
				o.setTablename(X_C_Currency_Acct.Table_Name);
				o.setField(X_C_Currency_Acct.COLUMNNAME_UnrealizedGain_Acct, rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_UnrealizedGain_Acct));
				o.setField(X_C_Currency_Acct.COLUMNNAME_UnrealizedLoss_Acct, rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_UnrealizedLoss_Acct));
				o.setField(X_C_Currency_Acct.COLUMNNAME_RealizedGain_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_RealizedGain_Acct));
				o.setField(X_C_Currency_Acct.COLUMNNAME_RealizedLoss_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_RealizedLoss_Acct));
				o.setFieldExpr(Constants.COLUMNNAME_Updated, "CURRENT_TIMESTAMP");
				o.setField(Constants.COLUMNNAME_UpdatedBy, 0);
				where = String.format("C_Currency_ID = (select c_currency_id from c_acctschema where c_acctschema_id = %s) AND EXISTS (SELECT * FROM C_Currency_Acct x WHERE x.C_Currency_ID=C_Currency_Acct.C_Currency_ID)",rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID));
				cntu = o.update(where, get_TrxName());
				totu += cntu;

				// Insert new
				s = new SelectPO();
				s.setTablename(X_C_Currency.Table_Name);
				s.setAlias("x");
				s.setField(X_C_Currency.COLUMNNAME_C_Currency_ID);
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID));
				s.setField(Constants.COLUMNNAME_AD_Client_ID);
				s.setField(Constants.COLUMNNAME_AD_Org_ID);
				s.setFieldExpr(Constants.YES);
				s.setField("CURRENT_TIMESTAMP");
				s.setField("0");
				s.setField("CURRENT_TIMESTAMP");
				s.setField("0");
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_UnrealizedGain_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_UnrealizedLoss_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_RealizedGain_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_RealizedLoss_Acct));
				where = String.format("C_Currency_ID = (select c_currency_id from c_acctschema where c_acctschema_id = %s) AND NOT EXISTS (SELECT * FROM C_Currency_Acct a WHERE a.C_Currency_ID=x.C_Currency_ID AND a.C_AcctSchema_ID=%s)", rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID), rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID));
				s.setWhere(where);
				o = new UpdatePO();
				o.setTablename(X_C_Currency_Acct.Table_Name);
				o.setFieldInsert(X_C_Currency_Acct.COLUMNNAME_C_Currency_ID);
				o.setFieldInsert(X_C_Currency_Acct.COLUMNNAME_C_AcctSchema_ID);
				o.setFieldInsert(Constants.COLUMNNAME_AD_Client_ID); 
				o.setFieldInsert(Constants.COLUMNNAME_AD_Org_ID); 
				o.setFieldInsert(Constants.COLUMNNAME_IsActive); 
				o.setFieldInsert(Constants.COLUMNNAME_Created); 
				o.setFieldInsert(Constants.COLUMNNAME_CreatedBy); 
				o.setFieldInsert(Constants.COLUMNNAME_Updated); 
				o.setFieldInsert(Constants.COLUMNNAME_UpdatedBy);
				o.setFieldInsert(X_C_Currency_Acct.COLUMNNAME_UnrealizedGain_Acct);
				o.setFieldInsert(X_C_Currency_Acct.COLUMNNAME_UnrealizedLoss_Acct);
				o.setFieldInsert(X_C_Currency_Acct.COLUMNNAME_RealizedGain_Acct);
				o.setFieldInsert(X_C_Currency_Acct.COLUMNNAME_RealizedLoss_Acct);
				cnti = o.insertfromSelect(s, get_TrxName());				
				toti += cnti;
				log.info("Currency = " + cntu + " / " + cnti);
				
				// Project
				o = new UpdatePO();
				o.setTablename(X_C_Project_Acct.Table_Name);
				o.setField(X_C_Project_Acct.COLUMNNAME_PJ_Asset_Acct, rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_PJ_Asset_Acct));
				o.setField(X_C_Project_Acct.COLUMNNAME_PJ_WIP_Acct,  rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_PJ_Asset_Acct));
				o.setFieldExpr(Constants.COLUMNNAME_Updated, "CURRENT_TIMESTAMP");
				o.setField(Constants.COLUMNNAME_UpdatedBy, 0);
				where = String.format("C_Project_Acct.C_AcctSchema_ID=%s AND EXISTS (SELECT * FROM C_Project_Acct x WHERE x.C_Project_ID=C_Project_Acct.C_Project_ID)",rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID));
				cntu = o.update(where, get_TrxName());
				totu += cntu;
								
				// Insert new
				s = new SelectPO();
				s.setTablename(X_C_Project.Table_Name);
				s.setAlias("x");
				s.setField(X_C_Project.COLUMNNAME_C_Project_ID);
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID));
				s.setField(Constants.COLUMNNAME_AD_Client_ID);
				s.setField(Constants.COLUMNNAME_AD_Org_ID);
				s.setFieldExpr(Constants.YES);
				s.setField("CURRENT_TIMESTAMP");
				s.setField("0");
				s.setField("CURRENT_TIMESTAMP");
				s.setField("0");
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_PJ_Asset_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_PJ_WIP_Acct));
				where = String.format("AD_Client_ID=%s AND NOT EXISTS (SELECT * FROM C_Project_Acct a WHERE a.C_Project_ID=x.C_Project_ID AND a.C_AcctSchema_ID=%s)",rs.getInt(Constants.COLUMNNAME_AD_Client_ID),rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID));
				s.setWhere(where);
				o = new UpdatePO();
				o.setTablename(X_C_Project_Acct.Table_Name);
				o.setFieldInsert(X_C_Project_Acct.COLUMNNAME_C_Project_ID);
				o.setFieldInsert(X_C_Project_Acct.COLUMNNAME_C_AcctSchema_ID);
				o.setFieldInsert(Constants.COLUMNNAME_AD_Client_ID); 
				o.setFieldInsert(Constants.COLUMNNAME_AD_Org_ID); 
				o.setFieldInsert(Constants.COLUMNNAME_IsActive); 
				o.setFieldInsert(Constants.COLUMNNAME_Created); 
				o.setFieldInsert(Constants.COLUMNNAME_CreatedBy); 
				o.setFieldInsert(Constants.COLUMNNAME_Updated); 
				o.setFieldInsert(Constants.COLUMNNAME_UpdatedBy);
				o.setFieldInsert(X_C_Project_Acct.COLUMNNAME_PJ_Asset_Acct);
				o.setFieldInsert(X_C_Project_Acct.COLUMNNAME_PJ_WIP_Acct);
				cnti = o.insertfromSelect(s, get_TrxName());				
				toti += cnti;
				log.info("Project = " + cntu + " / " + cnti);

				// Tax
				o = new UpdatePO();
				o.setTablename(X_C_Tax_Acct.Table_Name);
				o.setField(X_C_Tax_Acct.COLUMNNAME_T_Due_Acct, rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_T_Due_Acct));
				o.setField(X_C_Tax_Acct.COLUMNNAME_T_Liability_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_T_Liability_Acct)); 
				o.setField(X_C_Tax_Acct.COLUMNNAME_T_Credit_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_T_Credit_Acct));
				o.setField(X_C_Tax_Acct.COLUMNNAME_T_Receivables_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_T_Receivables_Acct));
				o.setField(X_C_Tax_Acct.COLUMNNAME_T_Expense_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_T_Expense_Acct));
				o.setFieldExpr(Constants.COLUMNNAME_Updated, "CURRENT_TIMESTAMP");
				o.setField(Constants.COLUMNNAME_UpdatedBy, 0);
				where = String.format("C_Tax_Acct.C_AcctSchema_ID=%s AND EXISTS (SELECT * FROM C_Tax_Acct x WHERE x.C_Tax_ID=C_Tax_Acct.C_Tax_ID)", rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID));
				cntu = o.update(where, get_TrxName());
				totu += cntu;

				// Insert new
				s = new SelectPO();
				s.setTablename(X_C_Tax.Table_Name);
				s.setAlias("x");
				s.setField(X_C_Tax.COLUMNNAME_C_Tax_ID);
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID));
				s.setField(Constants.COLUMNNAME_AD_Client_ID);
				s.setField(Constants.COLUMNNAME_AD_Org_ID);
				s.setFieldExpr(Constants.YES);
				s.setField("CURRENT_TIMESTAMP");
				s.setField("0");
				s.setField("CURRENT_TIMESTAMP");
				s.setField("0");
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_T_Due_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_T_Liability_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_T_Credit_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_T_Receivables_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_T_Expense_Acct));
				where = String.format("AD_Client_ID=%s AND NOT EXISTS (SELECT * FROM C_Tax_Acct a WHERE a.C_Tax_ID=x.C_Tax_ID AND a.C_AcctSchema_ID=%s)",rs.getInt(Constants.COLUMNNAME_AD_Client_ID), rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID));
				s.setWhere(where);
				o = new UpdatePO();
				o.setTablename(X_C_Tax_Acct.Table_Name);
				o.setFieldInsert(X_C_Tax_Acct.COLUMNNAME_C_Tax_ID);
				o.setFieldInsert(X_C_Tax_Acct.COLUMNNAME_C_AcctSchema_ID);
				o.setFieldInsert(Constants.COLUMNNAME_AD_Client_ID); 
				o.setFieldInsert(Constants.COLUMNNAME_AD_Org_ID); 
				o.setFieldInsert(Constants.COLUMNNAME_IsActive); 
				o.setFieldInsert(Constants.COLUMNNAME_Created); 
				o.setFieldInsert(Constants.COLUMNNAME_CreatedBy); 
				o.setFieldInsert(Constants.COLUMNNAME_Updated); 
				o.setFieldInsert(Constants.COLUMNNAME_UpdatedBy);
				o.setFieldInsert(X_C_Tax_Acct.COLUMNNAME_T_Due_Acct);
				o.setFieldInsert(X_C_Tax_Acct.COLUMNNAME_T_Liability_Acct);
				o.setFieldInsert(X_C_Tax_Acct.COLUMNNAME_T_Credit_Acct);
				o.setFieldInsert(X_C_Tax_Acct.COLUMNNAME_T_Receivables_Acct);
				o.setFieldInsert(X_C_Tax_Acct.COLUMNNAME_T_Expense_Acct); 
				cnti = o.insertfromSelect(s, get_TrxName());			
				toti += cnti;
				log.info("Tax = " + cntu + " / " + cnti);

				// BankAccount
				o = new UpdatePO();
				o.setTablename(X_C_BankAccount_Acct.Table_Name);
				o.setField(X_C_BankAccount_Acct.COLUMNNAME_B_InTransit_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_B_InTransit_Acct)); 
				o.setField(X_C_BankAccount_Acct.COLUMNNAME_B_Asset_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_B_Asset_Acct)); 
				o.setField(X_C_BankAccount_Acct.COLUMNNAME_B_Expense_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_B_Expense_Acct)); 
				o.setField(X_C_BankAccount_Acct.COLUMNNAME_B_InterestRev_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_B_InterestRev_Acct)); 
				o.setField(X_C_BankAccount_Acct.COLUMNNAME_B_InterestExp_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_B_InterestExp_Acct));
				o.setField(X_C_BankAccount_Acct.COLUMNNAME_B_Unidentified_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_B_Unidentified_Acct));
				o.setField(X_C_BankAccount_Acct.COLUMNNAME_B_UnallocatedCash_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_B_UnallocatedCash_Acct)); 
				o.setField(X_C_BankAccount_Acct.COLUMNNAME_B_PaymentSelect_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_B_PaymentSelect_Acct)); 
				o.setField(X_C_BankAccount_Acct.COLUMNNAME_B_SettlementGain_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_B_SettlementGain_Acct));
				o.setField(X_C_BankAccount_Acct.COLUMNNAME_B_SettlementLoss_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_B_SettlementLoss_Acct));
				o.setField(X_C_BankAccount_Acct.COLUMNNAME_B_RevaluationGain_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_B_RevaluationGain_Acct));
				o.setField(X_C_BankAccount_Acct.COLUMNNAME_B_RevaluationLoss_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_B_RevaluationLoss_Acct));
				o.setField(X_C_BankAccount_Acct.COLUMNNAME_BOE_Confirm_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_BOE_Confirm_Acct));
				o.setField(X_C_BankAccount_Acct.COLUMNNAME_BOE_Warranty_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_BOE_Warranty_Acct));
				o.setField(X_C_BankAccount_Acct.COLUMNNAME_BOE_Receivables_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_BOE_Receivables_Acct));
				o.setField(X_C_BankAccount_Acct.COLUMNNAME_BOE_Discount_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_BOE_Discount_Acct));
				o.setField(X_C_BankAccount_Acct.COLUMNNAME_BOE_Protested_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_BOE_Protested_Acct));
				where = String.format("C_BankAccount_Acct.C_AcctSchema_ID=%s AND EXISTS (SELECT * FROM C_BankAccount_Acct x WHERE x.C_BankAccount_ID=C_BankAccount_Acct.C_BankAccount_ID)", rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID));
				cntu = o.update(where, get_TrxName());
				totu += cntu;
				// Insert new
				s = new SelectPO();
				s.setTablename(X_C_BankAccount.Table_Name);
				s.setAlias("x");
				s.setField(X_C_BankAccount.COLUMNNAME_C_BankAccount_ID);
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID));
				s.setField(Constants.COLUMNNAME_AD_Client_ID);
				s.setField(Constants.COLUMNNAME_AD_Org_ID);
				s.setFieldExpr(Constants.YES);
				s.setField("CURRENT_TIMESTAMP");
				s.setField("0");
				s.setField("CURRENT_TIMESTAMP");
				s.setField("0");
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_B_InTransit_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_B_Asset_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_B_Expense_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_B_InterestRev_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_B_InterestExp_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_B_Unidentified_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_B_UnallocatedCash_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_B_PaymentSelect_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_B_SettlementGain_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_B_SettlementLoss_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_B_RevaluationGain_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_B_RevaluationLoss_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_BOE_Confirm_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_BOE_Warranty_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_BOE_Receivables_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_BOE_Discount_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_BOE_Protested_Acct));
				where = String.format("AD_Client_ID=%s AND NOT EXISTS (SELECT * FROM C_BankAccount_Acct a WHERE a.C_BankAccount_ID=x.C_BankAccount_ID AND a.C_AcctSchema_ID=%s)",rs.getInt(Constants.COLUMNNAME_AD_Client_ID),rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID));
				s.setWhere(where);
				o = new UpdatePO();
				o.setTablename(X_C_BankAccount_Acct.Table_Name);
				o.setFieldInsert(X_C_BankAccount_Acct.COLUMNNAME_C_BankAccount_ID);
				o.setFieldInsert(X_C_BankAccount_Acct.COLUMNNAME_C_AcctSchema_ID);
				o.setFieldInsert(Constants.COLUMNNAME_AD_Client_ID); 
				o.setFieldInsert(Constants.COLUMNNAME_AD_Org_ID); 
				o.setFieldInsert(Constants.COLUMNNAME_IsActive); 
				o.setFieldInsert(Constants.COLUMNNAME_Created); 
				o.setFieldInsert(Constants.COLUMNNAME_CreatedBy); 
				o.setFieldInsert(Constants.COLUMNNAME_Updated); 
				o.setFieldInsert(Constants.COLUMNNAME_UpdatedBy);
				o.setFieldInsert(X_C_BankAccount_Acct.COLUMNNAME_B_InTransit_Acct);
				o.setFieldInsert(X_C_BankAccount_Acct.COLUMNNAME_B_Asset_Acct);
				o.setFieldInsert(X_C_BankAccount_Acct.COLUMNNAME_B_Expense_Acct);
				o.setFieldInsert(X_C_BankAccount_Acct.COLUMNNAME_B_InterestRev_Acct);
				o.setFieldInsert(X_C_BankAccount_Acct.COLUMNNAME_B_InterestExp_Acct);
				o.setFieldInsert(X_C_BankAccount_Acct.COLUMNNAME_B_Unidentified_Acct);				
				o.setFieldInsert(X_C_BankAccount_Acct.COLUMNNAME_B_UnallocatedCash_Acct);
				o.setFieldInsert(X_C_BankAccount_Acct.COLUMNNAME_B_PaymentSelect_Acct);
				o.setFieldInsert(X_C_BankAccount_Acct.COLUMNNAME_B_SettlementGain_Acct);
				o.setFieldInsert(X_C_BankAccount_Acct.COLUMNNAME_B_SettlementLoss_Acct);
				o.setFieldInsert(X_C_BankAccount_Acct.COLUMNNAME_B_RevaluationGain_Acct);
				o.setFieldInsert(X_C_BankAccount_Acct.COLUMNNAME_B_RevaluationLoss_Acct);
				o.setFieldInsert(X_C_BankAccount_Acct.COLUMNNAME_BOE_Confirm_Acct);
				o.setFieldInsert(X_C_BankAccount_Acct.COLUMNNAME_BOE_Warranty_Acct);
				o.setFieldInsert(X_C_BankAccount_Acct.COLUMNNAME_BOE_Receivables_Acct);
				o.setFieldInsert(X_C_BankAccount_Acct.COLUMNNAME_BOE_Discount_Acct);
				o.setFieldInsert(X_C_BankAccount_Acct.COLUMNNAME_BOE_Protested_Acct);
				cnti = o.insertfromSelect(s, get_TrxName());
				toti += cnti;
				log.info("Bank Account = " + cntu + " / " + cnti);

				// Withholding
				o = new UpdatePO();
				o.setTablename(X_C_Withholding_Acct.Table_Name);
				o.setField(X_C_Withholding_Acct.COLUMNNAME_Withholding_Acct, rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_Withholding_Acct));
				o.setField(X_C_Withholding_Acct.COLUMNNAME_WithholdingApply_Acct, rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_WithholdingApply_Acct));
				o.setFieldExpr(Constants.COLUMNNAME_Updated, "CURRENT_TIMESTAMP");
				o.setField(Constants.COLUMNNAME_UpdatedBy, 0);
				where = String.format("C_Withholding_Acct.C_AcctSchema_ID=%s AND EXISTS (SELECT * FROM C_Withholding_Acct x WHERE x.C_Withholding_ID=C_Withholding_Acct.C_Withholding_ID)", rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID));
				cntu = o.update(where, get_TrxName());
				totu += cntu;
				// Insert new
				s = new SelectPO();
				s.setTablename(X_C_Withholding.Table_Name);
				s.setAlias("x");
				s.setField(X_C_Withholding.COLUMNNAME_C_Withholding_ID);
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID));
				s.setField(Constants.COLUMNNAME_AD_Client_ID);
				s.setField(Constants.COLUMNNAME_AD_Org_ID);
				s.setFieldExpr(Constants.YES);
				s.setField("CURRENT_TIMESTAMP");
				s.setField("0");
				s.setField("CURRENT_TIMESTAMP");
				s.setField("0");
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_Withholding_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_WithholdingApply_Acct));
				where = String.format("AD_Client_ID=%s AND NOT EXISTS (SELECT * FROM C_Withholding_Acct a WHERE a.C_Withholding_ID=x.C_Withholding_ID AND a.C_AcctSchema_ID=%s)",rs.getInt(Constants.COLUMNNAME_AD_Client_ID),rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID));
				s.setWhere(where);
				o = new UpdatePO();
				o.setTablename(X_C_Withholding_Acct.Table_Name);
				o.setFieldInsert(X_C_Withholding_Acct.COLUMNNAME_C_Withholding_ID);
				o.setFieldInsert(X_C_Withholding_Acct.COLUMNNAME_C_AcctSchema_ID);
				o.setFieldInsert(Constants.COLUMNNAME_AD_Client_ID); 
				o.setFieldInsert(Constants.COLUMNNAME_AD_Org_ID); 
				o.setFieldInsert(Constants.COLUMNNAME_IsActive); 
				o.setFieldInsert(Constants.COLUMNNAME_Created); 
				o.setFieldInsert(Constants.COLUMNNAME_CreatedBy); 
				o.setFieldInsert(Constants.COLUMNNAME_Updated); 
				o.setFieldInsert(Constants.COLUMNNAME_UpdatedBy);
				o.setFieldInsert(X_C_Withholding_Acct.COLUMNNAME_Withholding_Acct);
				o.setFieldInsert(X_C_Withholding_Acct.COLUMNNAME_WithholdingApply_Acct);
				cnti = o.insertfromSelect(s, get_TrxName());
				toti += cnti;
				log.info("Withholding = " + cntu + " / " + cnti);

				// Charge
				o = new UpdatePO();
				o.setTablename(X_C_Charge_Acct.Table_Name);
				o.setField(X_C_Charge_Acct.COLUMNNAME_Ch_Expense_Acct, rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_Ch_Expense_Acct));
				o.setField(X_C_Charge_Acct.COLUMNNAME_Ch_Revenue_Acct, rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_Ch_Revenue_Acct));
				o.setFieldExpr(Constants.COLUMNNAME_Updated, "CURRENT_TIMESTAMP");
				o.setField(Constants.COLUMNNAME_UpdatedBy, 0);
				where = String.format("C_Charge_Acct.C_AcctSchema_ID=%s AND EXISTS (SELECT * FROM C_Charge_Acct x WHERE x.C_Charge_ID=C_Charge_Acct.C_Charge_ID)", rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID));
				cntu = o.update(where, get_TrxName());
				totu += cntu;
				// Insert new
				s = new SelectPO();
				s.setTablename(X_C_Charge.Table_Name);
				s.setAlias("x");
				s.setField(X_C_Charge.COLUMNNAME_C_Charge_ID);
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID));
				s.setField(Constants.COLUMNNAME_AD_Client_ID);
				s.setField(Constants.COLUMNNAME_AD_Org_ID);
				s.setFieldExpr(Constants.YES);
				s.setField("CURRENT_TIMESTAMP");
				s.setField("0");
				s.setField("CURRENT_TIMESTAMP");
				s.setField("0");
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_Ch_Expense_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_Ch_Revenue_Acct));
				where = String.format("AD_Client_ID=%s AND NOT EXISTS (SELECT * FROM C_Charge_Acct a WHERE a.C_Charge_ID=x.C_Charge_ID AND a.C_AcctSchema_ID=%s)",rs.getInt(Constants.COLUMNNAME_AD_Client_ID), rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID));
				s.setWhere(where);
				o = new UpdatePO();
				o.setTablename(X_C_Charge_Acct.Table_Name);
				o.setFieldInsert(X_C_Charge_Acct.COLUMNNAME_C_Charge_ID);
				o.setFieldInsert(X_C_Charge_Acct.COLUMNNAME_C_AcctSchema_ID);
				o.setFieldInsert(Constants.COLUMNNAME_AD_Client_ID); 
				o.setFieldInsert(Constants.COLUMNNAME_AD_Org_ID); 
				o.setFieldInsert(Constants.COLUMNNAME_IsActive); 
				o.setFieldInsert(Constants.COLUMNNAME_Created); 
				o.setFieldInsert(Constants.COLUMNNAME_CreatedBy); 
				o.setFieldInsert(Constants.COLUMNNAME_Updated); 
				o.setFieldInsert(Constants.COLUMNNAME_UpdatedBy);
				o.setFieldInsert(X_C_Charge_Acct.COLUMNNAME_Ch_Expense_Acct);
				o.setFieldInsert(X_C_Charge_Acct.COLUMNNAME_Ch_Revenue_Acct);
				cnti = o.insertfromSelect(s, get_TrxName());
				toti += cnti;
				log.info("Charge = " + cntu + " / " + cnti);

				// Cashbook
				o = new UpdatePO();
				o.setTablename(X_C_CashBook_Acct.Table_Name);
				o.setField(X_C_CashBook_Acct.COLUMNNAME_CB_Asset_Acct, rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_CB_Asset_Acct));
				o.setField(X_C_CashBook_Acct.COLUMNNAME_CB_Differences_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_CB_Differences_Acct)); 
				o.setField(X_C_CashBook_Acct.COLUMNNAME_CB_CashTransfer_Acct, rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_CB_CashTransfer_Acct));
				o.setField(X_C_CashBook_Acct.COLUMNNAME_CB_Expense_Acct, rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_CB_Expense_Acct));
				o.setField(X_C_CashBook_Acct.COLUMNNAME_CB_Receipt_Acct, rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_CB_Receipt_Acct));
				o.setFieldExpr(Constants.COLUMNNAME_Updated, "CURRENT_TIMESTAMP");
				o.setField(Constants.COLUMNNAME_UpdatedBy, 0);
				where = String.format("C_Cashbook_Acct.C_AcctSchema_ID=%s AND EXISTS (SELECT * FROM C_Cashbook_Acct x WHERE x.C_Cashbook_ID=C_Cashbook_Acct.C_Cashbook_ID)", rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID));
				cntu = o.update(where, get_TrxName());
				totu += cntu;
				// Insert new
				s = new SelectPO();
				s.setTablename(X_C_CashBook.Table_Name);
				s.setAlias("x");
				s.setField(X_C_CashBook.COLUMNNAME_C_CashBook_ID);
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID));
				s.setField(Constants.COLUMNNAME_AD_Client_ID);
				s.setField(Constants.COLUMNNAME_AD_Org_ID);
				s.setFieldExpr(Constants.YES);
				s.setField("CURRENT_TIMESTAMP");
				s.setField("0");
				s.setField("CURRENT_TIMESTAMP");
				s.setField("0");
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_CB_Asset_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_CB_Differences_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_CB_CashTransfer_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_CB_Expense_Acct));
				s.setFieldExpr(rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_CB_Receipt_Acct));
				where = String.format("AD_Client_ID=%s AND NOT EXISTS (SELECT * FROM C_Cashbook_Acct a WHERE a.C_Cashbook_ID=x.C_Cashbook_ID AND a.C_AcctSchema_ID=%s)", rs.getInt(Constants.COLUMNNAME_AD_Client_ID), rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID));
				s.setWhere(where);
				o = new UpdatePO();
				o.setTablename(X_C_CashBook_Acct.Table_Name);
				o.setFieldInsert(X_C_CashBook_Acct.COLUMNNAME_C_CashBook_ID);
				o.setFieldInsert(X_C_CashBook_Acct.COLUMNNAME_C_AcctSchema_ID);
				o.setFieldInsert(Constants.COLUMNNAME_AD_Client_ID); 
				o.setFieldInsert(Constants.COLUMNNAME_AD_Org_ID); 
				o.setFieldInsert(Constants.COLUMNNAME_IsActive); 
				o.setFieldInsert(Constants.COLUMNNAME_Created); 
				o.setFieldInsert(Constants.COLUMNNAME_CreatedBy); 
				o.setFieldInsert(Constants.COLUMNNAME_Updated); 
				o.setFieldInsert(Constants.COLUMNNAME_UpdatedBy);
				o.setFieldInsert(X_C_CashBook_Acct.COLUMNNAME_CB_Asset_Acct);
				o.setFieldInsert(X_C_CashBook_Acct.COLUMNNAME_CB_Differences_Acct);
				o.setFieldInsert(X_C_CashBook_Acct.COLUMNNAME_CB_CashTransfer_Acct);
				o.setFieldInsert(X_C_CashBook_Acct.COLUMNNAME_CB_Expense_Acct);
				o.setFieldInsert(X_C_CashBook_Acct.COLUMNNAME_CB_Receipt_Acct);
				cnti = o.insertfromSelect(s, get_TrxName());
				toti += cnti;
				log.info("Cashbook = " + cntu + " / " + cnti);

				//	Update existing Bill of Exchange
				o = new UpdatePO();
				o.setTablename(X_C_BOE_Acct.Table_Name);
				o.setField(X_C_BOE_Acct.COLUMNNAME_BOE_Portfolio_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_BOE_Portfolio_Acct));
				o.setField(X_C_BOE_Acct.COLUMNNAME_BOE_Discount_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_BOE_Discount_Acct));
				o.setField(X_C_BOE_Acct.COLUMNNAME_BOE_Receivables_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_BOE_Receivables_Acct));
				o.setField(X_C_BOE_Acct.COLUMNNAME_BOE_Warranty_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_BOE_Warranty_Acct));
				o.setField(X_C_BOE_Acct.COLUMNNAME_BOE_Protested_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_BOE_Protested_Acct));
				o.setField(X_C_BOE_Acct.COLUMNNAME_BOE_Vendor_Acct,rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_BOE_Vendor_Acct));
				cntu = o.update(String.format("C_AcctSchema_ID=%s", rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID)), get_TrxName());
				totu += cntu;

				if (cntu == 0) {
					o.setField(X_C_BOE_Acct.COLUMNNAME_C_AcctSchema_ID, rs.getInt(X_C_AcctSchema_Default.COLUMNNAME_C_AcctSchema_ID));
					cnti = o.insert(get_TrxName());
				}								
				toti += cnti;
				log.info("Bill of Exchange = " + cntu + " / " + cnti);
			}
			rs.close();
			pstmt.close();
			pstmt = null;
			log.fine("Committing ...");
			DB.commit(true, get_TrxName());
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, "adding missing elements", e);
		}
		try
		{
			if (pstmt != null)
				pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			pstmt = null;
		}

		return "@Created@=" + cnti + ", @Updated@=" + cntu;		
	}	//	doIt

}	//	C_AcctSchema_Default_Copy
