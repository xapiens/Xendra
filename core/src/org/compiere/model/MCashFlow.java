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
package org.compiere.model;

import java.math.*;
import java.sql.*;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.Date;
//import java.util.*;
//import java.text.NumberFormat;
import java.util.GregorianCalendar;
import java.util.logging.Level;

import org.xendra.utils.*;
import org.compiere.model.persistence.X_C_CashFlow;
import org.compiere.model.persistence.X_C_Cashflow_Group;
import org.compiere.model.reference.REF_C_AcctSchemaElementType;
import org.compiere.report.MReportTree;
import org.compiere.util.*;

/**
 *	Cash Flow Model
 *	
 *  @author Francisco Morosini
 *  @version $Id: MCashFlow.java 5583 2015-08-05 14:11:58Z xapiens $
 */
public class MCashFlow extends X_C_CashFlow
{
	/**
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param C_CashFlow_ID id
	 *	@param trxName transaction
	 */
	public MCashFlow (Properties ctx, int C_CashFlow_ID, String trxName)
	{
		super (ctx, C_CashFlow_ID, trxName);
		if (C_CashFlow_ID == 0)
		{
		//	setLine (0);			
		//	setCashType (CASHTYPE_GeneralExpense);	
/*			int AD_Client_ID = Env.getContextAsInt(ctx,  "AD_Client_ID");
			int AD_Org_ID = Env.getContextAsInt(ctx,  "AD_Org_ID");			
			this.setAD_Client_ID(AD_Client_ID);
			this.setAD_Org_ID(AD_Org_ID);
*/			setAmount (Env.ZERO);
		}
	}	//	MCashLine

	/**
	 * 	Load Cosntructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MCashFlow (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MCashFlow
	
	/**
	 * 	Parent Cosntructor
	 *	@param cash parent
	 */
	public MCashFlow (MCashFlow cashflow)
	{
		this (cashflow.getCtx(), 0, cashflow.get_TrxName());
//		setClientOrg(cashflow);		
//		setC_CashFlow_ID(cashflow.getC_CashFlow_ID());
//		m_parent = cashflow;
//		m_cashBook = m_parent.getCashBook();
	}	//	MCashLine
	
	/**
	 * 	Add to Description
	 *	@param description text
	 */
	public void addDescription (String description)
	{
		String desc = getDescription();
		if (desc == null)
			setDescription(description);
		else
			setDescription(desc + " | " + description);
	}	//	addDescription
	
