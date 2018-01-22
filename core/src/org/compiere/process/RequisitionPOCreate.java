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

import java.sql.*;
import java.util.logging.*;

import org.compiere.model.MBPartner;
import org.compiere.model.MCharge;
import org.compiere.model.MOrder;
import org.compiere.model.MOrderLine;
import org.compiere.model.MProduct;
import org.compiere.model.MProductPO;
import org.compiere.model.MRequisition;
import org.compiere.model.MRequisitionLine;
import org.compiere.model.reference.REF__DocumentStatus;
import org.compiere.util.*;

import org.xendra.annotations.*;
/**
 * 	Create PO from Requisition 
 *	
 *	
 *  @author Jorg Janke
 *  @version $Id: RequisitionPOCreate.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="M_Requisition_POCreate",
name="Create PO from Requisition",
description="Create Purchase Orders from Requisitions",
help="Create Purchase orders from Purchase Requisitions.",
Identifier="16fcc8b5-e63f-228c-dec5-e6c3f2dbe6d9",
classname="org.compiere.process.RequisitionPOCreate",
updated="2015-06-20 10:10:12")	
public class RequisitionPOCreate extends SvrProcess
{
	/** Org					*/
	@XendraProcessParameter(Name="Organization",
			                ColumnName="AD_Org_ID",
			                Description="Organizational entity within client",
			                Help="An organization is a unit of your client or legal entity - examples are store, department. You can share data between organizations.",
			                AD_Reference_ID=DisplayType.TableDir,
			                SeqNo=10,
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
			                Identifier="5520657b-d597-6d56-b87f-c1b2041397b9")	
	private int			p_AD_Org_ID = 0;
	/** Warehouse			*/
	@XendraProcessParameter(Name="Warehouse",
			                ColumnName="M_Warehouse_ID",
			                Description="Storage Warehouse and Service Point",
			                Help="The Warehouse identifies a unique Warehouse where products are stored or Services are provided.",
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
			                Identifier="45806e26-a109-a4af-4ebd-05402ac1164c")
	private int			p_M_Warehouse_ID = 0;
	/**	Doc Date From		*/
	@XendraProcessParameter(Name="DateDoc",
			                ColumnName="DateDoc",
			                Description="Date of the Document",
			                Help="The Document Date indicates the date the document was generated.  It may or may not be the same as the accounting date.",
			                AD_Reference_ID=DisplayType.Date,
			                SeqNo=30,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=false,
			                IsRange=true,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="cb84a910-e60b-76b9-929c-70437bc4c1d1")	
	private Timestamp	p_DateDoc_From;
	/**	Doc Date To			*/
	private Timestamp	p_DateDoc_To;
	/**	Doc Date From		*/
	@XendraProcessParameter(Name="Date Required",
			                ColumnName="DateRequired",
			                Description="Date when required",
			                Help="",
			                AD_Reference_ID=DisplayType.Date,
			                SeqNo=40,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=false,
			                IsRange=true,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="cda43fa0-051b-7b01-8229-4c9503245b91")	
	private Timestamp	p_DateRequired_From;
	/**	Doc Date To			*/
	private Timestamp	p_DateRequired_To;
	/** Priority			*/
	@XendraProcessParameter(Name="Priority",
			                ColumnName="PriorityRule",
			                Description="Priority of a document",
			                Help="The Priority indicates the importance (high, medium, low) of this document",
			                AD_Reference_ID=DisplayType.List,
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
			                Identifier="4509dee8-ad70-e9c6-9a6b-1b5db61ad254")	
	private String		p_PriorityRule = null;
	/** User				*/
	@XendraProcessParameter(Name="User/Contact",
			                ColumnName="AD_User_ID",
			                Description="User within the system - Internal or Business Partner Contact",
			                Help="The User identifies a unique user in the system. This could be an internal user or a business partner contact",
			                AD_Reference_ID=DisplayType.Search,
			                SeqNo=60,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="-1",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="7ff645f1-4a43-a4d6-b4ec-0532acef6ed8")	
	private int			p_AD_User_ID = 0;
	/** Product				*/
	@XendraProcessParameter(Name="Product",
			                ColumnName="M_Product_ID",
			                Description="Product, Service, Item",
			                Help="Identifies an item which is either purchased or sold in this organization.",
			                AD_Reference_ID=DisplayType.Search,
			                SeqNo=70,
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
			                Identifier="91c4a333-cea3-b958-4854-af9c78db5741")	
	private int			p_M_Product_ID = 0;
	/** Requisition			*/
	@XendraProcessParameter(Name="Requisition",
			                ColumnName="M_Requisition_ID",
			                Description="Material Requisition",
			                Help="",
			                AD_Reference_ID=DisplayType.TableDir,
			                SeqNo=5,
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
			                Identifier="1f4f2b3f-3eca-b8fd-7fe5-f22129ad3c52")	
	private int 		p_M_Requisition_ID = 0;

	/** Consolidate			*/
	@XendraProcessParameter(Name="Consolidate to one Document",
			                ColumnName="ConsolidateDocument",
			                Description="Consolidate Lines into one Document",
			                Help="",
			                AD_Reference_ID=DisplayType.YesNo,
			                SeqNo=80,
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
			                Identifier="18554fe6-3538-833d-7af7-25ab257e55df")	
	private boolean		p_ConsolidateDocument = false;

	/** Order				*/
	private MOrder		m_order = null;
	/** Order Line			*/
	private MOrderLine	m_orderLine = null;
	
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
			else if (name.equals("AD_Org_ID"))
				p_AD_Org_ID = para[i].getParameterAsInt();
			else if (name.equals("M_Warehouse_ID"))
				p_M_Warehouse_ID = para[i].getParameterAsInt();
			else if (name.equals("DateDoc"))
			{
				p_DateDoc_From = (Timestamp)para[i].getParameter();
				p_DateDoc_To = (Timestamp)para[i].getParameter_To();
			}
			else if (name.equals("DateRequired"))
			{
				p_DateRequired_From = (Timestamp)para[i].getParameter();
				p_DateRequired_To = (Timestamp)para[i].getParameter_To();
			}
			else if (name.equals("PriorityRule"))
				p_PriorityRule = (String)para[i].getParameter();
			else if (name.equals("AD_User_ID"))
				p_AD_User_ID = para[i].getParameterAsInt();
			else if (name.equals("M_Product_ID"))
				p_M_Product_ID = para[i].getParameterAsInt();
			else if (name.equals("M_Requisition_ID"))
				p_M_Requisition_ID = para[i].getParameterAsInt();
			else if (name.equals("ConsolidateDocument"))
				p_ConsolidateDocument = "Y".equals(para[i].getParameter());
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}	//	prepare
	
	/**
	 * 	Process
	 *	@return info
	 *	@throws Exception
	 */
	protected String doIt() throws Exception
	{
		//	Specific
		if (p_M_Requisition_ID != 0)
		{
			log.info("M_Requisition_ID=" + p_M_Requisition_ID);
			MRequisition req = new MRequisition(getCtx(), p_M_Requisition_ID, get_TrxName());
			if (!REF__DocumentStatus.Completed.equals(req.getDocStatus()))
				throw new XendraUserError("@DocStatus@ = " + req.getDocStatus());
			MRequisitionLine[] lines = req.getLines();
			for (int i = 0; i < lines.length; i++)
			{
				if (lines[i].getC_OrderLine_ID() == 0)
					process (lines[i]);
			}
			closeOrder();
			return "";
		}	//	single Requisition
		
		//	
		log.info("AD_Org_ID=" + p_AD_Org_ID
			+ ", M_Warehouse_ID=" + p_M_Warehouse_ID
			+ ", DateDoc=" + p_DateDoc_From + "/" + p_DateDoc_To
			+ ", DateRequired=" + p_DateRequired_From + "/" + p_DateRequired_To
			+ ", PriorityRule=" + p_PriorityRule
			+ ", AD_User_ID=" + p_AD_User_ID
			+ ", M_Product_ID=" + p_M_Product_ID
			+ ", ConsolidateDocument" + p_ConsolidateDocument);
		
		StringBuffer sql = new StringBuffer("SELECT * FROM M_RequisitionLine rl ")
			.append("WHERE rl.C_OrderLine_ID IS NULL");
		if (p_AD_Org_ID != 0)
			sql.append(" AND AD_Org_ID=?");
		if (p_M_Product_ID != 0)
			sql.append(" AND M_Product_ID=?");
		//	Requisition Header
		sql.append(" AND EXISTS (SELECT * FROM M_Requisition r WHERE rl.M_Requisition_ID=r.M_Requisition_ID")
			.append(" AND r.DocStatus='CO'");
		if (p_M_Warehouse_ID != 0)
			sql.append(" AND r.M_Warehouse_ID=?");
		//
		if (p_DateDoc_From != null && p_DateDoc_To != null)
			sql.append(" AND r.DateDoc BETWEEN ? AND ?");
		else if (p_DateDoc_From != null)
			sql.append(" AND r.DateDoc => ?");
		else if (p_DateDoc_To != null)
			sql.append(" AND r.DateDoc <= ?");
		//
		if (p_DateRequired_From != null && p_DateRequired_To != null)
			sql.append(" AND r.DateRequired BETWEEN ? AND ?");
		else if (p_DateRequired_From != null)
			sql.append(" AND r.DateRequired => ?");
		else if (p_DateRequired_To != null)
			sql.append(" AND r.DateRequired <= ?");
		//
		if (p_PriorityRule != null)
			sql.append(" AND r.PriorityRule => ?");
		if (p_AD_User_ID != 0)
			sql.append(" AND r.AD_User_ID=?");
		//
		sql.append(") ORDER BY ");
		if (!p_ConsolidateDocument)
			sql.append("M_Requisition_ID, ");
		sql.append("M_Product_ID, C_Charge_ID, M_AttributeSetInstance_ID");
		
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql.toString(), get_TrxName());
			int index = 1;
			if (p_AD_Org_ID != 0)
				pstmt.setInt (index++, p_AD_Org_ID);
			if (p_M_Product_ID != 0)
				pstmt.setInt (index++, p_M_Product_ID);
			if (p_M_Warehouse_ID != 0)
				pstmt.setInt (index++, p_M_Warehouse_ID);
			if (p_DateDoc_From != null && p_DateDoc_To != null)
			{
				pstmt.setTimestamp(index++, p_DateDoc_From);
				pstmt.setTimestamp(index++, p_DateDoc_To);
			}
			else if (p_DateDoc_From != null)
				pstmt.setTimestamp(index++, p_DateDoc_From);
			else if (p_DateDoc_To != null)
				pstmt.setTimestamp(index++, p_DateDoc_To);
			if (p_DateRequired_From != null && p_DateRequired_To != null)
			{
				pstmt.setTimestamp(index++, p_DateRequired_From);
				pstmt.setTimestamp(index++, p_DateRequired_To);
			}
			else if (p_DateRequired_From != null)
				pstmt.setTimestamp(index++, p_DateRequired_From);
			else if (p_DateRequired_To != null)
				pstmt.setTimestamp(index++, p_DateRequired_To);
			if (p_PriorityRule != null)
				pstmt.setString(index++, p_PriorityRule);
			if (p_AD_User_ID != 0)
				pstmt.setInt (index++, p_AD_User_ID);
			ResultSet rs = pstmt.executeQuery ();
			while (rs.next ())
			{
				process (new MRequisitionLine (getCtx(), rs, get_TrxName()));
			}
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log (Level.SEVERE, sql.toString(), e);
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
		closeOrder();
		return "";
	}	//	doit
	
	private int 		m_M_Requisition_ID = 0;
	private int 		m_M_Product_ID = 0;
	private int			m_M_AttributeSetInstance_ID = 0;
	/** BPartner				*/
	private MBPartner	m_bpartner = null;
	
	/**
	 * 	Process Line
	 *	@param rLine request line
	 * 	@throws Exception
	 */
	private void process (MRequisitionLine rLine) throws Exception
	{
		if (rLine.getM_Product_ID() == 0 && rLine.getC_Charge_ID() == 0)
		{
			log.warning("Ignored Line" + rLine.getLine() 
				+ " " + rLine.getDescription()
				+ " - " + rLine.getLineNetAmt());
			return;
		}
		
		if (!p_ConsolidateDocument
			&& rLine.getM_Requisition_ID() != m_M_Requisition_ID)
			closeOrder();
		if (m_orderLine == null
			|| rLine.getM_Product_ID() != m_M_Product_ID
			|| rLine.getM_AttributeSetInstance_ID() != m_M_AttributeSetInstance_ID
			|| rLine.getC_Charge_ID() != 0)		//	single line per charge
			newLine(rLine);

		//	Update Order Line
		m_orderLine.setQty(m_orderLine.getQtyOrdered().add(rLine.getQty()));
		//	Update Requisition Line
		rLine.setC_OrderLine_ID(m_orderLine.getC_OrderLine_ID());
		if (!rLine.save())
			throw new XendraSystemError("Cannot update Request Line");
	}	//	process
	
	/**
	 * 	Create new Order
	 *	@param rLine request line
	 *	@param C_BPartner_ID b.partner
	 * 	@throws Exception
	 */
	private void newOrder(MRequisitionLine rLine, int C_BPartner_ID) throws Exception
	{
		if (m_order != null)
			closeOrder();
		//	BPartner
		if (m_bpartner == null || C_BPartner_ID != m_bpartner.getC_BPartner_ID())
			m_bpartner = new MBPartner (getCtx(), C_BPartner_ID, null);

		//	Order
		m_order = new MOrder(getCtx(), 0, get_TrxName());
		m_order.setIsSOTrx(false);
		m_order.setC_DocTypeTarget_ID();
		m_order.setBPartner(m_bpartner);
		//	default po document type
		if (!p_ConsolidateDocument)
			m_order.setDescription(Msg.getElement(getCtx(), "M_Requisition_ID") 
				+ ": " + rLine.getParent().getDocumentNo());
		
		//	Prepare Save
		m_M_Requisition_ID = rLine.getM_Requisition_ID();
		if (!m_order.save())
			throw new XendraSystemError("Cannot save Order");
	}	//	newOrder

	/**
	 * 	Close Order
	 * 	@throws Exception
	 */
	private void closeOrder() throws Exception
	{
		if (m_orderLine != null)
		{
			if (!m_orderLine.save())
				throw new XendraSystemError("Cannot update Order Line");
		}
		if (m_order != null)
		{
			m_order.load(get_TrxName());
			addLog(0, null, m_order.getGrandTotal(), m_order.getDocumentNo());
		}
		m_order = null;
		m_orderLine = null;
	}	//	closeOrder

	
	/**
	 * 	New Order Line (different Product)
	 *	@param rLine request line
	 * 	@throws Exception
	 */
	private void newLine(MRequisitionLine rLine) throws Exception
	{
		if (m_orderLine != null)
			if (!m_orderLine.save())
				throw new XendraSystemError("Cannot update Order Line");
		m_orderLine = null;
		MProduct product = null;

		//	Get Business Partner
		int C_BPartner_ID = rLine.getC_BPartner_ID();
		if (C_BPartner_ID != 0)
			;
		else if (rLine.getC_Charge_ID() != 0)
		{
			MCharge charge = MCharge.get(getCtx(), rLine.getC_Charge_ID());
			C_BPartner_ID = charge.getC_BPartner_ID();
			if (C_BPartner_ID == 0)
				throw new XendraUserError("No Vendor for Charge " + charge.getName());
		}
		else
		{
			//	Find Vendor from Produt
			product = MProduct.get(getCtx(), rLine.getM_Product_ID(), get_TrxName());
			MProductPO[] ppos = MProductPO.getOfProduct(getCtx(), product.getM_Product_ID(), null);
			for (int i = 0; i < ppos.length; i++)
			{
				if (ppos[i].isCurrentVendor() && ppos[i].getC_BPartner_ID() != 0)
				{
					C_BPartner_ID = ppos[i].getC_BPartner_ID();
					break;
				}
			}
			if (C_BPartner_ID == 0 && ppos.length > 0)
				C_BPartner_ID = ppos[0].getC_BPartner_ID();
			if (C_BPartner_ID == 0)
				throw new XendraUserError("No Vendor for " + product.getName());
		}

		//	New Order - Different Vendor
		if (m_order == null 
			|| m_order.getC_BPartner_ID() != C_BPartner_ID)
			newOrder(rLine, C_BPartner_ID);
		
		
		//	No Order Line
		m_orderLine = new MOrderLine(m_order);
		if (product != null)
		{
			m_orderLine.setProduct(product);
			m_orderLine.setM_AttributeSetInstance_ID(rLine.getM_AttributeSetInstance_ID());
		}
		else
		{
			m_orderLine.setC_Charge_ID(rLine.getC_Charge_ID());
			m_orderLine.setPriceActual(rLine.getPriceActual());
		}
		m_orderLine.setAD_Org_ID(rLine.getAD_Org_ID());
				
		
		//	Prepare Save
		m_M_Product_ID = rLine.getM_Product_ID();
		m_M_AttributeSetInstance_ID = rLine.getM_AttributeSetInstance_ID();
		if (!m_orderLine.save())
			throw new XendraSystemError("Cannot save Order Line");
	}	//	newLine
	
}	//	RequisitionPOCreate
