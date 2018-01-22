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
import org.compiere.model.MInOut;
import org.compiere.model.MInOutLine;
import org.compiere.model.MInvoice;
import org.compiere.model.MInvoiceLine;
import org.compiere.model.MInvoiceSchedule;
import org.compiere.model.MOrder;
import org.compiere.model.MOrderLine;
import org.compiere.model.MProduct;
import org.compiere.model.reference.REF_C_OrderInvoiceRule;
import org.compiere.model.reference.REF__DocumentStatus;
import org.compiere.util.*;

import org.xendra.exceptions.XendraException;
import org.xendra.annotations.*;
/**
 *	Generate Invoices
 *	
 *  @author Jorg Janke
 *  @version $Id: InvoiceGenerate.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="C_Invoice_Generate",
name="Generate Invoices",
description="Generate and print Invoices from open Orders",
help="Invoices for open Orders are created based on the invoice rule of the Order. If several Orders of a business partner have the same bill location, the orders can be consolidated into one Invoice.",
Identifier="93d20d1c-0352-88ec-fc7a-87eded370bef",
classname="org.compiere.process.InvoiceGenerate",
updated="2015-06-20 10:10:12")
public class InvoiceGenerate extends SvrProcess
{
	/**	Manual Selection		*/
	@XendraProcessParameter(Name="Selection",
            ColumnName="Selection",
            Description="Manual Selection",
            Help="",
            AD_Reference_ID=DisplayType.YesNo,
            SeqNo=5,
            ReferenceValueID="",
            ValRuleID="",
            FieldLength=1,
            IsMandatory=false,
            IsRange=false,
            DefaultValue="N",
            DefaultValue2="",
            vFormat="",
            valueMin="",
            valueMax="",
            DisplayLogic="",
            ReadOnlyLogic="",
            Identifier="c2b99855-df90-2180-b1a0-4ba6bdc21909")	
	private boolean 	p_Selection = false;
	/**	Date Invoiced			*/
	@XendraProcessParameter(Name="Date Invoiced",
			                ColumnName="DateInvoiced",
			                Description="Date printed on Invoice",
			                Help="The Date Invoice indicates the date printed on the invoice.",
			                AD_Reference_ID=DisplayType.Date,
			                SeqNo=10,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=1,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="@#Date@",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="acc7c777-08d4-58b0-7118-7eda227f4e5b")	
	private Timestamp	p_DateInvoiced = null;
	/**	Org						*/
	@XendraProcessParameter(Name="Organization",
			                ColumnName="AD_Org_ID",
			                Description="Organizational entity within client",
			                Help="An organization is a unit of your client or legal entity - examples are store, department. You can share data between organizations.",
			                AD_Reference_ID=DisplayType.Table,
			                SeqNo=15,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="@#AD_Org_ID@",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="8551520a-1c3d-6267-0497-8c36c9693cb5")	
	private int			p_AD_Org_ID = 0;
	/** BPartner				*/
	@XendraProcessParameter(Name="Business Partner ",
			                ColumnName="C_BPartner_ID",
			                Description="Identifies a Business Partner",
			                Help="A Business Partner is anyone with whom you transact.  This can include Vendor, Customer, Employee or Salesperson",
			                AD_Reference_ID=DisplayType.TableDir,
			                SeqNo=30,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=1,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="16451a92-9a01-19ff-8dab-9aad0dfbdd53")	
	private int			p_C_BPartner_ID = 0;
	/** Order					*/
	@XendraProcessParameter(Name="Order",
			                ColumnName="C_Order_ID",
			                Description="Order",
			                Help="The Order is a control document.  The  Order is complete when the quantity ordered is the same as the quantity shipped and invoiced.  When you cloase an order, unshipped (backordered) quantities are cancelled.",
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
			                Identifier="1f9dd24c-4ac6-215b-0734-12f24b3aedfb")	
	private int			p_C_Order_ID = 0;
	/** Consolidate				*/
	@XendraProcessParameter(Name="Consolidate to one Document",
			                ColumnName="ConsolidateDocument",
			                Description="Consolidate Lines into one Document",
			                Help="",
			                AD_Reference_ID=DisplayType.YesNo,
			                SeqNo=50,
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
			                Identifier="ac385552-b4a2-b900-e128-2c01d5db365f")	
	private boolean		p_ConsolidateDocument = true;
	/** Invoice Document Action	*/
	@XendraProcessParameter(Name="Document Action",
			                ColumnName="DocAction",
			                Description="The targeted status of the document",
			                Help="You find the current status in the Document Status field. The options are listed in a popup",
			                AD_Reference_ID=DisplayType.List,
			                SeqNo=40,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="CO",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="5a99a454-4b17-f456-8b0f-8f2ed74cc89e")	
	private String		p_docAction = DocAction.ACTION_Complete;
	/** Target Document Type */
	private int			p_C_DocType_ID = 0;
	
	/**	The current Invoice	*/
	private MInvoice 	m_invoice = null;
	/**	The current Shipment	*/
	private MInOut	 	m_ship = null;
	/** Numner of Invoices		*/
	private int			m_created = 0;
	/**	Line Number				*/
	private int			m_line = 0;
	/**	Business Partner		*/
	private MBPartner	m_bp = null;
	
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
			else if (name.equals("Selection"))
				p_Selection = "Y".equals(para[i].getParameter());
			else if (name.equals("DateInvoiced"))
				p_DateInvoiced = (Timestamp)para[i].getParameter();
			else if (name.equals("AD_Org_ID"))
				p_AD_Org_ID = para[i].getParameterAsInt();
			else if (name.equals("C_BPartner_ID"))
				p_C_BPartner_ID = para[i].getParameterAsInt();
			else if (name.equals("C_Order_ID"))
				p_C_Order_ID = para[i].getParameterAsInt();
			else if (name.equals("ConsolidateDocument"))
				p_ConsolidateDocument = "Y".equals(para[i].getParameter());
			else if (name.equals("DocAction"))
				p_docAction = (String)para[i].getParameter();
			else if (name.equals("C_DocType_ID"))
				p_C_DocType_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}

		//	Login Date
		if (p_DateInvoiced == null)
			p_DateInvoiced = new Timestamp(System.currentTimeMillis());

		//	DocAction check
		if (!DocAction.ACTION_Complete.equals(p_docAction))
			p_docAction = DocAction.ACTION_Prepare;
	}	//	prepare

	/**
	 * 	Generate Invoices
	 *	@return info
	 *	@throws Exception
	 */
	public String doIt () throws Exception
	{
		log.info("Selection=" + p_Selection + ", DateInvoiced=" + p_DateInvoiced
			+ ", AD_Org_ID=" + p_AD_Org_ID + ", C_BPartner_ID=" + p_C_BPartner_ID
			+ ", C_Order_ID=" + p_C_Order_ID + ", DocAction=" + p_docAction 
			+ ", Consolidate=" + p_ConsolidateDocument);
		//
		String sql = null;
		if (p_Selection)	//	VInvoiceGen
		{
			sql = "SELECT C_Order.* FROM C_Order, T_Selection "
				+ "WHERE C_Order.DocStatus='CO' AND C_Order.IsSOTrx='Y' "
				+ "AND C_Order.C_Order_ID = T_Selection.T_Selection_ID "
				+ "AND T_Selection.AD_PInstance_ID=? "
				+ "ORDER BY C_Order.M_Warehouse_ID, C_Order.PriorityRule, C_Order.C_BPartner_ID, C_Order.C_Order_ID";
		}
		else
		{
			sql = "SELECT * FROM C_Order o "
				+ "WHERE DocStatus IN('CO','CL') AND IsSOTrx='Y'";
			if (p_AD_Org_ID != 0)
				sql += " AND AD_Org_ID=?";
			if (p_C_BPartner_ID != 0)
				sql += " AND C_BPartner_ID=?";
			if (p_C_Order_ID != 0)
				sql += " AND C_Order_ID=?";
			//
			sql += " AND EXISTS (SELECT * FROM C_OrderLine ol "
					+ "WHERE o.C_Order_ID=ol.C_Order_ID AND ol.QtyOrdered<>ol.QtyInvoiced) "
				+ "ORDER BY M_Warehouse_ID, PriorityRule, C_BPartner_ID, C_Order_ID";
		}
	//	sql += " FOR UPDATE";
		
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, get_TrxName());
			int index = 1;
			if (p_Selection) 
			{
				pstmt.setInt(index, getAD_PInstance_ID());
			}
			else
			{
				if (p_AD_Org_ID != 0)
					pstmt.setInt(index++, p_AD_Org_ID);
				if (p_C_BPartner_ID != 0)
					pstmt.setInt(index++, p_C_BPartner_ID);
				if (p_C_Order_ID != 0)
					pstmt.setInt(index++, p_C_Order_ID);
			}
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, sql, e);
		}
		return generate(pstmt);
	}	//	doIt
	
	
	/**
	 * 	Generate Shipments
	 * 	@param pstmt order query 
	 *	@return info
	 */
	private String generate (PreparedStatement pstmt)
	{
		try
		{
			ResultSet rs = pstmt.executeQuery ();
			while (rs.next ())
			{
				MOrder order = new MOrder (getCtx(), rs, get_TrxName());
				
				//	New Invoice Location
				if (!p_ConsolidateDocument 
					|| (m_invoice != null 
					&& m_invoice.getC_BPartner_Location_ID() != order.getBill_Location_ID()) )
					completeInvoice();
				boolean completeOrder = REF_C_OrderInvoiceRule.AfterOrderDelivered.equals(order.getInvoiceRule());
				
				//	Schedule After Delivery
				boolean doInvoice = false;
				if (REF_C_OrderInvoiceRule.CustomerScheduleAfterDelivery.equals(order.getInvoiceRule()))
				{
					m_bp = new MBPartner (getCtx(), order.getBill_BPartner_ID(), null);
					if (m_bp.getC_InvoiceSchedule_ID() == 0)
					{
						log.warning("BPartner has no Schedule - set to After Delivery");
						order.setInvoiceRule(REF_C_OrderInvoiceRule.AfterDelivery);
						order.save();
					}
					else
					{
						MInvoiceSchedule is = MInvoiceSchedule.get(getCtx(), m_bp.getC_InvoiceSchedule_ID(), get_TrxName());
						if (is.canInvoice(order.getDateOrdered(), order.getGrandTotal()))
							doInvoice = true;
						else
							continue;
					}
				}	//	Schedule
				
				//	After Delivery
				if (doInvoice || REF_C_OrderInvoiceRule.AfterDelivery.equals(order.getInvoiceRule()))
				{
					MInOut[] shipments = order.getShipments();
					if (shipments.length == 0)
					{
						MOrderLine[] oLines = order.getLines(true, null);
						for (MOrderLine line:oLines)
						{
							MProduct product = MProduct.get(Env.getCtx(), line.getM_Product_ID(), get_TrxName());
							if (!product.isService())
								throw new XendraException("existe un producto que no es servicio sin guias emitidas");
							else
							{
								BigDecimal toInvoice = line.getQtyOrdered().subtract(line.getQtyInvoiced());
								BigDecimal qtyEntered = toInvoice;
								//	Correct UOM for QtyEntered
								if (line.getQtyEntered().compareTo(line.getQtyOrdered()) != 0)
									qtyEntered = toInvoice
										.multiply(line.getQtyEntered())
										.divide(line.getQtyOrdered(), 12, BigDecimal.ROUND_HALF_UP);
								createLine (order, line, toInvoice, qtyEntered);														
							}
						}
					}
					else
					{
						for (int i = 0; i < shipments.length; i++)
						{
							MInOut ship = shipments[i];
							if (!ship.isComplete()		//	ignore incomplete or reversals 
									|| ship.getDocStatus().equals(REF__DocumentStatus.Reversed))
								continue;
							MInOutLine[] shipLines = ship.getLines(false);
							for (int j = 0; j < shipLines.length; j++)
							{
								MInOutLine shipLine = shipLines[j];
								if (!order.isOrderLine(shipLine.getC_OrderLine_ID()))
									continue;
								if (!shipLine.isInvoiced())
									createLine (order, ship, shipLine);
							}
							m_line += 1000;
						}
					}
				}
				//	After Order Delivered, Immediate
				else
				{
					MOrderLine[] oLines = order.getLines(true, null);
					for (int i = 0; i < oLines.length; i++)
					{
						MOrderLine oLine = oLines[i];
						BigDecimal toInvoice = oLine.getQtyOrdered().subtract(oLine.getQtyInvoiced());
						if (toInvoice.compareTo(Env.ZERO) == 0 && oLine.getM_Product_ID() != 0)
							continue;
						BigDecimal notInvoicedShipment = oLine.getQtyDelivered().subtract(oLine.getQtyInvoiced());
						//
						boolean fullyDelivered = oLine.getQtyOrdered().compareTo(oLine.getQtyDelivered()) == 0;
					
						//	Complete Order
						if (completeOrder && !fullyDelivered)
						{
							log.fine("Failed CompleteOrder - " + oLine);
							completeOrder = false;
							break;
						}
						//	Immediate
						else if (REF_C_OrderInvoiceRule.Immediate.equals(order.getInvoiceRule()))
						{
							log.fine("Immediate - ToInvoice=" + toInvoice + " - " + oLine);
							BigDecimal qtyEntered = toInvoice;
							//	Correct UOM for QtyEntered
							if (oLine.getQtyEntered().compareTo(oLine.getQtyOrdered()) != 0)
								qtyEntered = toInvoice
									.multiply(oLine.getQtyEntered())
									.divide(oLine.getQtyOrdered(), 12, BigDecimal.ROUND_HALF_UP);
							createLine (order, oLine, toInvoice, qtyEntered);
						}
						else
							log.fine("Failed: " + order.getInvoiceRule() 
								+ " - ToInvoice=" + toInvoice + " - " + oLine);
					}	//	for all order lines
					if (REF_C_OrderInvoiceRule.Immediate.equals(order.getInvoiceRule()))
						m_line += 1000;
				}
				
				//	Complete Order successful
				if (completeOrder && REF_C_OrderInvoiceRule.AfterOrderDelivered.equals(order.getInvoiceRule()))
				{
					MInOut[] shipments = order.getShipments();
					for (int i = 0; i < shipments.length; i++)
					{
						MInOut ship = shipments[i];
						if (!ship.isComplete()		//	ignore incomplete or reversals 
							|| ship.getDocStatus().equals(REF__DocumentStatus.Reversed))
							continue;
						MInOutLine[] shipLines = ship.getLines(false);
						for (int j = 0; j < shipLines.length; j++)
						{
							MInOutLine shipLine = shipLines[j];
							if (!order.isOrderLine(shipLine.getC_OrderLine_ID()))
								continue;
							if (!shipLine.isInvoiced())
								createLine (order, ship, shipLine);
						}
						m_line += 1000;
					}
				}	//	complete Order
			}	//	for all orders
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, "", e);
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
		completeInvoice();
		return "@Created@ = " + m_created;
	}	//	generate
	
	
	
	/**************************************************************************
	 * 	Create Invoice Line from Order Line
	 *	@param order order
	 *	@param orderLine line
	 *	@param qtyInvoiced qty
	 *	@param qtyEntered qty
	 */
	private void createLine (MOrder order, MOrderLine orderLine, 
		BigDecimal qtyInvoiced, BigDecimal qtyEntered)
	{
		if (m_invoice == null)
		{
			m_invoice = new MInvoice (order, p_C_DocType_ID, p_DateInvoiced);
			if (!m_invoice.save())
				throw new IllegalStateException("Could not create Invoice (o)");
		}
		//	
		MInvoiceLine line = new MInvoiceLine (m_invoice);
		line.setOrderLine(orderLine);
		line.setQtyInvoiced(qtyInvoiced);
		line.setQtyEntered(qtyEntered);
		//line.setLine(m_line + orderLine.getLine());
		if (!line.save())
			throw new IllegalStateException("Could not create Invoice Line (o)");
		log.fine(line.toString());
	}	//	createLine

	/**
	 * 	Create Invoice Line from Shipment
	 *	@param order order
	 *	@param ship shipment header
	 *	@param sLine shipment line
	 */
	private void createLine (MOrder order, MInOut ship, MInOutLine sLine)
	{
		if (m_invoice == null)
		{
			m_invoice = new MInvoice (order, p_C_DocType_ID, p_DateInvoiced);
			if (!m_invoice.save())
				throw new IllegalStateException("Could not create Invoice (s)");
		}
		//	Create Shipment Comment Line
		if (m_ship == null 
			|| m_ship.getM_InOut_ID() != ship.getM_InOut_ID())
		{
			// comments because this stuff don't work for pre printing -- xapiens
			//
			//			MDocType dt = MDocType.get(getCtx(), ship.getC_DocType_ID());
			//			if (m_bp == null || m_bp.getC_BPartner_ID() != ship.getC_BPartner_ID())
			//				m_bp = new MBPartner (getCtx(), ship.getC_BPartner_ID(), get_TrxName());
			//			
			//			//	Reference: Delivery: 12345 - 12.12.12
			//			MClient client = MClient.get(getCtx(), order.getAD_Client_ID ());
			//			String AD_Language = client.getAD_Language();
			//			if (client.isMultiLingualDocument() && m_bp.getAD_Language() != null)
			//				AD_Language = m_bp.getAD_Language();
			//			if (AD_Language == null)
			//				AD_Language = Language.getBaseAD_Language();
			//			java.text.SimpleDateFormat format = DisplayType.getDateFormat 
			//				(DisplayType.Date, Language.getLanguage(AD_Language));
			//			String reference = dt.getPrintName(m_bp.getAD_Language())
			//				+ ": " + ship.getDocumentNo() 
			//				+ " - " + format.format(ship.getMovementDate());
			//			m_ship = ship;
			//			
			//MInvoiceLine line = new MInvoiceLine (m_invoice);
			//line.setIsDescription(true);
			//line.setDescription(reference);
			//line.setLine(m_line + sLine.getLine() - 2);
			//if (!line.save())
			//	throw new IllegalStateException("Could not create Invoice Comment Line (sh)");
			//	Optional Ship Address if not Bill Address
			//if (order.getBill_Location_ID() != ship.getC_BPartner_Location_ID())
			//{
			//	MLocation addr = MLocation.getBPLocation(getCtx(), ship.getC_BPartner_Location_ID(), null);
			//	line = new MInvoiceLine (m_invoice);
			//	line.setIsDescription(true);
			//	line.setDescription(addr.toString());
			//	line.setLine(m_line + sLine.getLine() - 1);
			//	if (!line.save())
			//		throw new IllegalStateException("Could not create Invoice Comment Line 2 (sh)");
			//}
		}
		//	
		MInvoiceLine line = new MInvoiceLine (m_invoice);
		line.setShipLine(sLine);
		line.setQtyEntered(sLine.getQtyEntered());
		line.setQtyInvoiced(sLine.getMovementQty());
		//line.setLine(m_line + sLine.getLine());
		if (!line.save())
			throw new IllegalStateException("Could not create Invoice Line (s)");
		//	Link
		sLine.setIsInvoiced(true);
		if (!sLine.save())
			throw new IllegalStateException("Could not update Shipment Line");
		
		log.fine(line.toString());
	}	//	createLine

	
	/**
	 * 	Complete Invoice
	 */
	private void completeInvoice()
	{
		if (m_invoice != null)
		{
			if (!m_invoice.processIt(p_docAction))
				log.warning("completeInvoice - failed: " + m_invoice);
			m_invoice.save();
			//
			addLog(m_invoice.getC_Invoice_ID(), m_invoice.getDateInvoiced(), null, m_invoice.getDocumentNo());
			m_created++;
		}
		m_invoice = null;
		m_ship = null;
		m_line = 0;
	}	//	completeInvoice
	
}	//	InvoiceGenerate
