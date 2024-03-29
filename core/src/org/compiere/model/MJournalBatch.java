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

import java.io.*;
import java.math.*;
import java.sql.*;
import java.util.*;
import java.util.logging.*;

import org.compiere.acct.Doc;
import org.compiere.model.persistence.X_GL_JournalBatch;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;
import org.compiere.model.reference.REF__DocumentAction;
import org.compiere.model.reference.REF__DocumentStatus;
import org.compiere.model.reference.REF__PostingType;
import org.compiere.process.*;
import org.compiere.util.*;

/**
 *  Journal Batch Model
 *
 *	@author Jorg Janke
 *	@version $Id: MJournalBatch.java 5822 2016-06-15 22:56:06Z xapiens $
 */
public class MJournalBatch extends X_GL_JournalBatch implements DocAction
{
	/**
	 * 	Create new Journal Batch by copying
	 * 	@param ctx context
	 *	@param GL_JournalBatch_ID journal batch
	 * 	@param dateDoc date of the document date
	 *	@param trxName transaction
	 *	@return Journal Batch
	 */
	public static MJournalBatch copyFrom (Properties ctx, int GL_JournalBatch_ID, 
		Timestamp dateDoc, String trxName)
	{
		MJournalBatch from = new MJournalBatch (ctx, GL_JournalBatch_ID, trxName);
		if (from.getGL_JournalBatch_ID() == 0)
			throw new IllegalArgumentException ("From Journal Batch not found GL_JournalBatch_ID=" + GL_JournalBatch_ID);
		//
		MJournalBatch to = new MJournalBatch (ctx, 0, trxName);
		PO.copyValues(from, to, from.getAD_Client_ID(), from.getAD_Org_ID());
		to.set_ValueNoCheck ("DocumentNo", null);
		to.set_ValueNoCheck ("C_Period_ID", null);
		to.setDateAcct(dateDoc);
		to.setDateDoc(dateDoc);
		to.setDocStatus(REF__DocumentStatus.Drafted);
		to.setDocAction(REF__DocumentAction.Complete);
		to.setIsApproved(false);
		to.setProcessed (false);
		//
		if (!to.save())
			throw new IllegalStateException("Could not create Journal Batch");

		if (to.copyDetailsFrom(from) == 0)
			throw new IllegalStateException("Could not create Journal Batch Details");

		return to;
	}	//	copyFrom
	
	
	/**************************************************************************
	 * 	Standard Construvtore
	 *	@param ctx context
	 *	@param GL_JournalBatch_ID id if 0 - create actual batch
	 *	@param trxName transaction
	 */
	public MJournalBatch (Properties ctx, int GL_JournalBatch_ID, String trxName)
	{
		super (ctx, GL_JournalBatch_ID, trxName);
		if (GL_JournalBatch_ID == 0)
		{
		//	setGL_JournalBatch_ID (0);	PK
		//	setDescription (null);
		//	setDocumentNo (null);
		//	setC_DocType_ID (0);
			setPostingType (REF__PostingType.Actual);
			setDocAction (REF__DocumentAction.Complete);
			setDocStatus (REF__DocumentStatus.Drafted);
			setTotalCr (Env.ZERO);
			setTotalDr (Env.ZERO);
			setProcessed (false);
			setProcessing (false);
			setIsApproved(false);
		}
	}	//	MJournalBatch

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MJournalBatch (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MJournalBatch

	/**
	 * 	Copy Constructor.
	 * 	Dos not copy: Dates/Period
	 *	@param original original
	 */
	public MJournalBatch (MJournalBatch original)
	{
		this (original.getCtx(), 0, original.get_TrxName());
		setClientOrg(original);
		setGL_JournalBatch_ID(original.getGL_JournalBatch_ID());
		//
	//	setC_AcctSchema_ID(original.getC_AcctSchema_ID());
	//	setGL_Budget_ID(original.getGL_Budget_ID());
		setGL_Category_ID(original.getGL_Category_ID());
		setPostingType(original.getPostingType());
		setDescription(original.getDescription());
		setC_DocType_ID(original.getC_DocType_ID());
		setControlAmt(original.getControlAmt());
		//
		setC_Currency_ID(original.getC_Currency_ID());
	//	setC_ConversionType_ID(original.getC_ConversionType_ID());
	//	setCurrencyRate(original.getCurrencyRate());
		
	//	setDateDoc(original.getDateDoc());
	//	setDateAcct(original.getDateAcct());
	//	setC_Period_ID(original.getC_Period_ID());
	}	//	MJournal
	
	
	
	/**
	 * 	Overwrite Client/Org if required
	 * 	@param AD_Client_ID client
	 * 	@param AD_Org_ID org
	 */
	public void setClientOrg (int AD_Client_ID, int AD_Org_ID)
	{
		super.setClientOrg(AD_Client_ID, AD_Org_ID);
	}	//	setClientOrg

	/**
	 * 	Set Accounting Date.
	 * 	Set also Period if not set earlier
	 *	@param DateAcct date
	 */
	public void setDateAcct (Timestamp DateAcct)
	{
		super.setDateAcct(DateAcct);
		if (DateAcct == null)
			return;
		if (getC_Period_ID() != 0)
			return;
		int C_Period_ID = 0;
		MPeriod p  = MPeriod.get(Env.getCtx(), DateAcct, getAD_Org_ID(), getAD_Client_ID());
		if (p != null)
			C_Period_ID = p.getC_Period_ID();
		if (C_Period_ID == 0)
			log.warning("Period not found");
		else
			setC_Period_ID(C_Period_ID);
	}	//	setDateAcct

	/**
	 * 	Get Journal Lines
	 * 	@param requery requery
	 *	@return Array of lines
	 */
	public MJournal[] getJournals (boolean requery)
	{
		ArrayList<MJournal> list = new ArrayList<MJournal>();
		String sql = "SELECT * FROM GL_Journal WHERE GL_JournalBatch_ID=? ORDER BY DocumentNo";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql, get_TrxName());
			pstmt.setInt(1, getGL_JournalBatch_ID());
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
				list.add(new MJournal (getCtx(), rs, get_TrxName()));
			rs.close();
			pstmt.close();
			pstmt = null;
		}
		catch (SQLException ex)
		{
			log.log(Level.SEVERE, sql, ex);
		}
		try
		{
			if (pstmt != null)
				pstmt.close();
		}
		catch (SQLException ex1)
		{
		}
		pstmt = null;
		//
		MJournal[] retValue = new MJournal[list.size()];
		list.toArray(retValue);
		return retValue;
	}	//	getJournals

	/**
	 * 	Copy Journal/Lines from other Journal Batch
	 *	@param jb Journal Batch
	 *	@return number of journals + lines copied
	 */
	public int copyDetailsFrom (MJournalBatch jb)
	{
		if (isProcessed() || jb == null)
			return 0;
		int count = 0;
		int lineCount = 0;
		MJournal[] fromJournals = jb.getJournals(false);
		for (int i = 0; i < fromJournals.length; i++)
		{
			MJournal toJournal = new MJournal (getCtx(), 0, jb.get_TrxName());
			PO.copyValues(fromJournals[i], toJournal, getAD_Client_ID(), getAD_Org_ID());
			toJournal.setGL_JournalBatch_ID(getGL_JournalBatch_ID());
			toJournal.set_ValueNoCheck ("DocumentNo", null);	//	create new
			toJournal.set_ValueNoCheck ("C_Period_ID", null);
			toJournal.setDateDoc(getDateDoc());		//	dates from this Batch
			toJournal.setDateAcct(getDateAcct());
			toJournal.setDocStatus(REF__DocumentStatus.Drafted);
			toJournal.setDocAction(REF__DocumentAction.Complete);
			toJournal.setTotalCr(Env.ZERO);
			toJournal.setTotalDr(Env.ZERO);
			toJournal.setIsApproved(false);
			toJournal.setIsPrinted(false);
			toJournal.setPosted(false);
			toJournal.setProcessed(false);
			if (toJournal.save())
			{
				count++;
				lineCount += toJournal.copyLinesFrom(fromJournals[i], getDateAcct(), 'x');
			}
		}
		if (fromJournals.length != count)
			log.log(Level.SEVERE, "Line difference - Journals=" + fromJournals.length + " <> Saved=" + count);

		return count + lineCount;
	}	//	copyLinesFrom

	
	/**************************************************************************
	 * 	Process document
	 *	@param processAction document action
	 *	@return true if performed
	 */
	public boolean processIt (String processAction)
	{
		m_processMsg = null;
		DocumentEngine engine = new DocumentEngine (this, getDocStatus());
		if (processAction.equals(engine.ACTION_None) 
				&& getDocStatus().equals(engine.ACTION_Complete) 
				&& getDocAction().equals(ACTION_Restore))
		{
			return RestoreIt();
		}
		else
		{
			return engine.processIt (processAction, getDocAction());
		}		
	}	//	process
	
	/**	Process Message 			*/
	private String		m_processMsg = null;
	/**	Just Prepared Flag			*/
	private boolean		m_justPrepared = false;

	/**
	 * 	Unlock Document.
	 * 	@return true if success 
	 */
	public boolean unlockIt()
	{
		log.info("unlockIt - " + toString());
		setProcessing(false);
		return true;
	}	//	unlockIt
	
	/**
	 * 	Invalidate Document
	 * 	@return true if success 
	 */
	public boolean invalidateIt()
	{
		log.info("invalidateIt - " + toString());
		return true;
	}	//	invalidateIt
	
	/**
	 *	Prepare Document
	 * 	@return new status (In Progress or Invalid) 
	 */
	public String prepareIt()
	{
		log.info(toString());
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_BEFORE_PREPARE);
		if (m_processMsg != null)
			return DocAction.STATUS_Invalid;
		MDocType dt = MDocType.get(getCtx(), getC_DocType_ID());

		//	Std Period open?
		if (!MPeriod.isOpen(getCtx(), getDateAcct(), dt.getDocBaseType(), getAD_Org_ID(), getAD_Client_ID()))
		{
			m_processMsg = "@PeriodClosed@";
			return DocAction.STATUS_Invalid;
		}
		
		//	Add up Amounts & prepare them
		MJournal[] journals = getJournals(false);
		if (journals.length == 0)
		{
			m_processMsg = "@NoLines@";
			return DocAction.STATUS_Invalid;
		}
		
		BigDecimal TotalDr = Env.ZERO;
		BigDecimal TotalCr = Env.ZERO;		
		for (int i = 0; i < journals.length; i++)
		{
			MJournal journal = journals[i];
			if (!journal.isActive())
				continue;
			//	Prepare if not closed
			if (REF__DocumentStatus.Closed.equals(journal.getDocStatus())
				|| REF__DocumentStatus.Voided.equals(journal.getDocStatus())
				|| REF__DocumentStatus.Reversed.equals(journal.getDocStatus())
				|| REF__DocumentStatus.Completed.equals(journal.getDocStatus()))
				;
			else
			{
				String status = journal.prepareIt();
				if (!DocAction.STATUS_InProgress.equals(status))
				{
					journal.setDocStatus(status);
					journal.save();
					m_processMsg = journal.getProcessMsg();
					return status;
				}
				journal.setDocStatus(REF__DocumentStatus.InProgress);
				journal.save();
			}
			//
			TotalDr = TotalDr.add(journal.getTotalDr());
			TotalCr = TotalCr.add(journal.getTotalCr());
		}
		setTotalDr(TotalDr);
		setTotalCr(TotalCr);
		
		//	Control Amount
		if (Env.ZERO.compareTo(getControlAmt()) != 0
			&& getControlAmt().compareTo(getTotalDr()) != 0)
		{
			m_processMsg = "@ControlAmtError@";
			return DocAction.STATUS_Invalid;
		}
		
