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
package org.compiere.acct;

import java.math.*;
import java.sql.*;
import java.util.*;
import java.util.logging.*;

import org.compiere.model.MAccount;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MCharge;
import org.compiere.model.MGLBookPeriod;
import org.compiere.model.MInvoice;
import org.compiere.model.MInvoiceLine;
import org.compiere.model.MPeriod;
import org.compiere.model.MRetention;
import org.compiere.model.MYear;
import org.compiere.model.persistence.X_C_Perception;
import org.compiere.process.DocAction;
import org.compiere.util.*;

/**
 *  Perception documents
 *  <pre>
 *  Table:              C_Perception
 *  Document Types:     CMA
 *  </pre>
 *  @author Xapiens
 *  @version  1.0
 */

//ALTER TABLE xendra.c_perception ADD COLUMN processing character(1);
//ALTER TABLE xendra.c_perception ADD COLUMN processed character(1);
//ALTER TABLE xendra.c_perception ALTER COLUMN processed SET DEFAULT 'N'::bpchar;
//ALTER TABLE xendra.c_perception ADD COLUMN posted character(1);
//ALTER TABLE xendra.c_perception ALTER COLUMN posted SET DEFAULT 'N'::bpchar;
//ALTER TABLE xendra.c_perception ADD COLUMN dateacct timestamp without time zone;

public class Doc_Perception extends Doc
{
	/**
	 *  Constructor
	 * 	@param ass accounting schemata
	 * 	@param rs record
	 * 	@param trxName trx
	 */
	protected Doc_Perception (MAcctSchema[] ass, ResultSet rs, String trxName)
	{
		super (ass, X_C_Perception.class, rs, null, trxName);
	}   //  Doc_Perception

	/**	Tolearance G&L				*/
	private static final BigDecimal	TOLERANCE = new BigDecimal (0.02);
	/** Facts						*/
	private ArrayList<Fact>		m_facts = null;


	/**
	 *  Load Specific Document Details
	 *  @return error message or null
	 */
	protected String loadDocumentDetails ()
	{
		X_C_Perception perception = (X_C_Perception) getPO();
		setDateAcct(perception.getDateAcct());
		return null;		
	}   //  loadDocumentDetails

	
	/**************************************************************************
	 *  Get Source Currency Balance - subtracts line and tax amounts from total - no rounding
	 *  @return positive amount, if total invoice is bigger than lines
	 */
	public BigDecimal getBalance()
	{
		BigDecimal retValue = Env.ZERO;
		return retValue;
	}   //  getBalance

	/**
	 *  Create Facts (the accounting logic) for
	 *  CMA.
	 *  <pre>
	 *  AR_Invoice_Payment
	 *      UnAllocatedCash DR
	 *      or C_Prepayment
	 *      DiscountExp     DR
	 *      WriteOff        DR
	 *      Receivables             CR
	 *  AR_Invoice_Cash
	 *      CashTransfer    DR
	 *      DiscountExp     DR
	 *      WriteOff        DR
	 *      Receivables             CR
	 * 
	 *  AP_Invoice_Payment
	 *      Liability       DR
	 *      DiscountRev             CR
	 *      WriteOff                CR
	 *      PaymentSelect           CR
	 *      or V_Prepayment
	 *  AP_Invoice_Cash
	 *      Liability       DR
	 *      DiscountRev             CR
	 *      WriteOff                CR
	 *      CashTransfer            CR
	 *  CashBankTransfer
	 *      -
	 *  ==============================
	 *  Realized Gain & Loss
	 * 		AR/AP			DR		CR
	 * 		Realized G/L	DR		CR
	 * 
	 *
	 *  </pre>
	 *  Tax needs to be corrected for discount & write-off;
	 *  Currency gain & loss is realized here.
	 *  @param as accounting schema
	 *  @return Fact
	 */
	public ArrayList<Fact> createFacts (MAcctSchema as)
	{
		m_facts = new ArrayList<Fact>();
		Fact fact = new Fact(this, as, Fact.POST_Actual);
		X_C_Perception perception = (X_C_Perception)getPO();
		setDateAcct(perception.getDateAcct());	//	Overwritten on Line Level
		
		MInvoice invoice  = new MInvoice(Env.getCtx(),perception.getC_Invoice_ID(), getTrxName() );
		String invoiceref = "";
		if (invoice.getSerial()!= null && invoice.getSerial().length() > 0 )
			invoiceref = invoice.getSerial().concat("-");
		if (invoice.getDocumentNo() != null)
			invoiceref = invoiceref.concat(invoice.getDocumentNo());		
		setAmount(AMTTYPE_Gross, invoice.getGrandTotal());
		setC_BPartner_ID(invoice.getC_BPartner_ID());
		setC_Currency_ID (invoice.getC_Currency_ID());
		MInvoiceLine[] lines = invoice.getLines();
		if ( lines.length > 0 )
		{
			for (int x=0; x < lines.length; x++)
			{
				MInvoiceLine line = lines[x];
				if (line.getC_Charge_ID() > 0)
				{
					MAccount acct = null;
					acct = MCharge.getAccount(line.getC_Charge_ID(), as, perception.getGrandTotal());
					FactLine fl = fact.createLine(null, acct,
							getC_Currency_ID(), null, perception.getGrandTotal());
					
					if (fl != null && perception.getAD_Org_ID() != 0)
						fl.setAD_Org_ID(perception.getAD_Org_ID());
					if (fl != null)
						fl.setInvoiceDocumentNo(invoiceref);
					
					fl = fact.createLine(null, MRetention.getAccount(as, DocAction.STATUS_Apply),
							getC_Currency_ID(), perception.getGrandTotal(), null);

					if (fl != null && perception.getAD_Org_ID() != 0)
						fl.setAD_Org_ID(perception.getAD_Org_ID());
					if (fl != null)
						fl.setInvoiceDocumentNo(invoiceref);					
				}
			}
		}		
		//	reset line info
		setC_BPartner_ID(0);
		//
		m_facts.add(fact);
		return m_facts;
	}   //  createFact


