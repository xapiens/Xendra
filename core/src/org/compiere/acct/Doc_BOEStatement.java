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
import org.compiere.model.MBOEStatement;
import org.compiere.model.MConversionRate;
import org.compiere.model.MConversionType;
import org.compiere.model.MDocType;
import org.compiere.model.MGLBookPeriod;
import org.compiere.model.MInvoice;
import org.compiere.model.MPeriod;
import org.compiere.model.MYear;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;
import org.compiere.process.DocAction;
import org.compiere.util.*;
import org.xendra.exceptions.ConversionRateException;

/**
 *  Post BOE Documents.
 *  <pre>
 *  Table:              C_BOE
 *  Document Types:     CMA
 *  </pre>
 *  @author Xapiens
 */

public class Doc_BOEStatement extends Doc
{
	/**
	 *  Constructor
	 * 	@param ass accounting schemata
	 * 	@param rs record
	 * 	@param trxName trx
	 */
	protected Doc_BOEStatement (MAcctSchema[] ass, ResultSet rs, String trxName)
	{
		super (ass, MBOEStatement.class, rs, REF_C_DocTypeDocBaseType.BillOfExchange, trxName);
	}   //  Doc_BOEStatement

	/**	Tolearance G&L				*/
	private static final BigDecimal	TOLERANCE = new BigDecimal (0.02);
	/** Facts						*/
	private ArrayList<Fact>		m_facts = null;

	private String m_status = "";
	
	private String m_prestatus = "";
	
	private MBOE boe = null;
	
	private Integer m_BOEStatement_ID = 0;
	
 	private Boolean IsLoad = false;

	/**
	 *  Load Specific Document Details
	 *  @return error message or null
	 */
	protected String loadDocumentDetails ()
	{
		MBOEStatement line = (MBOEStatement)getPO();
				
		setC_BOEStatement_ID(line.getC_BOEStatement_ID());
		setDateDoc(line.getStatusDate());
		setDateAcct(line.getDateAcct());
		setStatus(line.getStatus());	
		setPreStatus(line.getPreStatus());	
		//setDateAcct(line.getDateAcct());	//	Overwritten on Line Level		
		boe  = new MBOE(Env.getCtx(),line.getC_BOE_ID(), getTrxName() );
		
		MConversionType ct = MConversionType.get(Env.getCtx(), boe.getC_ConversionType_ID());
		IsLoad = ct.isLoad();
		
		setAmount(AMTTYPE_Gross, boe.getGrandTotal());
		setC_BPartner_ID(boe.getC_BPartner_ID());
		setC_Currency_ID (line.getC_Currency_ID());
		return null;		
	}   //  loadDocumentDetails

	private void setStatus(String status) {
		m_status = status;
	}
	
	private String getStatus() {
		return m_status;
	}

	private void setPreStatus(String Prestatus) {
		m_prestatus = Prestatus;
	}
	
	private String getPreStatus() {
		return m_prestatus;
	}
	
	private void setC_BOEStatement_ID(Integer C_BOEStatement_ID)
	{
		m_BOEStatement_ID = C_BOEStatement_ID;
	}

