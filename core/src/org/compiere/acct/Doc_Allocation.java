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
import java.util.Map.Entry;
import java.util.logging.*;
import java.util.regex.Pattern;

import org.compiere.model.MAccount;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MAllocationHdr;
import org.compiere.model.MAllocationLine;
import org.compiere.model.MBOE;
import org.compiere.model.MBOEConversionRate;
import org.compiere.model.MBOELine;
import org.compiere.model.MBOEStatement;
import org.compiere.model.MBank;
import org.compiere.model.MBankAccount;
import org.compiere.model.MCash;
import org.compiere.model.MCashBook;
import org.compiere.model.MCashLine;
import org.compiere.model.MCharge;
import org.compiere.model.MConversionRate;
import org.compiere.model.MConversionType;
import org.compiere.model.MCurrency;
import org.compiere.model.MDocType;
import org.compiere.model.MFactAcct;
import org.compiere.model.MGLBookPeriod;
import org.compiere.model.MInvoice;
import org.compiere.model.MInvoiceLine;
import org.compiere.model.MJournalLine;
import org.compiere.model.MPayment;
import org.compiere.model.MPaymentLine;
import org.compiere.model.MPeriod;
import org.compiere.model.MRetention;
import org.compiere.model.MTable;
import org.compiere.model.MYear;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_C_BOE;
import org.compiere.model.persistence.X_C_Bank;
import org.compiere.model.persistence.X_C_BankAccount;
import org.compiere.model.persistence.X_C_CashLine;
import org.compiere.model.persistence.X_C_Charge;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.model.persistence.X_C_Payment;
import org.compiere.model.persistence.X_C_PaymentLine;
import org.compiere.model.persistence.X_C_Withholding_Acct;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;
import org.compiere.process.DocAction;
import org.compiere.util.*;
import org.kie.api.KieBase;
import org.kie.api.event.rule.DebugAgendaEventListener;
import org.kie.api.event.rule.DebugRuleRuntimeEventListener;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.xendra.exceptions.ConversionRateException;
import org.xendra.exceptions.XendraException;
import org.xendra.rules.model.SimpleRule;

/**
 *  Post Allocation Documents.
 *  <pre>
 *  Table:              C_AllocationHdr
 *  Document Types:     CMA
 *  </pre>
 *  @author Jorg Janke
 *  	    xapiens - agrupado de asientos para un adecuado analisis contable. 
 *  @version  $Id
 */
public class Doc_Allocation extends Doc
{
	/**
	 *  Constructor
	 * 	@param ass accounting schemata
	 * 	@param rs record
	 * 	@param trxName trx
	 */
	protected Doc_Allocation (MAcctSchema[] ass, ResultSet rs, String trxName)
	{
		super (ass, MAllocationHdr.class, rs, REF_C_DocTypeDocBaseType.PaymentAllocation, trxName);
	}   //  Doc_Allocation

	/**	Tolearance G&L				*/
	private static final BigDecimal	TOLERANCE = new BigDecimal ("0.02");
	/** Facts						*/
	private ArrayList<Fact>		m_facts = null;
	private boolean IsExchange = false;
	private boolean m_IsSOTrx = false;
	private Boolean UnGrouped = false;
	private BigDecimal totalWriteOffAmt = Env.ZERO;
	private BigDecimal WithholdingAmt = Env.ZERO;
	private Fact m_fact;
	private MAcctSchema m_as;
	private DocLine_Allocation m_line;
	private MPayment m_payment = null;
	private MPaymentLine m_paymentline = null;
	private FactLine fl;
	private BigDecimal allocationSource = Env.ZERO;
	private ArrayList<Boolean>  AmtDocAss;
	private ArrayList<Boolean> AmtPayAss;
	private MBOE m_boe;
	private MInvoice m_invoice;
	Boolean IsPurchase = false;
	private KieSession ksession;	
	private HashMap<Integer, String> boagenda = new HashMap();
	private HashMap<Integer, FactHandle> FactHandlers = new HashMap();
	private MBankAccount m_bankaccount;
	private MBank m_bank;
	private Timestamp m_datepay;

	/**
	 *  Load Specific Document Details
	 *  @return error message or null
	 */
	protected String loadDocumentDetails ()
	{
		MAllocationHdr alloc = (MAllocationHdr)getPO();
		//setDateDoc(alloc.getDateAcct());
		setDateDoc(alloc.getDateTrx());
		setDateAcct(alloc.getDateAcct());
		// es una renovacion de letra
		setIsExchange(alloc.isExchange());
		/* Fact ID */
		//setFact_ID(DB.getNextAcctID(getAD_Client_ID(), alloc.getDateAcct(), getTrxName()));
		//	Contained Objects
		p_lines = loadLines(alloc);
		return null;
	}   //  loadDocumentDetails

	private void setIsExchange(boolean exchange) {
		IsExchange = exchange;
	}

	private boolean isExchange() {
		return IsExchange;
	}

	/**
	 *	Load Invoice Line
	 *	@param alloc header
	 *  @return DocLine Array
	 */
	private DocLine[] loadLines(MAllocationHdr alloc)
	{
		ArrayList<DocLine> list = new ArrayList<DocLine>();
		MAllocationLine[] lines = alloc.getLines(false);
		for (MAllocationLine line:lines)
		{
			DocLine_Allocation docLine = new DocLine_Allocation(line, this);
			log.fine(docLine.toString());
			list.add (docLine);
		}
		//	Return Array
		DocLine[] dls = new DocLine[list.size()];
		list.toArray(dls);
		return dls;
	}	//	loadLines


	/**************************************************************************
	 *  Get Source Currency Balance - subtracts line and tax amounts from total - no rounding
	 *  @return positive amount, if total invoice is bigger than lines
	 */
	public BigDecimal getBalance()
	{
		BigDecimal retValue = Env.ZERO;
		return retValue;
	}   //  getBalance

	public void updateRule(PO rule) {		
		if (FactHandlers.containsKey(rule.get_ID()))
		{
			FactHandle fh = FactHandlers.get(rule.get_ID());
			ksession.update(fh, rule);
		}
		else
		{
			FactHandle fh = ksession.insert(rule);
			FactHandlers.put(rule.get_ID(), fh);
		}		
	}
		
	public void updateRule(DocLine_Allocation rule) {		
		if (FactHandlers.containsKey(rule.get_ID()))
		{
			FactHandle fh = FactHandlers.get(rule.get_ID());
			ksession.update(fh, rule);
		}
		else
		{
			FactHandle fh = ksession.insert(rule);
			FactHandlers.put(rule.get_ID(), fh);
		}		
	}
	
	public void execute(String agenda) {
		ksession.getAgenda().getAgendaGroup(agenda).setFocus();
		ksession.fireAllRules();		
	}
	

	public ArrayList<Fact> createFacts2(MAcctSchema as)
	{
		m_facts = new ArrayList<Fact>();
		ArrayList<FactLine> factline = new ArrayList<FactLine>();
		AmtDocAss  = new ArrayList<Boolean>();
		AmtPayAss = new ArrayList<Boolean>();
		//		
		//  create Fact Header
		m_fact = new Fact(this, as, Fact.POST_Actual);

		m_as = as;
		
		KieBase kb = Env.startRule(1004447);
		if (kb != null)
		{
			ksession = kb.newKieSession();
			ksession.addEventListener(new DebugAgendaEventListener());
			ksession.addEventListener(new DebugRuleRuntimeEventListener());					
			ksession.setGlobal("ctx", Env.getCtx());								
			ksession.insert(this);			
		}		
		else
		{
////			String error = String.format("%s en %s", Env.getKieError(AD_Rule_ID), dt.getName()); 						
////			setProcessMsg(error);
////			if (getProcessMsg() != null)
////				return DocAction.STATUS_Invalid;
		}		
		MAllocationHdr alloc = (MAllocationHdr)getPO();			
		for (int i = 0; i < p_lines.length; i++)
		{
			m_line = (DocLine_Allocation)p_lines[i];			
			if (m_payment == null)
			{
				m_payment = new Query(Env.getCtx(), X_C_Payment.Table_Name, "C_Payment_ID = ?", null)
				.setParameters(m_line.getC_Payment_ID()).first();
				if (m_payment != null)
				{
					updateRule(m_payment);
					if (m_bankaccount == null)
					{
						if (m_payment.getC_BankAccount_ID() > 0)
						{
							m_bankaccount = new Query(Env.getCtx(), X_C_BankAccount.Table_Name, "C_BankAccount_ID = ?", null)
							.setParameters(m_payment.getC_BankAccount_ID()).first();
							m_bank = new Query(Env.getCtx(), X_C_Bank.Table_Name, "C_Bank_ID = ?", null)
							.setParameters(m_bankaccount.getC_Bank_ID()).first();
							updateRule(m_bank);
							updateRule(m_bankaccount);
						}
					}					
				}
			}
			setC_BPartner_ID(m_line.getC_BPartner_ID());

			if (m_line.getAmtSource().signum() == 0)
				continue;

			Timestamp datePay = null;

			//  CashBankTransfer - all references null and Discount/WriteOff = 0
			if ( (m_line.getC_Payment_ID() != 0	|| m_line.getC_PaymentLine_ID() != 0 )
					&& m_line.getC_Invoice_ID() == 0 && m_line.getC_Order_ID() == 0
					&& m_line.getC_CashLine_ID() == 0 && m_line.getC_BPartner_ID() == 0
					&& Env.ZERO.compareTo(m_line.getDiscountAmt()) == 0
					&& Env.ZERO.compareTo(m_line.getWriteOffAmt()) == 0)
				continue;

			allocationSource = m_line.getAmtSource()
					.add(m_line.getDiscountAmt())
					.add(m_line.getWriteOffAmt());
					//.add(m_line.getWithholdingAmt());

			System.out.println(i+".--  allocationsource : " + allocationSource);

			BigDecimal allocationAccounted = Env.ZERO;	// AR/AP balance corrected						
			//m_payment = null;
			updateRule(m_line);			
			//m_paymentline.getPayment().getC_BankAccount_ID();
			if (m_line.getC_PaymentLine_ID() > 0)
			{			
				m_paymentline = new Query(Env.getCtx(), X_C_PaymentLine.Table_Name, "C_PaymentLine_ID = ?", null)
					.setParameters(m_line.getC_PaymentLine_ID()).first();
				if (m_paymentline != null)
					updateRule(m_paymentline);
			}
			if (m_line.getC_CashLine_ID() > 0)
			{
				MCashLine cashline = new Query(Env.getCtx(), X_C_CashLine.Table_Name, "C_CashLine_ID = ?", null)
					.setParameters(m_line.getC_CashLine_ID()).first();
				if (cashline != null)
					updateRule(cashline);
			}			
			//(MCashLine cashLine = new MCashLine (getCtx(), m_line.getC_CashLine_ID(), getTrxName());)
			if (m_line.getC_BOE_ID() > 0)
			{
				m_boe = new Query(Env.getCtx(), X_C_BOE.Table_Name, "C_BOE_ID = ?", null)				
					.setParameters(m_line.getC_BOE_ID()).first();
				if (m_boe != null)
					updateRule(m_boe);
			}
			if (m_line.getC_Invoice_ID() > 0)
			{
				m_invoice = new Query(Env.getCtx(), X_C_Invoice.Table_Name, "C_Invoice_ID = ?", null)
					.setParameters(m_line.getC_Invoice_ID()).first();
				if (m_invoice != null)
					updateRule(m_invoice);
			}						
			if (m_line.getC_Charge_ID() > 0)
			{
				MCharge m_charge = new Query(Env.getCtx(), X_C_Charge.Table_Name, "C_Charge_ID = ?", null)
					.setParameters(m_line.getC_Charge_ID()).first();
				if (m_charge != null)
					updateRule(m_charge);
			}			
			execute("line");
		}			
		ksession.dispose();
////		return rulestatus;
		m_facts.add(m_fact);
		return m_facts;		
	}

	public String getPayTableName()
	{
		String name = "";
		MTable table = new Query(Env.getCtx(), X_AD_Table.Table_Name, "AD_Table_ID = ?", null)
			.setParameters(m_line.getTable_ID()).first();
		name = table.getTableName();
		return name;
	}


