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

import org.compiere.model.MAccount;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MGLBookPeriod;
import org.compiere.model.MJournal;
import org.compiere.model.MJournalLine;
import org.compiere.model.MPeriod;
import org.compiere.model.MYear;
import org.compiere.model.persistence.X_GL_JournalLine;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;

import java.util.logging.*;

import org.compiere.util.*;

/**
 *  Post Invoice Documents.
 *  <pre>
 *  Table:              GL_Journal (224)
 *  Document Types:     GLJ
 *  </pre>
 *  @author Jorg Janke
 *  @version  $Id: Doc_GLJournal.java,v 1.1 2007/06/15 00:03:24 sergioaguayo Exp $
 */
public class Doc_GLJournal extends Doc
{
	/**
	 *  Constructor
	 * 	@param ass accounting schemata
	 * 	@param rs record
	 * 	@param trxName trx
	 */
	protected Doc_GLJournal (MAcctSchema[] ass, ResultSet rs, String trxName)
	{
		super(ass, MJournal.class, rs, null, trxName);
	}	//	Foc_GL_Journal

	/** Posting Type				*/
	private String			m_PostingType = null;
	private int				m_C_AcctSchema_ID = 0;
	private int 			m_C_DocType_ID = 0;
	private Boolean		    m_IsClose = false;
	/**
	 *  Load Specific Document Details
	 *  @return error message or null
	 */
	protected String loadDocumentDetails ()
	{
		MJournal journal = (MJournal)getPO();
		m_PostingType = journal.getPostingType();
		m_C_AcctSchema_ID = journal.getC_AcctSchema_ID();
		m_C_DocType_ID = journal.getC_DocType_ID();
		m_IsClose = journal.isCloseDocument();	
			//setFact_ID(DB.getNextAcctID(getAD_Client_ID(), journal.getDateAcct(), getTrxName()));

		//	Contained Objects
		p_lines = loadLines(journal);
		log.fine("Lines=" + p_lines.length);
		return null;
	}   //  loadDocumentDetails


	/**
	 *	Load Invoice Line
	 *	@param journal journal
	 *  @return DocLine Array
	 */
	private DocLine[] loadLines(MJournal journal)
	{
		ArrayList<DocLine> list = new ArrayList<DocLine>();
		MJournalLine[] lines = journal.getLines(false);
		for (int i = 0; i < lines.length; i++)
		{
			MJournalLine line = lines[i];
			DocLine docLine = new DocLine (line, this); 
			//  --  Source Amounts
			docLine.setAmount (line.getAmtSourceDr(), line.getAmtSourceCr());
			//  --  Converted Amounts
			docLine.setConvertedAmt (m_C_AcctSchema_ID, line.getAmtAcctDr(), line.getAmtAcctCr());
			//  --  Account
			MAccount account = line.getAccount();
			docLine.setAccount (account);
			//	--	Organization of Line was set to Org of Account
			list.add(docLine);
		}
		//	Return Array
		int size = list.size();
		DocLine[] dls = new DocLine[size];
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
		StringBuffer sb = new StringBuffer (" [");
		//  Lines
		for (int i = 0; i < p_lines.length; i++)
		{
			retValue = retValue.add(p_lines[i].getAmtSource());
			sb.append("+").append(p_lines[i].getAmtSource());
		}
		sb.append("]");
		//
		log.fine(toString() + " Balance=" + retValue + sb.toString());
		return retValue;
	}   //  getBalance

	/**
	 *  Create Facts (the accounting logic) for
	 *  GLJ.
	 *  (only for the accounting scheme, it was created)
	 *  <pre>
	 *      account     DR          CR
	 *  </pre>
	 *  @param as acct schema
	 *  @return Fact
	 */
	public ArrayList<Fact> createFacts (MAcctSchema as)
	{
		ArrayList<Fact> facts = new ArrayList<Fact>();
		//	Other Acct Schema
		if (as.getC_AcctSchema_ID() != m_C_AcctSchema_ID)
			return facts;
		
		//  create Fact Header
		Fact fact = new Fact (this, as, m_PostingType);

		//  GLJ
		if (getDocumentType().equals(REF_C_DocTypeDocBaseType.GLJournal))
		{
			//  account     DR      CR
			for (int i = 0; i < p_lines.length; i++)
			{
				if (p_lines[i].getC_AcctSchema_ID () == as.getC_AcctSchema_ID ())
				{
					String DocumentNo = ((MJournalLine)p_lines[i].p_po).getReferenceNo();
					String serial  = ((MJournalLine)p_lines[i].p_po).getSerial();
					FactLine line = fact.createLine (p_lines[i],
									p_lines[i].getAccount (),
									p_lines[i].getC_Currency_ID(),
									p_lines[i].getAmtSourceDr (),
									p_lines[i].getAmtSourceCr ());
					if (line != null)
					{
						line.setIsCloseDocument(m_IsClose);
					}
					if (line != null && DocumentNo != null)
					{
						line.setSerial(serial);
						line.setInvoiceDocumentNo(DocumentNo);
						int C_DocType_ID = p_lines[i].getValue(X_GL_JournalLine.COLUMNNAME_C_DocType_ID);
						if (C_DocType_ID > 0)
						{
						line.setC_DocType_ID(C_DocType_ID);
						}
					}
				}
			}	//	for all lines
		}
		else
		{
			p_Error = "DocumentType unknown: " + getDocumentType();
			log.log(Level.SEVERE, p_Error);
			fact = null;
		}
		//
		facts.add(fact);
		return facts;
	}   //  createFact


	public void createFact_ID() {
		MJournal journal = (MJournal)getPO();
		if (getFact_ID().length()==0)
			setFact_ID (
					MGLBookPeriod.getID(journal.getAD_Org_ID(),
										journal.getAD_Client_ID(),
										journal.Table_ID, 
										journal.getC_DocType_ID(), 
										"", 
										journal.getDateAcct())
					);		
		else
		{
			MPeriod period = MPeriod.get (Env.getCtx(), journal.getDateAcct(), journal.getAD_Org_ID() , journal.getAD_Client_ID());
			if (period == null)
			{
				p_Error = "Error: se debe seleccionar un periodo o un calendario en cliente u organizacion";
				log.log(Level.SEVERE, p_Error);				
			}			
			MYear year = new MYear(Env.getCtx(), period.getC_Year_ID(),getTrxName());
			Calendar cal = Calendar.getInstance();
			cal.setTime(journal.getDateAcct());
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
						MGLBookPeriod.getID(journal.getAD_Org_ID(),
											journal.getAD_Client_ID(),
											journal.Table_ID, 
											journal.getC_DocType_ID(), 
											"", 
											journal.getDateAcct())
						);		
				return;
			}
			else if (month != cal.get(Calendar.MONTH) + 1) // mismo año , diferente mes, regenerar.
			{
				setFact_ID (
						MGLBookPeriod.getID(journal.getAD_Org_ID(),
											journal.getAD_Client_ID(),
											journal.Table_ID, 
											journal.getC_DocType_ID(), 
											"", 
											journal.getDateAcct())
						);		
			}
		}
		
	}

}   //  Doc_GLJournal
