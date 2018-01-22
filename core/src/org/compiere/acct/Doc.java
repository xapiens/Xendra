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

import java.lang.reflect.*;
import java.math.*;
import java.sql.*;
import java.text.DateFormat;
import java.util.*;
import java.util.logging.*;

import org.compiere.model.MAccount;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MAllocationHdr;
import org.compiere.model.MBOE;
import org.compiere.model.MBOEStatement;
import org.compiere.model.MBankStatement;
import org.compiere.model.MCash;
import org.compiere.model.MConversionRate;
import org.compiere.model.MElementValue;
import org.compiere.model.MGroupDoc;
import org.compiere.model.MInOut;
import org.compiere.model.MInventory;
import org.compiere.model.MInvoice;
import org.compiere.model.MJournal;
import org.compiere.model.MMovement;
import org.compiere.model.MPayment;
import org.compiere.model.MPeriod;
import org.compiere.model.MProjectIssue;
import org.compiere.model.MRequisition;
import org.compiere.model.MRetentionStatement;
import org.compiere.model.MWithholdingState;
import org.compiere.model.PO;
import org.compiere.model.persistence.X_C_AllocationHdr;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.model.persistence.X_C_Perception;
import org.compiere.model.persistence.X_M_InOut;
import org.compiere.model.persistence.X_M_Production;
import org.compiere.model.reference.REF_C_AcctSchemaElementType;
import org.compiere.process.*;
import org.compiere.report.*;
import org.compiere.util.*;
//
import org.xendra.exceptions.ConversionRateException;

/**
 *  Posting Document Root.
 *
 *  <pre>
 *  Table               Base Document Types (C_DocType.DocBaseType & AD_Reference_ID=183)
 *      Class           AD_Table_ID
 *  ------------------  ------------------------------
 *  C_Invoice:          ARI, ARC, ARF, API, APC
 *      Doc_Invoice     318 - has C_DocType_ID
 *
 *  C_Payment:          ARP, APP
 *      Doc_Payment     335 - has C_DocType_ID
 *
 *  C_Order:            SOO, POO,  POR (Requisition)
 *      Doc_Order       259 - has C_DocType_ID
 *
 *  M_InOut:            MMS, MMR
 *      Doc_InOut       319 - DocType derived
 *
 *  M_Inventory:        MMI
 *      Doc_Inventory   321 - DocType fixed
 *
 *  M_Movement:         MMM
 *      Doc_Movement    323 - DocType fixed
 *
 *  M_Production:       MMP
 *      Doc_Production  325 - DocType fixed
 *
 *  C_BankStatement:    CMB
 *      Doc_Bank        392 - DocType fixed
 *
 *  C_Cash:             CMC
 *      Doc_Cash        407 - DocType fixed
 *
 *  C_Allocation:       CMA
 *      Doc_Allocation  390 - DocType fixed
 *
 *  GL_Journal:         GLJ
 *      Doc_GLJournal   224 = has C_DocType_ID
 *
 *  Matching Invoice    MXI
 *      M_MatchInv      472 - DocType fixed
 *
 *  Matching PO         MXP
 *      M_MatchPO       473 - DocType fixed
 *
 *	Project Issue		PJI
 *		C_ProjectIssue	623 - DocType fixed
 *	
 * 
 *  Bill of Exchange    BOE			   
 *	  Doc_BOEStatement  1000077   has C_DocType_ID --   
 *
 *  Withholding			WIT
 *
 *
 *  </pre>
 *  @author Jorg Janke
 *  @version  $Id: Doc.java,v 1.2 2007/06/19 20:36:44 sergioaguayo Exp $
 */

/*
 *      retired docs  // 15/11/2007 el_man
 * 		MMatchInv.Table_ID,		    //  M_MatchInv
 *		MMatchPO.Table_ID,		    //  M_MatchPO
 *		MMatchInv.Table_Name,	    //  M_MatchInv
 *	    MMatchPO.Table_Name,	    //  M_MatchPO
 */
public abstract class Doc
{
	/** AD_Table_ID's of documents          */
	public static int[]  documentsTableID = new int[] {
		MInvoice.Table_ID,			 //  C_Invoice
		MAllocationHdr.Table_ID,     //  C_Allocation
		MCash.Table_ID,			     //  C_Cash
		MBankStatement.Table_ID,     //  C_BankStatement
		//MOrder.Table_ID,		     //  C_Order
		MBOEStatement.Table_ID,		 //  M_BOEStatement
		MPayment.Table_ID, 			 //  C_Payment
		MInOut.Table_ID,			 //  M_InOut
		MInventory.Table_ID,	     //  M_Inventory
		MMovement.Table_ID,		     //  M_Movement
		X_M_Production.Table_ID,     //  M_Production
		MJournal.Table_ID,			 //  GL_Journal
		MProjectIssue.Table_ID,		 //	 C_ProjectIssue
		MRequisition.Table_ID,	  	 //	 M_Requisition
		MRetentionStatement.Table_ID, //  C_RetentionStatement
		X_C_Perception.Table_ID,       //  C_Perception
		MWithholdingState.Table_ID //,		// WithHolding States
		//MHRProcess.Table_ID
	};
	
	/** Table Names of documents          */
	public static String[]  documentsTableName = new String[] {
		MInvoice.Table_Name,		   //  C_Invoice
		MAllocationHdr.Table_Name,	   //  C_Allocation
		MCash.Table_Name,		       //  C_Cash
		MBankStatement.Table_Name,	   //  C_BankStatement
		//MOrder.Table_Name,		   //  C_Order
		MBOEStatement.Table_Name,	   //  M_BOEStatement
		MPayment.Table_Name,		   //  C_Payment
		MInOut.Table_Name,			   //  M_InOut
		MInventory.Table_Name,	       //  M_Inventory
		MMovement.Table_Name,	       //  M_Movement
		X_M_Production.Table_Name,	   //  M_Production
		MJournal.Table_Name,		   //  GL_Journal
		MProjectIssue.Table_Name,	   //  C_ProjectIssue
		MRequisition.Table_Name,       //  M_Requisition
		MRetentionStatement.Table_Name, //  C_RetentionStatement
		X_C_Perception.Table_Name,       //  C_Perception
		MWithholdingState.Table_Name		// Witholding state 
	};
	
	/**************************************************************************
	 * 	 Document Types
	 *  --------------
	 *  C_DocType.DocBaseType & AD_Reference_ID=183
	 *  C_Invoice:          ARI, ARC, ARF, API, APC
	 *  C_Payment:          ARP, APP
	 *  C_Order:            SOO, POO
	 *  M_Transaction:      MMI, MMM, MMS, MMR
	 *  C_BankStatement:    CMB
	 *  C_Cash:             CMC
	 *  C_Allocation:       CMA
	 *  GL_Journal:         GLJ
	 *  C_ProjectIssue		PJI
	 *  M_Requisition		POR
	 **************************************************************************/

