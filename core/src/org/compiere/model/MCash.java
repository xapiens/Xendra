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
import org.compiere.model.persistence.X_C_Cash;
import org.compiere.model.reference.REF__DocumentAction;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;
import org.compiere.model.reference.REF__DocumentStatus;
import org.compiere.process.*;
import org.compiere.util.*;
import org.kie.api.KieBase;
import org.kie.api.runtime.KieSession;
import org.xendra.rules.CustomAgendaEventListener;
import org.xendra.rules.CustomWorkingMemoryEventListener;

/**
 *	Cash Journal Model
 *	
 *  @author Jorg Janke
 *  @version $Id: MCash.java 5822 2016-06-15 22:56:06Z xapiens $
 */
public class MCash extends X_C_Cash implements DocAction
{
	public static MCash get(Properties ctx, int C_CashBook_ID, int C_DocType_ID, int HR_WorkShift_ID, Timestamp dateAcct, String trxName) {
		String where = "C_CashBook_ID=? AND C_DocType_ID = ? AND HR_WorkShift_ID = ? AND TRUNC(StatementDate)=? AND Processed='N'";
		MCash cash = new Query(Env.getCtx(), MCash.Table_Name, where, trxName)
			.setParameters(C_CashBook_ID, C_DocType_ID, HR_WorkShift_ID, TimeUtil.getDay(dateAcct)).setOrderBy("Created").first();
		if (cash != null)
			return cash;

		//	Get CashBook
		MCashBook cb = new MCashBook (ctx, C_CashBook_ID, trxName);
		if (cb.get_ID() ==0)
		{
			s_log.warning("Not found C_CashBook_ID=" + C_CashBook_ID);
			return null;
		}

		//	Create New Journal
		cash = new MCash (cb, dateAcct);
		cash.setC_DocType_ID(C_DocType_ID);
		cash.setHR_WorkShift_ID(HR_WorkShift_ID);
		cash.save(trxName);
		return cash;		
	}	
	/**
	 * 	Get Cash Journal for currency, org and date
	 *	@param ctx context
	 *	@param C_Currency_ID currency
	 *	@param AD_Org_ID org
	 *	@param dateAcct date
	 *	@param trxName transaction
	 *	@return cash
	 */
	public static MCash get (Properties ctx, int AD_Org_ID,	Timestamp dateAcct, int C_Currency_ID, String trxName)
	{
		String where = "AD_Org_ID = ? AND TRUNC(StatementDate)=? AND Processed = 'N' ";
		where +=" AND EXISTS( SELECT * FROM C_CashBook cb WHERE C_CashBook_ID=cb.C_CashBook_ID AND cb.AD_Org_ID=AD_Org_ID AND cb.C_Currency_ID=?)";		
		MCash retValue = new Query(Env.getCtx(), MCash.Table_Name, where, trxName).setParameters(AD_Org_ID, TimeUtil.getDay(dateAcct)).first();
//		MCash retValue = null;
//		//	Existing Journal
//		String sql =
//			"SELECT * FROM C_Cash c "
//			+ "WHERE c.AD_Org_ID=?"						//	#1
//			+ " AND TRUNC(c.StatementDate)=?"			//	#2
//			+ " AND c.Processed='N'"
//			+ " AND EXISTS (SELECT * FROM C_CashBook cb "
//			+ "WHERE c.C_CashBook_ID=cb.C_CashBook_ID AND cb.AD_Org_ID=c.AD_Org_ID"
//			+ " AND cb.C_Currency_ID=?)";			//	#3
//		PreparedStatement pstmt = null;
//		try
//		{
//			pstmt = DB.prepareStatement (sql, trxName);
//			pstmt.setInt (1, AD_Org_ID);
//			pstmt.setTimestamp (2, TimeUtil.getDay(dateAcct));
//			pstmt.setInt (3, C_Currency_ID);
//			ResultSet rs = pstmt.executeQuery ();
//			if (rs.next ())
//				retValue = new MCash (ctx, rs, trxName);
//			rs.close ();
//			pstmt.close ();
//			pstmt = null;
//		}
//		catch (Exception e)
//		{
//			s_log.log(Level.SEVERE, sql, e);
//		}
//		try
//		{
//			if (pstmt != null)
//				pstmt.close ();
//			pstmt = null;
//		}
//		catch (Exception e)
//		{
//			pstmt = null;
//		}
		if (retValue != null)
			return retValue;
		
		
		//	Get CashBook
		MCashBook cb = MCashBook.get (ctx, AD_Org_ID, C_Currency_ID);
		if (cb == null)
		{
			s_log.warning("No CashBook for AD_Org_ID=" + AD_Org_ID + ", C_Currency_ID=" + C_Currency_ID);
			return null;
		}

		//	Create New Journal
		retValue = new MCash (cb, dateAcct);
		retValue.save(trxName);
		return retValue;
	}	//	get