	private Integer getC_BOEStatement_ID()
	{
		return m_BOEStatement_ID;
	}
	
	
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
	 *  BOE.
     *
	 *  Tax needs to be corrected for discount & write-off;
	 *  Currency gain & loss is realized here.
	 *  @param as accounting schema
	 *  @return Fact
	 */
	public ArrayList<Fact> createFacts (MAcctSchema as)
	{
		m_facts = new ArrayList<Fact>();

		//  create Fact Header
		Fact fact = new Fact(this, as, Fact.POST_Actual);
	
		int C_ConversionType_ID = IsLoad ? MDocType.get(Env.getCtx(), boe.getC_DocType_ID()).getC_ConversionType_ID() : boe.getC_ConversionType_ID();
		
		if (getDocumentType().equals(REF_C_DocTypeDocBaseType.BillOfExchange))
		{			
								
				if (boe.getC_BOE_ID() != 0	&& Env.ZERO.compareTo(boe.getGrandTotal()) == 0)				
					return null;
				
				FactLine fl = null;

				DocLine docLine = new DocLine (boe, this);				
				docLine.setC_ConversionType_ID(C_ConversionType_ID);

				if (!getStatus().equals(DocAction.STATUS_Portfolio))
				{		
						MAccount acct = null;
						if (getStatus().equals(DocAction.STATUS_Warranty))
							acct = getAccount(Doc.ACCTYPE_BOE_wr, as);
						else if (getStatus().equals(DocAction.STATUS_Receivables))
							acct = getAccount(Doc.ACCTYPE_BOE_rv, as);
						else if (getStatus().equals(DocAction.STATUS_Discount))
							acct = getAccount(Doc.ACCTYPE_BOE_ds, as);
						else if (getStatus().equals(DocAction.STATUS_Protested))
							acct = getAccount(Doc.ACCTYPE_BOE_pd, as);
						if (acct == null)
							acct = MBOE.getAccount(as, getStatus() , isSOTrx());

						
						fl = fact.Search(acct, "", boe.getDocumentNo());
						fl = createFact(as, 
								fl, 
								fact, 
								acct, 
								boe.getC_BPartner_ID() , 
								getC_Currency_ID() , 
								C_ConversionType_ID,								
								getDateAcct(),
								getDateDoc(),
								docLine,
								boe.getGrandTotal(),
								null,
								getAD_Client_ID(),
								getAD_Org_ID(),
								boe.getDocumentNo(),
								boe.getC_DocType_ID());							

						//if (fl == null)
						//{
						//		fl.setC_DocType_ID(boe.getC_DocType_ID());
						//}						
						if (getPreStatus() == null || getPreStatus().equals(DocAction.STATUS_Drafted) )
						{
							// getting link
							MInvoice invoice = null;
							int Ref_Acct_ID = 0;
							if (boe.getC_Invoice_ID() != 0)
							{
								invoice = new MInvoice (getCtx(), boe.getC_Invoice_ID(), null);							
								Ref_Acct_ID = getReferenceSource(as, invoice, invoice.Table_ID);
							}
							int receivables_ID = getValidCombination_ID(Doc.ACCTTYPE_C_Receivable, as);
							acct = MAccount.get(getCtx(), receivables_ID);
							fl = fact.Search(acct, "", boe.getDocumentNo());
							fl = createFact(as, 
									fl, 
									fact, 
									acct, 
									boe.getC_BPartner_ID() , 
									getC_Currency_ID() , 
									C_ConversionType_ID,
									boe.getDateAcct(),
									boe.getDateBOE(),
									docLine,
									null,
									boe.getGrandTotal(),
									getAD_Client_ID(),
									getAD_Org_ID(),
									boe.getDocumentNo(),
									boe.getC_DocType_ID());							

							if (fl == null)
							{
									fl.setRef_Acct_ID(Ref_Acct_ID);	
									//fl.setC_DocType_ID(boe.getC_DocType_ID());
							}
						}
						else
						{
							// getting link
							if (getPreStatus().equals(DocAction.STATUS_Warranty))
								acct = getAccount(Doc.ACCTYPE_BOE_wr, as);
							else if (getPreStatus().equals(DocAction.STATUS_Receivables))
								acct = getAccount(Doc.ACCTYPE_BOE_rv, as);
							else if (getPreStatus().equals(DocAction.STATUS_Discount))
								acct = getAccount(Doc.ACCTYPE_BOE_ds, as);
							else if (getPreStatus().equals(DocAction.STATUS_Protested))
								acct = getAccount(Doc.ACCTYPE_BOE_pd, as);
							else if (getPreStatus().equals(DocAction.STATUS_Portfolio))
							{
								acct = MBOE.getAccount(as, getPreStatus() , isSOTrx());
								//docLine.setDateDoc(boe.getDateBOE());
							}
							MBOEStatement statement = MBOEStatement.get(boe.getC_BOE_ID(), getPreStatus(), getTrxName());
							if (statement != null)
								docLine.setDateDoc(statement.getStatusDate());
							else
							{
								//docLine.setDateDoc(boe.getDateBOE());
								docLine.setC_ConversionType_ID(boe.getC_ConversionType_ID());
							}							
							int Ref_Acct_ID = DB.getSQLValue(null, "SELECT fact_acct_id from fact_acct WHERE account_id = ? AND ad_table_id = ? AND record_id = ?",acct.getAccount_ID(),MBOEStatement.Table_ID, getC_BOEStatement_ID() );
												
							fl = fact.Search(acct, "", boe.getDocumentNo());
							fl = createFact(as, 
									fl, 
									fact, 
									acct, 
									boe.getC_BPartner_ID() , 
									getC_Currency_ID() , 
									C_ConversionType_ID,
									//boe.getDateAcct(),
									getDateAcct(),
									statement == null ? boe.getDateBOE() : statement.getDateAcct() /* boepay.getDate() */,
									docLine,
									null,
									boe.getGrandTotal(),
									getAD_Client_ID(),
									getAD_Org_ID(),
									boe.getDocumentNo(),
									boe.getC_DocType_ID());
							//if (fl != null)
							//	fl.setC_DocType_ID(boe.getC_DocType_ID());														
						}
						p_Error = createRealizedGainLoss (as, fact, boe, null);												
				}
				//	Purchase Invoice
				else
				{
					
				}
												
			//}		for all lines
		}
		
		//	reset line info
		setC_BPartner_ID(0);
		//
		m_facts.add(fact);
		return m_facts;
	}   //  createFact

