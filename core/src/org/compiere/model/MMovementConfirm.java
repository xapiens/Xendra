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
import java.sql.*;
import java.util.*;
import java.util.logging.*;

import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.compiere.db.CConnection;
import org.compiere.interfaces.Status;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_M_MovementConfirm;
import org.compiere.model.persistence.X_M_MovementLineConfirm;
import org.compiere.model.persistence.X_M_Product;
import org.compiere.model.reference.REF__DocumentAction;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;
import org.compiere.model.reference.REF__DocumentStatus;
import org.compiere.process.*;
import org.compiere.util.*;
import org.hornetq.api.core.Message;
import org.hornetq.api.core.client.ClientSession;
import org.hornetq.api.core.client.SendAcknowledgementHandler;
import org.hornetq.jms.client.HornetQSession;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xendra.Constants;
import org.xendra.replication.Utilities;
import org.xendra.xendrian.FormatMessage;


/**
 *	Inventory Movement Confirmation
 *	
 *  @author Jorg Janke
 *  @version $Id: MMovementConfirm.java 5822 2016-06-15 22:56:06Z xapiens $
 */
public class MMovementConfirm extends X_M_MovementConfirm implements DocAction, SendAcknowledgementHandler
{
	/**
	 * 	Create Confirmation or return existing one
	 *  accept transfer to another organizations
	 *	@param move movement
	 *	@param checkExisting if false, new confirmation is created
	 *	@return Confirmation
	 */
	public static MMovementConfirm create (MMovement move, boolean checkExisting)
	{
		if (checkExisting)
		{
			MMovementConfirm[] confirmations = move.getConfirmations(false, move.get_TrxName());
			for (int i = 0; i < confirmations.length; i++)
			{
				MMovementConfirm confirm = confirmations[i];
				String rmsg = confirm.getReplicateMessage();
				String identifier = (String) confirm.getIdentifier();
				//Utilities.sendMessage(identifier, Constants.QCONFIRMQUEUE, rmsg);						
				return confirm;
			}
		}
		MMovementConfirm confirm = new MMovementConfirm(move);
		confirm.save(move.get_TrxName());
		//
		MMovementLine[] moveLines = move.getLines(false);
		for (int i=0; i < moveLines.length; i++)
		{
			MMovementLine mLine = moveLines[i];
			MMovementLineConfirm cLine = new MMovementLineConfirm(confirm);
			cLine.setMovementLine(mLine);
			cLine.setM_Product_ID(mLine.getM_Product_ID());
			cLine.setC_UOM_ID(mLine.getC_UOM_ID());
			cLine.setQtyEntered(mLine.getQtyEntered());			
			cLine.save(move.get_TrxName());
		}
		return confirm;
	}	//	MInOutConfirm