	/**
	 * 	Get Cash Journal for CashBook and date
	 *	@param ctx context
	 *	@param C_CashBook_ID cashbook
	 *	@param dateAcct date
	 *	@param trxName transaction
	 *	@return cash
	 */
	public static MCash get (Properties ctx, int C_CashBook_ID, Timestamp dateAcct, String trxName)
	{
		String where = "C_CashBook_ID=? AND TRUNC(StatementDate)=? AND Processed='N'";
		MCash cash = new Query(Env.getCtx(), MCash.Table_Name, where, trxName)
			.setParameters(C_CashBook_ID, TimeUtil.getDay(dateAcct)).setOrderBy("Created").first();			
		if (cash != null)
			return cash;

		//	Get CashBook
		MCashBook cb = new MCashBook (ctx, C_CashBook_ID, trxName);
		if (cb.get_ID() ==0)
		{
			s_log.warning("Not found C_CashBook_ID=" + C_CashBook_ID);
			return null;
		}

		//	Create New Journal
		cash = new MCash (cb, dateAcct);		
		cash.save(trxName);
		return cash;
	}	//	get

	/**	Static Logger	*/
	private static CLogger	s_log	= CLogger.getCLogger (MCash.class);


	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param C_Cash_ID id
	 *	@param trxName transaction
	 */
	public MCash (Properties ctx, int C_Cash_ID, String trxName)
	{
		super (ctx, C_Cash_ID, trxName);
		if (C_Cash_ID == 0)
		{
			//	setC_CashBook_ID (0);		//	FK
			setBeginningBalance (Env.ZERO);
			setEndingBalance (Env.ZERO);
			setStatementDifference(Env.ZERO);
			setDocAction(REF__DocumentAction.Complete);
			setDocStatus(REF__DocumentStatus.Drafted);
			//
			Timestamp today = TimeUtil.getDay(System.currentTimeMillis());
			setStatementDate (today);	// @#Date@
			setDateAcct (today);	// @#Date@
			String name = DisplayType.getDateFormat(DisplayType.Date).format(today)
			+ " " + MOrg.get(ctx, getAD_Org_ID()).getValue();
			setName (name);	
			setIsApproved(false);
			setPosted (false);	// N
			setProcessed (false);
		}
	}	//	MCash

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MCash (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MCash

	/**
	 * 	Parent Constructor
	 *	@param cb cash book
	 *	@param today date - if null today
	 */
	public MCash (MCashBook cb, Timestamp today)
	{
		this (cb.getCtx(), 0, cb.get_TrxName());
		setClientOrg(cb);
		setC_CashBook_ID(cb.getC_CashBook_ID());
		if (today != null)
		{
			setStatementDate (today);	
			setDateAcct (today);
			String name = DisplayType.getDateFormat(DisplayType.Date).format(today)
			+ " " + cb.getName();
			setName (name);	
		}
		m_book = cb;
	}	//	MCash

	/**	Lines					*/
	private MCashLine[]		m_lines = null;
	/** CashBook				*/
	private MCashBook		m_book = null;

	/**
	 * 	Get Lines
	 *	@param requery requery
	 *	@return lines
	 */
	public MCashLine[] getLines (boolean requery)
	{
		if (m_lines != null && !requery)
			return m_lines;
		ArrayList<MCashLine> list = new ArrayList<MCashLine>();
		String sql = "SELECT * FROM C_CashLine WHERE C_Cash_ID=? ORDER BY C_Currency_ID";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, get_TrxName());
			pstmt.setInt (1, getC_Cash_ID());
			ResultSet rs = pstmt.executeQuery ();
			while (rs.next ())
				list.add (new MCashLine (getCtx(), rs, get_TrxName()));
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

		m_lines = new MCashLine[list.size ()];
		list.toArray (m_lines);
		return m_lines;
	}	//	getLines

	/**
	 * 	Get Cash Book
	 *	@return cash book
	 */
	public MCashBook getCashBook()
	{
		if (m_book == null)
			m_book = MCashBook.get(getCtx(), getC_CashBook_ID());
		return m_book;
	}	//	getCashBook