//		 Bug 1353695 Currency Rate and COnbversion Type should get copied from journal to lines
		// no solo Currency Rate y Conversion Type sino tambien la fecha 
		for (int i = 0; i < journals.length; i++) 
		{
			MJournal journal = journals[i];
			MJournalLine[] lines = journal.getLines(true);
//			if (journal.getCurrencyRate() != null && journal.getCurrencyRate().compareTo(Env.ZERO) != 0)
//			{
//				for (int j = 0; j < lines.length; j++) 
//				{
//					MJournalLine line = lines[j];
//					line.setCurrencyRate(journal.getCurrencyRate());
//					line.save();
//				}
//			}
//			if (journal.getC_ConversionType_ID() > 0)
//			{
//				for (int j = 0; j < lines.length; j++) 
//				{
//					MJournalLine line = lines[j];
//					line.setC_ConversionType_ID(journal.getC_ConversionType_ID());
//					line.save();
//				}
//			}
//			if (journal.getDateAcct() != null)
//			{
//				for (int j = 0; j < lines.length; j++) 
//				{
//					MJournalLine line = lines[j];
//					line.setDateAcct(journal.getDateAcct());
//					line.save();
//				}				
//			}
		}
		
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_AFTER_PREPARE);
		if (m_processMsg != null)
			return DocAction.STATUS_Invalid;
		
		//	Add up Amounts
		m_justPrepared = true;
		return DocAction.STATUS_InProgress;
	}	//	prepareIt
	
	/**
	 * 	Approve Document
	 * 	@return true if success 
	 */
	public boolean  approveIt()
	{
		log.info("approveIt - " + toString());
		setIsApproved(true);
		return true;
	}	//	approveIt
	
	/**
	 * 	Reject Approval
	 * 	@return true if success 
	 */
	public boolean rejectIt()
	{
		log.info("rejectIt - " + toString());
		setIsApproved(false);
		return true;
	}	//	rejectIt

	/**
	 * 	Placed Document
	 * 	@return true if success 
	 */
	public String placedIt()
	{
		log.info(toString());
		return DocAction.STATUS_Placed;
	}	//	placedIt	

	/**
	 * 	Returned Document
	 * 	@return true if success 
	 */
	public String returnedIt()
	{
		log.info(toString());
		return DocAction.STATUS_Returned;
	}	//	returnedIt
	
	/**
	 * 	Complete Document
	 * 	@return new status (Complete, In Progress, Invalid, Waiting ..)
	 */
	public String completeIt()
	{
		log.info("completeIt - " + toString());
		//	Re-Check
		if (!m_justPrepared)
		{
			String status = prepareIt();
			if (!DocAction.STATUS_InProgress.equals(status))
				return status;
		}
		
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_BEFORE_COMPLETE);
		if (m_processMsg != null)
			return DocAction.STATUS_Invalid;
		
		//	Implicit Approval
		approveIt();

		//	Add up Amounts & complete them
		MJournal[] journals = getJournals(true);
		BigDecimal TotalDr = Env.ZERO;
		BigDecimal TotalCr = Env.ZERO;		
		for (int i = 0; i < journals.length; i++)
		{
			MJournal journal = journals[i];
			if (!journal.isActive())
			{				
				journal.setProcessed(true);
				journal.setDocStatus(REF__DocumentStatus.Voided);
				journal.setDocAction(REF__DocumentAction.None);
				journal.save();
				continue;
			}
			//	Complete if not closed
			if (REF__DocumentStatus.Closed.equals(journal.getDocStatus())
				|| REF__DocumentStatus.Voided.equals(journal.getDocStatus())
				|| REF__DocumentStatus.Reversed.equals(journal.getDocStatus())
				|| REF__DocumentStatus.Completed.equals(journal.getDocStatus()))
				;
			else
			{
				journal.setDateAcct(getDateAcct());
				String status = journal.completeIt();
				if (!DocAction.STATUS_Completed.equals(status))
				{
					journal.setDocStatus(status);
					journal.save();
					m_processMsg = journal.getProcessMsg();
					return status;
				}
				journal.setDocStatus(REF__DocumentStatus.Completed);
				journal.save();
			}
			//
			TotalDr = TotalDr.add(journal.getTotalDr());
			TotalCr = TotalCr.add(journal.getTotalCr());
		}
		setTotalDr(TotalDr);
		setTotalCr(TotalCr);
		//	User Validation
		String valid = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_AFTER_COMPLETE);
		if (valid != null)
		{
			m_processMsg = valid;
			return DocAction.STATUS_Invalid;
		}
		//
		setProcessed(true);
		setDocAction(REF__DocumentAction.Close);
		return DocAction.STATUS_Completed;
	}	//	completeIt
	
	/**
	 * 	Void Document.
	 * 	@return false 
	 */
	public boolean voidIt()
	{
		log.info("voidIt - " + toString());
		// Before Void
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_VOID);
		if (m_processMsg != null)
			return false;
		// After Void
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_VOID);
		if (m_processMsg != null)
			return false;
		
		return false;
	}	//	voidIt
	
	/**
	 * 	Close Document.
	 * 	@return true if success 
	 */
	public boolean closeIt()
	{
		log.info("closeIt - " + toString());
		// Before Close
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_CLOSE);
		if (m_processMsg != null)
			return false;
		
		MJournal[] journals = getJournals(true);
		for (int i = 0; i < journals.length; i++)
		{
			MJournal journal = journals[i];
			if (!journal.isActive() && !journal.isProcessed())
			{
				journal.setProcessed(true);
				journal.setDocStatus(REF__DocumentStatus.Voided);
				journal.setDocAction(REF__DocumentAction.None);
				journal.save();
				continue;
			}
			if (REF__DocumentStatus.Drafted.equals(journal.getDocStatus())
				|| REF__DocumentStatus.InProgress.equals(journal.getDocStatus())
				|| REF__DocumentStatus.Invalid.equals(journal.getDocStatus()))
			{
				m_processMsg = "Journal not Completed: " + journal.getSummary();
				return false;
			}
			
			//	Close if not closed
			if (REF__DocumentStatus.Closed.equals(journal.getDocStatus())
				|| REF__DocumentStatus.Voided.equals(journal.getDocStatus())
				|| REF__DocumentStatus.Reversed.equals(journal.getDocStatus()))
				;
			else
			{
				if (!journal.closeIt())
				{
					m_processMsg = "Cannot close: " + journal.getSummary();
					return false;
				}
				journal.save();
			}
		}
		// After Close
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_CLOSE);
		if (m_processMsg != null)
			return false;
		
		return true;
	}	//	closeIt
	
	/**
	 * 	Reverse Correction.
	 * 	As if nothing happened - same date
	 * 	@return true if success 
	 */
	public boolean reverseCorrectIt()
	{
		log.info("reverseCorrectIt - " + toString());
		// Before reverseCorrect
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_REVERSECORRECT);
		if (m_processMsg != null)
			return false;
				
		MJournal[] journals = getJournals(true);
		//	check prerequisites
		for (int i = 0; i < journals.length; i++)
		{
			MJournal journal = journals[i];
			if (!journal.isActive())
				continue;
			//	All need to be closed/Completed
			if (REF__DocumentStatus.Completed.equals(journal.getDocStatus()))
				;
			else
			{
				m_processMsg = "All Journals need to be Compleded: " + journal.getSummary();
				return false;
			}
		}
		
		//	Reverse it
		MJournalBatch reverse = new MJournalBatch (this);
		reverse.setDateDoc(getDateDoc());
		reverse.setC_Period_ID(getC_Period_ID());
		reverse.setDateAcct(getDateAcct());
		//	Reverse indicator
		String description = reverse.getDescription();
		if (description == null)
			description = "** " + getDocumentNo() + " **";
		else
			description += " ** " + getDocumentNo() + " **";
		reverse.setDescription(description);
		reverse.save();
		//
		
		//	Reverse Journals
		for (int i = 0; i < journals.length; i++)
		{
			MJournal journal = journals[i];
			if (!journal.isActive())
				continue;
			if (journal.reverseCorrectIt(reverse.getGL_JournalBatch_ID()) == null)
			{
				m_processMsg = "Could not reverse " + journal;
				return false;
			}
			journal.save();
		}
		// After reverseCorrect
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_REVERSECORRECT);
		if (m_processMsg != null)
			return false;
		
		return true;
	}	//	reverseCorrectionIt
	
	/**
	 * 	Reverse Accrual.
	 * 	Flip Dr/Cr - Use Today's date
	 * 	@return true if success 
	 */
	public boolean reverseAccrualIt()
	{
		log.info("reverseAccrualIt - " + toString());
		// Before reverseAccrual
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_REVERSEACCRUAL);
		if (m_processMsg != null)
			return false;
		
		MJournal[] journals = getJournals(true);
		//	check prerequisites
		for (int i = 0; i < journals.length; i++)
		{
			MJournal journal = journals[i];
			if (!journal.isActive())
				continue;
			//	All need to be closed/Completed
			if (REF__DocumentStatus.Completed.equals(journal.getDocStatus()))
				;
			else
			{
				m_processMsg = "All Journals need to be Compleded: " + journal.getSummary();
				return false;
			}
		}
		//	Reverse it
		MJournalBatch reverse = new MJournalBatch (this);
		reverse.setC_Period_ID(0);
		reverse.setDateDoc(new Timestamp(System.currentTimeMillis()));
		reverse.setDateAcct(reverse.getDateDoc());
		//	Reverse indicator
		String description = reverse.getDescription();
		if (description == null)
			description = "** " + getDocumentNo() + " **";
		else
			description += " ** " + getDocumentNo() + " **";
		reverse.setDescription(description);
		reverse.save();
		
		//	Reverse Journals
		for (int i = 0; i < journals.length; i++)
		{
			MJournal journal = journals[i];
			if (!journal.isActive())
				continue;
			if (journal.reverseAccrualIt(reverse.getGL_JournalBatch_ID()) == null)
			{
				m_processMsg = "Could not reverse " + journal;
				return false;
			}
			journal.save();
		}
		// After reverseAccrual
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_REVERSEACCRUAL);
		if (m_processMsg != null)
			return false;
				
		return true;
	}	//	reverseAccrualIt
	
	/** 
	 * 	Re-activate - same as reverse correct
	 * 	@return true if success 
	 */
	public boolean reActivateIt()
	{
		log.info("reActivateIt - " + toString());
		
		// Before reActivate
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_REACTIVATE);
		if (m_processMsg != null)
			return false;	
		
	//	setProcessed(false);
		if (! reverseCorrectIt())
			return false;

		// After reActivate
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_REACTIVATE);
		if (m_processMsg != null)
			return false;
				
		return true;
	}	//	reActivateIt
	

	/*************************************************************************
	 * 	Get Summary
	 *	@return Summary of Document
	 */
	public String getSummary()
	{
		StringBuffer sb = new StringBuffer();
		sb.append(getDocumentNo());
		//	: Total Lines = 123.00 (#1)
		sb.append(": ")
		.append(Msg.translate(getCtx(),"TotalDr")).append("=").append(getTotalDr())
		.append(" ")
		.append(Msg.translate(getCtx(),"TotalCR")).append("=").append(getTotalCr())
		.append(" (#").append(getJournals(false).length).append(")");
		//	 - Description
		if (getDescription() != null && getDescription().length() > 0)
			sb.append(" - ").append(getDescription());
		return sb.toString();
	}	//	getSummary

	/**
	 * 	String Representation
	 *	@return info
	 */
	public String toString ()
	{
		StringBuffer sb = new StringBuffer ("MJournalBatch[");
		sb.append(get_ID()).append(",").append(getDescription())
			.append(",DR=").append(getTotalDr())
			.append(",CR=").append(getTotalCr())
			.append ("]");
		return sb.toString ();
	}	//	toString
	
	/**
	 * 	Get Document Info
	 *	@return document info (untranslated)
	 */
	public String getDocumentInfo()
	{
		MDocType dt = MDocType.get(getCtx(), getC_DocType_ID());
		return dt.getName() + " " + getDocumentNo();
	}	//	getDocumentInfo

	/**
	 * 	Create PDF
	 *	@return File or null
	 */
	public File createPDF ()
	{
		try
		{
			File temp = File.createTempFile(get_TableName()+get_ID()+"_", ".pdf");
			return createPDF (temp);
		}
		catch (Exception e)
		{
			log.severe("Could not create PDF - " + e.getMessage());
		}
		return null;
	}	//	getPDF

	/**
	 * 	Create PDF file
	 *	@param file output file
	 *	@return file if success
	 */
	public File createPDF (File file)
	{
	//	ReportEngine re = ReportEngine.get (getCtx(), ReportEngine.INVOICE, getC_Invoice_ID());
	//	if (re == null)
			return null;
	//	return re.getPDF(file);
	}	//	createPDF

	
	/**
	 * 	Get Process Message
	 *	@return clear text error message
	 */
	public String getProcessMsg()
	{
		return m_processMsg;
	}	//	getProcessMsg
	
	/**
	 * 	Get Document Owner (Responsible)
	 *	@return AD_User_ID (Created By)
	 */
	public int getDoc_User_ID()
	{
		return getCreatedBy();
	}	//	getDoc_User_ID

	/**
	 * 	Get Document Approval Amount
	 *	@return DR amount
	 */
	public BigDecimal getApprovalAmt()
	{
		return getTotalDr();
	}	//	getApprovalAmt

	public boolean RestoreIt()
	{		
		if (!MPeriod.isOpen(getCtx(), getDateAcct(), REF_C_DocTypeDocBaseType.GLJournal, getAD_Org_ID(), getAD_Client_ID()))
		{
			return false;
		}				
		MJournal journals[] = getJournals(false);
		for (int i = 0; i < journals.length; i++) {
			MJournalLine lines[] = journals[i].getLines(false);
			for (int a = 0; a < lines.length; a++) {
				lines[a].setProcessed(false);
				lines[a].save(get_TrxName());
			}
			journals[i].setIsApproved(false);
			journals[i].setDocStatus(REF__DocumentStatus.Drafted);
			journals[i].setDocAction(REF__DocumentAction.Complete);
			journals[i].setProcessed(false);
			journals[i].setPosted(false);
			journals[i].save(get_TrxName());
			
			Doc doc = null;
			String sql = "DELETE FROM Fact_Acct WHERE AD_Table_ID=" + MJournal.Table_ID + " AND Record_ID=?";
			DB.executeUpdate(sql, journals[i].get_ID(), get_TrxName());			
		}
		setIsApproved(false);
		setDocStatus(REF__DocumentStatus.Drafted);
		setDocAction(REF__DocumentAction.Complete);
		setProcessed(false);
		save();		
		return true;
	}

	public void setProcessMsg(String msg)
	{
		m_processMsg = msg;
	}	
}	//	MJournalBatch