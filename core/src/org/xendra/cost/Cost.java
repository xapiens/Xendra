package org.xendra.cost;

import java.lang.reflect.Constructor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;

import org.compiere.model.MClient;
import org.compiere.model.MDocType;
import org.compiere.model.MInOut;
import org.compiere.model.MInventory;
import org.compiere.model.MMovement;
import org.compiere.model.MPeriod;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.model.persistence.X_M_AttributeSetInstance;
import org.compiere.model.persistence.X_M_InOut;
import org.compiere.model.persistence.X_M_Inventory;
import org.compiere.model.persistence.X_M_Movement;
import org.compiere.model.persistence.X_M_Production;
import org.compiere.model.persistence.X_M_Storage;
import org.compiere.model.persistence.X_M_Transaction;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;
import org.compiere.process.DocumentEngine;
import org.compiere.util.CLogger;
import org.compiere.util.CPreparedStatement;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Trx;

public abstract class Cost {	
	/**	Static Log						*/
	protected static CLogger	s_log = CLogger.getCLogger(Cost.class);
	/**	Log	per Document				*/
	protected CLogger			log = CLogger.getCLogger(getClass());
	/* If the transaction must be managed locally (false if it's managed externally by the caller) */ 
	private boolean m_manageLocalTrx;	
	/** Document Status      			*/
	private String				m_DocStatus = null;
	/** Document No      			*/
	private String				m_DocumentNo = null;
	/** Transaction Name			*/
	private String				m_trxName = null;	
	/** The Document				*/
	protected PO				p_po = null;

	//private MClient 			m_client = null;
	private int 				m_AD_Client_ID = 0; 		
	/** Error Message			*/
	protected String			p_Error = null;
	/** GL Period					*/
	private MPeriod 			m_period = null;
	/**	Actual Document Status  */
	protected String			p_Status = null;
	/** Properties					*/
	private Properties			m_ctx = null;
	/**	Contained Doc Lines			*/
	protected X_M_Transaction[]	p_lines;
	/** Document Type      			*/
	private String				m_DocumentType = null;
	/** Period ID					*/
	private int					m_C_Period_ID = 0;
	/** Accounting Date				*/
	private Timestamp			m_DateAcct = null;
	private List<X_M_Transaction> m_fact = null;
	private Hashtable products = new Hashtable();
	protected List<Vector> startpoints = new ArrayList<Vector>();
	//private String tt;
	protected MDocType m_DocType; 
	//private boolean m_recalculate = false;
			
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
	
	/** AD_Table_ID's of documents          */
	public static int[]  documentsTableID = new int[] {
		MInOut.Table_ID,			 //  M_InOut
		MInventory.Table_ID,	     //  M_Inventory
		MMovement.Table_ID,		     //  M_Movement
		X_M_Production.Table_ID,     //  M_Production		
		X_C_Invoice.Table_ID		 //  C_Invoice
	};
	/** Table Names of documents          */
	public static String[]  documentsTableName = new String[] {
		MInOut.Table_Name,			   //  M_InOut
		MInventory.Table_Name,	       //  M_Inventory
		MMovement.Table_Name,	       //  M_Movement
		X_M_Production.Table_Name,	   //  M_Production
		X_C_Invoice.Table_Name
	};	
	
	public static String[] documentsDate = new String[] {
		X_M_InOut.COLUMNNAME_MovementDate, 				// M_InOut
		X_M_Inventory.COLUMNNAME_MovementDate,
		X_M_Movement.COLUMNNAME_MovementDate,
		X_M_Production.COLUMNNAME_MovementDate,
		X_C_Invoice.COLUMNNAME_DateAcct
	};
	
	public static String[] documentbasetype = new String[] {
		"",
		"",
		"",
		REF_C_DocTypeDocBaseType.APCreditMemoDiscount
	};
	