	public String getReplicateMessage() {		
		FormatMessage s = new FormatMessage(Constants.TRANSFERMESSAGE);
		s.AddDocumentPart(Constants.HEADER, X_M_MovementConfirm.Table_Name);
		s.addProperties(Constants.HEADER, (PO) this);
		MMovementLineConfirm[] lines = this.getLines(false);
		int linesprocessed = 0;
		for (MMovementLineConfirm line:lines)
		{
			String lineno = String.format("Line%d", linesprocessed);
			s.addProperties(lineno, line);
			linesprocessed++;
		}
		s.AddDocumentPart(Constants.LINES, "");
		s.AddProperty(Constants.LINES, Constants.Count, String.valueOf(linesprocessed));		
		return s.getMessage();
	}
	
	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param M_MovementConfirm_ID id
	 *	@param trxName transaction
	 */
	public MMovementConfirm (Properties ctx, int M_MovementConfirm_ID, String trxName)
	{
		super (ctx, M_MovementConfirm_ID, trxName);
		if (M_MovementConfirm_ID == 0)
		{
		//	setM_Movement_ID (0);
			setDocAction (REF__DocumentAction.Complete);
			setDocStatus (REF__DocumentStatus.Drafted);
			setIsApproved (false);	// N
			setProcessed (false);
		}
	}	//	MMovementConfirm

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MMovementConfirm (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MMovementConfirm

	/**
	 * 	Parent Constructor
	 *	@param move movement
	 */
	public MMovementConfirm (MMovement move)
	{
		this (move.getCtx(), 0, move.get_TrxName());
		setClientOrg(move);
		setM_Movement_ID(move.getM_Movement_ID());
	}	//	MInOutConfirm
	
	/**	Confirm Lines					*/
	private MMovementLineConfirm[]	m_lines = null;
	
	/**	Physical Inventory From	*/
	private MInventory				m_inventoryFrom = null;
	/**	Physical Inventory To	*/
	private MInventory				m_inventoryTo = null;
	/**	Physical Inventory Info	*/
	private String					m_inventoryInfo = null;

	private Document document;	
	private Queue queue;
	private QueueConnection connection;
	private QueueSession session;
	private ClientSession coreSession;
	private Integer AD_Client_ID = Env.getAD_Client_ID(Env.getCtx());
	private Integer AD_Org_ID = Env.getAD_Org_ID(Env.getCtx());
	private TransformerFactory tFactory = TransformerFactory.newInstance();
	private boolean IsQueueInitialized;
	private ArrayList<String[]> m_ToSend = new ArrayList<String[]>();
	private ArrayList<String[]> m_SendWithoutACK = new ArrayList<String[]>();
	
	/**
	 * 	Get Lines
	 *	@param requery requery
	 *	@return array of lines
	 */
	public MMovementLineConfirm[] getLines (boolean requery)
	{
		if (m_lines != null && !requery)
			return m_lines;
		String sql = "SELECT * FROM M_MovementLineConfirm "
			+ "WHERE M_MovementConfirm_ID=?";
		ArrayList<MMovementLineConfirm> list = new ArrayList<MMovementLineConfirm>();
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, get_TrxName());
			pstmt.setInt (1, getM_MovementConfirm_ID());
			ResultSet rs = pstmt.executeQuery ();
			while (rs.next ())
				list.add(new MMovementLineConfirm(getCtx(), rs, get_TrxName()));
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
		m_lines = new MMovementLineConfirm[list.size ()];
		list.toArray (m_lines);
		return m_lines;
	}	//	getLines
	
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
	 * 	Set Approved
	 *	@param IsApproved approval
	 */
	public void setIsApproved (boolean IsApproved)
	{
		if (IsApproved && !isApproved())
		{
			int AD_User_ID = Env.getAD_User_ID(getCtx());
			MUser user = MUser.get(getCtx(), AD_User_ID);
			String info = user.getName() 
				+ ": "
				+ Msg.translate(getCtx(), "IsApproved")
				+ " - " + new Timestamp(System.currentTimeMillis());
			addDescription(info);
		}
		super.setIsApproved (IsApproved);
	}	//	setIsApproved
	
	
	/**
	 * 	Get Document Info
	 *	@return document info (untranslated)
	 */
	public String getDocumentInfo()
	{
		return Msg.getElement(getCtx(), "M_MovementConfirm_ID") + " " + getDocumentNo();
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
	}	//	processIt
	
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
		setDocAction(REF__DocumentAction.Prepare);
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

		//	Std Period open?
		if (!MPeriod.isOpen(getCtx(), getUpdated(), REF_C_DocTypeDocBaseType.MaterialMovement, getAD_Org_ID()))
		{
			m_processMsg = "@PeriodClosed@";
			return DocAction.STATUS_Invalid;
		}

		if (!IsQueueInitialized)
		{
			InitializeQueue();
		}			
		if (!IsQueueInitialized)
		{
			return DocAction.STATUS_Invalid;
		}
		
