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

import java.sql.*;
import java.util.*;
import java.math.*;
import java.util.logging.*;

import org.compiere.model.persistence.X_C_PaymentLine;
import org.compiere.process.DocAction;
import org.compiere.util.*;

/**
 * 	Payment Line Model
 *	
 *  @author xapiens
 *  @version $Id: MPaymentLine.java 508 2007-11-24 23:06:53Z el_man $
 */
public class MPaymentLine extends X_C_PaymentLine
{
	/**
	 * 	Get active Payment Lines of Payment
	 *	@param parent payment
	 *	@return array of allocations
	 */
	public static MPaymentLine[] get (MPayment parent)
	{
		ArrayList<MPaymentLine> list = new ArrayList<MPaymentLine>();
		String sql = "SELECT * FROM C_PaymentLine WHERE C_Payment_ID=? AND IsActive='Y' ORDER BY C_Currency_ID";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, parent.get_TrxName());
			pstmt.setInt (1, parent.getC_Payment_ID());
			ResultSet rs = pstmt.executeQuery ();
			while (rs.next ())
				list.add (new MPaymentLine (parent.getCtx(), rs, parent.get_TrxName()));
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			s_log.log (Level.SEVERE, sql, e);
		}
		try
		{
			if (pstmt != null)
				pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			pstmt = null;
		}
		
		MPaymentLine[] retValue = new MPaymentLine[list.size ()];
		list.toArray (retValue);
		return retValue;
	}	//	get

	/**	Logger	*/
	private static CLogger s_log = CLogger.getCLogger (MPaymentLine.class);
	
	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param C_PaymentLine_ID id
	 *	@param trxName trx
	 */
	public MPaymentLine (Properties ctx, int C_PaymentLine_ID, String trxName)
	{
		super (ctx, C_PaymentLine_ID, trxName);
		if (C_PaymentLine_ID == 0)
		{
		//	setC_Payment_ID (0);	//	Parent
		//	setC_Invoice_ID (0);
			setPayAmt (Env.ZERO);
			setDiscountAmt (Env.ZERO);
			setOverUnderAmt (Env.ZERO);
			setWriteOffAmt (Env.ZERO);
		}	
	}	//	MPaymentLine

	/**	The Invoice				*/
	private MInvoice	m_invoice = null;
	private MPayment m_parent;
	private int m_C_BPartner_ID;
	
	/**
	 * 	Load Cosntructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName trx
	 */
	public MPaymentLine (Properties ctx, ResultSet rs, String trxName)
	{
		super (ctx, rs, trxName);
	}	//	MPaymentLine
	
	/**
	 * 	Set C_Invoice_ID
	 *	@param C_Invoice_ID id
	 */
	public void setC_Invoice_ID (int C_Invoice_ID)
	{
		super.setC_Invoice_ID (C_Invoice_ID);
		m_invoice = null;
	}	//	setC_Invoice_ID
	
	/**
	 * 	Get Invoice
	 *	@return invoice
	 */
	public MInvoice getInvoice()
	{
		if (m_invoice == null && getC_Invoice_ID() != 0)
			m_invoice = new MInvoice(getCtx(), getC_Invoice_ID(), get_TrxName());
		return m_invoice;
	}	//	getInvoice
	
