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

import org.compiere.model.MOrder;
import org.compiere.util.*;

import org.xendra.annotations.*;

/**
 *	Order Batch Processing
 *	
 *  @author Jorg Janke
 *  @version $Id: OrderBatchProcess.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="C_Order BatchProcess",
name="Order Batch Process",
description="Process Orders in Batch",
help="Based on the selection criteria, the orders are processed using the document action selected.  Make sure that the document action is valid for the documents.",
Identifier="b3a3771d-8fe7-1277-94d9-cf00c5f17e5e",
classname="org.compiere.process.OrderBatchProcess",
updated="2015-06-20 10:10:12")
public class OrderBatchProcess extends SvrProcess
{
	@XendraProcessParameter(Name="Target Document Type",
			                ColumnName="C_DocTypeTarget_ID",
			                Description="Target document type for conversing documents",
			                Help="You can convert document types (e.g. from Offer to Order or Invoice).  The conversion is then reflected in the current type.  This processing is initiated by selecting the appropriate Document Action.",
			                AD_Reference_ID=DisplayType.Table,
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
			                Identifier="cd2c3aa8-712b-ace9-f724-44b33a1b7fac")			
	private int			p_C_DocTypeTarget_ID = 0;
	@XendraProcessParameter(Name="Document Status",
			                ColumnName="DocStatus",
			                Description="The current status of the document",
			                Help="The Document Status indicates the status of a document at this time.  If you want to change the document status, use the Document Action field",
			                AD_Reference_ID=DisplayType.List,
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
			                Identifier="645f335d-78e4-4255-c0d4-d060f4b640f7")	
	private String 		p_DocStatus = null;
	@XendraProcessParameter(Name="Business Partner ",
			                ColumnName="C_BPartner_ID",
			                Description="Identifies a Business Partner",
			                Help="A Business Partner is anyone with whom you transact.  This can include Vendor, Customer, Employee or Salesperson",
			                AD_Reference_ID=DisplayType.Search,
			                SeqNo=25,
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
			                Identifier="14d1eb16-315e-906e-685c-ff468186692a")	
	private int			p_C_BPartner_ID = 0;
	@XendraProcessParameter(Name="Self-Service",
			                ColumnName="IsSelfService",
			                Description="This is a Self-Service entry or this entry can be changed via Self-Service",
			                Help="Self-Service allows users to enter data or update their data.  The flag indicates, that this record was entered or CREATED via Self-Service or that the user can change it via the Self-Service functionality.",
			                AD_Reference_ID=DisplayType.List,
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
			                Identifier="b30e7e4c-8cad-b226-ece6-b4a59c1bd380")	
	private String 		p_IsSelfService = null;
	@XendraProcessParameter(Name="Date Ordered",
			                ColumnName="DateOrdered",
			                Description="Date of Order",
			                Help="Indicates the Date an item was ordered.",
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
			                Identifier="986a61e3-e294-8d3d-3cf1-7c4a4d58a458")	
	private Timestamp	p_DateOrdered_From = null;
	private Timestamp	p_DateOrdered_To = null;
	@XendraProcessParameter(Name="Document Action",
			                ColumnName="DocAction",
			                Description="The targeted status of the document",
			                Help="You find the current status in the Document Status field. The options are listed in a popup",
			                AD_Reference_ID=DisplayType.List,
			                SeqNo=50,
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
			                Identifier="1a92a8fa-3b2a-4898-e451-f77598883bf9")	
	private String 		p_DocAction = null;

	/**
	 * 	Prepare
	 */
	protected void prepare ()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("C_DocTypeTarget_ID"))
				p_C_DocTypeTarget_ID = para[i].getParameterAsInt();
			else if (name.equals("DocStatus"))
				p_DocStatus = (String)para[i].getParameter();
			else if (name.equals("IsSelfService"))
				p_IsSelfService = (String)para[i].getParameter();
			else if (name.equals("C_BPartner_ID"))
				p_C_BPartner_ID = para[i].getParameterAsInt();
			else if (name.equals("DateOrdered"))
			{
				p_DateOrdered_From = (Timestamp)para[i].getParameter();
				p_DateOrdered_To = (Timestamp)para[i].getParameter_To();
			}
			else if (name.equals("DocAction"))
				p_DocAction = (String)para[i].getParameter();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}	//	prepare

	/**
	 * 	Process
	 *	@return msg
	 *	@throws Exception
	 */
	public String doIt () throws Exception
	{
		log.info("C_DocTypeTarget_ID=" + p_C_DocTypeTarget_ID + ", DocStatus=" + p_DocStatus
			+ ", IsSelfService=" + p_IsSelfService + ", C_BPartner_ID=" + p_C_BPartner_ID
			+ ", DateOrdered=" + p_DateOrdered_From + "->" + p_DateOrdered_To
			+ ", DocAction=" + p_DocAction);
		
		if (p_C_DocTypeTarget_ID == 0)
			throw new XendraUserError("@NotFound@: @C_DocTypeTarget_ID@");
		if (p_DocStatus == null || p_DocStatus.length() != 2)
			throw new XendraUserError("@NotFound@: @DocStatus@");
		if (p_DocAction == null || p_DocAction.length() != 2)
			throw new XendraUserError("@NotFound@: @DocAction@");
		
		//
		StringBuffer sql = new StringBuffer("SELECT * FROM C_Order "
			+ "WHERE C_DocTypeTarget_ID=? AND DocStatus=?");
		if (p_IsSelfService != null && p_IsSelfService.length() == 1)
			sql.append(" AND IsSelfService='").append(p_IsSelfService).append("'");
		if (p_C_BPartner_ID != 0)
			sql.append(" AND C_BPartner_ID=").append(p_C_BPartner_ID);
		if (p_DateOrdered_From != null)
			sql.append(" AND TRUNC(DateOrdered) >= ").append(DB.TO_DATE(p_DateOrdered_From, true));
		if (p_DateOrdered_To != null)
			sql.append(" AND TRUNC(DateOrdered) <= ").append(DB.TO_DATE(p_DateOrdered_To, true));
		
		int counter = 0;
		int errCounter = 0;
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql.toString(), get_TrxName());
			pstmt.setInt(1, p_C_DocTypeTarget_ID);
			pstmt.setString(2, p_DocStatus);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				if (process(new MOrder(getCtx(),rs, get_TrxName())))
					counter++;
				else
					errCounter++;
			}
			rs.close();
			pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, sql.toString(), e);
		}
		try
		{
			if (pstmt != null)
				pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			pstmt = null;
		}
		return "@Updated@=" + counter + ", @Errors@=" + errCounter;
	}	//	doIt
	
	/**
	 * 	Process Order
	 *	@param order order
	 *	@return true if ok
	 */
	private boolean process (MOrder order)
	{
		log.info(order.toString());
		//
		order.setDocAction(p_DocAction);
		if (order.processIt(p_DocAction))
		{
			order.save();
			addLog(0, null, null, order.getDocumentNo() + ": OK");
			return true;
		}
		addLog (0, null, null, order.getDocumentNo() + ": Error " + order.getProcessMsg());
		return false;
	}	//	process
	
}	//	OrderBatchProcess