	String getTransactionType()
	{
		String trxtype = "";
		if (m_DocType != null)
			trxtype = m_DocType.getTransactionType();
		return trxtype;
	}
	Cost (Integer AD_Client_ID, MPeriod period, Class clazz, ResultSet rs, String defaultDocumentType, String trxName)
	{
		p_Status = STATUS_Error;
		//m_client = client;
		m_AD_Client_ID = AD_Client_ID;
		//m_ass = ass;
		m_period = period;
		m_ctx = new Properties();
		//m_ctx.setProperty("#AD_Client_ID", String.valueOf(m_client.getAD_Client_ID()));
		m_ctx.setProperty("#AD_Client_ID", String.valueOf(m_AD_Client_ID));
//		tt = "";
//		try {
//			tt = rs.getString(X_M_Transaction.COLUMNNAME_TransactionType);
//		}
//		catch (Exception e)
//		{
//			e.printStackTrace();
//		}
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
		int indexdt = p_po.get_ColumnIndex(X_C_DocType.COLUMNNAME_C_DocType_ID);
		if (indexdt != -1)
			m_DocType = MDocType.get(Env.getCtx(), (Integer) p_po.get_Value(indexdt));
		//	DocStatus
		int index = p_po.get_ColumnIndex("DocStatus");
		if (index != -1)
			m_DocStatus = (String)p_po.get_Value(index);
		
		//	Document Type		
		m_trxName = trxName;
		m_manageLocalTrx = false;
		if (m_trxName == null)
		{
			m_trxName = "Post" + m_DocumentType + p_po.get_ID();
			m_manageLocalTrx = true;
		}
		p_po.set_TrxName(m_trxName);

	}
	
	/**
	 *  Create Posting document
	 *	@param ass accounting schema
	 *  @param AD_Table_ID Table ID of Documents
	 *  @param Record_ID record ID to load
	 *  @param trxName transaction name
	 *  @return Document or null
	 */
	public static Cost get (int AD_Client_ID, MPeriod period, int AD_Table_ID, int Record_ID, String trxName)
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
		Cost doc = null;
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
				doc = get (AD_Client_ID, period, AD_Table_ID, rs, trxName);
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
	
