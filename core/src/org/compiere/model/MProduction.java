/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
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
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.model.persistence.X_C_Period;
import org.compiere.model.persistence.X_M_InOut;
import org.compiere.model.persistence.X_M_InOutLine;
import org.compiere.model.persistence.X_M_Production;
import org.compiere.model.persistence.X_M_ProductionLine;
import org.compiere.model.persistence.X_M_ProductionPlan;
import org.compiere.model.persistence.X_M_Transaction;
import org.compiere.model.reference.REF_C_OrderDeliveryRule;
import org.compiere.model.reference.REF__DocumentAction;
import org.compiere.model.reference.REF__DocumentStatus;
import org.compiere.print.*;
import org.compiere.process.*;
import org.compiere.util.*;
import org.xendra.Constants;
import org.xendra.material.StockWorker;


/**
 *	Invoice Model.
 * 	Please do not set DocStatus and C_DocType_ID directly. 
 * 	They are set in the process() method. 
 * 	Use DocAction and C_DocTypeTarget_ID instead.
 *
 *  @author Jorg Janke
 *  @version $Id: MInvoice.java 3190 2011-07-06 03:20:24Z xapiens $
 */
public class MProduction extends X_M_Production implements DocAction
{
	/**	Cache						*/
	private static CCache<Integer,MProduction>	s_cache	= new CCache<Integer,MProduction>("M_Production", 20, 2);	//	2 minutes


	/**************************************************************************
	 * 	Production Constructor
	 * 	@param ctx context
	 * 	@param C_Invoice_ID invoice or 0 for new
	 * 	@param trxName trx name
	 */
	public MProduction (Properties ctx, int C_Invoice_ID, String trxName)
	{
		super (ctx, C_Invoice_ID, trxName);
		if (C_Invoice_ID == 0)
		{
			setDocStatus (REF__DocumentStatus.Drafted);		//	Draft
			setDocAction (REF__DocumentAction.Complete);
			//
			setPosted(false);
			super.setProcessed (false);
			setProcessing(false);
		}
	}	//	MInvoice

