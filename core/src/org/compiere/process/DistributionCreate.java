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

import org.compiere.model.MBPartner;
import org.compiere.model.MDistributionList;
import org.compiere.model.MDistributionListLine;
import org.compiere.model.MOrder;
import org.compiere.model.MOrderLine;
import org.compiere.model.MProduct;
import org.compiere.model.reference.REF_C_DocTypeSubType;

import java.util.logging.*;

import org.compiere.util.*;

import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;
/**
 *	Create Distribution List Order
 *	
 *  @author Jorg Janke
 *  @version $Id: DistributionCreate.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="M_DistributionList Create",
name="Create Orders",
description="Create orders based on Distribution List line items",
help="Please note that due to rounding, the total quantity of the order(s) is likely to be higher then the quantity entered.",
Identifier="46e83f6f-4a63-888d-70e4-f0ee08ad5c98",
classname="org.compiere.process.DistributionCreate",
updated="2015-06-20 10:10:12")	
public class DistributionCreate extends SvrProcess
{
	/**	Product					*/
	@XendraProcessParameter(Name="Product",
			                ColumnName="M_Product_ID",
			                Description="Product, Service, Item",
			                Help="Identifies an item which is either purchased or sold in this organization.",
			                AD_Reference_ID=DisplayType.Search,
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
			                Identifier="ec08947e-4d5d-0f93-0936-5566bbd04821")	
	private int 			p_M_Product_ID = 0;
	/** Quantity				*/
	@XendraProcessParameter(Name="Quantity",
			                ColumnName="Qty",
			                Description="Quantity",
			                Help="The Quantity indicates the number of a specific product or item for this document.",
			                AD_Reference_ID=DisplayType.Quantity,
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
			                Identifier="9aa08ccc-2227-7482-b7a1-b892afb1380a")	
	private BigDecimal		p_Qty;
	/**	Single Order			*/
	@XendraProcessParameter(Name="Create Single Order",
			                ColumnName="IsCreateSingleOrder",
			                Description="For all shipments create one Order",
			                Help="",
			                AD_Reference_ID=DisplayType.YesNo,
			                SeqNo=30,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="N",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="73b1284d-3f82-bd18-65df-326b136190ea")	
	private boolean			p_IsCreateSingleOrder;
	/** Single Order BP			*/
	@XendraProcessParameter(Name="Invoice Partner",
			                ColumnName="Bill_BPartner_ID",
			                Description="Business Partner to be invoiced",
			                Help="If empty the shipment business partner will be invoiced",
			                AD_Reference_ID=DisplayType.Table,
			                SeqNo=40,
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
			                Identifier="c1f0bca2-bb02-5457-334e-dc3fbe3bd6ed")	
	private int				p_Bill_BPartner_ID;
	/** SingleOrder Location	*/
	@XendraProcessParameter(Name="Invoice Location",
			                ColumnName="Bill_Location_ID",
			                Description="Business Partner Location for invoicing",
			                Help="",
			                AD_Reference_ID=DisplayType.Table,
			                SeqNo=50,
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
			                Identifier="bcc94242-68f2-4477-b9fa-ee1d03bf8e53")	
	private int				p_Bill_Location_ID;
	/** Test Mode				*/
	@XendraProcessParameter(Name="Test",
			                ColumnName="IsTest",
			                Description="Execute in Test Mode",
			                Help="",
			                AD_Reference_ID=DisplayType.YesNo,
			                SeqNo=60,
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
			                Identifier="bb3f2270-6217-ffaa-cd25-f41a9b983331")	
	private boolean			p_IsTest;
	/**	Distribution List		*/
	private int				p_M_DistributionList_ID;
	