	//public static Cost get (MClient client, MPeriod period, int AD_Table_ID, ResultSet rs, String trxName)
	public static Cost get (int AD_Client_ID, MPeriod period, int AD_Table_ID, ResultSet rs, String trxName)
	{
		Cost doc = null;
		 if (AD_Table_ID == MInOut.Table_ID)
			//doc = new Cost_InOut (client, period, rs, trxName);
			 doc = new Cost_InOut (AD_Client_ID, period, rs, trxName);
		else if (AD_Table_ID == MInventory.Table_ID)
			doc = new Cost_Inventory (AD_Client_ID, period, rs,  trxName);
		else if (AD_Table_ID == MMovement.Table_ID)
			doc = new Cost_Movement (AD_Client_ID, period, rs, trxName);
		else if (AD_Table_ID == X_M_Production.Table_ID)
			doc = new Cost_Production (AD_Client_ID, period, rs, trxName);
		else if (AD_Table_ID == X_C_Invoice.Table_ID)
			doc = new Cost_Invoice(AD_Client_ID, period, rs, trxName);
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
	public static String postImmediate (int AD_Client_ID, MPeriod period, int AD_Table_ID, int Record_ID, boolean force, String trxName)
	{
		Cost doc = get (AD_Client_ID, period, AD_Table_ID, Record_ID, trxName);
		if (doc != null)
			return doc.post (force, false);	//	repost
		return "NoLineDocFound";
	}   //  post	
	
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
			;	//	return "No DocStatus for DocumentNo=" + getDocumentNo();
		else if (m_DocStatus.equals(DocumentEngine.STATUS_Completed) 
			|| m_DocStatus.equals(DocumentEngine.STATUS_Closed)
			|| m_DocStatus.equals(DocumentEngine.STATUS_Voided)
			|| m_DocStatus.equals(DocumentEngine.STATUS_Reversed))
			;
		else
			return "Invalid DocStatus='" + m_DocStatus + "' for DocumentNo=" + getDocumentNo();
		//
		//if (p_po.getAD_Client_ID() != m_client.getAD_Client_ID())
		if (p_po.getAD_Client_ID() != m_AD_Client_ID)
		{
			String error = "AD_Client_ID Conflict - Document=" + p_po.getAD_Client_ID()
				+ ", AcctSchema=" + m_AD_Client_ID;
				//+ ", AcctSchema=" + m_client.getAD_Client_ID();
			log.severe(error);
			return error;
		}
		//  Lock Record ----
		String trxName = null;	//	outside trx if on server
		if (!m_manageLocalTrx)
			trxName = getTrxName(); // on trx if it's in client
						
//		StringBuffer sql = new StringBuffer ("UPDATE ").append(get_TableName());		
//		sql.append( " SET Processing='Y'");
//		sql.append( " WHERE ")
//			.append(get_TableName()).append("_ID=").append(get_ID())
//			.append(" AND Processed='Y' AND IsActive='Y'");
//		if (!force)
//			sql.append(" AND (Processing='N' OR Processing IS NULL)");
//		if (!repost)
//			sql.append(" AND Posted='N'");
//		
		Trx trx = Trx.get(getTrxName(), true);
//		
//		if (DB.executeUpdate(sql.toString(), trxName) == 1)
//		{
//			log.info("Locked: " + get_TableName() + "_ID=" + get_ID());
//			trx.commit();
//		}	
//		else
//		{
//			log.log(Level.SEVERE, "Resubmit - Cannot lock " + get_TableName() + "_ID=" 
//				+ get_ID() + ", Force=" + force + ",RePost=" + repost);
//			trx.rollback();
//			trx.close();
//			if (force)
//				return "Cannot Lock - ReSubmit";
//			return "Cannot Lock - ReSubmit or RePost with Force";
//		}				
		
//		if (m_DocStatus.equals(DocumentEngine.STATUS_Voided)) {
//			log.log(Level.FINE, toString() + " - Deleting facts from voided document, aborting also.");
//			deleteAcct();
//			p_Status = STATUS_Posted;
//			save(getTrxName());			
//			//unlock();			
//			return null;
//		}

		p_Error = loadDocumentDetails();
		if (p_Error != null)
		{
			if (trx != null)
				trx.close();
			return p_Error;
		}

		//  Delete existing Accounting
//		if (repost)
//		{
//			//	delete it
//			deleteAcct();
//		}
		if (isCosted())
		{
			log.log(Level.SEVERE, toString() + " - Document already posted");
			//unlock();
			trx.commit(); trx.close();
			return "AlreadyPosted";
		}
		
		p_Status = STATUS_NotPosted;

		//  Create Fact per AcctSchema
		m_fact = new ArrayList<X_M_Transaction>();

		//  for all Accounting Schema
		boolean OK = true;
		//getPO().setDoc(this);
		try
		{
			p_Status = postLogic ();
			if (!p_Status.equals(STATUS_Posted))
				OK = false;
			
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, "", e);
			p_Status = STATUS_Error;
			p_Error = e.toString();
			OK = false;
		}
		//  commitFact
		p_Status = postCommit (p_Status);

		//  Create Note
		if (!p_Status.equals(STATUS_Posted))
		{
		}

		//  dispose facts
//		for (int i = 0; i < m_fact.size(); i++)
//		{
//			X_M_Transaction fact = m_fact.get(i);
//			if (fact != null)
//				fact.dispose();
//		}
		m_fact = null;
		p_lines = null;

		if (p_Status.equals(STATUS_Posted))
			return null;
		return p_Error;
	}   //  post
	
