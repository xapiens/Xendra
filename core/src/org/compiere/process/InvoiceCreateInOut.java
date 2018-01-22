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

import java.util.logging.*;

import org.compiere.util.*;
import org.compiere.model.MInOut;
import org.compiere.model.MInOutLine;
import org.compiere.model.MInvoice;
import org.compiere.model.MInvoiceLine;
import org.compiere.model.reference.REF__DocumentStatus;

import org.xendra.annotations.*;

/**
 *	Create (Generate) Shipment from Invoice
 *	
 *  @author Jorg Janke
 *  @version $Id: InvoiceCreateInOut.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="C_Invoice_CreateInOut",
name="Generate Receipt from Invoice",
description="Create and process delivery Receipt from this invoice.",
help="The invoice should be correct and completed.",
Identifier="a3ef4f51-c4b8-5ebc-aa39-b46492b777e3",
classname="org.compiere.process.InvoiceCreateInOut",
updated="2015-06-20 10:10:12")
public class InvoiceCreateInOut extends SvrProcess
{
	/**	Warehouse			*/
	@XendraProcessParameter(Name="Warehouse",
			                ColumnName="M_Warehouse_ID",
			                Description="Storage Warehouse and Service Point",
			                Help="The Warehouse identifies a unique Warehouse where products are stored or Services are provided.",
			                AD_Reference_ID=DisplayType.TableDir,
			                SeqNo=10,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=10,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="fbd0d489-e26f-f5e7-380b-bcd9d7b05760")	
	private int p_M_Warehouse_ID = 0;
	/** Invoice				*/
	private int p_C_Invoice_ID = 0;

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
			else if (name.equals("M_Warehouse_ID"))
				p_M_Warehouse_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
		p_C_Invoice_ID = getRecord_ID();
	}	//	prepare

	
	/**
	 * 	Create Shipment
	 *	@return info
	 *	@throws Exception
	 */
	public String doIt () throws Exception
	{
		log.info("C_Invoice_ID=" + p_C_Invoice_ID 
			+ ", M_Warehouse_ID=" + p_M_Warehouse_ID);
		if (p_C_Invoice_ID == 0)
			throw new IllegalArgumentException("@NotFound@ @C_Invoice_ID@");
		if (p_M_Warehouse_ID == 0)
			throw new IllegalArgumentException("@NotFound@ @M_Warehouse_ID@");
		//
		MInvoice invoice = new MInvoice (getCtx(), p_C_Invoice_ID, null);
		if (invoice.get_ID() == 0)
			throw new IllegalArgumentException("@NotFound@ @C_Invoice_ID@");
		if (!REF__DocumentStatus.Completed.equals(invoice.getDocStatus()))
			throw new IllegalArgumentException("@InvoiceCreateDocNotCompleted@");
		//
		MInOut ship = new MInOut (invoice, 0, null, p_M_Warehouse_ID);
		if (!ship.save())
			throw new IllegalArgumentException("@SaveError@ Receipt");
		//
		MInvoiceLine[] invoiceLines = invoice.getLines(false);
		for (int i = 0; i < invoiceLines.length; i++)
		{
			MInvoiceLine invoiceLine = invoiceLines[i];
			MInOutLine sLine = new MInOutLine(ship);
			sLine.setInvoiceLine(invoiceLine, 0,	//	Locator 
				invoice.isSOTrx() ? invoiceLine.getQtyInvoiced() : Env.ZERO);
			sLine.setQtyEntered(invoiceLine.getQtyEntered());
			sLine.setMovementQty(invoiceLine.getQtyInvoiced());
			if (invoice.isCreditMemo())
			{
				sLine.setQtyEntered(sLine.getQtyEntered().negate());
				sLine.setMovementQty(sLine.getMovementQty().negate());
			}
			if (!sLine.save())
				throw new IllegalArgumentException("@SaveError@ @M_InOutLine_ID@");
			//
			invoiceLine.setM_InOutLine_ID(sLine.getM_InOutLine_ID());
			if (!invoiceLine.save())
				throw new IllegalArgumentException("@SaveError@ @C_InvoiceLine_ID@");
		}
		
		return ship.getDocumentNo();
	}	//	doIt
	
}	//	InvoiceCreateInOut
