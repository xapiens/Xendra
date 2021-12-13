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
import java.text.DecimalFormat;
import java.util.*;
import java.util.logging.*;


import org.compiere.model.persistence.X_AD_MessageFormat;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.model.persistence.X_M_Movement;
import org.compiere.model.persistence.X_M_MovementConfirm;
import org.compiere.model.reference.REF_C_OrderDeliveryRule;
import org.compiere.model.reference.REF__DocumentAction;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;
import org.compiere.model.reference.REF__DocumentStatus;
import org.compiere.model.reference.REF__MMPolicy;
import org.compiere.process.*;
import org.compiere.util.*;
import org.kie.api.KieBase;
import org.kie.api.runtime.KieSession;
import org.xendra.Constants;
import org.xendra.messages.MessageQ;
import org.xendra.rules.CustomAgendaEventListener;
import org.xendra.rules.CustomWorkingMemoryEventListener;
import org.xendra.xendrian.*;
/**
 *	Inventory Movement Model
 *	
 *  @author Jorg Janke
 *  @version $Id: MMovement.java 5822 2016-06-15 22:56:06Z xapiens $
 */
public class MMovement extends X_M_Movement implements DocAction
{
	/**
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param M_Movement_ID id
	 *	@param trxName transaction
	 */
	public MMovement (Properties ctx, int M_Movement_ID, String trxName)
	{
		super (ctx, M_Movement_ID, trxName);
		if (M_Movement_ID == 0)
		{
			//	setC_DocType_ID (0);
			setDocAction (REF__DocumentAction.Complete);	// CO
			setDocStatus (REF__DocumentStatus.Drafted);	// DR
			setIsApproved (false);
			setIsInTransit (false);
			setMovementDate (new Timestamp(System.currentTimeMillis()));	// @#Date@
			setPosted (false);
			super.setProcessed (false);
		}	
	}	//	MMovement

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MMovement (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MMovement

	/**	Lines						*/
	private MMovementLine[]		m_lines = null;
	/** Confirmations				*/
	private MMovementConfirm[]	m_confirms = null;

	/**
	 * 	Get Lines
	 *	@param requery requery
	 *	@return array of lines
	 */
	public MMovementLine[] getLines (boolean requery)
	{
		if (m_lines != null && !requery)
			return m_lines;
		//
		ArrayList<MMovementLine> list = new ArrayList<MMovementLine>();
		String sql = "SELECT * FROM M_MovementLine WHERE M_Movement_ID=? ORDER BY Line";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, get_TrxName());
			pstmt.setInt (1, getM_Movement_ID());
			ResultSet rs = pstmt.executeQuery ();
			while (rs.next ())
			{
				list.add (new MMovementLine (getCtx(), rs, get_TrxName()));
			}
			rs.close ();
			pstmt.close ();
			pstmt = null;
		} catch (Exception e)
		{
			log.log(Level.SEVERE, "getLines", e);
		}
		try
		{
			if (pstmt != null)
				pstmt.close ();
			pstmt = null;
		} catch (Exception e)
		{
			pstmt = null;
		}

