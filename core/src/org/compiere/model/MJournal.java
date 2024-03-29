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

import org.compiere.model.persistence.X_GL_Journal;
import org.compiere.model.reference.REF__DocumentAction;
import org.compiere.model.reference.REF__DocumentStatus;
import org.compiere.model.reference.REF__PostingType;
import org.compiere.process.*;
import org.compiere.util.*;

/**
 *  GL Journal Model
 * <p>Change log:
 * <ul>
 * <li>2007-02-26 - teo_sarca - [ 1619150 ] Usability/Consistency: reversed gl journal description
 * </ul>
 *
 *	@author Jorg Janke
 *	@version $Id: MJournal.java 5822 2016-06-15 22:56:06Z xapiens $
 */
public class MJournal extends X_GL_Journal implements DocAction
{
	/**
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param GL_Journal_ID id
	 *	@param trxName transaction
	 */
	public MJournal (Properties ctx, int GL_Journal_ID, String trxName)
	{
		super (ctx, GL_Journal_ID, trxName);
		if (GL_Journal_ID == 0)
		{
		//	setGL_Journal_ID (0);		//	PK
		//	setC_AcctSchema_ID (0);
		//	setC_Currency_ID (0);
		//	setC_DocType_ID (0);
		//	setC_Period_ID (0);
			//
			setCurrencyRate (Env.ONE);
		//	setC_ConversionType_ID(0);
			setDateAcct (new Timestamp(System.currentTimeMillis()));
			setDateDoc (new Timestamp(System.currentTimeMillis()));
		//	setDescription (null);
			setDocAction (REF__DocumentAction.Complete);
			setDocStatus (REF__DocumentStatus.Drafted);
		//	setDocumentNo (null);
		//	setGL_Category_ID (0);
			setPostingType (REF__PostingType.Actual);
			setTotalCr (Env.ZERO);
			setTotalDr (Env.ZERO);
			setIsApproved (false);
			setIsPrinted (false);
			setPosted (false);
			setProcessed(false);
		}
	}	//	MJournal

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MJournal (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MJournal

	/**
	 * 	Parent Constructor.
	 *	@param parent batch
	 */
	public MJournal (MJournalBatch parent)
	{
		this (parent.getCtx(), 0, parent.get_TrxName());
		setClientOrg(parent);
		setGL_JournalBatch_ID(parent.getGL_JournalBatch_ID());
		setC_DocType_ID(parent.getC_DocType_ID());
		setPostingType(parent.getPostingType());
		//
		setDateDoc(parent.getDateDoc());
		setC_Period_ID(parent.getC_Period_ID());
		setDateAcct(parent.getDateAcct());
		setC_Currency_ID(parent.getC_Currency_ID());
	}	//	MJournal
	
	/**
	 * 	Copy Constructor.
	 * 	Dos not copy: Dates/Period
	 *	@param original original
	 */
	public MJournal (MJournal original)
	{
		this (original.getCtx(), 0, original.get_TrxName());
		setClientOrg(original);
		setGL_JournalBatch_ID(original.getGL_JournalBatch_ID());
		//
		setC_AcctSchema_ID(original.getC_AcctSchema_ID());
		setGL_Budget_ID(original.getGL_Budget_ID());
		setGL_Category_ID(original.getGL_Category_ID());
		setPostingType(original.getPostingType());
		setDescription(original.getDescription());
		setC_DocType_ID(original.getC_DocType_ID());
		setControlAmt(original.getControlAmt());
		//
		setC_Currency_ID(original.getC_Currency_ID());
		setC_ConversionType_ID(original.getC_ConversionType_ID());
		setCurrencyRate(original.getCurrencyRate());
		
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
		MPeriod p = MPeriod.get(getCtx(), DateAcct, getAD_Org_ID(), getAD_Client_ID());		
		int C_Period_ID = 0;
		if (p != null)
			C_Period_ID = p.getC_Period_ID();
		if (C_Period_ID == 0)
			log.warning("setDateAcct - Period not found");
		else
			setC_Period_ID(C_Period_ID);
	}	//	setDateAcct

	/**
	 * 	Set Currency Info
	 *	@param C_Currency_ID currenct
	 *	@param C_ConversionType_ID type
	 *	@param CurrencyRate rate
	 */
	public void setCurrency (int C_Currency_ID, int C_ConversionType_ID, BigDecimal CurrencyRate)
	{
		if (C_Currency_ID != 0)
			setC_Currency_ID(C_Currency_ID);
		if (C_ConversionType_ID != 0)
			setC_ConversionType_ID(C_ConversionType_ID);
		if (CurrencyRate != null && CurrencyRate.compareTo(Env.ZERO) == 0)
			setCurrencyRate(CurrencyRate);
	}	//	setCurrency

	/**
	 * Add to Description
	 * @param description text
	 * @since 3.1.4
	 */
	public void addDescription (String description)
	{
		String desc = getDescription();
		if (desc == null)
			setDescription(description);
		else
			setDescription(desc + " | " + description);
	}
	
	/**************************************************************************
	 * 	Get Journal Lines
	 * 	@param requery requery
	 *	@return Array of lines
	 */
	public MJournalLine[] getLines (boolean requery)
	{
		ArrayList<MJournalLine> list = new ArrayList<MJournalLine>();
		String sql = "SELECT * FROM GL_JournalLine WHERE GL_Journal_ID=? ORDER BY Line";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql, get_TrxName());
			pstmt.setInt(1, getGL_Journal_ID());
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
				list.add(new MJournalLine (getCtx(), rs, get_TrxName()));
			rs.close();
			pstmt.close();
			pstmt = null;
		}
		catch (SQLException ex)
		{
			log.log(Level.SEVERE, "getLines", ex); 
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
		MJournalLine[] retValue = new MJournalLine[list.size()];
		list.toArray(retValue);
		return retValue;
	}	//	getLines

