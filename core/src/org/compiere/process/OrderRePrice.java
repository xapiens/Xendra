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
import java.util.logging.*;

import org.compiere.model.MInvoice;
import org.compiere.model.MInvoiceLine;
import org.compiere.model.MOrder;
import org.compiere.model.MOrderLine;
import org.compiere.util.*;

import org.xendra.annotations.*;

/**
 *	Re-Price Order or Invoice
 *	
 *  @author Jorg Janke
 *  @version $Id: OrderRePrice.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="C_Order RePrice",
name="RePrice Order/Invoice",
description="Recalculate the price based on the latest price list version of an open order or invoice",
help="",
Identifier="19cf18a0-16c0-8dec-951e-ceb140acd2ae",
classname="org.compiere.process.OrderRePrice",
updated="2015-06-20 10:10:12")	
public class OrderRePrice extends SvrProcess
{
	/**	Order to re-price		*/
	@XendraProcessParameter(Name="Order",
			                ColumnName="C_Order_ID",
			                Description="Order",
			                Help="The Order is a control document.  The  Order is complete when the quantity ordered is the same as the quantity shipped and invoiced.  When you cloase an order, unshipped (backordered) quantities are cancelled.",
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
			                Identifier="02c70a49-4f8d-ca3b-ab2d-e0efb780bf08")	
	private int 	p_C_Order_ID = 0;
	/** Invoice to re-price		*/
	@XendraProcessParameter(Name="Invoice",
                ColumnName="C_Invoice_ID",
                Description="Invoice Identifier",
                Help="The Invoice Document.",
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
                Identifier="33dda327-6728-3f9a-a73b-8165bec3b928")
	private int 	p_C_Invoice_ID = 0;
	
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
			else if (name.equals("C_Order_ID"))
				p_C_Order_ID = ((BigDecimal)para[i].getParameter()).intValue();
			else if (name.equals("C_Invoice_ID"))
				p_C_Invoice_ID = ((BigDecimal)para[i].getParameter()).intValue();
			else
				log.log(Level.SEVERE, "prepare - Unknown Parameter: " + name);
		}
	}	//	prepare

	/**
	 *  Perrform process.
	 *  @return Message (clear text)
	 *  @throws Exception if not successful
	 */
	protected String doIt() throws Exception
	{
		log.info("C_Order_ID=" + p_C_Order_ID + ", C_Invoice_ID=" + p_C_Invoice_ID);
		if (p_C_Order_ID == 0 && p_C_Invoice_ID == 0)
			throw new IllegalArgumentException("Nothing to do");

		String retValue = "";
		if (p_C_Order_ID != 0)
		{
			MOrder order = new MOrder (getCtx(), p_C_Order_ID, get_TrxName());
			BigDecimal oldPrice = order.getGrandTotal();
			MOrderLine[] lines = order.getLines();
			for (int i = 0; i < lines.length; i++)
			{
				lines[i].setPrice(order.getM_PriceList_ID());
				lines[i].save();
			}
			order = new MOrder (getCtx(), p_C_Order_ID, get_TrxName());
			BigDecimal newPrice = order.getGrandTotal();
			retValue = order.getDocumentNo() + ":  " + oldPrice + " -> " + newPrice;
		}
		if (p_C_Invoice_ID != 0)
		{
			MInvoice invoice = new MInvoice (getCtx(), p_C_Invoice_ID, null);
			BigDecimal oldPrice = invoice.getGrandTotal();
			MInvoiceLine[] lines = invoice.getLines(false);
			for (int i = 0; i < lines.length; i++)
			{
				lines[i].setPrice(invoice.getM_PriceList_ID(), invoice.getC_BPartner_ID());
				lines[i].save();
			}
			invoice = new MInvoice (getCtx(), p_C_Invoice_ID, null);
			BigDecimal newPrice = invoice.getGrandTotal();
			if (retValue.length() > 0)
				retValue += Env.NL;
			retValue += invoice.getDocumentNo() + ":  " + oldPrice + " -> " + newPrice;
		}
		//
		return retValue;
	}	//	doIt

}	//	OrderRePrice
