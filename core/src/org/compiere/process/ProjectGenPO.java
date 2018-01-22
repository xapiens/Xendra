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
import java.util.*;

import org.compiere.model.MBPartner;
import org.compiere.model.MConversionRate;
import org.compiere.model.MOrder;
import org.compiere.model.MOrderLine;
import org.compiere.model.MProductPO;
import org.compiere.model.MProject;
import org.compiere.model.MProjectLine;

import java.util.logging.*;
import org.compiere.util.*;

import org.xendra.annotations.*;

/**
 *  Generate Purchase Order from Project.
 *
 *	@author Jorg Janke
 *	@version $Id: ProjectGenPO.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="C_Project_GeneratePO",
name="Generate PO from Project",
description="Generate PO from Project Line(s)",
help="",
Identifier="3e93dd61-9ece-1fb1-93d9-fa7e30c274d5",
classname="org.compiere.process.ProjectGenPO",
updated="2015-06-20 10:10:12")
public class ProjectGenPO extends SvrProcess
{
	/** Project Parameter			*/
	@XendraProcessParameter(Name="Project",
			                ColumnName="C_Project_ID",
			                Description="Financial Project",
			                Help="A Project allows you to track and control internal or external activities.",
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
			                Identifier="48482023-8e37-3b38-029b-cfee8aad22bd")	
	private int 		m_C_Project_ID = 0;
	/** Opt Project Line Parameter	*/
@XendraProcessParameter(Name="Project Line",
                ColumnName="C_ProjectLine_ID",
                Description="Task or step in a project",
                Help="The Project Line indicates a unique project line.",
                AD_Reference_ID=DisplayType.TableDir,
                SeqNo=20,
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
                Identifier="431aacc7-0e7c-3066-4194-5ab3649d13cf")
	private int 		m_C_ProjectLine_ID = 0;
	/** Consolidate Document		*/
