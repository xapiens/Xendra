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
import org.compiere.model.MBOE;
import org.compiere.model.MBOEConfirm;
import org.compiere.model.MBOEConfirmLine;
import org.compiere.model.MBankAccount;
import org.compiere.model.MCharge;
import org.compiere.model.MConversionRate;
import org.compiere.model.MDocType;
import org.compiere.model.MGLBookPeriod;
import org.compiere.model.MPayment;
import org.compiere.model.MPaymentCharge;
import org.compiere.model.MPaymentLine;
import org.compiere.model.MPeriod;
import org.compiere.model.MYear;
import org.compiere.model.reference.REF_C_BOEConfirmType;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;
import org.compiere.util.*;

/**
 *  Post Invoice Documents.
 *  <pre>
 *  Table:              C_Payment (335)
 *  Document Types      ARP, APP
 *  </pre>
 *  @author Jorg Janke
 */
public class Doc_Payment extends Doc
{
	/**
	 *  Constructor
	 * 	@param ass accounting schemata
	 * 	@param rs record
	 * 	@param trxName trx
	 */
	protected Doc_Payment (MAcctSchema[] ass, ResultSet rs, String trxName)
	{
		super (ass, MPayment.class, rs, null, trxName);
	}	//	Doc_Payment
	
	/**	Tender Type				*/
	private String		m_TenderType = null;
	/** Prepayment				*/
	private boolean		m_Prepayment = false;
	/** Bank Account			*/
	private int			m_C_BankAccount_ID = 0;
	/** BOE Confirm  (Planilla de letras ) */ 
	private int  	    m_C_BOEConfirm_ID = 0;
	/** Invoice **/
	private int 		m_C_Invoice_ID = 0;
	/** Payment					*/
	//private MPayment		pay = null;

	/**
	 *  Load Specific Document Details
	 *  @return error message or null
	 */
	protected String loadDocumentDetails ()
	{
		MPayment pay = (MPayment)getPO();
		setDateDoc(pay.getDateTrx());
		m_TenderType = pay.getTenderType();
		m_Prepayment = pay.isPrepayment();
		m_C_Invoice_ID = pay.getC_Invoice_ID();
		m_C_BOEConfirm_ID = pay.getC_BOEConfirm_ID();
		m_C_BankAccount_ID = pay.getC_BankAccount_ID();
		//	Amount
		setAmount(Doc.AMTTYPE_Gross, pay.getPayAmt());
		//
		return null;
	}   //  loadDocumentDetails

	private int getC_BOEConfirm_ID()
	{
		return m_C_BOEConfirm_ID;
	}
	
	private int getC_Invoice_ID()
	{
		return m_C_Invoice_ID;
	}
	/**************************************************************************
	 *  Get Source Currency Balance - always zero
	 *  @return Zero (always balanced)
	 */
	public BigDecimal getBalance()
	{
		BigDecimal retValue = Env.ZERO;
	//	log.config( toString() + " Balance=" + retValue);
		return retValue;
	}   //  getBalance

