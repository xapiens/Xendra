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
import org.compiere.model.MGLBookPeriod;
import org.compiere.model.MInvoice;
import org.compiere.model.MPeriod;
import org.compiere.model.MRetention;
import org.compiere.model.MRetentionStatement;
import org.compiere.model.MYear;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;
import org.compiere.process.DocAction;
import org.compiere.util.*;
import org.xendra.exceptions.ConversionRateException;

/**
 *  Post Retention Documents.
 *  <pre>
 *  Table:              C_RetentionStatement
 *  Document Types:     CMA
 *  </pre>
 *  @author Xapiens
 *  @version  $Id: Doc_RetentionStatement.java,v 1.1 2007/06/15 00:03:24  Exp $
 */

public class Doc_RetentionStatement extends Doc
{
	/**
	 *  Constructor
	 * 	@param ass accounting schemata
	 * 	@param rs record
	 * 	@param trxName trx
	 */
	protected Doc_RetentionStatement (MAcctSchema[] ass, ResultSet rs, String trxName)
	{
		super (ass, MRetentionStatement.class, rs, REF_C_DocTypeDocBaseType.Retention, trxName);
	}   //  Doc_RetentionStatement

	/**	Tolearance G&L				*/
	private static final BigDecimal	TOLERANCE = new BigDecimal (0.02);
	/** Facts						*/
	private ArrayList<Fact>		m_facts = null;

	private String m_status = "";
	
	private String m_prestatus = "";
	private Integer m_retention_id = 0;
	private Integer m_retentionstatement_id;

	/**
	 *  Load Specific Document Details
	 *  @return error message or null
	 */
	protected String loadDocumentDetails ()
	{
		MRetentionStatement retstatement = (MRetentionStatement)getPO();
		setStatus(retstatement.getStatus());	
		setPreStatus(retstatement.getPreStatus());	
		setC_Retention_ID(retstatement.getC_Retention_ID());
		setC_RetentionStatement_ID(retstatement.getC_RetentionStatement_ID());
		
		//	Amounts
		MRetention boe  = new MRetention(Env.getCtx(),retstatement.getC_Retention_ID(), getTrxName() );
		setAmount(AMTTYPE_Gross, boe.getTaxAmt());
		setC_BPartner_ID(boe.getC_BPartner_ID());
		setC_Currency_ID (retstatement.getC_Currency_ID());
		return null;		
	}   //  loadDocumentDetails

	private void setC_Retention_ID(int RetentionID) {
		m_retention_id = RetentionID;
	}

	private Integer getC_Retention_ID() {
		return m_retention_id;
	}
	
	private void setC_RetentionStatement_ID(int cRetentionStatementID) {
		m_retentionstatement_id = cRetentionStatementID;
	}