	/**
	 * 	Copy Lines from other Journal
	 *	@param fromJournal Journal
	 *	@param dateAcct date used - if null original
	 *	@param typeCR type of copying (C)orrect=negate - (R)everse=flip dr/cr - otherwise just copy
	 *	@return number of lines copied
	 */
	public int copyLinesFrom (MJournal fromJournal, Timestamp dateAcct, char typeCR)
	{
		if (isProcessed() || fromJournal == null)
			return 0;
		int count = 0;
		MJournalLine[] fromLines = fromJournal.getLines(false);
		for (int i = 0; i < fromLines.length; i++)
		{
			MJournalLine toLine = new MJournalLine (getCtx(), 0, fromJournal.get_TrxName());
			PO.copyValues(fromLines[i], toLine, getAD_Client_ID(), getAD_Org_ID());
			toLine.setGL_Journal_ID(getGL_Journal_ID());
			//
			if (dateAcct != null)
				toLine.setDateAcct(dateAcct);
			//	Amounts
			if (typeCR == 'C')			//	correct
			{
				toLine.setAmtSourceDr(fromLines[i].getAmtSourceDr().negate());
				toLine.setAmtSourceCr(fromLines[i].getAmtSourceCr().negate());
			}
			else if (typeCR == 'R')		//	reverse
			{
				toLine.setAmtSourceDr(fromLines[i].getAmtSourceCr());
				toLine.setAmtSourceCr(fromLines[i].getAmtSourceDr());
			}
			toLine.setIsGenerated(true);
			toLine.setProcessed(false);
			if (toLine.save())
				count++;
		}
		if (fromLines.length != count)
			log.log(Level.SEVERE, "Line difference - JournalLines=" + fromLines.length + " <> Saved=" + count);

		return count;
	}	//	copyLinesFrom