	/**
	 *  Create Facts (the accounting logic) for
	 *  CMA.
	 *  <pre>
	 *  
	 *  AR = Account Receivables  
	 *  AP = Account Payments
	 *  DR = Debt Row
	 *  CR = Credit Row
	 *      
	 *  	 *  AR_Invoice_Payment
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
	public ArrayList<Fact> createFacts(MAcctSchema as)
	{		
		m_facts = new ArrayList<Fact>();
		ArrayList<FactLine> factline = new ArrayList<FactLine>();
		//		
		//  create Fact Header
		m_fact = new Fact(this, as, Fact.POST_Actual);

		m_as = as;

		AmtDocAss  = new ArrayList<Boolean>();
		AmtPayAss = new ArrayList<Boolean>();

		//BigDecimal payAmount = Env.ZERO;

		IsPurchase = false;

		for (int i = 0; i < p_lines.length; i++)
		{
			m_line = (DocLine_Allocation)p_lines[i];
			setC_BPartner_ID(m_line.getC_BPartner_ID());

			if (m_line.getAmtSource().signum() == 0)
				continue;

			Timestamp datePay = null;

			//  CashBankTransfer - all references null and Discount/WriteOff = 0
			if ( (m_line.getC_Payment_ID() != 0	|| m_line.getC_PaymentLine_ID() != 0 )
					&& m_line.getC_Invoice_ID() == 0 && m_line.getC_Order_ID() == 0
					&& m_line.getC_CashLine_ID() == 0 && m_line.getC_BPartner_ID() == 0
					&& Env.ZERO.compareTo(m_line.getDiscountAmt()) == 0
					&& Env.ZERO.compareTo(m_line.getWriteOffAmt()) == 0)
				continue;

			allocationSource = m_line.getAmtSource()
					.add(m_line.getDiscountAmt())
					.add(m_line.getWriteOffAmt());
					//.add(m_line.getWithholdingAmt());

			System.out.println(i+".--  allocationsource : " + allocationSource);

			BigDecimal allocationAccounted = Env.ZERO;	// AR/AP balance corrected

			fl = null;
			m_payment = null;
			m_paymentline = null;
			m_boe = null;
			m_invoice = null;
			
			Env.setContext(Env.getCtx(), "IsOwnBank", "N"); // volver a N for all cases

			if (m_line.getC_PaymentLine_ID() != 0)
			{
				m_paymentline = new MPaymentLine(getCtx(), m_line.getC_PaymentLine_ID(), getTrxName());
				m_line.setC_ConversionType_ID(m_paymentline.getC_ConversionType_ID());
				if (getC_BankAccount_ID()==0)
				{
					Integer C_BankAccount_ID = DB.getSQLValue(getTrxName(), " SELECT p.C_BankAccount_ID FROM C_Payment p INNER JOIN C_DocType d ON (p.C_DocType_ID=d.C_DocType_ID) WHERE C_Payment_ID=?", m_paymentline.getPayment().getC_Payment_ID());
					String IsOwnBank = DB.getSQLValueString(getTrxName(), "SELECT b.isownbank FROM c_bankaccount ba JOIN c_bank b on ba.c_bank_id = b.c_bank_id WHERE ba.c_bankaccount_id = ?", C_BankAccount_ID);
					Env.setContext(Env.getCtx(), "IsOwnBank", IsOwnBank);
					setC_BankAccount_ID(C_BankAccount_ID);
				}
				else
				{
					String IsOwnBank = DB.getSQLValueString(getTrxName(), "SELECT b.isownbank FROM c_bankaccount ba JOIN c_bank b on ba.c_bank_id = b.c_bank_id WHERE ba.c_bankaccount_id = ?", getC_BankAccount_ID());
					Env.setContext(Env.getCtx(), "IsOwnBank", IsOwnBank);
				}
			}
			else if (m_line.getC_Payment_ID() != 0)
			{
				m_payment = new MPayment (getCtx(), m_line.getC_Payment_ID(), getTrxName());
				m_line.setC_ConversionType_ID(m_payment.getC_ConversionType_ID());
				if (getC_BankAccount_ID()==0)
				{
					Integer C_BankAccount_ID = DB.getSQLValue(getTrxName(), " SELECT p.C_BankAccount_ID FROM C_Payment p INNER JOIN C_DocType d ON (p.C_DocType_ID=d.C_DocType_ID) WHERE C_Payment_ID=?", m_payment.getC_Payment_ID());
					String IsOwnBank = DB.getSQLValueString(getTrxName(), "SELECT b.isownbank FROM c_bankaccount ba JOIN c_bank b on ba.c_bank_id = b.c_bank_id WHERE ba.c_bankaccount_id = ?", C_BankAccount_ID);
					Env.setContext(Env.getCtx(), "IsOwnBank", IsOwnBank);
					setC_BankAccount_ID(C_BankAccount_ID);
				}				
			}			
			if (m_line.getC_BOE_ID() != 0)
			{
				m_boe = MBOE.get(Env.getCtx(), m_line.getC_BOE_ID(), getTrxName());
				if ( m_boe.get_ID() == 0 )
				{
					p_Error = "Letra ID:" + m_line.getC_BOE_ID() + " inexistente ";
					return null;
				}
			}			
			if (m_line.getC_Invoice_ID() != 0)
			{
				m_invoice = new MInvoice (getCtx(), m_line.getC_Invoice_ID(), null);
				if (m_invoice.get_ID() ==  0)
				{
					p_Error = "Invoice ID:" +  m_line.getC_Invoice_ID() + " inexistente";
					return null;
				}
			}
			//	No Invoice
			if (m_boe != null)
			{								
				// Payment BOE Proveedor only.
				if (!m_boe.isSOTrx())
				{
					m_IsSOTrx = false;
					if (m_paymentline != null)
						fl = createFactPaymentLine(m_paymentline, m_boe.getC_DocType_ID(), true);
					else if (m_payment != null)
						fl = createFactPayment(m_payment,m_boe.getC_DocType_ID(),  true);
					if (m_line.getC_CashLine_ID() != 0)
						fl = createFactCashLine(m_boe.getC_DocType_ID(), false);
					if (m_line.getTable_ID() == MBOE.Table_ID )
						fl = createFactBOEPay(0,"", false);
					if (fl != null)
						datePay = fl.getDateAcct();

					fl = createFactBOE(datePay);
					if (fl == null)
						return null;
				}
				else
				{	
					m_IsSOTrx = true;
					if (m_line.getC_PaymentLine_ID() != 0)
						fl = createFactPaymentLine(m_paymentline,m_boe.getC_DocType_ID(),  true);
					else if (m_line.getC_Payment_ID() != 0)
						fl = createFactPayment(m_payment, m_boe.getC_DocType_ID(), true);
					else if (m_line.getC_CashLine_ID() != 0)
						fl = createFactCashLine(m_boe.getC_DocType_ID(), false);
					else if (m_line.getTable_ID() == MBOE.Table_ID )
						fl = createFactBOEPay(m_boe.getC_BankAccount_ID(), m_boe.getDocumentNo(), false);
					if (fl != null)
						datePay = fl.getDateAcct();

					fl = createFactBOE(datePay);
					if (fl != null)
						fl.setC_DocType_ID(m_boe.getC_DocType_ID());
					else
						return null;
				}
			} 			
			//	Sales Invoice	
			else if (m_invoice != null && m_invoice.isSOTrx())
			{
				m_IsSOTrx = true;
				if (m_line.getC_PaymentLine_ID() != 0 )
				{
					fl = createFactPaymentLine(m_paymentline, m_invoice.getC_DocType_ID(), true);
					datePay = fl.getDateAcct();
					//					if (m_line.getWithholdingAmt().signum() > 0)		
					//					{
					//						fl = createFactWithholding(fl.getAccount());					
					//					}					
				}
				else if (m_line.getC_Payment_ID() != 0 )
				{
					fl = createFactPayment(m_payment, m_invoice.getC_DocType_ID(), true);
					datePay = fl.getDateAcct();
				}
				else if (m_line.getC_CashLine_ID() != 0)
				{
					fl = createFactCashLine(m_invoice.getC_DocType_ID(), true);
					if (fl != null)
					{				
						datePay = fl.getDateAcct();
						//if (m_line.getWithholdingAmt().signum() > 0)		
						//{
						//	fl = createFactWithholding(fl.getAccount());					
						//}
					}
				}
				else if (m_line.getTable_ID() == MBOE.Table_ID )
				{
					fl = createFactBOEPay(0, "", true);
					datePay = fl.getDateAcct();
				}
				else if (m_line.getTable_ID() == MRetention.Table_ID  )
				{
					fl = createFactRetention(true);
					datePay = fl.getDateAcct();
				}
				//	Discount		DR
				if (Env.ZERO.compareTo(m_line.getDiscountAmt()) != 0)
				{
					fl = m_fact.createLine (m_line, getAccount(Doc.ACCTTYPE_DiscountExp, as),
							getC_Currency_ID(), m_line.getDiscountAmt(), null);
					if (fl != null && m_payment != null)
						fl.setAD_Org_ID(m_payment.getAD_Org_ID());
				}
				//	Write off		DR
				if (Env.ZERO.compareTo(m_line.getWriteOffAmt()) != 0)
				{
					fl = createFactWriteOff();
					totalWriteOffAmt = totalWriteOffAmt.add(m_line.getWriteOffAmt());
				}
				if (as.isAccrual() )
				{
					fl = createFactInvoice(true, datePay);

					//					if (m_invoice.getWithholdingAmt().signum() > 0)		
					//					{
					//						fl = createFactWithholding(fl.getAccount(), m_invoice);					
					//					}					
				}
				else if (allocationSource.compareTo(Env.ZERO) > 0)	//	Cash Based
				{
					allocationAccounted = createCashBasedAcct (as, m_fact, m_invoice, allocationSource);
				}
			}
			//	Purchase Invoice
			else if (m_invoice != null && !m_invoice.isSOTrx())
			{
				m_IsSOTrx = false;
				//	Payment/Cash	CR				
				if (m_line.getC_PaymentLine_ID() != 0)
				{
					fl = createFactPaymentLine(m_paymentline, m_invoice.getC_DocType_ID(), true);
					datePay = fl.getDateAcct();
				}
				else if (m_line.getC_Payment_ID() != 0)
				{
					fl = createFactPayment(m_payment, m_invoice.getC_DocType_ID(), true );
					datePay = fl.getDateAcct();
				}
				else if (m_line.getC_CashLine_ID() != 0)
				{
					fl = createFactCashLine(m_invoice.getC_DocType_ID(), true);
					datePay = fl.getDateAcct();
				}
				else if (m_line.getTable_ID() == MBOE.Table_ID)
				{
					fl = createFactBOEPay(0,"", true);
					datePay = fl.getDateAcct();
				}
				else if (m_line.getTable_ID() == MRetention.Table_ID)
				{
					fl = createFactRetention(true);
					datePay = fl.getDateAcct();
				}

				//	AP Invoice Amount	DR
				if (as.isAccrual() )
				{
					fl = createFactInvoice(true, datePay);
					IsPurchase = true;
				}
				else	//	Cash Based
				{
					allocationAccounted = createCashBasedAcct (as, m_fact, 
							m_invoice, allocationSource);
				}

				//	Discount		CR
				if (Env.ZERO.compareTo(m_line.getDiscountAmt()) != 0)
				{
					fl = m_fact.createLine (m_line, getAccount(Doc.ACCTTYPE_DiscountRev, as),
							getC_Currency_ID(), null, m_line.getDiscountAmt().negate());
					if (fl != null && m_payment != null)
						fl.setAD_Org_ID(m_payment.getAD_Org_ID());
				}
				//	Write off		CR
				if (Env.ZERO.compareTo(m_line.getWriteOffAmt()) != 0)
				{
					BigDecimal WriteOffAmt = m_line.getWriteOffAmt();
					if (WriteOffAmt.signum() > 0)
						fl = m_fact.createLine (m_line, getAccount(Doc.ACCTTYPE_WriteOffLoss, as),
								getC_Currency_ID(), totalWriteOffAmt, null);
					else
						fl = m_fact.createLine (m_line, getAccount(Doc.ACCTTYPE_WriteOffGain, as),
								getC_Currency_ID(), null, totalWriteOffAmt.negate());						
					if (fl != null && m_payment != null)
						fl.setAD_Org_ID(m_payment.getAD_Org_ID());
					totalWriteOffAmt = totalWriteOffAmt.add(WriteOffAmt);
				}
			}
			else if (m_payment != null || m_paymentline != null || m_line.getC_CashLine_ID() != 0) {
				//	Payment Only
				if (m_line.getC_PaymentLine_ID() != 0  )
				{					
					//if (m_line.getC_Payment_ID() == 0 )
					fl = createFactPaymentLine(m_paymentline,m_paymentline.getPayment().getC_DocType_ID(), false);
					if (m_line.getC_Charge_ID() != 0)
					{
						fl = createFactCharge();
					}				
					if (m_line.getWithholdingAmt().signum() > 0)		
					{
						fl = createFactWithholding(fl.getAccount(), null, null);					
					}					
				}
				else if (m_line.getC_Payment_ID() != 0  )
				{					
					fl = createFactPayment(m_payment, m_payment.getC_DocType_ID(), false);
					if (m_line.getC_Charge_ID() != 0)
					{						

						String DocumentNo = m_payment.getRefDocumentNo();
						int C_DocType_ID = m_payment.geReftC_DocType_ID();						

						fl = createFactCharge(getAccount(Doc.ACCTTYPE_BankInTransit, m_as),
								m_payment.getC_Currency_ID(),
								m_payment.getC_Invoice_ID(),
								m_payment.getC_BOE_ID(),
								m_payment.getC_BPartner_ID(),
								C_DocType_ID,
								m_payment.getDateTrx(),
								m_payment.getC_ConversionType_ID(),
								DocumentNo );
					}					
				}				
				else if (m_line.getC_CashLine_ID() != 0)
				{										
					if (m_line.getC_Charge_ID() != 0)
					{
						MCashLine cashLine = new MCashLine (getCtx(), m_line.getC_CashLine_ID(), getTrxName());						
						MCash cash = new MCash(Env.getCtx(), cashLine.getC_Cash_ID(), null);							
						MCashBook cb = new MCashBook(Env.getCtx(), cash.getC_CashBook_ID(), null);
						MAccount account = getCashAcct(as, m_line.getC_CashLine_ID());
						String DocumentNo = getReferencebyCash();						
						int C_DocType_ID = 0;
						if (m_paymentline != null ) 
						{
							DocumentNo = m_paymentline.getRefDocumentNo();
							C_DocType_ID = m_paymentline.getRefC_DocType_ID();
						}						
						BigDecimal destAmount = MConversionRate.convert(getCtx(), m_line.getAmtSource().abs(), m_line.getC_Currency_ID(), 
								cash.getC_Currency_ID(), getDateAcct(), cashLine.getC_ConversionType_ID(), getAD_Client_ID(), getAD_Org_ID(), true);

						if (destAmount == null)
							throw new ConversionRateException(m_line.getAmtSource().abs(), m_line.getC_Currency_ID(), cash.getC_Currency_ID(),cashLine.getC_ConversionType_ID(), getDateAcct() );

						Boolean IsSOTrx = false;
						if (m_line.getAmtSource().compareTo(Env.ZERO) > 0)
							IsSOTrx = true;
						else
							IsSOTrx = false;

						fl = m_fact.Search(account, cash.getC_BPartner_ID());

						fl = createFact(m_as, 
								fl, 
								m_fact, 
								account , 
								cash.getC_BPartner_ID() , 
								cash.getC_Currency_ID() , 
								cashLine.getC_ConversionType_ID(),
								getDateAcct(),
								getDateAcct(),
								m_line,
								IsSOTrx ? destAmount : null,
										IsSOTrx ? null : destAmount,
												getAD_Client_ID(),
												getAD_Org_ID(),
												"",
												C_DocType_ID);												

						fl = createFactCharge( getCashAcct(as, m_line.getC_CashLine_ID()),
								cash.getC_Currency_ID(),
								0,
								0,
								cashLine.getC_BPartner_ID(),
								0,
								getDateAcct(),
								cashLine.getC_ConversionType_ID(),
								DocumentNo );

						if (fl == null)
							return null;

					}
					else if (m_line.getGL_JournalLine_ID() != 0)
						fl = createFactGLJournal(m_paymentline);
					else
					{
						p_Error = "Cannot determine SO/PO";
						log.log(Level.SEVERE, p_Error);
						return null;
					}
				}
			}

			//	VAT Tax Correction
			if (m_invoice != null && as.isTaxCorrection())
			{
				BigDecimal taxCorrectionAmt = Env.ZERO;
				if (as.isTaxCorrectionDiscount())
					taxCorrectionAmt = m_line.getDiscountAmt();
				if (as.isTaxCorrectionWriteOff())
					taxCorrectionAmt = taxCorrectionAmt.add(m_line.getWriteOffAmt());					
				//
				if (taxCorrectionAmt.signum() != 0)
				{
					if (!createTaxCorrection(as, m_fact, m_line, 
							getAccount(m_invoice.isSOTrx() ? Doc.ACCTTYPE_DiscountExp : Doc.ACCTTYPE_DiscountRev, as), 
							getAccount(Doc.ACCTTYPE_WriteOffGain, as), getAccount(Doc.ACCTTYPE_WriteOffLoss, as)))
					{
						p_Error = "Cannot create Tax correction";
						return null;
					}
				}
			}				
		}	//	for all lines

		Boolean adjustDoc = false;
		Boolean adjustPay = false;		


		for (int adjust = 0; adjust < AmtDocAss.size(); adjust ++)
		{
			if (AmtDocAss.get(adjust) != null)
				if ((Boolean)AmtDocAss.get(adjust))
				{
					adjustDoc = true;
					break;
				}
		}

		for (int adjust = 0; adjust < AmtPayAss.size(); adjust ++)
		{
			if (AmtPayAss.get(adjust) != null)
				if ((Boolean)AmtPayAss.get(adjust))
				{
					adjustPay = true;
					break;
				}
		}

		if (adjustDoc || adjustPay)
		{
			//BigDecimal diff = Env.ZERO;
			ArrayList<Vector> diffbyProject = new ArrayList<Vector>();			
			for (FactLine line:m_fact.getLines())
			{
				Boolean found = false;
				//diff = diff.add (line.getSourceBalance());
				for (Vector df:diffbyProject)
				{
					if ( (Integer) df.get(0) == line.getC_Project_ID() )
					{
						BigDecimal diff = (BigDecimal) df.get(1);						
						diff = diff.add(line.getSourceBalance());
						df.set(1, diff);
						found = true;
						break;
					}
				}
				if (!found)
				{
					Vector project = new Vector();
					project.add(line.getC_Project_ID());
					project.add(line.getSourceBalance());
					diffbyProject.add(project);
				}
			}

			FactLine fl = null;

			MAccount gain = MAccount.get (as.getCtx(), as.getAcctSchemaDefault().getRealizedGain_Acct());
			MAccount loss = MAccount.get (as.getCtx(), as.getAcctSchemaDefault().getRealizedLoss_Acct());

			for (Vector df:diffbyProject)
			{
				Integer project = (Integer) df.get(0);
				BigDecimal diff = (BigDecimal) df.get(1);						
				fl = new FactLine (getCtx(), get_Table_ID(), 
						get_ID(), 0, getFact_ID(), getTrxName());

				if (diff.signum() < 0) 
					fl = m_fact.createLine( null, loss, as.getC_Currency_ID(), diff.abs(), Env.ZERO);
				else
					fl = m_fact.createLine( null, gain, as.getC_Currency_ID(), Env.ZERO, diff.abs());

				if (fl != null)
				{
					fl.setInvoiceDocumentNo("Diff T/C");
					fl.setC_Project_ID(project);
				}
			}			
		}		
		//	reset line info
		setC_BPartner_ID(0);
		m_facts.add(m_fact);
		return m_facts;
	}   //  createFact

	public FactLine createFactCharge() {
		String DocumentNo = m_paymentline.getRefDocumentNo();
		int C_DocType_ID = m_paymentline.getRefC_DocType_ID();
		fl = createFactCharge( getAccount(Doc.ACCTTYPE_BankInTransit, m_as),
				m_paymentline.getPayment().getC_Currency_ID(),
				m_paymentline.getC_Invoice_ID(),
				C_DocType_ID,
				m_paymentline.getC_BPartner_ID(),
				m_paymentline.getPayment().getC_DocType_ID(),
				m_paymentline.getPayment().getDateTrx(),
				m_paymentline.getPayment().getC_ConversionType_ID(),
				DocumentNo);
		//if (fl == null)
		//	return null;
		return fl;
	}

	// rules
	public FactLine createFactInvoice(Boolean AddToDoc) {

		//Boolean IsSOTrx = false;
		//if (m_line.getAmtSource().signum() > 0) 
		//	IsSOTrx = true;
		Timestamp datePay = getDatePay();
		if (datePay == null)
		{
			System.out.println("X");
			return null;
		}

		setC_BPartner_ID(m_invoice.getC_BPartner_ID());
		MAccount bpAcct = null;

		BigDecimal adjust = Env.ZERO;

		if (m_IsSOTrx)
			bpAcct = getAccount(Doc.ACCTTYPE_C_Receivable, m_as);
		else
			bpAcct = getAccount(Doc.ACCTTYPE_V_Liability, m_as);

		int Ref_Acct_ID = getReferenceSource(m_as, m_invoice, MInvoice.Table_ID);
		if (UnGrouped)
			fl = null;
		else
			fl = m_fact.Search(bpAcct, m_invoice.getC_BPartner_ID(), m_invoice.getSerial(), m_invoice.getDocumentNo());

		Timestamp dateInvoiced = null;
		if (m_invoice.getRef_Invoice_ID() > 0)
		{
			MInvoice invoiceref = MInvoice.get(Env.getCtx(), m_invoice.getRef_Invoice_ID());
			if (invoiceref.get_ID() > 0)
			{
				m_line.setDateDoc(invoiceref.getDateInvoiced());
				dateInvoiced = invoiceref.getDateInvoiced();
				// xapiens
				//datePay = invoiceref.getDateAcct();
			}
			else
			{
				m_line.setDateDoc(m_invoice.getDateInvoiced());
				dateInvoiced = m_invoice.getDateInvoiced();
			}
		}
		else
		{
			m_line.setDateDoc(m_invoice.getDateInvoiced());
			dateInvoiced = m_invoice.getDateInvoiced();
		}		
		//m_line.setDateAcct(datePay);
		m_line.setDateAcct(getDateAcct());
		m_line.setC_ConversionType_ID(m_invoice.getC_ConversionType_ID());
		//m_DocDate = m_invoice.getDateInvoiced();
		//m_ConversionType = invoice.getC_ConversionType_ID();														
		// si la factura no es ni soles, ni la moneda del pago y la moneda del pago es diferente a soles significa una moneda no contemplada
		// no convertimos a la moneda de la factura.
		if ( m_invoice.getC_Currency_ID() != m_as.getC_Currency_ID() && 
				m_invoice.getC_Currency_ID() != m_line.getC_Currency_ID() && 
				m_as.getC_Currency_ID() != m_line.getC_Currency_ID() )
		{
			if (m_invoice.getC_GroupDoc_ID() > 0)
			{
				MBOEConversionRate cr = MBOEConversionRate.getConversionRateFromGroup(m_invoice.getC_GroupDoc_ID());
				if (cr.getC_Currency_ID() == m_line.getC_Currency_ID() &&
						cr.getC_Currency_ID_To() == m_invoice.getC_Currency_ID() )
				{
					BigDecimal invoiceAmt = allocationSource.multiply(cr.getRate());
					int stdPrecision = MCurrency.getStdPrecision(Env.getCtx(), cr.getC_Currency_ID_To());
					if (invoiceAmt.scale() > stdPrecision)
						invoiceAmt = invoiceAmt.setScale(stdPrecision, BigDecimal.ROUND_HALF_UP);
					fl = createFact(m_as,
							fl,
							m_fact,
							bpAcct ,
							m_invoice.getC_BPartner_ID() ,
							m_invoice.getC_Currency_ID() ,
							m_invoice.getC_ConversionType_ID(),
							// se coloca null para que considere la fecha de pago como fecha contable en la factura
							// ya que el pago puede variar de periodo
							null, // m_invoice.getDateAcct(),
							dateInvoiced,
							m_line,
							m_line.getAmtSource().signum() > 0 ? null : invoiceAmt.abs(),
							m_line.getAmtSource().signum() > 0 ? invoiceAmt.abs() : null,
							m_invoice.getAD_Client_ID(),
							m_invoice.getAD_Org_ID(),
							m_invoice.getDocumentNo(),
							m_invoice.getC_DocType_ID());
				}
				//m_line.getAmtSource().signum() > 0
			}
			else
			{
				fl = createFact(m_as, 
						fl, 
						m_fact, 
						bpAcct , 
						m_invoice.getC_BPartner_ID() , 
						m_line.getC_Currency_ID() , 
						m_invoice.getC_ConversionType_ID(),
						//m_invoice.getDateAcct(),
						// se coloca null para que considere la fecha de pago como fecha contable en la factura
						// ya que el pago puede variar de periodo					
						null,
						dateInvoiced,
						m_line,
						//IsSOTrx ? null : allocationSource.abs(),
						m_line.getAmtSource().signum() > 0 ? null : allocationSource.abs(),
						m_line.getAmtSource().signum() > 0 ? allocationSource.abs() : null,
						m_invoice.getAD_Client_ID(),
						m_invoice.getAD_Org_ID(),
						m_invoice.getDocumentNo(),
						0);			
				if (fl != null)
				{
					if (datePay != null)
					{
						adjust = MConversionRate.convert(getCtx(), m_invoice.getC_DocType_ID(), allocationSource.abs(), m_line.getC_Currency_ID(), 
								m_as.getC_Currency_ID(), dateInvoiced, datePay,  m_invoice.getC_ConversionType_ID(), 
								getAD_Client_ID(), getAD_Org_ID(), true);					
					}
					else					
					{
						adjust = MConversionRate.convert(getCtx(), allocationSource.abs(), m_line.getC_Currency_ID(), 
								m_as.getC_Currency_ID(), dateInvoiced, m_invoice.getC_ConversionType_ID(), 
								getAD_Client_ID(), getAD_Org_ID(), true);
					}
					if (adjust == null)
						throw new ConversionRateException(allocationSource.abs(), m_invoice.getC_Currency_ID(), m_as.getC_Currency_ID(),m_invoice.getC_ConversionType_ID(), dateInvoiced );				
				}
			}
		}
		else
		{
			BigDecimal destAmount = Env.ZERO;
			if (datePay != null)
			{
				destAmount = MConversionRate.convert(getCtx(), m_invoice.getC_DocType_ID(), allocationSource.abs(), m_line.getC_Currency_ID(), 
						m_invoice.getC_Currency_ID() , dateInvoiced, datePay, m_invoice.getC_ConversionType_ID(), m_invoice.getAD_Client_ID(), m_invoice.getAD_Org_ID(), true);				
			}
			else
			{
				destAmount = MConversionRate.convert(getCtx(), allocationSource.abs(), m_line.getC_Currency_ID(), 
						m_invoice.getC_Currency_ID() , dateInvoiced, m_invoice.getC_ConversionType_ID(), m_invoice.getAD_Client_ID(), m_invoice.getAD_Org_ID(), true);
			}

			if (destAmount == null)
				throw new ConversionRateException(allocationSource.abs(), m_line.getC_Currency_ID(), m_invoice.getC_Currency_ID(),m_invoice.getC_ConversionType_ID(), dateInvoiced );

			m_line.setDateDoc(dateInvoiced);
			m_line.setC_ConversionType_ID(m_invoice.getC_ConversionType_ID());

			fl = createFact(m_as, 
					fl, 
					m_fact, 
					bpAcct , 
					m_invoice.getC_BPartner_ID() , 
					m_invoice.getC_Currency_ID() , 
					m_invoice.getC_ConversionType_ID(),
					null,
					dateInvoiced,
					datePay,
					//m_payment != null ? m_payment.getDateAcct(): null,
					m_line,
					//IsSOTrx ? null : destAmount,
					m_line.getAmtSource().signum() > 0 ? null : destAmount,
					m_line.getAmtSource().signum() > 0 ? destAmount : null, 
					m_invoice.getAD_Client_ID(),
					m_invoice.getAD_Org_ID(),
					m_invoice.getDocumentNo(),m_invoice.getC_DocType_ID());

			if (datePay != null)
			{			
				adjust = MConversionRate.convert(getCtx(), m_invoice.getC_DocType_ID(), destAmount, m_invoice.getC_Currency_ID(), 
						m_as.getC_Currency_ID(), dateInvoiced, datePay, m_invoice.getC_ConversionType_ID(), 
						getAD_Client_ID(), getAD_Org_ID(), true);
			}
			else
			{
				adjust = MConversionRate.convert(getCtx(), destAmount, m_invoice.getC_Currency_ID(), 
						m_as.getC_Currency_ID(), dateInvoiced, m_invoice.getC_ConversionType_ID(), 
						getAD_Client_ID(), getAD_Org_ID(), true);				
			}

			if (adjust == null)
				throw new ConversionRateException(m_line.getAmtSource().abs(), m_invoice.getC_Currency_ID(), m_as.getC_Currency_ID(),m_invoice.getC_ConversionType_ID(), m_invoice.getDateInvoiced() );

		}
		if (fl != null)
		{
			fl.setSerial(m_invoice.getSerial());
			fl.setRef_Acct_ID(Ref_Acct_ID);
			fl.setInvoiceDocumentNo(m_invoice.getDocumentNo());

			if (AddToDoc)
			{

				if (!adjust.equals(fl.getAcctBalance().abs()) && UnGrouped)
					throw new XendraException("no cuadra");

				if (IsPurchase && m_IsSOTrx)
				{

					AddPayDoc(m_invoice.getC_Currency_ID() != m_as.getC_Currency_ID());
				}
				else
				{
					AddAmtDoc(m_invoice.getC_Currency_ID() != m_as.getC_Currency_ID());
				}
			}
		}
		if (m_line.getWithholdingAmt().signum() > 0)		
		{
			fl = createFactWithholding(fl.getAccount(), null, null);					
		}
		setDatePay(null);
		return fl;
	}
	
	private FactLine createFactInvoice(Boolean AddToDoc, Timestamp datePay) {

		//Boolean IsSOTrx = false;
		//if (m_line.getAmtSource().signum() > 0) 
		//	IsSOTrx = true;

		setC_BPartner_ID(m_invoice.getC_BPartner_ID());
		MAccount bpAcct = null;

		BigDecimal adjust = Env.ZERO;

		if (m_IsSOTrx)
			bpAcct = getAccount(Doc.ACCTTYPE_C_Receivable, m_as);
		else
			bpAcct = getAccount(Doc.ACCTTYPE_V_Liability, m_as);

		int Ref_Acct_ID = getReferenceSource(m_as, m_invoice, MInvoice.Table_ID);
		if (UnGrouped)
			fl = null;
		else
			fl = m_fact.Search(bpAcct, m_invoice.getC_BPartner_ID(), m_invoice.getSerial(), m_invoice.getDocumentNo());

		Timestamp dateInvoiced = null;
		if (m_invoice.getRef_Invoice_ID() > 0)
		{
			MInvoice invoiceref = MInvoice.get(Env.getCtx(), m_invoice.getRef_Invoice_ID());
			if (invoiceref.get_ID() > 0)
			{
				m_line.setDateDoc(invoiceref.getDateInvoiced());
				dateInvoiced = invoiceref.getDateInvoiced();
				// xapiens
				datePay = invoiceref.getDateAcct();
			}
			else
			{
				m_line.setDateDoc(m_invoice.getDateInvoiced());
				dateInvoiced = m_invoice.getDateInvoiced();
			}
		}
		else
		{
			m_line.setDateDoc(m_invoice.getDateInvoiced());
			dateInvoiced = m_invoice.getDateInvoiced();
		}		
		//m_line.setDateAcct(datePay);
		m_line.setDateAcct(getDateAcct());
		m_line.setC_ConversionType_ID(m_invoice.getC_ConversionType_ID());
		//m_DocDate = m_invoice.getDateInvoiced();
		//m_ConversionType = invoice.getC_ConversionType_ID();														
		// si la factura no es ni soles, ni la moneda del pago y la moneda del pago es diferente a soles significa una moneda no contemplada
		// no convertimos a la moneda de la factura.
		if ( m_invoice.getC_Currency_ID() != m_as.getC_Currency_ID() && 
				m_invoice.getC_Currency_ID() != m_line.getC_Currency_ID() && 
				m_as.getC_Currency_ID() != m_line.getC_Currency_ID() )
		{
			if (m_invoice.getC_GroupDoc_ID() > 0)
			{
				MBOEConversionRate cr = MBOEConversionRate.getConversionRateFromGroup(m_invoice.getC_GroupDoc_ID());
				if (cr.getC_Currency_ID() == m_line.getC_Currency_ID() &&
						cr.getC_Currency_ID_To() == m_invoice.getC_Currency_ID() )
				{
					BigDecimal invoiceAmt = allocationSource.multiply(cr.getRate());
					int stdPrecision = MCurrency.getStdPrecision(Env.getCtx(), cr.getC_Currency_ID_To());
					if (invoiceAmt.scale() > stdPrecision)
						invoiceAmt = invoiceAmt.setScale(stdPrecision, BigDecimal.ROUND_HALF_UP);
					fl = createFact(m_as,
							fl,
							m_fact,
							bpAcct ,
							m_invoice.getC_BPartner_ID() ,
							m_invoice.getC_Currency_ID() ,
							m_invoice.getC_ConversionType_ID(),
							// se coloca null para que considere la fecha de pago como fecha contable en la factura
							// ya que el pago puede variar de periodo
							null, // m_invoice.getDateAcct(),
							dateInvoiced,
							m_line,
							m_line.getAmtSource().signum() > 0 ? null : invoiceAmt.abs(),
							m_line.getAmtSource().signum() > 0 ? invoiceAmt.abs() : null,
							m_invoice.getAD_Client_ID(),
							m_invoice.getAD_Org_ID(),
							m_invoice.getDocumentNo(),
							m_invoice.getC_DocType_ID());
				}
				//m_line.getAmtSource().signum() > 0
			}
			else
			{
				fl = createFact(m_as, 
						fl, 
						m_fact, 
						bpAcct , 
						m_invoice.getC_BPartner_ID() , 
						m_line.getC_Currency_ID() , 
						m_invoice.getC_ConversionType_ID(),
						//m_invoice.getDateAcct(),
						// se coloca null para que considere la fecha de pago como fecha contable en la factura
						// ya que el pago puede variar de periodo					
						null,
						dateInvoiced,
						m_line,
						//IsSOTrx ? null : allocationSource.abs(),
						m_line.getAmtSource().signum() > 0 ? null : allocationSource.abs(),
						m_line.getAmtSource().signum() > 0 ? allocationSource.abs() : null,
						m_invoice.getAD_Client_ID(),
						m_invoice.getAD_Org_ID(),
						m_invoice.getDocumentNo(),
						0);			
				if (fl != null)
				{
					if (datePay != null)
					{
						adjust = MConversionRate.convert(getCtx(), m_invoice.getC_DocType_ID(), allocationSource.abs(), m_line.getC_Currency_ID(), 
								m_as.getC_Currency_ID(), dateInvoiced, datePay,  m_invoice.getC_ConversionType_ID(), 
								getAD_Client_ID(), getAD_Org_ID(), true);					
					}
					else					
					{
						adjust = MConversionRate.convert(getCtx(), allocationSource.abs(), m_line.getC_Currency_ID(), 
								m_as.getC_Currency_ID(), dateInvoiced, m_invoice.getC_ConversionType_ID(), 
								getAD_Client_ID(), getAD_Org_ID(), true);
					}
					if (adjust == null)
						throw new ConversionRateException(allocationSource.abs(), m_invoice.getC_Currency_ID(), m_as.getC_Currency_ID(),m_invoice.getC_ConversionType_ID(), dateInvoiced );				
				}
			}
		}
		else
		{
			BigDecimal destAmount = Env.ZERO;
			if (datePay != null)
			{
				destAmount = MConversionRate.convert(getCtx(), m_invoice.getC_DocType_ID(), allocationSource.abs(), m_line.getC_Currency_ID(), 
						m_invoice.getC_Currency_ID() , dateInvoiced, datePay, m_invoice.getC_ConversionType_ID(), m_invoice.getAD_Client_ID(), m_invoice.getAD_Org_ID(), true);				
			}
			else
			{
				destAmount = MConversionRate.convert(getCtx(), allocationSource.abs(), m_line.getC_Currency_ID(), 
						m_invoice.getC_Currency_ID() , dateInvoiced, m_invoice.getC_ConversionType_ID(), m_invoice.getAD_Client_ID(), m_invoice.getAD_Org_ID(), true);
			}

			if (destAmount == null)
				throw new ConversionRateException(allocationSource.abs(), m_line.getC_Currency_ID(), m_invoice.getC_Currency_ID(),m_invoice.getC_ConversionType_ID(), dateInvoiced );

			m_line.setDateDoc(dateInvoiced);
			m_line.setC_ConversionType_ID(m_invoice.getC_ConversionType_ID());

			fl = createFact(m_as, 
					fl, 
					m_fact, 
					bpAcct , 
					m_invoice.getC_BPartner_ID() , 
					m_invoice.getC_Currency_ID() , 
					m_invoice.getC_ConversionType_ID(),
					null,
					dateInvoiced,
					datePay,
					//m_payment != null ? m_payment.getDateAcct(): null,
					m_line,
					//IsSOTrx ? null : destAmount,
					m_line.getAmtSource().signum() > 0 ? null : destAmount,
					m_line.getAmtSource().signum() > 0 ? destAmount : null, 
					m_invoice.getAD_Client_ID(),
					m_invoice.getAD_Org_ID(),
					m_invoice.getDocumentNo(),m_invoice.getC_DocType_ID());

			if (datePay != null)
			{			
				adjust = MConversionRate.convert(getCtx(), m_invoice.getC_DocType_ID(), destAmount, m_invoice.getC_Currency_ID(), 
						m_as.getC_Currency_ID(), dateInvoiced, datePay, m_invoice.getC_ConversionType_ID(), 
						getAD_Client_ID(), getAD_Org_ID(), true);
			}
			else
			{
				adjust = MConversionRate.convert(getCtx(), destAmount, m_invoice.getC_Currency_ID(), 
						m_as.getC_Currency_ID(), dateInvoiced, m_invoice.getC_ConversionType_ID(), 
						getAD_Client_ID(), getAD_Org_ID(), true);				
			}

			if (adjust == null)
				throw new ConversionRateException(m_line.getAmtSource().abs(), m_invoice.getC_Currency_ID(), m_as.getC_Currency_ID(),m_invoice.getC_ConversionType_ID(), m_invoice.getDateInvoiced() );

		}
		if (fl != null)
		{
			fl.setSerial(m_invoice.getSerial());
			fl.setRef_Acct_ID(Ref_Acct_ID);
			fl.setInvoiceDocumentNo(m_invoice.getDocumentNo());

			if (AddToDoc)
			{

				if (!adjust.equals(fl.getAcctBalance().abs()) && UnGrouped)
					throw new XendraException("no cuadra");

				if (IsPurchase && m_IsSOTrx)
				{

					AddPayDoc(m_invoice.getC_Currency_ID() != m_as.getC_Currency_ID());
				}
				else
				{
					AddAmtDoc(m_invoice.getC_Currency_ID() != m_as.getC_Currency_ID());
				}
			}
		}
		if (m_line.getWithholdingAmt().signum() > 0)		
		{
			fl = createFactWithholding(fl.getAccount(), null, null);					
		}							
		return fl;
	}

	private FactLine createFactWriteOff() {

		Boolean IsSOTrx = m_line.getWriteOffAmt().compareTo(Env.ZERO) > 0 ? true : false;

		MAccount account = getAccount(Doc.ACCTTYPE_WriteOffLoss, m_as);
		if (UnGrouped)
			fl = null;
		else
			fl = m_fact.Search(account,"", "");
		fl = createFact(m_as, 
				fl, 
				m_fact, 
				account , 
				getC_BPartner_ID() , 
				getC_Currency_ID() , 
				getC_ConversionType_ID(),
				null,
				null,
				m_line,
				IsSOTrx ? m_line.getWriteOffAmt().abs() : null,
						IsSOTrx ? null : m_line.getWriteOffAmt().abs(),
								getAD_Client_ID(),
								getAD_Org_ID(),
								null,
								0);														
		return fl;
	}

	private FactLine createFactWithholding(MAccount bpAcct, BigDecimal amt, String Reference) {
		BigDecimal whAmt;
		if (amt == null)
		{
			whAmt = m_line.getWithholdingAmt();
		}
		else
		{
			whAmt = amt;
		}
		if (whAmt.signum() == 0)
			return null;
		// como el monto pagado incluye percepcion se resta 
		if (allocationSource.signum() > 0)
			allocationSource = allocationSource.subtract(whAmt.abs());
		else
			allocationSource = allocationSource.add(whAmt.abs());
		// es importante determinar si es una cuenta para seguimiento 
		// o una cuenta efectiva de cancelacion, la diferencia seria 
		// si el allocation es IsExchange (un canje o un canje de una renovacion)
		String where = "C_Withholding_ID=? AND C_AcctSchema_ID=? ";
		Integer Withholding_Acct = 0;
		X_C_Withholding_Acct wha = new Query(Env.getCtx(), X_C_Withholding_Acct.Table_Name, where, null)
		.setParameters(m_invoice.getC_Withholding_ID(), m_as.getC_AcctSchema_ID()).first();
		if (isExchange())
		{
			if (m_IsSOTrx)
				Withholding_Acct = wha.getExchange_Acct();
			else
				Withholding_Acct = wha.getVendorExchange_Acct();
		}	
		else
		{
			if (m_IsSOTrx)
				Withholding_Acct = wha.getWithholding_Acct();
			else
				Withholding_Acct = wha.getVendor_Acct();
		}
		MAccount account = MAccount.get (getCtx(), Withholding_Acct);						
		if (UnGrouped)
			fl = null;
		else
		{			
			if (Reference == null)
				fl = m_fact.Search(account,m_invoice.getSerial(), m_invoice.getDocumentNo());
			else
				fl = m_fact.Search(account,"", Reference);
			fl = createFact(m_as, 
					fl, 
					m_fact, 
					account , 
					getC_BPartner_ID() , 
					getC_Currency_ID() , 
					getC_ConversionType_ID(),
					null,
					null,
					m_line,
					m_IsSOTrx ? null : whAmt.abs(),
					m_IsSOTrx ? whAmt.abs() : null,						
					getAD_Client_ID(),
					getAD_Org_ID(),
					null,
					0);
		}
		if (fl != null)
		{
			if (Reference == null)
			{
				fl.setSerial(m_invoice.getSerial());
				fl.setInvoiceDocumentNo(m_invoice.getDocumentNo());
			}
			else
				fl.setInvoiceDocumentNo(Reference);
		}
		return fl;		
	}


	private FactLine createFactRetention(boolean AddToPayDoc) {

		MRetention ret = MRetention.get(getCtx(), m_line.getRecord_ID(), getTrxName());
		String invoiceref = m_invoice.getSerialWithLine().concat(m_invoice.getDocumentNo());

		Boolean IsSOTrx = m_line.getAmtSource().compareTo(Env.ZERO) > 0 ? true : false;		

		fl = createFact(m_as, 
				null, 
				m_fact, 
				MRetention.getAccount(m_as, DocAction.STATUS_ToCollect), 
				ret.getC_BPartner_ID() , 
				ret.getC_Currency_ID() , 
				m_invoice.getC_ConversionType_ID(),
				null,
				ret.getDateRetention(),
				m_line,
				IsSOTrx ? m_line.getAmtSource().abs() : null,
						IsSOTrx ? null : m_line.getAmtSource().abs(),
								getAD_Client_ID(),
								getAD_Org_ID(),
								invoiceref,
								ret.getC_DocType_ID());	
		if (fl != null)
		{
			fl.setC_DocType_ID(ret.getC_DocType_ID());

			if (AddToPayDoc)
			{
				AddPayDoc(ret.getC_Currency_ID() != m_as.getC_Currency_ID());
			}
		}
		return fl;
	}

	private String getReferencebyCash() {
		MCashLine cashLine = new MCashLine (getCtx(), m_line.getC_CashLine_ID(), getTrxName());
		MCash cash = new MCash(Env.getCtx(), cashLine.getC_Cash_ID(), null);							
		MPayment payrefcash = null;
		String DocumentNo = "";

		if (cash.getC_Payment_ID() > 0)
		{
			payrefcash = new MPayment(Env.getCtx(), cash.getC_Payment_ID(), null);
			DocumentNo = payrefcash.getDocumentNo();
		}
		else if (cashLine.getC_Invoice_ID() > 0)
		{
			MInvoice invref = MInvoice.get(Env.getCtx(), cashLine.getC_Invoice_ID());
			if (invref != null && invref.getC_Invoice_ID() > 0 )
				DocumentNo = invref.getDocumentNo();
		}
		else if (cashLine.getDocumentNo() != null)
			DocumentNo = cashLine.getDocumentNo();
		else
			DocumentNo = String.valueOf(cash.getC_Cash_ID());
		return DocumentNo;
	}

	private String getReferenceByDoc() {
		MInvoice inv = null;
		MBOE be = null;

		String DocumentNo = "";
		if (m_line.getC_Invoice_ID() > 0)
		{
			inv = MInvoice.get(Env.getCtx(), m_line.getC_Invoice_ID());
			if (inv != null)
				DocumentNo = inv.getDocumentNo();
		}
		else if (m_line.getC_BOE_ID() > 0)
		{
			be = MBOE.get(Env.getCtx(), m_line.getC_BOE_ID());
			if (be != null)
				DocumentNo = be.getDocumentNo();
		}
		return DocumentNo;
	}

	private FactLine createFactGLJournal(MPaymentLine paymentline)
	{
		MJournalLine journal = new MJournalLine(Env.getCtx(), m_line.getGL_JournalLine_ID(), getTrxName());
		if (journal.getAmtSourceCr().compareTo(Env.ZERO) > 0 )
		{
			m_line.setC_ConversionType_ID(journal.getC_ConversionType_ID());
			fl = createFact(m_as, 
					fl, 
					m_fact, 
					journal.getAccount() , 
					paymentline.getC_BPartner_ID() , 
					paymentline.getC_Currency_ID() , 
					m_line.getC_ConversionType_ID(),
					paymentline.getPayment().getDateAcct(),
					paymentline.getPayment().getDateTrx(),
					m_line,
					getAmount(),
					null,
					getAD_Client_ID(),
					getAD_Org_ID(),
					journal.getReferenceNo(), 0);

			m_line.setC_ConversionType_ID(paymentline.getC_ConversionType_ID());
			fl = createFact(m_as, 
					fl, 
					m_fact, 
					getAccount(Doc.ACCTTYPE_BankInTransit, m_as) , 
					paymentline.getC_BPartner_ID() , 
					paymentline.getC_Currency_ID() , 
					m_line.getC_ConversionType_ID(),
					null,
					paymentline.getPayment().getDateTrx(),
					m_line,
					null,
					getAmount(),
					getAD_Client_ID(),
					getAD_Org_ID(),
					paymentline.getPayment().getDocumentNo(), 0);
		}
		else
		{
			//	Asset
			fl = m_fact.createLine(null, getAccount(Doc.ACCTTYPE_BankInTransit, m_as),
					getC_Currency_ID(), getAmount(), null);
			if (fl != null && getAD_Org_ID() != 0)
				fl.setAD_Org_ID(getAD_Org_ID());
			//	
			fl = m_fact.createLine(null, journal.getAccount(),
					getC_Currency_ID(), null, getAmount());
			if (fl != null && getAD_Org_ID() != 0
					&& getC_Charge_ID() == 0)		//	don't overwrite charge
				fl.setAD_Org_ID(getAD_Org_ID());
		}
		return fl;
	}

	public FactLine createFactBOE() {
		
		Timestamp datePay = m_boe.getDateBOE();
		
		MAccount account = null;

		Boolean IsSOTrx = false;

		Timestamp dateAcct = null;

		if (allocationSource.signum() > 0)
			IsSOTrx = true;

		MBOEStatement boestate = MBOEStatement.get(m_boe.getC_BOE_ID(), m_boe.getDocStatus(), getTrxName());
		int C_ConversionType_ID = 0;
		Boolean IsLoad = MConversionType.get(Env.getCtx(), m_boe.getC_ConversionType_ID()).isLoad();
		if (boestate == null)
		{
			dateAcct = m_boe.getDateAcct();
			account = m_boe.getAccount(m_as);
			C_ConversionType_ID = m_boe.getC_ConversionType_ID();
		}
		else
		{
			account = boestate.getAccount(m_as);
			C_ConversionType_ID = IsLoad ? MDocType.get(Env.getCtx(), m_boe.getC_DocType_ID()).getC_ConversionType_ID() : m_boe.getC_ConversionType_ID();
			dateAcct = boestate.getDateAcct();
		}
		if (dateAcct == null)
		{
			p_Error = "no existe definida fecha contable en documento origen";
			return null;
		}
		if (account == null || account.getAccount_ID() == 0)
			account = MBOE.getAccount(m_as, m_boe.getDocStatus() , IsSOTrx);						
		if (account == null)
		{
			p_Error = "el estado de la Letra ".concat(m_boe.getDocumentNo()).concat(" es ").concat(m_boe.getDocStatus());
			return null;
		}					
		if (UnGrouped)
			fl = null;
		else
			fl = m_fact.Search(account,  "", m_boe.getDocumentNo());

		m_line.setDateDoc(dateAcct);
		m_line.setDateAcct(datePay);
		m_line.setC_ConversionType_ID(C_ConversionType_ID);

		BigDecimal destAmount = MConversionRate.convert(getCtx(), allocationSource.abs(), m_line.getC_Currency_ID(), 
				m_boe.getC_Currency_ID(), dateAcct, m_boe.getC_ConversionType_ID(), m_boe.getAD_Client_ID(), m_boe.getAD_Org_ID());

		if (destAmount == null)
			throw new ConversionRateException(allocationSource.abs(), m_line.getC_Currency_ID(), m_boe.getC_Currency_ID(), m_boe.getC_ConversionType_ID(), dateAcct );

		fl = createFact(m_as, 
				fl, 
				m_fact, 
				account, 
				m_boe.getC_BPartner_ID() , 
				m_boe.getC_Currency_ID() , 
				m_boe.getC_ConversionType_ID(),
				// se coloca null para que considere la fecha de pago como fecha contable en la factura
				// ya que el pago puede variar de periodo
				null,
				//dateAcct,
				dateAcct,
				datePay,
				m_line,
				IsSOTrx ? null : destAmount,
						IsSOTrx ? destAmount : null,
								m_boe.getAD_Client_ID(),
								m_boe.getAD_Org_ID(),
								m_boe.getDocumentNo(),
								m_boe.getC_DocType_ID());

		int Ref_Acct_ID = getReferenceSource(m_as, m_boe, MBOE.Table_ID);
		fl.setRef_Acct_ID(Ref_Acct_ID);

		AddAmtDoc( m_boe.getC_Currency_ID() != m_as.getC_Currency_ID());

		if (m_boe.getWithholdingAmt().signum() != 0)
		{
			String where = "C_Withholding_ID=? AND C_AcctSchema_ID=? ";
			Integer Withholding_Acct = 0;
			Integer WithholdingExchange_Acct = 0;
			X_C_Withholding_Acct wha = new Query(Env.getCtx(), X_C_Withholding_Acct.Table_Name, where, null)
			.setParameters(m_boe.getC_Withholding_ID(), m_as.getC_AcctSchema_ID()).first();
			if (IsSOTrx)
			{
				Withholding_Acct = wha.getWithholding_Acct();
				WithholdingExchange_Acct = wha.getExchange_Acct();				
			}
			else
			{
				Withholding_Acct = wha.getVendor_Acct();
				WithholdingExchange_Acct = wha.getVendorExchange_Acct();
			}				
			

			destAmount = MConversionRate.convert(getCtx(), m_boe.getWithholdingAmt().abs(), m_boe.getC_Currency_ID(), 
					m_as.getC_Currency_ID(), dateAcct, m_boe.getC_ConversionType_ID(), m_boe.getAD_Client_ID(), m_boe.getAD_Org_ID());

			fl = createFact(m_as, 
					null, 
					m_fact, 
					MAccount.get (getCtx(), Withholding_Acct), 
					m_boe.getC_BPartner_ID() , 
					m_boe.getC_Currency_ID() , 
					m_boe.getC_ConversionType_ID(),
					// se coloca null para que considere la fecha de pago como fecha contable en la factura
					// ya que el pago puede variar de periodo
					null,
					//dateAcct,
					dateAcct,
					datePay,
					m_line,
					IsSOTrx ? null : destAmount,
							IsSOTrx ? destAmount : null,
									m_boe.getAD_Client_ID(),
									m_boe.getAD_Org_ID(),
									m_boe.getDocumentNo(),
									m_boe.getC_DocType_ID());

			fl = createFact(m_as, 
					null, 
					m_fact, 
					MAccount.get (getCtx(), WithholdingExchange_Acct), 
					m_boe.getC_BPartner_ID() , 
					m_boe.getC_Currency_ID() , 
					m_boe.getC_ConversionType_ID(),
					// se coloca null para que considere la fecha de pago como fecha contable en la factura
					// ya que el pago puede variar de periodo
					null,
					//dateAcct,
					dateAcct,
					datePay,
					m_line,
					IsSOTrx ? destAmount : null,
							IsSOTrx ? null : destAmount,					
									m_boe.getAD_Client_ID(),
									m_boe.getAD_Org_ID(),
									m_boe.getDocumentNo(),
									m_boe.getC_DocType_ID());			
		}
		return fl;		
	}
	public FactLine createFactBOE(Timestamp datePay) {
		MAccount account = null;

		Boolean IsSOTrx = false;

		Timestamp dateAcct = null;

		if (allocationSource.signum() > 0)
			IsSOTrx = true;

		MBOEStatement boestate = MBOEStatement.get(m_boe.getC_BOE_ID(), m_boe.getDocStatus(), getTrxName());
		int C_ConversionType_ID = 0;
		Boolean IsLoad = MConversionType.get(Env.getCtx(), m_boe.getC_ConversionType_ID()).isLoad();
		if (boestate == null)
		{
			dateAcct = m_boe.getDateAcct();
			account = m_boe.getAccount(m_as);
			C_ConversionType_ID = m_boe.getC_ConversionType_ID();
		}
		else
		{
			account = boestate.getAccount(m_as);
			C_ConversionType_ID = IsLoad ? MDocType.get(Env.getCtx(), m_boe.getC_DocType_ID()).getC_ConversionType_ID() : m_boe.getC_ConversionType_ID();
			dateAcct = boestate.getDateAcct();
		}
		if (dateAcct == null)
		{
			p_Error = "no existe definida fecha contable en documento origen";
			return null;
		}
		if (account == null || account.getAccount_ID() == 0)
			account = MBOE.getAccount(m_as, m_boe.getDocStatus() , IsSOTrx);						
		if (account == null)
		{
			p_Error = "el estado de la Letra ".concat(m_boe.getDocumentNo()).concat(" es ").concat(m_boe.getDocStatus());
			return null;
		}					
		if (UnGrouped)
			fl = null;
		else
			fl = m_fact.Search(account,  "", m_boe.getDocumentNo());

		m_line.setDateDoc(dateAcct);
		m_line.setDateAcct(datePay);
		m_line.setC_ConversionType_ID(C_ConversionType_ID);

		BigDecimal destAmount = MConversionRate.convert(getCtx(), allocationSource.abs(), m_line.getC_Currency_ID(), 
				m_boe.getC_Currency_ID(), dateAcct, m_boe.getC_ConversionType_ID(), m_boe.getAD_Client_ID(), m_boe.getAD_Org_ID());

		if (destAmount == null)
			throw new ConversionRateException(allocationSource.abs(), m_line.getC_Currency_ID(), m_boe.getC_Currency_ID(), m_boe.getC_ConversionType_ID(), dateAcct );

		fl = createFact(m_as, 
				fl, 
				m_fact, 
				account, 
				m_boe.getC_BPartner_ID() , 
				m_boe.getC_Currency_ID() , 
				m_boe.getC_ConversionType_ID(),
				// se coloca null para que considere la fecha de pago como fecha contable en la factura
				// ya que el pago puede variar de periodo
				null,
				//dateAcct,
				dateAcct,
				datePay,
				m_line,
				IsSOTrx ? null : destAmount,
						IsSOTrx ? destAmount : null,
								m_boe.getAD_Client_ID(),
								m_boe.getAD_Org_ID(),
								m_boe.getDocumentNo(),
								m_boe.getC_DocType_ID());

		int Ref_Acct_ID = getReferenceSource(m_as, m_boe, MBOE.Table_ID);
		fl.setRef_Acct_ID(Ref_Acct_ID);

		AddAmtDoc( m_boe.getC_Currency_ID() != m_as.getC_Currency_ID());

		if (m_boe.getWithholdingAmt().signum() != 0)
		{
			String where = "C_Withholding_ID=? AND C_AcctSchema_ID=? ";
			Integer Withholding_Acct = 0;
			Integer WithholdingExchange_Acct = 0;
			X_C_Withholding_Acct wha = new Query(Env.getCtx(), X_C_Withholding_Acct.Table_Name, where, null)
			.setParameters(m_boe.getC_Withholding_ID(), m_as.getC_AcctSchema_ID()).first();
			if (IsSOTrx)
			{
				Withholding_Acct = wha.getWithholding_Acct();
				WithholdingExchange_Acct = wha.getExchange_Acct();				
			}
			else
			{
				Withholding_Acct = wha.getVendor_Acct();
				WithholdingExchange_Acct = wha.getVendorExchange_Acct();
			}				
			

			destAmount = MConversionRate.convert(getCtx(), m_boe.getWithholdingAmt().abs(), m_boe.getC_Currency_ID(), 
					m_as.getC_Currency_ID(), dateAcct, m_boe.getC_ConversionType_ID(), m_boe.getAD_Client_ID(), m_boe.getAD_Org_ID());

			fl = createFact(m_as, 
					null, 
					m_fact, 
					MAccount.get (getCtx(), Withholding_Acct), 
					m_boe.getC_BPartner_ID() , 
					m_boe.getC_Currency_ID() , 
					m_boe.getC_ConversionType_ID(),
					// se coloca null para que considere la fecha de pago como fecha contable en la factura
					// ya que el pago puede variar de periodo
					null,
					//dateAcct,
					dateAcct,
					datePay,
					m_line,
					IsSOTrx ? null : destAmount,
							IsSOTrx ? destAmount : null,
									m_boe.getAD_Client_ID(),
									m_boe.getAD_Org_ID(),
									m_boe.getDocumentNo(),
									m_boe.getC_DocType_ID());

			fl = createFact(m_as, 
					null, 
					m_fact, 
					MAccount.get (getCtx(), WithholdingExchange_Acct), 
					m_boe.getC_BPartner_ID() , 
					m_boe.getC_Currency_ID() , 
					m_boe.getC_ConversionType_ID(),
					// se coloca null para que considere la fecha de pago como fecha contable en la factura
					// ya que el pago puede variar de periodo
					null,
					//dateAcct,
					dateAcct,
					datePay,
					m_line,
					IsSOTrx ? destAmount : null,
							IsSOTrx ? null : destAmount,					
									m_boe.getAD_Client_ID(),
									m_boe.getAD_Org_ID(),
									m_boe.getDocumentNo(),
									m_boe.getC_DocType_ID());			
		}

		return fl;
	}

	private void AddAmtDoc(Boolean IsDiffCurrency) {
		if (IsDiffCurrency)
			AmtDocAss.add(new Boolean(IsDiffCurrency));
		//AmtDocAss.get(AmtDocAss.size()-1)[0] = adjust;
		//AmtDocAss.get(AmtDocAss.size()-1)[1] = IsDiffCurrency;		
	}

	private void AddPayDoc(Boolean IsDiffCurrency) {
		if (IsDiffCurrency)
			AmtPayAss.add(new Boolean(IsDiffCurrency));
		//AmtPayAss.add(new Object[2]);
		//AmtPayAss.get(AmtPayAss.size()-1)[0] = adjust;
		//AmtPayAss.get(AmtPayAss.size()-1)[1] = IsDiffCurrency;
	}
	
	// rules
	public FactLine createFactPayment(int C_DocType_ID, Boolean AddToPayDoc) {
		
		String doc = getdocreference();
		Boolean IsSOTrx = false;
		if (m_line.getAmtSource().signum() > 0)
			IsSOTrx = true;

		MAccount account = getPaymentAcct(m_as, m_line.getC_Payment_ID());
		if (UnGrouped)
			fl = null;
		else
			fl = m_fact.Search(account, "", doc);
		m_line.setDateDoc(m_payment.getDateTrx());
		setDatePay(m_payment.getDateTrx());
		m_line.setC_ConversionType_ID(m_payment.getC_ConversionType_ID());
		BigDecimal destAmount = MConversionRate.convert(getCtx(), m_line.getAmtSource().abs(), m_line.getC_Currency_ID(), 
				m_payment.getC_Currency_ID(), m_payment.getDateTrx(), m_payment.getC_ConversionType_ID(), getAD_Client_ID(), getAD_Org_ID());

		if (destAmount == null)
			throw new ConversionRateException(m_line.getAmtSource().abs(),m_line.getC_Currency_ID(), 
					m_payment.getC_Currency_ID(),m_payment.getC_ConversionType_ID(), m_payment.getDateTrx() );

		fl = createFact(m_as, 
				fl, 
				m_fact, 
				account , 
				m_payment.getC_BPartner_ID() , 
				m_payment.getC_Currency_ID() , 
				m_payment.getC_ConversionType_ID(),
				m_payment.getDateAcct(),
				m_payment.getDateTrx(),
				m_line,
				IsSOTrx ? destAmount : null,
						IsSOTrx ? null : destAmount,
								getAD_Client_ID(),
								getAD_Org_ID(),
								doc,
								C_DocType_ID);

		if (fl != null)
		{
			//fl.setC_DocType_ID(C_DocType_ID);
			if (AddToPayDoc)
			{
				BigDecimal payamount = MConversionRate.convert(getCtx(), allocationSource.abs(), m_line.getC_Currency_ID(), 
						m_payment.getC_Currency_ID(), m_payment.getDateTrx(), m_payment.getC_ConversionType_ID(), 
						getAD_Client_ID(), getAD_Org_ID());

				payamount = MConversionRate.convert(getCtx(), payamount, m_payment.getC_Currency_ID(), 
						m_as.getC_Currency_ID(), m_payment.getDateTrx(), m_payment.getC_ConversionType_ID(), 
						getAD_Client_ID(), getAD_Org_ID(), true);

				if (!payamount.equals(fl.getAcctBalance()) && UnGrouped)
					throw new XendraException("no cuadra");

				AddPayDoc(m_payment.getC_Currency_ID() != m_as.getC_Currency_ID());
			}			
		}
		return fl;
	}

	public String getdocreference()
	{
		String doc = "";
		if (m_bank != null && m_bank.isOwnBank())
		{
			String paydoc = m_payment.getDocumentNo();
			// pattern is integer , valida si el numero de documento tiene un numero  
			Pattern isInteger = Pattern.compile("\\d+");
			java.util.regex.Matcher m = isInteger.matcher(paydoc);

			if (m.find())
			{
				doc = m_payment.getDocumentNo();	
			}			
		}
		else if (m_invoice != null)
		{
			doc = m_invoice.getDocumentNo();
		}
		return doc;
	}
	// rules
	public FactLine createFactPaymentLine(int C_DocType_ID, Boolean AddToPayDoc) {
		String doc = getdocreference();
		MAccount account = getPaymentAcct(m_as, m_payment.getC_Payment_ID());
		if (UnGrouped)
			fl = null;
		else
			fl = m_fact.Search(account, "", doc);
		m_line.setDateDoc(m_payment.getDateTrx());
		m_line.setDateAcct(getDateAcct());
		m_line.setC_ConversionType_ID(m_paymentline.getC_ConversionType_ID());

		BigDecimal destAmount = MConversionRate.convert(getCtx(), m_line.getAmtSource().abs(), m_line.getC_Currency_ID(), 
				m_payment.getC_Currency_ID(), m_payment.getDateTrx(), m_paymentline.getC_ConversionType_ID(), m_paymentline.getAD_Client_ID(), m_paymentline.getAD_Org_ID());

		BigDecimal withHoldingAmt = MConversionRate.convert(getCtx(), m_line.getWithholdingAmt().abs(), m_line.getC_Currency_ID(), 
				m_payment.getC_Currency_ID(), m_payment.getDateTrx(), m_paymentline.getC_ConversionType_ID(), m_paymentline.getAD_Client_ID(), m_paymentline.getAD_Org_ID());
		
		if (destAmount == null)
			throw new ConversionRateException(m_line.getAmtSource().abs(),
						m_line.getC_Currency_ID(), m_payment.getC_Currency_ID(),m_paymentline.getC_ConversionType_ID(), 
						m_payment.getDateTrx() );
		
		if (withHoldingAmt == null)
			withHoldingAmt = Env.ZERO;
		
		destAmount = destAmount.add(withHoldingAmt);

		fl = createFact(m_as, 
				fl, 
				m_fact, 
				account , 
				m_paymentline.getC_BPartner_ID() , 
				m_payment.getC_Currency_ID() , 
				m_paymentline.getC_ConversionType_ID(),
				m_payment.getDateAcct(),
				m_payment.getDateTrx(),
				m_line,
				m_line.getAmtSource().compareTo(Env.ZERO) > 0 ? destAmount : null,
				m_line.getAmtSource().compareTo(Env.ZERO) > 0 ? null : destAmount,
				m_paymentline.getAD_Client_ID(),
				m_paymentline.getAD_Org_ID(),
				doc,
				C_DocType_ID);


		if (AddToPayDoc)
		{
			BigDecimal payamount = MConversionRate.convert(getCtx(), allocationSource.abs(), m_line.getC_Currency_ID(), 
					m_paymentline.getC_Currency_ID(), m_payment.getDateTrx(), m_paymentline.getC_ConversionType_ID(), 
					getAD_Client_ID(), getAD_Org_ID());

			payamount = MConversionRate.convert(getCtx(), payamount, m_paymentline.getC_Currency_ID(), 
					m_as.getC_Currency_ID(), m_payment.getDateTrx(), m_paymentline.getC_ConversionType_ID(),
					getAD_Client_ID(), getAD_Org_ID(), true);

			if (!payamount.equals(fl.getAcctBalance()) && UnGrouped)
				throw new XendraException("no cuadra");

			AddPayDoc(m_paymentline.getC_Currency_ID() != m_as.getC_Currency_ID());
		}
		//if (fl != null)
		//	fl.setC_DocType_ID(C_DocType_ID);
		return fl;			
	}

	public FactLine createFactPaymentLine(MPaymentLine paymentline, int C_DocType_ID, Boolean AddToPayDoc) {

		String IsOwnBank = Env.getContext(Env.getCtx(), "IsOwnBank");
		String doc = "";
		if (IsOwnBank.equals("N"))
		{
			MInvoice inv = MInvoice.get(Env.getCtx(), paymentline.getC_Invoice_ID());
			if (inv != null && inv.getC_Invoice_ID() > 0)
			{
				doc = inv.getDocumentNo();
			}
		}	
		else
		{
			String paydoc = paymentline.getPayment().getDocumentNo();
			// pattern is integer , valida si el numero de documento tiene un numero  
			Pattern isInteger = Pattern.compile("\\d+");
			java.util.regex.Matcher m = isInteger.matcher(paydoc);

			if (m.find())
			{
				doc = paymentline.getPayment().getDocumentNo();	
			}
		}
		Boolean IsSOTrx = false;
		if (m_line.getAmtSource().compareTo(Env.ZERO) > 0)
			IsSOTrx = true;
		else
			IsSOTrx = false;		

		MAccount account = getPaymentAcct(m_as, paymentline.getPayment().getC_Payment_ID());
		if (UnGrouped)
			fl = null;
		else
			fl = m_fact.Search(account, "", doc);
		m_line.setDateDoc(paymentline.getPayment().getDateTrx());
		m_line.setDateAcct(getDateAcct());
		m_line.setC_ConversionType_ID(paymentline.getC_ConversionType_ID());

		BigDecimal destAmount = MConversionRate.convert(getCtx(), m_line.getAmtSource().abs(), m_line.getC_Currency_ID(), 
				paymentline.getPayment().getC_Currency_ID(), paymentline.getPayment().getDateTrx(), paymentline.getC_ConversionType_ID(), paymentline.getAD_Client_ID(), paymentline.getAD_Org_ID());

		BigDecimal withHoldingAmt = MConversionRate.convert(getCtx(), m_line.getWithholdingAmt().abs(), m_line.getC_Currency_ID(), 
				paymentline.getPayment().getC_Currency_ID(), paymentline.getPayment().getDateTrx(), paymentline.getC_ConversionType_ID(), paymentline.getAD_Client_ID(), paymentline.getAD_Org_ID());
		
		if (destAmount == null)
			throw new ConversionRateException(m_line.getAmtSource().abs(),
						m_line.getC_Currency_ID(), paymentline.getPayment().getC_Currency_ID(),paymentline.getC_ConversionType_ID(), 
						paymentline.getPayment().getDateTrx() );
		
		if (withHoldingAmt == null)
			withHoldingAmt = Env.ZERO;
		
		destAmount = destAmount.add(withHoldingAmt);

		fl = createFact(m_as, 
				fl, 
				m_fact, 
				account , 
				paymentline.getC_BPartner_ID() , 
				paymentline.getPayment().getC_Currency_ID() , 
				paymentline.getC_ConversionType_ID(),
				paymentline.getPayment().getDateAcct(),
				paymentline.getPayment().getDateTrx(),
				m_line,
				IsSOTrx ? destAmount : null,
						IsSOTrx ? null : destAmount,
								paymentline.getAD_Client_ID(),
								paymentline.getAD_Org_ID(),
								doc,
								C_DocType_ID);


		if (AddToPayDoc)
		{
			BigDecimal payamount = MConversionRate.convert(getCtx(), allocationSource.abs(), m_line.getC_Currency_ID(), 
					paymentline.getC_Currency_ID(), paymentline.getPayment().getDateTrx(), paymentline.getC_ConversionType_ID(), 
					getAD_Client_ID(), getAD_Org_ID());

			payamount = MConversionRate.convert(getCtx(), payamount, paymentline.getC_Currency_ID(), 
					m_as.getC_Currency_ID(), paymentline.getPayment().getDateTrx(), paymentline.getC_ConversionType_ID(),
					getAD_Client_ID(), getAD_Org_ID(), true);

			if (!payamount.equals(fl.getAcctBalance()) && UnGrouped)
				throw new XendraException("no cuadra");

			AddPayDoc(paymentline.getC_Currency_ID() != m_as.getC_Currency_ID());
		}
		//if (fl != null)
		//	fl.setC_DocType_ID(C_DocType_ID);
		return fl;			
	}

	
	public FactLine createFactPayment(MPayment payment, int C_DocType_ID, Boolean AddToPayDoc) {

		String doc = "";
		String IsOwnBank = Env.getContext(Env.getCtx(), "IsOwnBank");
		if (isExchange() || IsOwnBank.equals("N") && m_boe != null)
		{			
			doc = m_boe.getDocumentNo();
		}
		else
		{
			String paydoc = payment.getDocumentNo();	
			// Integer
			Pattern p = Pattern.compile("\\d+");
			java.util.regex.Matcher m = p.matcher(paydoc);

			if (m.find())
			{
				doc = payment.getDocumentNo();	
			}
		}

		Boolean IsSOTrx = false;
		if (m_line.getAmtSource().signum() > 0)
			IsSOTrx = true;

		MAccount account = getPaymentAcct(m_as, m_line.getC_Payment_ID());
		if (UnGrouped)
			fl = null;
		else
			fl = m_fact.Search(account, "", doc);
		m_line.setDateDoc(payment.getDateTrx());
		m_line.setC_ConversionType_ID(payment.getC_ConversionType_ID());
		BigDecimal destAmount = MConversionRate.convert(getCtx(), m_line.getAmtSource().abs(), m_line.getC_Currency_ID(), 
				payment.getC_Currency_ID(), payment.getDateTrx(), payment.getC_ConversionType_ID(), getAD_Client_ID(), getAD_Org_ID());

		if (destAmount == null)
			throw new ConversionRateException(m_line.getAmtSource().abs(),m_line.getC_Currency_ID(), payment.getC_Currency_ID(),payment.getC_ConversionType_ID(), payment.getDateTrx() );

		fl = createFact(m_as, 
				fl, 
				m_fact, 
				account , 
				payment.getC_BPartner_ID() , 
				payment.getC_Currency_ID() , 
				payment.getC_ConversionType_ID(),
				payment.getDateAcct(),
				payment.getDateTrx(),
				m_line,
				IsSOTrx ? destAmount : null,
						IsSOTrx ? null : destAmount,
								getAD_Client_ID(),
								getAD_Org_ID(),
								doc,
								C_DocType_ID);

		if (fl != null)
		{
			//fl.setC_DocType_ID(C_DocType_ID);
			if (AddToPayDoc)
			{
				BigDecimal payamount = MConversionRate.convert(getCtx(), allocationSource.abs(), m_line.getC_Currency_ID(), 
						payment.getC_Currency_ID(), payment.getDateTrx(), payment.getC_ConversionType_ID(), 
						getAD_Client_ID(), getAD_Org_ID());

				payamount = MConversionRate.convert(getCtx(), payamount, payment.getC_Currency_ID(), 
						m_as.getC_Currency_ID(), payment.getDateTrx(), payment.getC_ConversionType_ID(), 
						getAD_Client_ID(), getAD_Org_ID(), true);

				if (!payamount.equals(fl.getAcctBalance()) && UnGrouped)
					throw new XendraException("no cuadra");

				AddPayDoc(payment.getC_Currency_ID() != m_as.getC_Currency_ID());
			}			
		}
		return fl;
	}

	public FactLine createFactCashLine(int C_DocType_ID, Boolean AddToPayDoc)
	{
		Boolean IsSOTrx = false;		
		if (m_line.getAmtSource().signum() == 1)
			IsSOTrx = true;

		MCashLine cashLine = new MCashLine (getCtx(), m_line.getC_CashLine_ID(), getTrxName());				
		MCash cash = new MCash(Env.getCtx(), cashLine.getC_Cash_ID(), null);
		MCashBook cb = new MCashBook(Env.getCtx(), cash.getC_CashBook_ID(), null);					
		MAccount account = getCashAcct(m_as, m_line.getC_CashLine_ID());

		m_line.setDateDoc(cash.getStatementDate());
		m_line.setC_ConversionType_ID(cb.getC_ConversionType_ID());					
			
		BigDecimal destAmount = MConversionRate.convert(getCtx(), allocationSource.abs(), m_line.getC_Currency_ID(), 
				cash.getC_Currency_ID(), cash.getStatementDate(), cb.getC_ConversionType_ID(), getAD_Client_ID(), getAD_Org_ID());
				
		if (destAmount == null)
		{
			String msg = "";
			if (cb.getC_ConversionType_ID() == 0)
			{
				msg = " no existe Tipo de moneda para el "+Msg.translate(Env.getCtx(), "C_CashBook_ID");
			}

			throw new ConversionRateException(msg, allocationSource.abs(), m_line.getC_Currency_ID(), cash.getC_Currency_ID(),cb.getC_ConversionType_ID(), cash.getStatementDate() );
		}

		BigDecimal WithholdingAmt = MConversionRate.convert(getCtx(), m_line.getWithholdingAmt().abs(), m_line.getC_Currency_ID(), 
				cash.getC_Currency_ID(), cash.getStatementDate(), cb.getC_ConversionType_ID(), getAD_Client_ID(), getAD_Org_ID());
		
		if (WithholdingAmt.compareTo(BigDecimal.ZERO) > 0)
		{
			destAmount = destAmount.add(WithholdingAmt);
		}
		
		MPayment payrefcash = null;
		String payref = "";
		if (cash.getC_Payment_ID() > 0)
		{
			payrefcash = new MPayment(Env.getCtx(), cash.getC_Payment_ID(), null);
			payref = payrefcash.getDocumentNo();
		}
		else
		{
			payref = String.valueOf(cash.getC_Cash_ID());
		}		
		if (UnGrouped)
			fl = null;
		else
			fl = m_fact.Search(account, cash.getC_BPartner_ID());
		fl = createFact(m_as, 
				fl, 
				m_fact, 
				account , 
				cash.getC_BPartner_ID() , 
				cash.getC_Currency_ID() , 
				cb.getC_ConversionType_ID(),
				cash.getDateAcct(),
				cash.getStatementDate(),
				m_line,
				IsSOTrx ? destAmount : null,
						IsSOTrx ? null : destAmount,											
								getAD_Client_ID(),
								getAD_Org_ID(), 
								payref,
								C_DocType_ID);		
		if (fl != null)
		{
			fl.setC_BPartner_ID(cash.getC_BPartner_ID());
			//fl.setC_DocType_ID(C_DocType_ID);

			if (AddToPayDoc)
			{			
				BigDecimal adjust = MConversionRate.convert(getCtx(), destAmount.abs(), cash.getC_Currency_ID(), 
						m_as.getC_Currency_ID(), cash.getStatementDate(), cb.getC_ConversionType_ID(), 
						getAD_Client_ID(), getAD_Org_ID(), true);

				if (adjust == null)
					throw new ConversionRateException(destAmount.abs(), cash.getC_Currency_ID(), m_as.getC_Currency_ID(),cb.getC_ConversionType_ID(), cash.getStatementDate() /*boepay.getDate() */);

				if (!adjust.equals(fl.getAcctBalance()) && UnGrouped)
					throw new XendraException("no cuadra");

				this.AddPayDoc(cash.getC_Currency_ID() != m_as.getC_Currency_ID());
				//				AmtPayAss.add(new Object[2]);
				//				AmtPayAss.get(AmtPayAss.size()-1)[0] = adjust;
				//				if (cash.getC_Currency_ID() != m_as.getC_Currency_ID())
				//					AmtPayAss.get(AmtPayAss.size()-1)[1] = true;
			}

		}
		return fl;
	}

	private FactLine createFactCharge(MAccount account,
			int C_Currency_ID, 
			int C_Invoice_ID, 
			int C_BOE_ID, 
			int C_BPartner_ID, 
			int C_DocType_ID, 
			Timestamp DateDoc, 
			int C_ConversionType_ID, 
			String DocumentNo)
	{		
		Boolean IsSOTrx = false;
		if (m_line.getAmtSource().compareTo(Env.ZERO) > 0)
			IsSOTrx = true;
		else
			IsSOTrx = false;

		account = MCharge.getAccount(m_line.getC_Charge_ID(), m_as, m_line.getAmtSource().abs());
		if (UnGrouped)
			fl = null;
		else
			fl = m_fact.Search(account, C_BPartner_ID, DocumentNo);

		if (m_paymentline != null)
			DateDoc = m_paymentline.getPayment().getDateAcct();
		else if (m_payment != null)
			DateDoc = m_payment.getDateAcct();

		fl = createFact(m_as, 
				fl, 
				m_fact, 
				account , 
				C_BPartner_ID , 
				C_Currency_ID, 
				C_ConversionType_ID,
				DateDoc,
				DateDoc,
				m_line,
				IsSOTrx ? null : m_line.getAmtSource().abs(),
						IsSOTrx ? m_line.getAmtSource().abs() : null,
								getAD_Client_ID(),
								getAD_Org_ID(),
								DocumentNo,
								C_DocType_ID);
		return fl;
	}

	public FactLine createFactBOEPay(int C_BankAccount_ID, String DocumentNo, boolean AddToPayDoc)
	{		
		MBOE boepay = new Query(Env.getCtx(), X_C_BOE.Table_Name, "C_BOE_ID = ?", null)
			.setParameters(m_line.getRecord_ID()).first();
		if (boepay != null)
		{
			setDatePay(boepay.getDateBOE());
			Boolean IsSOTrx = m_line.getAmtSource().compareTo(Env.ZERO) > 0 ? true : false;
			MAccount account = getBOEAcct(m_as, boepay.isSOTrx());
			if (UnGrouped)
				fl = null;
			else			
				fl = m_fact.Search(account, "", boepay.getDocumentNo());

			BigDecimal destAmount = MConversionRate.convert(getCtx(), allocationSource.abs(), m_line.getC_Currency_ID(), 
					boepay.getC_Currency_ID(), boepay.getDateBOE(), boepay.getC_ConversionType_ID(), getAD_Client_ID(), getAD_Org_ID());

			
			//{}
			//MInvoice invoice = MInvoice.get(Env.getCtx(), m_line.getC_Invoice_ID());
			if (m_invoice != null && m_invoice.getWithholdingPercent().signum() > 0)
			{
				String query = "C_Invoice_ID = ? AND C_BOE_ID = ? ";
				MBOELine line = new Query(Env.getCtx(), MBOELine.Table_Name, query, this.getTrxName())
				.setParameters(m_line.getC_Invoice_ID(), m_line.getRecord_ID())
				.first();
				if (line != null)
				{
					BigDecimal PayAmt = line.getAmount();				
					BigDecimal whAmt = PayAmt; 
					PayAmt = PayAmt.multiply(Env.ONEHUNDRED);
					PayAmt = PayAmt.divide(Env.ONEHUNDRED.add(m_invoice.getWithholdingPercent()), BigDecimal.ROUND_HALF_UP);
					PayAmt = PayAmt.setScale(2, BigDecimal.ROUND_HALF_UP);
					whAmt = whAmt.subtract(PayAmt);
					whAmt = MConversionRate.convert(getCtx(), whAmt, m_line.getC_Currency_ID(),
							boepay.getC_Currency_ID(), boepay.getDateBOE(), boepay.getC_ConversionType_ID(), getAD_Client_ID(), getAD_Org_ID());

					fl = createFactWithholding(account, whAmt, boepay.getDocumentNo());
				}
			}

			if (destAmount == null)
				throw new ConversionRateException(allocationSource.abs(), m_line.getC_Currency_ID(), boepay.getC_Currency_ID(),boepay.getC_ConversionType_ID(), boepay.getDateBOE() );

			if (UnGrouped)
				fl = null;
			else			
				fl = m_fact.Search(account, "", boepay.getDocumentNo());
			fl = createFact(m_as, 
					fl, 
					m_fact, 
					account, 
					boepay.getC_BPartner_ID() , 
					boepay.getC_Currency_ID() , 
					boepay.getC_ConversionType_ID(),
					null,
					boepay.getDateBOE(),
					m_line,									
					IsSOTrx ? destAmount : null,
							IsSOTrx ? null : destAmount,
									getAD_Client_ID(),
									getAD_Org_ID(),
									boepay.getDocumentNo(),
									boepay.getC_DocType_ID());

			if (AddToPayDoc)
			{
				BigDecimal adjust = MConversionRate.convert(getCtx(), destAmount, boepay.getC_Currency_ID(), 
						m_as.getC_Currency_ID(), boepay.getDateBOE(), boepay.getC_ConversionType_ID(), 
						getAD_Client_ID(), getAD_Org_ID(), true);

				if (adjust == null)
					throw new ConversionRateException(destAmount, boepay.getC_Currency_ID(), m_as.getC_Currency_ID(),boepay.getC_ConversionType_ID(), boepay.getDateBOE());

				if (!adjust.equals(fl.getAcctBalance()) && UnGrouped)
					throw new XendraException("no cuadra");	        	

				this.AddPayDoc(boepay.getC_Currency_ID() != m_as.getC_Currency_ID());
			}

			if (isExchange() && C_BankAccount_ID > 0)
			{
				// crear la cuenta paralela por pagar de la letra renovada
				int acct = DB.getSQLValue(null, "SELECT boe_confirm_acct FROM C_BankAccount_Acct WHERE C_BankAccount_ID=? AND C_AcctSchema_ID=?", C_BankAccount_ID, m_as.getC_AcctSchema_ID());
				account = MAccount.get (m_as.getCtx(), acct);
				if (UnGrouped)
					fl = null;
				else	            
					fl = m_fact.Search(account,  "", DocumentNo);
				fl = createFact(m_as, 
						fl, 
						m_fact, 
						account, 
						boepay.getC_BPartner_ID() , 
						boepay.getC_Currency_ID() , 
						boepay.getC_ConversionType_ID(),
						boepay.getDateAcct(),
						boepay.getDate(),
						m_line,									
						IsSOTrx ? destAmount : null,
								IsSOTrx ? null : destAmount,
										getAD_Client_ID(),
										getAD_Org_ID(),
										DocumentNo,
										boepay.getC_DocType_ID());	
				if (UnGrouped)
					fl = null;
				else	            
					fl = m_fact.Search(account, "", boepay.getDocumentNo());
				fl = createFact(m_as, 
						fl, 
						m_fact, 
						account, 
						boepay.getC_BPartner_ID() , 
						boepay.getC_Currency_ID() , 
						boepay.getC_ConversionType_ID(),
						boepay.getDateAcct(),
						boepay.getDate(),
						m_line,
						IsSOTrx ? null : destAmount,
								IsSOTrx ? destAmount : null,									
										getAD_Client_ID(),
										getAD_Org_ID(),
										boepay.getDocumentNo(),
										boepay.getC_DocType_ID());	
			}
		}
		else
		{
			if (p_Error != null)
				p_Error = p_Error.concat(" la Letra con ID ").concat(String.valueOf(m_line.getRecord_ID())).concat(" a sido eliminada");
			else
				p_Error = " la Letra con ID ".concat(String.valueOf(m_line.getRecord_ID())).concat(" a sido eliminada");

			fl = null;
		}
		return fl;
	}
	
	private void setDatePay(Timestamp datepay) {
		m_datepay = datepay;		
	}	
	private Timestamp getDatePay() {
		return m_datepay;
	}
	/**
	 * 	Create Cash Based Acct
	 * 	@param as accounting schema
	 *	@param fact fact
	 *	@param invoice invoice
	 *	@param allocationSource allocation amount (incl discount, writeoff)
	 *	@return Accounted Amt
	 */
	private BigDecimal createCashBasedAcct (MAcctSchema as, Fact fact, MInvoice invoice, 
			BigDecimal allocationSource)
	{
		BigDecimal allocationAccounted = Env.ZERO;
		//	Multiplier
		double percent = invoice.getGrandTotal().doubleValue() / allocationSource.doubleValue();
		if (percent > 0.99 && percent < 1.01)
			percent = 1.0;
		log.config("Multiplier=" + percent + " - GrandTotal=" + invoice.getGrandTotal()
				+ " - Allocation Source=" + allocationSource);

		//	Get Invoice Postings
		Doc_Invoice docInvoice = (Doc_Invoice)Doc.get(new MAcctSchema[]{as}, 
				MInvoice.Table_ID, invoice.getC_Invoice_ID(), getTrxName());
		docInvoice.loadDocumentDetails();
		allocationAccounted = docInvoice.createFactCash(as, fact, new BigDecimal(percent));
		log.config("Allocation Accounted=" + allocationAccounted);

		//	Cash Based Commitment Release 
		if (as.isCreateCommitment() && !invoice.isSOTrx())
		{
			MInvoiceLine[] lines = invoice.getLines();
			for (int i = 0; i < lines.length; i++)
			{
				Fact factC = Doc_Order.getCommitmentRelease(as, this, 
						lines[i].getQtyInvoiced(), lines[i].getC_InvoiceLine_ID(), new BigDecimal(percent));
				if (factC == null)
					return null;
				m_facts.add(factC);
			}
		}	//	Commitment

		return allocationAccounted;
	}	//	createCashBasedAcct


	private MAccount getBOEAcct ( MAcctSchema as,  boolean IsSoTrx)
	{		
		return MBOE.getAccount(as, DocAction.STATUS_Portfolio , IsSoTrx);
	}
	/**
	 * 	Get Payment (Unallocated Payment or Payment Selection) Acct of Bank Account
	 *	@param as accounting schema
	 *	@param C_Payment_ID payment
	 *	@return acct
	 */
	private MAccount getPaymentAcct (MAcctSchema as, int C_Payment_ID)
	{
		setC_BankAccount_ID(0);
		//	Doc.ACCTTYPE_UnallocatedCash (AR) or C_Prepayment 
		//	or Doc.ACCTTYPE_PaymentSelect (AP) or V_Prepayment
		int accountType = Doc.ACCTTYPE_UnallocatedCash;
		//
		String sql = "SELECT p.C_BankAccount_ID, d.DocBaseType, p.IsReceipt, p.IsPrepayment "
				+ "FROM C_Payment p INNER JOIN C_DocType d ON (p.C_DocType_ID=d.C_DocType_ID) "
				+ "WHERE C_Payment_ID=?";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, getTrxName());
			pstmt.setInt (1, C_Payment_ID);
			ResultSet rs = pstmt.executeQuery ();
			if (rs.next ())
			{
				setC_BankAccount_ID(rs.getInt(1));
				if (REF_C_DocTypeDocBaseType.APPayment.equals(rs.getString(2)))
					accountType = Doc.ACCTTYPE_PaymentSelect;
				//	Prepayment
				if ("Y".equals(rs.getString(4)))		//	Prepayment
				{
					if ("Y".equals(rs.getString(3)))	//	Receipt
						accountType = Doc.ACCTTYPE_C_Prepayment;
					else
						accountType = Doc.ACCTTYPE_V_Prepayment;
				}
			}
			rs.close ();
			pstmt.close ();
			pstmt = null;
		} 
		catch (Exception e)
		{
			log.log(Level.SEVERE, sql, e);
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

		//
		if (getC_BankAccount_ID() <= 0)
		{
			log.log(Level.SEVERE, "NONE for C_Payment_ID=" + C_Payment_ID);
			return null;
		}
		return getAccount (accountType, as);
	}	//	getPaymentAcct

	/**
	 * 	Get Cash (Transfer) Acct of CashBook
	 *	@param as accounting schema
	 *	@param C_CashLine_ID
	 *	@return acct
	 */
	private MAccount getCashAcct (MAcctSchema as, int C_CashLine_ID)
	{
		String sql = "SELECT c.C_CashBook_ID "
				+ "FROM C_Cash c, C_CashLine cl "
				+ "WHERE c.C_Cash_ID=cl.C_Cash_ID AND cl.C_CashLine_ID=?";
		setC_CashBook_ID(DB.getSQLValue(null, sql, C_CashLine_ID));
		if (getC_CashBook_ID() <= 0)
		{
			log.log(Level.SEVERE, "NONE for C_CashLine_ID=" + C_CashLine_ID);
			return null;
		}
		return getAccount(Doc.ACCTTYPE_CashTransfer, as);
	}	//	getCashAcct


	/**************************************************************************
	 * 	Create Tax Correction.
	 * 	Requirement: Adjust the tax amount, if you did not receive the full
	 * 	amount of the invoice (payment discount, write-off).
	 * 	Applies to many countries with VAT.
	 * 	Example:
	 * 		Invoice:	Net $100 + Tax1 $15 + Tax2 $5 = Total $120
	 * 		Payment:	$115 (i.e. $5 underpayment)
	 * 		Tax Adjustment = Tax1 = 0.63 (15/120*5) Tax2 = 0.21 (5/120/5) 
	 * 
	 * 	@param as accounting schema
	 * 	@param fact fact
	 * 	@param line Allocation line
	 *	@param DiscountAccount discount acct
	 *	@param WriteOffAccoint write off acct
	 *	@return true if created
	 */
	private boolean createTaxCorrection (MAcctSchema as, Fact fact, 
			DocLine_Allocation line,
			MAccount DiscountAccount, MAccount WriteOffGainAccount, MAccount WriteOffLossAccount)
	{
		log.info (line.toString());
		BigDecimal discount = Env.ZERO;
		if (as.isTaxCorrectionDiscount())
			discount = line.getDiscountAmt();
		BigDecimal writeOff = Env.ZERO;
		if (as.isTaxCorrectionWriteOff())
			writeOff = line.getWriteOffAmt();

		Doc_AllocationTax tax = new Doc_AllocationTax (
				DiscountAccount, discount, 	WriteOffGainAccount, WriteOffLossAccount, writeOff);

		//	Get Source Amounts with account
		String sql = "SELECT * "
				+ "FROM Fact_Acct "
				+ "WHERE AD_Table_ID=318 AND Record_ID=?"	//	Invoice
				+ " AND C_AcctSchema_ID=?"
				+ " AND Line_ID IS NULL";	//	header lines like tax or total
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql, getTrxName());
			pstmt.setInt(1, line.getC_Invoice_ID());
			pstmt.setInt(2, as.getC_AcctSchema_ID());
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
				tax.addInvoiceFact (new MFactAcct(getCtx(), rs, fact.get_TrxName()));
			rs.close();
			pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, sql, e);
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
		//	Invoice Not posted
		if (tax.getLineCount() == 0)
		{
			log.warning ("Invoice not posted yet - " + line);
			return false;
		}
		//	size = 1 if no tax
		if (tax.getLineCount() < 2)
			return true;
		return tax.createEntries (as, fact, line);

	}	//	createTaxCorrection

	public void createFact_ID() {
		MAllocationHdr alloc = (MAllocationHdr)getPO();
		if (getFact_ID().length() == 0 || getFact_ID().compareTo("NSD") == 0)
			setFact_ID (
					MGLBookPeriod.getID(alloc.getAD_Org_ID(),
							alloc.getAD_Client_ID(), 
							alloc.Table_ID, 
							0, 
							"", 
							alloc.getDateAcct())
					);	
		else
		{
			MPeriod period = MPeriod.get (Env.getCtx(), alloc.getDateAcct(), alloc.getAD_Org_ID() , alloc.getAD_Client_ID());
			if (period == null)
			{
				p_Error = "Error: se debe seleccionar un periodo o un calendario en cliente u organizacion";
				log.log(Level.SEVERE, p_Error);				
			}			
			MYear year = new MYear(Env.getCtx(), period.getC_Year_ID(),getTrxName());
			Calendar cal = Calendar.getInstance();
			cal.setTime(alloc.getDateAcct());
			int pos = -1;
			if (getFact_ID().indexOf(year.getFiscalYear()) != -1 && getFact_ID().length() > 4 )
			{
				pos = getFact_ID().indexOf(year.getFiscalYear()) + 4;
				if ( getFact_ID().substring(pos, pos + 1).equals("-"))
				{
					pos = pos+1;
				}				
			}
			int month = pos != -1 ? Integer.parseInt(getFact_ID().substring(pos, pos + 2)) : 0;
			if (pos == -1) // a���o fiscal no encontrado, otro a���o, regenerar.
			{
				setFact_ID (
						MGLBookPeriod.getID(alloc.getAD_Org_ID(),
								alloc.getAD_Client_ID(), 
								alloc.Table_ID, 
								0, 
								"", 
								alloc.getDateAcct())
						);	
				return;
			}
			else if (month != cal.get(Calendar.MONTH) + 1) // mismo a���o , diferente mes, regenerar.
			{
				setFact_ID (
						MGLBookPeriod.getID(alloc.getAD_Org_ID(),
								alloc.getAD_Client_ID(), 
								alloc.Table_ID, 
								0, 
								"", 
								alloc.getDateAcct())
						);									
			}
		}

		//
	}

}   //  Doc_Allocation

