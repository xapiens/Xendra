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

import org.compiere.model.MDocType;
import org.compiere.model.MOrder;
import org.compiere.model.reference.REF__DocumentAction;
import org.compiere.util.DisplayType;

import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;

/**
 *	Copy Order and optionally close
 *	
 *  @author Jorg Janke
 *  @version $Id: CopyOrder.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="C_Order QuoteCopy",
name="Quote convert",
description="Convert open Proposal or Quotation to Order",
help="You can convert a Proposal or Quotation to any other Order document type. You would use this process, if you want to maintain/keep the Proposal or Quotation. The document status needs to be In Process.",
Identifier="697e26e4-bed0-8c27-0e78-47d1b2ad9bb3",
classname="org.compiere.process.CopyOrder",
updated="2015-06-20 10:10:12")	
public class CopyOrder extends SvrProcess
{
	/** Order to Copy				*/
	@XendraProcessParameter(Name="Order",
			                ColumnName="C_Order_ID",
			                Description="Order",
			                Help="The Order is a control document.  The  Order is complete when the quantity ordered is the same as the quantity shipped and invoiced.  When you cloase an order, unshipped (backordered) quantities are cancelled.",
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
			                Identifier="1c9d4e70-03ab-e8f3-ced5-6350e3bc5c00")	
	private int 		p_C_Order_ID = 0;
	/** Document Type of new Order	*/
@XendraProcessParameter(Name="Document Type",
                ColumnName="C_DocType_ID",
                Description="Document type or rules",
                Help="The Document Type determines document sequence and processing rules",
                AD_Reference_ID=DisplayType.TableDir,
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
                Identifier="d1dc7078-46e5-a52c-e48a-d7d4c66d6266")
	private int 		p_C_DocType_ID = 0;
	/** New Doc Date				*/
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
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="e3d1a987-e7ba-6436-2a43-e1d217d3bbcd")	
	private Timestamp	p_DateDoc = null;
	/** Close/Process Old Order		*/
@XendraProcessParameter(Name="Close Document",
                ColumnName="IsCloseDocument",
                Description="Close Document (process)",
                Help="",
                AD_Reference_ID=DisplayType.YesNo,
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
                Identifier="6711b298-5ab5-2c8b-a4c3-f03091bc3fb7")
	private boolean 	p_IsCloseDocument = false;
	
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
			else if (name.equals("C_DocType_ID"))
				p_C_DocType_ID = ((BigDecimal)para[i].getParameter()).intValue();
			else if (name.equals("DateDoc"))
				p_DateDoc = (Timestamp)para[i].getParameter();
			else if (name.equals("IsCloseDocument"))
				p_IsCloseDocument = "Y".equals(para[i].getParameter());
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}	//	prepare

	/**
	 *  Perrform process.
	 *  @return Message (clear text)
	 *  @throws Exception if not successful
	 */
	protected String doIt() throws Exception
	{
		log.info("C_Order_ID=" + p_C_Order_ID 
			+ ", C_DocType_ID=" + p_C_DocType_ID 
			+ ", CloseDocument=" + p_IsCloseDocument);
		if (p_C_Order_ID == 0)
			throw new IllegalArgumentException("No Order");
		MDocType dt = MDocType.get(getCtx(), p_C_DocType_ID);
		if (dt.get_ID() == 0)
			throw new IllegalArgumentException("No DocType");
		if (p_DateDoc == null)
			p_DateDoc = new Timestamp (System.currentTimeMillis());
		//
		MOrder from = new MOrder (getCtx(), p_C_Order_ID, get_TrxName());
		MOrder newOrder = MOrder.copyFrom (from, p_DateDoc, 
			dt.getC_DocType_ID(), dt.isSOTrx(), false, true, null);		//	copy ASI
		newOrder.setC_DocTypeTarget_ID(p_C_DocType_ID);
		boolean OK = newOrder.save();
		if (!OK)
			throw new IllegalStateException("Could not create new Order");
		//
		if (p_IsCloseDocument)
		{
			MOrder original = new MOrder (getCtx(), p_C_Order_ID, get_TrxName());
			original.setDocAction(REF__DocumentAction.Complete);
			original.processIt(REF__DocumentAction.Complete);
			original.save();
			original.setDocAction(REF__DocumentAction.Close);
			original.processIt(REF__DocumentAction.Close);
			original.save();
		}
		//
	//	Env.setSOTrx(getCtx(), newOrder.isSOTrx());
	//	return "@C_Order_ID@ " + newOrder.getDocumentNo();
		return dt.getName() + ": " + newOrder.getDocumentNo();
	}	//	doIt

}	//	CopyOrder