//	/**
//	 * 	Delete Accounting
//	 *	@return number of records
//	 */
//	public int deleteAcct() {
//		StringBuffer sql = new StringBuffer ("SELECT COUNT(*) FROM M_Transaction WHERE AD_Table_ID=")
//		.append(get_Table_ID())
//		.append(" AND Record_ID=").append(p_po.get_ID());
//		int no = DB.getSQLValue(getTrxName(),sql.toString());
//		if (no != 0)
//		{
//			List<X_M_Transaction> transactions = new Query(Env.getCtx(), X_M_Transaction.Table_Name, "AD_Table_ID = ? AND Record_ID = ?", null)
//			.setParameters(get_Table_ID(), p_po.get_ID()).list();
//			for (X_M_Transaction transaction:transactions)
//			{
//				int M_Product_ID = transaction.getM_Product_ID();
//				if (!products.containsKey(M_Product_ID))
//				{
//					HashMap map = new HashMap();
//					map.put(X_M_Storage.COLUMNNAME_DateLastRun, transaction.getMovementDate());
//					map.put(X_M_AttributeSetInstance.COLUMNNAME_M_AttributeSetInstance_ID, transaction.getM_AttributeSetInstance_ID());
//					products.put(M_Product_ID, map);
//				}
//			}
//			sql = new StringBuffer ("DELETE FROM M_Transaction WHERE AD_Table_ID=")
//			.append(get_Table_ID())
//			.append(" AND Record_ID=").append(p_po.get_ID());			
//			no = DB.executeUpdate(sql.toString(), getTrxName());
//			if (no != 0)
//			{
//				log.info("deleted=" + no);
//				// al borrarse registros se debe recalcular stock y si es ingreso costo
//				//m_recalculate  = true;
//			}			
//		}		
//		return no;
//	}	
	
	/**
	 *  Post Commit.
	 *  Save Facts & Document
	 *  @param status status
	 *  @return Posting Status
	 */
	private final String postCommit (String status)
	{
		log.info("Sta=" + status + " ID=" +  p_po.get_ID());
		p_Status = status;

		Trx trx = Trx.get(getTrxName(), true);
		try
		{
		//  *** Transaction Start       ***
			//  Commit Facts
			if (status.equals(STATUS_Posted))
			{
//				for (int i = 0; i < m_fact.size(); i++)
//				{
//					X_M_Transaction fact = m_fact.get(i);
//					if (fact == null)
//						continue;
////					synchronized(Cost.class) {
////						if (fact.save(getTrxName()))
////						{
////							int M_Product_ID = fact.getM_Product_ID();
////						}
////						else
////						{
////							log.log(Level.SEVERE, "(fact not saved) ... rolling back");
////							if (m_manageLocalTrx) {
////								trx.rollback();								
////							}
////							//unlock();
////							trx.commit();
////							trx.close();
////							return STATUS_Error;
////						}
////					}
//				}
			}
			//  Commit Doc
			if (!save(getTrxName()))     //  contains unlock & document status update
			{
				log.log(Level.SEVERE, "(doc not saved) ... rolling back");
				if (m_manageLocalTrx) {
					trx.rollback();					
				}
				//unlock();
				trx.commit();
				trx.close();
				return STATUS_Error;
			}
			//	Success
			if (m_manageLocalTrx) {
				trx.commit(true);
				trx.close();
			}
			trx = null;
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
			}
			//unlock();			
			trx.commit();
			trx.close();
			trx = null;			
		}
		p_Status = status;
		return status;
	}   //  postCommit

	public Hashtable getProducts()
	{
		return products;
	}

//	public Hashtable getInputCosts()
//	{
//		return inputcost;
//	}
	

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
	
	/**************************************************************************
	 *  Save to Disk - set posted flag
	 *  @param trxName transaction name
	 *  @return true if saved
	 */
	private final boolean save (String trxName)
	{
		log.fine(toString() + "->" + p_Status);

		StringBuffer sql = new StringBuffer("UPDATE ");
		sql.append(get_TableName()).append(" SET IsCosted='").append(p_Status).append("'");
			//.append("',Processing='N' ");
		sql.append(" WHERE ")
			.append(get_TableName()).append("_ID=?");
		try {
			CPreparedStatement cstmt = DB.prepareStatement(sql.toString(), ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE, trxName);
			cstmt.setInt(1, p_po.get_ID());
			int no = cstmt.executeUpdate();
			return no == 1;
		}
		catch (SQLException e) {
			return false;
		}
	}   //  save

	/**
	 *  Posting logic for Accounting Schema index
	 *  @param  index   Accounting Schema index
	 *  @return posting status/error code
	 */
	private final String postLogic ()
	{
		//log.info("(" + index + ") " + p_po);
		log.info(p_po.toString());
		
		//  rejectPeriodClosed
///		if (!isPeriodOpen())
//			return STATUS_PeriodClosed;

		//  createFacts
		X_M_Transaction[] facts = createFacts();
		if (facts == null)
			return STATUS_Error;
		for (X_M_Transaction transaction:facts)
		{
			m_fact.add(transaction);
		}
		return STATUS_Posted;
	}   //  postLogic

	public abstract X_M_Transaction[] createFacts ();

	
	/**
	 * 	Get Context
	 *	@return context
	 */
	protected Properties getCtx()
	{
		return m_ctx;
	}	//	getCtx

	/**
	 * 	Get Persistent Object
	 *	@return po
	 */
	protected PO getPO()
	{
		return p_po;
	}	//	getPO