/**
 * 	Allocation Document Tax Handing
 *	
 *  @author Jorg Janke
 *  @version $Id: Doc_Allocation.java,v 1.1 2007/06/15 00:03:24 sergioaguayo Exp $
 */
class Doc_AllocationTax
{
	/**
	 * 	Allocation Tax Adjustment
	 *	@param DiscountAccount discount acct
	 *	@param DiscountAmt discount amt
	 *	@param WriteOffAccount write off acct
	 *	@param WriteOffAmt write off amt
	 */
	public Doc_AllocationTax (MAccount DiscountAccount, BigDecimal DiscountAmt,
			MAccount WriteOffGainAccount, MAccount WriteOffLossAccount, BigDecimal WriteOffAmt)
	{
		m_DiscountAccount = DiscountAccount;
		m_DiscountAmt = DiscountAmt;
		m_WriteOffGainAccount = WriteOffGainAccount;
		m_WriteOffLossAccount = WriteOffLossAccount;
		m_WriteOffAmt = WriteOffAmt;
	}	//	Doc_AllocationTax

	private CLogger				log = CLogger.getCLogger(getClass());

	private MAccount			m_DiscountAccount;
	private BigDecimal 			m_DiscountAmt;
	private MAccount			m_WriteOffGainAccount;
	private MAccount			m_WriteOffLossAccount;
	private BigDecimal 			m_WriteOffAmt;

