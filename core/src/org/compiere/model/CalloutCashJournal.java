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

import org.compiere.model.persistence.X_C_CashLine;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.model.reference.REF_C_CashTrxType;
import org.compiere.util.*;

/**
 *	Cash Book Journal Callouts
 *	
 *  @author Jorg Janke
 *  @version $Id: CalloutCashJournal.java 5583 2015-08-05 14:11:58Z xapiens $
 */
public class CalloutCashJournal extends CalloutEngine
{		
	/**
	 *  Cash Journal Line Invoice.
	 *  when Invoice selected
	 *  - set C_Currency, DiscountAnt, Amount, WriteOffAmt
	 *	@param ctx context
	 *	@param WindowNo window no
	 *	@param mTab tab
	 *	@param mField field
	 *	@param value value
	 *	@return null or error message
	 */
	public String bpartner (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value)
	{
		if (isCalloutActive())		//	assuming it is resetting value
			return "";
		if (mTab.getValue("C_BPartner_ID") == null) return "";
		
		setCalloutActive(true); 

		Env.setContext(ctx, WindowNo, "C_BPartner_ID", value.toString());
		
		
		setCalloutActive(false);
		return "";
	}	//	CashJournal_Invoice	
	
	/**
	 *  Cash Journal Line Invoice.
	 *  when Invoice selected
	 *  - set C_Currency, DiscountAnt, Amount, WriteOffAmt
	 *	@param ctx context
	 *	@param WindowNo window no
	 *	@param mTab tab
	 *	@param mField field
	 *	@param value value
	 *	@return null or error message
	 */
	public String cashtype (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value)
	{
		if (isCalloutActive())		//	assuming it is resetting value
			return "";		 		
		if (mTab.getValue("C_Cash_ID") == null)	return "";

		setCalloutActive(true);
		
		int C_ConversionType_ID = 0;
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT COALESCE(cb.c_conversiontype_id,0) from c_cash c LEFT OUTER JOIN c_cashbook cb ON c.c_cashbook_id = cb.c_cashbook_id ");
		sql.append(" WHERE c.c_cash_id = ");
		sql.append(mTab.get_ValueAsString("C_Cash_ID"));
		
		C_ConversionType_ID = DB.getSQLValue(null, sql.toString());

		if (C_ConversionType_ID > 0 )
			mTab.setValue("C_ConversionType_ID", C_ConversionType_ID);
		
		setCalloutActive(false);
		return "";
	}	//	CashJournal_Invoice

