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
import java.math.*;
import java.util.logging.*;

import org.compiere.model.MBPartner;
import org.compiere.model.MInvoice;
import org.compiere.model.MInvoiceLine;
import org.compiere.model.MRequest;
import org.compiere.model.MRequestType;
import org.compiere.model.MRequestUpdate;
import org.compiere.util.*;

import org.xendra.annotations.*;
/**
 * 	Create Invoices for Requests
 *	
 *	
 *  @author Jorg Janke
 *  @version $Id: RequestInvoice.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="R_RequestInvoice",
name="Invoice Requests",
description="Create Invoice for Requests",
help="Create invoice for Request Type with optional Request Group, Category for Business Partner.  If the used product for invoicing is not defined, the product defined in the parameter is used.",
Identifier="348f6622-342d-877d-8ddd-cbb4febff8d0",
classname="org.compiere.process.RequestInvoice",
updated="2015-06-20 10:10:12")
public class RequestInvoice extends SvrProcess
{
	/** Request Type				*/
	@XendraProcessParameter(Name="Request Type",
			                ColumnName="R_RequestType_ID",
			                Description="Type of request (e.g. Inquiry, Complaint, ..)",
			                Help="Request Types are used for processing and categorizing requests. Options are Account Inquiry, Warranty Issue, etc.",
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
			                Identifier="11ba175b-864b-ebaa-0333-108ce6892717")	
	private int		p_R_RequestType_ID = 0;
	/**	Request Group (opt)			*/
	@XendraProcessParameter(Name="Group",
			                ColumnName="R_Group_ID",
			                Description="Request Group",
			                Help="Group of requests (e.g. version numbers, responsibility, ...)",
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
			                Identifier="86b4a98e-6628-33f7-f9bf-94dc33ab6b9e")
	private int		p_R_Group_ID = 0;
	/** Request Categpry (opt)		*/
	@XendraProcessParameter(Name="Category",
			                ColumnName="R_Category_ID",
			                Description="Request Category",
			                Help="Category or Topic of the Request ",
			                AD_Reference_ID=DisplayType.TableDir,
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
			                Identifier="a1374afa-3071-aa77-283a-7c2c2569349b")
	private int		p_R_Category_ID = 0;
	/** Business Partner (opt)		*/
	@XendraProcessParameter(Name="Business Partner ",
			                ColumnName="C_BPartner_ID",
			                Description="Identifies a Business Partner",
			                Help="A Business Partner is anyone with whom you transact.  This can include Vendor, Customer, Employee or Salesperson",
			                AD_Reference_ID=DisplayType.Search,
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
			                Identifier="eeae3ebc-af4e-4443-8519-c946f71619ae")
	private int		p_C_BPartner_ID = 0;
	/** Default product				*/
	@XendraProcessParameter(Name="Product",
			                ColumnName="M_Product_ID",
			                Description="Product, Service, Item",
			                Help="Identifies an item which is either purchased or sold in this organization.",
			                AD_Reference_ID=DisplayType.Search,
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
			                Identifier="fe14f59c-38a1-dcc0-26c5-d8a36604054c")
	private int		p_M_Product_ID = 0;

	/** The invoice					*/
	private MInvoice m_invoice = null;
	/**	Line Count					*/
	private int		m_linecount = 0;
	
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
			else if (name.equals("R_RequestType_ID"))
				p_R_RequestType_ID = para[i].getParameterAsInt();
			else if (name.equals("R_Group_ID"))
				p_R_Group_ID = para[i].getParameterAsInt();
			else if (name.equals("R_Category_ID"))
				p_R_Category_ID = para[i].getParameterAsInt();
			else if (name.equals("C_BPartner_ID"))
				p_C_BPartner_ID = para[i].getParameterAsInt();
			else if (name.equals("M_Product_ID"))
				p_M_Product_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}	//	prepare
	
	/**
	 * 	Process
	 *	@return info
	 *	@throws Exception
	 */
	public String doIt () throws Exception
	{
		log.info("R_RequestType_ID=" + p_R_RequestType_ID + ", R_Group_ID=" + p_R_Group_ID
			+ ", R_Category_ID=" + p_R_Category_ID + ", C_BPartner_ID=" + p_C_BPartner_ID
			+ ", p_M_Product_ID=" + p_M_Product_ID);
		
		MRequestType type = MRequestType.get (getCtx(), p_R_RequestType_ID);
		if (type.get_ID() == 0)
			throw new XendraSystemError("@R_RequestType_ID@ @NotFound@ " + p_R_RequestType_ID);
		if (!type.isInvoiced())
			throw new XendraSystemError("@R_RequestType_ID@ <> @IsInvoiced@");
		
		String sql = "SELECT * FROM R_Request r"
			+ " INNER JOIN R_Status s ON (r.R_Status_ID=s.R_Status_ID) "
			+ "WHERE s.IsClosed='Y'"
			+ " AND r.R_RequestType_ID=?";
			// globalqss -- avoid double invoicing
			// + " AND EXISTS (SELECT 1 FROM R_RequestUpdate ru " +
			//		"WHERE ru.R_Request_ID=r.R_Request_ID AND COALESCE(C_InvoiceLine_ID,0)=0";
		if (p_R_Group_ID != 0)
			sql += " AND r.R_Group_ID=?";
		if (p_R_Category_ID != 0)
			sql += " AND r.R_Category_ID=?";
		if (p_C_BPartner_ID != 0)
			sql += " AND r.C_BPartner_ID=?";
		sql += " AND r.IsInvoiced='Y' "
			+ "ORDER BY C_BPartner_ID";
		
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, get_TrxName());
			int index = 1;
			pstmt.setInt (index++, p_R_RequestType_ID);
			if (p_R_Group_ID != 0)
				pstmt.setInt (index++, p_R_Group_ID);
			if (p_R_Category_ID != 0)
				pstmt.setInt (index++, p_R_Category_ID);
			if (p_C_BPartner_ID != 0)
				pstmt.setInt (index++, p_C_BPartner_ID);
			ResultSet rs = pstmt.executeQuery ();
			int oldC_BPartner_ID = 0;
			while (rs.next ())
			{
				MRequest request = new MRequest (getCtx(), rs, get_TrxName());
				if (!request.isInvoiced())
					continue;
				if (oldC_BPartner_ID != request.getC_BPartner_ID())
					invoiceDone();
				if (m_invoice == null)
				{
					invoiceNew(request);
					oldC_BPartner_ID = request.getC_BPartner_ID();
				}
				invoiceLine(request);
			}
			invoiceDone();
			//
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log (Level.SEVERE, sql, e);
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
		//	R_Category_ID
		return null;
	}	//	doIt
	
	/**
	 * 	Done with Invoice
	 */
	private void invoiceDone()
	{
		//	Close Old
		if (m_invoice != null)
		{
			if (m_linecount == 0)
				m_invoice.delete(false);
			else
			{
				m_invoice.processIt(MInvoice.ACTION_Prepare);
				m_invoice.save();
				addLog(0, null, m_invoice.getGrandTotal(), m_invoice.getDocumentNo());
			}
		}
		m_invoice = null;
	}	//	invoiceDone
	
	/**
	 * 	New Invoice
	 *	@param request request
	 */
	private void invoiceNew (MRequest request)
	{
		m_invoice = new MInvoice (getCtx(), 0, get_TrxName());
		m_invoice.setIsSOTrx(true);
		
		MBPartner partner = new MBPartner (getCtx(), request.getC_BPartner_ID(), null);
		m_invoice.setBPartner(partner);
		
		m_invoice.save();
		m_linecount = 0;
	}	//	invoiceNew
	
	/**
	 * 	Invoice Line
	 *	@param request request
	 */
	private void invoiceLine (MRequest request)
	{
		MRequestUpdate[] updates = request.getUpdates(null);
		for (int i = 0; i < updates.length; i++)
		{
			BigDecimal qty = updates[i].getQtyInvoiced();
			if (qty == null || qty.signum() == 0)
				continue;
			// if (updates[i].getC_InvoiceLine_ID() > 0)
			//	continue;
			
			MInvoiceLine il = new MInvoiceLine(m_invoice);
			m_linecount++;
			il.setLine(m_linecount*10);
			//
			il.setQty(qty);
			//	Product
			int M_Product_ID = updates[i].getM_ProductSpent_ID();
			if (M_Product_ID == 0)
				M_Product_ID = p_M_Product_ID;
			il.setM_Product_ID(M_Product_ID);
			//
			il.setPrice();
			il.save();
			// updates[i].setC_InvoiceLine_ID(il.getC_InvoiceLine_ID());
			// updates[i].save();
		}
	}	//	invoiceLine
	
}	//	RequestInvoice