	/**
	 *  Create Facts (the accounting logic) for
	 *  ARP, APP.
	 *  <pre>
	 *  ARP
	 *      BankInTransit   DR
	 *      UnallocatedCash         CR
	 *      or Charge/C_Prepayment
	 *  APP
	 *      PaymentSelect   DR
	 *      or Charge/V_Prepayment
	 *      BankInTransit           CR
	 *  CashBankTransfer
	 *      -
	 *  </pre>
	 *  @param as accounting schema
	 *  @return Fact
	 */
	public ArrayList<Fact> createFacts (MAcctSchema as)
	{
		MPayment pay = (MPayment) getPO();
		//  create Fact Header
		Fact fact = new Fact(this, as, Fact.POST_Actual);
		//	Cash Transfer
		if ("X".equals(m_TenderType))
		{
			ArrayList<Fact> facts = new ArrayList<Fact>();
			facts.add(fact);
			return facts;
		}

		int AD_Org_ID = getBank_Org_ID();		//	Bank Account Org
		
		MPaymentLine[] pPaymentLine = MPaymentLine.get(pay);
		if (pPaymentLine.length > 0)
		{
			p_Error = "Al existir lineas en el payment no debe ser contabilizado pues existen allocations por cada linea";
			return null;
		}
		// ARR - Ingreso
		else if (getDocumentType().equals(REF_C_DocTypeDocBaseType.ARReceipt))
		{
			
			if (getC_Charge_ID() != 0) {
				//	Asset
				
				FactLine fl = fact.createLine(null, getAccount(Doc.ACCTTYPE_BankInTransit, as),
						getC_Currency_ID(), getAmount(), null);
				if (fl != null && AD_Org_ID != 0)
					fl.setAD_Org_ID(AD_Org_ID);
				//	
				MAccount acct = null;
					acct = MCharge.getAccount(getC_Charge_ID(), as, getAmount());									
				fl = fact.createLine(null, acct,
						getC_Currency_ID(), null, getAmount());
				if (fl != null && AD_Org_ID != 0
						&& getC_Charge_ID() == 0)		//	don't overwrite charge
					fl.setAD_Org_ID(AD_Org_ID);
				if (fl != null)
				{
					if (acct.getC_BPartner_ID() > 0)
						fl.setC_BPartner_ID(acct.getC_BPartner_ID());
					fl.setInvoiceDocumentNo(pay.getDocumentNo());
					fl.setC_DocType_ID(pay.getC_DocType_ID());
				}
			}
			else if  (getC_BOEConfirm_ID() != 0) {
				MBOEConfirm boeconfirm = new MBOEConfirm(Env.getCtx(), getC_BOEConfirm_ID(), null);
				MBOEConfirmLine[] lines = boeconfirm.getLines(true,"");
				MBOE boe = null;
				if ( lines.length > 0 )
				{
					for (MBOEConfirmLine line : lines)
					{
						MDocType doc = MDocType.get(Env.getCtx(), line.getC_DocType_ID());
						if (line.getC_BOE_ID() > 0)
						{					
							MBankAccount ba = MBankAccount.get(getCtx(), m_C_BankAccount_ID);
							boe = new MBOE(Env.getCtx(), line.getC_BOE_ID(), null);
							FactLine fl = fact.createLine(null, getAccount(Doc.ACCTYPE_BOEConfirm, as),
									getC_Currency_ID(), null, line.getAmount());
							if (fl != null &&  boe != null )
							{
								fl.setAD_Org_ID(AD_Org_ID);
								fl.setInvoiceDocumentNo(boe.getDocumentNo());
								fl.setC_BPartner_ID(boe.getC_BPartner_ID());
								fl.setC_DocType_ID(boe.getC_DocType_ID());
							}
							
						}
						else if (line.getBOEConfirmType().equals(REF_C_BOEConfirmType.Payment))
						{
							FactLine fl = null;
							if (line.getC_Charge_ID() > 0)
								fl = fact.createLine(null, MCharge.getAccount(line.getC_Charge_ID(), as, line.getAmount()),
										getC_Currency_ID(), line.getAmount(), null);
							else								
							    fl = fact.createLine(null, getAccount(Doc.ACCTTYPE_BankInTransit, as),
									getC_Currency_ID(), line.getAmount(), null);
							if (fl != null && AD_Org_ID != 0)
								fl.setAD_Org_ID(AD_Org_ID);
							if (fl != null)
							{	
								fl.setInvoiceDocumentNo(boeconfirm.getDocumentNo());
								fl.setC_DocType_ID(pay.getC_DocType_ID());
							}
						}
						else if (line.getC_Charge_ID() > 0)
						{
							FactLine fl = null;
							MAccount acct = MCharge.getAccount(line.getC_Charge_ID(), as, line.getAmount());
							if ( doc.isSOTrx() )
								fl = fact.createLine(null, acct ,
										getC_Currency_ID(), null, line.getAmount());
							else
								fl = fact.createLine(null, acct ,
										getC_Currency_ID(), null, line.getAmount());
							if (fl != null)
							{
								fl.setInvoiceDocumentNo(pay.getDocumentNo());
								fl.setC_DocType_ID(pay.getC_DocType_ID());
							}
						}
							
					}
					
				}
				
			}
			else if (getC_BOEConfirm_ID() == 0 && getC_Invoice_ID() == 0 && getC_Charge_ID() == 0)
			{
				MPaymentCharge[] pAllocsCharge = MPaymentCharge.get(pay);
				if (pAllocsCharge.length > 0)
				{
					FactLine fl = fact.createLine(null, getAccount(Doc.ACCTTYPE_BankInTransit, as),
							getC_Currency_ID(), getAmount(), null);
					if (fl != null && AD_Org_ID != 0)
						fl.setAD_Org_ID(AD_Org_ID);
					if (fl != null)
					{
						fl.setInvoiceDocumentNo(pay.getDocumentNo());
						fl.setC_DocType_ID(pay.getC_DocType_ID());
					}
					
					for (MPaymentCharge pAlloc : pAllocsCharge)
					{
						MAccount acct = null;
						acct = MCharge.getAccount(pAlloc.getC_Charge_ID(), as, pAlloc.getChargeAmt());
						fl = fact.Search(acct, "", pay.getDocumentNo());
						if (fl == null)
						{
							fl = fact.createLine(null, acct,
									getC_Currency_ID(), null, pAlloc.getChargeAmt());
							if (fl != null && AD_Org_ID != 0
									&& getC_Charge_ID() == 0)		//	don't overwrite charge
								fl.setAD_Org_ID(AD_Org_ID);
							if (fl != null)
							{
								fl.setInvoiceDocumentNo(pay.getDocumentNo());
								if (acct.getC_BPartner_ID() > 0)
									fl.setC_BPartner_ID(acct.getC_BPartner_ID());
								fl.setC_DocType_ID(pay.getC_DocType_ID());
							}
						}
						else
						{
							BigDecimal AmtAcctDr = fl.getAmtSourceDr();
							BigDecimal AmtAcctCr = fl.getAmtSourceCr().add(pAlloc.getChargeAmt());						
							if (!fl.setAmtSource(getC_Currency_ID(), AmtAcctDr, AmtAcctCr))
							{
								return null;
							}							
							fl.convert();									
						}
					}
				}
			}
		}
		//  APP - salida
		else if (getDocumentType().equals(REF_C_DocTypeDocBaseType.APPayment))
		{
			if (getC_Charge_ID() != 0) {
				MAccount acct = null;
				acct = MCharge.getAccount(getC_Charge_ID(), as, getAmount());
				/*else if (m_Prepayment)
					acct = getAccount(Doc.ACCTTYPE_V_Prepayment, as);
				else
					acct = getAccount(Doc.ACCTTYPE_PaymentSelect, as);*/
				FactLine fl = fact.createLine(null, acct,
						getC_Currency_ID(), getAmount(), null);
				if (fl != null && AD_Org_ID != 0
						&& getC_Charge_ID() == 0)		//	don't overwrite charge
					fl.setAD_Org_ID(AD_Org_ID);
				if (fl != null)
				{
					fl.setInvoiceDocumentNo(pay.getDocumentNo());
					fl.setC_DocType_ID(pay.getC_DocType_ID());
				}
				
				//	Asset
				fl = fact.createLine(null, getAccount(Doc.ACCTTYPE_BankInTransit, as),
						getC_Currency_ID(), null, getAmount());
				if (fl != null && AD_Org_ID != 0)
					fl.setAD_Org_ID(AD_Org_ID);
				if (fl != null)
				{
					fl.setInvoiceDocumentNo(pay.getDocumentNo());
					fl.setC_DocType_ID(pay.getC_DocType_ID());
				}
			}
			else if (getC_BOEConfirm_ID() == 0 && getC_Charge_ID() == 0 && getC_Invoice_ID() == 0)
			{
								
				MPaymentCharge[] pAllocsCharge = MPaymentCharge.get(pay);
				if (pAllocsCharge.length > 0)
				{
					FactLine fl = fact.createLine(null, getAccount(Doc.ACCTTYPE_BankInTransit, as),
							getC_Currency_ID(), null, getAmount());
					if (fl != null && AD_Org_ID != 0)
						fl.setAD_Org_ID(AD_Org_ID);								
					for (MPaymentCharge pAlloc : pAllocsCharge)
					{
						//	
						MAccount acct = null;
						acct = MCharge.getAccount(pAlloc.getC_Charge_ID(), as, pAlloc.getChargeAmt());
						fl = fact.Search(acct, "", pay.getDocumentNo());
						if (fl == null)
						{
							fl = fact.createLine(null, acct,
									getC_Currency_ID(), pAlloc.getChargeAmt(), null);
							if (fl != null && AD_Org_ID != 0
									&& getC_Charge_ID() == 0)		//	don't overwrite charge
								fl.setAD_Org_ID(AD_Org_ID);
								fl.setInvoiceDocumentNo(pay.getDocumentNo());
								fl.setC_DocType_ID(pay.getC_DocType_ID());
								if (acct.getC_BPartner_ID() > 0)
									fl.setC_BPartner_ID(acct.getC_BPartner_ID());
								else
									fl.setC_BPartner_ID(pAlloc.getC_BPartner_ID());
						}
						else
						{
							BigDecimal AmtAcctDr = fl.getAmtSourceDr().add(pAlloc.getChargeAmt());
							BigDecimal AmtAcctCr = fl.getAmtSourceCr();				
							if (!fl.setAmtSource(getC_Currency_ID(), AmtAcctDr, AmtAcctCr))
							{
								return null;
							}
							fl.convert();																																										
						}					
					}
				}
			}					
		}
		// BAT - 
		else if (getDocumentType().equals(REF_C_DocTypeDocBaseType.BankAccountTransfer))
		{
			if (pay.isTransferSource()) {
				FactLine fl = fact.createLine(null, getAccount(Doc.ACCTTYPE_BankInTransit, as),
						getC_Currency_ID(), null, getAmount());
				if (fl != null && AD_Org_ID != 0)
					fl.setAD_Org_ID(AD_Org_ID);
				
				// Hmm , hay que contabilizar usando el monto y el tipo de cambio para el currency del
				// destino y no del origen.
				// Obtenemos los datos de la cuenta bancaria destino
				MBankAccount bankaccount = MBankAccount.get(getCtx(), pay.getDest_BankAccount_ID());
				// Si es null , error de contabilizacion
				if (bankaccount == null) {
					p_Error = "Bankaccount with id = "+getDest_BankAccount_ID()+" doesnt exist";
					log.log(Level.SEVERE, p_Error);
					return null;
				}
				
				// Obtenemos los datos para el monto destino , de la misma exacta manera que se hizo en payment.
				BigDecimal destAmount = MConversionRate.convert(getCtx(), pay.getPayAmt(), pay.getC_Currency_ID(), 
						bankaccount.getC_Currency_ID(), pay.getDateAcct(), pay.getC_ConversionType_ID(), pay.getAD_Client_ID(), pay.getAD_Org_ID());
				
				// Contabilizamos
				if (destAmount != null) {
					fl = fact.createLine(null, getAccount(Doc.ACCTTYPE_BankInTransitDest, as),
							bankaccount.getC_Currency_ID(), destAmount, null);
					if (fl != null && AD_Org_ID != 0)
						fl.setAD_Org_ID(AD_Org_ID);
					if (fl != null)
					{
						fl.setInvoiceDocumentNo(pay.getDocumentNo());
						fl.setC_DocType_ID(pay.getC_DocType_ID());
					}
				} else {
					p_Error = "Currency rate from   "+pay.getC_Currency_ID()+" to "+bankaccount.getC_Currency_ID()+ " for date "+pay.getDateAcct() +" doesnt exist";					
					log.log(Level.SEVERE, p_Error);
				}
			}
			/* If destination transfer, don't make any facts, as the source does them. */
		}
		else
		{
			p_Error = "DocumentType unknown: " + getDocumentType();
			log.log(Level.SEVERE, p_Error);
			fact = null;
		}
		//
		ArrayList<Fact> facts = new ArrayList<Fact>();
		facts.add(fact);
		return facts;
	}   //  createFact