	/**
	 *  Load Constructor
	 *  @param ctx context
	 *  @param rs result set record
	 *	@param trxName transaction
	 */
	public MProduction (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MInvoice

	/**
	 * 	Create Invoice from Order
	 *	@param order order
	 *	@param C_DocTypeTarget_ID target document type
	 *	@param invoiceDate date or null
	 */

	/**	Open Amount				*/
	private BigDecimal 				m_openAmt = null;

	/**	Production Plans		*/
	private X_M_ProductionPlan[]	m_lines;
	/**	Logger			*/
	private static CLogger s_log = CLogger.getCLogger(MProduction.class);		

	/**************************************************************************
	 * 	Process document
	 *	@param processAction document action
	 *	@return true if performed
	 */
	public boolean processIt (String processAction)
	{
		boolean processit;
		DocumentEngine engine = new DocumentEngine (this, getDocStatus());
		m_processMsg = null;
		if (processAction.equals(engine.ACTION_None) 
				&& getDocStatus().equals(engine.ACTION_Complete) 
				&& getDocAction().equals(ACTION_Restore))
		{
			return RestoreIt();
		}
		else
		{
			processit = engine.processIt (processAction, getDocAction());
			if (processit) {}					
			//createLog();
		}
		return processit;
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
		setDocAction(REF__DocumentAction.Prepare);		
		return true;
	}	//	invalidateIt

	/**
	 * 	Get Production Plan of Production
	 * 	@param whereClause starting with AND
	 * 	@return lines
	 */
	private X_M_ProductionPlan[] getLines (String whereClause)
	{
		ArrayList<X_M_ProductionPlan> list = new ArrayList<X_M_ProductionPlan>();
		String sql = "SELECT * FROM M_ProductionPlan WHERE M_Production_ID=? ";
		if (whereClause != null)
			sql += whereClause;
		sql += " ORDER BY Line";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql, get_TrxName());
			pstmt.setInt(1, getM_Production_ID());
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				X_M_ProductionPlan il = new X_M_ProductionPlan(getCtx(), rs, get_TrxName());
				list.add(il);
			}
			rs.close();
			pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, "getLines", e);
		}
		finally
		{
			try
			{
				if (pstmt != null)
					pstmt.close ();
			}
			catch (Exception e)
			{}
			pstmt = null;
		}

		//
		X_M_ProductionPlan[] lines = new X_M_ProductionPlan[list.size()];
		list.toArray(lines);
		return lines;
	}	//	getLines

	/**
	 * 	Get Production Plans
	 * 	@param requery
	 * 	@return lines
	 */
	public X_M_ProductionPlan[] getLines (boolean requery)
	{
		if (m_lines == null || m_lines.length == 0 || requery)
			m_lines = getLines(null);
		return m_lines;
	}	//	getLines

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

		if (getDateAcct() == null)
		{
			m_processMsg = "@PeriodInvalid@";
			return DocAction.STATUS_Invalid;			
		}
		//	Std Period open?
		if (!MPeriod.isOpen(getCtx(), getDateAcct(), dt.getDocBaseType(), getAD_Org_ID()))
		{
			m_processMsg = "@PeriodClosed@";
			return DocAction.STATUS_Invalid;
		}
		//	Production Plans
		X_M_ProductionPlan[] lines = getLines(true);
		if (lines.length == 0)
		{
			m_processMsg = "@NoLines@";
			return DocAction.STATUS_Invalid;
		}

		m_processMsg = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_AFTER_PREPARE);
		if (m_processMsg != null)
			return DocAction.STATUS_Invalid;

		//	Add up Amounts
		m_justPrepared = true;
		if (!REF__DocumentAction.Complete.equals(getDocAction()))
		{			
			setDocAction(REF__DocumentAction.Complete);			
		}		
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
		Integer C_Period_ID = MPeriod.get(Env.getCtx(), this.getMovementDate()).getC_Period_ID();
		StringBuffer info = new StringBuffer();
		//
		String whereClause = "M_Production_ID=? ";
		List<X_M_ProductionPlan> lines = new Query(getCtx(), X_M_ProductionPlan.Table_Name , whereClause, get_TrxName())
		.setParameters(getM_Production_ID())
		.setOrderBy("Line, M_Product_ID")
		.list();
		for (X_M_ProductionPlan pp:lines)
		{
			whereClause = "M_ProductionPlan_ID=?";
			List<X_M_ProductionLine> production_lines = new Query(getCtx(), X_M_ProductionLine.Table_Name , whereClause, get_TrxName())
			.setParameters(pp.getM_ProductionPlan_ID())
			.setOrderBy("Line")
			.list();

			if (production_lines.size() == 0)
			{
				if (!ProcessProduction())
				{
					m_processMsg = "no se pudo producir ";
					return DocAction.STATUS_Invalid;
				}
			}

			for (X_M_ProductionLine pLine : production_lines)
			{
				MLocator locator = MLocator.get(getCtx(), pLine.getM_Locator_ID());
				BigDecimal MovementQty = pLine.getMovementQty();
				if (MovementQty.signum() == 0)
					continue;
				else if (MovementQty.signum() < 0)
				{
					BigDecimal QtyAvailable = MStorage.getQtyAvailable(
							locator.getM_Warehouse_ID(),
							locator.getM_Locator_ID(),
							pLine.getM_Product_ID(),
							pLine.getM_AttributeSetInstance_ID(),
							get_TrxName());

					if ( QtyAvailable.add(MovementQty).signum() < 0 && getDeliveryRule().equals(REF_C_OrderDeliveryRule.Availability))
					{
						this.m_processMsg = "@NotEnoughStocked@:" +  pLine.getM_Product_ID();
						return DocAction.STATUS_Invalid;
					}
				}
				String error = MStorage.add(getCtx(), locator.getM_Warehouse_ID(),
						locator.getM_Locator_ID(),
						pLine.getM_Product_ID(),
						pLine.getM_AttributeSetInstance_ID(), 0 ,
						MovementQty,
						Env.ZERO,
						Env.ZERO,
						false, 	
						C_Period_ID,
						"MProduction.completeIt",
						get_TrxName());
				if (error.length() > 0 && getDeliveryRule().equals(REF_C_OrderDeliveryRule.Availability))
				{
					this.m_processMsg =  " Cannot correct inventory" + error;
					return DocAction.STATUS_Invalid;
				}
				pLine.setProcessed(true);
				pLine.saveEx();
			}		  	
		}
		//	User Validation
		String valid = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_AFTER_COMPLETE);
		if (valid != null)
		{
			m_processMsg = valid;
			return DocAction.STATUS_Invalid;
		}

		m_processMsg = info.toString().trim();
		setProcessed(true);
		//MStorage.CheckPeriod(C_Period_ID);
		MPeriod period = MPeriod.get(Env.getCtx(), getMovementDate(), 0);
		StockWorker sw = new StockWorker();
		sw.setCommand(StockWorker.Document);
		sw.addProperty(Constants.COLUMNNAME_AD_Client_ID, getAD_Client_ID());
		sw.addProperty(X_M_Production.COLUMNNAME_M_Production_ID, get_ID());
		sw.addProperty(X_AD_Table.COLUMNNAME_AD_Table_ID, X_M_Production.Table_ID);
		sw.addProperty(X_C_Period.COLUMNNAME_C_Period_ID, period.ToEnd());
		sw.addProperty(X_C_Order.COLUMNNAME_DocStatus, DocAction.STATUS_Completed);							
		sw.setMachine(Env.getServerMaterial());
		sw.Pull();				
		setDocAction(REF__DocumentAction.Close);		
		return DocAction.STATUS_Completed;
	}	//	completeIt

	private Boolean ProcessProduction() {

		/**
		 * No Action
		 */
		if (isProcessed()) {
			return false;
		}

		String whereClause = "M_Production_ID=? ";
		List<X_M_ProductionPlan> lines = new Query(getCtx(), X_M_ProductionPlan.Table_Name , whereClause, get_TrxName())
		.setParameters(getM_Production_ID())
		.setOrderBy("Line, M_Product_ID")
		.list();
		for (X_M_ProductionPlan pp:lines)
		{
			int line = 100;
			int no = DB.executeUpdateEx("DELETE FROM M_ProductionLine WHERE M_ProductionPlan_ID = ?", new Object[]{pp.getM_ProductionPlan_ID()},get_TrxName());
			if (no == -1)
				try {
					raiseError("ERROR", "DELETE FROM M_ProductionLine WHERE M_ProductionPlan_ID = "+ pp.getM_ProductionPlan_ID());
				} catch (Exception e) {
					e.printStackTrace();
				}

			MProduct product = MProduct.get(Env.getCtx(),pp.getM_Product_ID(), get_TrxName());
			X_M_ProductionLine pl = new X_M_ProductionLine(getCtx(), 0, get_TrxName());
			pl.setLine(line);
			pl.setDescription(pp.getDescription());
			pl.setM_Product_ID(pp.getM_Product_ID());
			pl.setM_Locator_ID(pp.getM_Locator_ID());
			pl.setM_ProductionPlan_ID(pp.getM_ProductionPlan_ID());
			pl.setMovementQty(pp.getProductionQty());
			pl.setIsCosted(false);
			pl.saveEx();
			try {
				if ( explosion(pp, product, pp.getProductionQty(), line) == 0)
					raiseError("no BOM lines", "");
				pp.setProcessed(true);
				pp.saveEx();
				setIsCreated(true);
				saveEx();
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		return true;
	} // del doIt





	private int explosion( X_M_ProductionPlan pp, MProduct product, BigDecimal qty, int line) throws Exception
	{
		int components = 0;
		MProductBOM[] boms = MProductBOM.getBOMLines (product);
		for (MProductBOM bomline:boms)
		{
			MProduct component = MProduct.get(getCtx(), bomline.getM_Product_ID(), get_TrxName());
			if (component.isBOM() && !component.isStocked())
				explosion( pp, component, bomline.getBOMQty(), line );
			else
			{
				line += 1;
				X_M_ProductionLine pl = new X_M_ProductionLine(getCtx(), 0 , get_TrxName());
				pl.setLine(line);
				pl.setDescription(bomline.getDescription());
				pl.setM_Product_ID(bomline.getM_ProductBOM_ID());
				pl.setM_Locator_ID(pp.getM_Locator_ID());
				pl.setM_ProductionPlan_ID(pp.getM_ProductionPlan_ID());
				pl.setMovementQty(bomline.getBOMQty().multiply(qty).negate());
				pl.setIsCosted(false);
				pl.saveEx();
				components += 1;
			}
		}
		return components;
	}

	private void raiseError(String string, String sql) throws Exception {
		String msg = string;
		ValueNamePair pp = CLogger.retrieveError();
		if (pp != null)
			msg = pp.getName() + " - ";
		msg += sql;
		throw new XendraUserError(msg);
	}

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

		setProcessed(true);
		setDocAction(REF__DocumentAction.None);		
		return true;
	}	//	closeIt


	/*************************************************************************
	 * 	Get Summary
	 *	@return Summary of Document
	 */
	public String getSummary()
	{
		StringBuffer sb = new StringBuffer();

		sb.append(getDocumentNo());
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

	public boolean RestoreIt() {
		m_processMsg = "@NoRestoreProductionAllowed@:";
		return false;
//		//MProduct product;
//		//      Re-Check
//		StringBuffer info = new StringBuffer();
//		MPeriod period = MPeriod.get(Env.getCtx(), getMovementDate(), 0);
//		//Integer C_Period_ID = MPeriod.get(Env.getCtx(), this.getMovementDate()).getC_Period_ID();
//		
//		//MAcctSchema as = MClient.get(getCtx(), getAD_Client_ID()).getAcctSchema();
//
//		//MCostElement ce = new MCostElement(getCtx(), as.getM_CostElement_ID(), get_TrxName());
//		//
//		String whereClause = "M_Production_ID=? ";
//		List<X_M_ProductionPlan> lines = new Query(getCtx(), X_M_ProductionPlan.Table_Name , whereClause, get_TrxName())
//		.setParameters(getM_Production_ID())
//		.setOrderBy("Line, M_Product_ID")
//		.list();
//		for (X_M_ProductionPlan pp:lines)
//		{
//			whereClause = "M_ProductionPlan_ID=?";
//			List<X_M_ProductionLine> production_lines = new Query(getCtx(), X_M_ProductionLine.Table_Name , whereClause, get_TrxName())
//			.setParameters(pp.getM_ProductionPlan_ID())
//			.setOrderBy("Line")
//			.list();
//
//			for (X_M_ProductionLine pLine : production_lines)
//			{
//				MLocator locator = MLocator.get(getCtx(), pLine.getM_Locator_ID());
//				BigDecimal MovementQty = pLine.getMovementQty();
//				if (MovementQty.signum() == 0)
//					continue;
//				else if (MovementQty.signum() > 0)
//				{
//					BigDecimal QtyAvailable = MStorage.getQtyAvailable(
//							locator.getM_Warehouse_ID(),
//							0,
//							pLine.getM_Product_ID(),
//							pLine.getM_AttributeSetInstance_ID(),
//							get_TrxName());
//
//					if ( QtyAvailable.subtract(MovementQty).signum() < 0)
//					{
//						m_processMsg = "@NotEnoughStocked@:" +  MProduct.get(Env.getCtx(), pLine.getM_Product_ID());
//						return false;
//					}
//				}
//
//				MovementQty = MovementQty.negate();
//
//				String error = MStorage.add(getCtx(), locator.getM_Warehouse_ID(),
//						locator.getM_Locator_ID(),
//						pLine.getM_Product_ID(),
//						pLine.getM_AttributeSetInstance_ID(), 0 ,
//						MovementQty,
//						Env.ZERO,
//						Env.ZERO,
//						false,					
//						period.getC_Period_ID(),
//						"MProduction.RestoreIt",
//						get_TrxName());
//				if ( error.length() > 0 && getDeliveryRule().equals(REF_C_OrderDeliveryRule.Availability))
//				{
//					m_processMsg =  " Cannot correct inventory" +  error;
//					return false;
//				}
//				//pLine.setProcessed(false);
//				//pLine.saveEx();
//
//				// Finally invalidate stocks for each involved product.and each costing method.
//				MProduct product = new MProduct(getCtx(), pLine.getM_Product_ID(), get_TrxName());
//				if (product.isCostable()) {
//					String qry = String.format("%s=?", X_M_Transaction.COLUMNNAME_M_ProductionLine_ID);				
//					X_M_Transaction t = new Query(Env.getCtx(), X_M_Transaction.Table_Name, qry, get_TrxName())
//					.setParameters(pLine.getM_ProductionLine_ID()).first();																	
//					if ( t != null)
//					{
//						if (t.isProcessed())
//						{
//							t.setProcessed(false);
//							t.save();
//						}
//					}
//				}
//			}
//			for (X_M_ProductionLine pLine : production_lines)
//			{
//				if (!pLine.delete(true))
//					return false;
//			}
//			//int no = DB.executeUpdateEx("DELETE FROM M_ProductionLine WHERE M_ProductionPlan_ID = ?", new Object[]{pp.getM_ProductionPlan_ID()},get_TrxName());
//			//if (no == -1) return false;
//		}
//		//      User Validation
//		String valid = ModelValidationEngine.get().fireDocValidate(this, ModelValidator.TIMING_AFTER_COMPLETE);
//		if (valid != null)
//		{
//			m_processMsg = valid;
//			return false;
//		}
//
//		m_processMsg = info.toString().trim();
//		setProcessed(false);
//		setDocStatus(DocAction.STATUS_Drafted);
//		setDocAction(DocAction.ACTION_Complete);
//		//setIsCosted(false);
//		StockWorker sw = new StockWorker();
//		sw.setCommand(StockWorker.Document);
//		sw.addProperty(X_M_Production.COLUMNNAME_M_Production_ID, get_ID());
//		sw.addProperty(X_AD_Table.COLUMNNAME_AD_Table_ID, X_M_Production.Table_ID);
//		sw.addProperty(X_C_Period.COLUMNNAME_C_Period_ID, period.ToEnd());
//		sw.addProperty(X_C_Order.COLUMNNAME_DocStatus, DocAction.STATUS_Drafted);							
//		sw.setMachine(Env.getServerMaterial());
//		sw.Pull();		
		//MStorage.CheckPeriod(C_Period_ID);
//		return true;
	}

	@Override
	public File createPDF() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigDecimal getApprovalAmt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getC_Currency_ID() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDoc_User_ID() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getDocumentInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String placedIt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean reActivateIt() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String returnedIt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean reverseAccrualIt() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean reverseCorrectIt() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean voidIt() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setProcessMsg(String msg)
	{
		m_processMsg = msg;
	}
}	//	MProduction