	/**************************************************************************
	 * 	Create Realized Gain & Loss.
	 * 	Compares the Accounted Amount of the Invoice to the
	 * 	Accounted Amount of the Allocation
	 *	@param as accounting schema
	 *	@param fact fact
	 *	@param acct account
	 *	@param invoice invoice
	 *	@param allocationSource source amt
	 *	@param allocationAccounted acct amt
	 *	@return Error Message or null if OK
	 */
	private String createRealizedGainLoss (MAcctSchema as, Fact fact, MBOE boe, DocLine line)
	{
		if (boe.getC_Currency_ID() == as.getC_Currency_ID())
			return null;
		
		int C_ConversionType_ID = 0;
		Timestamp previousDateDoc = null;
		MBOEStatement statement = MBOEStatement.get(boe.getC_BOE_ID(), getPreStatus(), getTrxName());
		if (statement != null)
		{
			previousDateDoc = statement.getDateAcct();
			C_ConversionType_ID = IsLoad ? MDocType.get(Env.getCtx(), boe.getC_DocType_ID()).getC_ConversionType_ID() : boe.getC_ConversionType_ID();
		}
		else
		{
			previousDateDoc = boe.getDateBOE();
			C_ConversionType_ID = boe.getC_ConversionType_ID();
		}
			
		
		BigDecimal cnvAmount = boe.getGrandTotal().abs();
		BigDecimal boeAmount = Env.ZERO;
		BigDecimal payAmount = Env.ZERO;

		boeAmount = MConversionRate.convert(getCtx(), cnvAmount,  boe.getC_Currency_ID(), 
				as.getC_Currency_ID(), getDateDoc(), boe.getC_ConversionType_ID() , boe.getAD_Client_ID(), boe.getAD_Org_ID());
				//as.getC_Currency_ID(), getDateDoc(), MDocType.get(Env.getCtx(), boe.getC_DocType_ID()).getC_ConversionType_ID() , boe.getAD_Client_ID(), boe.getAD_Org_ID());
		
		if (boeAmount == null)
			throw new ConversionRateException(cnvAmount, boe.getC_Currency_ID(), as.getC_Currency_ID(), boe.getC_ConversionType_ID(), getDateDoc() );
		
		payAmount = MConversionRate.convert(getCtx(), cnvAmount,  boe.getC_Currency_ID(), 
				 as.getC_Currency_ID(), previousDateDoc, C_ConversionType_ID, boe.getAD_Client_ID(), boe.getAD_Org_ID());

		if (payAmount == null)		
			throw new ConversionRateException(cnvAmount, boe.getC_Currency_ID(), as.getC_Currency_ID(),boe.getC_ConversionType_ID(), previousDateDoc );
		
		if (boeAmount.compareTo(payAmount) == 0)
			return null;
		
		MAccount gain = MAccount.get (as.getCtx(), as.getAcctSchemaDefault().getRealizedGain_Acct());
		MAccount loss = MAccount.get (as.getCtx(), as.getAcctSchemaDefault().getRealizedLoss_Acct());

		FactLine fl = new FactLine (getCtx(), get_Table_ID(), 
				get_ID(), 0, getFact_ID(), getTrxName());

		BigDecimal diff = boeAmount.subtract(payAmount).abs();

		if (boe.isSOTrx())
		{
			if (boeAmount.compareTo(payAmount) < 0)
				fl = fact.createLine( line, loss, as.getC_Currency_ID(), diff, Env.ZERO);
			else
				fl = fact.createLine( line, gain, as.getC_Currency_ID(), Env.ZERO, diff);
		}
		else
		{
			if (boeAmount.compareTo(payAmount) < 0)
				fl = fact.createLine( line, loss, as.getC_Currency_ID(), diff, Env.ZERO);
			else
				fl = fact.createLine( line, gain, as.getC_Currency_ID(), Env.ZERO, diff);			
		}
		return null;
	}	//	createRealizedGainLoss