		MMovementLineConfirm[] lines = getLines(true);
		if (lines.length == 0)
		{
			m_processMsg = "@NoLines@";
			return DocAction.STATUS_Invalid;
		}
		boolean difference = false;
		for (int i = 0; i < lines.length; i++)
		{
			if (!lines[i].isFullyConfirmed())
			{
				difference = true;
				break;
			}
		}
		
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_AFTER_PREPARE);
		if (m_processMsg != null)
			return DocAction.STATUS_Invalid;

		//
		m_justPrepared = true;
		if (!REF__DocumentAction.Complete.equals(getDocAction()))
			setDocAction(REF__DocumentAction.Complete);
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
		log.info("completeIt - " + toString());
		//
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			document = builder.newDocument();

			Element root = document.createElement(Constants.XML_ATTRIBUTE_MovementTrx);
			root.setAttribute(Constants.Identifier, Util.getUUID());
			root.setAttribute("type", Constants.MovementConfirm);
			root.setAttribute("AD_Client_ID", String.valueOf(getAD_Client_ID()));
			root.setAttribute("AD_Org_ID", String.valueOf(getAD_Org_ID()));
			document.appendChild(root);

			Element conf = document.createElement(Constants.XML_ATTRIBUTE_MovementConfirm);
			MMovement move = new MMovement(Env.getCtx(), this.getM_Movement_ID(), get_TrxName());
			conf.setAttribute(Constants.MovementConfirmID, getIdentifier());			
			conf.setAttribute(Constants.MovementID, move.getIdentifier());
			root.appendChild(conf);
			for (MMovementLineConfirm confirmationline:getLines(true))
			{
				MMovementLine ml = new MMovementLine(Env.getCtx(), confirmationline.getM_MovementLine_ID(), get_TrxName());
				Element confline = document.createElement(Constants.XML_ATTRIBUTE_MovementConfirmLine);
				confline.setAttribute(Constants.Identifier, confirmationline.getIdentifier());
				confline.setAttribute(Constants.MovementLineID, ml.getIdentifier());
				confline.setAttribute(X_M_MovementLineConfirm.COLUMNNAME_TargetQty, confirmationline.getTargetQty().toString());
				confline.setAttribute(X_M_MovementLineConfirm.COLUMNNAME_ConfirmedQty, confirmationline.getConfirmedQty().toString());
				confline.setAttribute(X_M_MovementLineConfirm.COLUMNNAME_ScrappedQty, confirmationline.getScrappedQty().toString());
				conf.appendChild(confline);
			}
			doJMSTransaction(Constants.MovementConfirm);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