	/**
	 * 	Set Payment - no discount
	 *	@param payment payment
	 */	
	public void setPayment (MAcctSchema[] ass, MPayment payment)
	{										
		BigDecimal Amount = payment.getPayAmt().abs();
		
		X_C_Cashflow_Group cashflowgroup = new X_C_Cashflow_Group (getCtx(), payment.getC_Cashflow_Group_ID(), get_TrxName());
		
		String sign = cashflowgroup.getCashSign();

		if ( sign.equals("I") ) 
			Amount = Amount.plus();
		else if ( sign.equals("O") )
			Amount = Amount.negate();
				
		boolean OK = true;
		try
		{
			for (int j = 0; OK && j < ass.length; j++)
			{
				//	if acct schema has "only" org, skip
				boolean skip = false;
				if (ass[j].getAD_OrgOnly_ID() != 0)
				{
					if (ass[j].getOnlyOrgs() == null)
						ass[j].setOnlyOrgs(MReportTree.getChildIDs(getCtx(), 
							0, REF_C_AcctSchemaElementType.Organization, 
							ass[j].getAD_OrgOnly_ID()));

					//	Header Level Org
					skip = ass[j].isSkipOrg(payment.getAD_Org_ID());
					//	Line Level Org
				}
				if (skip)
					continue;
				MCashFlow cashflow = new MCashFlow(getCtx(),0, null);
				cashflow.setAD_Org_ID(payment.getAD_Org_ID());
				cashflow.setAD_Client_ID(payment.getAD_Client_ID());
				cashflow.setDateTrx(payment.getDateTrx());		
				cashflow.setC_Cashflow_Group_ID(payment.getC_Cashflow_Group_ID());							
				cashflow.setAD_Table_ID(MPayment.Table_ID);
				cashflow.setRecord_ID(payment.getC_Payment_ID());
				cashflow.setSign(sign);
				
				cashflow.setC_Currency_ID(ass[j].getC_Currency_ID());
				Amount = MConversionRate.convert(payment.getCtx(), Amount,payment.getC_Currency_ID(),ass[j].getC_Currency_ID(),payment.getDateTrx(),payment.getC_ConversionType_ID(),ass[j].getAD_Client_ID(),payment.getAD_Org_ID());
				cashflow.setAmount(Amount);
				cashflow.save();		
			}
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, "", e);
			OK = false;
		}
		payment.setCashed(true);		
		payment.save(get_TrxName());						
	}
	public void setCashLine(MAcctSchema[] ass, MCashLine cashline)
	{
		X_C_Cashflow_Group cashflowgroup = new X_C_Cashflow_Group (getCtx(), cashline.getC_Cashflow_Group_ID(), get_TrxName());
		String sign = cashflowgroup.getCashSign();
		BigDecimal Amount = cashline.getAmount().abs();		
		if ( sign.equals("I") ) 
			Amount = Amount.plus();
		else if ( sign.equals("O") )
			Amount = Amount.negate();
		
		boolean OK = true;
		try
		{
			for (int j = 0; OK && j < ass.length; j++)
			{
				//	if acct schema has "only" org, skip
				boolean skip = false;
				if (ass[j].getAD_OrgOnly_ID() != 0)
				{
					if (ass[j].getOnlyOrgs() == null)
						ass[j].setOnlyOrgs(MReportTree.getChildIDs(getCtx(), 
							0, REF_C_AcctSchemaElementType.Organization, 
							ass[j].getAD_OrgOnly_ID()));

					//	Header Level Org
					skip = ass[j].isSkipOrg(cashline.getAD_Org_ID());
					//	Line Level Org
				}
				if (skip)
					continue;
				MCashFlow cashflow = new MCashFlow(getCtx(),0, null);
				cashflow.setAD_Org_ID(cashline.getAD_Org_ID());
				cashflow.setAD_Client_ID(cashline.getAD_Client_ID());
				cashflow.setDateTrx(getCashlineDateAcct(cashline));		
				cashflow.setC_Cashflow_Group_ID(cashline.getC_Cashflow_Group_ID());							
				cashflow.setAD_Table_ID(MCashLine.Table_ID);
				cashflow.setRecord_ID(cashline.getC_CashLine_ID());
				cashflow.setSign(sign);
				
				cashflow.setC_Currency_ID(ass[j].getC_Currency_ID());
				Amount = MConversionRate.convert(cashline.getCtx(),Amount,cashline.getC_Currency_ID(),ass[j].getC_Currency_ID(),getCashlineDateAcct(cashline),cashline.getC_ConversionType_ID(),ass[j].getAD_Client_ID(),cashline.getAD_Org_ID());
				cashflow.setAmount(Amount);
				cashline.setCashed(true);
				
				cashline.save(get_TrxName());
				cashflow.save();						
			}
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, "", e);
			OK = false;
		}
		cashline.setCashed(true);		
		cashline.save(get_TrxName());
	}
	
	public Timestamp getCashlineDateAcct(MCashLine cashline)
	{
		MCash cash = new MCash( getCtx(),cashline.getC_Cash_ID(), get_TrxName());
		
		return cash.getDateAcct();
	}
			
	/**************************************************************************
	 * 	Before Delete
	 *	@return true/false
	 */
	protected boolean beforeDelete ()
	{
		//	Cannot Delete generated Invoices
		Boolean generated = (Boolean)get_ValueOld("IsGenerated");
		if (generated != null && generated.booleanValue())
		{
			if (get_ValueOld("C_Invoice_ID") != null)
			{
				log.warning("Cannot delete line with generated Invoice");
				return false;
			}
		}
		return true;
	}	//	beforeDelete

	/**
	 * 	After Delete
	 *	@param success
	 *	@return true/false
	 */
	protected boolean afterDelete (boolean success)
	{
		//if (!success)
			return success;
	}	//	afterDelete

	
	/**
	 * 	Before Save
	 *	@param newRecord
	 *	@return true/false
	 */
	protected boolean beforeSave (boolean newRecord)
	{
		//	Cannot change generated Invoices

		boolean verify = newRecord 
			|| is_ValueChanged("CashType")
			|| is_ValueChanged("C_Invoice_ID")
			|| is_ValueChanged("C_BankAccount_ID");
		if (verify)
		{
			//	otherwise (charge) - leave it
			//	Enforce Org
		}

		/**	General fix of Currency 
		UPDATE C_CashLine cl SET C_Currency_ID = (SELECT C_Currency_ID FROM C_Invoice i WHERE i.C_Invoice_ID=cl.C_Invoice_ID) WHERE C_Currency_ID IS NULL AND C_Invoice_ID IS NOT NULL;
		UPDATE C_CashLine cl SET C_Currency_ID = (SELECT C_Currency_ID FROM C_BankAccount b WHERE b.C_BankAccount_ID=cl.C_BankAccount_ID) WHERE C_Currency_ID IS NULL AND C_BankAccount_ID IS NOT NULL;
		UPDATE C_CashLine cl SET C_Currency_ID = (SELECT b.C_Currency_ID FROM C_Cash c, C_CashBook b WHERE c.C_Cash_ID=cl.C_Cash_ID AND c.C_CashBook_ID=b.C_CashBook_ID) WHERE C_Currency_ID IS NULL;
		**/
				
		return true;
	}	//	beforeSave
	
	/**
	 * 	After Save
	 *	@param newRecord
	 *	@param success
	 *	@return success
	 */
	protected boolean afterSave (boolean newRecord, boolean success)
	{
		//if (!success)
			return success;		
	}	//	afterSave
	
	public void setClient(int ClientIn)
	{
		setAD_Client_ID(ClientIn);
	}
	
	public boolean NeedDeletions(int AD_Client_ID)
	{
		boolean NeedDeletions = false;
		StringBuffer sql = new StringBuffer ("");
		sql.append("SELECT * FROM ").append(X_C_CashFlow.Table_Name)
		.append(" WHERE AD_Client_ID=?")
		.append(" AND isrecurring='N' AND Processed='Y'")
		.append(" ORDER BY Created");				
		
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql.toString(), null);
			pstmt.setInt(1, AD_Client_ID);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next())
				NeedDeletions = true;
			rs.close();
			pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			//s_log.log(Level.SEVERE, sql, e);
		}
		finally
		{
			try
			{
				if (pstmt != null)
					pstmt.close ();
			}
			catch (Exception e)
			{}
			pstmt = null;
		}
		
		return NeedDeletions;
	}
	
	public void Deletion(int AD_Client_ID)
	{
		StringBuffer sql = new StringBuffer ("");
		sql.append("SELECT * FROM ").append(X_C_CashFlow.Table_Name)
		.append(" WHERE AD_Client_ID=?")
		.append(" AND isrecurring='N' AND Processed='Y'")
		.append(" ORDER BY Created");				
		
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql.toString(), null);
			pstmt.setInt(1, AD_Client_ID);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				MCashFlow cash = new MCashFlow( getCtx(),rs.getInt("C_CASHFLOW_ID"), get_TrxName());
				cash.setProcessed(false);
				cash.save();
				StringBuffer sqlDelete = new StringBuffer ("DELETE FROM ") //jz why no FROM??
				.append(X_C_CashFlow.Table_Name)				
				.append(" WHERE record_id=").append(rs.getInt("C_CASHFLOW_ID"));				
				int no = DB.executeUpdate(sqlDelete.toString(), null);
			}			
			rs.close();
			pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			//s_log.log(Level.SEVERE, sql, e);
		}
		finally
		{
			try
			{
				if (pstmt != null)
					pstmt.close ();
			}
			catch (Exception e)
			{}
			pstmt = null;
		}		
	}
	
	public boolean CreateTransactions(MCashFlow cashflow,Forecast forecast)
	{
		// data of transaction
		BigDecimal amount;
		Timestamp ts;		
		String Sign;
		String description;
		int currency;
		
		int c_cashflow_group;
		// data of recurring
		Boolean isRecurring;
		String frequencytype;
		int frequency;
		Timestamp ud;
		
		int Org_ID; 
		int Client_ID;
		int Record_ID;
		
		Org_ID = cashflow.getAD_Org_ID();
		Client_ID = cashflow.getAD_Client_ID();
		
		Record_ID = cashflow.getC_CashFlow_ID();
		
		ts = cashflow.getDateTrx();
		Sign = cashflow.getSign();		
		amount = cashflow.getAmount();
		currency = cashflow.getC_Currency_ID();
		c_cashflow_group = cashflow.getC_Cashflow_Group_ID();
		description = cashflow.getDescription();
		
		isRecurring = cashflow.isRecurring();
		frequencytype = cashflow.getFrequencyType();
		frequency = cashflow.getFrequency();
		ud = cashflow.getUntilDate();
			
		forecast.addTransactionSet(	
				new TransactionSet(new Transaction( Org_ID, Client_ID, Record_ID ,(Date)ts, Sign.equals("I"), c_cashflow_group, description, currency, amount ),
				true,
				frequency,
				frequencytype,
                (Date)ud));		
		
		cashflow.setProcessed(true);
		cashflow.save();
		
		return true;
	}
	
}	//	MCashLine
