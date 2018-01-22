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
import java.util.*;
import java.util.logging.*;

import org.compiere.model.persistence.X_C_AllocationLine;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.model.persistence.X_C_Payment;
import org.compiere.model.persistence.X_C_PaymentLine;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;
import org.compiere.util.*;

/**
 *	Payment Callouts.
 *	org.compiere.model.CalloutPayment.*
 *	
 *  @author Jorg Janke
 *  @version $Id: CalloutPayment.java 5583 2015-08-05 14:11:58Z xapiens $
 */
public class CalloutPayment extends CalloutEngine
{
	public String BankAccountDoc(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value)
	{
		Integer C_BankAccountDoc_ID = (Integer)value;
		if (isCalloutActive()
			|| C_BankAccountDoc_ID == null || C_BankAccountDoc_ID == 0)
			return "";
		setCalloutActive(true);
		int C_BankAccount_ID = Env.getContextAsInt(ctx, WindowNo, "C_BankAccount_ID");
		Integer CurrentNext = 0;
		String sql = "SELECT currentNext FROM C_BankAccountDoc WHERE C_BankAccount_ID=? AND C_BankAccountDoc_ID=? ";
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql, null);
			pstmt.setInt(1, C_BankAccount_ID);
			pstmt.setInt(2, C_BankAccountDoc_ID);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next())
			{
				CurrentNext = rs.getInt(1);
				CurrentNext ++;
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql, e);
			setCalloutActive(false);
			return e.getLocalizedMessage();
		}
		mTab.setValue("CheckNo", new String().valueOf(CurrentNext));
		setCalloutActive(false);
		return "";
	}
		
	public String BankAccount(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value)
	{
		Integer C_BankAccount_ID = (Integer)value;
		if (isCalloutActive()
			|| C_BankAccount_ID == null || C_BankAccount_ID == 0)
			return "";
		setCalloutActive(true);
		int C_BankAccountDoc_ID = 0;
		Integer CurrentNext = 0;
		//int C_Order_ID = Env.getContextAsInt(ctx, WindowNo, "C_Order_ID");
		String sql = "SELECT C_BankAccountDoc_ID, currentNext FROM C_BankAccountDoc WHERE C_BankAccount_ID=?";
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql, null);
			pstmt.setInt(1, C_BankAccount_ID);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next())
			{
				C_BankAccountDoc_ID= rs.getInt(1);
				CurrentNext = rs.getInt(2);
				CurrentNext ++;
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql, e);
			setCalloutActive(false);
			return e.getLocalizedMessage();
		}
		mTab.setValue("C_BankAccountDoc_ID", C_BankAccountDoc_ID);
		mTab.setValue("CheckNo", new String().valueOf(CurrentNext));
		setCalloutActive(false);
		return "";
	}
	/**
	 *  Payment_Boe.
	 *  when Boe selected
	 *  - set C_Currency_ID
	 * 		- C_BPartner_ID
	 *  	- DiscountAmt = C_Invoice_Discount (ID, DateTrx)
	 *   	- PayAmt = invoiceOpen (ID) - Discount
	 * 		- WriteOffAmt = 0
	 *  @param ctx context
	 *  @param WindowNo current Window No
	 *  @param mTab Grid Tab
	 *  @param mField Grid Field
	 *  @param value New Value
	 *  @return null or error message
	 */
	public String boe (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value)
	{
		Integer C_BOE_ID = (Integer)value;
		if (isCalloutActive()		//	assuming it is resetting value
			|| C_BOE_ID == null || C_BOE_ID.intValue() == 0)
			return "";
		setCalloutActive(true);
		mTab.setValue("IsPrepayment", Boolean.FALSE);
		//  Payment Date
		Timestamp ts = (Timestamp)mTab.getValue("DateTrx");
		if (ts == null)
			ts = new Timestamp(System.currentTimeMillis());
		//
		String sql = "SELECT C_BPartner_ID,C_Currency_ID,"		//	1..2
			+ " BOEOpen(C_BOE_ID), IsSOTrx "	//	4..5	#2/3
			+ "FROM C_BOE WHERE C_BOE_ID=?";			//			#4
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql, null);
			pstmt.setInt(1, C_BOE_ID.intValue());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next())
			{
				mTab.setValue("C_BPartner_ID", new Integer(rs.getInt(1)));
				int C_Currency_ID = rs.getInt(2);					//	Set Invoice Currency
				mTab.setValue("C_Currency_ID", new Integer(C_Currency_ID));
				BigDecimal grandtotal = rs.getBigDecimal(3);		//	Set Invoice OPen Amount
				String m_trx = rs.getString("IsSOTrx");
				if (m_trx.equals("Y"))
					mTab.setValue("PayAmt", grandtotal );
				else
					mTab.setValue("PayAmt", grandtotal.negate());
				Env.setContext(ctx, WindowNo, "C_BOE_ID", C_BOE_ID.toString());
				mTab.setValue("C_BOE_ID", C_BOE_ID);
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql, e);
			setCalloutActive(false);
			return e.getLocalizedMessage();
		}

		setCalloutActive(false);
		return docType(ctx, WindowNo, mTab, mField, value);
	}	//	boe
	
	/**
	 *  Payment_GLJournal.
	 *  when GLJournal selected
	 *  - set C_Currency_ID
	 * 		- C_BPartner_ID
	 *  	- DiscountAmt = C_Invoice_Discount (ID, DateTrx)
	 *   	- PayAmt = invoiceOpen (ID) - Discount
	 * 		- WriteOffAmt = 0
	 *  @param ctx context
	 *  @param WindowNo current Window No
	 *  @param mTab Grid Tab
	 *  @param mField Grid Field
	 *  @param value New Value
	 *  @return null or error message
	 */
	public String journal (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value)
	{
		Integer gl_JournalLine_ID = (Integer)value;
		if (isCalloutActive()		//	assuming it is resetting value
			|| gl_JournalLine_ID == null || gl_JournalLine_ID.intValue() == 0)
			return "";
		setCalloutActive(true);
		mTab.setValue("IsPrepayment", Boolean.FALSE);
		//  Payment Date
		Timestamp ts = (Timestamp)mTab.getValue("DateTrx");
		if (ts == null)
			ts = new Timestamp(System.currentTimeMillis());
		//
		String sql = "SELECT C_BPartner_ID,C_Currency_ID,"		//	1..2
			+ " CASE WHEN AmtSourceDr > 0 THEN AmtSourceDr ELSE AmtSourceCr END AS Amount "	//	4..5	#2/3
			+ " FROM GL_JournalLine WHERE GL_JournalLine_ID=? ";			//			#4
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql, null);
			pstmt.setInt(1, gl_JournalLine_ID.intValue());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next())
			{
				mTab.setValue("C_BPartner_ID", new Integer(rs.getInt("C_BPartner_ID")));
				int C_Currency_ID = rs.getInt("C_Currency_ID");					//	Set Invoice Currency
				mTab.setValue("C_Currency_ID", new Integer(C_Currency_ID));
				BigDecimal amount = rs.getBigDecimal("Amount");		//	Set Invoice OPen Amount
				mTab.setValue("PayAmt", amount );
				Env.setContext(ctx, WindowNo, "GL_JournalLine_ID", gl_JournalLine_ID.toString());
				mTab.setValue("GL_JournalLine_ID", gl_JournalLine_ID);
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql, e);
			setCalloutActive(false);
			return e.getLocalizedMessage();
		}

		setCalloutActive(false);
		return "";
	}	//	journal
	
	/**
	 *  Payment_Invoice.
	 *  when Invoice selected
	 *  - set C_Currency_ID
	 * 		- C_BPartner_ID
	 *  	- DiscountAmt = C_Invoice_Discount (ID, DateTrx)
	 *   	- PayAmt = invoiceOpen (ID) - Discount
	 * 		- WriteOffAmt = 0
	 *  @param ctx context
	 *  @param WindowNo current Window No
	 *  @param mTab Grid Tab
	 *  @param mField Grid Field
	 *  @param value New Value
	 *  @return null or error message
	 */
	public String invoice (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value)
	{
		Integer C_Invoice_ID = (Integer)value;
		if (isCalloutActive()		//	assuming it is resetting value
			|| C_Invoice_ID == null || C_Invoice_ID.intValue() == 0)
			return "";
		setCalloutActive(true);	
		mTab.setValue(X_C_Payment.COLUMNNAME_C_Order_ID, null);
		//mTab.setValue(X_C_Payment.COLUMNNAME_C_Charge_ID, null);		
		mTab.setValue(X_C_Payment.COLUMNNAME_IsPrepayment, Boolean.FALSE);
		//
		mTab.setValue(X_C_Payment.COLUMNNAME_DiscountAmt, Env.ZERO);
		mTab.setValue(X_C_Payment.COLUMNNAME_WriteOffAmt, Env.ZERO);
		mTab.setValue(X_C_Payment.COLUMNNAME_IsOverUnderPayment, Boolean.FALSE);
		mTab.setValue(X_C_Payment.COLUMNNAME_OverUnderAmt, Env.ZERO);

		int C_InvoicePaySchedule_ID = 0;
		if (Env.getContextAsInt(ctx, Env.WINDOW_INFO, Env.TAB_INFO, "C_Invoice_ID") == C_Invoice_ID.intValue()
			&& Env.getContextAsInt(ctx, Env.WINDOW_INFO, Env.TAB_INFO, "C_InvoicePaySchedule_ID") != 0)
			C_InvoicePaySchedule_ID = Env.getContextAsInt(ctx, Env.WINDOW_INFO, Env.TAB_INFO, "C_InvoicePaySchedule_ID");

		//  Payment Date
		Timestamp ts = (Timestamp)mTab.getValue("DateTrx");
		if (ts == null)
			ts = new Timestamp(System.currentTimeMillis());
		//
		String sql = "SELECT C_BPartner_ID,C_Currency_ID,"		//	1..2
			+ " invoiceOpen(C_Invoice_ID, ?),"					//	3		#1
			+ " invoiceDiscount(C_Invoice_ID,?,?), IsSOTrx,GrandTotal, WithholdingAmt "	//	4..5	#2/3
			+ "FROM C_Invoice WHERE C_Invoice_ID=?";			//			#4
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql, null);
			pstmt.setInt(1, C_InvoicePaySchedule_ID);
			pstmt.setTimestamp(2, ts);
			pstmt.setInt(3, C_InvoicePaySchedule_ID);
			pstmt.setInt(4, C_Invoice_ID.intValue());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next())
			{	
				Boolean IsSOTrx = rs.getString(X_C_Invoice.COLUMNNAME_IsSOTrx).equals("Y");
				mTab.setValue(X_C_Invoice.COLUMNNAME_C_BPartner_ID, new Integer(rs.getInt(1)));
				int C_Currency_ID = rs.getInt(2);					//	Set Invoice Currency
				mTab.setValue(X_C_Invoice.COLUMNNAME_C_Currency_ID, new Integer(C_Currency_ID));
				//
				BigDecimal InvoiceOpen = rs.getBigDecimal(3);		//	Set Invoice OPen Amount
				if (InvoiceOpen == null)
					InvoiceOpen = Env.ZERO;
				BigDecimal DiscountAmt = rs.getBigDecimal(4);		//	Set Discount Amt
				if (DiscountAmt == null)
					DiscountAmt = Env.ZERO;
				BigDecimal PayAmt = InvoiceOpen.subtract(DiscountAmt);
				BigDecimal GrandTotal = rs.getBigDecimal(X_C_Invoice.COLUMNNAME_GrandTotal);
				BigDecimal WithholdingAmt = rs.getBigDecimal(X_C_Invoice.COLUMNNAME_WithholdingAmt);
				if (WithholdingAmt == null)
					WithholdingAmt = Env.ZERO;
				BigDecimal WithholdingPercent = Env.ZERO;
				if (WithholdingAmt.signum() > 0 && GrandTotal.signum() > 0)		
				{
					WithholdingPercent = WithholdingAmt.divide(GrandTotal, BigDecimal.ROUND_HALF_UP);
					WithholdingPercent = WithholdingPercent.multiply(Env.ONEHUNDRED);
					if (WithholdingPercent.signum() > 0)
					{
						WithholdingAmt = PayAmt; 
						PayAmt = PayAmt.multiply(Env.ONEHUNDRED);
						PayAmt = PayAmt.divide(Env.ONEHUNDRED.add(WithholdingPercent), BigDecimal.ROUND_HALF_UP);
						WithholdingAmt = WithholdingAmt.subtract(PayAmt); 
					}
				}								
				if (mTab.getAD_Table_ID() == X_C_PaymentLine.Table_ID)
				{
					PayAmt = PayAmt.multiply(IsSOTrx ? Env.ONE : Env.ONE.negate());
					WithholdingAmt = WithholdingAmt.multiply(IsSOTrx ? Env.ONE : Env.ONE.negate());
					DiscountAmt = DiscountAmt.multiply(IsSOTrx ? Env.ONE : Env.ONE.negate());
				}				
				mTab.setValue(X_C_PaymentLine.COLUMNNAME_WithholdingAmt, WithholdingAmt);
				mTab.setValue(X_C_PaymentLine.COLUMNNAME_PayAmt, PayAmt);				
				mTab.setValue(X_C_PaymentLine.COLUMNNAME_DiscountAmt, DiscountAmt);
				//  reset as dependent fields get reset
				Env.setContext(ctx, WindowNo, mTab.getTabNo(), "C_Invoice_ID", C_Invoice_ID.toString());
				mTab.setValue(X_C_Payment.COLUMNNAME_C_Invoice_ID, C_Invoice_ID);
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql, e);
			setCalloutActive(false);
			return e.getLocalizedMessage();
		}

		setCalloutActive(false);
		return docType(ctx, WindowNo, mTab, mField, value);
	}	//	invoice

	/**
	 *  Payment_Order.
	 *  when Waiting Payment Order selected
	 *  - set C_Currency_ID
	 * 		- C_BPartner_ID
	 *  	- DiscountAmt = C_Invoice_Discount (ID, DateTrx)
	 *   	- PayAmt = invoiceOpen (ID) - Discount
	 * 		- WriteOffAmt = 0
	 *  @param ctx context
	 *  @param WindowNo current Window No
	 *  @param mTab Grid Tab
	 *  @param mField Grid Field
	 *  @param value New Value
	 *  @return null or error message
	 */
	public String order (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value)
	{
		Integer C_Order_ID = (Integer)value;
		if (isCalloutActive()		//	assuming it is resetting value
			|| C_Order_ID == null || C_Order_ID.intValue() == 0)
			return "";
		setCalloutActive(true);
		mTab.setValue("C_Invoice_ID", null);
		mTab.setValue("C_Charge_ID", null);
		mTab.setValue("IsPrepayment", Boolean.TRUE);
		//
		mTab.setValue("DiscountAmt", Env.ZERO);
		mTab.setValue("WriteOffAmt", Env.ZERO);
		mTab.setValue("IsOverUnderPayment", Boolean.FALSE);
		mTab.setValue("OverUnderAmt", Env.ZERO);

		//  Payment Date
		Timestamp ts = (Timestamp)mTab.getValue("DateTrx");
		if (ts == null)
			ts = new Timestamp(System.currentTimeMillis());
		//
		String sql = "SELECT C_BPartner_ID,C_Currency_ID, GrandTotal "
			+ "FROM C_Order WHERE C_Order_ID=?"; 	// #1
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql, null);
			pstmt.setInt(1, C_Order_ID.intValue());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next())
			{
				mTab.setValue("C_BPartner_ID", new Integer(rs.getInt(1)));
				int C_Currency_ID = rs.getInt(2);					//	Set Order Currency
				mTab.setValue("C_Currency_ID", new Integer(C_Currency_ID));
				//
				BigDecimal GrandTotal = rs.getBigDecimal(3);		//	Set Pay Amount
				if (GrandTotal == null)
					GrandTotal = Env.ZERO;
				mTab.setValue("PayAmt", GrandTotal);
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql, e);
			setCalloutActive(false);
			return e.getLocalizedMessage();
		}

		setCalloutActive(false);
		return docType(ctx, WindowNo, mTab, mField, value);
	}	//	order

	/**
	 *  Payment_Project.
	 *  - reset - C_BPartner_ID, Invoice, Order, Project,
	 *  	Discount, WriteOff
	 *  @param ctx context
	 *  @param WindowNo current Window No
	 *  @param mTab Grid Tab
	 *  @param mField Grid Field
	 *  @param value New Value
	 *  @return null or error message
	 */
	public String project (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value)
	{
		Integer C_Project_ID = (Integer)value;
		if (isCalloutActive()		//	assuming it is resetting value
			|| C_Project_ID == null || C_Project_ID.intValue() == 0)
			return "";
		setCalloutActive(true);
		mTab.setValue("C_Charge_ID", null);
		setCalloutActive(false);
		return "";
	}	//	project

	/**
	 *  Payment_Charge.
	 *  - reset - C_BPartner_ID, Invoice, Order, Project,
	 *  	Discount, WriteOff
	 *  @param ctx context
	 *  @param WindowNo current Window No
	 *  @param mTab Grid Tab
	 *  @param mField Grid Field
	 *  @param value New Value
	 *  @return null or error message
	 */
	public String charge (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value)
	{
		Integer C_Charge_ID = (Integer)value;
		if (isCalloutActive()		//	assuming it is resetting value
			|| C_Charge_ID == null || C_Charge_ID.intValue() == 0)
			return "";
		setCalloutActive(true);
		//mTab.setValue("C_Invoice_ID", null);
		mTab.setValue("C_Order_ID", null);
		mTab.setValue("C_Project_ID", null);
		mTab.setValue("IsPrepayment", Boolean.FALSE);
		//
		mTab.setValue("DiscountAmt", Env.ZERO);
		mTab.setValue("WriteOffAmt", Env.ZERO);
		mTab.setValue("IsOverUnderPayment", Boolean.FALSE);
		mTab.setValue("OverUnderAmt", Env.ZERO);
		setCalloutActive(false);
		return "";
	}	//	charge

	/**
	 *  Payment_Document Type.
	 * 	Verify that Document Type (AP/AR) and Invoice (SO/PO) are in sync
	 *  @param ctx context
	 *  @param WindowNo current Window No
	 *  @param mTab Grid Tab
	 *  @param mField Grid Field
	 *  @param value New Value
	 *  @return null or error message
	 */
	public String docType (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value)
	{
		int C_Invoice_ID = Env.getContextAsInt(ctx, WindowNo, mTab.getTabNo(), "C_Invoice_ID");
		int C_Order_ID = Env.getContextAsInt(ctx, WindowNo, mTab.getTabNo(),  "C_Order_ID");
		int C_DocType_ID = Env.getContextAsInt(ctx, WindowNo, mTab.getTabNo(),  "C_DocType_ID");
		log.fine("Payment_DocType - C_Invoice_ID=" + C_Invoice_ID + ", C_DocType_ID=" + C_DocType_ID);
		MDocType dt = null;
		if (C_DocType_ID != 0)
		{
			dt = MDocType.get(ctx, C_DocType_ID);
			mTab.setValue("IsTransfer", dt.getDocBaseType().equals(REF_C_DocTypeDocBaseType.BankAccountTransfer));
			mTab.setValue("IsTransferSource", dt.getDocBaseType().equals(REF_C_DocTypeDocBaseType.BankAccountTransfer));
			if (dt.getC_ConversionType_ID() > 0)
				mTab.setValue("C_ConversionType_ID", dt.getC_ConversionType_ID());
			Env.setContext(ctx, WindowNo, mTab.getTabNo(), "IsSOTrx", dt.isSOTrx() ? "Y" : "N");
		}
		//	Invoice
		if (C_Invoice_ID != 0)
		{
			MInvoice inv = new MInvoice (ctx, C_Invoice_ID, null);
			if (dt != null)
			{
				if (inv.isSOTrx() != dt.isSOTrx())
					return "PaymentDocTypeInvoiceInconsistent";
			}
		}
		//	Order Waiting Payment (can only be SO)
		if (C_Order_ID != 0 && !dt.isSOTrx())
			return "PaymentDocTypeInvoiceInconsistent";
		
		return "";
	}	//	docType

	public String BOERenewed(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value)
	{
		if (isCalloutActive())
			return "";
		setCalloutActive(true);
		BigDecimal RenewedAmt = (BigDecimal) value;
		if (RenewedAmt.compareTo(Env.ZERO) != 0)
		{
			String m_processRenewed = "";
			Integer C_BOE_ID = (Integer) mTab.getValue("C_BOE_ID");
			MBOE boe = MBOE.get(Env.getCtx(), C_BOE_ID, null);
			Timestamp duedate = boe.getR_DueDate();
			if (duedate == null)
				m_processRenewed = "\n no existe fecha de vencimiento ";
			Timestamp dateboe = boe.getR_DateBOE();
			if (dateboe == null)
				m_processRenewed = m_processRenewed.concat("\n no existe fecha de referencia "); 
			String DocumentNo = boe.getR_DocumentNo();	
			if (DocumentNo == null)
				m_processRenewed = m_processRenewed.concat("\n no existe referencia ");
			if (m_processRenewed.length() > 0)
			{
				m_processRenewed = m_processRenewed.concat(" para la nueva letra renovada");
				mTab.fireDataStatusEEvent(m_processRenewed,
						"0",
						true);				
				//mTab.setValue("RenewedAmt", Env.ZERO);				
			}
		}
		setCalloutActive(false);
		return amounts(ctx, WindowNo, mTab, mField, value);
	}	
	/**
	 *  Payment_Amounts.
	 *	Change of:
	 *		- IsOverUnderPayment -> set OverUnderAmt to 0
	 *		- C_Currency_ID, C_ConvesionRate_ID -> convert all
	 *		- PayAmt, DiscountAmt, WriteOffAmt, OverUnderAmt -> PayAmt
	 *			make sure that add up to InvoiceOpenAmt
	 *  @param ctx context
	 *  @param WindowNo current Window No
	 *  @param mTab Grid Tab
	 *  @param mField Grid Field
	 *  @param value New Value
	 *  @param oldValue Old Value
	 *  @return null or error message
	 */
	public String amounts (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value)
	{
		if (isCalloutActive())		//	assuming it is resetting value
			return "";
		int C_Invoice_ID = Env.getContextAsInt(ctx, WindowNo, mTab.getTabNo(), "C_Invoice_ID");
		int C_BOE_ID = Env.getContextAsInt(ctx, WindowNo, mTab.getTabNo(), "C_BOE_ID");
		//	New Payment
		if (Env.getContextAsInt(ctx, WindowNo, "C_Payment_ID") == 0
			&& Env.getContextAsInt(ctx, WindowNo, "C_BPartner_ID") == 0
			&& C_Invoice_ID == 0 && C_BOE_ID == 0)
			return "";
		setCalloutActive(true);

		//	Changed Column
		String colName = mField.getColumnName();
		
		Boolean IsSOTrx = Env.getContext(ctx, WindowNo, mTab.getTabNo(), "IsSOTrx").equals("Y");
		
		BigDecimal RenewedAmt = Env.ZERO;
		//
		if (colName.equals("RenewedAmt"))
		{
			RenewedAmt = (BigDecimal) value;
			if (RenewedAmt == null)
				RenewedAmt = Env.ZERO;			
			if (RenewedAmt.compareTo(Env.ZERO) > 0)
			{
				String m_processRenewed = "";
				MBOE boe = new MBOE(Env.getCtx(), C_BOE_ID, null);
				Timestamp duedate = boe.getR_DueDate();
				if (duedate == null)
					m_processRenewed = "\n no existe fecha de vencimiento ";
				Timestamp dateboe = boe.getR_DateBOE();
				if (dateboe == null)
					m_processRenewed = m_processRenewed.concat("\n no existe fecha de referencia "); 
				String DocumentNo = boe.getR_DocumentNo();	
				if (DocumentNo == null)
					m_processRenewed = m_processRenewed.concat("\n no existe referencia ");
				if (m_processRenewed.length() > 0)
				{
					m_processRenewed = m_processRenewed.concat(" para la nueva letra renovada");
					mTab.fireDataStatusEEvent(m_processRenewed,
							"0",
							false);				
					mTab.setValue("RenewedAmt", Env.ZERO);
					RenewedAmt = Env.ZERO;
				}
			}			
		}		
		
		if (colName.equals("IsOverUnderPayment")	//	Set Over/Under Amt to Zero
			|| !"Y".equals(Env.getContext(ctx, WindowNo, mTab.getTabNo(), "IsOverUnderPayment")))
			mTab.setValue("OverUnderAmt", Env.ZERO);

		int C_InvoicePaySchedule_ID = 0;
		if (Env.getContextAsInt(ctx, Env.WINDOW_INFO, Env.TAB_INFO, "C_Invoice_ID") == C_Invoice_ID
			&& Env.getContextAsInt(ctx, Env.WINDOW_INFO, Env.TAB_INFO, "C_InvoicePaySchedule_ID") != 0)
			C_InvoicePaySchedule_ID = Env.getContextAsInt(ctx, Env.WINDOW_INFO, Env.TAB_INFO, "C_InvoicePaySchedule_ID");

		//	Get Open Amount & Invoice Currency
		BigDecimal InvoiceOpenAmt = Env.ZERO;
		BigDecimal BOEOpenAmt = Env.ZERO;
		//BigDecimal RenewedAmt  = (BigDecimal) mTab.getValue("RenewedAmt");
		int C_Currency_Invoice_ID = 0;
		int C_Currency_BOE_ID = 0;
		if (C_Invoice_ID != 0)
		{
			Timestamp ts = (Timestamp)mTab.getValue("DateTrx");
			if (ts == null)
				ts = new Timestamp(System.currentTimeMillis());
			String sql = "SELECT C_BPartner_ID,C_Currency_ID,"		//	1..2
				+ " invoiceOpen(C_Invoice_ID,?),"					//	3		#1
				+ " invoiceDiscount(C_Invoice_ID,?,?), IsSOTrx "	//	4..5	#2/3
				+ "FROM C_Invoice WHERE C_Invoice_ID=?";			//			#4
			try
			{
				PreparedStatement pstmt = DB.prepareStatement(sql, null);
				pstmt.setInt(1, C_InvoicePaySchedule_ID);
				pstmt.setTimestamp(2, ts);
				pstmt.setInt(3, C_InvoicePaySchedule_ID);
				pstmt.setInt(4, C_Invoice_ID);
				ResultSet rs = pstmt.executeQuery();
				if (rs.next())
				{
					C_Currency_Invoice_ID= rs.getInt(2);
					InvoiceOpenAmt = rs.getBigDecimal(3);		//	Set Invoice Open Amount
					if (InvoiceOpenAmt == null)
						InvoiceOpenAmt = Env.ZERO;
				}
				rs.close();
				pstmt.close();
			}
			catch (SQLException e)
			{
				log.log(Level.SEVERE, sql, e);
				setCalloutActive(false);
				return e.getLocalizedMessage();
			}
		}	//	get Invoice Info
		else if (C_BOE_ID != 0)
		{
			Timestamp ts = (Timestamp)mTab.getValue("DateTrx");
			if (ts == null)
				ts = new Timestamp(System.currentTimeMillis());
			String sql = "SELECT C_BPartner_ID,C_Currency_ID,"		//	1..2
				+ " BOEOpen(C_BOE_ID), IsSOTrx "	//	3..4	#2/3
				+ "FROM C_BOE WHERE C_BOE_ID=?";			//			#4
			try
			{
				PreparedStatement pstmt = DB.prepareStatement(sql, null);
				pstmt.setInt(1, C_BOE_ID);
				ResultSet rs = pstmt.executeQuery();
				if (rs.next())
				{
					C_Currency_BOE_ID= rs.getInt(2);
					BOEOpenAmt = rs.getBigDecimal(3);		//	Set Invoice Open Amount
					if (BOEOpenAmt == null)
						BOEOpenAmt = Env.ZERO;			
				}
				rs.close();
				pstmt.close();
			}
			catch (SQLException e)
			{
				log.log(Level.SEVERE, sql, e);
				setCalloutActive(false);
				return e.getLocalizedMessage();
			}			
		}
		log.fine("Open=" + InvoiceOpenAmt + ", C_Invoice_ID=" + C_Invoice_ID 
			+ ", C_Currency_ID=" + C_Currency_Invoice_ID);

		//	Get Info from Tab		
		BigDecimal PayAmt = (BigDecimal)mTab.getValue("PayAmt");
		BigDecimal WithholdingAmt = (BigDecimal) mTab.getValue(X_C_AllocationLine.COLUMNNAME_WithholdingAmt);
		BigDecimal DiscountAmt = (BigDecimal)mTab.getValue("DiscountAmt");
		BigDecimal WriteOffAmt = (BigDecimal)mTab.getValue("WriteOffAmt");
		BigDecimal OverUnderAmt = (BigDecimal)mTab.getValue("OverUnderAmt");
		log.fine("Pay=" + PayAmt + ", Discount=" + DiscountAmt
			+ ", WriteOff=" + WriteOffAmt + ", OverUnderAmt=" + OverUnderAmt);
		//	Get Currency Info
		int C_Currency_ID = ((Integer)mTab.getValue("C_Currency_ID")).intValue();	
		MCurrency currency = MCurrency.get(ctx, C_Currency_ID);
		Timestamp ConvDate = (Timestamp)mTab.getValue("DateTrx");
		int C_ConversionType_ID = 0;
		Integer ii = (Integer)mTab.getValue("C_ConversionType_ID");
		if (ii != null)
			C_ConversionType_ID = ii.intValue();
		
		//int C_DocType_ID = ((Integer) mTab.getValue("C_DocType_ID")).intValue();
		
		int AD_Client_ID = Env.getContextAsInt(ctx, WindowNo, "AD_Client_ID");
		int AD_Org_ID = Env.getContextAsInt(ctx, WindowNo, "AD_Org_ID");
		//	Get Currency Rate
		BigDecimal CurrencyRate = Env.ONE;
		if ((C_Currency_ID > 0 && C_Currency_Invoice_ID > 0 &&
			C_Currency_ID != C_Currency_Invoice_ID)
			|| colName.equals("C_Currency_ID") || colName.equals("C_ConversionType_ID"))
		{
			log.fine("InvCurrency=" + C_Currency_Invoice_ID 
				+ ", PayCurrency=" + C_Currency_ID 
				+ ", Date=" + ConvDate + ", Type=" + C_ConversionType_ID);
			CurrencyRate = MConversionRate.getRate (C_Currency_Invoice_ID, C_Currency_ID, 
				ConvDate, C_ConversionType_ID, AD_Client_ID, AD_Org_ID);
			if (CurrencyRate == null || CurrencyRate.compareTo(Env.ZERO) == 0)
			{
			//	mTab.setValue("C_Currency_ID", new Integer(C_Currency_Invoice_ID));	//	does not work
				setCalloutActive(false);
				if (C_Currency_Invoice_ID == 0)
					return "";		//	no error message when no invoice is selected
				return "NoCurrencyConversion";
			}
			//
			InvoiceOpenAmt = InvoiceOpenAmt.multiply(CurrencyRate)
				.setScale(currency.getStdPrecision(), BigDecimal.ROUND_HALF_UP);
			log.fine("Rate=" + CurrencyRate + ", InvoiceOpenAmt=" + InvoiceOpenAmt);
		}
		else if ((C_Currency_ID > 0 && C_Currency_BOE_ID > 0 &&
				C_Currency_ID != C_Currency_BOE_ID)
				|| colName.equals("C_Currency_ID") || colName.equals("C_ConversionType_ID"))
		{
				log.fine("InvCurrency=" + C_Currency_BOE_ID 
					+ ", PayCurrency=" + C_Currency_ID 
					+ ", Date=" + ConvDate + ", Type=" + C_ConversionType_ID);
				CurrencyRate = MConversionRate.getRate (C_Currency_BOE_ID, C_Currency_ID, 
					ConvDate, C_ConversionType_ID, AD_Client_ID, AD_Org_ID);
				if (CurrencyRate == null || CurrencyRate.compareTo(Env.ZERO) == 0)
				{
				//	mTab.setValue("C_Currency_ID", new Integer(C_Currency_Invoice_ID));	//	does not work
					setCalloutActive(false);
					if (C_Currency_BOE_ID == 0)
						return "";		//	no error message when no invoice is selected
					return "NoCurrencyConversion";
				}
				//
				BOEOpenAmt = BOEOpenAmt.multiply(CurrencyRate)
					.setScale(currency.getStdPrecision(), BigDecimal.ROUND_HALF_UP);
				log.fine("Rate=" + CurrencyRate + ", BOEOpenAmt=" + BOEOpenAmt);
				RenewedAmt = RenewedAmt.multiply(CurrencyRate)
					.setScale(currency.getStdPrecision(), BigDecimal.ROUND_HALF_UP);

		}		

		//	Currency Changed - convert all
		if (colName.equals("C_Currency_ID") || colName.equals("C_ConversionType_ID"))
		{
			PayAmt = PayAmt.multiply(CurrencyRate)
				.setScale(currency.getStdPrecision(), BigDecimal.ROUND_HALF_UP);
			mTab.setValue("PayAmt", PayAmt);
			DiscountAmt = DiscountAmt.multiply(CurrencyRate)
				.setScale(currency.getStdPrecision(), BigDecimal.ROUND_HALF_UP);
			mTab.setValue("DiscountAmt", DiscountAmt);
			WriteOffAmt = WriteOffAmt.multiply(CurrencyRate)
				.setScale(currency.getStdPrecision(), BigDecimal.ROUND_HALF_UP);
//			mTab.setValue("WriteOffAmt", WriteOffAmt);
			OverUnderAmt = OverUnderAmt.multiply(CurrencyRate)
				.setScale(currency.getStdPrecision(), BigDecimal.ROUND_HALF_UP);
//			mTab.setValue("OverUnderAmt", OverUnderAmt);
		}

		//	No Invoice - Set Discount, Witeoff, Under/Over to 0
		else if ( (C_Invoice_ID == 0 && C_BOE_ID == 0) )
		{
			if (Env.ZERO.compareTo(DiscountAmt) != 0)
				mTab.setValue("DiscountAmt", Env.ZERO);
			if (Env.ZERO.compareTo(WriteOffAmt) != 0) {}
//				mTab.setValue("WriteOffAmt", Env.ZERO);
			if (Env.ZERO.compareTo(OverUnderAmt) != 0) {}
//				mTab.setValue("OverUnderAmt", Env.ZERO);				
		}		
		//  PayAmt - calculate write off
		//Added Lines By Goodwill (02-03-2006)
		//Reason: we must make the callout is called just when docstatus is draft
		//Old Code : else if (colName.equals("PayAmt"))
		//New Code :
		else if (colName.equals("PayAmt") && !mTab.get_ValueAsString("DocStatus").equals("CO") && C_Invoice_ID > 0)
		//End By Goodwill
		{
			if("Y".equals(Env.getContext(ctx, WindowNo, mTab.getTabNo(), "IsOverUnderPayment")))
			{
				OverUnderAmt = Env.ZERO;
			}
			else
			{
				
			}
			WriteOffAmt = InvoiceOpenAmt.abs().subtract(PayAmt.abs().add(WithholdingAmt.abs())).subtract(DiscountAmt.abs()).subtract(OverUnderAmt);
			if (mTab.getAD_Table_ID() == X_C_PaymentLine.Table_ID)
				WriteOffAmt = WriteOffAmt.multiply(PayAmt.signum() == 1 ? Env.ONE : Env.ONE.negate());
			if("Y".equals(Env.getContext(ctx, WindowNo, mTab.getTabNo(), "IsOverUnderPayment")))
				mTab.setValue("OverUnderAmt", WriteOffAmt);
			//else
			//	mTab.setValue("WriteOffAmt", WriteOffAmt);
			//End Of Added Lines
		}
		else if (colName.equals("PayAmt") && !mTab.get_ValueAsString("DocStatus").equals("CO") && C_BOE_ID > 0)
		{
			Integer C_Charge_ID = (Integer) mTab.getValue("C_Charge_ID");
			WriteOffAmt = BOEOpenAmt.abs().subtract(PayAmt.abs()).subtract(DiscountAmt.abs()).subtract(OverUnderAmt);
			if (mTab.getAD_Table_ID() == X_C_PaymentLine.Table_ID)
				WriteOffAmt = WriteOffAmt.multiply(PayAmt.signum() == 1 ? Env.ONE : Env.ONE.negate());
			// se agrego la condicion de Cargo (C_Charge_ID != 0) , para poder referenciar
			// la obligacion de la cuenta 44 a la letra.
			if (WriteOffAmt.compareTo(Env.ZERO) < 0 && C_Charge_ID == 0) 
			{
				mTab.setValue("PayAmt", Env.ZERO);
				setCalloutActive(false);
				return "LetraYaCancelada";				
			}
			
			if(!"Y".equals(Env.getContext(ctx, WindowNo, "IsOverUnderPayment")))
				{} // mTab.setValue("WriteOffAmt", WriteOffAmt);
			else
				{} //mTab.setValue("OverUnderAmt", WriteOffAmt);
		}		
		//Added Lines By Goodwill (02-03-2006)
		//Reason: we must make the callout is called just when docstatus is draft
		//Old Code : else    //  calculate PayAmt
		//New Code :
//		else  if(!mTab.get_ValueAsString("DocStatus").equals("CO") && C_Invoice_ID > 0)  //  calculate PayAmt
//		//End By Goodwill
//		{
//			PayAmt = InvoiceOpenAmt.abs().subtract(DiscountAmt.abs()).subtract(WriteOffAmt.abs()).subtract(OverUnderAmt.abs());
//			PayAmt = PayAmt.multiply(new BigDecimal(InvoiceOpenAmt.signum()));
//			if (mTab.getAD_Table_ID() == X_C_PaymentLine.Table_ID)
//				PayAmt = PayAmt.multiply(IsSOTrx ? Env.ONE : Env.ONE.negate());
//			mTab.setValue("PayAmt", PayAmt);
//		}
		else  if(!mTab.get_ValueAsString("DocStatus").equals("CO") && C_BOE_ID > 0)  //  calculate PayAmt
		{
			
			if (RenewedAmt.compareTo(Env.ZERO) != 0)
			{
				BOEOpenAmt = BOEOpenAmt.subtract(RenewedAmt);						
			}
			PayAmt = BOEOpenAmt.abs().subtract(DiscountAmt.abs()).subtract(WriteOffAmt.abs()).subtract(OverUnderAmt.abs());
			if (mTab.getAD_Table_ID() == X_C_PaymentLine.Table_ID)
				PayAmt = PayAmt.multiply(IsSOTrx ? Env.ONE : Env.ONE.negate());
			mTab.setValue("PayAmt", PayAmt);
		}

		setCalloutActive(false);
		return "";
	}	//	amounts

	/**
	 *  Payment_Document Type.
	 * 	Verify that Document Type (AP/AR) and Invoice (SO/PO) are in sync
	 *  @param ctx context
	 *  @param WindowNo current Window No
	 *  @param mTab Grid Tab
	 *  @param mField Grid Field
	 *  @param value New Value
	 *  @return null or error message
	 */
	public String TenderType (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value)
	{
		mTab.setValue("CheckNo","");
		return "";
	}	//	docType
	
	public String bPartner (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value)
	{
		Integer C_BPartner_ID = (Integer)value;
		if (C_BPartner_ID == null || C_BPartner_ID.intValue() == 0)
			return "";
		setCalloutActive(true);
		String sql = "SELECT p.name "
			+ " FROM C_BPartner p "
			+ " WHERE p.C_BPartner_ID=? AND p.IsActive='Y'";		//	#1

		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql, null);
			pstmt.setInt(1, C_BPartner_ID.intValue());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next())
			{
				String name = rs.getString("Name");
				mTab.setValue("Alias", name);
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql, e);
			setCalloutActive(false);
			return e.getLocalizedMessage();
		}		
		setCalloutActive(false);
		return "";
	}
}	//	CalloutPayment