	/**
	 * 	Get AD_Org_ID from Bank Account
	 * 	@return AD_Org_ID or 0
	 */
	private int getBank_Org_ID ()
	{
		if (m_C_BankAccount_ID == 0)
			return 0;
		//
		MBankAccount ba = MBankAccount.get(getCtx(), m_C_BankAccount_ID);
		return ba.getAD_Org_ID();
	}	//	getBank_Org_ID

	public void createFact_ID() {
		MPayment pay = (MPayment) getPO();
		if ( pay.getC_Charge_ID() <= 0 && pay.getC_BOEConfirm_ID() <= 0 && !pay.isTransfer())
		{
			return;
		}
		if (getFact_ID().length() == 0 || getFact_ID().compareTo("NSD") == 0)
		{
			setFact_ID (
					MGLBookPeriod.getID(pay.getAD_Org_ID(),
										pay.getAD_Client_ID(),
										pay.Table_ID, 
										pay.getC_DocType_ID(), 
										"", 
										pay.getDateAcct())
					);
			setGL_Book_ID (
					MGLBookPeriod.getGLBookID(pay.getAD_Org_ID(),
										pay.getAD_Client_ID(),
										pay.Table_ID, 
										pay.getC_DocType_ID(), 
										"", 
										pay.getDateAcct())
					);				
		}
		else
		{
			MPeriod period = MPeriod.get (Env.getCtx(), pay.getDateAcct(), pay.getAD_Org_ID() , pay.getAD_Client_ID());
			MYear year = new MYear(Env.getCtx(), period.getC_Year_ID(),getTrxName());
			Calendar cal = Calendar.getInstance();
			cal.setTime(pay.getDateAcct());		
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
						MGLBookPeriod.getID(pay.getAD_Org_ID(),
											pay.getAD_Client_ID(),
											pay.Table_ID, 
											pay.getC_DocType_ID(), 
											"", 
											pay.getDateAcct())
						);
				setGL_Book_ID (
						MGLBookPeriod.getGLBookID(pay.getAD_Org_ID(),
											pay.getAD_Client_ID(),
											pay.Table_ID, 
											pay.getC_DocType_ID(), 
											"", 
											pay.getDateAcct())
						);					
				return;
			}
			else if (month != cal.get(Calendar.MONTH) + 1) // mismo año , diferente mes, regenerar.
			{
				setFact_ID (
						MGLBookPeriod.getID(pay.getAD_Org_ID(),
											pay.getAD_Client_ID(),
											pay.Table_ID, 
											pay.getC_DocType_ID(), 
											"", 
											pay.getDateAcct())
						);
				setGL_Book_ID (
						MGLBookPeriod.getGLBookID(pay.getAD_Org_ID(),
											pay.getAD_Client_ID(),
											pay.Table_ID, 
											pay.getC_DocType_ID(), 
											"", 
											pay.getDateAcct())
						);													
			}
		}			
	}
}   //  Doc_Payment