	/**
	 * 	Set Processed.
	 * 	Propergate to Lines/Taxes
	 *	@param processed processed
	 */
	public void setProcessed (boolean processed)
	{
		super.setProcessed (processed);
		if (get_ID() == 0)
			return;
		String sql = "UPDATE GL_JournalLine SET Processed='"
			+ (processed ? "Y" : "N")
			+ "' WHERE GL_Journal_ID=" + getGL_Journal_ID();
		int noLine = DB.executeUpdate(sql, get_TrxName());
		log.fine(processed + " - Lines=" + noLine);
	}	//	setProcessed

	
	/**************************************************************************
	 * 	Before Save
	 *	@param newRecord new
	 *	@return true
	 */
	protected boolean beforeSave (boolean newRecord)
	{
		//	Imported Journals may not have date
		if (getDateDoc() == null)
		{
			if (getDateAcct() == null)
				setDateDoc(new Timestamp(System.currentTimeMillis()));
			else
				setDateDoc(getDateAcct());
		}
		if (getDateAcct() == null)
			setDateAcct(getDateDoc());
		return true;
	}	//	beforeSave
	
	
	/**
	 * 	After Save.
	 * 	Update Batch Total
	 *	@param newRecord true if new record
	 *	@param success true if success
	 *	@return success
	 */
	protected boolean afterSave (boolean newRecord, boolean success)
	{
		if (!success)
			return success;
		return updateBatch();
	}	//	afterSave
	
	/**
	 * 	After Delete
	 *	@param success true if deleted
	 *	@return true if success
	 */
	protected boolean afterDelete (boolean success)
	{
		if (!success)
			return success;
		return updateBatch();
	}	//	afterDelete
	
	/**
	 * 	Update Batch total
	 *	@return true if ok
	 */
	private boolean updateBatch()
	{
		
		String sql = "UPDATE gl_journalbatch jb "
		+ " SET totalDr = f.totaldr, "
		+ " totalcr = f.totalcr FROM (SELECT COALESCE(SUM(j.TotalDr),0) as totaldr, COALESCE(SUM(j.TotalCr),0) as totalcr FROM gl_journal j "
		+ " WHERE j.isactive = 'Y' AND j.GL_JournalBatch_ID = "+getGL_JournalBatch_ID()+") f "
		+ " WHERE jb.GL_JournalBatch_ID = "+ getGL_JournalBatch_ID();		
		int no = DB.executeUpdate(sql, get_TrxName());
		if (no != 1)
			log.warning("afterSave - Update Batch #" + no);
		return no == 1;
	}	//	updateBatch
	
	
	/**************************************************************************
	 * 	Process document
	 *	@param processAction document action
	 *	@return true if performed
	 */
	public boolean processIt (String processAction)
	{
		m_processMsg = null;
		DocumentEngine engine = new DocumentEngine (this, getDocStatus());
		return engine.processIt (processAction, getDocAction());
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
		log.info(toString());
		setProcessing(false);
		return true;
	}	//	unlockIt
	