	/**
	 *  Cash Journal Line Invoice.
	 *  when Invoice selected
	 *  - set C_Currency, DiscountAnt, Amount, WriteOffAmt
	 *	@param ctx context
	 *	@param WindowNo window no
	 *	@param mTab tab
	 *	@param mField field
	 *	@param value value
	 *	@return null or error message
	 */
	public String invoice (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value)
	{
		if (isCalloutActive())		//	assuming it is resetting value
			return "";
		setCalloutActive(true);

		Integer C_Invoice_ID = (Integer)value;
		if (C_Invoice_ID == null || C_Invoice_ID.intValue() == 0)
		{
			mTab.setValue("C_Currency_ID", null);
			setCalloutActive(false);
			return "";
		}

		//  Date
		Timestamp ts = Env.getContextAsDate(ctx, WindowNo, "DateAcct");     //  from C_Cash
		if (ts == null)
			ts = new Timestamp(System.currentTimeMillis());
		//
		String sql = "SELECT C_BPartner_ID, C_Currency_ID,"		//	1..2
			+ "invoiceOpen(C_Invoice_ID, 0), IsSOTrx, "			//	3..4
			+ "paymentTermDiscount(invoiceOpen(C_Invoice_ID, 0),C_Currency_ID,C_PaymentTerm_ID,DateInvoiced,?),GrandTotal, WithholdingAmt "
			+ "FROM C_Invoice WHERE C_Invoice_ID=?";
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql, null);
			pstmt.setTimestamp(1, ts);
			pstmt.setInt(2, C_Invoice_ID.intValue());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next())
			{
				mTab.setValue("C_Currency_ID", new Integer(rs.getInt(X_C_Invoice.COLUMNNAME_C_Currency_ID)));
				BigDecimal PayAmt = rs.getBigDecimal(3);
				BigDecimal DiscountAmt = rs.getBigDecimal(5);
				boolean isSOTrx = "Y".equals(rs.getString(4));
				BigDecimal GrandTotal = rs.getBigDecimal(X_C_Invoice.COLUMNNAME_GrandTotal);
				BigDecimal WithholdingAmt = rs.getBigDecimal("WithholdingAmt");
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
				if (!isSOTrx)
				{
					PayAmt = PayAmt.negate();
					DiscountAmt = DiscountAmt.negate();
				}
				//
				mTab.setValue("CashType", REF_C_CashTrxType.Invoice);
				mTab.setValue(X_C_CashLine.COLUMNNAME_C_BPartner_ID, new Integer(rs.getInt(1)));
				mTab.setValue("Amount", PayAmt.subtract(DiscountAmt));
				mTab.setValue("DiscountAmt", DiscountAmt);
				mTab.setValue("WriteOffAmt", Env.ZERO);
				mTab.setValue(X_C_CashLine.COLUMNNAME_WithholdingAmt, WithholdingAmt);
				Env.setContext(ctx, WindowNo, "InvTotalAmt", PayAmt.toString());
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, "invoice", e);
			setCalloutActive(false);
			return e.getLocalizedMessage();
		}
		setCalloutActive(false);
		return "";
	}	//	CashJournal_Invoice


	/**
	 *  Cash Journal Line Charge.
	 *  when Charge selected
	 *  - set C_Currency, DiscountAnt, Amount, WriteOffAmt
	 *	@param ctx context
	 *	@param WindowNo window no
	 *	@param mTab tab
	 *	@param mField field
	 *	@param value value
	 *	@return null or error message
	 */
	public String charge (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value)
	{
		if (isCalloutActive())		//	assuming it is resetting value
			return "";
		setCalloutActive(true);

		Integer C_Charge_ID = (Integer)value;
		if (C_Charge_ID == null || C_Charge_ID.intValue() == 0)
		{
			mTab.setValue("C_Charge_ID", null);
			setCalloutActive(false);
			return "";
		}
		MCharge charge = new MCharge(ctx, (Integer)mTab.getValue("C_Charge_ID"), null);

		if (charge.getC_Currency_ID() != 0)
			mTab.setValue("C_Currency_ID", charge.getC_Currency_ID());
		
		if (charge.getC_BPartner_ID() != 0)
			mTab.setValue("C_BPartner_ID", charge.getC_BPartner_ID());

		setCalloutActive(false);
		return "";
		
	}
	
	/**
	 *  Cash Journal Line BOE.
	 *  when BOE selected
	 *  - set C_Currency, DiscountAnt, Amount, WriteOffAmt
	 *	@param ctx context
	 *	@param WindowNo window no
	 *	@param mTab tab
	 *	@param mField field
	 *	@param value value
	 *	@return null or error message
	 */
	public String boe (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value)
	{
		if (isCalloutActive())		//	assuming it is resetting value
			return "";
		setCalloutActive(true);

		Integer C_BOE_ID = (Integer)value;
		if (C_BOE_ID == null || C_BOE_ID.intValue() == 0)
		{
			mTab.setValue("C_BOE_ID", null);
			setCalloutActive(false);
			return "";
		}

		//  Date
		Timestamp ts = Env.getContextAsDate(ctx, WindowNo, "DateAcct");     //  from C_Cash
		if (ts == null)
			ts = new Timestamp(System.currentTimeMillis());
		//
		String sql = "SELECT C_BPartner_ID, C_Currency_ID,"		//	1..2
			+ "BOEOpen(C_BOE_ID), IsSOTrx "			//	3..4
			+ "FROM C_BOE WHERE C_BOE_ID=?";
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql, null);
			pstmt.setInt(1, C_BOE_ID.intValue());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next())
			{
				mTab.setValue("C_Currency_ID", new Integer(rs.getInt(2)));
				BigDecimal PayAmt = rs.getBigDecimal(3);
				boolean isSOTrx = "Y".equals(rs.getString(4));
				if (!isSOTrx)
				{
					PayAmt = PayAmt.negate();
				}
				//
				mTab.setValue("CashType", REF_C_CashTrxType.BillOfExchange);
				mTab.setValue("C_BPartner_ID", new Integer(rs.getInt(1)));
				mTab.setValue("Amount", PayAmt);
				mTab.setValue("WriteOffAmt", Env.ZERO);
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, "boe", e);
			setCalloutActive(false);
			return e.getLocalizedMessage();
		}
		setCalloutActive(false);
		return "";
	}	//	CashJournal_BOE

	
	
	/**
	 *  Cash Journal Line Invoice Amounts.
	 *  when DiscountAnt, Amount, WriteOffAmt change
	 *  making sure that add up to InvTotalAmt (created by CashJournal_Invoice)
	 *	@param ctx context
	 *	@param WindowNo window no
	 *	@param mTab tab
	 *	@param mField field
	 *	@param value value
	 *	@return null or error message
	 */
	public String amounts (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value)
	{
		//  Needs to be Invoice
		//if (isCalloutActive() || !"I".equals(mTab.getValue("CashType")))
		if (isCalloutActive() || ( ! REF_C_CashTrxType.Invoice.equals(mTab.getValue("CashType")) && !REF_C_CashTrxType.BillOfExchange.equals(mTab.getValue("CashType")) ))
			return "";
		
		int C_BOE_ID = Env.getContextAsInt(ctx, WindowNo, "C_BOE_ID");
		//	Changed Column
		String colName = mField.getColumnName();
		
		BigDecimal RenewedAmt = Env.ZERO;
		//
		if (colName.equals("RenewedAmt"))
		{
			RenewedAmt = (BigDecimal) value;
			if (RenewedAmt == null)
				RenewedAmt = Env.ZERO;			
			if (RenewedAmt.compareTo(Env.ZERO) != 0)
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
		
		//  Check, if InvTotalAmt exists
		boolean IsPartialPayment = (Boolean)mTab.getValue("IsPartialPayment");
		
		BigDecimal PayAmt = (BigDecimal)mTab.getValue("Amount");
		BigDecimal DiscountAmt = (BigDecimal)mTab.getValue("DiscountAmt");
		BigDecimal WriteOffAmt = (BigDecimal)mTab.getValue("WriteOffAmt");
		
		BigDecimal InvTotalAmt = Env.ZERO;
		boolean isSOTrx = false; 
		int C_Invoice_ID = Env.getContextAsInt(ctx, WindowNo, "C_Invoice_ID");
		if (C_Invoice_ID > 0)
		{
			MInvoice invoice = MInvoice.get(ctx, C_Invoice_ID);
			InvTotalAmt = invoice.getOpenAmt();
			isSOTrx = invoice.isSOTrx();
			if (!isSOTrx)
				InvTotalAmt = InvTotalAmt.negate();			
	
			setCalloutActive(true);
	
			log.fine(colName + " - Invoice=" + InvTotalAmt
				+ " - Amount=" + PayAmt + ", Discount=" + DiscountAmt + ", WriteOff=" + WriteOffAmt);
		}
		else if ( C_BOE_ID > 0 )
		{
			MBOE boe = MBOE.get(ctx, C_BOE_ID);
			InvTotalAmt = boe.getOpenAmt();
			isSOTrx = boe.isSOTrx();
			if (!isSOTrx)
				InvTotalAmt = InvTotalAmt.negate();			
	
			setCalloutActive(true);
	
			log.fine(colName + " - BOE=" + InvTotalAmt
				+ " - Amount=" + PayAmt + ", Discount=" + DiscountAmt + ", WriteOff=" + WriteOffAmt);			
		}

		/* sergioaguayo: support for partial payments */
		if (IsPartialPayment) {
			if (WriteOffAmt.signum()!=0) mTab.setValue("WriteOffAmt", BigDecimal.ZERO);
			if (!isSOTrx) {
				if (PayAmt.add(DiscountAmt).compareTo(InvTotalAmt) < 0) {
					PayAmt = InvTotalAmt.add(DiscountAmt);
					PayAmt = PayAmt.add(RenewedAmt);
					mTab.setValue("Amount", PayAmt);
				}				
			}
			else {
				if (PayAmt.add(DiscountAmt).compareTo(InvTotalAmt) > 0) {
					PayAmt = InvTotalAmt.subtract(DiscountAmt);
					PayAmt = PayAmt.subtract(RenewedAmt);
					mTab.setValue("Amount", PayAmt);
				}
			}
		}
		else {
			//  Amount - calculate write off
			if (colName.equals("Amount"))
			{
				BigDecimal diff = InvTotalAmt.abs().subtract(PayAmt.abs()).subtract(DiscountAmt.abs());
				if (diff.compareTo(Env.ZERO) < 0 )
				{
					mTab.setValue("C_Invoice_ID", null);
					mTab.setValue("Amount", Env.ZERO);					
					setCalloutActive(false);
					return "@PayExceed@";				
				}
			}
			else    //  calculate PayAmt
			{
				PayAmt = InvTotalAmt.subtract(DiscountAmt).subtract(WriteOffAmt);
				PayAmt = PayAmt.subtract(RenewedAmt);
				mTab.setValue("Amount", PayAmt);				
			}
		}
		setCalloutActive(false);
		return "";
	}	//	amounts

	/**
	 *  Cash Journal Payment amount.
	 *  when C_Payment_ID changes
	 *  making sure that add up to InvTotalAmt (created by CashJournal_Invoice)
	 *	@param ctx context
	 *	@param WindowNo window no
	 *	@param mTab tab
	 *	@param mField field
	 *	@param value value
	 *	@return null or error message
	 */
	public String payment (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value)
	{
		if (isCalloutActive())
			return "";
		if (mTab.getValue("C_Payment_ID") == null) return "";

		MPayment payment = new MPayment(ctx, (Integer)mTab.getValue("C_Payment_ID"), null);

		setCalloutActive(true);

		mTab.setValue("C_BPartner_ID", payment.getC_BPartner_ID());
		mTab.setValue("BeginningBalance", payment.getPayAmt());

		setCalloutActive(false);
		return "";
	}
}	//	CalloutCashJournal