		m_lines = new MMovementLine[list.size ()];
		list.toArray (m_lines);
		return m_lines;
	}	//	getLines

	/**
	 * 	Get Confirmations
	 * 	@param requery requery
	 *	@return array of Confirmations
	 */
	public MMovementConfirm[] getConfirmations(boolean requery, String trxName)
	{
		if (m_confirms != null && !requery)
			return m_confirms;

		String where = "M_Movement_ID=?";
		//m_confirms 		
		List<MMovementConfirm> list = new Query(Env.getCtx(), X_M_MovementConfirm.Table_Name, where, get_TrxName())
		.setParameters(getM_Movement_ID()).list();		
		//		ArrayList<MMovementConfirm> list = new ArrayList<MMovementConfirm>();
		//		String sql = "SELECT * FROM M_MovementConfirm WHERE M_Movement_ID=?";
		//		PreparedStatement pstmt = null;
		//		try
		//		{
		//			pstmt = DB.prepareStatement (sql, get_TrxName());
		//			pstmt.setInt (1, getM_Movement_ID());
		//			ResultSet rs = pstmt.executeQuery ();
		//			while (rs.next ())
		//				list.add(new MMovementConfirm(getCtx(), rs, get_TrxName()));
		//			rs.close ();
		//			pstmt.close ();
		//			pstmt = null;
		//		}
		//		catch (Exception e)
		//		{
		//			log.log(Level.SEVERE, "getConfirmations", e);
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

		m_confirms = new MMovementConfirm[list.size ()];
		list.toArray (m_confirms);
		return m_confirms;
	}	//	getConfirmations

	/**
	 * 	Add to Description
	 *	@param description text
	 */
	public void addDescription (String description)
	{
		String desc = getDescription();
		if (desc == null)
			setDescription(description);
		else
			setDescription(desc + " | " + description);
	}	//	addDescription

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
	 * 	Before Save
	 *	@param newRecord new
	 *	@return true
	 */
	protected boolean beforeSave (boolean newRecord)
	{
		if (getC_DocType_ID() == 0)
		{
			MDocType types[] = MDocType.getOfDocBaseType(getCtx(), REF_C_DocTypeDocBaseType.MaterialMovement);
			if (types.length > 0)	//	get first
				setC_DocType_ID(types[0].getC_DocType_ID());
			else
			{
				log.saveError("Error", Msg.parseTranslation(getCtx(), "@NotFound@ @C_DocType_ID@"));
				return false;
			}
		}
		return true;
	}	//	beforeSave

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
		String sql = "UPDATE M_MovementLine SET Processed='"
				+ (processed ? "Y" : "N")
				+ "' WHERE M_Movement_ID=" + getM_Movement_ID();
		int noLine = DB.executeUpdate(sql, get_TrxName());
		m_lines = null;
		log.fine("Processed=" + processed + " - Lines=" + noLine);
	}	//	setProcessed


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
	}	//	processIt

	/**	Process Message 			*/
	private String		m_processMsg = null;
	/**	Just Prepared Flag			*/
	private boolean		m_justPrepared = false;

	private String rulestatus;	
	private KieSession ksession;

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


	public String prepareIt()
	{						
		log.info(toString());
		setProcessMsg(ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_BEFORE_PREPARE));
		if (getProcessMsg() != null)
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
		setRulestatus(DocAction.STATUS_InProgress);
		ksession.getAgenda().getAgendaGroup( "prepare" ).setFocus();
		ksession.fireAllRules();		
		ksession.dispose();
		return rulestatus;
	}	
	/**
	 *	Prepare Document
	 * 	@return new status (In Progress or Invalid) 
	 */
	public String prepareIt2()
	{
		log.info(toString());
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_BEFORE_PREPARE);
		if (m_processMsg != null)
			return DocAction.STATUS_Invalid;
		MDocType dt = MDocType.get(getCtx(), getC_DocType_ID());
		//		if (dt.isSendMessage())
		//		{
		//			String error = beforetransaction();
		//			if (error.length() > 0)
		//			{
		//				m_processMsg = error;
		//				return DocAction.STATUS_Invalid;
		//			}	
		//		}
		//	Std Period open?
		if (!MPeriod.isOpen(getCtx(), getMovementDate(), dt.getDocBaseType(), getAD_Org_ID(), getAD_Client_ID()))
		{
			m_processMsg = "@PeriodClosed@";
			return DocAction.STATUS_Invalid;
		}
		MMovementLine[] lines = getLines(false);
		if (lines.length == 0)
		{
			m_processMsg = "@NoLines@";
			return DocAction.STATUS_Invalid;
		}
		//	Add up Amounts

		//checkMaterialPolicy();		
		if (!checkMaterialOnHand())
		{	
			//m_processMsg = "No Stock available to complete";
			return DocAction.STATUS_Invalid;
		}

		if (getIdentifier() == null)
		{
			setIdentifier(Util.getUUID());
		}		
		//	Confirmation
		if (dt.isInTransit())
			createConfirmation();

		m_processMsg = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_AFTER_PREPARE);
		if (m_processMsg != null)
			return DocAction.STATUS_Invalid;
		//		String error = Utilities.TestQueue(Constants.QTRANSFERQUEUE);
		//		if (error.length() > 0)
		//		{
		//			m_processMsg = " No conexion al servidor de mensajes";
		//			return DocAction.STATUS_Invalid;
		//		}

		m_justPrepared = true;
		if (!REF__DocumentAction.Complete.equals(getDocAction()))
			setDocAction(REF__DocumentAction.Complete);
		return DocAction.STATUS_InProgress;
	}	//	prepareIt


	/**
	 * 	Create Movement Confirmation
	 */
	private void createConfirmation()
	{
		MMovementConfirm[] confirmations = getConfirmations(false, null);
		if (confirmations.length > 0)
			return;
		//	Create Confirmation
		MMovementConfirm.create (this, false);

	}	//	createConfirmation

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
		log.log(Level.WARNING, String.format("ruling movement <%s>", getDocumentNo()));
		KieBase kb = Env.startRule(AD_Rule_ID);
		if (kb != null)
		{
			ksession = kb.newKieSession();
			List<Integer> channels = Env.getChannels(AD_Rule_ID);
			if (channels.size() > 0) {
				for (Integer channel:channels) {
					X_AD_Rule rulechannel = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null)
					.setParameters(channel).first();
					if (rulechannel != null) {
						HashMap props = rulechannel.getProperties();
						String name = rulechannel.getName();
						if (props.containsKey(X_AD_MessageFormat.COLUMNNAME_AD_MessageFormat_ID)) {
							Integer messageid = Integer.valueOf(props.get(X_AD_MessageFormat.COLUMNNAME_AD_MessageFormat_ID).toString());
							MMessageFormat format = new Query(Env.getCtx(), X_AD_MessageFormat.Table_Name, "AD_MessageFormat_ID = ?", null)
							.setParameters(messageid).first();
							if (format != null) {
								MessageQ messageq = new MessageQ();
								messageq.setMessageFormat(format);								
								ksession.registerChannel(name, messageq);	
							}							
						}						
					}						
				}				
			}			
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
		setRulestatus(DocAction.STATUS_Completed);		
		ksession.fireAllRules();	
		if (rulestatus.equals(DocAction.STATUS_Completed)) {
			ksession.getAgenda().getAgendaGroup( "post" ).setFocus();
			ksession.fireAllRules();
		}
		ksession.dispose();
		return rulestatus;
	}	
	/**
	 * 	Complete Document
	 * 	@return new status (Complete, In Progress, Invalid, Waiting ..)
	 */
	public String completeIt2()
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


		//	Outstanding (not processed) Incoming Confirmations ?
		MMovementConfirm[] confirmations = getConfirmations(true, null);
		for (int i = 0; i < confirmations.length; i++)
		{
			MMovementConfirm confirm = confirmations[i];
			if (!confirm.isProcessed())
			{
				m_processMsg = "Open: @M_MovementConfirm_ID@ - " 
						+ confirm.getDocumentNo();
				return DocAction.STATUS_InProgress;
			}
		}

		//	Implicit Approval
		if (!isApproved())
			approveIt();
		log.info(toString());

		MDocType dt = MDocType.get(getCtx(), getC_DocType_ID());
		Integer C_Period_ID = MPeriod.get(Env.getCtx(), getMovementDate(), getAD_Org_ID(), getAD_Client_ID()).getC_Period_ID();

		//
		MAcctSchema as = MClient.get(getCtx(), getAD_Client_ID()).getAcctSchema();

		MCostElement ce = new MCostElement(Env.getCtx(), as.getM_CostElement_ID(), get_TrxName());

		MMovementLine[] lines = getLines(false);
		for (int i = 0; i < lines.length; i++)
		{
			MMovementLine line = lines[i];

			if(!isReversal())
				checkMaterialPolicy(line);

			if (line.getM_AttributeSetInstance_ID() == 0)
			{
				MMovementLineMA mas[] = MMovementLineMA.get(getCtx(),
						line.getM_MovementLine_ID(), get_TrxName());
				for (int j = 0; j < mas.length; j++)
				{
					MMovementLineMA ma = mas[j];
					//
					MStorage storageFrom = MStorage.get(getCtx(), line.getM_Locator_ID(), 
							line.getM_Product_ID(), ma.getM_AttributeSetInstance_ID(), get_TrxName());
					if (storageFrom == null)
						storageFrom = MStorage.getCreate(getCtx(), line.getM_Locator_ID(), 
								line.getM_Product_ID(), ma.getM_AttributeSetInstance_ID(), get_TrxName());
					//
					MStorage storageTo = MStorage.get(getCtx(), line.getM_LocatorTo_ID(), 
							line.getM_Product_ID(), ma.getM_AttributeSetInstance_ID(), get_TrxName());
					if (storageTo == null)
						storageTo = MStorage.getCreate(getCtx(), line.getM_LocatorTo_ID(), 
								line.getM_Product_ID(), ma.getM_AttributeSetInstance_ID(), get_TrxName());
					//
					storageFrom.setQtyOnHand(storageFrom.getQtyOnHand().subtract(ma.getMovementQty()));
					if (!storageFrom.save(get_TrxName()))
					{
						m_processMsg = "Storage From not updated (MA)";
						return DocAction.STATUS_Invalid;
					}
					//
					storageTo.setQtyOnHand(storageTo.getQtyOnHand().add(ma.getMovementQty()));
					if (!storageTo.save(get_TrxName()))
					{
						m_processMsg = "Storage To not updated (MA)";
						return DocAction.STATUS_Invalid;
					}				
				}
			}
			//	Fallback - We have ASI
			//if (trxFrom == null)
			else
			{
				MStorage storageFrom = MStorage.get(getCtx(), line.getM_Locator_ID(), 
						line.getM_Product_ID(), line.getM_AttributeSetInstance_ID(), get_TrxName());
				if (storageFrom == null)
					storageFrom = MStorage.getCreate(getCtx(), line.getM_Locator_ID(), 
							line.getM_Product_ID(), line.getM_AttributeSetInstance_ID(), get_TrxName());
				//
				MStorage storageTo = MStorage.get(getCtx(), line.getM_LocatorTo_ID(), 
						line.getM_Product_ID(), line.getM_AttributeSetInstanceTo_ID(), get_TrxName());
				if (storageTo == null)
					storageTo = MStorage.getCreate(getCtx(), line.getM_LocatorTo_ID(), 
							line.getM_Product_ID(), line.getM_AttributeSetInstanceTo_ID(), get_TrxName());
				//
				storageFrom.setQtyOnHand(storageFrom.getQtyOnHand().subtract(line.getMovementQty()));
				if (!storageFrom.save(get_TrxName()))
				{
					m_processMsg = "Storage From not updated";
					return DocAction.STATUS_Invalid;
				}
				//
				storageTo.setQtyOnHand(storageTo.getQtyOnHand().add(line.getMovementQty()));
				if (!storageTo.save(get_TrxName()))
				{
					m_processMsg = "Storage To not updated";
					return DocAction.STATUS_Invalid;
				}

			}	//	Fallback

		}	//	for all lines
		//	User Validation
		String valid = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_AFTER_COMPLETE);
		if (valid != null)
		{
			m_processMsg = valid;
			return DocAction.STATUS_Invalid;
		}
		setProcessed(true);
		setDocAction(REF__DocumentAction.Close);			
		//		if (dt.isSendMessage())
		//			Utilities.sendMessage(getIdentifier(), Constants.QTRANSFERQUEUE, getMessage());
		return DocAction.STATUS_Completed;
	}	//	completeIt

	public String getMessage() {		
		FormatMessage s = new FormatMessage(Constants.TRANSFERMESSAGE);
		s.AddDocumentPart(Constants.HEADER, X_M_Movement.Table_Name);
		//s.AddProperty(Constants.HEADER, Constants.ID, Util.getUUID());
		s.addProperties(Constants.HEADER, (PO) this);		
		MMovementLine[] lines = this.getLines(false);
		int linesprocessed = 0;
		for (MMovementLine line:lines)
		{
			String lineno = String.format("Line%d", linesprocessed);
			s.addProperties(lineno, line);
			linesprocessed++;
		}
		s.AddDocumentPart(Constants.LINES, "");
		s.AddProperty(Constants.LINES, Constants.Count, String.valueOf(linesprocessed));		
		return s.getMessage();
	}		

	private boolean checkMaterialOnHand()	
	{
		boolean goahead = true;
		if ( this.getDeliveryRule().equals(REF_C_OrderDeliveryRule.Availability))
		{
			MMovementLine[] lines = getLines(false);
			for (int i = 0; i < lines.length; i++)
			{
				MMovementLine line = lines[i];

				BigDecimal available = MStorage.getQtyAvailable(0, line.getM_Locator_ID(), line.getM_Product_ID(), line.getM_AttributeSetInstance_ID(), get_TrxName());
				if ( available.compareTo(Env.ZERO) == 0 )
					available = MStorage.getQtyAvailable(0, line.getM_Locator_ID(), line.getM_Product_ID(), 0, get_TrxName());
				BigDecimal qtyToDeliver = line.getMovementQty();
				if ( available.compareTo(qtyToDeliver) < 0 )
				{
					MProduct product = MProduct.get(Env.getCtx(), line.getM_Product_ID(), get_TrxName());
					DecimalFormat format = DisplayType.getNumberFormat(DisplayType.Quantity, Env.getLanguage(Env.getCtx()));															
					if (goahead)
					{
						goahead = false;
						m_processMsg = "";
					}
					m_processMsg += product.getValue()+" "+product.getName()+" Disponible: "+format.format(available)+" Solicitado: "+format.format(qtyToDeliver)+"\n";
				}
			}	
		}
		return goahead;
	}
	//	/**
	//	 * 	Check Material Policy
	//	 * 	Sets line ASI
	//	 */
	//	private void checkMaterialPolicy()
	//	{
	//		int no = MMovementLineMA.deleteMovementMA(getM_Movement_ID(), get_TrxName());
	//		if (no > 0)
	//			log.config("Delete old #" + no);
	//		MMovementLine[] lines = getLines(false);
	//		
	//		MClient client = MClient.get(getCtx());
	//		
	//		//	Check Lines
	//		for (int i = 0; i < lines.length; i++)
	//		{
	//			MMovementLine line = lines[i];
	//			boolean needSave = false;
	//
	//			//	Attribute Set Instance
	//			if (line.getM_AttributeSetInstance_ID() == 0)
	//			{
	//				MProduct product = MProduct.get(getCtx(), line.getM_Product_ID());
	//				MProductCategory pc = MProductCategory.get(getCtx(), product.getM_Product_Category_ID());
	//				String MMPolicy = pc.getMMPolicy();
	//				if (MMPolicy == null || MMPolicy.length() == 0)
	//					MMPolicy = client.getMMPolicy();
	//				//
	//				MStorage[] storages = MStorage.getAllWithASI(getCtx(), 
	//					line.getM_Product_ID(),	line.getM_Locator_ID(), 
	//					REF__MMPolicy.FiFo.equals(MMPolicy), get_TrxName());
	//				BigDecimal qtyToDeliver = line.getMovementQty();
	//				for (int ii = 0; ii < storages.length; ii++)
	//				{
	//					MStorage storage = storages[ii];
	//					if (ii == 0)
	//					{
	//						if (storage.getQtyOnHand().compareTo(qtyToDeliver) >= 0)
	//						{
	//							line.setM_AttributeSetInstance_ID(storage.getM_AttributeSetInstance_ID());
	//							needSave = true;
	//							log.config("Direct - " + line);
	//							qtyToDeliver = Env.ZERO;
	//						}
	//						else
	//						{
	//							log.config("Split - " + line);
	//							MMovementLineMA ma = new MMovementLineMA (line, 
	//								storage.getM_AttributeSetInstance_ID(),
	//								storage.getQtyOnHand());
	//							if (!ma.save())
	//								;
	//							qtyToDeliver = qtyToDeliver.subtract(storage.getQtyOnHand());
	//							log.fine("#" + ii + ": " + ma + ", QtyToDeliver=" + qtyToDeliver);
	//						}
	//					}
	//					else	//	 create addl material allocation
	//					{
	//						MMovementLineMA ma = new MMovementLineMA (line, 
	//							storage.getM_AttributeSetInstance_ID(),
	//							qtyToDeliver);
	//						if (storage.getQtyOnHand().compareTo(qtyToDeliver) >= 0)
	//							qtyToDeliver = Env.ZERO;
	//						else
	//						{
	//							ma.setMovementQty(storage.getQtyOnHand());
	//							qtyToDeliver = qtyToDeliver.subtract(storage.getQtyOnHand());
	//						}
	//						if (!ma.save())
	//							;
	//						log.fine("#" + ii + ": " + ma + ", QtyToDeliver=" + qtyToDeliver);
	//					}
	//					if (qtyToDeliver.signum() == 0)
	//						break;
	//				}	//	 for all storages
	//					
	//				//	No AttributeSetInstance found for remainder
	//				if (qtyToDeliver.signum() != 0)
	//				{
	//					MMovementLineMA ma = new MMovementLineMA (line, 
	//						0, qtyToDeliver);
	//					if (!ma.save())
	//						;
	//					log.fine("##: " + ma);
	//				}
	//			}	//	attributeSetInstance
	//			
	//			if (needSave && !line.save())
	//				log.severe("NOT saved " + line);
	//		}	//	for all lines
	//
	//	}	//	checkMaterialPolicy

	/**
	 * 	Check Material Policy
	 * 	Sets line ASI
	 */
	public void checkMaterialPolicy(MMovementLine line)
	{
		int no = MMovementLineMA.deleteMovementMA(getM_Movement_ID(), get_TrxName());
		if (no > 0)
			log.config("Delete old #" + no);

		boolean needSave = false;

		//	Attribute Set Instance
		if (line.getM_AttributeSetInstance_ID() == 0)
		{
			MProduct product = MProduct.get(getCtx(), line.getM_Product_ID(), get_TrxName());
			String MMPolicy = product.getMMPolicy();
			MStorage[] storages = MStorage.getWarehouse(getCtx(), 0, line.getM_Product_ID(), 0, 
					null, REF__MMPolicy.FiFo.equals(MMPolicy), true, line.getM_Locator_ID(), get_TrxName());

			BigDecimal qtyToDeliver = line.getMovementQty();

			for (MStorage storage: storages)
			{
				if (storage.getQtyOnHand().compareTo(qtyToDeliver) >= 0)
				{
					MMovementLineMA ma = new MMovementLineMA (line, 
							storage.getM_AttributeSetInstance_ID(),
							qtyToDeliver);
					ma.saveEx();		
					qtyToDeliver = Env.ZERO;
					log.fine( ma + ", QtyToDeliver=" + qtyToDeliver);		
				}
				else
				{	
					MMovementLineMA ma = new MMovementLineMA (line, 
							storage.getM_AttributeSetInstance_ID(),
							storage.getQtyOnHand());
					ma.saveEx();	
					qtyToDeliver = qtyToDeliver.subtract(storage.getQtyOnHand());
					log.fine( ma + ", QtyToDeliver=" + qtyToDeliver);		
				}
				if (qtyToDeliver.signum() == 0)
					break;
			}

			//	No AttributeSetInstance found for remainder
			if (qtyToDeliver.signum() != 0)
			{
				//deliver using new asi
				MAttributeSetInstance asi = MAttributeSetInstance.create(getCtx(), product, get_TrxName());
				int M_AttributeSetInstance_ID = asi.getM_AttributeSetInstance_ID();
				MMovementLineMA ma = new MMovementLineMA (line, M_AttributeSetInstance_ID , qtyToDeliver);
				ma.saveEx();
				log.fine("##: " + ma);
			}
		}	//	attributeSetInstance

		if (needSave)
		{
			line.saveEx();
		}
	}	//	checkMaterialPolicy

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

		if (REF__DocumentStatus.Closed.equals(getDocStatus())
				|| REF__DocumentStatus.Reversed.equals(getDocStatus())
				|| REF__DocumentStatus.Voided.equals(getDocStatus()))
		{
			m_processMsg = "Document Closed: " + getDocStatus();
			return false;
		}

		//	Not Processed
		if (REF__DocumentStatus.Drafted.equals(getDocStatus())
				|| REF__DocumentStatus.Invalid.equals(getDocStatus())
				|| REF__DocumentStatus.InProgress.equals(getDocStatus())
				|| REF__DocumentStatus.Approved.equals(getDocStatus())
				|| REF__DocumentStatus.NotApproved.equals(getDocStatus()) )
		{
			//	Set lines to 0
			MMovementLine[] lines = getLines(false);
			for (int i = 0; i < lines.length; i++)
			{
				MMovementLine line = lines[i];
				BigDecimal old = line.getMovementQty();
				if (old.compareTo(Env.ZERO) != 0)
				{
					line.setMovementQty(Env.ZERO);
					line.addDescription("Void (" + old + ")");
					line.save(get_TrxName());
				}
			}
		}
		else
		{
			return reverseCorrectIt();
		}
		// After Void
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_VOID);
		if (m_processMsg != null)
			return false;

		setProcessed(true);
		setDocAction(REF__DocumentAction.None);
		return true;
	}	//	voidIt

	/**
	 * 	Close Document.
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

		//	Close Not delivered Qty
		setDocAction(REF__DocumentAction.None);
		return true;
	}	//	closeIt

	//	/**
	//	 * 	Reverse Correction
	//	 * 	@return false 
	//	 */
	//	public boolean reverseCorrectIt()
	//	{
	//		log.info(toString());
	//		// Before reverseCorrect
	//		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_REVERSECORRECT);
	//		if (m_processMsg != null)
	//			return false;
	//		
	//		MDocType dt = MDocType.get(getCtx(), getC_DocType_ID());
	//		if (!MPeriod.isOpen(getCtx(), getMovementDate(), dt.getDocBaseType()))
	//		{
	//			m_processMsg = "@PeriodClosed@";
	//			return false;
	//		}
	//
	//		//	Deep Copy
	//		MMovement reversal = new MMovement(getCtx(), 0, get_TrxName());
	//		copyValues(this, reversal, getAD_Client_ID(), getAD_Org_ID());
	//		reversal.setDocStatus(REF__DocumentStatus.Drafted);
	//		reversal.setDocAction(REF__DocumentAction.Complete);
	//		reversal.setIsApproved (false);
	//		reversal.setIsInTransit (false);
	//		reversal.setPosted(false);
	//		reversal.setProcessed(false);
	//		reversal.addDescription("{->" + getDocumentNo() + ")");
	//		reversal.setFact_ID("");
	//		if (!reversal.save())
	//		{
	//			m_processMsg = "Could not create Movement Reversal";
	//			return false;
	//		}
	//		
	//		//	Reverse Line Qty
	//		MMovementLine[] oLines = getLines(true);
	//		for (int i = 0; i < oLines.length; i++)
	//		{
	//			MMovementLine oLine = oLines[i];
	//			MMovementLine rLine = new MMovementLine(getCtx(), 0, get_TrxName());
	//			copyValues(oLine, rLine, oLine.getAD_Client_ID(), oLine.getAD_Org_ID());
	//			rLine.setM_Movement_ID(reversal.getM_Movement_ID());
	//			//
	//			rLine.setMovementQty(rLine.getMovementQty().negate());
	//			rLine.setTargetQty(Env.ZERO);
	//			rLine.setScrappedQty(Env.ZERO);
	//			rLine.setConfirmedQty(Env.ZERO);
	//			rLine.setProcessed(false);
	//			if (!rLine.save())
	//			{
	//				m_processMsg = "Could not create Movement Reversal Line";
	//				return false;
	//			}
	//		}
	//		//
	//		if (!reversal.processIt(DocAction.ACTION_Complete))
	//		{
	//			m_processMsg = "Reversal ERROR: " + reversal.getProcessMsg();
	//			return false;
	//		}
	//		reversal.closeIt();
	//		reversal.setDocStatus(REF__DocumentStatus.Reversed);
	//		reversal.setDocAction(REF__DocumentAction.None);
	//		reversal.save();
	//		m_processMsg = reversal.getDocumentNo();
	//		
	//		// After reverseCorrect
	//		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_REVERSECORRECT);
	//		if (m_processMsg != null)
	//			return false;
	//		
	//		//	Update Reversed (this)
	//		addDescription("(" + reversal.getDocumentNo() + "<-)");
	//		setProcessed(true);
	//		setDocStatus(REF__DocumentStatus.Reversed);	//	may come from void
	//		setDocAction(REF__DocumentAction.None);
	//		
	//		return true;
	//	}	//	reverseCorrectionIt
	//	
	//	/**
	//	 * 	Reverse Accrual - none
	//	 * 	@return false 
	//	 */
	//	public boolean reverseAccrualIt()
	//	{
	//		log.info(toString());
	//		// Before reverseAccrual
	//		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_REVERSEACCRUAL);
	//		if (m_processMsg != null)
	//			return false;
	//		
	//		// After reverseAccrual
	//		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_REVERSEACCRUAL);
	//		if (m_processMsg != null)
	//			return false;
	//		
	//		return false;
	//	}	//	reverseAccrualIt


	/**
	 * 	Reverse Correction
	 * 	@return false 
	 */
	public boolean reverseCorrectIt()
	{
		log.info(toString());
		// Before reverseCorrect
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_REVERSECORRECT);
		if (m_processMsg != null)
			return false;

		MDocType dt = MDocType.get(getCtx(), getC_DocType_ID());
		if (!MPeriod.isOpen(getCtx(), getMovementDate(), dt.getDocBaseType(), getAD_Org_ID(), getAD_Client_ID()))
		{
			m_processMsg = "@PeriodClosed@";
			return false;
		}

		//	Deep Copy
		MMovement reversal = new MMovement(getCtx(), 0, get_TrxName());
		copyValues(this, reversal, getAD_Client_ID(), getAD_Org_ID());
		reversal.setDocStatus(REF__DocumentStatus.Drafted);
		reversal.setDocAction(REF__DocumentAction.Complete);
		reversal.setIsApproved (false);
		reversal.setIsInTransit (false);
		reversal.setPosted(false);
		reversal.setProcessed(false);
		//reversal.setDocumentNo(getDocumentNo() + REVERSE_INDICATOR);	//	indicate reversals
		reversal.addDescription("{->" + getDocumentNo() + ")");
		//FR [ 1948157  ]
		//reversal.setReversal_ID(getM_Movement_ID());
		if (!reversal.save())
		{
			m_processMsg = "Could not create Movement Reversal";
			return false;
		}
		reversal.setReversal(true);
		//	Reverse Line Qty
		MMovementLine[] oLines = getLines(true);
		for (int i = 0; i < oLines.length; i++)
		{
			MMovementLine oLine = oLines[i];
			MMovementLine rLine = new MMovementLine(getCtx(), 0, get_TrxName());
			copyValues(oLine, rLine, oLine.getAD_Client_ID(), oLine.getAD_Org_ID());
			rLine.setM_Movement_ID(reversal.getM_Movement_ID());
			//AZ Goodwill			
			// store original (voided/reversed) document line
			//			rLine.setReversalLine_ID(oLine.getM_MovementLine_ID());
			//
			rLine.setMovementQty(rLine.getMovementQty().negate());
			rLine.setTargetQty(Env.ZERO);
			rLine.setScrappedQty(Env.ZERO);
			rLine.setConfirmedQty(Env.ZERO);
			rLine.setProcessed(false);
			if (!rLine.save())
			{
				m_processMsg = "Could not create Movement Reversal Line";
				return false;
			}
		}
		//
		if (!reversal.processIt(DocAction.ACTION_Complete))
		{
			m_processMsg = "Reversal ERROR: " + reversal.getProcessMsg();
			return false;
		}
		reversal.closeIt();
		reversal.setDocStatus(REF__DocumentStatus.Reversed);
		reversal.setDocAction(REF__DocumentAction.None);
		reversal.save();
		m_processMsg = reversal.getDocumentNo();

		// After reverseCorrect
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_REVERSECORRECT);
		if (m_processMsg != null)
			return false;

		//	Update Reversed (this)
		addDescription("(" + reversal.getDocumentNo() + "<-)");
		//FR [ 1948157  ]
		//		setReversal_ID(reversal.getM_Movement_ID());
		setProcessed(true);
		setDocStatus(REF__DocumentStatus.Reversed);	//	may come from void
		setDocAction(REF__DocumentAction.None);

		return true;
	}	//	reverseCorrectionIt

	/**
	 * 	Reverse Accrual - none
	 * 	@return false 
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
	 * 	@return false 
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
		.append(Msg.translate(getCtx(),"ApprovalAmt")).append("=").append(getApprovalAmt())
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
	 * 	Get Document Currency
	 *	@return C_Currency_ID
	 */
	public int getC_Currency_ID()
	{
		//	MPriceList pl = MPriceList.get(getCtx(), getM_PriceList_ID());
		//	return pl.getC_Currency_ID();
		return 0;
	}	//	getC_Currency_ID

	public boolean RestoreIt()
	{
		MDocType dt = MDocType.get(getCtx(), getC_DocType_ID());
		if (!MPeriod.isOpen(getCtx(), getMovementDate(), dt.getDocBaseType(), getAD_Org_ID(), getAD_Client_ID()))
		{
			return false;
		}
		Integer C_Period_ID = MPeriod.get(Env.getCtx(), getMovementDate(), getAD_Org_ID(), getAD_Client_ID()).getC_Period_ID();

		setDocStatus("DR");
		setDocAction("CO");
		setProcessing(false);
		setProcessed(false);
		setPosted(false);
		setIsApproved(false);

		MMovementLine lines[] = getLines(true);

		for (int i = 0; i < lines.length; i++) 
		{
			lines[i].setProcessed(false);
			lines[i].save(this.get_TrxName());

			if (lines[i].getM_AttributeSetInstance_ID() == 0) {
				MMovementLineMA mas[] = MMovementLineMA.get(getCtx(),
						lines[i].getM_MovementLine_ID(), get_TrxName());

				for (int j = 0; j < mas.length; j++)
				{
					MMovementLineMA ma = mas[j];
					//
					MStorage storageFrom = MStorage.get(getCtx(), lines[i].getM_Locator_ID(), 
							lines[i].getM_Product_ID(), ma.getM_AttributeSetInstance_ID(), get_TrxName());
					if (storageFrom == null)
						storageFrom = MStorage.getCreate(getCtx(), lines[i].getM_Locator_ID(), 
								lines[i].getM_Product_ID(), ma.getM_AttributeSetInstance_ID(), get_TrxName());
					//
					MStorage storageTo = MStorage.get(getCtx(), lines[i].getM_LocatorTo_ID(), 
							lines[i].getM_Product_ID(), ma.getM_AttributeSetInstance_ID(), get_TrxName());
					if (storageTo == null)
						storageTo = MStorage.getCreate(getCtx(), lines[i].getM_LocatorTo_ID(), 
								lines[i].getM_Product_ID(), ma.getM_AttributeSetInstance_ID(), get_TrxName());
					// we change from substract to add for inverse
					storageFrom.setQtyOnHand(storageFrom.getQtyOnHand().add(ma.getMovementQty()));
					if (!storageFrom.save(get_TrxName()))
					{
						return false;							
					}
					// we change from add to substract for inverse
					storageTo.setQtyOnHand(storageTo.getQtyOnHand().subtract(ma.getMovementQty()));
					if (!storageTo.save(get_TrxName()))
					{
						return false;							
					}

					//						
					//						BigDecimal BalanceQtyFrom = MStorage.getQtyAvailable(storageFrom.getM_Warehouse_ID(),lines[i].getM_Product_ID(), 0 ,get_TrxName() );
					//						trxFrom = new MTransaction (getCtx(), lines[i].getAD_Org_ID(), 
					//							REF_M_TransactionMovementType.MovementFrom,
					//							lines[i].getM_Locator_ID(), lines[i].getM_Product_ID(), ma.getM_AttributeSetInstance_ID(),
					//							ma.getMovementQty(), getMovementDate(), get_TrxName());
					//						trxFrom.setM_MovementLine_ID(lines[i].getM_MovementLine_ID());
					//						trxFrom.setMovementQtyBalance(BalanceQtyFrom);
					//						if (!trxFrom.save())
					//						{
					//							return false;							
					//						}
					//						BigDecimal BalanceQtyTo = MStorage.getQtyAvailable(storageTo.getM_Warehouse_ID(),lines[i].getM_Product_ID(), 0 ,get_TrxName() );
					//						MTransaction trxTo = new MTransaction (getCtx(), lines[i].getAD_Org_ID(), 
					//							REF_M_TransactionMovementType.MovementTo,
					//							lines[i].getM_LocatorTo_ID(), lines[i].getM_Product_ID(), ma.getM_AttributeSetInstance_ID(),
					//							ma.getMovementQty().negate(), getMovementDate(), get_TrxName());
					//						trxTo.setM_MovementLine_ID(lines[i].getM_MovementLine_ID());
					//						trxTo.setMovementQtyBalance(BalanceQtyTo);
					//						if (!trxTo.save())
					//						{
					//							return false;							
					//						}
				}				
			}
			MStorage storageFrom = MStorage.get(getCtx(), lines[i].getM_Locator_ID(), 
					lines[i].getM_Product_ID(), lines[i].getM_AttributeSetInstance_ID(), get_TrxName());
			if (storageFrom == null)
				storageFrom = MStorage.getCreate(getCtx(), lines[i].getM_Locator_ID(), 
						lines[i].getM_Product_ID(), lines[i].getM_AttributeSetInstance_ID(), get_TrxName());
			//
			MStorage storageTo = MStorage.get(getCtx(), lines[i].getM_LocatorTo_ID(), 
					lines[i].getM_Product_ID(), lines[i].getM_AttributeSetInstanceTo_ID(), get_TrxName());
			if (storageTo == null)
				storageTo = MStorage.getCreate(getCtx(), lines[i].getM_LocatorTo_ID(), 
						lines[i].getM_Product_ID(), lines[i].getM_AttributeSetInstanceTo_ID(), get_TrxName());
			//
			storageFrom.setQtyOnHand(storageFrom.getQtyOnHand().add(lines[i].getMovementQty()));
			if (!storageFrom.save(get_TrxName()))
			{
				return false;					
			}
			//
			storageTo.setQtyOnHand(storageTo.getQtyOnHand().subtract(lines[i].getMovementQty()));
			if (!storageTo.save(get_TrxName()))
			{
				return false;					
			}			
			//				BigDecimal BalanceQtyFrom = MStorage.getQtyAvailable(storageFrom.getM_Warehouse_ID(),lines[i].getM_Product_ID(), 0 ,get_TrxName() );
			//				trxFrom = new MTransaction (getCtx(), lines[i].getAD_Org_ID(), 
			//					REF_M_TransactionMovementType.MovementFrom,
			//					lines[i].getM_Locator_ID(), lines[i].getM_Product_ID(), lines[i].getM_AttributeSetInstance_ID(),
			//					lines[i].getMovementQty(), getMovementDate(), get_TrxName());
			//				trxFrom.setM_MovementLine_ID(lines[i].getM_MovementLine_ID());
			//				trxFrom.setMovementQtyBalance(BalanceQtyFrom);
			//				if (!trxFrom.save())
			//				{
			//					return false;					
			//				}				
			//				BigDecimal BalanceQtyTo = MStorage.getQtyAvailable(storageTo.getM_Warehouse_ID(),lines[i].getM_Product_ID(), 0 ,get_TrxName() );
			//				MTransaction trxTo = new MTransaction (getCtx(), lines[i].getAD_Org_ID(), 
			//					REF_M_TransactionMovementType.MovementTo,
			//					lines[i].getM_LocatorTo_ID(), lines[i].getM_Product_ID(), lines[i].getM_AttributeSetInstanceTo_ID(),
			//					lines[i].getMovementQty().negate(), getMovementDate(), get_TrxName());
			//				trxTo.setM_MovementLine_ID(lines[i].getM_MovementLine_ID());
			//				trxTo.setMovementQtyBalance(BalanceQtyTo);
			//				if (!trxTo.save())
			//				{
			//					return false;					
			//				}
		}		
		return true;		
	}
	/** Reversal Flag		*/
	private boolean m_reversal = false;

	/**
	 * 	Set Reversal
	 *	@param reversal reversal
	 */
	private void setReversal(boolean reversal)
	{
		m_reversal = reversal;
	}	//	setReversal
	/**
	 * 	Is Reversal
	 *	@return reversal
	 */
	public boolean isReversal()
	{
		return m_reversal;
	}	//	isReversal

	/**
	 * 	Document Status is Complete or Closed
	 *	@return true if CO, CL or RE
	 */
	public boolean isComplete()
	{
		String ds = getDocStatus();
		return REF__DocumentStatus.Completed.equals(ds) 
				|| REF__DocumentStatus.Closed.equals(ds)
				|| REF__DocumentStatus.Reversed.equals(ds);
	}	//	isComplete

	public static MMovement getbyIdentifier(String Identifier, String trxName) {
		MMovement move = new Query(Env.getCtx(), MMovement.Table_Name, "identifier = ? ", trxName).setParameters(Identifier).first();
		return move;
	}

	public void setProcessMsg(String msg)
	{
		m_processMsg = msg;
	}

	public int getLength()
	{		
		MMovementLine[] lines = getLines(true);
		return lines.length;
	}	
}	//	MMovement