	/**
	 * 	Get Document No 
	 *	@return name
	 */
	public String getDocumentNo()
	{
		return getName();
	}	//	getDocumentNo

	/**
	 * 	Get Document Info
	 *	@return document info (untranslated)
	 */
	public String getDocumentInfo()
	{
		return Msg.getElement(getCtx(), "C_Cash_ID") + " " + getDocumentNo();
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
	 * 	Before Save
	 *	@param newRecord
	 *	@return true
	 */
	protected boolean beforeSave (boolean newRecord)
	{
		setAD_Org_ID(getCashBook().getAD_Org_ID());
		if (getAD_Org_ID() == 0)
		{
			log.saveError("Error", Msg.parseTranslation(getCtx(), "@AD_Org_ID@"));
			return false;
		}
		//	Calculate End Balance
		setEndingBalance(getBeginningBalance().add(getStatementDifference()));
		return true;
	}	//	beforeSave

	/**************************************************************************
	 * 	Before Delete
	 *	@return true/false
	 */
	protected boolean beforeDelete ()
	{
		/* saguayo: 10/03/2007 Integrate the delete cash process here */
		try {
			String sql = "UPDATE " +
			"C_Order " +
			"SET " +
			"C_CashLine_ID=null " +
			"WHERE " +
			"C_CashLine_ID IN (" +
			"SELECT " +
			"C_CashLine_ID " +
			"FROM " +
			"C_CashLine " +
			"WHERE " +
			"C_Cash_ID=?" +
			")";
			int no = DB.executeUpdate(sql, get_ID(), get_TrxName());
			if (no == -1) return false;

			sql = "UPDATE " +
			"C_Invoice " +
			"SET " +
			"C_CashLine_ID=null " +
			"WHERE " +
			"C_CashLine_ID IN (" +
			"SELECT " +
			"C_CashLine_ID " +
			"FROM " +
			"C_CashLine " +
			"WHERE " +
			"C_Cash_ID=?" +
			")";
			no = DB.executeUpdate(sql, get_ID(), get_TrxName());
			if (no == -1) return false;
		}
		catch (Exception e) {
			return false;
		}
		return true;
	}
	
	protected boolean afterDelete (boolean success)
	{
		if (!success)
			return success;
		MCashLine lines[] = getLines(false);		
		for (int i = 0; i < lines.length; i++) {
			lines[i].delete(true);
		}
		return success;
	}	//	afterDelete
	


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
			return engine.processIt (processAction, getDocAction());
	}	//	process

	/**	Process Message 			*/
	private String		m_processMsg = null;
	/**	Just Prepared Flag			*/
	private boolean		m_justPrepared = false;	
	private String rulestatus;
	private KieSession ksession;


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
		setDocAction(REF__DocumentAction.Prepare);
		return true;
	}	//	invalidateIt

	public int getLength()
	{
		MCashLine[] lines = getLines(false);
		return lines.length;
	}	
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
		int AD_Rule_ID = dt.getAD_Rule_ID();		
		KieBase kb = Env.startRule(AD_Rule_ID);
		if (kb != null)
		{
			ksession = kb.newKieSession();
			//ksession.addEventListener(new DebugAgendaEventListener());
			//ksession.addEventListener(new DebugRuleRuntimeEventListener());
			ksession.addEventListener(new CustomAgendaEventListener());
			ksession.addEventListener(new CustomWorkingMemoryEventListener());
			ksession.setGlobal("ctx", Env.getCtx());								
			ksession.insert(this);			
		}		
		else
		{
			setProcessMsg(String.format("%s %s %s", Env.getKieError(AD_Rule_ID), dt.getC_DocType_ID(), dt.getName()));
			if (getProcessMsg() != null)
				return DocAction.STATUS_Invalid;
		}		
		ksession.getAgenda().getAgendaGroup( "prepare" ).setFocus();
		ksession.fireAllRules();		
		ksession.dispose();
		return rulestatus;
		