	/**
	 * 	Invalidate Document
	 * 	@return true if success 
	 */
	public boolean invalidateIt()
	{
		log.info(toString());
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

		//	Get Period
		MPeriod period = MPeriod.get (getCtx(), getDateAcct(), getAD_Org_ID(), getAD_Client_ID());
		if (period == null)
		{
			log.warning("No Period for " + getDateAcct());
			m_processMsg = "@PeriodNotFound@";
			return DocAction.STATUS_Invalid;
		}
		//	Standard Period
		if (period.getC_Period_ID() != getC_Period_ID()
			&& period.isStandardPeriod())
		{
			m_processMsg = "@PeriodNotValid@";
			return DocAction.STATUS_Invalid;
		}
		boolean open = period.isOpen(dt.getDocBaseType());
		if (!open)
		{
			log.warning(period.getName()
				+ ": Not open for " + dt.getDocBaseType() + " (" + getDateAcct() + ")");
			m_processMsg = "@PeriodClosed@";
			return DocAction.STATUS_Invalid;
		}

		//	Lines
		MJournalLine[] lines = getLines(true);
		if (lines.length == 0)
		{
			m_processMsg = "@NoLines@";
			return DocAction.STATUS_Invalid;
		}
		
		//	Add up Amounts
		BigDecimal AmtSourceDr = Env.ZERO;
		BigDecimal AmtSourceCr = Env.ZERO;
		for (int i = 0; i < lines.length; i++)
		{
			MJournalLine line = lines[i];
			if (!isActive())
				continue;
			//
			if (line.isDocControlled())
			{
				m_processMsg = "@DocControlledError@ - @Line@=" + line.getLine()
					+ " - " + line.getAccountElementValue();
				return DocAction.STATUS_Invalid;
			}
			//
			AmtSourceDr = AmtSourceDr.add(line.getAmtAcctDr());
			AmtSourceCr = AmtSourceCr.add(line.getAmtAcctCr());
		}
		setTotalDr(AmtSourceDr);
		setTotalCr(AmtSourceCr);

		//	Control Amount
		if (Env.ZERO.compareTo(getControlAmt()) != 0
			&& getControlAmt().compareTo(getTotalDr()) != 0)
		{
			m_processMsg = "@ControlAmtError@";
			return DocAction.STATUS_Invalid;
		}
		
		//	Unbalanced Jornal & Not Suspense
		if (AmtSourceDr.compareTo(AmtSourceCr) != 0)
		{
			MAcctSchemaGL gl = MAcctSchemaGL.get(getCtx(), getC_AcctSchema_ID());
			if (gl == null || !gl.isUseSuspenseBalancing())
			{
				m_processMsg = "@UnbalancedJornal@";
				return DocAction.STATUS_Invalid;
			}
		}
		
		if (!REF__DocumentAction.Complete.equals(getDocAction())) 
			setDocAction(REF__DocumentAction.Complete);
		
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_AFTER_PREPARE);
		if (m_processMsg != null)
			return DocAction.STATUS_Invalid;
		