	private ArrayList<MFactAcct>	m_facts  = new ArrayList<MFactAcct>();
	private int					m_totalIndex = 0;

	/**
	 * 	Add Invoice Fact Line
	 *	@param fact fact line
	 */
	public void addInvoiceFact (MFactAcct fact)
	{
		m_facts.add(fact);
	}	//	addInvoiceLine

	/**
	 * 	Get Line Count
	 *	@return number of lines
	 */
	public int getLineCount()
	{
		return m_facts.size();
	}	//	getLineCount

	/**
	 * 	Create Accounting Entries
	 *	@param as account schema
	 *	@param fact fact to add lines
	 *	@param line line
	 *	@return true if created
	 */
	public boolean createEntries (MAcctSchema as, Fact fact, DocLine line)
	{
		//	get total index (the Receivables/Liabilities line)
		BigDecimal total = Env.ZERO;
		for (int i = 0; i < m_facts.size(); i++)
		{
			MFactAcct factAcct = (MFactAcct)m_facts.get(i);
			if (factAcct.getAmtSourceDr().compareTo(total) > 0)
			{
				total = factAcct.getAmtSourceDr();
				m_totalIndex = i; 
			}
			if (factAcct.getAmtSourceCr().compareTo(total) > 0)
			{
				total = factAcct.getAmtSourceCr();
				m_totalIndex = i; 
			}
		}

		MFactAcct factAcct = (MFactAcct)m_facts.get(m_totalIndex);
		log.info ("Total Invoice = " + total + " - " +  factAcct);
		int precision = as.getStdPrecision();
		for (int i = 0; i < m_facts.size(); i++)
		{
			//	No Tax Line
			if (i == m_totalIndex)
				continue;

			factAcct = (MFactAcct)m_facts.get(i);
			log.info (i + ": " + factAcct);

			//	Create Tax Account
			MAccount taxAcct = factAcct.getMAccount();
			if (taxAcct == null || taxAcct.get_ID() == 0)
			{
				log.severe ("Tax Account not found/created");
				return false;
			}


			//	Discount Amount	
			if (m_DiscountAmt.signum() != 0)
			{
				//	Original Tax is DR - need to correct it CR
				if (Env.ZERO.compareTo(factAcct.getAmtSourceDr()) != 0)
				{
					BigDecimal amount = calcAmount(factAcct.getAmtSourceDr(), 
							total, m_DiscountAmt, precision);
					if (amount.signum() != 0)
					{
						fact.createLine (line, m_DiscountAccount,
								as.getC_Currency_ID(), amount, null);
						fact.createLine (line, taxAcct,
								as.getC_Currency_ID(), null, amount);
					}
				}
				//	Original Tax is CR - need to correct it DR
				else
				{
					BigDecimal amount = calcAmount(factAcct.getAmtSourceCr(), 
							total, m_DiscountAmt, precision);
					if (amount.signum() != 0)
					{
						fact.createLine (line, taxAcct,
								as.getC_Currency_ID(), amount, null);
						fact.createLine (line, m_DiscountAccount,
								as.getC_Currency_ID(), null, amount);
					}
				}
			}	//	Discount

			//	WriteOff Amount	
			if (m_WriteOffAmt.signum() != 0)
			{
				//	Original Tax is DR - need to correct it CR
				if (Env.ZERO.compareTo(factAcct.getAmtSourceDr()) != 0)
				{
					BigDecimal amount = calcAmount(factAcct.getAmtSourceDr(), 
							total, m_WriteOffAmt, precision);
					if (amount.signum() != 0)
					{
						if (amount.signum() > 0) {
							fact.createLine (line, m_WriteOffGainAccount,
									as.getC_Currency_ID(), amount, null);
							fact.createLine (line, taxAcct,
									as.getC_Currency_ID(), null, amount);
						}
						else {
							fact.createLine (line, m_WriteOffLossAccount,
									as.getC_Currency_ID(), null, amount.negate());
							fact.createLine (line, taxAcct,
									as.getC_Currency_ID(), amount.negate(), null);
						}

					}
				}
				//	Original Tax is CR - need to correct it DR
				else
				{
					BigDecimal amount = calcAmount(factAcct.getAmtSourceCr(), 
							total, m_WriteOffAmt, precision);
					if (amount.signum() != 0)
					{
						if (amount.signum() > 0) {
							fact.createLine (line, taxAcct,
									as.getC_Currency_ID(), amount, null);
							fact.createLine (line, m_WriteOffGainAccount,
									as.getC_Currency_ID(), null, amount);
						}
						else {
							fact.createLine (line, taxAcct,
									as.getC_Currency_ID(), null, amount.negate());
							fact.createLine (line, m_WriteOffLossAccount,
									as.getC_Currency_ID(), amount.negate(), null);							
						}
					}
				}
			}	//	WriteOff

		}	//	for all lines
		return true;
	}	//	createEntries

	/**
	 * 	Calc Amount tax / (total-tax) * amt
	 *	@param tax tax
	 *	@param total total
	 *	@param amt reduction amt
	 *	@param precision precision
	 *	@return tax / total * amt
	 */
	private BigDecimal calcAmount (BigDecimal tax, BigDecimal total, BigDecimal amt, int precision)
	{
		log.fine("Amt=" + amt + " - Total=" + total + ", Tax=" + tax);
		if (tax.signum() == 0 
				|| total.signum() == 0
				|| amt.signum() == 0)
			return Env.ZERO;
		//
		BigDecimal devisor = total.subtract(tax); 
		BigDecimal multiplier = tax.divide(devisor, 10, BigDecimal.ROUND_HALF_UP); 
		BigDecimal retValue = multiplier.multiply(amt);
		if (retValue.scale() > precision)
			retValue = retValue.setScale(precision, BigDecimal.ROUND_HALF_UP);
		log.fine(retValue + " (Mult=" + multiplier + "(Prec=" + precision + ")");
		return retValue;
	}	//	calcAmount

}	//	Doc_AllocationTax