//		MMovement move = new MMovement (getCtx(), getM_Movement_ID(), get_TrxName());
//		MMovementLineConfirm[] lines = getLines(false);
//		for (int i = 0; i < lines.length; i++)
//		{
//			MMovementLineConfirm confirm = lines[i];
//			confirm.set_TrxName(get_TrxName());
//			if (!confirm.processLine ())
//			{
//				m_processMsg = "ShipLine not saved - " + confirm;
//				return DocAction.STATUS_Invalid;
//			}
//			if (confirm.isFullyConfirmed())
//			{
//				confirm.setProcessed(true);
//				confirm.save(get_TrxName());
//			}
//			else
//			{
//				if (createDifferenceDoc (move, confirm))
//				{
//					confirm.setProcessed(true);
//					confirm.save(get_TrxName());
//				}
//				else
//				{
//					log.log(Level.SEVERE, "completeIt - Scrapped=" + confirm.getScrappedQty()
//						+ " - Difference=" + confirm.getDifferenceQty());
//					
//					m_processMsg = "Differnce Doc not created";
//					return DocAction.STATUS_Invalid;
//				}
//			}
//		}	//	for all lines
//		
//		if (m_inventoryInfo != null)
//		{
//			m_processMsg = " @M_Inventory_ID@: " + m_inventoryInfo;
//			addDescription(Msg.translate(getCtx(), "M_Inventory_ID") 
//				+ ": " + m_inventoryInfo);
//		}
		
		//	User Validation
		String valid = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_AFTER_COMPLETE);
		if (valid != null)
		{
			m_processMsg = valid;
			return DocAction.STATUS_Invalid;
		}
		
		setProcessed(true);
		setDocAction(REF__DocumentAction.Close);
		return DocAction.STATUS_Completed;
	}	//	completeIt
	
	private void InitializeQueue() {
		IsQueueInitialized = true;
		try 
		{
			queue = (Queue) CConnection.get().lookup(Env.getMessageHost(), Status.JMS_NAME);
			QueueConnectionFactory cf = (QueueConnectionFactory) CConnection.get().lookup(Env.getMessageHost(), "/ConnectionFactory");				
			connection = cf.createQueueConnection();
			connection.start();
			session = connection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
			coreSession = ((HornetQSession)session).getCoreSession();
			coreSession.setSendAcknowledgementHandler(this);
		}
		catch (Exception e)
		{
			IsQueueInitialized = false;
			e.printStackTrace();
		}
	}	
	
	public Integer doJMSTransaction(String ReplicationType) {
		try
		{		
			if (!IsQueueInitialized)
			{
				InitializeQueue();
			}			
			NodeList elemlist = document.getElementsByTagName(Constants.XML_ATTRIBUTE_MovementTrx);
			Element elem = (Element) elemlist.item(0);			
			String id = elem.getAttribute("id");
			DOMSource source = new DOMSource(document);
			StringWriter writer = new StringWriter();
			StreamResult result = new StreamResult(writer);
			StringBuffer txtxml = null; // writer.getBuffer();											
			writer = new StringWriter();
			result = new StreamResult(writer);
			Transformer transformer = tFactory.newTransformer();
			transformer.setOutputProperty(javax.xml.transform.OutputKeys.INDENT, "yes");
			transformer.transform (source, result);
			txtxml = writer.getBuffer();
			String[] movmessage = new String[2];
			movmessage[0] = id;
			movmessage[1] = txtxml.toString();			
			m_ToSend.add(movmessage);
			if (IsQueueInitialized)
			{
				while (m_ToSend.size() > 0)
				{
					String[] pending = m_ToSend.get(0);
					if (!sendMessage(pending, ReplicationType))
						break;
				}				
			}						
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return 1;
	}

	private Boolean sendMessage(String[] tosend, String ReplicationType) {
		Boolean sucessfully = true;
		try 
		{
			String id = tosend[0];
			String msg = tosend[1];
			TextMessage request = session.createTextMessage(msg);
			request.setStringProperty("type", ReplicationType);
			request.setStringProperty("id", id);
			request.setStringProperty("replicationtype","L");
			MessageProducer sender = null;
			sender = session.createProducer(queue);
			// si no dio una exception aca, quiere decir que todo fue ok, ergo movemos el array
			synchronized(this) {
				m_ToSend.remove(tosend);
				m_SendWithoutACK.add(tosend);
			}
			sender.send(request);
			System.out.println("Send request: " + request.getText());
		}
		catch (Exception e)
		{
			sucessfully = false;
			e.printStackTrace();
		}
		return sucessfully;
	}

//	/**
//	 * 	Create Difference Document.
//	 * 	Creates one or two inventory lines
//	 * 	@param move movement
//	 *	@param confirm confirm line
//	 *	@return true if created
//	 */
//	public boolean createDifferenceDoc (MMovement move, MMovementLineConfirm confirm)
//	{
//		MMovementLine mLine = confirm.getLine();
//		
//		//	Difference - Create Inventory Difference for Source Location
//		if (Env.ZERO.compareTo(confirm.getDifferenceQty()) != 0)
//		{
//			//	Get Warehouse for Source
//			MLocator loc = MLocator.get(getCtx(), mLine.getM_Locator_ID());
//			if (m_inventoryFrom != null 
//				&& m_inventoryFrom.getM_Warehouse_ID() != loc.getM_Warehouse_ID())
//				m_inventoryFrom = null;
//			
//			if (m_inventoryFrom == null)
//			{
//				MWarehouse wh = MWarehouse.get(getCtx(), loc.getM_Warehouse_ID());
//				m_inventoryFrom = new MInventory (wh);
//				m_inventoryFrom.setDescription(Msg.translate(getCtx(), "M_MovementConfirm_ID") + " " + getDocumentNo());
//				if (!m_inventoryFrom.save(get_TrxName()))
//				{
//					m_processMsg += "Inventory not created";
//					return false;
//				}
//				//	First Inventory
//				if (getM_Inventory_ID() == 0)
//				{
//					setM_Inventory_ID(m_inventoryFrom.getM_Inventory_ID());
//					m_inventoryInfo = m_inventoryFrom.getDocumentNo();
//				}
//				else
//					m_inventoryInfo += "," + m_inventoryFrom.getDocumentNo();
//			}
//			
//			log.info("createDifferenceDoc - Difference=" + confirm.getDifferenceQty());
//			MInventoryLine line = new MInventoryLine (m_inventoryFrom, 
//					mLine.getM_Locator_ID(), mLine.getM_Product_ID(), mLine.getM_AttributeSetInstance_ID(),
//					confirm.getDifferenceQty(), Env.ZERO);
//			line.setDescription(Msg.translate(getCtx(), "DifferenceQty"));
//			if (!line.save(get_TrxName()))
//			{
//				m_processMsg += "Inventory Line not created";
//				return false;
//			}
//			confirm.setM_InventoryLine_ID(line.getM_InventoryLine_ID());
//		}	//	Difference
//		
//		//	Scrapped - Create Inventory Difference for Target Location
//		if (Env.ZERO.compareTo(confirm.getScrappedQty()) != 0)
//		{
//			//	Get Warehouse for Target
//			MLocator loc = MLocator.get(getCtx(), mLine.getM_LocatorTo_ID());
//			if (m_inventoryTo != null
//				&& m_inventoryTo.getM_Warehouse_ID() != loc.getM_Warehouse_ID())
//				m_inventoryTo = null;
//		
//			if (m_inventoryTo == null)
//			{
//				MWarehouse wh = MWarehouse.get(getCtx(), loc.getM_Warehouse_ID());
//				m_inventoryTo = new MInventory (wh);
//				m_inventoryTo.setDescription(Msg.translate(getCtx(), "M_MovementConfirm_ID") + " " + getDocumentNo());
//				if (!m_inventoryTo.save(get_TrxName()))
//				{
//					m_processMsg += "Inventory not created";
//					return false;
//				}
//				//	First Inventory
//				if (getM_Inventory_ID() == 0)
//				{
//					setM_Inventory_ID(m_inventoryTo.getM_Inventory_ID());
//					m_inventoryInfo = m_inventoryTo.getDocumentNo();
//				}
//				else
//					m_inventoryInfo += "," + m_inventoryTo.getDocumentNo();
//			}
//			
//			log.info("createDifferenceDoc - Scrapped=" + confirm.getScrappedQty());
//			MInventoryLine line = new MInventoryLine (m_inventoryTo, 
//				mLine.getM_LocatorTo_ID(), mLine.getM_Product_ID(), mLine.getM_AttributeSetInstance_ID(),
//				confirm.getScrappedQty(), Env.ZERO);
//			line.setDescription(Msg.translate(getCtx(), "ScrappedQty"));
//			if (!line.save(get_TrxName()))
//			{
//				m_processMsg += "Inventory Line not created";
//				return false;
//			}
//			confirm.setM_InventoryLine_ID(line.getM_InventoryLine_ID());
//		}	//	Scrapped
//		
//		return true;
//	}	//	createDifferenceDoc

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
	 * 	Cancel not delivered Qunatities
	 * 	@return true if success 
	 */
	public boolean closeIt()
	{
		log.info("closeIt - " + toString());
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
	
	/**
	 * 	Reverse Correction
	 * 	@return false 
	 */
	public boolean reverseCorrectIt()
	{
		log.info("reverseCorrectIt - " + toString());
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
	 * 	@return false 
	 */
	public boolean reverseAccrualIt()
	{
		log.info("reverseAccrualIt - " + toString());
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
		log.info("reActivateIt - " + toString());
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
		return getUpdatedBy();
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


	@Override
	public boolean RestoreIt() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void sendAcknowledged(Message arg0) {
		// TODO Auto-generated method stub
		
	}

	public static MMovementConfirm getbyIdentifier(String movementConfirmID, String trxName) {
		MMovementConfirm mc = new Query(Env.getCtx(), MMovementConfirm.Table_Name, "identifier = ? ", trxName).setParameters(movementConfirmID).first();
		return mc;
	}
	
	public void setProcessMsg(String msg)
	{
		m_processMsg = msg;
	}	
}	//	MMovementConfirm