//		//	Std Period open?
//		if (!MPeriod.isOpen(getCtx(), getDateAcct(), REF_C_DocTypeDocBaseType.CashJournal, Env.getAD_Org_ID(getCtx())))
//		{
//			m_processMsg = "@PeriodClosed@";
//			return DocAction.STATUS_Invalid;
//		}
//		MCashLine[] lines = getLines(false);
//		if (lines.length == 0)
//		{
//			m_processMsg = "@NoLines@";
//			return DocAction.STATUS_Invalid;
//		}
//		//	Add up Amounts
//		BigDecimal difference = Env.ZERO;
//		int C_Currency_ID = getC_Currency_ID();
//		for (int i = 0; i < lines.length; i++)
//		{
//			MCashLine line = lines[i];
//			if (!line.isActive())
//				continue;
//			if (C_Currency_ID == line.getC_Currency_ID())
//				difference = difference.add(line.getAmount().add(line.getWithholdingAmt()));
//			else
//			{
//				BigDecimal amt = MConversionRate.convert(getCtx(),line.getAmount().add(line.getWithholdingAmt()), 
//						line.getC_Currency_ID(), C_Currency_ID, getStatementDate(), line.getC_ConversionType_ID(), 
//						getAD_Client_ID(), getAD_Org_ID());
//				if (amt == null)
//				{
//					m_processMsg = "No Conversion Rate found - @C_CashLine_ID@= " + line.getLine();
//					return DocAction.STATUS_Invalid;
//				}
//				difference = difference.add(amt);
//			}
//		}
//		setStatementDifference(difference);
//		//	setEndingBalance(getBeginningBalance().add(getStatementDifference()));
//
//		m_processMsg = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_AFTER_PREPARE);
//		if (m_processMsg != null)
//			return DocAction.STATUS_Invalid;
//
//		m_justPrepared = true;
//		if (!REF__DocumentAction.Complete.equals(getDocAction()))
//			setDocAction(REF__DocumentAction.Complete);
//		return DocAction.STATUS_InProgress;
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
		if (!m_justPrepared) {
			String status = prepareIt();
			if (!DocAction.STATUS_InProgress.equals(status))
				return status;
		}		
		setProcessMsg(ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_BEFORE_COMPLETE));
		if (getProcessMsg() != null)
		{
			System.out.println("status invalid");
			return DocAction.STATUS_Invalid;
		}		
		MDocType dt = MDocType.get(getCtx(), getC_DocType_ID());
		int AD_Rule_ID = dt.getAD_Rule_ID();	
		log.log(Level.WARNING, String.format("ruling cash <%s>", getDocumentNo()));
		//System.out.println(String.format("ruling order <%s>", getDocumentNo()));
		KieBase kb = Env.startRule(AD_Rule_ID);
		if (kb != null)
		{
			ksession = kb.newKieSession();
			//ksession.addEventListener(new DebugRuleRuntimeEventListener());
			ksession.addEventListener(new CustomAgendaEventListener());
			ksession.addEventListener(new CustomWorkingMemoryEventListener());			
			ksession.setGlobal("ctx", Env.getCtx());								
			ksession.insert(this);			
		}		
		else
		{
			String error = String.format("%s en %s", Env.getKieError(AD_Rule_ID), dt.getName()); 						
			setProcessMsg(error);
			if (getProcessMsg() != null)
				return DocAction.STATUS_Invalid;
		}		
		ksession.getAgenda().getAgendaGroup( "complete" ).setFocus();
		setRulestatus(DocAction.STATUS_Invalid);		
		ksession.fireAllRules();		
		ksession.dispose();
		return rulestatus;
		