	public void createFact_ID() {
		MBOEStatement boestatement = (MBOEStatement)getPO();		
		if (getFact_ID().length() == 0 || getFact_ID().compareTo("NSD") == 0)
		{
			setFact_ID (
					MGLBookPeriod.getID(boestatement.getAD_Org_ID(),
										boestatement.getAD_Client_ID(),
										boestatement.Table_ID, 
										0, 
										isSOTrx()==true ? "Y":"N", 
										boestatement.getDateAcct())
					);
		}
		else
		{
			MPeriod period = MPeriod.get (Env.getCtx(), boestatement.getDateAcct(), boestatement.getAD_Org_ID() , boestatement.getAD_Client_ID());
			if (period == null)
			{
				p_Error = "Error: se debe seleccionar un periodo o un calendario en cliente u organizacion";
				log.log(Level.SEVERE, p_Error);				
			}			
			MYear year = new MYear(Env.getCtx(), period.getC_Year_ID(),getTrxName());
			Calendar cal = Calendar.getInstance();
			cal.setTime(boestatement.getDateAcct());	
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
			
			if (pos == -1) // año fiscal no encontrado, otro año, regenerar.
			{
				setFact_ID (
						MGLBookPeriod.getID(boestatement.getAD_Org_ID(),
											boestatement.getAD_Client_ID(),
											boestatement.Table_ID, 
											0, 
											isSOTrx()==true ? "Y":"N", 
											boestatement.getDateAcct())
						);
				return;
			}
			else if (month != cal.get(Calendar.MONTH) + 1) // mismo año , diferente mes, regenerar.
			{
				setFact_ID (
						MGLBookPeriod.getID(boestatement.getAD_Org_ID(),
											boestatement.getAD_Client_ID(),
											boestatement.Table_ID, 
											0, 
											isSOTrx()==true ? "Y":"N", 
											boestatement.getDateAcct())
						);
			}
		}
		
	}

}   //  Doc_BOEStatement