@XendraProcessParameter(Name="Consolidate to one Document",
                ColumnName="ConsolidateDocument",
                Description="Consolidate Lines into one Document",
                Help="",
                AD_Reference_ID=DisplayType.YesNo,
                SeqNo=30,
                ReferenceValueID="",
                ValRuleID="",
                FieldLength=0,
                IsMandatory=false,
                IsRange=false,
                DefaultValue="Y",
                DefaultValue2="",
                vFormat="",
                valueMin="",
                valueMax="",
                DisplayLogic="",
                ReadOnlyLogic="",
                Identifier="fe2887c3-e977-909f-96c9-499112e10d84")
	private boolean		m_ConsolidateDocument = true;
	/** List of POs for Consolidation	*/
	private ArrayList<MOrder>	m_pos = new ArrayList<MOrder>();

	/**
	 *  Prepare - e.g., get Parameters.
	 */
	protected void prepare()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("C_Project_ID"))
				m_C_Project_ID = ((BigDecimal)para[i].getParameter()).intValue();
			else if (name.equals("C_ProjectLine_ID"))
				m_C_ProjectLine_ID = ((BigDecimal)para[i].getParameter()).intValue();
			else if (name.equals("ConsolidateDocument"))
				m_ConsolidateDocument = "Y".equals(para[i].getParameter());
			else
				log.log(Level.SEVERE, "prepare - Unknown Parameter: " + name);
		}
	}	//	prepare

	/**
	 *  Perrform process.
	 *  @return Message 
	 *  @throws Exception if not successful
	 */
	protected String doIt() throws Exception
	{
		log.info("doIt - C_Project_ID=" + m_C_Project_ID + " - C_ProjectLine_ID=" + m_C_ProjectLine_ID + " - Consolidate=" + m_ConsolidateDocument);
		if (m_C_ProjectLine_ID != 0)
		{
			MProjectLine projectLine = new MProjectLine(getCtx(), m_C_ProjectLine_ID, get_TrxName());
			MProject project = new MProject (getCtx(), projectLine.getC_Project_ID(), get_TrxName());
			createPO (project, projectLine);
		}
		else
		{
			MProject project = new MProject (getCtx(), m_C_Project_ID, get_TrxName());
			MProjectLine[] lines = project.getLines();
			for (int i = 0; i < lines.length; i++)
				createPO (project, lines[i]);
		}
		return "";
	}	//	doIt

	/**
	 * 	Create PO from Planned Amt/Qty
	 * 	@param projectLine project line
	 */
	private void createPO (MProject project, MProjectLine projectLine)
	{
		if (projectLine.getM_Product_ID() == 0)
		{
			addLog (projectLine.getLine() ,null,null, "Line has no Product");
			return;
		}
		if (projectLine.getC_OrderPO_ID() != 0)
		{
			addLog (projectLine.getLine() ,null,null, "Line was ordered previously");
			return;
		}

		//	PO Record
		MProductPO[] pos = MProductPO.getOfProduct(getCtx(), projectLine.getM_Product_ID(), get_TrxName());
		if (pos == null || pos.length == 0)
		{
			addLog (projectLine.getLine() ,null,null, "Product has no PO record");
			return;
		}

		//	Create to Order
		MOrder order = null;
		//	try to find PO to C_BPartner
		for (int i = 0; i < m_pos.size(); i++)
		{
			MOrder test = (MOrder)m_pos.get(i);
			if (test.getC_BPartner_ID() == pos[0].getC_BPartner_ID())
			{
				order = test;
				break;
			}
		}
		if (order == null)	//	create new Order
		{
			//	Vendor
			MBPartner bp = new MBPartner (getCtx(), pos[0].getC_BPartner_ID(), get_TrxName());
			//	New Order
			order = new MOrder (project, false, null);
			int AD_Org_ID = projectLine.getAD_Org_ID();
			if (AD_Org_ID == 0)
			{
				log.warning("createPOfromProjectLine - AD_Org_ID=0");
				AD_Org_ID = Env.getAD_Org_ID(getCtx());	
				if (AD_Org_ID != 0)
					projectLine.setAD_Org_ID(AD_Org_ID);
			}
			order.setClientOrg (projectLine.getAD_Client_ID (), AD_Org_ID);
			order.setBPartner (bp);
			order.save ();
			//	optionally save for consolidation
			if (m_ConsolidateDocument)
				m_pos.add(order);
		}

		//	Create Line
		MOrderLine orderLine = new MOrderLine (order);
		orderLine.setM_Product_ID(projectLine.getM_Product_ID(), true);
		orderLine.setQty(projectLine.getPlannedQty());
		orderLine.setDescription(projectLine.getDescription());

		//	(Vendor) PriceList Price
		orderLine.setPrice();
		if (orderLine.getPriceActual().signum() == 0)
		{
			//	Try to find purchase price
			BigDecimal poPrice = pos[0].getPricePO();
			int C_Currency_ID = pos[0].getC_Currency_ID();
			//
			if (poPrice == null || poPrice.signum() == 0)
				poPrice = pos[0].getPriceLastPO();
			if (poPrice == null || poPrice.signum() == 0)
				poPrice = pos[0].getPriceList();
			//	We have a price
			if (poPrice != null && poPrice.signum() != 0)
			{
				if (order.getC_Currency_ID() != C_Currency_ID)
					poPrice = MConversionRate.convert(getCtx(), poPrice, 
						C_Currency_ID, order.getC_Currency_ID(), 
						order.getDateAcct(), order.getC_ConversionType_ID(), 
						order.getAD_Client_ID(), order.getAD_Org_ID());
				orderLine.setPrice(poPrice);
			}
		}
		
		orderLine.setTax();
		orderLine.save();

		//	update ProjectLine
		projectLine.setC_OrderPO_ID(order.getC_Order_ID());
		projectLine.save();
		addLog (projectLine.getLine(), null, projectLine.getPlannedQty(), order.getDocumentNo());
	}	//	createPOfromProjectLine

}	//	ProjectGenPO