//	DatePromised
//	C_DocType_ID
	
	/**	Distribution List		*/
	private MDistributionList m_dl;
	/** Single Order			*/
	private MOrder			m_singleOrder = null;
	/** Product					*/
	private MProduct		m_product = null;
	/** Total Quantity			*/
	private BigDecimal		m_totalQty = Env.ZERO;
	
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
			else if (name.equals("M_Product_ID"))
				p_M_Product_ID = para[i].getParameterAsInt();
			else if (name.equals("Qty"))
				p_Qty = (BigDecimal)para[i].getParameter();
			else if (name.equals("IsCreateSingleOrder"))
				p_IsCreateSingleOrder = "Y".equals(para[i].getParameter());
			else if (name.equals("Bill_BPartner_ID"))
				p_Bill_BPartner_ID = para[i].getParameterAsInt();
			else if (name.equals("p_Bill_Location_ID"))
				p_Bill_Location_ID = para[i].getParameterAsInt();
			else if (name.equals("IsTest"))
				p_IsTest = "Y".equals(para[i].getParameter());
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);		
		}
		p_M_DistributionList_ID = getRecord_ID();
	}	//	prepare

	/**
	 *  Perform process.
	 *  @return Message (text with variables)
	 *  @throws Exception if not successful
	 */
	protected String doIt() throws Exception
	{
		log.info("M_DistributionList_ID=" + p_M_DistributionList_ID 
			+ ", M_Product_ID=" + p_M_Product_ID + ", Qty=" + p_Qty
			+ ", Test=" + p_IsTest);
		if (p_IsCreateSingleOrder)
			log.info("SingleOrder=" + p_IsCreateSingleOrder
				+ ", BPartner_ID=" + p_Bill_BPartner_ID 
				+ ", Location_ID=" + p_Bill_Location_ID);
		//
		if (p_M_DistributionList_ID == 0)
			throw new IllegalArgumentException ("No Distribution List ID");
		m_dl = new MDistributionList(getCtx(), p_M_DistributionList_ID, get_TrxName());
		if (m_dl.get_ID() == 0)
			throw new Exception ("Distribution List not found -  M_DistributionList_ID=" +  p_M_DistributionList_ID);
		//
		if (p_M_Product_ID == 0)
			throw new IllegalArgumentException ("No Product");
		m_product = MProduct.get (getCtx(), p_M_Product_ID, get_TrxName());
		if (m_product.get_ID() == 0)
			throw new Exception ("Product not found -  M_Product_ID=" +  p_M_Product_ID);
		if (p_Qty == null || p_Qty.signum() != 1)
			throw new IllegalArgumentException ("No Quantity");
		//
		if (p_IsCreateSingleOrder && p_Bill_BPartner_ID == 0)
			throw new IllegalArgumentException ("Invoice Business Partner required for single Order");
		//	Create Single Order
		if (!p_IsTest && p_IsCreateSingleOrder) 
		{
			MBPartner bp = new MBPartner (getCtx(), p_Bill_BPartner_ID, get_TrxName());
			if (bp.get_ID() == 0)
				throw new IllegalArgumentException("Single Business Partner not found - C_BPartner_ID=" + p_Bill_BPartner_ID);
			//
			m_singleOrder = new MOrder (getCtx(), 0, get_TrxName());
			m_singleOrder.setIsSOTrx(true);
			m_singleOrder.setC_DocTypeTarget_ID(REF_C_DocTypeSubType.StandardOrder);
			m_singleOrder.setBPartner(bp);
			if (p_Bill_Location_ID != 0)
				m_singleOrder.setC_BPartner_Location_ID(p_Bill_Location_ID);
			if (!m_singleOrder.save())
				throw new IllegalStateException("Single Order not created");
		}
		
		MDistributionListLine[] lines = m_dl.getLines();
		int counter = 0;
		for (int i = 0; i < lines.length; i++)
		{
			if (createOrder(lines[i]))
				counter++;
		}
		
		//	Update Qty
		if (m_singleOrder != null)
		{
			m_singleOrder.setDescription("# " + counter + " - " + m_totalQty);
			m_singleOrder.save();
		}
		
		return "@Created@ #" + counter + " - @Qty@=" + m_totalQty;
	}	//	doIt

	/**
	 * 	Create Order for Distribution Line
	 *	@param dll Distribution Line
	 *	@return true if created
	 */
	private boolean createOrder (MDistributionListLine dll)
	{
		MBPartner bp = new MBPartner (getCtx(), dll.getC_BPartner_ID(), get_TrxName());
		if (bp.get_ID() == 0)
			throw new IllegalArgumentException("Business Partner not found - C_BPartner_ID=" + dll.getC_BPartner_ID());

		//	Create Order
		MOrder order = m_singleOrder;
		if (!p_IsTest && order == null)
		{
			order = new MOrder (getCtx(), 0, get_TrxName());
			order.setIsSOTrx(true);
			order.setC_DocTypeTarget_ID(REF_C_DocTypeSubType.StandardOrder);
			order.setBPartner(bp);
			if (dll.getC_BPartner_Location_ID() != 0)
				order.setC_BPartner_Location_ID(dll.getC_BPartner_Location_ID());
			if (!order.save())
			{
				log.log(Level.SEVERE, "Order not saved");
				return false;
			}
		}
		//	Calculate Qty
		BigDecimal ratio = dll.getRatio();
		BigDecimal qty = p_Qty.multiply(ratio);
		if (qty.compareTo(Env.ZERO) != 0)
			qty = qty.divide(m_dl.getRatioTotal(), m_product.getUOMPrecision(), BigDecimal.ROUND_HALF_UP);
		BigDecimal minQty = dll.getMinQty();
		if (qty.compareTo(minQty) < 0)
			qty = minQty;
		m_totalQty = m_totalQty.add(qty);
		//
		if (p_IsTest)
		{
			addLog(0,null, qty, bp.getName());
			return false;
		}

		//	Create Order Line
		MOrderLine line = new MOrderLine(order);
		line.setC_BPartner_ID(dll.getC_BPartner_ID());
		if (dll.getC_BPartner_Location_ID() != 0)
			line.setC_BPartner_Location_ID(dll.getC_BPartner_Location_ID());
		//
		line.setM_Product_ID(p_M_Product_ID, true);
		line.setQty(qty);
		line.setPrice();
		if (!line.save())
		{
			log.log(Level.SEVERE, "OrderLine not saved");
			return false;
		}
		
		addLog(0,null, qty, order.getDocumentNo() + ": " + bp.getName());
		return true;
	}	//	createOrder
	
}	//	DistributionCreate