		m_justPrepared = true;
		return DocAction.STATUS_InProgress;
	}	//	prepareIt
	
	/**
	 * 	Approve Document
	 * 	@return true if success 
	 */
	public boolean  approveIt()
	{
		log.info(toString());
		setIsApproved(true);
		return true;
	}	//	approveIt
	
	/**
	 * 	Reject Approval
	 * 	@return true if success 
	 */
	public boolean rejectIt()
	{
		log.info(toString());
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
		if (!isApproved())
			approveIt();
		log.info(toString());
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
	 * 	@return true if success 
	 */
	public boolean voidIt()
	{
		log.info(toString());
		// Before Void
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_VOID);
		if (m_processMsg != null)
			return false;

		boolean ok_to_void = false;
		if (REF__DocumentStatus.Drafted.equals(getDocStatus()) 
			|| REF__DocumentStatus.Invalid.equals(getDocStatus()))
		{
			setProcessed(true);
			setDocAction(REF__DocumentAction.None);
			ok_to_void = true;
		} else {
			return false;
		}
		
		// After Void
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_VOID);
		if (m_processMsg != null)
			return false;
		
		return ok_to_void;
	}	//	voidIt
	
	/**
	 * 	Close Document.
	 * 	Cancel not delivered Qunatities
	 * 	@return true if success 
	 */
	public boolean closeIt()
	{
		log.info(toString());
		// Before Close
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_CLOSE);
		if (m_processMsg != null)
			return false;
		
		boolean ok_to_close = false;
		if (REF__DocumentStatus.Completed.equals(getDocStatus())) 
		{
			setProcessed(true);
			setDocAction(REF__DocumentAction.None);
			ok_to_close = true;
		} else {
			return false;
		}
		
		// After Close
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_CLOSE);
		if (m_processMsg != null)
			return false;			

		return ok_to_close;
	}	//	closeIt
	
	/**
	 * 	Reverse Correction (in same batch).
	 * 	As if nothing happened - same date
	 * 	@return true if success 
	 */
	public boolean reverseCorrectIt()
	{
		// Before reverseCorrect
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_REVERSECORRECT);
		if (m_processMsg != null)
			return false;
		
		boolean ok_correct = (reverseCorrectIt(getGL_JournalBatch_ID()) != null);
		
		if (! ok_correct)
			return false;

		// After reverseCorrect
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_REVERSECORRECT);
		if (m_processMsg != null)
			return false;
		
		return ok_correct;
	}	//	reverseCorrectIt

	/**
	 * 	Reverse Correction.
	 * 	As if nothing happened - same date
	 * 	@param GL_JournalBatch_ID reversal batch
	 * 	@return reversed Journal or null
	 */
	public MJournal reverseCorrectIt (int GL_JournalBatch_ID)
	{
		log.info(toString());
		//	Journal
		MJournal reverse = new MJournal (this);
		reverse.setGL_JournalBatch_ID(GL_JournalBatch_ID);
		reverse.setDateDoc(getDateDoc());
		reverse.setC_Period_ID(getC_Period_ID());
		reverse.setDateAcct(getDateAcct());
		//	Reverse indicator
		reverse.addDescription("(->" + getDocumentNo() + ")");
		if (!reverse.save())
			return null;
		addDescription("(" + reverse.getDocumentNo() + "<-)");
		
		//	Lines
		reverse.copyLinesFrom(this, null, 'C');
		//
		setProcessed(true);
		setDocAction(REF__DocumentAction.None);
		return reverse;
	}	//	reverseCorrectionIt
	
	/**
	 * 	Reverse Accrual (sane batch).
	 * 	Flip Dr/Cr - Use Today's date
	 * 	@return true if success 
	 */
	public boolean reverseAccrualIt()
	{
		// Before reverseAccrual
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_REVERSEACCRUAL);
		if (m_processMsg != null)
			return false;
		
		boolean ok_reverse = (reverseAccrualIt (getGL_JournalBatch_ID()) != null);
		
		if (! ok_reverse)
			return false;

		// After reverseAccrual
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_REVERSEACCRUAL);
		if (m_processMsg != null)
			return false;
		
		return ok_reverse;
	}	//	reverseAccrualIt
	
	/**
	 * 	Reverse Accrual.
	 * 	Flip Dr/Cr - Use Today's date
	 * 	@param GL_JournalBatch_ID reversal batch
	 * 	@return reversed journal or null 
	 */
	public MJournal reverseAccrualIt (int GL_JournalBatch_ID)
	{
		log.info(toString());
		//	Journal
		MJournal reverse = new MJournal (this);
		reverse.setGL_JournalBatch_ID(GL_JournalBatch_ID);
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
		if (!reverse.save())
			return null;
		
		//	Lines
		reverse.copyLinesFrom(this, reverse.getDateAcct(), 'R');
		//
		setProcessed(true);
		setDocAction(REF__DocumentAction.None);
		return reverse;
	}	//	reverseAccrualIt
	
	/** 
	 * 	Re-activate
	 * 	@return true if success 
	 */
	public boolean reActivateIt()
	{
		log.info(toString());
		// Before reActivate
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_REACTIVATE);
		if (m_processMsg != null)
			return false;	
		
		// After reActivate
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_REACTIVATE);
		if (m_processMsg != null)
			return false;
		
		return false;
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
			.append(" (#").append(getLines(false).length).append(")");
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
		StringBuffer sb = new StringBuffer ("MJournal[");
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
	 *	@return AD_User_ID (Created)
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

	@Override
	public boolean RestoreIt() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setProcessMsg(String msg)
	{
		m_processMsg = msg;
	}
}	//	MJournal