	private Integer getC_RetentionStatement_ID() {
		return m_retentionstatement_id;
	}
	
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
	 *  Tax needs to be corrected for discount & write-off;
	 *  @param as accounting schema
	 *  @return Fact
	 */
	public ArrayList<Fact> createFacts (MAcctSchema as)
	{
		//  create Fact Header
		Fact fact = new Fact(this, as, Fact.POST_Actual);
		
		MRetention retention = null;
		
		if (getC_Retention_ID() != 0)
			retention = new MRetention(Env.getCtx(), getC_Retention_ID(), null);
				
		if (DocAction.STATUS_Collect.equals(getStatus())) 
		{
			MAccount account = MRetention.getAccount(as, getPreStatus());
			MRetentionStatement retstat = (MRetentionStatement) getPO();
			int GroupID  = retstat.getMRetention().getC_GroupDoc_ID();
			if (GroupID > 0)
			{
				MRetention[] retentions = MRetention.getGroup(GroupID, null);
				
				for (MRetention ret:retentions) 
				{
					if (ret == null)
						continue;
					if (ret.getDocStatus().compareTo(DocAction.STATUS_Closed) == 0)
					{
						MInvoice invoice = MInvoice.get(Env.getCtx(),  ret.getC_Invoice_ID());						
						String invoiceref = "";						
						if (invoice.getSerial() != null && invoice.getSerial().length() > 0 )
							invoiceref = invoice.getSerial().concat("-");
						if (invoice.getDocumentNo() != null)
							invoiceref = invoiceref.concat(invoice.getDocumentNo());							
						FactLine fl = createFact(as, 
								null, 
								fact, 
								account , 
								ret.getC_BPartner_ID() , 
								ret.getC_Currency_ID() , 
								ret.getC_ConversionType_ID(),
								null,
								null,
								null,
								ret.getTaxAmt().compareTo(Env.ZERO) < 0 ? ret.getTaxAmt().abs() : null,
								ret.getTaxAmt().compareTo(Env.ZERO) < 0 ? null : ret.getTaxAmt(),
								ret.getAD_Client_ID(),
								ret.getAD_Org_ID(),
								invoiceref,
								ret.getC_DocType_ID());
						if (fl == null)
							return null;
					}
				}
			}
			else
				return null;
			
			account = MRetention.getAccount(as, getStatus());
			FactLine fl = null;			
			fl = createFact(as, 
					null, 
					fact, 
					account , 
					retention.getC_BPartner_ID() , 
					retention.getC_Currency_ID() , 
					retention.getC_ConversionType_ID(),
					null,
					null,
					null,					
					getAmount(),
					null,
					getAD_Client_ID(),
					getAD_Org_ID(),
					retention.getDocumentNo(),
					retention.getC_DocType_ID());										
		}
		else if (DocAction.STATUS_Apply.equals(getStatus()))
		{
			MAccount account = MRetention.getAccount(as, getPreStatus());
			FactLine fl = null;
			MRetentionStatement retstat = (MRetentionStatement) getPO();
			fl = fact.Search(account, "", retention.getDocumentNo());
			fl = createFact(as, 
					fl, 
					fact, 
					account , 
					retention.getC_BPartner_ID() , 
					retention.getC_Currency_ID() , 
					retention.getC_ConversionType_ID(),
					retstat.getDateAcct(),				
					retstat.getDateDoc(),
					null,
					null,
					getAmount(),
					getAD_Client_ID(),
					getAD_Org_ID(),
					retention.getDocumentNo(),
					retention.getC_DocType_ID());

			account = MRetention.getAccount(as, getStatus());
			
			fl = createFact(as, 
					null, 
					fact, 
					account , 
					retention.getC_BPartner_ID() , 
					retention.getC_Currency_ID() , 
					retention.getC_ConversionType_ID(),					
					retstat.getDateAcct(),
					retstat.getDateDoc(),
					null,					
					getAmount(),
					null,
					getAD_Client_ID(),
					getAD_Org_ID(),
					retention.getDocumentNo(),
					retention.getC_DocType_ID());													
		}
		ArrayList<Fact> facts = new ArrayList<Fact>();
		facts.add(fact);
		return facts;
}
	/**
	 * 	Get AD_Org_ID from Bank Account
	 * 	@return AD_Org_ID or 0
	 */
	private int getRetention_Org_ID ()
	{
		MRetentionStatement retstatement = (MRetentionStatement)getPO();
		if (retstatement != null)
			return retstatement.getAD_Org_ID();
		else
			return 0;
	}	//	getRetention_Org_ID

	public void createFact_ID() {
		/* Fact ID */
		MRetentionStatement retstatement = (MRetentionStatement)getPO();
		if (getFact_ID().length() == 0 || getFact_ID().compareTo("NSD") == 0)
			setFact_ID (
					MGLBookPeriod.getID(retstatement.getAD_Org_ID(),
										retstatement.getAD_Client_ID(),
										retstatement.Table_ID, 
										0, 
										isSOTrx()==true ? "Y":"N", 
										retstatement.getDateAcct())
					);		
		else
		{
			MPeriod period = MPeriod.get (Env.getCtx(), retstatement.getDateAcct(), retstatement.getAD_Org_ID() , retstatement.getAD_Client_ID());
			MYear year = new MYear(Env.getCtx(), period.getC_Year_ID(),getTrxName());
			Calendar cal = Calendar.getInstance();
			cal.setTime(retstatement.getDateAcct());
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
						MGLBookPeriod.getID(retstatement.getAD_Org_ID(),
											retstatement.getAD_Client_ID(),
											retstatement.Table_ID, 
											0, 
											isSOTrx()==true ? "Y":"N", 
											retstatement.getDateAcct())
						);		
				return;
			}
			else if (month != cal.get(Calendar.MONTH) + 1) // mismo año , diferente mes, regenerar.
			{
				setFact_ID (
						MGLBookPeriod.getID(retstatement.getAD_Org_ID(),
											retstatement.getAD_Client_ID(),
											retstatement.Table_ID, 
											0, 
											isSOTrx()==true ? "Y":"N", 
											retstatement.getDateAcct())
						);		
			}
		}
		
	}		
}   //  Doc_RetentionStatement