//	/**
//	 * 	Get BPartner of Invoice
//	 *	@return bp
//	 */
//	public int getC_BPartner_ID()
//	{
//		if (m_invoice == null)
//			getInvoice();
//		if (m_invoice == null)
//			return 0;
//		return m_invoice.getC_BPartner_ID();
//	}	//	getC_BPartner_ID
	
	
	/** After Save
	 * 
	 */
	protected boolean afterSave(boolean newRecord, boolean success)
	{
		if (success)
		{
//			MPayment payment = new MPayment (getCtx(), getC_Payment_ID(), get_TrxName());
//			MPaymentLine[] lines = payment.getLines();
//			if (lines.length > 0 )
//			{
//				String sql = "SELECT SUM(currencyConvert(l.payamt + l.discountamt + l.writeoffamt, 0, p.c_currency_id, ?, p.datetrx, ";
//				sql = sql.concat("l.c_conversiontype_id, l.ad_client_id, l.ad_org_id)) "+
//						" FROM C_Paymentline l JOIN C_Payment p ON l.c_payment_id = p.c_payment_id WHERE p.c_payment_id = ?");
//
//				BigDecimal total = DB.getSQLValueBD(null, sql, payment.getC_Currency_ID(), payment.getC_Payment_ID());
//				if (total == null)
//					total = Env.ZERO;
//				if (total.compareTo(Env.ZERO) > 0)
//				{
//					payment.setPayAmt(total);
//					payment.save();
//				}
//			}
		}
		return true;
	}
	
	protected boolean beforeDelete()
	{
		if (getC_Invoice_ID() > 0)
		{
			MInvoice invoice = new MInvoice(Env.getCtx(), this.getC_Invoice_ID(), this.get_TrxName());
			if (invoice.getWithholdingAmt().signum() > 0)
			{				 
				MWithholdingLine line = MWithholdingLine.get(Env.getCtx(), X_C_PaymentLine.Table_ID, this.getC_PaymentLine_ID(), get_TrxName());
				if (line != null)					
				{
					if (line.getParent().getDocStatus().equals(DocAction.STATUS_Completed))
						return false;
					else if (!line.delete(true))
						return false;
				}
			}
		}
		return true;
	}	
	/**
	 * 	Before Save
	 *	@param newRecord new
	 *	@return true
	 */
	protected boolean beforeSave (boolean newRecord)
	{
		MPayment payment = new MPayment (getCtx(), getC_Payment_ID(), get_TrxName());
		if ((newRecord || is_ValueChanged("C_Invoice_ID"))
			&& (payment.getC_Charge_ID() != 0 
				|| payment.getC_Invoice_ID() != 0 
				|| payment.getC_Order_ID() != 0))
		{
			log.saveError("PaymentIsAllocated", "");
			return false;
		}
		
		if (getC_BPartner_ID() == 0)
			setC_BPartner_ID(payment.getC_BPartner_ID());
		//	Org
		if (newRecord || is_ValueChanged("C_Invoice_ID"))
		{
			getInvoice();
			if (m_invoice != null)
				setAD_Org_ID(m_invoice.getAD_Org_ID());
		}
		
		return true;
	}	//	beforeSave
	
	public void setAmount (int C_Currency_ID, BigDecimal payAmt)
	{
		if (C_Currency_ID == 0)
			C_Currency_ID = MClient.get(getCtx()).getC_Currency_ID();
		setC_Currency_ID(C_Currency_ID);
		setPayAmt(payAmt);
	}   //  setAmount
	
	/**
	 * 	Set Defaults from Payment.
	 * 	Called also from copy lines from invoice
	 * 	Does not set Parent !!
	 * 	@param invoice invoice
	 */
	public void setPayment (MPayment payment)
	{
		m_parent = payment;
		m_C_BPartner_ID = payment.getC_BPartner_ID();
		setC_Payment_ID(m_parent.getC_Payment_ID()); 
	}	//	setPayment

	public MPayment getPayment() {
		if (m_parent == null)
		{
			if (getC_Payment_ID() == 0)
				return null;
			m_parent = new MPayment(getCtx(), getC_Payment_ID(), get_TrxName());
			
		}
		return m_parent;
	}

	public String getRefDocumentNo() {
		String DocumentNo = "";
		if (getPayment() != null)
			DocumentNo = getPayment().getDocumentNo();
		if (getC_Invoice_ID() != 0)
		{
				MInvoice InvoicerefInPayment = MInvoice.get(Env.getCtx(), getC_Invoice_ID());
				if (InvoicerefInPayment.get_ID() > 0)
					DocumentNo = InvoicerefInPayment.getDocumentNo();
		}
		else if (getC_BOE_ID() != 0)
		{
				MBOE BOErefInPayment = MBOE.get(Env.getCtx(), getC_BOE_ID());
				if (BOErefInPayment.get_ID() > 0)
					DocumentNo = BOErefInPayment.getDocumentNo();
		}
		return DocumentNo;
	}
	public Integer getRefC_DocType_ID() {
		Integer C_DocType_ID = 0;
		if (getPayment() != null)
				C_DocType_ID = getPayment().getC_DocType_ID();
		if (getC_Invoice_ID() != 0)
		{
				MInvoice InvoicerefInPayment = MInvoice.get(Env.getCtx(), getC_Invoice_ID());
				if (InvoicerefInPayment.get_ID() > 0)
				 	C_DocType_ID = InvoicerefInPayment.getC_DocType_ID();
		}
		else if (getC_BOE_ID() != 0)
		{
				MBOE BOErefInPayment = MBOE.get(Env.getCtx(), getC_BOE_ID());
				if (BOErefInPayment.get_ID() > 0)
					C_DocType_ID = BOErefInPayment.getC_DocType_ID();
		}
		return C_DocType_ID;
	}
	
}	//	MPaymentLine