//	/**
//	 *	Is Period Open
//	 *  @return true if period is open
//	 */
//	public boolean isPeriodOpen()
//	{
//		setPeriod();
//		boolean open = m_C_Period_ID > 0;
//		if (open)
//			log.fine("Yes - " + toString());
//		else
//			log.warning("NO - " + toString());
//		return open;
//	}	//	isPeriodOpen
//
//	/**
//	 *  Calculate Period from DateAcct.
//	 *  m_C_Period_ID is set to -1 of not open to 0 if not found
//	 */
//	public void setPeriod()
//	{
//		if (m_period != null)
//			return;
//		
//		//	Period defined in GL Journal (e.g. adjustment period)
//		int index = p_po.get_ColumnIndex("C_Period_ID");
//		if (index != -1)
//		{
//			Integer ii = (Integer)p_po.get_Value(index);
//			if (ii != null)
//				m_period = MPeriod.get(getCtx(), ii.intValue());
//		}
//		if (m_period == null)
//			//m_period = MPeriod.get(getCtx(), getDateAcct());
//		    m_period = MPeriod.get(getCtx(), getDateAcct(), getAD_Org_ID(), getAD_Client_ID());
//		//	Is Period Open?
//		if (m_period != null 
//			&& m_period.isOpen(getDocumentType(), getDateAcct()))
//			m_C_Period_ID = m_period.getC_Period_ID();
//		else
//			m_C_Period_ID = -1;
//		//
//		log.fine(	// + AD_Client_ID + " - " 
//			getDateAcct() + " - " + " => " + m_C_Period_ID);
//	}   //  setC_Period_ID

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
	 * 	Is Document Posted
	 *	@return true if posted
	 */
	public boolean isCosted()
	{
		int index = p_po.get_ColumnIndex("IsCosted");
		if (index != -1)
		{
			Object costed = p_po.get_Value(index);
			if (costed == null)
				costed = false;
			
			if (costed instanceof Boolean)
				return ((Boolean)costed).booleanValue();
			if (costed instanceof String)
				return "Y".equals(costed);
		}
		throw new IllegalStateException("No Costed");
	}	//	isPosted

	/**
	 *  Load Document Details
	 *  @return error message or null
	 */
	protected abstract String loadDocumentDetails ();
//	/**
//	 *  Unlock Document
//	 */
//	private void unlock()
//	{
//		String trxName = null;	//	outside trx if on server
//		if (! m_manageLocalTrx)
//			trxName = getTrxName(); // on trx if it's in client		
//		StringBuffer sql = new StringBuffer ("UPDATE ");
//		sql.append(get_TableName()).append( " SET Processing='N' WHERE ")
//			.append(get_TableName()).append("_ID=").append(p_po.get_ID());
//		DB.executeUpdate(sql.toString(), trxName);
//	}   //  unlock

	/**
	 * 	Get Record_ID
	 *	@return record id
	 */
	public int get_ID()
	{
		return p_po.get_ID();
	}	//	get_ID

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
	 * 	Get Trx Name and create Transaction
	 *	@return Trx Name
	 */
	public String getTrxName()
	{
		return m_trxName;
	}	//	getTrxName

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
	
//	public MCostProcessor getModel()
//	{
//		return m_model;
//	}
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

	public MPeriod getPeriod()
	{
		return m_period;
	}
	public List<Vector> getstartpoints()
	{
		return startpoints;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
