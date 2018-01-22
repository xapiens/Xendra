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
package org.compiere.process;

import java.math.*;
import java.sql.*;
import java.util.logging.*;

import org.compiere.model.MBPartner;
import org.compiere.model.MDistributionRun;
import org.compiere.model.MDistributionRunDetail;
import org.compiere.model.MDistributionRunLine;
import org.compiere.model.MDocType;
import org.compiere.model.MOrder;
import org.compiere.model.MOrderLine;
import org.compiere.model.MOrg;
import org.compiere.model.MOrgInfo;
import org.compiere.model.MProduct;
import org.compiere.util.*;

import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;


/**
 *	Create Distribution	
 *	
 *  @author Jorg Janke
 *  @version $Id: DistributionRun.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="M_DistributionRun Create",
name="Create Orders",
description="Create orders based on Distribution List line items",
help="Please note that due to rounding, the total quantity of the order(s) is likely to be higher then the quantity entered.",
Identifier="b8c6d83a-badf-a130-33e7-d82d00120e84",
classname="org.compiere.process.DistributionRun",
updated="2015-06-20 10:10:12")	
public class DistributionRun extends SvrProcess
{
	/**	The Run to execute		*/
	private int					p_M_DistributionRun_ID = 0;
	/**	Date Promised			*/
	@XendraProcessParameter(Name="Date Promised",
			                ColumnName="DatePromised",
			                Description="Date Order was promised",
			                Help="The Date Promised indicates the date, if any, that an Order was promised for.",
			                AD_Reference_ID=DisplayType.Date,
			                SeqNo=20,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="79ce0278-b55d-ef99-cd85-633dc4ad43e1")	
	private Timestamp			p_DatePromised = null;
	/** Dicument Type			*/
	@XendraProcessParameter(Name="Document Type",
			                ColumnName="C_DocType_ID",
			                Description="Document type or rules",
			                Help="The Document Type determines document sequence and processing rules",
			                AD_Reference_ID=DisplayType.TableDir,
			                SeqNo=10,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="243a00d1-4bc7-4058-0c4a-a1e8acfb8ed7")	
	private int					p_C_DocType_ID = 0;
	/** Test Mode				*/
	@XendraProcessParameter(Name="Test",
			                ColumnName="IsTest",
			                Description="Execute in Test Mode",
			                Help="",
			                AD_Reference_ID=DisplayType.YesNo,
			                SeqNo=30,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="1ea3808f-c83a-8a23-6209-dd91c6ded8fc")	
	private boolean				p_IsTest = false;
	
	/**	Distribution Run			*/
	private MDistributionRun		m_run = null;
	/**	Distribution Run Lines		*/
	private MDistributionRunLine[]	m_runLines = null;
	/** Distribution Run Details	*/
	private MDistributionRunDetail[]	m_details = null;

	/**	Date Ordered			*/
	private Timestamp			m_DateOrdered = null;
	/**	Orders Created			*/
	private int					m_counter = 0;
	/** Document Type			*/
	private MDocType			m_docType = null;
	
	/**
	 *  Prepare - e.g., get Parameters.
	 */
	protected void prepare()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
		//	log.fine("prepare - " + para[i]);
			if (para[i].getParameter() == null)
				;
			else if (name.equals("C_DocType_ID"))
				p_C_DocType_ID = ((BigDecimal)para[i].getParameter()).intValue();
			else if (name.equals("DatePromised"))
				p_DatePromised = (Timestamp)para[i].getParameter();
			else if (name.equals("IsTest"))
				p_IsTest = "Y".equals(para[i].getParameter());
			else
				log.log(Level.SEVERE, "prepare - Unknown Parameter: " + name);		
		}
		p_M_DistributionRun_ID = getRecord_ID();
	}	//	prepare

	/**
	 *  Perform process.
	 *  @return Message (text with variables)
	 *  @throws Exception if not successful
	 */
	protected String doIt() throws Exception
	{
		log.info("M_DistributionRun_ID=" + p_M_DistributionRun_ID 
			+ ", C_DocType_ID=" + p_C_DocType_ID
			+ ", DatePromised=" + p_DatePromised
			+ ", Test=" + p_IsTest);
		//	Distribution Run
		if (p_M_DistributionRun_ID == 0)
			throw new IllegalArgumentException ("No Distribution Run ID");
		m_run = new MDistributionRun(getCtx(), p_M_DistributionRun_ID, get_TrxName());
		if (m_run.get_ID() == 0)
			throw new Exception ("Distribution Run not found -  M_DistributionRun_ID=" +  p_M_DistributionRun_ID);
		m_runLines = m_run.getLines(true);
		if (m_runLines == null || m_runLines.length == 0)
			throw new Exception ("No active, non-zero Distribution Run Lines found");
		
		//	Document Type
		if (p_C_DocType_ID == 0)
			throw new IllegalArgumentException ("No Document Type ID");
		m_docType = new MDocType(getCtx(), p_C_DocType_ID, null);	//	outside trx
		if (m_docType.get_ID() == 0)
			throw new Exception ("Document Type not found -  C_DocType_ID=" +  p_C_DocType_ID);
		//
		m_DateOrdered = new Timestamp (System.currentTimeMillis());
		if (p_DatePromised == null)
			p_DatePromised = m_DateOrdered;
		
		//	Create Temp Lines
		if (insertDetails() == 0)
			throw new Exception ("No Lines");
		
		//	Order By Distribution Run Line
		m_details = MDistributionRunDetail.get(getCtx(), p_M_DistributionRun_ID, false, get_TrxName());
		//	First Run -- Add & Round
		addAllocations ();		

		//	Do Allocation
		int loops = 0;
		while (!isAllocationEqTotal ())
		{
			adjustAllocation();
			addAllocations();
			if (++loops > 10)
				throw new Exception ("Loop detected - more than 10 Allocation attempts");
		}
		
		//	Order By Business Partner
		m_details = MDistributionRunDetail.get(getCtx(), p_M_DistributionRun_ID, true, get_TrxName());
		//	Create Orders
		createOrders();
		
		return "@Created@ #" + m_counter;
	}	//	doIt
	

	/**
	 * 	Insert Details
	 *	@return number of rows inserted
	 */
	private int insertDetails()
	{
		//	Handle NULL
		String sql = "UPDATE M_DistributionRunLine SET MinQty = 0 WHERE MinQty IS NULL";
		int no = DB.executeUpdate(sql, get_TrxName());
		sql = "UPDATE M_DistributionListLine SET MinQty = 0 WHERE MinQty IS NULL";
		no = DB.executeUpdate(sql, get_TrxName());
		//	Total Ratio
		sql = "UPDATE M_DistributionList l "
			+ "SET RatioTotal = (SELECT SUM(Ratio) FROM M_DistributionListLine ll "
				+ " WHERE l.M_DistributionList_ID=ll.M_DistributionList_ID) "
			+ "WHERE EXISTS (SELECT * FROM M_DistributionRunLine rl"
				+ " WHERE l.M_DistributionList_ID=rl.M_DistributionList_ID"
				+ " AND rl.M_DistributionRun_ID=" + p_M_DistributionRun_ID + ")";
		no = DB.executeUpdate(sql, get_TrxName());
		
		//	Delete Old
		sql = "DELETE FROM T_DistributionRunDetail WHERE M_DistributionRun_ID="
			+ p_M_DistributionRun_ID;
		no = DB.executeUpdate(sql, get_TrxName());
		log.fine("insertDetails - deleted #" + no);
		//	Insert New
		sql = "INSERT INTO T_DistributionRunDetail "
			+ "(M_DistributionRun_ID, M_DistributionRunLine_ID, M_DistributionList_ID, M_DistributionListLine_ID,"
			+ "AD_Client_ID,AD_Org_ID, IsActive, Created,CreatedBy, Updated,UpdatedBy,"
			+ "C_BPartner_ID, C_BPartner_Location_ID, M_Product_ID,"
			+ "Ratio, MinQty, Qty) "
			//
			+ "SELECT rl.M_DistributionRun_ID, rl.M_DistributionRunLine_ID,"
			+ "ll.M_DistributionList_ID, ll.M_DistributionListLine_ID, "
			+ "rl.AD_Client_ID,rl.AD_Org_ID, rl.IsActive, rl.Created,rl.CreatedBy, rl.Updated,rl.UpdatedBy,"
			+ "ll.C_BPartner_ID, ll.C_BPartner_Location_ID, rl.M_Product_ID, "
			+ "ll.Ratio, "
			+ "CASE WHEN rl.MinQty > ll.MinQty THEN rl.MinQty ELSE ll.MinQty END, "
			+ "(ll.Ratio/l.RatioTotal*rl.TotalQty)"
			+ "FROM M_DistributionRunLine rl"
			+ " INNER JOIN M_DistributionList l ON (rl.M_DistributionList_ID=l.M_DistributionList_ID)"
			+ " INNER JOIN M_DistributionListLine ll ON (rl.M_DistributionList_ID=ll.M_DistributionList_ID) "
			+ "WHERE rl.M_DistributionRun_ID=" + p_M_DistributionRun_ID
			+ " AND l.RatioTotal<>0 AND rl.IsActive='Y' AND ll.IsActive='Y'";
		no = DB.executeUpdate(sql, get_TrxName());
		log.fine("inserted #" + no);
		return no;
	}	//	insertDetails

	
	/**************************************************************************
	 * 	Add up Allocations
	 */
	private void addAllocations ()
	{
		//	Reset
		for (int j = 0; j < m_runLines.length; j++)
		{
			MDistributionRunLine runLine = m_runLines[j];
			runLine.resetCalculations();
		}
		//	Add Up
		for (int i = 0; i < m_details.length; i++)
		{
			MDistributionRunDetail detail = m_details[i];
			for (int j = 0; j < m_runLines.length; j++)
			{
				MDistributionRunLine runLine = m_runLines[j];
				if (runLine.getM_DistributionRunLine_ID() == detail.getM_DistributionRunLine_ID())
				{
					//	Round
					detail.round(runLine.getUOMPrecision());
					//	Add
					runLine.addActualMin(detail.getMinQty());
					runLine.addActualQty(detail.getQty());
					runLine.addActualAllocation(detail.getActualAllocation());
					runLine.setMaxAllocation(detail.getActualAllocation(), false);
					//
					log.fine("RunLine=" + runLine.getLine() 
						+ ": BP_ID=" + detail.getC_BPartner_ID() 
						+ ", Min=" + detail.getMinQty()
						+ ", Qty=" + detail.getQty()
						+ ", Allocation=" + detail.getActualAllocation());
					continue;
				}
			}
		}	//	for all detail lines
		
		//	Info
		for (int j = 0; j < m_runLines.length; j++)
		{
			MDistributionRunLine runLine = m_runLines[j];
			log.fine("Run - " + runLine.getInfo());
		}
	}	//	addAllocations
	
	
	/**
	 * 	Is Allocation Equals Total
	 *	@return true if allocation eq total
	 *	@throws Exception
	 */
	private boolean isAllocationEqTotal() throws Exception
	{
		boolean allocationEqTotal = true;
		//	Check total min qty & delta
		for (int j = 0; j < m_runLines.length; j++)
		{
			MDistributionRunLine runLine = m_runLines[j];
			if (runLine.isActualMinGtTotal())
				throw new Exception ("Line " + runLine.getLine() 
					+ " Sum of Min Qty=" + runLine.getActualMin() 
					+ " is greater than Total Qty=" + runLine.getTotalQty());
			if (allocationEqTotal && !runLine.isActualAllocationEqTotal())
				allocationEqTotal = false;
		}	//	for all run lines
		log.info("=" + allocationEqTotal);
		return allocationEqTotal;
	}	//	isAllocationEqTotal

	
	/**
	 * 	Adjust Allocation
	 * 	@throws Exception
	 */
	private void adjustAllocation() throws Exception
	{
		for (int j = 0; j < m_runLines.length; j++)
			adjustAllocation(j);
	}	//	adjustAllocation
	
	/**
	 * 	Adjust Run Line Allocation
	 * 	@param index run line index
	 * 	@throws Exception
	 */
	private void adjustAllocation(int index) throws Exception
	{
		MDistributionRunLine runLine = m_runLines[index];
		BigDecimal difference = runLine.getActualAllocationDiff();
		if (difference.compareTo(Env.ZERO) == 0)
			return;
		//	Adjust when difference is -1->1 or last difference is the same 
		boolean adjustBiggest = difference.abs().compareTo(Env.ONE) <= 0
			|| difference.abs().compareTo(runLine.getLastDifference().abs()) == 0;
		log.fine("Line=" + runLine.getLine() 
			+ ", Diff=" + difference + ", Adjust=" + adjustBiggest);
		//	Adjust Biggest Amount
		if (adjustBiggest)
		{
			for (int i = 0; i < m_details.length; i++)
			{
				MDistributionRunDetail detail = m_details[i];
				if (runLine.getM_DistributionRunLine_ID() == detail.getM_DistributionRunLine_ID())
				{
					log.fine("Biggest - DetailAllocation=" + detail.getActualAllocation()
						+ ", MaxAllocation=" + runLine.getMaxAllocation() 
						+ ", Qty Difference=" + difference);
					if (detail.getActualAllocation().compareTo(runLine.getMaxAllocation()) == 0
						&& detail.isCanAdjust())
					{
						detail.adjustQty(difference);
						detail.save();
						return;
					}
				}
			}	//	for all detail lines
			throw new Exception ("Cannot adjust Difference = " + difference 
				+ " - You need to change Total Qty or Min Qty");
		}
		else	//	Distibute
		{
			//	New Total Ratio
			BigDecimal ratioTotal = Env.ZERO;
			for (int i = 0; i < m_details.length; i++)
			{
				MDistributionRunDetail detail = m_details[i];
				if (runLine.getM_DistributionRunLine_ID() == detail.getM_DistributionRunLine_ID())
				{
					if (detail.isCanAdjust())
						ratioTotal = ratioTotal.add(detail.getRatio());
				}
			}
			if (ratioTotal.compareTo(Env.ZERO) == 0)
				throw new Exception ("Cannot distribute Difference = " + difference 
					+ " - You need to change Total Qty or Min Qty");
			//	Distribute
			for (int i = 0; i < m_details.length; i++)
			{
				MDistributionRunDetail detail = m_details[i];
				if (runLine.getM_DistributionRunLine_ID() == detail.getM_DistributionRunLine_ID())
				{
					if (detail.isCanAdjust())
					{
						BigDecimal diffRatio = detail.getRatio().multiply(difference)
							.divide(ratioTotal, BigDecimal.ROUND_HALF_UP);	// precision from total
						log.fine("Detail=" + detail.toString()
							+ ", Allocation=" + detail.getActualAllocation()
							+ ", DiffRatio=" + diffRatio);
						detail.adjustQty(diffRatio);
						detail.save();
					}
				}
			}
		}
		runLine.setLastDifference(difference);
	}	//	adjustAllocation

	
	/**************************************************************************
	 * 	Create Orders
	 * 	@return true if created
	 */
	private boolean createOrders()
	{
		//	Get Counter Org/BP
		int runAD_Org_ID = m_run.getAD_Org_ID();
		if (runAD_Org_ID == 0)
			runAD_Org_ID = Env.getAD_Org_ID(getCtx());
		MOrg runOrg = MOrg.get(getCtx(), runAD_Org_ID);
		int runC_BPartner_ID = runOrg.getLinkedC_BPartner_ID(get_TrxName());
		boolean counter = !m_run.isCreateSingleOrder()	//	no single Order 
			&& runC_BPartner_ID > 0						//	Org linked to BP
			&& !m_docType.isSOTrx();					//	PO
		MBPartner runBPartner = counter ? new MBPartner(getCtx(), runC_BPartner_ID, get_TrxName()) : null;
		if (!counter || runBPartner == null || runBPartner.get_ID() != runC_BPartner_ID)
			counter = false;
		if (counter)
			log.info("RunBP=" + runBPartner
				+ " - " + m_docType);
		log.info("Single=" + m_run.isCreateSingleOrder()
			+ " - " + m_docType + ",SO=" + m_docType.isSOTrx());
		log.fine("Counter=" + counter 
			+ ",C_BPartner_ID=" + runC_BPartner_ID + "," + runBPartner);
		//
		MBPartner bp = null;
		MOrder singleOrder = null;
		MProduct product = null;
		//	Consolidated Order
		if (m_run.isCreateSingleOrder())
		{
			bp = new MBPartner (getCtx(), m_run.getC_BPartner_ID(), get_TrxName());
			if (bp.get_ID() == 0)
				throw new IllegalArgumentException("Business Partner not found - C_BPartner_ID=" + m_run.getC_BPartner_ID());
			//
			if (!p_IsTest)
			{
				singleOrder = new MOrder (getCtx(), 0, get_TrxName());
				singleOrder.setC_DocTypeTarget_ID(m_docType.getC_DocType_ID());
				singleOrder.setC_DocType_ID(m_docType.getC_DocType_ID());
				singleOrder.setIsSOTrx(m_docType.isSOTrx());
				singleOrder.setBPartner(bp);
				if (m_run.getC_BPartner_Location_ID() != 0)
					singleOrder.setC_BPartner_Location_ID(m_run.getC_BPartner_Location_ID());
				singleOrder.setDateOrdered(m_DateOrdered);
				singleOrder.setDatePromised(p_DatePromised);
				if (!singleOrder.save())
				{
					log.log(Level.SEVERE, "Order not saved");
					return false;
				}
				m_counter++;
			}
		}

		int lastC_BPartner_ID = 0;
		int lastC_BPartner_Location_ID = 0;
		MOrder order = null;
		//	For all lines
		for (int i = 0; i < m_details.length; i++)
		{
			MDistributionRunDetail detail = m_details[i];
			
			//	Create Order Header
			if (m_run.isCreateSingleOrder())
				order = singleOrder;
			//	New Business Partner
			else if (lastC_BPartner_ID != detail.getC_BPartner_ID()
				|| lastC_BPartner_Location_ID != detail.getC_BPartner_Location_ID())
			{
				//	finish order
				order = null;
			}
			lastC_BPartner_ID = detail.getC_BPartner_ID();
			lastC_BPartner_Location_ID = detail.getC_BPartner_Location_ID();
			
			//	New Order
			if (order == null)
			{
				bp = new MBPartner (getCtx(), detail.getC_BPartner_ID(), get_TrxName());
				if (!p_IsTest)
				{
					order = new MOrder (getCtx(), 0, get_TrxName());
					order.setC_DocTypeTarget_ID(m_docType.getC_DocType_ID());
					order.setC_DocType_ID(m_docType.getC_DocType_ID());
					order.setIsSOTrx(m_docType.isSOTrx());
					//	Counter Doc
					if (counter && bp.getAD_OrgBP_ID_Int() > 0)
					{
						log.fine("Counter - From_BPOrg=" + bp.getAD_OrgBP_ID_Int() 
							+ "-" + bp + ", To_BP=" + runBPartner);
						order.setAD_Org_ID(bp.getAD_OrgBP_ID_Int());
						MOrgInfo oi = MOrgInfo.get(getCtx(), bp.getAD_OrgBP_ID_Int());
						if (oi.getM_Warehouse_ID() > 0)
							order.setM_Warehouse_ID(oi.getM_Warehouse_ID());
						order.setBPartner(runBPartner);
					}
					else	//	normal
					{
						log.fine("From_Org=" + runAD_Org_ID 
							+ ", To_BP=" + bp);
						order.setAD_Org_ID(runAD_Org_ID);
						order.setBPartner(bp);
						if (detail.getC_BPartner_Location_ID() != 0)
							order.setC_BPartner_Location_ID(detail.getC_BPartner_Location_ID());
					}
					order.setDateOrdered(m_DateOrdered);
					order.setDatePromised(p_DatePromised);
					if (!order.save())
					{
						log.log(Level.SEVERE, "Order not saved");
						return false;
					}
				}
			}
			
			//	Line
			if (product == null || product.getM_Product_ID() != detail.getM_Product_ID())
				product = MProduct.get (getCtx(), detail.getM_Product_ID(), get_TrxName());
			if (p_IsTest)
			{
				addLog(0,null, detail.getActualAllocation(), 
					bp.getName() + " - " + product.getName());
				continue;
			}

			//	Create Order Line
			MOrderLine line = new MOrderLine(order);
			if (counter && bp.getAD_OrgBP_ID_Int() > 0)
				;	//	don't overwrite counter doc
			else	//	normal - optionally overwrite
			{
				line.setC_BPartner_ID(detail.getC_BPartner_ID());
				if (detail.getC_BPartner_Location_ID() != 0)
					line.setC_BPartner_Location_ID(detail.getC_BPartner_Location_ID());
			}
			//
			line.setProduct(product);
			line.setQty(detail.getActualAllocation());
			line.setPrice();
			if (!line.save())
			{
				log.log(Level.SEVERE, "OrderLine not saved");
				return false;
			}
			addLog(0,null, detail.getActualAllocation(), order.getDocumentNo() 
				+ ": " + bp.getName() + " - " + product.getName());
		}
		//	finish order
		order = null;

		
		return true;
	}	//	createOrders
	
}	//	DistributionRun