	/**	AR Invoices - ARI       */
	//public static final String 	DOCTYPE_ARInvoice       = REF_C_DocTypeDocBaseType.ARInvoice;
	/**	AR Credit Memo          */
	//public static final String 	DOCTYPE_ARCredit        = "ARC";
	/**	AR Receipt              */
	//public static final String 	DOCTYPE_ARReceipt       = "ARR";
	/**	AR ProForma             */
	//public static final String 	DOCTYPE_ARProForma      = "ARF";
	/**	AP Invoices             */
	//public static final String 	DOCTYPE_APInvoice       = "API";
	/**	AP Credit Memo          */
	//public static final String 	DOCTYPE_APCredit        = "APC";
	/**	AP Payment              */
	//public static final String 	DOCTYPE_APPayment       = "APP";
	/** Bank Account transfer	*/
	//public static final String		DOCTYPE_BankAccountTransfer = "BAT";
	/**	CashManagement Bank Statement   */
	//public static final String 	DOCTYPE_BankStatement   = "CMB";
	/**	CashManagement Cash Journals    */
	//public static final String 	DOCTYPE_CashJournal     = "CMC";
	/**	CashManagement Allocations      */
	//public static final String 	DOCTYPE_Allocation      = "CMA";
	/** Material Shipment       */
	//public static final String 	DOCTYPE_MatShipment     = "MMS";
	/** Material Receipt        */
	//public static final String 	DOCTYPE_MatReceipt      = "MMR";
	/** Material Inventory      */
	//public static final String 	DOCTYPE_MatInventory    = "MMI";
	/** Material Movement       */
	//public static final String 	DOCTYPE_MatMovement     = "MMM";
	/** Material Production     */
	//public static final String 	DOCTYPE_MatProduction   = "MMP";
	/** Match Invoice           */
	//public static final String 	DOCTYPE_MatMatchInv     = "MXI";
	/** Match PO                */
	//public static final String 	DOCTYPE_MatMatchPO      = "MXP";
	/** GL Journal              */
	//public static final String 	DOCTYPE_GLJournal       = "GLJ";
	/** Purchase Order          */
	//public static final String 	DOCTYPE_POrder          = "POO";
	/** Sales Order             */
	//public static final String 	DOCTYPE_SOrder          = "SOO";
	/** Project Issue           */
	//public static final String	DOCTYPE_ProjectIssue	= "PJI";
	/** Purchase Requisition    */
	//public static final String	DOCTYPE_PurchaseRequisition	= "POR";
	/** Bill Of Exchange */
	//public static final String	DOCTYPE_BillOfExchange	= "BOE";
	/** Retention */
	///public static final String	DOCTYPE_Retention    	= "RET";
	/** Professional fee slip */
	///public static final String	DOCTYPE_FeeSlip	= "FPS";
	/** Material Return Of Vendor = MRV */
	//public static final String DOCTYPE_MaterialVendorReturn = "MRV";
	/** Material Return Of Customer  = MRC */
	//public static final String DOCTYPE_MaterialCustomerReturn = "MRC";	
	/** Declaracion Unica de Aduana  = DUA */
	//public static final String DOCTYPE_DeclaracionUnicaAduana = "DCV";
	/** WithHolding */
	public static final String DocType_Withholding = "WIT";
	//  Posting Status - AD_Reference_ID=234     //
	/**	Document Status         */
	public static final String 	STATUS_NotPosted        = "N";
	/**	Document Status         */
	public static final String 	STATUS_NotBalanced      = "b";
	/**	Document Status         */
	public static final String 	STATUS_NotConvertible   = "c";
	/**	Document Status         */
	public static final String 	STATUS_PeriodClosed     = "p";
	/**	Document Status         */
	public static final String 	STATUS_InvalidAccount   = "i";
	/**	Document Status         */
	public static final String 	STATUS_PostPrepared     = "y";
	/**	Document Status         */
	public static final String 	STATUS_Posted           = "Y";
	/**	Document Status         */
	public static final String 	STATUS_Error            = "E";

	
	/**
	 *  Create Posting document
	 *	@param ass accounting schema
	 *  @param AD_Table_ID Table ID of Documents
	 *  @param Record_ID record ID to load
	 *  @param trxName transaction name
	 *  @return Document or null
	 */
	public static Doc get (MAcctSchema[] ass, int AD_Table_ID, int Record_ID, String trxName)
	{
		String TableName = null;
		for (int i = 0; i < documentsTableID.length; i++)
		{
			if (documentsTableID[i] == AD_Table_ID)
			{
				TableName = documentsTableName[i];
				break;
			}
		}
		if (TableName == null)
		{
			s_log.severe("Not found AD_Table_ID=" + AD_Table_ID);
			return null;
		}
		//
		Doc doc = null;
		StringBuffer sql = new StringBuffer("SELECT * FROM ")
			.append(TableName)
			.append(" WHERE ").append(TableName).append("_ID=? AND Processed='Y'");
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql.toString(), trxName);
			pstmt.setInt (1, Record_ID);
			ResultSet rs = pstmt.executeQuery ();
			if (rs.next ())
			{
				doc = get (ass, AD_Table_ID, rs, trxName);
			}
			else
				s_log.severe("Not Found: " + TableName + "_ID=" + Record_ID);
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			s_log.log (Level.SEVERE, sql.toString(), e);
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
		return doc;
	}	//	get
	
	/**
	 *  Create Posting document
	 *	@param ass accounting schema
	 *  @param AD_Table_ID Table ID of Documents
	 *  @param rs ResultSet
	 *  @param trxName transaction name
	 *  @return Document
	 */
	public static Doc get (MAcctSchema[] ass, int AD_Table_ID, ResultSet rs, String trxName)
	{
		Doc doc = null;
		if (AD_Table_ID ==  MInvoice.Table_ID)
			doc = new Doc_Invoice (ass, rs, trxName);
		else if (AD_Table_ID == MAllocationHdr.Table_ID)
			doc = new Doc_Allocation (ass, rs, trxName);
		else if (AD_Table_ID == MCash.Table_ID)
			doc = new Doc_Cash (ass, rs, trxName);
		else if (AD_Table_ID == MBankStatement.Table_ID)
			doc = new Doc_Bank (ass, rs, trxName);
		else if (AD_Table_ID == MBOEStatement.Table_ID)
			doc = new Doc_BOEStatement( ass, rs, trxName);
		//else if (AD_Table_ID == MOrder.Table_ID)
		//	doc = new Doc_Order (ass, rs, trxName);
		else if (AD_Table_ID == MPayment.Table_ID)
			doc = new Doc_Payment (ass, rs, trxName);
		else if (AD_Table_ID == MInOut.Table_ID)
			doc = new Doc_InOut (ass, rs, trxName);
		else if (AD_Table_ID == MInventory.Table_ID)
			doc = new Doc_Inventory (ass, rs, trxName);
		else if (AD_Table_ID == MMovement.Table_ID)
			doc = new Doc_Movement (ass, rs, trxName);
		else if (AD_Table_ID == X_M_Production.Table_ID)
			doc = new Doc_Production (ass, rs, trxName);
		else if (AD_Table_ID == MJournal.Table_ID)
			doc = new Doc_GLJournal (ass, rs, trxName);
		else if (AD_Table_ID == MProjectIssue.Table_ID)
			doc = new Doc_ProjectIssue (ass, rs, trxName);
		else if (AD_Table_ID == MRequisition.Table_ID)
			doc = new Doc_Requisition (ass, rs, trxName);
		else if (AD_Table_ID == MRetentionStatement.Table_ID)
			doc = new Doc_RetentionStatement( ass, rs, trxName);
		else if (AD_Table_ID == X_C_Perception.Table_ID)
			doc = new Doc_Perception( ass, rs, trxName);		
		else if (AD_Table_ID == MWithholdingState.Table_ID)
			doc = new Doc_WithholdingState(ass, rs, trxName);
		if (doc == null)
			s_log.log(Level.SEVERE, "Unknown AD_Table_ID=" + AD_Table_ID);
		return doc;
	}   //  get

	/**
	 *  Post Document
	 * 	@param ass accounting schemata
	 * 	@param 	AD_Table_ID		Transaction table
	 *  @param  Record_ID       Record ID of this document
	 *  @param  force           force posting
	 *  @param trxName			transaction
	 *  @return null if the document was posted or error message
	 */
	public static String postImmediate (MAcctSchema[] ass, 
		int AD_Table_ID, int Record_ID, boolean force, String trxName)
	{
		Doc doc = get (ass, AD_Table_ID, Record_ID, trxName);
		if (doc != null)
			return doc.post (force, true);	//	repost
		return "NoLineDocFound";
	}   //  post

	/**	Static Log						*/
	protected static CLogger	s_log = CLogger.getCLogger(Doc.class);
	/**	Log	per Document				*/
	protected CLogger			log = CLogger.getCLogger(getClass());
	
	/* If the transaction must be managed locally (false if it's managed externally by the caller) */ 
	private boolean m_manageLocalTrx;

	
	/**************************************************************************
	 *  Constructor
	 * 	@param ass accounting schemata
	 * 	@param clazz Document Class
	 * 	@param rs result set
	 * 	@param defaultDocumentType default document type or null
	 * 	@param trxName trx
	 */
	Doc (MAcctSchema[] ass, Class clazz, ResultSet rs, String defaultDocumentType, String trxName)
	{
		p_Status = STATUS_Error;
		m_ass = ass;
		m_ctx = new Properties(m_ass[0].getCtx());
		m_ctx.setProperty("#AD_Client_ID", String.valueOf(m_ass[0].getAD_Client_ID()));
		
		String className = clazz.getName();
		className = className.substring(className.lastIndexOf('.')+1);
		try
		{
			Constructor constructor = clazz.getConstructor(new Class[]{Properties.class, ResultSet.class, String.class});
			p_po = (PO)constructor.newInstance(new Object[]{m_ctx, rs, trxName});
		}
		catch (Exception e)
		{
			String msg = className + ": " + e.getLocalizedMessage();
			log.severe(msg);
			throw new IllegalArgumentException(msg);
		}
		
		//	DocStatus
		int index = p_po.get_ColumnIndex("DocStatus");
		if (index != -1)
			m_DocStatus = (String)p_po.get_Value(index);
		
		//	Document Type
		setDocumentType (defaultDocumentType);
		m_trxName = trxName;
		m_manageLocalTrx = false;
		if (m_trxName == null)
		{
			m_trxName = "Post" + m_DocumentType + p_po.get_ID();
			m_manageLocalTrx = true;
		}
		p_po.set_TrxName(m_trxName);

		//	Amounts
		m_Amounts[0] = Env.ZERO;
		m_Amounts[1] = Env.ZERO;
		m_Amounts[2] = Env.ZERO;
		m_Amounts[3] = Env.ZERO;
	}   //  Doc

	/** Accounting Schema Array     */
	private MAcctSchema[]    	m_ass = null;
	/** Properties					*/
	private Properties			m_ctx = null;
	/** Transaction Name			*/
	private String				m_trxName = null;
	/** The Document				*/
	protected PO				p_po = null;
	/** Document Type      			*/
	private String				m_DocumentType = null;
	/** Document Status      			*/
	private String				m_DocStatus = null;
	/** Document No      			*/
	private String				m_DocumentNo = null;
	/** Description      			*/
	private String				m_Description = null;
	/** GL Category      			*/
	private int					m_GL_Category_ID = 0;
	/** GL Period					*/
	private MPeriod 			m_period = null;
	/** Period ID					*/
	private int					m_C_Period_ID = 0;
	/** Location From				*/
	private int					m_C_LocFrom_ID = 0;
	/** Location To					*/
	private int					m_C_LocTo_ID = 0;
	/** Accounting Date				*/
	private Timestamp			m_DateAcct = null;
	/** Document Date				*/
	private Timestamp			m_DateDoc = null;
	/** Tax Included				*/
	private boolean				m_TaxIncluded = false;
	/** Is (Source) Multi-Currency Document - i.e. the document has different currencies
	 *  (if true, the document will not be source balanced)     */
	private boolean				m_MultiCurrency = false;
	/** BP Sales Region    			*/
	private int					m_BP_C_SalesRegion_ID = -1;
	/** B Partner	    			*/
	private int					m_C_BPartner_ID = -1;

	/** Bank Account				*/
	private int 				m_C_BankAccount_ID = -1;
	/** Destination Bank Account	*/
	private int				m_Dest_BankAccount_ID = -1;
	/** Cach Book					*/
	private int 				m_C_CashBook_ID = -1;
	/** Currency					*/
	private int					m_C_Currency_ID = -1;
	/** Fact ID						*/
	private String				m_Fact_ID = "";

	/**	Contained Doc Lines			*/
	protected DocLine[]			p_lines;

	/** Facts                       */
	private ArrayList<Fact>    	m_fact = null;

	/** No Currency in Document Indicator (-1)	*/
	protected static final int  NO_CURRENCY = -2;
	
	/**	Actual Document Status  */
	protected String			p_Status = null;
	/** Error Message			*/
	protected String			p_Error = null;
	
	
	/**
	 * 	Get Context
	 *	@return context
	 */
	protected Properties getCtx()
	{
		return m_ctx;
	}	//	getCtx

	/**
	 * 	Get Table Name
	 *	@return table name
	 */
	public String get_TableName()
	{
		return p_po.get_TableName();
	}	//	get_TableName
	
	/**
	 * 	Get Table ID
	 *	@return table id
	 */
	public int get_Table_ID()
	{
		return p_po.get_Table_ID();
	}	//	get_Table_ID

	/**
	 * 	Get Record_ID
	 *	@return record id
	 */
	public int get_ID()
	{
		return p_po.get_ID();
	}	//	get_ID
	
	/**
	 * 	Get Persistent Object
	 *	@return po
	 */
	protected PO getPO()
	{
		return p_po;
	}	//	getPO
	
	/**
	 *  Post Document.
	 *  <pre>
	 *  - try to lock document (Processed='Y' (AND Processing='N' AND Posted='N'))
	 * 		- if not ok - return false
	 *          - postlogic (for all Accounting Schema)
	 *              - create Fact lines
	 *          - postCommit
	 *              - commits Fact lines and Document & sets Processing = 'N'
	 *              - if error - create Note
	 *  </pre>
	 *  @param force if true ignore that locked
	 *  @param repost if true ignore that already posted
	 *  @return null if posted error otherwise
	 */
	public final String post (boolean force, boolean repost)
	{
		if (m_DocStatus == null)
			return "No DocStatus for DocumentNo=" + getDocumentNo();
		else if (m_DocStatus.equals(DocumentEngine.STATUS_Completed) 
			|| m_DocStatus.equals(DocumentEngine.STATUS_Closed)
			|| m_DocStatus.equals(DocumentEngine.STATUS_Voided)
			|| m_DocStatus.equals(DocumentEngine.STATUS_Reversed))
			;
		else
			return "Invalid DocStatus='" + m_DocStatus + "' for DocumentNo=" + getDocumentNo();
		//
		if (p_po.getAD_Client_ID() != m_ass[0].getAD_Client_ID())
		{
			String error = "AD_Client_ID Conflict - Document=" + p_po.getAD_Client_ID()
				+ ", AcctSchema=" + m_ass[0].getAD_Client_ID();
			log.severe(error);
			return error;
		}
		//  Lock Record ----
		String trxName = null;	//	outside trx if on server
		if (!m_manageLocalTrx)
			trxName = getTrxName(); // on trx if it's in client
		
		createFact_ID(); 
		
		StringBuffer sql = new StringBuffer ("UPDATE ").append(get_TableName());		
		sql.append( " SET Processing='Y'");
		if (getFact_ID().length() != 0)
			sql.append(", Fact_ID='"+getFact_ID()+"'");		
		sql.append( " WHERE ")
			.append(get_TableName()).append("_ID=").append(get_ID())
			.append(" AND Processed='Y' AND IsActive='Y'");
		if (!force)
			sql.append(" AND (Processing='N' OR Processing IS NULL)");
		if (!repost)
			sql.append(" AND Posted='N'");
		
		Trx trx = Trx.get(getTrxName(), true);		
		
		if (DB.executeUpdate(sql.toString(), trxName) == 1)
		{
			log.info("Locked: " + get_TableName() + "_ID=" + get_ID());
			trx.commit();
		}	
		else
		{
			log.log(Level.SEVERE, "Resubmit - Cannot lock " + get_TableName() + "_ID=" 
				+ get_ID() + ", Force=" + force + ",RePost=" + repost);
			trx.rollback();
			//trx.close();
			if (force)
				return "Cannot Lock - ReSubmit";
			return "Cannot Lock - ReSubmit or RePost with Force";
		}				
		
		if (m_DocStatus.equals(DocumentEngine.STATUS_Voided)) {
			log.log(Level.FINE, toString() + " - Deleting facts from voided document, aborting also.");
			deleteAcct();
			unlock();
			trx.commit();
			if (m_manageLocalTrx)
				trx.close();
			return null;
		}

		p_Error = loadDocumentDetails();
		if (p_Error != null)
		{
			//if (trx != null)
			if (m_manageLocalTrx)
				trx.close();
			return p_Error;
		}

		//  Delete existing Accounting
		if (repost)
		{
			if (isPosted() && !isPeriodOpen())	//	already posted - don't delete if period closed
			{
				log.log(Level.SEVERE, toString() + " - Period Closed for already posed document");
				unlock();
				trx.commit();
				if (m_manageLocalTrx)
					trx.close();								
				return "PeriodClosed";
			}
			//	delete it
			deleteAcct();
		}
		else if (isPosted())
		{
			log.log(Level.SEVERE, toString() + " - Document already posted");
			unlock();
			trx.commit();
			if (m_manageLocalTrx)
				trx.close();			
			//trx.close();
			return "AlreadyPosted";
		}
		
		p_Status = STATUS_NotPosted;

		//  Create Fact per AcctSchema
		m_fact = new ArrayList<Fact>();

		//  for all Accounting Schema
		boolean OK = true;
		getPO().setDoc(this);
		try
		{
			for (int i = 0; OK && i < m_ass.length; i++)
			{
				//	if acct schema has "only" org, skip
				boolean skip = false;
				if (m_ass[i].getAD_OrgOnly_ID() != 0)
				{
					if (m_ass[i].getOnlyOrgs() == null)
						m_ass[i].setOnlyOrgs(MReportTree.getChildIDs(getCtx(), 
							0, REF_C_AcctSchemaElementType.Organization, 
							m_ass[i].getAD_OrgOnly_ID()));

					//	Header Level Org
					skip = m_ass[i].isSkipOrg(getAD_Org_ID());
					//	Line Level Org
					if (p_lines != null)
					{
						for (int line = 0; skip && line < p_lines.length; line++)
						{
							skip = m_ass[i].isSkipOrg(p_lines[line].getAD_Org_ID());
							if (!skip)
								break;
						}
					}
				}
				if (skip)
					continue;
				//	post
				log.info("(" + i + ") " + p_po);
				p_Status = postLogic (i);
				if (!p_Status.equals(STATUS_Posted))
					OK = false;
			}
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, "", e);
			p_Status = STATUS_Error;
			p_Error = e.toString();
			if (p_Error.equals("java.lang.NullPointerException"))
			{
				e.printStackTrace();
			}
			OK = false;
		}
		//  commitFact
		p_Status = postCommit (p_Status);

		//  dispose facts
		for (int i = 0; i < m_fact.size(); i++)
		{
			Fact fact = m_fact.get(i);
			if (fact != null)
				fact.dispose();
		}
		p_lines = null;

		if (p_Status.equals(STATUS_Posted))
			return null;
		return p_Error;
	}   //  post

	/**
	 * 	Delete Accounting
	 *	@return number of records
	 */
	public int deleteAcct()
	{
		StringBuffer sql = new StringBuffer ("DELETE FROM Fact_Acct WHERE AD_Table_ID=")
			.append(get_Table_ID())
			.append(" AND Record_ID=").append(p_po.get_ID());
		int no = DB.executeUpdate(sql.toString(), getTrxName());
		if (no != 0)
			log.info("deleted=" + no);
		return no;
	}	//	deleteAcct

	/**
	 *  Posting logic for Accounting Schema index
	 *  @param  index   Accounting Schema index
	 *  @return posting status/error code
	 */
	private final String postLogic (int index)
	{
		log.info("(" + index + ") " + p_po);
		
		//  rejectUnbalanced
		if (!m_ass[index].isSuspenseBalancing() && !isBalanced())			
			return STATUS_NotBalanced;

		//  rejectUnconvertible
		if (!isConvertible(m_ass[index]))
			return STATUS_NotConvertible;

		//  rejectPeriodClosed
		if (!isPeriodOpen())
			return STATUS_PeriodClosed;

		//  createFacts
		ArrayList<Fact> facts = createFacts (m_ass[index]);
		if (facts == null)
			return STATUS_Error;
		for (int f = 0; f < facts.size(); f++)
		{
			Fact fact = facts.get(f);
			if (fact == null)
				return STATUS_Error;
			m_fact.add(fact);
			//
			p_Status = STATUS_PostPrepared;

			//	check accounts
			if (!fact.checkAccounts())
				return STATUS_InvalidAccount;
			
//			//	distribute
//			if (!fact.distribute())
//				return STATUS_Error;
			
			//  balanceSource
			if (!fact.isSourceBalanced())
			{
				fact.balanceSource();
				if (!fact.isSourceBalanced())
					return STATUS_NotBalanced;
			}

			//	distribute
			if (!fact.distribute())
				return STATUS_Error;
			
			if (!fact.isSourceBalanced())
			{
				fact.balanceSource();
				if (!fact.isSourceBalanced())
					return STATUS_NotBalanced;
			}
			
			//  balanceSegments
			if (!fact.isSegmentBalanced())
			{
				fact.balanceSegments();
				if (!fact.isSegmentBalanced())
					return STATUS_NotBalanced;
			}

			//  balanceAccounting
			if (!fact.isAcctBalanced())
			{
				fact.balanceAccounting();
				if (!fact.isAcctBalanced())
					return STATUS_NotBalanced;
			}
		}	//	for all facts
		return STATUS_Posted;
	}   //  postLogic

	public abstract void createFact_ID();

	/**
	 *  Post Commit.
	 *  Save Facts & Document
	 *  @param status status
	 *  @return Posting Status
	 */
	private final String postCommit (String status)
	{
		log.info("Sta=" + status + " DT=" + getDocumentType() 
			+ " ID=" +  p_po.get_ID());
		p_Status = status;

		Trx trx = Trx.get(getTrxName(), true);
		try
		{
		//  *** Transaction Start       ***
			//  Commit Facts
			if (status.equals(STATUS_Posted))
			{
				for (int i = 0; i < m_fact.size(); i++)
				{
					Fact fact = m_fact.get(i);
					if (fact == null)
						continue;
					synchronized(Doc.class) {
						if (fact.save(getTrxName()))
							;
						else
						{
							log.log(Level.SEVERE, "(fact not saved) ... rolling back");
							if (m_manageLocalTrx) {
								trx.rollback();
								trx.close();	
							}
							unlock();
							//trx.commit();							
							return STATUS_Error;
						}
					}
				}
			}
			//  Commit Doc
			if (!save(getTrxName()))     //  contains unlock & document status update
			{
				log.log(Level.SEVERE, "(doc not saved) ... rolling back");
				if (m_manageLocalTrx) {
					trx.rollback();
					trx.close();
				}
				unlock();
				//trx.commit();
				//trx.close();
				return STATUS_Error;
			}
			//	Success
			if (m_manageLocalTrx) {
				trx.commit(true);
				trx.close();
				trx = null;
			}
		//  *** Transaction End         ***
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, "... rolling back", e);
			status = STATUS_Error;
			if (m_manageLocalTrx) {
				try {
					if (trx != null)
						trx.rollback();
				} catch (Exception e2) {}
				try {
					if (trx != null)
						trx.close();
				} catch (Exception e3) {}
			}
			unlock();			
			//trx.commit();
			//trx.close();
			//trx = null;			
		}
		p_Status = status;
		return status;
	}   //  postCommit

	/**
	 * 	Get Trx Name and create Transaction
	 *	@return Trx Name
	 */
	public String getTrxName()
	{
		return m_trxName;
	}	//	getTrxName
	
	/**
	 *  Unlock Document
	 */
	private void unlock()
	{
		String trxName = null;	//	outside trx if on server
		if (! m_manageLocalTrx)
			trxName = getTrxName(); // on trx if it's in client		
		StringBuffer sql = new StringBuffer ("UPDATE ");
		sql.append(get_TableName()).append( " SET Processing='N' WHERE ")
			.append(get_TableName()).append("_ID=").append(p_po.get_ID());
		//DB.executeUpdate(sql.toString(), trxName);
		DB.executeUpdate(sql.toString(), trxName);
	}   //  unlock


	/**************************************************************************
	 *  Load Document Type and GL Info.
	 * 	Set p_DocumentType and p_GL_Category_ID
	 * 	@return document type
	 */
	protected String getDocumentType()
	{
		if (m_DocumentType == null)
			setDocumentType(null);
		return m_DocumentType;
	}   //  getDocumentType

	/**
	 *  Load Document Type and GL Info.
	 * 	Set p_DocumentType and p_GL_Category_ID
	 *	@param DocumentType
	 */
	protected void setDocumentType (String DocumentType)
	{
		if (DocumentType != null)
			m_DocumentType = DocumentType;
		//  No Document Type defined
		if (m_DocumentType == null && getC_DocType_ID() != 0)
		{
			String sql = "SELECT DocBaseType, GL_Category_ID FROM C_DocType WHERE C_DocType_ID=?";
			PreparedStatement pstmt = null;
			ResultSet rsDT = null;
			try
			{
				pstmt = DB.prepareStatement(sql, null);
				pstmt.setInt(1, getC_DocType_ID());
				rsDT = pstmt.executeQuery();
				if (rsDT.next())
				{
					m_DocumentType = rsDT.getString(1);
					m_GL_Category_ID = rsDT.getInt(2);
				}
			}
			catch (SQLException e)
			{
				log.log(Level.SEVERE, sql, e);
			}
			finally {
				DB.close(rsDT, pstmt);
			}								
		}
		if (m_DocumentType == null)
		{
			log.log(Level.SEVERE, "No DocBaseType for C_DocType_ID=" 
				+ getC_DocType_ID() + ", DocumentNo=" + getDocumentNo());
		}

		//  We have a document Type, but no GL info - search for DocType
		if (m_GL_Category_ID == 0)
		{
			String sql = "SELECT GL_Category_ID FROM C_DocType "
				+ "WHERE AD_Client_ID=? AND DocBaseType=?";
			PreparedStatement pstmt = null;
			ResultSet rsDT = null;			
			try
			{
				pstmt = DB.prepareStatement(sql, null);
				pstmt.setInt(1, getAD_Client_ID());
				pstmt.setString(2, m_DocumentType);
				rsDT = pstmt.executeQuery();
				if (rsDT.next())
					m_GL_Category_ID = rsDT.getInt(1);
				rsDT.close();
				pstmt.close();
			}
			catch (SQLException e)
			{
				log.log(Level.SEVERE, sql, e);
			}
			finally {
				DB.close(rsDT, pstmt);
			}											
		}

		//  Still no GL_Category - get Default GL Category
		if (m_GL_Category_ID == 0)
		{
			String sql = "SELECT GL_Category_ID FROM GL_Category "
				+ "WHERE AD_Client_ID=? "
				+ "ORDER BY IsDefault DESC";
			PreparedStatement pstmt = null;
			ResultSet rsDT = null;						
			try
			{
				pstmt = DB.prepareStatement(sql, null);
				pstmt.setInt(1, getAD_Client_ID());
				rsDT = pstmt.executeQuery();
				if (rsDT.next())
					m_GL_Category_ID = rsDT.getInt(1);
				rsDT.close();
				pstmt.close();
			}
			catch (SQLException e)
			{
				log.log(Level.SEVERE, sql, e);
			}
			finally {
				DB.close(rsDT, pstmt);
			}											
		}
		//
		if (m_GL_Category_ID == 0)
			log.log(Level.SEVERE, "No default GL_Category - " + toString());

		if (m_DocumentType == null)
			throw new IllegalStateException("Document Type not found");
	}	//	setDocumentType

	
	/**************************************************************************
	 *  Is the Source Document Balanced
	 *  @return true if (source) baanced
	 */
	public boolean isBalanced()
	{
		//  Multi-Currency documents are source balanced by definition
		if (isMultiCurrency())
			return true;
		//
		boolean retValue = getBalance().signum() == 0;
		if (retValue)
			log.fine("Yes " + toString());
		else
			log.warning("NO - " + toString());
		return retValue;
	}	//	isBalanced

	/**
	 *  Is Document convertible to currency and Conversion Type
	 *  @param acctSchema accounting schema
	 *  @return true, if vonvertable to accounting currency
	 */
	public boolean isConvertible (MAcctSchema acctSchema)
	{
		//  No Currency in document
		if (getC_Currency_ID() == NO_CURRENCY)
		{
			log.fine("(none) - " + toString());
			return true;
		}
		//  Get All Currencies
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(new Integer(getC_Currency_ID()));
		for (int i = 0; p_lines != null && i < p_lines.length; i++)
		{
			int C_Currency_ID = p_lines[i].getC_Currency_ID();
			if (C_Currency_ID != NO_CURRENCY)
				set.add(new Integer(C_Currency_ID));
		}

		//  just one and the same
		if (set.size() == 1 && acctSchema.getC_Currency_ID() == getC_Currency_ID())
		{
			log.fine("(same) Cur=" + getC_Currency_ID() + " - " + toString());
			return true;
		}

		boolean convertible = true;
		Iterator it = set.iterator();
		while (it.hasNext() && convertible)
		{
			int C_Currency_ID = ((Integer)it.next()).intValue();
			if (C_Currency_ID != acctSchema.getC_Currency_ID() && getC_ConversionType_ID() > 0 )
			{
				BigDecimal amt = MConversionRate.getRate (C_Currency_ID, acctSchema.getC_Currency_ID(),
					getDateDoc(), getC_ConversionType_ID(), getAD_Client_ID(), getAD_Org_ID());
				 
				if (amt == null && p_po.get_TableName().compareTo(X_C_AllocationHdr.Table_Name) != 0)
				{
					convertible = false;
					log.warning ("NOT from C_Currency_ID=" + C_Currency_ID
						+ " to " + acctSchema.getC_Currency_ID()
						+ " - " + toString());
					throw new ConversionRateException(Env.ZERO, C_Currency_ID, 
							acctSchema.getC_Currency_ID(), getC_ConversionType_ID(), getDateDoc() );
				}
				else
					log.fine("From C_Currency_ID=" + C_Currency_ID);
			}
		}

		log.fine("Convertible=" + convertible + ", AcctSchema C_Currency_ID=" + acctSchema.getC_Currency_ID() + " - " + toString());
		return convertible;
	}	//	isConvertible

	/**
	 *  Calculate Period from DateAcct.
	 *  m_C_Period_ID is set to -1 of not open to 0 if not found
	 */
	public void setPeriod()
	{
		if (m_period != null)
			return;
		
		//	Period defined in GL Journal (e.g. adjustment period)
		int index = p_po.get_ColumnIndex("C_Period_ID");
		if (index != -1)
		{
			Integer ii = (Integer)p_po.get_Value(index);
			if (ii != null)
				m_period = MPeriod.get(getCtx(), ii.intValue());
		}
		if (m_period == null)
			//m_period = MPeriod.get(getCtx(), getDateAcct());
		    m_period = MPeriod.get(getCtx(), getDateAcct(), getAD_Org_ID(), getAD_Client_ID());
		//	Is Period Open?
		if (m_period != null 
			&& m_period.isOpen(getDocumentType(), getDateAcct()))
			m_C_Period_ID = m_period.getC_Period_ID();
		else
			m_C_Period_ID = -1;
		//
		log.fine(	// + AD_Client_ID + " - " 
			getDateAcct() + " - " + getDocumentType() + " => " + m_C_Period_ID);
	}   //  setC_Period_ID

	/**
	 * 	Get C_Period_ID
	 *	@return period
	 */
	public int getC_Period_ID()
	{
		if (m_period == null)
			setPeriod();
		return m_C_Period_ID;
	}	//	getC_Period_ID

	/**
	 *	Is Period Open
	 *  @return true if period is open
	 */
	public boolean isPeriodOpen()
	{
		setPeriod();
		boolean open = m_C_Period_ID > 0;
		if (open)
			log.fine("Yes - " + toString());
		else
			log.fine("NO - " + toString());
		return open;
	}	//	isPeriodOpen

	/*************************************************************************/

	/**	Amount Type - Invoice - Gross   */
	public static final int 	AMTTYPE_Gross   = 0;
	/**	Amount Type - Invoice - Net   */
	public static final int 	AMTTYPE_Net     = 1;
	/**	Amount Type - Invoice - Charge   */
	public static final int 	AMTTYPE_Charge  = 2;

	/** Source Amounts (may not all be used)	*/
	private BigDecimal[]		m_Amounts = new BigDecimal[4];
	/** Quantity								*/
	private BigDecimal			m_qty = null;

	/**
	 *	Get the Amount
	 *  (loaded in loadDocumentDetails)
	 *
	 *  @param AmtType see AMTTYPE_*
	 *  @return Amount
	 */
	public BigDecimal getAmount(int AmtType)
	{
		if (AmtType < 0 || AmtType >= m_Amounts.length)
			return null;
		return m_Amounts[AmtType];
	}	//	getAmount

	/**
	 *	Set the Amount
	 *  @param AmtType see AMTTYPE_*
	 *  @param amt Amount
	 */
	protected void setAmount(int AmtType, BigDecimal amt)
	{
		if (AmtType < 0 || AmtType >= m_Amounts.length)
			return;
		if (amt == null)
			m_Amounts[AmtType] = Env.ZERO;
		else
			m_Amounts[AmtType] = amt;
	}	//	setAmount

	/**
	 *  Get Amount with index 0
	 *  @return Amount (primary document amount)
	 */
	public BigDecimal getAmount()
	{
		return m_Amounts[0];
	}   //  getAmount

	/**
	 *  Set Quantity
	 *  @param qty Quantity
	 */
	protected void setQty (BigDecimal qty)
	{
		m_qty = qty;
	}   //  setQty

	/**
	 *  Get Quantity
	 *  @return Quantity
	 */
	public BigDecimal getQty()
	{
		if (m_qty == null)
		{
			int index = p_po.get_ColumnIndex("Qty");
			if (index != -1)
				m_qty = (BigDecimal)p_po.get_Value(index);
			else
				m_qty = Env.ZERO;
		}
		return m_qty;
	}   //  getQty
	
	/*************************************************************************/

	/**	Account Type - Invoice - Charge  */
	public static final int 	ACCTTYPE_Charge         = 0;
	/**	Account Type - Invoice - AR  */
	public static final int 	ACCTTYPE_C_Receivable   = 1;
	/**	Account Type - Invoice - AP  */
	public static final int 	ACCTTYPE_V_Liability    = 2;
	/**	Account Type - Invoice - AP Service  */
	public static final int 	ACCTTYPE_V_Liability_Services    = 3;
	/**	Account Type - Invoice - AR Service  */
	public static final int 	ACCTTYPE_C_Receivable_Services   = 4;

	/** Account Type - Payment - Unallocated */
	public static final int    ACCTTYPE_UnallocatedCash = 10;
	/** Account Type - Payment - Transfer */
	public static final int 	ACCTTYPE_BankInTransit  = 11;
	/** Account Type - Payment - Transfer (Destination) */
	public static final int	ACCTTYPE_BankInTransitDest = 12;
	/** Account Type - Payment - Selection */
	public static final int	ACCTTYPE_PaymentSelect  = 13;
	/** Account Type - Payment - Prepayment */
	public static final int 	ACCTTYPE_C_Prepayment  = 14;
	/** Account Type - Payment - Prepayment */
	public static final int	ACCTTYPE_V_Prepayment  = 15;
	/** Account Type - Payment - BOE Confirm */
	public static final int ACCTYPE_BOEConfirm = 16;
	/** Account Type - BOE */
	public static final int ACCTYPE_BOE_wr = 17;
	public static final int ACCTYPE_BOE_rv = 18;
	public static final int ACCTYPE_BOE_ds = 19;
	public static final int ACCTYPE_BOE_pd = 20;
	
	public static final int ACCTYPE_Withholding = 21;
	public static final int ACCTYPE_WithholdingApply = 22;

	/** Account Type - Cash     - Asset */
	public static final int     ACCTTYPE_CashAsset = 25;
	/** Account Type - Cash     - Transfer */
	public static final int     ACCTTYPE_CashTransfer = 26;
	/** Account Type - Cash     - Expense */
	public static final int     ACCTTYPE_CashExpense = 27;
	/** Account Type - Cash     - Receipt */
	public static final int     ACCTTYPE_CashReceipt = 28;
	/** Account Type - Cash     - Difference */
	public static final int     ACCTTYPE_CashDifference = 29;

	/** Account Type - Allocation - Discount Expense (AR) */
	public static final int 	ACCTTYPE_DiscountExp = 30;
	/** Account Type - Allocation - Discount Revenue (AP) */
	public static final int 	ACCTTYPE_DiscountRev = 31;
	/** Account Type - Allocation - Write Off Gain */
	public static final int 	ACCTTYPE_WriteOffGain = 32;
	/** Account Type - Allocation - Write Off Loss */
	public static final int	ACCTTYPE_WriteOffLoss = 33;

	/** Account Type - Bank Statement - Asset  */
	public static final int     ACCTTYPE_BankAsset = 40;
	/** Account Type - Bank Statement - Interest Revenue */
	public static final int     ACCTTYPE_InterestRev = 41;
	/** Account Type - Bank Statement - Interest Exp  */
	public static final int     ACCTTYPE_InterestExp = 42;

	/** Inventory Accounts  - Differnces	*/
	public static final int     ACCTTYPE_InvDifferences = 50;
	/** Inventory Accounts - NIR		*/
	public static final int     ACCTTYPE_NotInvoicedReceipts = 51;

	/** Project Accounts - Assets      	*/
	public static final int     ACCTTYPE_ProjectAsset = 61;
	/** Project Accounts - WIP         	*/
	public static final int     ACCTTYPE_ProjectWIP = 62;

	/** GL Accounts - PPV Offset		*/
	public static final int     ACCTTYPE_PPVOffset = 101;
	/** GL Accounts - Commitment Offset	*/
	public static final int     ACCTTYPE_CommitmentOffset = 111;


	/**
	 *	Get the Valid Combination id for Accounting Schema
	 *  @param AcctType see ACCTTYPE_*
	 *  @param as accounting schema
	 *  @return C_ValidCombination_ID
	 */
	public int getValidCombination_ID (int AcctType, MAcctSchema as)
	{
		int para_1 = 0;     //  first parameter (second is always AcctSchema)
		String sql = null;

		/**	Account Type - Invoice */
		if (AcctType == ACCTTYPE_Charge)	//	see getChargeAccount in DocLine
		{
			int cmp = getAmount(AMTTYPE_Charge).compareTo(Env.ZERO);
			if (cmp == 0)
				return 0;
			else if (cmp < 0)
				sql = "SELECT CH_Expense_Acct FROM C_Charge_Acct WHERE C_Charge_ID=? AND C_AcctSchema_ID=?";
			else
				sql = "SELECT CH_Revenue_Acct FROM C_Charge_Acct WHERE C_Charge_ID=? AND C_AcctSchema_ID=?";
			para_1 = getC_Charge_ID();
		}
		else if (AcctType == ACCTTYPE_V_Liability)
		{
			sql = "SELECT V_Liability_Acct FROM C_BP_Vendor_Acct WHERE C_BPartner_ID=? AND C_AcctSchema_ID=?";
			para_1 = getC_BPartner_ID();
		}
		else if (AcctType == ACCTTYPE_V_Liability_Services)
		{
			sql = "SELECT V_Liability_Services_Acct FROM C_BP_Vendor_Acct WHERE C_BPartner_ID=? AND C_AcctSchema_ID=?";
			para_1 = getC_BPartner_ID();
		}
		else if (AcctType == ACCTTYPE_C_Receivable)
		{
			sql = "SELECT C_Receivable_Acct FROM C_BP_Customer_Acct WHERE C_BPartner_ID=? AND C_AcctSchema_ID=?";
			para_1 = getC_BPartner_ID();
		}
		else if (AcctType == ACCTTYPE_C_Receivable_Services)
		{
			sql = "SELECT C_Receivable_Services_Acct FROM C_BP_Customer_Acct WHERE C_BPartner_ID=? AND C_AcctSchema_ID=?";
			para_1 = getC_BPartner_ID();
		}
		else if (AcctType == ACCTTYPE_V_Prepayment)
		{
			sql = "SELECT V_Prepayment_Acct FROM C_BP_Vendor_Acct WHERE C_BPartner_ID=? AND C_AcctSchema_ID=?";
			para_1 = getC_BPartner_ID();
		}
		else if (AcctType == ACCTTYPE_C_Prepayment)
		{
			sql = "SELECT C_Prepayment_Acct FROM C_BP_Customer_Acct WHERE C_BPartner_ID=? AND C_AcctSchema_ID=?";
			para_1 = getC_BPartner_ID();
		}

		/** Account Type - Payment  */
		else if (AcctType == ACCTTYPE_UnallocatedCash)
		{
			sql = "SELECT B_UnallocatedCash_Acct FROM C_BankAccount_Acct WHERE C_BankAccount_ID=? AND C_AcctSchema_ID=?";
			para_1 = getC_BankAccount_ID();
		}
		else if (AcctType == ACCTTYPE_BankInTransit)
		{
			sql = "SELECT B_InTransit_Acct FROM C_BankAccount_Acct WHERE C_BankAccount_ID=? AND C_AcctSchema_ID=?";
			para_1 = getC_BankAccount_ID();
		}
		else if (AcctType == ACCTTYPE_BankInTransitDest)
		{
			sql = "SELECT B_InTransit_Acct FROM C_BankAccount_Acct WHERE C_BankAccount_ID=? AND C_AcctSchema_ID=?";
			para_1 = getDest_BankAccount_ID();
		}
		else if (AcctType == ACCTTYPE_PaymentSelect)
		{
			sql = "SELECT B_PaymentSelect_Acct FROM C_BankAccount_Acct WHERE C_BankAccount_ID=? AND C_AcctSchema_ID=?";
			para_1 = getC_BankAccount_ID();
		}
		else if (AcctType == ACCTYPE_BOEConfirm)
		{
			sql = "SELECT boe_confirm_acct FROM C_BankAccount_Acct WHERE C_BankAccount_ID=? AND C_AcctSchema_ID=?";
			para_1 = getC_BankAccount_ID();
		}		
		else if (AcctType == ACCTYPE_BOE_wr)
		{
			sql = "SELECT boe_wr_acct FROM C_BankAccount_Acct WHERE C_BankAccount_ID=? AND C_AcctSchema_ID=?";
			para_1 = getC_BankAccount_ID();
		}
		else if (AcctType == ACCTYPE_BOE_rv)
		{
			sql = "SELECT boe_rv_acct FROM C_BankAccount_Acct WHERE C_BankAccount_ID=? AND C_AcctSchema_ID=?";
			para_1 = getC_BankAccount_ID();
		}
		else if (AcctType == ACCTYPE_BOE_ds)
		{
			sql = "SELECT boe_ds_acct FROM C_BankAccount_Acct WHERE C_BankAccount_ID=? AND C_AcctSchema_ID=?";
			para_1 = getC_BankAccount_ID();
		}
		else if (AcctType == ACCTYPE_BOE_pd)
		{
			sql = "SELECT boe_pd_acct FROM C_BankAccount_Acct WHERE C_BankAccount_ID=? AND C_AcctSchema_ID=?";
			para_1 = getC_BankAccount_ID();
		}
		else if (AcctType == ACCTYPE_Withholding)
		{
			sql = "SELECT Withholding_Acct FROM C_Withholding_Acct WHERE C_Withholding_ID=? AND C_AcctSchema_ID=?";
			para_1 = getC_Withholding_ID();
		}
		else if (AcctType == ACCTYPE_WithholdingApply)
		{
			sql = "SELECT WithholdingApply_Acct FROM C_Withholding_Acct WHERE C_Withholding_ID=? AND C_AcctSchema_ID=?";
			para_1 = getC_Withholding_ID();
		}
		/** Account Type - Allocation   */
		else if (AcctType == ACCTTYPE_DiscountExp)
		{
			sql = "SELECT a.PayDiscount_Exp_Acct FROM C_BP_Group_Acct a, C_BPartner bp "
				+ "WHERE a.C_BP_Group_ID=bp.C_BP_Group_ID AND bp.C_BPartner_ID=? AND a.C_AcctSchema_ID=?";
			para_1 = getC_BPartner_ID();
		}
		else if (AcctType == ACCTTYPE_DiscountRev)
		{
			sql = "SELECT PayDiscount_Rev_Acct FROM C_BP_Group_Acct a, C_BPartner bp "
				+ "WHERE a.C_BP_Group_ID=bp.C_BP_Group_ID AND bp.C_BPartner_ID=? AND a.C_AcctSchema_ID=?";
			para_1 = getC_BPartner_ID();
		}
		else if (AcctType == ACCTTYPE_WriteOffGain)
		{
			sql = "SELECT WriteOffGain_Acct FROM C_BP_Group_Acct a, C_BPartner bp "
				+ "WHERE a.C_BP_Group_ID=bp.C_BP_Group_ID AND bp.C_BPartner_ID=? AND a.C_AcctSchema_ID=?";
			para_1 = getC_BPartner_ID();
		}
		else if (AcctType == ACCTTYPE_WriteOffLoss)
		{
			sql = "SELECT WriteOffLoss_Acct FROM C_BP_Group_Acct a, C_BPartner bp "
				+ "WHERE a.C_BP_Group_ID=bp.C_BP_Group_ID AND bp.C_BPartner_ID=? AND a.C_AcctSchema_ID=?";
			para_1 = getC_BPartner_ID();		
		}
		/** Account Type - Bank Statement   */
		else if (AcctType == ACCTTYPE_BankAsset)
		{
			sql = "SELECT B_Asset_Acct FROM C_BankAccount_Acct WHERE C_BankAccount_ID=? AND C_AcctSchema_ID=?";
			para_1 = getC_BankAccount_ID();
		}
		else if (AcctType == ACCTTYPE_InterestRev)
		{
			sql = "SELECT B_InterestRev_Acct FROM C_BankAccount_Acct WHERE C_BankAccount_ID=? AND C_AcctSchema_ID=?";
			para_1 = getC_BankAccount_ID();
		}
		else if (AcctType == ACCTTYPE_InterestExp)
		{
			sql = "SELECT B_InterestExp_Acct FROM C_BankAccount_Acct WHERE C_BankAccount_ID=? AND C_AcctSchema_ID=?";
			para_1 = getC_BankAccount_ID();
		}

		/** Account Type - Cash     */
		else if (AcctType == ACCTTYPE_CashAsset)
		{
			sql = "SELECT CB_Asset_Acct FROM C_CashBook_Acct WHERE C_CashBook_ID=? AND C_AcctSchema_ID=?";
			para_1 = getC_CashBook_ID();
		}
		else if (AcctType == ACCTTYPE_CashTransfer)
		{
			sql = "SELECT CB_CashTransfer_Acct FROM C_CashBook_Acct WHERE C_CashBook_ID=? AND C_AcctSchema_ID=?";
			para_1 = getC_CashBook_ID();
		}
		else if (AcctType == ACCTTYPE_CashExpense)
		{
			sql = "SELECT CB_Expense_Acct FROM C_CashBook_Acct WHERE C_CashBook_ID=? AND C_AcctSchema_ID=?";
			para_1 = getC_CashBook_ID();
		}
		else if (AcctType == ACCTTYPE_CashReceipt)
		{
			sql = "SELECT CB_Receipt_Acct FROM C_CashBook_Acct WHERE C_CashBook_ID=? AND C_AcctSchema_ID=?";
			para_1 = getC_CashBook_ID();
		}
		else if (AcctType == ACCTTYPE_CashDifference)
		{
			sql = "SELECT CB_Differences_Acct FROM C_CashBook_Acct WHERE C_CashBook_ID=? AND C_AcctSchema_ID=?";
			para_1 = getC_CashBook_ID();
		}

		/** Inventory Accounts          */
		else if (AcctType == ACCTTYPE_InvDifferences)
		{
			sql = "SELECT W_Differences_Acct FROM M_Warehouse_Acct WHERE M_Warehouse_ID=? AND C_AcctSchema_ID=?";
			//  "SELECT W_Inventory_Acct, W_Revaluation_Acct, W_InvActualAdjust_Acct FROM M_Warehouse_Acct WHERE M_Warehouse_ID=? AND C_AcctSchema_ID=?";
			para_1 = getM_Warehouse_ID();
		}
		else if (AcctType == ACCTTYPE_NotInvoicedReceipts)
		{
			sql = "SELECT NotInvoicedReceipts_Acct FROM C_BP_Group_Acct a, C_BPartner bp "
				+ "WHERE a.C_BP_Group_ID=bp.C_BP_Group_ID AND bp.C_BPartner_ID=? AND a.C_AcctSchema_ID=?";
			para_1 = getC_BPartner_ID();
		}

		/** Project Accounts          	*/
		else if (AcctType == ACCTTYPE_ProjectAsset)
		{
			sql = "SELECT PJ_Asset_Acct FROM C_Project_Acct WHERE C_Project_ID=? AND C_AcctSchema_ID=?";
			para_1 = getC_Project_ID();
		}
		else if (AcctType == ACCTTYPE_ProjectWIP)
		{
			sql = "SELECT PJ_WIP_Acct FROM C_Project_Acct WHERE C_Project_ID=? AND C_AcctSchema_ID=?";
			para_1 = getC_Project_ID();
		}

		/** GL Accounts                 */
		else if (AcctType == ACCTTYPE_PPVOffset)
		{
			sql = "SELECT PPVOffset_Acct FROM C_AcctSchema_GL WHERE C_AcctSchema_ID=?";
			para_1 = -1;
		}
		else if (AcctType == ACCTTYPE_CommitmentOffset)
		{
			sql = "SELECT CommitmentOffset_Acct FROM C_AcctSchema_GL WHERE C_AcctSchema_ID=?";
			para_1 = -1;
		}

		else
		{
			log.severe ("Not found AcctType=" + AcctType);
			return 0;
		}
		//  Do we have sql & Parameter
		if (sql == null || para_1 == 0)
		{
			log.severe ("No Parameter for AcctType=" + AcctType + " - SQL=" + sql);
			return 0;
		}

		//  Get Acct
		int Account_ID = 0;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			pstmt = DB.prepareStatement(sql, null);
			if (para_1 == -1)   //  GL Accounts
				pstmt.setInt (1, as.getC_AcctSchema_ID());
			else
			{
				pstmt.setInt (1, para_1);
				pstmt.setInt (2, as.getC_AcctSchema_ID());
			}
			rs = pstmt.executeQuery();
			if (rs.next())
				Account_ID = rs.getInt(1);
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, "AcctType=" + AcctType + " - SQL=" + sql, e);
			return 0;
		}
		finally
		{
			DB.close(rs, pstmt);
		}
		//	No account
		if (Account_ID == 0)
		{
			log.severe ("NO account Type="
				+ AcctType + ", Record=" + p_po.get_ID());
			return 0;
		}
		return Account_ID;
	}	//	getAccount_ID

	/**
	 * 	Get header level C_Withholding_ID
	 *	@return Charge
	 */
	public int getC_Withholding_ID()
	{
		int index = p_po.get_ColumnIndex(X_C_Invoice.COLUMNNAME_WithholdingAmt);
		if (index != -1)
		{
			Integer ii = (Integer)p_po.get_Value(index);
			if (ii != null)
				return ii.intValue();
		}
		return 0;
	}	//	getC_Charge_ID
	

	/**
	 *	Get the account for Accounting Schema
	 *  @param AcctType see ACCTTYPE_*
	 *  @param as accounting schema
	 *  @return Account
	 */
	public final MAccount getAccount (int AcctType, MAcctSchema as)
	{
		int C_ValidCombination_ID = getValidCombination_ID(AcctType, as);
		if (C_ValidCombination_ID == 0)
			return null;
		//	Return Account
		MAccount acct = MAccount.get (as.getCtx(), C_ValidCombination_ID);
		return acct;
	}	//	getAccount

	
	/**************************************************************************
	 *  Save to Disk - set posted flag
	 *  @param trxName transaction name
	 *  @return true if saved
	 */
	private final boolean save (String trxName)
	{
		log.fine(toString() + "->" + p_Status);
		StringBuffer sql = new StringBuffer("UPDATE ");
		sql.append(get_TableName()).append(" SET Posted='").append(p_Status)
			.append("',Processing='N' ");
//		if (getFact_ID().length() != 0)
//			sql.append(", Fact_ID=? ");
		sql.append("WHERE ")
			.append(get_TableName()).append("_ID=").append(p_po.get_ID());
		try {
			CPreparedStatement cstmt = DB.prepareStatement(sql.toString(), ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE, trxName);
			//if (getFact_ID().length() != 0) {
				//cstmt.setString(1, getFact_ID());
			//	cstmt.setInt(1, p_po.get_ID());
			//}
			//else
			//cstmt.setInt(1, p_po.get_ID());
			int no = cstmt.executeUpdate();
			return no == 1;
		}
		catch (SQLException e) {
			return false;
		}
	}   //  save

	/**
	 *  Get DocLine with ID
	 *  @param Record_ID Record ID
	 *  @return DocLine
	 */
	public DocLine getDocLine (int Record_ID)
	{
		if (p_lines == null || p_lines.length == 0 || Record_ID == 0)
			return null;

		for (int i = 0; i < p_lines.length; i++)
		{
			if (p_lines[i].get_ID() == Record_ID)
				return p_lines[i];
		}
		return null;
	}   //  getDocLine

	/**
	 *  String Representation
	 *  @return String
	 */
	public String toString()
	{
		return p_po.toString();
	}   //  toString

	
	/**
	 * 	Get AD_Client_ID
	 *	@return client
	 */
	public int getAD_Client_ID()
	{
		return p_po.getAD_Client_ID();
	}	//	getAD_Client_ID
	
	/**
	 * 	Get AD_Org_ID
	 *	@return org
	 */
	public int getAD_Org_ID()
	{
		return p_po.getAD_Org_ID();
	}	//	getAD_Org_ID

	/**
	 * 	Get Document No
	 *	@return document No
	 */
	public String getDocumentNo()
	{
		if (m_DocumentNo != null)
			return m_DocumentNo;
		int index = p_po.get_ColumnIndex("DocumentNo");
		if (index == -1)
			index = p_po.get_ColumnIndex("Name");
		if (index == -1)
			throw new UnsupportedOperationException("No DocumentNo");
		m_DocumentNo = (String)p_po.get_Value(index);
		return m_DocumentNo;
	}	//	getDocumentNo
	
	/**
	 * 	Get Description
	 *	@return Description
	 */
	public String getDescription()
	{
		if (m_Description == null)
		{
			int index = p_po.get_ColumnIndex("Description");
			if (index != -1)
				m_Description = (String)p_po.get_Value(index);
			else
				m_Description = "";
		}
		return m_Description;
	}	//	getDescription
	
	/**
	 * 	Get C_Currency_ID
	 *	@return currency
	 */
	public int getC_Currency_ID()
	{
		if (m_C_Currency_ID == -1)
		{
			int index = p_po.get_ColumnIndex("C_Currency_ID");
			if (index != -1)
			{
				Integer ii = (Integer)p_po.get_Value(index);
				if (ii != null)
					m_C_Currency_ID = ii.intValue();
			}
			if (m_C_Currency_ID == -1)
				m_C_Currency_ID = NO_CURRENCY;
		}
		return m_C_Currency_ID;
	}	//	getC_Currency_ID
	
	/**
	 * Get Fact_ID
	 * @return Fact_ID id
	 */
	public String getFact_ID()
	{
		if (m_Fact_ID.length() == 0)
		{
			int index = p_po.get_ColumnIndex("Fact_ID");
			if (index != -1)
			{
				String ii = (String)p_po.get_Value(index);
				if (ii != null)
					m_Fact_ID = ii;
			}
		}
		return m_Fact_ID;
	}

	/**
	 * Set Fact_ID
	 * @param Fact_ID id
	 */
	public void setFact_ID (String Fact_ID)
	{
		m_Fact_ID = Fact_ID;
	}

	/**
	 * 	Set C_Currency_ID
	 *	@param C_Currency_ID id
	 */
	public void setC_Currency_ID (int C_Currency_ID)
	{
		m_C_Currency_ID = C_Currency_ID;
	}	//	setC_Currency_ID
	
	/**
	 * 	Is Multi Currency
	 *	@return mc
	 */
	public boolean isMultiCurrency()
	{
		return m_MultiCurrency;
	}	//	isMultiCurrency

	/**
	 * 	Set Multi Currency
	 *	@param mc multi currency
	 */
	protected void setIsMultiCurrency (boolean mc)
	{
		m_MultiCurrency = mc;
	}	//	setIsMultiCurrency
	
	/**
	 * 	Is Tax Included
	 *	@return tax incl
	 */
	public boolean isTaxIncluded()
	{
		return m_TaxIncluded;
	}	//	isTaxIncluded

	/**
	 * 	Set Tax Includedy
	 *	@param ti Tax Included
	 */
	protected void setIsTaxIncluded (boolean ti)
	{
		m_TaxIncluded = ti;
	}	//	setIsTaxIncluded
	
	/**
	 * 	Get C_ConversionType_ID
	 *	@return ConversionType
	 */
	public int getC_ConversionType_ID()
	{
		int index = p_po.get_ColumnIndex("C_ConversionType_ID");
		if (index != -1)
		{
			Integer ii = (Integer)p_po.get_Value(index);
			if (ii != null)
				return ii.intValue();
		}
		return 0;
	}	//	getC_ConversionType_ID
	
	/**
	 * 	Get GL_Category_ID
	 *	@return categoory
	 */
	public int getGL_Category_ID()
	{
		return m_GL_Category_ID;
	}	//	getGL_Category_ID
	
	/**
	 * 	Get GL_Category_ID
	 *	@return categoory
	 */
	public int getGL_Budget_ID()
	{
		int index = p_po.get_ColumnIndex("GL_Budget_ID");
		if (index != -1)
		{
			Integer ii = (Integer)p_po.get_Value(index);
			if (ii != null)
				return ii.intValue();
		}
		return 0;
	}	//	getGL_Budget_ID

	/**
	 * 	Get Accounting Date
	 *	@return currency
	 */
	public Timestamp getDateAcct()
	{
		if (m_DateAcct != null)
			return m_DateAcct;
		int index = p_po.get_ColumnIndex("DateAcct");
		if (index != -1)
		{
			m_DateAcct = (Timestamp)p_po.get_Value(index);
			if (m_DateAcct != null)
				return m_DateAcct;
		}
		throw new IllegalStateException("No DateAcct");
	}	//	getDateAcct

	/**
	 * 	Set Date Acct
	 *	@param da accounting date
	 */
	protected void setDateAcct (Timestamp da)
	{
		m_DateAcct = da;
	}	//	setDateAcct
	
	/**
	 * 	Get Document Date
	 *	@return currency
	 */
	public Timestamp getDateDoc()
	{
		if (m_DateDoc != null)
			return m_DateDoc;
		int index = p_po.get_ColumnIndex("DateDoc");
		if (index == -1)
			index = p_po.get_ColumnIndex("MovementDate");
		if (index != -1)
		{
			m_DateDoc = (Timestamp)p_po.get_Value(index);
			if (m_DateDoc != null)
				return m_DateDoc;
		}
		throw new IllegalStateException("No DateDoc");
	}	//	getDateDoc
	
	/**
	 * 	Set Date Doc
	 *	@param dd document date
	 */
	protected void setDateDoc (Timestamp dd)
	{
		m_DateDoc = dd;
	}	//	setDateDoc

	/**
	 * 	Is Document Posted
	 *	@return true if posted
	 */
	public boolean isPosted()
	{
		int index = p_po.get_ColumnIndex("Posted");
		if (index != -1)
		{
			Object posted = p_po.get_Value(index);
			if (posted instanceof Boolean)
				return ((Boolean)posted).booleanValue();
			if (posted instanceof String)
				return "Y".equals(posted);
		}
		throw new IllegalStateException("No Posted");
	}	//	isPosted
	
	public boolean isCosted()
	{
		int index = p_po.get_ColumnIndex(X_M_InOut.COLUMNNAME_IsCosted);
		if (index != -1)
		{
			Object costed = p_po.get_Value(index);
			if (costed instanceof Boolean)
				return ((Boolean)costed).booleanValue();
			if (costed instanceof String)
				return "Y".equals(costed);
		}
		throw new IllegalStateException("No Costed");
	}
	/**
	 * 	Is Sales Trx
	 *	@return true if posted
	 */
	public boolean isSOTrx()
	{
		int index = p_po.get_ColumnIndex("IsSOTrx");
		if (index == -1)
			index = p_po.get_ColumnIndex("IsReceipt");
		if (index != -1)
		{
			Object posted = p_po.get_Value(index);
			if (posted instanceof Boolean)
				return ((Boolean)posted).booleanValue();
			if (posted instanceof String)
				return "Y".equals(posted);
		}
		return false;
	}	//	isSOTrx

	/**
	 * 	Get C_DocType_ID
	 *	@return DocType
	 */
	public int getC_DocType_ID()
	{
		int index = p_po.get_ColumnIndex("C_DocType_ID");
		if (index != -1)
		{
			Integer ii = (Integer)p_po.get_Value(index);
			//	DocType does not exist - get DocTypeTarget
			if (ii != null && ii.intValue() == 0)
			{
				index = p_po.get_ColumnIndex("C_DocTypeTarget_ID");
				if (index != -1)
					ii = (Integer)p_po.get_Value(index);
			}
			if (ii != null)
				return ii.intValue();
		}
		return 0;
	}	//	getC_DocType_ID
	
	/**
	 * 	Get header level C_Charge_ID
	 *	@return Charge
	 */
	public int getC_Charge_ID()
	{
		int index = p_po.get_ColumnIndex("C_Charge_ID");
		if (index != -1)
		{
			Integer ii = (Integer)p_po.get_Value(index);
			if (ii != null)
				return ii.intValue();
		}
		return 0;
	}	//	getC_Charge_ID

	/**
	 * 	Get SalesRep_ID
	 *	@return SalesRep
	 */
	public int getSalesRep_ID()
	{
		int index = p_po.get_ColumnIndex("SalesRep_ID");
		if (index != -1)
		{
			Integer ii = (Integer)p_po.get_Value(index);
			if (ii != null)
				return ii.intValue();
		}
		return 0;
	}	//	getSalesRep_ID
	
	/**
	 * 	Get C_BankAccount_ID
	 *	@return BankAccount
	 */
	public int getC_BankAccount_ID()
	{
		if (m_C_BankAccount_ID == -1)
		{
			int index = p_po.get_ColumnIndex("C_BankAccount_ID");
			if (index != -1)
			{
				Integer ii = (Integer)p_po.get_Value(index);
				if (ii != null)
					m_C_BankAccount_ID = ii.intValue();
			}
			if (m_C_BankAccount_ID == -1)
				m_C_BankAccount_ID = 0;
		}
		return m_C_BankAccount_ID;
	}	//	getC_BankAccount_ID

	/**
	 * 	Get Dest_BankAccount_ID
	 *	@return BankAccount
	 */
	public int getDest_BankAccount_ID()
	{
		if (m_Dest_BankAccount_ID == -1)
		{
			int index = p_po.get_ColumnIndex("Dest_BankAccount_ID");
			if (index != -1)
			{
				Integer ii = (Integer)p_po.get_Value(index);
				if (ii != null)
					m_Dest_BankAccount_ID = ii.intValue();
			}
			if (m_Dest_BankAccount_ID == -1)
				m_Dest_BankAccount_ID = 0;
		}
		return m_Dest_BankAccount_ID;
	}	//	getDest_BankAccount_ID

	/**
	 * 	Set C_BankAccount_ID
	 *	@param C_BankAccount_ID bank acct
	 */
	protected void setC_BankAccount_ID (int C_BankAccount_ID)
	{
		m_C_BankAccount_ID = C_BankAccount_ID;
	}	//	setC_BankAccount_ID
		
	/**
	 * 	Get C_CashBook_ID
	 *	@return CashBook
	 */
	public int getC_CashBook_ID()
	{
		if (m_C_CashBook_ID == -1)
		{
			int index = p_po.get_ColumnIndex("C_CashBook_ID");
			if (index != -1)
			{
				Integer ii = (Integer)p_po.get_Value(index);
				if (ii != null)
					m_C_CashBook_ID = ii.intValue();
			}
			if (m_C_CashBook_ID == -1)
				m_C_CashBook_ID = 0;
		}
		return m_C_CashBook_ID;
	}	//	getC_CashBook_ID

	/**
	 * 	Set C_CashBook_ID
	 *	@param C_CashBook_ID cash book
	 */
	protected void setC_CashBook_ID (int C_CashBook_ID)
	{
		m_C_CashBook_ID = C_CashBook_ID;
	}	//	setC_CashBook_ID

	/**
	 * 	Get M_Warehouse_ID
	 *	@return Warehouse
	 */
	public int getM_Warehouse_ID()
	{
		int index = p_po.get_ColumnIndex("M_Warehouse_ID");
		if (index != -1)
		{
			Integer ii = (Integer)p_po.get_Value(index);
			if (ii != null)
				return ii.intValue();
		}
		return 0;
	}	//	getM_Warehouse_ID

	
	/**
	 * 	Get C_BPartner_ID
	 *	@return BPartner
	 */
	public int getC_BPartner_ID()
	{
		if (m_C_BPartner_ID == -1)
		{
			int index = p_po.get_ColumnIndex("C_BPartner_ID");
			if (index != -1)
			{
				Integer ii = (Integer)p_po.get_Value(index);
				if (ii != null)
					m_C_BPartner_ID = ii.intValue();
			}
			if (m_C_BPartner_ID == -1)
				m_C_BPartner_ID = 0;
		}
		return m_C_BPartner_ID;
	}	//	getC_BPartner_ID

	/**
	 * 	Set C_BPartner_ID
	 *	@param C_BPartner_ID bp
	 */
	protected void setC_BPartner_ID (int C_BPartner_ID)
	{
		m_C_BPartner_ID = C_BPartner_ID;
	}	//	setC_BPartner_ID
	
	/**
	 * 	Get C_BPartner_Location_ID
	 *	@return BPartner Location
	 */
	public int getC_BPartner_Location_ID()
	{
		int index = p_po.get_ColumnIndex("C_BPartner_Location_ID");
		if (index != -1)
		{
			Integer ii = (Integer)p_po.get_Value(index);
			if (ii != null)
				return ii.intValue();
		}
		return 0;
	}	//	getC_BPartner_Location_ID

	/**
	 * 	Get C_Project_ID
	 *	@return Project
	 */
	public int getC_Project_ID()
	{
		int index = p_po.get_ColumnIndex("C_Project_ID");
		if (index != -1)
		{
			Integer ii = (Integer)p_po.get_Value(index);
			if (ii != null)
				return ii.intValue();
		}
		return 0;
	}	//	getC_Project_ID
	
	/**
	 * 	Get C_SalesRegion_ID
	 *	@return Sales Region
	 */
	public int getC_SalesRegion_ID()
	{
		int index = p_po.get_ColumnIndex("C_SalesRegion_ID");
		if (index != -1)
		{
			Integer ii = (Integer)p_po.get_Value(index);
			if (ii != null)
				return ii.intValue();
		}
		return 0;
	}	//	getC_SalesRegion_ID
	
	/**
	 * 	Get C_SalesRegion_ID
	 *	@return Sales Region
	 */
	public int getBP_C_SalesRegion_ID()
	{
		if (m_BP_C_SalesRegion_ID == -1)
		{
			int index = p_po.get_ColumnIndex("C_SalesRegion_ID");
			if (index != -1)
			{
				Integer ii = (Integer)p_po.get_Value(index);
				if (ii != null)
					m_BP_C_SalesRegion_ID = ii.intValue();
			}
			if (m_BP_C_SalesRegion_ID == -1)
				m_BP_C_SalesRegion_ID = 0;
		}
		return m_BP_C_SalesRegion_ID;
	}	//	getBP_C_SalesRegion_ID

	/**
	 * 	Set C_SalesRegion_ID
	 *	@param C_SalesRegion_ID id
	 */
	protected void setBP_C_SalesRegion_ID (int C_SalesRegion_ID)
	{
		m_BP_C_SalesRegion_ID = C_SalesRegion_ID;
	}	//	setBP_C_SalesRegion_ID
	
	/**
	 * 	Get C_Activity_ID
	 *	@return Activity
	 */
	public int getC_Activity_ID()
	{
		int index = p_po.get_ColumnIndex("C_Activity_ID");
		if (index != -1)
		{
			Integer ii = (Integer)p_po.get_Value(index);
			if (ii != null)
				return ii.intValue();
		}
		return 0;
	}	//	getC_Activity_ID

	/**
	 * 	Get C_Campaign_ID
	 *	@return Campaign
	 */
	public int getC_Campaign_ID()
	{
		int index = p_po.get_ColumnIndex("C_Campaign_ID");
		if (index != -1)
		{
			Integer ii = (Integer)p_po.get_Value(index);
			if (ii != null)
				return ii.intValue();
		}
		return 0;
	}	//	getC_Campaign_ID

	/**
	 * 	Get M_Product_ID
	 *	@return Product
	 */
	public int getM_Product_ID()
	{
		int index = p_po.get_ColumnIndex("M_Product_ID");
		if (index != -1)
		{
			Integer ii = (Integer)p_po.get_Value(index);
			if (ii != null)
				return ii.intValue();
		}
		return 0;
	}	//	getM_Product_ID

	/**
	 * 	Get AD_OrgTrx_ID
	 *	@return Trx Org
	 */
	public int getAD_OrgTrx_ID()
	{
		int index = p_po.get_ColumnIndex("AD_OrgTrx_ID");
		if (index != -1)
		{
			Integer ii = (Integer)p_po.get_Value(index);
			if (ii != null)
				return ii.intValue();
		}
		return 0;
	}	//	getAD_OrgTrx_ID

	/**
	 * 	Get C_LocFrom_ID
	 *	@return loc from
	 */
	public int getC_LocFrom_ID()
	{
		return m_C_LocFrom_ID;
	}	//	getC_LocFrom_ID
	
	/**
	 * 	Set C_LocFrom_ID
	 *	@param C_LocFrom_ID loc from
	 */
	protected void setC_LocFrom_ID(int C_LocFrom_ID)
	{
		m_C_LocFrom_ID = C_LocFrom_ID;
	}	//	setC_LocFrom_ID

	/**
	 * 	Get C_LocTo_ID
	 *	@return loc to
	 */
	public int getC_LocTo_ID()
	{
		return m_C_LocTo_ID;
	}	//	getC_LocTo_ID

	/**
	 * 	Set C_LocTo_ID
	 *	@param C_LocTo_ID loc to
	 */
	protected void setC_LocTo_ID(int C_LocTo_ID)
	{
		m_C_LocTo_ID = C_LocTo_ID;
	}	//	setC_LocTo_ID

	/**
	 * 	Get User1_ID
	 *	@return Campaign
	 */
	public int getUser1_ID()
	{
		int index = p_po.get_ColumnIndex("User1_ID");
		if (index != -1)
		{
			Integer ii = (Integer)p_po.get_Value(index);
			if (ii != null)
				return ii.intValue();
		}
		return 0;
	}	//	getUser1_ID
	
	/**
	 * 	Get User2_ID
	 *	@return Campaign
	 */
	public int getUser2_ID()
	{
		int index = p_po.get_ColumnIndex("User2_ID");
		if (index != -1)
		{
			Integer ii = (Integer)p_po.get_Value(index);
			if (ii != null)
				return ii.intValue();
		}
		return 0;
	}	//	getUser2_ID
        
        	/**
	 * 	Get User Defined value
	 *	@return User defined
	 */
	public int getValue (String ColumnName)
	{
		int index = p_po.get_ColumnIndex(ColumnName);
		if (index != -1)
		{
			Integer ii = (Integer)p_po.get_Value(index);
			if (ii != null)
				return ii.intValue();
		}
		return 0;
	}	//	getValue
	
	public Integer getReferenceSource(MAcctSchema as, Object source, Integer Table_ID)
	{
		Integer Ref_Acct_ID = 0;
		if ( Table_ID.equals(MInvoice.Table_ID) )
		{
			MAccount acct = null;
			if (((MInvoice) source).isSOTrx())
				acct = MAccount.get(getCtx(),getValidCombination_ID(Doc.ACCTTYPE_C_Receivable, as));
			else
				acct = MAccount.get(getCtx(),getValidCombination_ID(Doc.ACCTTYPE_V_Liability, as));
			Ref_Acct_ID = DB.getSQLValue(null, "SELECT fact_acct_id from fact_acct WHERE account_id = ? AND ad_table_id = ? AND record_id = ?",acct.getAccount_ID(),Table_ID, ((MInvoice) source).getC_Invoice_ID());
		}
		else if ( Table_ID.equals(MBOE.Table_ID))
		{
			if (((MBOE)source).getDocStatus().equals(DocAction.STATUS_Portfolio))
			{
				MAccount acct = MBOE.getAccount(as, ((MBOE)source).getDocStatus() , ((MBOE)source).isSOTrx());
				MGroupDoc doc = new MGroupDoc(Env.getCtx(), ((MBOE)source).getC_GroupDoc_ID(), null);
				Ref_Acct_ID = DB.getSQLValue(null, "SELECT fact_acct_id from fact_acct WHERE  ad_table_id = ? AND record_id = ?", MAllocationHdr.Table_ID, doc.getC_AllocationHdr_ID());
			}
		}
		return Ref_Acct_ID;
	}
	
	
	/*************************************************************************/
	//  To be overwritten by Subclasses

	/**
	 *  Load Document Details
	 *  @return error message or null
	 */
	protected abstract String loadDocumentDetails ();

	/**
	 *  Get Source Currency Balance - subtracts line (and tax) amounts from total - no rounding
	 *  @return positive amount, if total header is bigger than lines
	 */
	public abstract BigDecimal getBalance();

	/**
	 *  Create Facts (the accounting logic)
	 *  @param as accounting schema
	 *  @return Facts
	 */
	public abstract ArrayList<Fact> createFacts (MAcctSchema as);

	public FactLine createFact(MAcctSchema as, 
			FactLine fl, 
			Fact fact, 
			MAccount account, 
			int C_BPartner_ID,
			int C_Currency_ID,
			int C_ConversionType_ID,
			Timestamp pDateAcct,
			Timestamp pDatedoc,
			DocLine line,
			BigDecimal amountDr,
			BigDecimal amountCr,
			int AD_Client_ID,
			int AD_Org_ID,
			String doc,
			int C_DocType_ID) {
		return createFact(as, fl, fact, account, C_BPartner_ID, 
				C_Currency_ID, C_ConversionType_ID, pDateAcct, pDatedoc, null, line, amountDr, amountCr, AD_Client_ID, AD_Org_ID, doc, C_DocType_ID);	
	}	

	public FactLine createFact(MAcctSchema as, 
			FactLine fl, 
			Fact fact, 
			MAccount account, 
			int C_BPartner_ID,
			int C_Currency_ID,
			int C_ConversionType_ID,
			Timestamp pDateAcct,
			Timestamp pDatedoc,
			Timestamp pDatepay,
			DocLine line,
			BigDecimal amountDr,
			BigDecimal amountCr,
			int AD_Client_ID,
			int AD_Org_ID,
			String doc,
			int C_DocType_ID) {

		if (account == null )
		{
			p_Error = " error de cuenta ";
			return null;
		}
		if ( fl == null)
		{
			fl = fact.createLineExtended (line, account, C_Currency_ID, amountDr, amountCr, pDateAcct, pDatedoc, pDatepay);	
			
			if (fl == null)
				return null;
			
			BigDecimal amountSourceCr = amountCr;
			BigDecimal amountSourceDr = amountDr;
			
			if (fl.getC_Currency_ID() != C_Currency_ID)
			{
				if (amountSourceDr != null)
				{
					if (pDatepay != null)
					{
						amountSourceDr = MConversionRate.convert (getCtx(),
							C_DocType_ID, amountSourceDr, C_Currency_ID, fl.getC_Currency_ID(),
							pDatedoc, pDatepay, C_ConversionType_ID, AD_Client_ID, AD_Org_ID, false);
					}
					else
					{
						amountSourceDr = MConversionRate.convert (getCtx(), amountSourceDr, C_Currency_ID, fl.getC_Currency_ID(),
								pDatedoc, C_ConversionType_ID, AD_Client_ID, AD_Org_ID);						
					}
				}
				if (amountSourceCr != null)
				{
					if (pDatepay != null)
					{
						amountSourceCr = MConversionRate.convert (getCtx(),
							C_DocType_ID, amountSourceCr,  C_Currency_ID, fl.getC_Currency_ID(),
							pDatedoc, pDatepay, C_ConversionType_ID, AD_Client_ID, AD_Org_ID, false);
					}
					else
					{
						amountSourceCr = MConversionRate.convert (getCtx(), amountSourceCr,  C_Currency_ID, fl.getC_Currency_ID(),
								pDatedoc, C_ConversionType_ID, AD_Client_ID, AD_Org_ID);						
					}
				}
			}

			if (C_Currency_ID != as.getC_Currency_ID())
			{
				if (C_ConversionType_ID == 0)
				{
					p_Error = " error en cuenta "+account+" el Tipo de moneda es 0";
					return null;
				}
				if (pDatedoc == null)
				{
					pDatedoc = getDateDoc();
					if (pDatedoc == null)
					{
						p_Error = " error en cuenta "+account+" la fecha es nula";
						return null;
					}
				}

				if (amountSourceDr != null)
				{
					if (pDatepay != null)
					{
						System.out.println(String.format("amountSourceDr Conversion->From %s To %s Date %s PayDate %s ConversionType %s",C_Currency_ID, as.getC_Currency_ID(), pDatedoc, pDatepay, C_ConversionType_ID));
						amountSourceDr = MConversionRate.convert (getCtx(),
								C_DocType_ID, amountSourceDr, C_Currency_ID, as.getC_Currency_ID(),
								pDatedoc, pDatepay, C_ConversionType_ID, AD_Client_ID, AD_Org_ID, false);
					}
					else
					{
//						BigDecimal retValue = MConversionRate.getRate (boe.getC_DocType_ID(), getC_Currency_ID(), schema.getC_Currency_ID(), 
//								dateboe, dateboe, boe.getC_ConversionType_ID(),
//								boe.getAD_Client_ID(), boe.getAD_Org_ID());
						System.out.println(String.format("amountSourceDr Conversion->From %s To %s Date %s ConversionType %s",C_Currency_ID, as.getC_Currency_ID(), pDatedoc, C_ConversionType_ID));
						amountSourceDr = MConversionRate.convert (getCtx(), amountSourceDr, C_Currency_ID, as.getC_Currency_ID(),
								pDatedoc, C_ConversionType_ID, AD_Client_ID, AD_Org_ID);						
					}
				}
				if (amountSourceCr != null)
				{
					if (pDatepay != null)
					{
						System.out.println(String.format("amountSourceCr Conversion->From %s To %s Date %s PayDate %s ConversionType %s",C_Currency_ID, as.getC_Currency_ID(), pDatedoc, pDatepay, C_ConversionType_ID));
						amountSourceCr = MConversionRate.convert (getCtx(),
							C_DocType_ID, amountSourceCr,  C_Currency_ID, as.getC_Currency_ID(),
							pDatedoc, pDatepay, C_ConversionType_ID, AD_Client_ID, AD_Org_ID, false);					
					}
					else
					{
						System.out.println(String.format("amountSourceCr Conversion->From %s To %s Date %s ConversionType %s",C_Currency_ID, as.getC_Currency_ID(), pDatedoc, C_ConversionType_ID));						
						amountSourceCr = MConversionRate.convert (getCtx(), amountSourceCr,  C_Currency_ID, as.getC_Currency_ID(),
								pDatedoc, C_ConversionType_ID, AD_Client_ID, AD_Org_ID);						
					}
				}
			}
			
			fl.setAmtAcctCr(amountSourceCr);
			fl.setAmtAcctDr(amountSourceDr);
//			StackTraceElement[] tes  = Thread.currentThread().getStackTrace();
//			for (int i = 0; i < tes.length; i++)
//			{
//				StackTraceElement element = tes[i];				
//				String s = element.toString();
//				if (s.indexOf("compiere") != -1)
//					System.out.println(s);
//			}								
			System.out.print(account.getAccount().getValue()+"-"+account.getAccount().getName()+" monto : cr:"+amountSourceCr+" dr:"+amountSourceDr);
			if (fl != null )
			{
				fl.setAD_Org_ID(AD_Org_ID);
				fl.setC_BPartner_ID(C_BPartner_ID);
				if (doc != null)
					fl.setInvoiceDocumentNo(doc);
			}
		}
		else
		{
			fl.setDocLine(line);		
			
			BigDecimal AmtSourceDr = fl.getAmtSourceDr();
			BigDecimal AmtSourceCr = fl.getAmtSourceCr(); 
			BigDecimal amountSourceCr = amountCr;
			BigDecimal amountSourceDr = amountDr;

			if (fl.getC_Currency_ID() != C_Currency_ID)
			{
				if (amountSourceDr != null)
				{
					if (pDatepay != null)
					{
						amountSourceDr = MConversionRate.convert (getCtx(),
							C_DocType_ID, amountSourceDr, C_Currency_ID, fl.getC_Currency_ID(),
							pDatedoc, pDatepay,  C_ConversionType_ID, AD_Client_ID, AD_Org_ID, false);
					}
					else
					{
						amountSourceDr = MConversionRate.convert (getCtx(), amountSourceDr, C_Currency_ID, fl.getC_Currency_ID(),
								pDatedoc, C_ConversionType_ID, AD_Client_ID, AD_Org_ID);						
					}
				}
				if (amountSourceCr != null)
				{
					if (pDatepay != null)
					{
						amountSourceCr = MConversionRate.convert (getCtx(),
							C_DocType_ID, amountSourceCr,  C_Currency_ID, fl.getC_Currency_ID(),
							pDatedoc, pDatepay, C_ConversionType_ID, AD_Client_ID, AD_Org_ID, false);
					}
					else
					{
						amountSourceCr = MConversionRate.convert (getCtx(), amountSourceCr,  C_Currency_ID, fl.getC_Currency_ID(),
								pDatedoc, C_ConversionType_ID, AD_Client_ID, AD_Org_ID);						
					}
				}
			}
			if (amountSourceCr != null && amountSourceDr != null)
				return null; // no puede haber 2 montos a la vez. nica pes

			if (amountSourceCr == null && amountSourceDr == null)
				return null; // no puede estar nulos los 2 a la vez. nica pes
			
			if (amountSourceDr != null && amountSourceDr.compareTo(Env.ZERO) < 0)
			{
				amountSourceCr = amountSourceDr.abs();
				amountSourceDr = null;
			}
			if (amountSourceCr != null && amountSourceCr.compareTo(Env.ZERO) < 0)
			{
				amountSourceDr = amountSourceCr.abs();
				amountSourceCr = null; 
			}
			
			if ( ( AmtSourceDr != null && AmtSourceDr.compareTo(Env.ZERO) > 0 && (amountSourceCr != null && amountSourceCr.compareTo(Env.ZERO) > 0 )) || 
				 ( AmtSourceCr != null && AmtSourceCr.compareTo(Env.ZERO) > 0 && (amountSourceDr != null && amountSourceDr.compareTo(Env.ZERO) > 0 ))
			   )
			{
				if (amountSourceDr != null)
				{
					if ( AmtSourceCr.subtract(amountSourceDr).compareTo(Env.ZERO) > 0)
						AmtSourceCr = AmtSourceCr.subtract(amountSourceDr);
					else
					{	
						amountSourceDr = amountSourceDr.subtract(AmtSourceCr);
						AmtSourceDr = AmtSourceDr.add(amountSourceDr);
						AmtSourceCr = Env.ZERO;
					}					
				}
				if (amountSourceCr != null) 
				{
					if ( AmtSourceDr.subtract(amountSourceCr).compareTo(Env.ZERO) > 0)
						AmtSourceDr = AmtSourceDr.subtract(amountSourceCr);
					else
					{
						amountSourceCr = amountSourceCr.subtract(AmtSourceDr);
						AmtSourceCr = AmtSourceCr.add(amountSourceCr);
						AmtSourceDr = Env.ZERO;
					}				
				}		
			}	
			else
			{
				if (amountSourceDr != null)
					AmtSourceDr = AmtSourceDr.add(amountSourceDr);
				if (amountSourceCr != null)
					AmtSourceCr = AmtSourceCr.add(amountSourceCr);
			}
			fl.setAmtSourceCr(AmtSourceCr);
			fl.setAmtSourceDr(AmtSourceDr);
			// ---- <eof> origen
			//
			BigDecimal AmtAcctDr = fl.getAmtAcctDr();
			BigDecimal AmtAcctCr = fl.getAmtAcctCr(); 
			
			if (as.getC_Currency_ID() != C_Currency_ID)
			{
				if (amountDr != null)
				{
					if (pDatepay != null)
					{
						amountDr = MConversionRate.convert (getCtx(),
							C_DocType_ID, amountDr, C_Currency_ID, as.getC_Currency_ID(),
							pDatedoc, pDatepay, C_ConversionType_ID, AD_Client_ID, AD_Org_ID, false);
					}
					else
					{
						amountDr = MConversionRate.convert (getCtx(), amountDr, C_Currency_ID, as.getC_Currency_ID(),
								pDatedoc, C_ConversionType_ID, AD_Client_ID, AD_Org_ID);						
					}
				}
				if (amountCr != null)
				{
					if (pDatepay != null)
					{
						amountCr = MConversionRate.convert (getCtx(),
							C_DocType_ID, amountCr,  C_Currency_ID, as.getC_Currency_ID(),
							pDatedoc, pDatepay, C_ConversionType_ID, AD_Client_ID, AD_Org_ID, false);
					}
					else
					{
						amountCr = MConversionRate.convert (getCtx(), amountCr,  C_Currency_ID, as.getC_Currency_ID(),
								pDatedoc, C_ConversionType_ID, AD_Client_ID, AD_Org_ID);						
					}
				}
			}
			if (amountCr != null && amountDr != null)
				return null; // no puede haber 2 montos a la vez. nica pes

			if (amountCr == null && amountDr == null)
				return null; // no puede estar nulos los 2 a la vez. nica pes
			
			if (amountDr != null && amountDr.compareTo(Env.ZERO) < 0)
			{
				amountCr = amountDr.abs();
				amountDr = null;
			}
			if (amountCr != null && amountCr.compareTo(Env.ZERO) < 0)
			{
				amountDr = amountCr.abs();
				amountCr = null; 
			}
			
			if ( ( AmtAcctDr != null && AmtAcctDr.compareTo(Env.ZERO) > 0 && (amountCr != null && amountCr.compareTo(Env.ZERO) > 0 )) || 
				 ( AmtAcctCr != null && AmtAcctCr.compareTo(Env.ZERO) > 0 && (amountDr != null && amountDr.compareTo(Env.ZERO) > 0 ))
			   )
			{
				if (amountDr != null)
				{
					if ( AmtAcctCr.subtract(amountDr).compareTo(Env.ZERO) > 0)
						AmtAcctCr = AmtAcctCr.subtract(amountDr);
					else
					{	
						amountDr = amountDr.subtract(AmtAcctCr);
						AmtAcctDr = AmtAcctDr.add(amountDr);
						AmtAcctCr = Env.ZERO;
					}					
				}
				if (amountCr != null) 
				{
					if ( AmtAcctDr.subtract(amountCr).compareTo(Env.ZERO) > 0)
						AmtAcctDr = AmtAcctDr.subtract(amountCr);
					else
					{
						amountCr = amountCr.subtract(AmtAcctDr);
						AmtAcctCr = AmtAcctCr.add(amountCr);
						AmtAcctDr = Env.ZERO;
					}				
				}		
			}	
			else
			{
				if (amountDr != null)
					AmtAcctDr = AmtAcctDr.add(amountDr);
				if (amountCr != null)
					AmtAcctCr = AmtAcctCr.add(amountCr);
			}
			fl.setAmtAcctCr(AmtAcctCr);
			fl.setAmtAcctDr(AmtAcctDr);
			System.out.print(account.getAccount().getValue()+"-"+account.getAccount().getName()+" monto : cr:"+amountSourceCr+" dr:"+amountSourceDr);
						
		}
		if (fl != null)
		{
			MElementValue ev = account.getAccount();
			if ( C_DocType_ID > 0 )
			{
				if (ev.isDocTypeAccount())
				{
					fl.setC_DocType_ID(C_DocType_ID);
				}
			}
			System.out.println(" "+fl.getInvoiceDocumentNo());
		}
		return fl;
	}	
}   //  Doc
