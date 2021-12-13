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

import org.compiere.model.persistence.X_AD_MessageFormat;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.model.persistence.X_M_Inventory;
import org.compiere.model.persistence.X_M_StockTaking;
import org.compiere.model.persistence.X_M_StockTakingLine;
import org.compiere.model.reference.REF__DocumentAction;
import org.compiere.model.reference.REF_C_DocTypeDocBaseType;
import org.compiere.model.reference.REF__DocumentStatus;
import org.compiere.model.reference.REF_M_TransactionMovementType;
import org.compiere.model.reference.REF__MMPolicy;
import org.compiere.process.*;
import org.compiere.util.*;
import org.kie.api.KieBase;
import org.kie.api.runtime.KieSession;
import org.xendra.messages.MessageQ;
import org.xendra.rules.CustomAgendaEventListener;
import org.xendra.rules.CustomWorkingMemoryEventListener;

/**
 *  Physical Inventory Model
 *
 *  @author Jorg Janke
 *  @version $Id: MInventory.java 5822 2016-06-15 22:56:06Z xapiens $
 */
public class MInventory extends X_M_Inventory implements DocAction
{
	/**
	 * 	Get Inventory from Cache
	 *	@param ctx context
	 *	@param M_Inventory_ID id
	 *	@return MInventory
	 */
	public static MInventory get (Properties ctx, int M_Inventory_ID)
	{
		Integer key = new Integer (M_Inventory_ID);
		MInventory retValue = (MInventory) s_cache.get (key);
		if (retValue != null)
			return retValue;
		retValue = new MInventory (ctx, M_Inventory_ID, null);
		if (retValue.get_ID () != 0)
			s_cache.put (key, retValue);
		return retValue;
	} //	get

	/**	Cache						*/
	private static CCache<Integer,MInventory> s_cache = new CCache<Integer,MInventory>("M_Inventory", 5, 5);


