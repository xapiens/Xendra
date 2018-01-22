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

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.logging.*;

import org.compiere.model.MInOut;
import org.compiere.model.MInOutLine;
import org.compiere.model.MInvoice;
import org.compiere.model.MInvoiceAdvance;
import org.compiere.model.MInvoiceLine;
import org.compiere.model.persistence.X_C_InvoiceAdvanceLine;
import org.compiere.model.reference.REF__DocumentStatus;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;

import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;

/**
 *	Create (Generate) Invoice from Shipment
 *	
 *  @author Jorg Janke
 *  @version $Id: InOutCreateInvoice.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="M_InOut_CreateInvoice",
name="Generate Invoice from Receipt",
description="Create and process Invoice from this receipt.  The receipt should be correct and completed.",
help="Generate Invoice from Receipt will create an invoice based on the selected receipt and match the invoice to that receipt. You can set the document number only if the invoice document type allows to set the document number manually.",
Identifier="403b5cc2-2545-583f-21e6-702f0eac1b53",
classname="org.compiere.process.InOutCreateInvoice",
updated="2015-06-20 10:10:12")
public class InOutCreateInvoice extends SvrProcess
{
	/**	Shipment					*/
	private int 	p_M_InOut_ID = 0;
	/**	Price List Version			*/
	@XendraProcessParameter(Name="M_PriceList_ID",
			                ColumnName="M_PriceList_ID",
			                Description="Unique identifier of a Price List",
			                Help="Price Lists are used to determine the pricing, margin and cost of items purchased or sold.",
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
			                Identifier="177b82c2-3739-8110-cca6-1ddc47a1d979")	
	private int		p_M_PriceList_ID = 0;
	/* Document No					*/
	@XendraProcessParameter(Name="Invoice Document No",
			                ColumnName="InvoiceDocumentNo",
			                Description="Document Number of the Invoice",
			                Help="",
			                AD_Reference_ID=DisplayType.String,
			                SeqNo=20,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=20,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="655930d1-d410-e2a2-ae41-d603dbd6f994")	
	private String	p_InvoiceDocumentNo = null;
	private String  p_Serial = null;
	private MInvoice m_invoice;
	private int m_created;
	private int m_line;
	private String	p_docAction = DocAction.ACTION_Complete;
	@XendraProcessParameter(Name="Tipo de Documento",
			                ColumnName="C_DocTypeTarget_ID",
			                Description="",
			                Help="",
			                AD_Reference_ID=DisplayType.TableDir,
			                SeqNo=30,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=7,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="6a6782cb-c124-5324-15d5-b581d45c1ecd")	
	private Integer p_C_DocTypeTarget_ID;
	private Integer p_C_InvoiceAdvance_ID = 0;
	private BigDecimal p_AdvanceAmount;

	
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
			else if (name.equals("M_PriceList_ID"))
				p_M_PriceList_ID = para[i].getParameterAsInt();
			else if (name.equals("InvoiceDocumentNo"))
				p_InvoiceDocumentNo = (String)para[i].getParameter();
			else if (name.equals("Serial"))
				p_Serial = (String)para[i].getParameter();			
			else if (name.equals("DocAction"))
				p_docAction = (String)para[i].getParameter();
			else if (name.equals("C_DocTypeTarget_ID"))
				p_C_DocTypeTarget_ID = (Integer) para[i].getParameterAsInt();
			else if (name.equals("C_InvoiceAdvance_ID"))
				p_C_InvoiceAdvance_ID = (Integer) para[i].getParameterAsInt();
			else if (name.equals("InvoiceAdvanceAmount"))
				p_AdvanceAmount = (BigDecimal) para[i].getParameter();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
		p_M_InOut_ID = getRecord_ID();
	}	//	prepare

	/**
	 * 	Create Invoice.
	 *	@return document no
	 *	@throws Exception
	 */
	public String doIt () throws Exception
	{
		log.info("M_InOut_ID=" + p_M_InOut_ID 
			+ ", M_PriceList_ID=" + p_M_PriceList_ID
			+ ", InvoiceDocumentNo=" + p_InvoiceDocumentNo);
		if (p_M_InOut_ID == 0)
			throw new IllegalArgumentException("No Shipment");
		//
		MInOut ship = new MInOut (getCtx(), p_M_InOut_ID, null);
		if (ship.get_ID() == 0)
			throw new IllegalArgumentException("Shipment not found");
		if (!REF__DocumentStatus.Completed.equals(ship.getDocStatus()))
			throw new IllegalArgumentException("Shipment not completed");
		
		MInOutLine[] shipLines = ship.getLines(false);
		for (int i = 0; i < shipLines.length; i++)
		{
			MInOutLine sLine = shipLines[i];
			if (sLine.isInvoiced())
				throw new IllegalArgumentException("InOut is invoiced");
		}
		m_invoice = new MInvoice (ship, null);
		if (p_M_PriceList_ID != 0)
			m_invoice.setM_PriceList_ID(p_M_PriceList_ID);
		if (p_InvoiceDocumentNo != null && p_InvoiceDocumentNo.length() > 0)
			m_invoice.setDocumentNo(p_InvoiceDocumentNo);
		if (p_C_DocTypeTarget_ID != 0)
		{
			m_invoice.setC_DocTypeTarget_ID(p_C_DocTypeTarget_ID);
			String Serial = null;
			if (p_Serial == null )
				p_Serial = "";
			if (p_Serial.length() == 0 )
				Serial = DB.getSQLValueString(null, "SELECT s.Serial FROM C_DocType t, AD_Sequence s WHERE t.C_DocType_ID=? AND s.AD_Sequence_ID=t.DocNoSequence_ID", p_C_DocTypeTarget_ID);
			else
				Serial = p_Serial;
			m_invoice.setSerial(Serial);
		}
		

		if (!m_invoice.save())
			throw new IllegalArgumentException("Cannot save Invoice");
		
		ship.setC_Invoice_ID(m_invoice.getC_Invoice_ID());
		
		//MInOutLine[] shipLines = ship.getLines(false);
		for (int i = 0; i < shipLines.length; i++)
		{
			MInOutLine sLine = shipLines[i];
			MInvoiceLine line = new MInvoiceLine(m_invoice);
			line.setShipLine(sLine);
			line.setQtyEntered(sLine.getQtyEntered());
			line.setQtyInvoiced(sLine.getMovementQty());
			if (!line.save())
				throw new IllegalArgumentException("Cannot save Invoice Line");
			sLine.setIsInvoiced(true);
			sLine.save();
		}
		if ( p_C_InvoiceAdvance_ID > 0 )
		{
			MInvoice source = new MInvoice(Env.getCtx(), p_C_InvoiceAdvance_ID, null);
			
			MInvoiceAdvance advance = MInvoiceAdvance.getByInvoice(Env.getCtx(), p_C_InvoiceAdvance_ID, null);
			if (advance == null)
			{
				advance = new MInvoiceAdvance(Env.getCtx(), 0, null);
				advance.setC_Invoice_ID(p_C_InvoiceAdvance_ID);
			}
//			advance.setAmount(advance.getAmount().add(p_AdvanceAmount));
//			if (advance.getAmount().compareTo(source.getGrandTotal()) == 0)
				advance.setProcessed(true);
			advance.save();												
			
			MInvoiceLine[] lines = source.getLines();
			for (MInvoiceLine sourceline : lines)
			{
				MInvoiceLine targetline = new MInvoiceLine(Env.getCtx(), 0, null);
				MInvoiceLine.copyValues(sourceline, targetline);
				targetline.setC_Invoice_ID (m_invoice.getC_Invoice_ID());
				targetline.setInvoice(m_invoice);	
				targetline.setPriceActual(this.p_AdvanceAmount.negate());
				targetline.setPriceEntered(this.p_AdvanceAmount.negate());
				targetline.setProcessed(m_invoice.isProcessed());
				targetline.save();			
				//
				X_C_InvoiceAdvanceLine advanceline = new X_C_InvoiceAdvanceLine(Env.getCtx(), 0 , null);
				advanceline.setC_InvoiceAdvance_ID(advance.getC_InvoiceAdvance_ID());
//				advanceline.setC_InvoiceLine_ID(targetline.getC_InvoiceLine_ID());
				advanceline.save();
			}			
		}
		completeInvoice();
		//return m_invoice.getDocumentNo();
		return "";
	}	//	InOutCreateInvoice
	
	
	/**
	 * 	Complete Shipment
	 */
	private void completeInvoice()
	{
		if (m_invoice != null)
		{
			//	Fails if there is a confirmation
			if (!m_invoice.processIt(p_docAction))
			{
				log.warning("Failed: " + m_invoice);
				return;
			}
			m_invoice.save();
			//
			addLog(m_invoice.getC_Invoice_ID(), m_invoice.getDateInvoiced(), m_invoice.getGrandTotal(), m_invoice.getDocumentNo());
			m_created++;
//			m_map = new HashMap<SParameter,MStorage[]>();
//			if (m_lastPP != null && m_lastStorages != null)
//				m_map.put(m_lastPP, m_lastStorages);
		}
		m_invoice = null;
		m_line = 0;
	}	//	completeOrder

}	//	InOutCreateInvoice