//		//	Re-Check
//		if (!m_justPrepared)
//		{
//			String status = prepareIt();
//			if (!DocAction.STATUS_InProgress.equals(status))
//				return status;
//		}
//
//		m_processMsg = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_BEFORE_COMPLETE);
//		if (m_processMsg != null)
//			return DocAction.STATUS_Invalid;
//
//
//		//	Implicit Approval
//		if (!isApproved())
//			approveIt();
//		//
//		log.info(toString());
//
//		if ( getC_Payment_ID() >  0 )
//		{
//			MPayment pay = new MPayment (getCtx(), getC_Payment_ID(), get_TrxName());
//			pay.setC_Cash_ID(this.getC_Cash_ID());
//			pay.setC_CashBook_ID(this.getC_CashBook_ID());
//			pay.save();
//		}
//
//		MCashLine[] lines = getLines(false);
//
//		int allocatelines = 0; 
//
//		//ArrayList<MAllocationHdr>	allocations  = new ArrayList<MAllocationHdr>();
//		ArrayList<MAllocation>	allocations  = new ArrayList<MAllocation>();
//
//		for (int i = 0; i < lines.length; i++)
//		{
//			System.out.println(i+" line(s) de "+lines.length);
//			MCashLine line = lines[i];
//			MAllocation hdr = null;
//			Boolean found = false; 
//			for (MAllocation allochdr:allocations)
//			{
//				if (allochdr.getC_Currency_ID() ==  line.getC_Currency_ID())
//				{
//					hdr = allochdr;
//					found = true;
//					break;					
//				}
//			}		
//			if (hdr == null)
//				hdr = new MAllocation();		
//			if (!found)
//			{				
//				if (!hdr.addHeader(this, getStatementDate(), getDateAcct(), line.getC_Currency_ID(), get_TrxName()))
//				{
//					m_processMsg = "Could not create Allocation Hdr";
//					return DocAction.STATUS_Invalid;
//				}					
//				allocations.add(hdr);
//			}			
//			if (REF_C_CashTrxType.Invoice.equals(line.getCashType()))
//			{
//				if ( line.getC_Invoice_ID() > 0 )
//				{					
//					MInvoice invoice = MInvoice.get(getCtx(), line.getC_Invoice_ID());
//					if (invoice.getWithholdingAmt().signum() > 0)
//					{
//						MWithholdingLine wline = MWithholdingLine.get(Env.getCtx(), MCashLine.Table_ID, line.getC_CashLine_ID(), get_TrxName());
//						if (wline != null)
//						{
//							if (wline.getWithholdingAmt().compareTo(line.getWithholdingAmt()) != 0 
//									&& wline.getParent().getDocStatus().equals(DocAction.STATUS_Completed))
//							{
//								m_processMsg = "no se puede alterar una percepcion ya completada Factura : "+invoice.getDocumentNo();
//								return DocAction.STATUS_Invalid;
//							}
//							else if (wline.getParent() == null)
//							{
//								wline.delete(true);
//							}
//							else if (!wline.getParent().getDocStatus().equals(DocAction.STATUS_Completed))
//							{
//								wline.delete(true);
//							}
//						}	
//					}
//					/* sergioaguayo (10/18/2007): do not complete if already paid */
//					if (invoice.getOpenAmt().signum()==0) {
//						m_processMsg = "@Error@ Invoice " + invoice.getSerial() + "-" + invoice.getDocumentNo() + "  @AlreadyPaid@";
//						return DocAction.STATUS_Invalid;
//					}
//					BigDecimal OverUnderAmt;
//					if (invoice.isSOTrx()) {
//						OverUnderAmt = invoice.getOpenAmt().subtract(line.getAmount()).subtract(line.getDiscountAmt());
//					}
//					else {
//						OverUnderAmt = invoice.getOpenAmt().negate().add(line.getAmount().negate()).add(line.getDiscountAmt());
//					}
//					if (!hdr.addLine(line, OverUnderAmt, invoice))
//					{
//						m_processMsg = "Could not create Allocation Line";
//						return DocAction.STATUS_Invalid;
//					}
//					allocatelines++;
//				}
//			}
//			else if (REF_C_CashTrxType.BillOfExchange.equals(line.getCashType()))
//			{
//				if (line.getC_BOE_ID() > 0 )
//				{
//					MBOE boe = MBOE.get(getCtx(),line.getC_BOE_ID(),get_TrxName());
//					BigDecimal OverUnderAmt;
//					if (boe.isSOTrx()) {
//						OverUnderAmt = boe.getOpenAmt().subtract(line.getAmount()).subtract(line.getDiscountAmt());				
//					}
//					else {
//						OverUnderAmt = boe.getOpenAmt().negate().add(line.getAmount().negate()).add(line.getDiscountAmt());
//					}
//
//					if (!hdr.addLine(line, OverUnderAmt, boe))
//					{
//						m_processMsg = "Could not create Allocation Line";
//						return DocAction.STATUS_Invalid;						
//					}
//					//					// Allocation Line					
//					//					MAllocationLine aLine = new MAllocationLine ( hdr, line.getAmount(), 
//					//							line.getDiscountAmt(), line.getWriteOffAmt(), OverUnderAmt);
//					//					aLine.setC_BOE_ID(line.getC_BOE_ID());
//					//					aLine.setC_CashLine_ID(line.getC_CashLine_ID());
//					//					aLine.setC_BPartner_ID(line.getC_BPartner_ID());
//					//					aLine.setC_Currency_ID(line.getC_Currency_ID());
//					//                                        aLine.setC_Project_ID(line.getC_Project_ID());
//					//					if (!aLine.save())
//					//					{
//					//						m_processMsg = "Could not create Allocation Line";
//					//						return DocAction.STATUS_Invalid;
//					//					}
//					if (line.getRenewedAmt().compareTo(Env.ZERO) != 0)					
//					{
//						BigDecimal RenewedAmt = line.getRenewedAmt().abs(); 
//						boe.setIsRenewed(true);
//						if (boe.save())
//						{
//							MBOE boerenew = new MBOE(getCtx(), 0, get_TrxName());
//							Timestamp duedate = boe.getR_DueDate();
//							Timestamp dateboe = boe.getR_DateBOE();
//							String DocumentNo = boe.getR_DocumentNo();							
//							boerenew.setC_Currency_ID(getC_Currency_ID());
//							boerenew.setC_ConversionType_ID(boe.getC_ConversionType_ID());
//							boerenew.setDateBOE(dateboe);
//							boerenew.setIsSOTrx(boe.isSOTrx());
//							boerenew.setGrandTotal(RenewedAmt.abs());
//							boerenew.setC_DocType_ID(boe.getC_DocType_ID());
//							boerenew.setC_DocTypeTarget_ID(boe.getC_DocTypeTarget_ID());
//							boerenew.setDocumentNo(DocumentNo);
//							boerenew.setDueDate(duedate);
//							boerenew.setC_BPartner_ID(boe.getC_BPartner_ID());
//							boerenew.setC_BPartner_Location_ID(boe.getC_BPartner_Location_ID());
//							boerenew.setDocStatus(DocAction.STATUS_Portfolio);	        
//							boerenew.setRef_BOE_ID(boe.getC_BOE_ID());
//							boerenew.setStatusDate(dateboe);
//							if (boerenew.save())
//							{
//								//
//								if (boerenew.discountIt())
//								{	        			        		
//									boerenew.save(get_TrxName());
//									MBOEStatement statement = MBOEStatement.get(boerenew.getC_BOE_ID(), boerenew.getDocStatus(), get_TrxName());
//									if ( statement != null )
//									{
//										statement.setStatusDate(boerenew.getStatusDate());
//										statement.save(get_TrxName());
//									}		        		
//								}
//							}
//							if (!hdr.addLine(boe, getC_Currency_ID(), RenewedAmt,Env.ZERO,Env.ZERO, OverUnderAmt))
//							{
//								m_processMsg = "Could not create Allocation Line";
//								return DocAction.STATUS_Invalid;											        	
//							}
//							//
//							//					        MAllocationLine renew = null;
//							//							if (boe.isSOTrx())
//							//								renew = new MAllocationLine (hdr, RenewedAmt.abs(), 
//							//									Env.ZERO, Env.ZERO, Env.ZERO);
//							//							else
//							//								renew = new MAllocationLine (hdr, RenewedAmt.abs().negate(), 
//							//									Env.ZERO, Env.ZERO, Env.ZERO);
//							//							renew.setDocInfo(getC_BPartner_ID(), 0, 0);
//							//							renew.setC_BOE_ID(boe.getC_BOE_ID());   // <-- letra que paga
//							//							renew.setAD_Table_ID(MBOE.Table_ID);    // <-- indica que es un pago con letra
//							//							renew.setRecord_ID(boerenew.getC_BOE_ID());  // <-- indica con que letra esta pagando.
//							//							renew.setC_Currency_ID(getC_Currency_ID());
//							//							renew.saveEx(get_TrxName());
//						}
//					}
//					allocatelines++;					
//				}				
//			}
//			else if (REF_C_CashTrxType.Charge.equals(line.getCashType()))
//			{
//				if (!hdr.addLine(line))
//				{
//					m_processMsg = "Could not create Allocation Line";
//					return DocAction.STATUS_Invalid;
//				}									
//				//				MAllocationLine aLine = new MAllocationLine ( hdr, line.getAmount(), 
//				//						line.getDiscountAmt(), line.getWriteOffAmt(), Env.ZERO);
//				//				aLine.setC_Charge_ID(line.getC_Charge_ID());
//				//				aLine.setC_CashLine_ID(line.getC_CashLine_ID());
//				//				aLine.setC_BPartner_ID(line.getC_BPartner_ID());
//				//				aLine.setC_Currency_ID(line.getC_Currency_ID());
//				//                                aLine.setC_Project_ID(line.getC_Project_ID());
//				//				if (!aLine.save())
//				//				{
//				//					m_processMsg = "Could not create Allocation Line";
//				//					return DocAction.STATUS_Invalid;
//				//				}				
//				allocatelines++;
//			}
//			else if (REF_C_CashTrxType.Difference.equals(line.getCashType()))
//			{
//				allocatelines++;
//			}
//			else if (REF_C_CashTrxType.GeneralExpense.equals(line.getCashType()))
//			{
//				allocatelines++;
//			}
//			else if (REF_C_CashTrxType.GeneralReceipts.equals(line.getCashType()))
//			{
//				allocatelines++;
//			}			
//		}
//
//		if (allocatelines == 0)
//		{
//			m_processMsg = "@NoLines@";
//			return DocAction.STATUS_Invalid;
//		}
//		for (MAllocation allochdr:allocations)
//		{
//			System.out.println(allochdr.getC_AllocationHdr_ID());
//			if (allochdr.completeIt())
//			{
//				if (allochdr.save())
//				{
//					if (!MFactAcct.alreadyPosted(X_C_AllocationHdr.Table_ID, allochdr.getC_AllocationHdr_ID(), get_TrxName()))
//					{				
//						String error = DocumentEngine.postImmediate(getCtx(),
//								getAD_Client_ID(), X_C_AllocationHdr.Table_ID, allochdr.getC_AllocationHdr_ID(), true,
//								get_TrxName());
//						if (error != null)
//							m_processMsg = error;				        					
//					}                    		
//				}
//			}
//		}
//
//		//	User Validation
//		String valid = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_AFTER_COMPLETE);
//		if (valid != null)
//		{
//			m_processMsg = valid;
//			return DocAction.STATUS_Invalid;
//		}
//		//
//		setProcessed(true);
//		setDocAction(REF__DocumentAction.Close);
//		return DocAction.STATUS_Completed;
	}	//	completeIt

	/**
	 * 	Void Document.
	 * 	Same as Close.
	 * 	@return true if success 
	 */
	public boolean voidIt()
	{
		log.info(toString());
		// Before Void
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_VOID);
		if (m_processMsg != null)
			return false;		
		// After Void
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_VOID);
		if (m_processMsg != null)
			return false;		
		setDocAction(REF__DocumentAction.None);
		return false;
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
		// After Close
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_CLOSE);
		if (m_processMsg != null)
			return false;

		setDocAction(REF__DocumentAction.None);
		return true;
	}	//	closeIt

	/**
	 * 	Reverse Correction
	 * 	@return true if success 
	 */
	public boolean reverseCorrectIt()
	{
		log.info(toString());
		// Before reverseCorrect
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_REVERSECORRECT);
		if (m_processMsg != null)
			return false;

		// After reverseCorrect
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_REVERSECORRECT);
		if (m_processMsg != null)
			return false;		

		return false;
	}	//	reverseCorrectionIt

	/**
	 * 	Reverse Accrual - none
	 * 	@return true if success 
	 */
	public boolean reverseAccrualIt()
	{
		log.info(toString());
		// Before reverseAccrual
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_REVERSEACCRUAL);
		if (m_processMsg != null)
			return false;

		// After reverseAccrual
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_REVERSEACCRUAL);
		if (m_processMsg != null)
			return false;

		return false;
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

		setProcessed(false);
		if (reverseCorrectIt())
			return true;

		// After reActivate
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_REACTIVATE);
		if (m_processMsg != null)
			return false;		
		return false;
	}	//	reActivateIt

	/**
	 * 	Set Processed
	 *	@param processed processed
	 */
	public void setProcessed (boolean processed)
	{
		super.setProcessed (processed);
		String sql = "UPDATE C_CashLine SET Processed='"
			+ (processed ? "Y" : "N")
			+ "' WHERE C_Cash_ID=" + getC_Cash_ID();
		int noLine = DB.executeUpdate (sql, get_TrxName());
		m_lines = null;
		log.fine(processed + " - Lines=" + noLine);
	}	//	setProcessed

	/**
	 * 	String Representation
	 *	@return info
	 */
	public String toString ()
	{
		StringBuffer sb = new StringBuffer ("MCash[");
		sb.append (get_ID ())
		.append ("-").append (getName())
		.append(", Balance=").append(getBeginningBalance())
		.append("->").append(getEndingBalance())
		.append ("]");
		return sb.toString ();
	}	//	toString

	/*************************************************************************
	 * 	Get Summary
	 *	@return Summary of Document
	 */
	public String getSummary()
	{
		StringBuffer sb = new StringBuffer();
		sb.append(getName());
		//	: Total Lines = 123.00 (#1)
		sb.append(": ")
		.append(Msg.translate(getCtx(),"BeginningBalance")).append("=").append(getBeginningBalance())
		.append(",")
		.append(Msg.translate(getCtx(),"EndingBalance")).append("=").append(getEndingBalance())
		.append(" (#").append(getLines(false).length).append(")");
		//	 - Description
		if (getDescription() != null && getDescription().length() > 0)
			sb.append(" - ").append(getDescription());
		return sb.toString();
	}	//	getSummary

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
	 *	@return AD_User_ID
	 */
	public int getDoc_User_ID()
	{
		return getCreatedBy();
	}	//	getDoc_User_ID

	/**
	 * 	Get Document Approval Amount
	 *	@return amount difference
	 */
	public BigDecimal getApprovalAmt()
	{
		return getStatementDifference();
	}	//	getApprovalAmt

	/**
	 * 	Get Currency
	 *	@return Currency
	 */
	public int getC_Currency_ID ()
	{
		return getCashBook().getC_Currency_ID();
	}	//	getC_Currency_ID

	public boolean RestoreIt() {
		String sql = "";
		if (!MPeriod.isOpen(getCtx(), getDateAcct(), REF_C_DocTypeDocBaseType.CashJournal, getAD_Org_ID(), getAD_Client_ID()))
		{
			m_processMsg = "@PeriodClosed@";
			return false;
		}
		try {
			Doc doc = null;
			MAcctSchema[] ass = MAcctSchema.getClientAcctSchema(Env.getCtx(), getAD_Client_ID());
			sql = "SELECT DISTINCT hdr.C_AllocationHdr_ID from c_allocationhdr hdr"; 
			sql += " JOIN c_allocationline line ON hdr.c_allocationhdr_id = line.c_allocationhdr_id"; 
			sql += " JOIN c_cashline cl ON cl.c_cashline_id = line.c_cashline_id"; 
			sql += " JOIN c_cash c on c.c_cash_id = cl.c_cash_id";
			sql += " WHERE c.c_cash_id = ?";				
			{
				PreparedStatement pstmt = DB.prepareStatement(sql, null);
				pstmt.setInt(1, getC_Cash_ID());
				ResultSet rs = pstmt.executeQuery();
				while (rs.next())
				{
					Integer C_AllocationHdr_ID = rs.getInt("C_AllocationHdr_ID");
					if (C_AllocationHdr_ID > 0)
					{
						doc = Doc.get (ass, MAllocationHdr.Table_ID, C_AllocationHdr_ID, get_TrxName());
						if (doc != null)
							doc.deleteAcct();
						// ahora borramos los allocation
						sql = "DELETE FROM c_allocationline WHERE c_allocationhdr_ID=?";
						int no = DB.executeUpdate(sql, C_AllocationHdr_ID, get_TrxName());		
						sql = "DELETE FROM c_allocationhdr WHERE c_allocationhdr_ID=?";
						no = DB.executeUpdate(sql, C_AllocationHdr_ID, get_TrxName());
					}					
				}
				rs.close();
				pstmt.close();
			}
			MCashLine lines[] = getLines(false);		
			for (int i = 0; i < lines.length; i++) {
				lines[i].setProcessed(false);
				if ( lines[i].getC_Invoice_ID() >  0)
				{
					MInvoice invoice = new MInvoice(Env.getCtx(), lines[i].getC_Invoice_ID(), get_TrxName());
					invoice.setIsPaid(false);
					invoice.save(get_TrxName());
				}
				if ( lines[i].getC_BOE_ID() >  0)
				{
					MBOE boe = new MBOE(Env.getCtx(), lines[i].getC_BOE_ID(), get_TrxName());
					boe.setIsPaid(false);
					boe.save(get_TrxName());
				}				
				lines[i].save(get_TrxName());
			}
			setDocStatus(REF__DocumentStatus.Drafted);
			setDocAction(REF__DocumentAction.Complete);
			setProcessing(false);
			setProcessed(false);
			setPosted(false);
			setIsApproved(false);
			save(get_TrxName());
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql, e);
		}					
		return true;
	}

	public void setProcessMsg(String msg)
	{
		m_processMsg = msg;
	}
	
	public String getRulestatus() {
		return rulestatus;
	}

	public void setRulestatus(String rulestatus) {		
		if (rulestatus.compareTo(DocAction.STATUS_Completed) == 0 || 
			rulestatus.compareTo(DocAction.STATUS_WaitingPayment) == 0 && 
			getProcessMsg() == null)
			setProcessed(true);
		this.rulestatus = rulestatus;
	}
	
}	//	MCash