	/**
	 * 	Standard Constructor
	 *	@param ctx context 
	 *	@param M_Inventory_ID id
	 *	@param trxName transaction
	 */
	public MInventory (Properties ctx, int M_Inventory_ID, String trxName)
	{
		super (ctx, M_Inventory_ID, trxName);
		if (M_Inventory_ID == 0)
		{
			//	setName (null);
			//  setM_Warehouse_ID (0);		//	FK
			setMovementDate (new Timestamp(System.currentTimeMillis()));
			setDocAction (REF__DocumentAction.Complete);	// CO
			setDocStatus (REF__DocumentStatus.Drafted);	// DR
			setIsApproved (false);
			setMovementDate (new Timestamp(System.currentTimeMillis()));	// @#Date@
			setPosted (false);
			setProcessed (false);
		}
	}	//	MInventory

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MInventory (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MInventory

	/**
	 * 	Warehouse Constructor
	 *	@param wh warehouse
	 */
	public MInventory (MWarehouse wh)
	{
		this (wh.getCtx(), 0, wh.get_TrxName());
		setClientOrg(wh);
		setM_Warehouse_ID(wh.getM_Warehouse_ID());
	}	//	MInventory


	/**	Lines						*/
	private MInventoryLine[]	m_lines = null;

	/**
	 * 	Get Lines
	 *	@param requery requery
	 *	@return array of lines
	 */
	public MInventoryLine[] getLines (boolean requery)
	{
		if (m_lines != null && !requery)
			return m_lines;
		//
		ArrayList<MInventoryLine> list = new ArrayList<MInventoryLine>();
		String sql = "SELECT * FROM M_InventoryLine WHERE M_Inventory_ID=? ORDER BY Line";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, get_TrxName());
			pstmt.setInt (1, getM_Inventory_ID());
			ResultSet rs = pstmt.executeQuery ();
			while (rs.next ())
				list.add (new MInventoryLine (getCtx(), rs, get_TrxName()));
			rs.close ();
			pstmt.close ();
			pstmt = null;
		} catch (Exception e)
		{
			log.log(Level.SEVERE, sql, e);
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

		m_lines = new MInventoryLine[list.size ()];
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
	 * 	Overwrite Client/Org - from Import.
	 * 	@param AD_Client_ID client
	 * 	@param AD_Org_ID org
	 */
	public void setClientOrg (int AD_Client_ID, int AD_Org_ID)
	{
		super.setClientOrg(AD_Client_ID, AD_Org_ID);
	}	//	setClientOrg

	/**
	 * 	String Representation
	 *	@return info
	 */
	public String toString ()
	{
		StringBuffer sb = new StringBuffer ("MInventory[");
		sb.append (get_ID())
		.append ("-").append (getDocumentNo())
		.append (",M_Warehouse_ID=").append(getM_Warehouse_ID())
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
	 * 	Before Save
	 *	@param newRecord new
	 *	@return true
	 */
	protected boolean beforeSave (boolean newRecord)
	{
		if (getC_DocType_ID() == 0)
		{
			MDocType types[] = MDocType.getOfDocBaseType(getCtx(), REF_C_DocTypeDocBaseType.MaterialPhysicalInventory);
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
		String sql = "UPDATE M_InventoryLine SET Processed='"
				+ (processed ? "Y" : "N")
				+ "' WHERE M_Inventory_ID=" + getM_Inventory_ID();
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
	//private String MOVEMENTTYPE_InventoryIn = "I+";
	//private String MOVEMENTTYPE_InventoryOut = "I-";
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

		//	Std Period open?
		if (!MPeriod.isOpen(getCtx(), getMovementDate(), REF_C_DocTypeDocBaseType.MaterialPhysicalInventory, getAD_Org_ID(), getAD_Client_ID()))
		{
			m_processMsg = "@PeriodClosed@";
			return DocAction.STATUS_Invalid;
		}
		MInventoryLine[] lines = getLines(false);
		if (lines.length == 0)
		{
			m_processMsg = "@NoLines@";
			return DocAction.STATUS_Invalid;
		}

		//	TODO: Add up Amounts
		//	setApprovalAmt();

		m_processMsg = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_AFTER_PREPARE);
		if (m_processMsg != null)
			return DocAction.STATUS_Invalid;

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

		//	Implicit Approval
		if (!isApproved())
			approveIt();
		log.info(toString());

		MAcctSchema as = MClient.get(getCtx(), getAD_Client_ID()).getAcctSchema();
		Integer C_Period_ID = MPeriod.get(Env.getCtx(), this.getMovementDate(), getAD_Org_ID(), getAD_Client_ID()).getC_Period_ID();
		//vpj-cd begin e-evolution recalculate the attribute instances and qty.
		List<Integer> StockTaking = new ArrayList<Integer>();
		MInventoryLine[] lines = getLines(false);
		for (MInventoryLine line : lines)
		{
			if (!line.isActive())
				continue;

			X_M_StockTakingLine stl = new Query(Env.getCtx(), X_M_StockTakingLine.Table_Name, "M_InventoryLine_ID = ?", get_TrxName())
			.setParameters(line.getM_InventoryLine_ID()).first();

			if (stl != null)
			{
				if(!StockTaking.contains(stl.getM_StockTaking_ID()))
					StockTaking.add(stl.getM_StockTaking_ID());
			}

			MProduct product = line.getProduct();

			//Get Quantity to Inventory Inernal Use
			BigDecimal qtyDiff = line.getQtyInternalUse().negate();
			//If Quantity to Inventory Internal Use = Zero Then is Physical Inventory  Else is  Inventory Internal Use 
			if (qtyDiff.signum() == 0)
				qtyDiff = line.getQtyCount().subtract(line.getQtyBook());

			//Ignore the Material Policy when is Reverse Correction
			if(!isReversal())
				checkMaterialPolicy(line, qtyDiff);
			//	Stock Movement - Counterpart MOrder.reserveStock
			if (product != null && product.isStocked() )
			{
				log.fine("Material Transaction");
				if (line.getM_AttributeSetInstance_ID() == 0 || qtyDiff.compareTo(Env.ZERO) == 0)
				{
					MInventoryLineMA mas[] = MInventoryLineMA.get(getCtx(),
							line.getM_InventoryLine_ID(), get_TrxName());

					for (int j = 0; j < mas.length; j++)
					{
						MInventoryLineMA ma = mas[j];
						BigDecimal QtyMA = ma.getMovementQty();
						BigDecimal QtyNew = QtyMA.add(qtyDiff);
						log.fine("Diff=" + qtyDiff 
								+ " - Instance OnHand=" + QtyMA + "->" + QtyNew);

						String error = MStorage.add(getCtx(), getM_Warehouse_ID(),
								line.getM_Locator_ID(),
								line.getM_Product_ID(), 
								ma.getM_AttributeSetInstance_ID(), 0, 
								QtyMA.negate(), Env.ZERO, Env.ZERO, false,	
								C_Period_ID,
								"MInventory.completeIt()",
								get_TrxName());

						// Only Update Date Last Inventory if is a Physical Inventory
						if(line.getQtyInternalUse().compareTo(Env.ZERO) == 0)
						{	
							MStorage storage = MStorage.get(getCtx(), line.getM_Locator_ID(), 
									line.getM_Product_ID(), ma.getM_AttributeSetInstance_ID(), get_TrxName());						
							storage.setDateLastInventory(getMovementDate());
							if (!storage.save(get_TrxName()))
							{
								m_processMsg = "Storage not updated(2)";
								return DocAction.STATUS_Invalid;
							}
						}

						String m_MovementType =null;

						if(QtyMA.negate().compareTo(Env.ZERO) > 0 )
							m_MovementType = REF_M_TransactionMovementType.InventoryIn;
						else
							m_MovementType = REF_M_TransactionMovementType.InventoryOut;

						qtyDiff = QtyNew;						
					}	
				}

				else
				{
					//Fallback: Update Storage - see also VMatch.createMatchRecord
					String error = MStorage.add(getCtx(), getM_Warehouse_ID(),
							line.getM_Locator_ID(),
							line.getM_Product_ID(), 
							line.getM_AttributeSetInstance_ID(), 0, 
							qtyDiff, Env.ZERO, Env.ZERO, false,					
							C_Period_ID,
							"MInventory.completeIt()",
							get_TrxName());
					if(line.getQtyInternalUse().compareTo(Env.ZERO) == 0)
					{	
						MStorage storage = MStorage.get(getCtx(), line.getM_Locator_ID(), 
								line.getM_Product_ID(), line.getM_AttributeSetInstance_ID(), get_TrxName());						

						storage.setDateLastInventory(getMovementDate());
						if (!storage.save(get_TrxName()))
						{
							m_processMsg = "Storage not updated(2)";
							return DocAction.STATUS_Invalid;
						}
					}
					String m_MovementType = null;
					if(qtyDiff.compareTo(Env.ZERO) > 0 )
						m_MovementType = REF_M_TransactionMovementType.InventoryIn;
					else
						m_MovementType = REF_M_TransactionMovementType.InventoryOut;
				}	//	Fallback
			}	//	stock movement				
		}
		if (StockTaking.size() > 0)
		{
			for (Integer stocktaking:StockTaking)
			{
				X_M_StockTaking st = new X_M_StockTaking(Env.getCtx(), stocktaking, get_TrxName());
				st.setProcessed(true);
				st.save();
			}
		}                       
		//
		setProcessed(true);
		setIsCosted(false);
		//MStorage.CheckPeriod(C_Period_ID);
		setDocAction(REF__DocumentAction.Close);
		return DocAction.STATUS_Completed;
	}	//	completeIt


	/**
	 * 	Check Material Policy.
	 */
	private void checkMaterialPolicy(MInventoryLine line, BigDecimal qtyDiff)
	{
		int no = MInventoryLineMA.deleteInventoryLineMA(line.getM_InventoryLine_ID(), get_TrxName());
		if (no > 0)
			log.config("Delete old #" + no);

		//	Check Line
		boolean needSave = false;
		//	Attribute Set Instance
		if (line.getM_AttributeSetInstance_ID() == 0)
		{
			MProduct product = MProduct.get(getCtx(), line.getM_Product_ID(), get_TrxName());
			if (qtyDiff.signum() > 0)	//	Incoming Trx
			{
				MAttributeSetInstance asi = null;
				//auto balance negative on hand
				MStorage[] storages = MStorage.getWarehouse(getCtx(), getM_Warehouse_ID(), line.getM_Product_ID(), 0,
						null, REF__MMPolicy.FiFo.equals(product.getMMPolicy()), false, line.getM_Locator_ID(), get_TrxName());
				for (MStorage storage : storages)
				{
					if (storage.getQtyOnHand().signum() < 0)
					{
						asi = new MAttributeSetInstance(getCtx(), storage.getM_AttributeSetInstance_ID(), get_TrxName());
						break;
					}
				}
				if (asi == null)
				{
					asi = MAttributeSetInstance.create(getCtx(), product, get_TrxName());
				}
				line.setM_AttributeSetInstance_ID(asi.getM_AttributeSetInstance_ID());
				needSave = true;
			}
			else	//	Outgoing Trx
			{
				String MMPolicy = product.getMMPolicy();
				MStorage[] storages = MStorage.getWarehouse(getCtx(), getM_Warehouse_ID(), line.getM_Product_ID(), 0,
						null, REF__MMPolicy.FiFo.equals(MMPolicy), true, line.getM_Locator_ID(), get_TrxName());

				BigDecimal qtyToDeliver = qtyDiff.negate();

				for (MStorage storage: storages)
				{					
					if (storage.getQtyOnHand().compareTo(qtyToDeliver) >= 0)
					{
						MInventoryLineMA ma = new MInventoryLineMA (line, 
								storage.getM_AttributeSetInstance_ID(),
								qtyToDeliver);
						ma.saveEx();		
						qtyToDeliver = Env.ZERO;
						log.fine( ma + ", QtyToDeliver=" + qtyToDeliver);		
					}
					else
					{	
						MInventoryLineMA ma = new MInventoryLineMA (line, 
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
					MInventoryLineMA ma = new MInventoryLineMA (line, M_AttributeSetInstance_ID , qtyToDeliver);

					ma.saveEx();
					log.fine("##: " + ma);
				}
			}	//	outgoing Trx

			if (needSave)
			{
				line.saveEx();
			}
		}	//	for all lines

	}	//	checkMaterialPolicy

	//	/**
	//	 * 	Check Material Policy.
	//	 * 	(NOT USED)
	//	 * 	Sets line ASI
	//	 */
	//	private void checkMaterialPolicy()
	//	{
	//		int no = MInventoryLineMA.deleteInventoryMA(getM_Inventory_ID(), get_TrxName());
	//		if (no > 0)
	//			log.config("Delete old #" + no);
	//		MInventoryLine[] lines = getLines(false);
	//		
	//		//	Incoming Trx
	//		MClient client = MClient.get(getCtx());
	//		
	//		//	Check Lines
	//		for (int i = 0; i < lines.length; i++)
	//		{
	//			MInventoryLine line = lines[i];
	//			boolean needSave = false;
	//
	//			//	Attribute Set Instance
	//			if (line.getM_AttributeSetInstance_ID() == 0)
	//			{
	//				MProduct product = MProduct.get(getCtx(), line.getM_Product_ID());
	//				BigDecimal qtyDiff = line.getQtyInternalUse().negate();
	//				if (Env.ZERO.compareTo(qtyDiff) == 0)
	//					qtyDiff = line.getQtyCount().subtract(line.getQtyBook());
	//				log.fine("Count=" + line.getQtyCount()
	//					+ ",Book=" + line.getQtyBook() + ", Difference=" + qtyDiff); 
	//				if (qtyDiff.signum() > 0)	//	In
	//				{
	//					MAttributeSetInstance asi = new MAttributeSetInstance(getCtx(), 0, get_TrxName());
	//					asi.setClientOrg(getAD_Client_ID(), 0);
	//					asi.setM_AttributeSet_ID(product.getM_AttributeSet_ID());
	//					if (asi.save())
	//					{
	//						line.setM_AttributeSetInstance_ID(asi.getM_AttributeSetInstance_ID());
	//						needSave = true;
	//					}
	//				}
	//				else	//	Outgoing Trx
	//				{
	//					MProductCategory pc = MProductCategory.get(getCtx(), product.getM_Product_Category_ID());
	//					String MMPolicy = pc.getMMPolicy();
	//					if (MMPolicy == null || MMPolicy.length() == 0)
	//						MMPolicy = client.getMMPolicy();
	//					//
	//					MStorage[] storages = MStorage.getAllWithASI(getCtx(), 
	//						line.getM_Product_ID(),	line.getM_Locator_ID(), 
	//						REF__MMPolicy.FiFo.equals(MMPolicy), get_TrxName());
	//					BigDecimal qtyToDeliver = qtyDiff.negate();
	//					for (int ii = 0; ii < storages.length; ii++)
	//					{
	//						MStorage storage = storages[ii];
	//						if (ii == 0)
	//						{
	//							if (storage.getQtyOnHand().compareTo(qtyToDeliver) >= 0)
	//							{
	//								line.setM_AttributeSetInstance_ID(storage.getM_AttributeSetInstance_ID());
	//								needSave = true;
	//								log.config("Direct - " + line);
	//								qtyToDeliver = Env.ZERO;
	//							}
	//							else
	//							{
	//								log.config("Split - " + line);
	//								MInventoryLineMA ma = new MInventoryLineMA (line, 
	//									storage.getM_AttributeSetInstance_ID(),
	//									storage.getQtyOnHand().negate());
	//								if (!ma.save())
	//									;
	//								qtyToDeliver = qtyToDeliver.subtract(storage.getQtyOnHand());
	//								log.fine("#" + ii + ": " + ma + ", QtyToDeliver=" + qtyToDeliver);
	//							}
	//						}
	//						else	//	 create addl material allocation
	//						{
	//							MInventoryLineMA ma = new MInventoryLineMA (line, 
	//								storage.getM_AttributeSetInstance_ID(),
	//								qtyToDeliver.negate());
	//							if (storage.getQtyOnHand().compareTo(qtyToDeliver) >= 0)
	//								qtyToDeliver = Env.ZERO;
	//							else
	//							{
	//								ma.setMovementQty(storage.getQtyOnHand().negate());
	//								qtyToDeliver = qtyToDeliver.subtract(storage.getQtyOnHand());
	//							}
	//							if (!ma.save())
	//								;
	//							log.fine("#" + ii + ": " + ma + ", QtyToDeliver=" + qtyToDeliver);
	//						}
	//						if (qtyToDeliver.signum() == 0)
	//							break;
	//					}	//	 for all storages
	//					
	//					//	No AttributeSetInstance found for remainder
	//					if (qtyToDeliver.signum() != 0)
	//					{
	//						MInventoryLineMA ma = new MInventoryLineMA (line, 
	//							0, qtyToDeliver.negate());
	//						if (!ma.save())
	//							;
	//						log.fine("##: " + ma);
	//					}
	//				}	//	outgoing Trx
	//			}	//	attributeSetInstance
	//			
	//			if (needSave && !line.save())
	//				log.severe("NOT saved " + line);
	//		}	//	for all lines
	//
	//	}	//	checkMaterialPolicy

	/**
	 * 	Void Document.
	 * 	@return false 
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
			MInventoryLine[] lines = getLines(false);
			for (int i = 0; i < lines.length; i++)
			{
				MInventoryLine line = lines[i];
				BigDecimal oldCount = line.getQtyCount();
				BigDecimal oldInternal = line.getQtyInternalUse();
				if (oldCount.compareTo(line.getQtyBook()) != 0 
						|| oldInternal.signum() != 0)
				{
					line.setQtyInternalUse(Env.ZERO);
					line.setQtyCount(line.getQtyBook());
					line.addDescription("Void (" + oldCount + "/" + oldInternal + ")");
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

		setDocAction(REF__DocumentAction.None);
		return true;
	}	//	closeIt

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
		MInventory reversal = new MInventory(getCtx(), 0, get_TrxName());
		copyValues(this, reversal, getAD_Client_ID(), getAD_Org_ID());
		reversal.setDocStatus(REF__DocumentStatus.Drafted);
		reversal.setDocAction(REF__DocumentAction.Complete);
		reversal.setIsApproved (false);
		reversal.setPosted(false);
		reversal.setProcessed(false);
		reversal.addDescription("{->" + getDocumentNo() + ")");
		if (!reversal.save())
		{
			m_processMsg = "Could not create Inventory Reversal";
			return false;
		}

		//	Reverse Line Qty
		MInventoryLine[] oLines = getLines(true);
		for (int i = 0; i < oLines.length; i++)
		{
			MInventoryLine oLine = oLines[i];
			MInventoryLine rLine = new MInventoryLine(getCtx(), 0, get_TrxName());
			copyValues(oLine, rLine, oLine.getAD_Client_ID(), oLine.getAD_Org_ID());
			rLine.setM_Inventory_ID(reversal.getM_Inventory_ID());
			rLine.setParent(reversal);
			//
			rLine.setQtyBook (oLine.getQtyCount());		//	switch
			rLine.setQtyCount (oLine.getQtyBook());
			rLine.setQtyInternalUse (oLine.getQtyInternalUse().negate());
			if (!rLine.save())
			{
				m_processMsg = "Could not create Inventory Reversal Line";
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

		//	Update Reversed (this)
		addDescription("(" + reversal.getDocumentNo() + "<-)");
		// After reverseCorrect
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_REVERSECORRECT);
		if (m_processMsg != null)
			return false;
		setProcessed(true);
		setDocStatus(REF__DocumentStatus.Reversed);	//	may come from void
		setDocAction(REF__DocumentAction.None);

		return true;
	}	//	reverseCorrectionIt

	/**
	 * 	Reverse Accrual
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
	 * Create Cost Detail
	 * @param line
	 * @param Qty
	 * @return an EMPTY String on success otherwise an ERROR message
	 */
	// TODO: Verificar , CARLOS , YA no es llamada ya que cost detail no se usa.
	/*	private String createCostDetail(MInventoryLine line, int M_AttributeSetInstance_ID, BigDecimal qty)
	{
		// Get Account Schemas to create MCostDetail
		MAcctSchema[] acctschemas = MAcctSchema.getClientAcctSchema(getCtx(), getAD_Client_ID());
		for(int asn = 0; asn < acctschemas.length; asn++)
		{
			MAcctSchema as = acctschemas[asn];

			if (as.isSkipOrg(getAD_Org_ID()) || as.isSkipOrg(line.getAD_Org_ID()))
			{
				continue;
			}

			BigDecimal costs = Env.ZERO;
			if (isReversal())
			{				
				String sql = "SELECT amt * -1 FROM M_CostDetail WHERE M_InventoryLine_ID=?"; // negate costs				
				MProduct product = new MProduct(getCtx(), line.getM_Product_ID(), line.get_TrxName());
				String CostingLevel = product.getCostingLevel(as);
				if (MAcctSchema.COSTINGLEVEL_Organization.equals(CostingLevel))
					sql = sql + " AND AD_Org_ID=" + getAD_Org_ID(); 
				else if (MAcctSchema.COSTINGLEVEL_BatchLot.equals(CostingLevel) && M_AttributeSetInstance_ID != 0)
					sql = sql + " AND M_AttributeSetInstance_ID=" + M_AttributeSetInstance_ID;
				costs = DB.getSQLValueBD(line.get_TrxName(), sql, line.getReversalLine_ID());
			}
			else 
			{
				ProductCost pc = new ProductCost (getCtx(), 
						line.getM_Product_ID(), M_AttributeSetInstance_ID, line.get_TrxName());
				pc.setQty(qty);
				costs = pc.getProductCosts(as, line.getAD_Org_ID(), as.getCostingMethod(), 0,false, line.getUpdated());							
			}
			if (costs == null || costs.signum() == 0)
			{
				return "No Costs for " + line.getProduct().getName();
			}

			// Set Total Amount and Total Quantity from Inventory
			MCostDetail.createInventory(as, line.getAD_Org_ID(), 
					line.getM_Product_ID(), M_AttributeSetInstance_ID,
					line.getM_InventoryLine_ID(), 0,	//	no cost element
					costs, qty,			
					line.getDescription(), line.get_TrxName());
		}

		return "";
	}*/

	public boolean beforeDelete()
	{
		Boolean canDelete = true;
		MInventoryLine[] lines = getLines(true);
		for (MInventoryLine line:lines)
		{
			if (!line.beforeDelete())
				canDelete = false;
		}
		return canDelete;
	}

	@Override
	public boolean RestoreIt() {
		this.setProcessMsg("el restaurado de inventario no esta permitido");
		return false;
	}

	public void setProcessMsg(String msg)
	{
		m_processMsg = msg;
	}

	public int getLength()
	{		
		MInventoryLine[] lines = getLines(true);
		return lines.length;
	}

	public Boolean updatestorage(MInventoryLine line)  {
		try {			
			Env.setContext(Env.getCtx(), "AD_Client_ID", getAD_Client_ID());
			Integer C_Period_ID = MPeriod.get(Env.getCtx(), getMovementDate(), getAD_Org_ID(), getAD_Client_ID()).getC_Period_ID();
			BigDecimal qtyDiff = line.getQtyInternalUse().negate();
			if (qtyDiff.signum() == 0)
				qtyDiff = line.getQtyCount().subtract(line.getQtyBook());			
			if (line.getM_AttributeSetInstance_ID() == 0 || qtyDiff.compareTo(BigDecimal.ZERO) == 0) {
				MInventoryLineMA[] mas = MInventoryLineMA.get(Env.getCtx(), line.getM_InventoryLine_ID(), get_TrxName());
				for (MInventoryLineMA ma:mas) {
					BigDecimal QtyMA = ma.getMovementQty();
					BigDecimal QtyNew = QtyMA.add(qtyDiff);
					String error = MStorage.add(getCtx(), getM_Warehouse_ID(),
							line.getM_Locator_ID(),
							line.getM_Product_ID(),
							ma.getM_AttributeSetInstance_ID(), 0,
							QtyMA.negate(), BigDecimal.ZERO, BigDecimal.ZERO, false, 
							C_Period_ID, 
							"MInventory.completeit()", get_TrxName());
					if (line.getQtyInternalUse().compareTo(BigDecimal.ZERO) == 0) {
						MStorage storage =MStorage.get(getCtx(), line.getM_Locator_ID(),
								line.getM_Product_ID(), ma.getM_AttributeSetInstance_ID(), get_TrxName());
						storage.setDateLastInventory(getMovementDate());
						if (!storage.save(get_TrxName())) {
							throw new Exception("Storage not updated");
						}
					}
					String m_MovementType =null;
					if (QtyMA.negate().compareTo(BigDecimal.ZERO) > 0 ) 
						m_MovementType = REF_M_TransactionMovementType.InventoryIn;
					else
						m_MovementType = REF_M_TransactionMovementType.InventoryOut;
					qtyDiff = QtyNew;
				}
				if (qtyDiff.compareTo(BigDecimal.ZERO) != 0) {
					String error = MStorage.add(getCtx(), getM_Warehouse_ID(),
							line.getM_Locator_ID(),
							line.getM_Product_ID(),
							line.getM_AttributeSetInstance_ID(), 0,
							qtyDiff, BigDecimal.ZERO, BigDecimal.ZERO, false,
							C_Period_ID,
							"MInventory.completeIt()",
							get_TrxName());					
				}												
			}
			else {
				String error = MStorage.add(getCtx(), getM_Warehouse_ID(),
						line.getM_Locator_ID(),
						line.getM_Product_ID(),
						line.getM_AttributeSetInstance_ID(), 0,
						qtyDiff, BigDecimal.ZERO, BigDecimal.ZERO, false,
						C_Period_ID,
						"MInventory.completeIt()",
						get_TrxName());
				if (line.getQtyInternalUse().compareTo(BigDecimal.ZERO) == 0) {
					MStorage storage = MStorage.get(getCtx(), line.getM_Locator_ID(),
							line.getM_Product_ID(), line.getM_AttributeSetInstance_ID(), get_TrxName());
					storage.setDateLastInventory(getMovementDate());
					if (!storage.save(get_TrxName())) {
						throw new Exception("Storage not updated(2)");
					}
				}
				String m_MovementType =null;
				if (qtyDiff.compareTo(BigDecimal.ZERO) > 0 ) 
					m_MovementType = REF_M_TransactionMovementType.InventoryIn;
				else
					m_MovementType = REF_M_TransactionMovementType.InventoryOut;
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
}	//	MInventory