	public void createFact_ID() {
		X_C_Perception perception = (X_C_Perception) getPO();
		/* Fact ID */
		if (getFact_ID().length() == 0 || getFact_ID().compareTo("NSD") == 0) {
			setFact_ID (
					MGLBookPeriod.getID(perception.getAD_Org_ID(),
										perception.getAD_Client_ID(),
										perception.Table_ID, 
										0, 
										isSOTrx()==true ? "Y":"N", 
										perception.getDateAcct())
					);		
			setGL_Book_ID (
					MGLBookPeriod.getGLBookID(perception.getAD_Org_ID(),
										perception.getAD_Client_ID(),
										perception.Table_ID, 
										0, 
										isSOTrx()==true ? "Y":"N", 
										perception.getDateAcct())
					);					
		}
		else
		{
			MPeriod period = MPeriod.get (Env.getCtx(), perception.getDateAcct(), perception.getAD_Org_ID() , perception.getAD_Client_ID());
			MYear year = new MYear(Env.getCtx(), period.getC_Year_ID(),getTrxName());
			Calendar cal = Calendar.getInstance();
			cal.setTime(perception.getDateAcct());
			int pos = -1;
			if (getFact_ID().indexOf(year.getFiscalYear()) != -1)
			{
				pos = getFact_ID().indexOf(year.getFiscalYear()) + 4;
				if ( getFact_ID().substring(pos, pos + 1).equals("-"))
				{
					pos = pos+1;
				}
			}
			int month = pos != -1 ? Integer.parseInt(getFact_ID().substring(pos, pos + 2)) : 0;
			if (pos == -1) // año fiscal no encontrado, otro año, regenerar.
			{
				setFact_ID (
						MGLBookPeriod.getID(perception.getAD_Org_ID(),
											perception.getAD_Client_ID(),
											perception.Table_ID, 
											0, 
											isSOTrx()==true ? "Y":"N", 
											perception.getDateAcct())
						);
				setGL_Book_ID (
						MGLBookPeriod.getGLBookID(perception.getAD_Org_ID(),
											perception.getAD_Client_ID(),
											perception.Table_ID, 
											0, 
											isSOTrx()==true ? "Y":"N", 
											perception.getDateAcct())
						);						
				return;
			}
			else if (month != cal.get(Calendar.MONTH) + 1) // mismo año , diferente mes, regenerar.
			{
				setFact_ID (
						MGLBookPeriod.getID(perception.getAD_Org_ID(),
											perception.getAD_Client_ID(),
											perception.Table_ID, 
											0, 
											isSOTrx()==true ? "Y":"N", 
											perception.getDateAcct())
						);
				setGL_Book_ID (
						MGLBookPeriod.getGLBookID(perception.getAD_Org_ID(),
											perception.getAD_Client_ID(),
											perception.Table_ID, 
											0, 
											isSOTrx()==true ? "Y":"N", 
											perception.getDateAcct())
						);						
			}
		}
		
	}
}   //  Doc_Perception