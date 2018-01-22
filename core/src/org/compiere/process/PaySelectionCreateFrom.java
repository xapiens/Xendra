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

import org.compiere.model.MPaySelection;
import org.compiere.model.MPaySelectionLine;
import org.compiere.util.*;

import org.xendra.annotations.*;

/**
 *	Create Payment Selection Lines from AP Invoices
 *	
 *  @author Jorg Janke
 *  @version $Id: PaySelectionCreateFrom.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="C_PaySelection_CreateFrom",
name="Create From ...",
description="",
help="",
Identifier="e208a2fd-02a0-8ca5-6b34-d85faa881fd4",
classname="org.compiere.process.PaySelectionCreateFrom",
updated="2015-06-20 10:10:12")	
public class PaySelectionCreateFrom extends SvrProcess
{
	/**	Only When Discount			*/
	@XendraProcessParameter(Name="Only Discount",
			                ColumnName="OnlyDiscount",
			                Description="Include only invoices where we would get payment discount",
			                Help="",
			                AD_Reference_ID=DisplayType.YesNo,
			                SeqNo=30,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="Y",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="8a267ba6-c186-eb7b-26c9-56635113c759")	
	private boolean 	p_OnlyDiscount = false;
	/** Only when Due				*/
	@XendraProcessParameter(Name="Only Due",
			                ColumnName="OnlyDue",
			                Description="Include only due invoices",
			                Help="",
			                AD_Reference_ID=DisplayType.YesNo,
			                SeqNo=40,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="Y",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="b5018aab-0dc8-72a8-8974-fd9d7fe0bff5")	
	private boolean		p_OnlyDue = false;
	/** Include Disputed			*/
	@XendraProcessParameter(Name="Include Disputed",
                ColumnName="IncludeInDispute",
                Description="Include disputed Invoices",
                Help="",
                AD_Reference_ID=DisplayType.YesNo,
                SeqNo=50,
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
                Identifier="aabc74ef-6f5d-b949-4c48-1b3b83f1fe44")
	private boolean		p_IncludeInDispute = false;
	/** Match Requirement			*/
	@XendraProcessParameter(Name="Match Requirement",
			                ColumnName="MatchRequirement",
			                Description="Matching Requirement for Invoice",
			                Help="",
			                AD_Reference_ID=DisplayType.List,
			                SeqNo=60,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=1,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="N",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="510f682e-0cb9-6a48-b1f0-b142b760dbde")	
	private String		p_MatchRequirement = "N";
	/** Payment Rule				*/
	@XendraProcessParameter(Name="Payment Rule",
			                ColumnName="PaymentRule",
			                Description="How you pay the invoice",
			                Help="The Payment Rule indicates the method of invoice payment.",
			                AD_Reference_ID=DisplayType.List,
			                SeqNo=70,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="S",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="601ffc36-bb1e-0ca5-59ea-72fa6860be0a")	
	private String		p_PaymentRule = null;
	/** BPartner					*/
	@XendraProcessParameter(Name="Business Partner ",
			                ColumnName="C_BPartner_ID",
			                Description="Identifies a Business Partner",
			                Help="A Business Partner is anyone with whom you transact.  This can include Vendor, Customer, Employee or Salesperson",
			                AD_Reference_ID=DisplayType.Search,
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
			                Identifier="c2acae79-6f78-0184-4f96-438b97c4e4d8")	
	private int			p_C_BPartner_ID = 0;
	/** BPartner Group				*/
	@XendraProcessParameter(Name="Business Partner Group",
			                ColumnName="C_BP_Group_ID",
			                Description="Business Partner Group",
			                Help="The Business Partner Group provides a method of defining defaults to be used for individual Business Partners.",
			                AD_Reference_ID=DisplayType.TableDir,
			                SeqNo=10,
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
			                Identifier="eb6b04dc-180c-d84d-9d5d-8d83854be575")	
	private int			p_C_BP_Group_ID = 0;
	/**	Payment Selection			*/
	private int			p_C_PaySelection_ID = 0;

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
			else if (name.equals("OnlyDiscount"))
				p_OnlyDiscount = "Y".equals(para[i].getParameter());
			else if (name.equals("OnlyDue"))
				p_OnlyDue = "Y".equals(para[i].getParameter());
			else if (name.equals("IncludeInDispute"))
				p_IncludeInDispute = "Y".equals(para[i].getParameter());
			else if (name.equals("MatchRequirement"))
				p_MatchRequirement = (String)para[i].getParameter();
			else if (name.equals("PaymentRule"))
				p_PaymentRule = (String)para[i].getParameter();
			else if (name.equals("C_BPartner_ID"))
				p_C_BPartner_ID = para[i].getParameterAsInt();
			else if (name.equals("C_BP_Group_ID"))
				p_C_BP_Group_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
		p_C_PaySelection_ID = getRecord_ID();
	}	//	prepare

	/**
	 *  Perrform process.
	 *  @return Message 
	 *  @throws Exception if not successful
	 */
	protected String doIt() throws Exception
	{
		log.info ("C_PaySelection_ID=" + p_C_PaySelection_ID
			+ ", OnlyDiscount=" + p_OnlyDiscount + ", OnlyDue=" + p_OnlyDue
			+ ", IncludeInDispute=" + p_IncludeInDispute
			+ ", MatchRequirement=" + p_MatchRequirement
			+ ", PaymentRule=" + p_PaymentRule
			+ ", C_BP_Group_ID=" + p_C_BP_Group_ID + ", C_BPartner_ID=" + p_C_BPartner_ID);
		
		MPaySelection psel = new MPaySelection (getCtx(), p_C_PaySelection_ID, get_TrxName());
		if (psel.get_ID() == 0)
			throw new IllegalArgumentException("Not found C_PaySelection_ID=" + p_C_PaySelection_ID);
		if (psel.isProcessed())
			throw new IllegalArgumentException("@Processed@");
	//	psel.getPayDate();

		String sql = "SELECT C_Invoice_ID,"
			//	Open
			+ " currencyConvert(invoiceOpen(i.C_Invoice_ID, 0)"
				+ ",0,i.C_Currency_ID, ?,?, i.C_ConversionType_ID,i.AD_Client_ID,i.AD_Org_ID),"	//	##1/2 Currency_To,PayDate
			//	Discount
			+ " currencyConvert(paymentTermDiscount(i.GrandTotal,i.C_Currency_ID,i.C_PaymentTerm_ID,i.DateInvoiced, ?)"	//	##3 PayDate
				+ ",0,i.C_Currency_ID, ?,?,i.C_ConversionType_ID,i.AD_Client_ID,i.AD_Org_ID),"	//	##4/5 Currency_To,PayDate
			+ " PaymentRule, IsSOTrx "		//	4..6
			+ "FROM C_Invoice i "
			+ "WHERE IsSOTrx='N' AND IsPaid='N' AND DocStatus IN ('CO','CL')"
			+ " AND AD_Client_ID=?"				//	##6
			//	Existing Payments - Will reselect Invoice if prepared but not paid 
			+ " AND NOT EXISTS (SELECT * FROM C_PaySelectionLine psl "
				+ "WHERE i.C_Invoice_ID=psl.C_Invoice_ID AND psl.IsActive='Y'"
				+ " AND psl.C_PaySelectionCheck_ID IS NOT NULL)";
		//	Disputed
		if (!p_IncludeInDispute)
			sql += " AND i.IsInDispute='N'";
		//	PaymentRule (optional)
		if (p_PaymentRule != null)
			sql += " AND PaymentRule=?";		//	##
		//	OnlyDiscount
		if (p_OnlyDiscount)
		{
			if (p_OnlyDue)
				sql += " AND (";
			else
				sql += " AND ";
			sql += "paymentTermDiscount(invoiceOpen(C_Invoice_ID, 0), C_Currency_ID, C_PaymentTerm_ID, DateInvoiced, ?) > 0";	//	##
		}
		//	OnlyDue
		if (p_OnlyDue)
		{
			if (p_OnlyDiscount)
				sql += " OR ";
			else
				sql += " AND ";
			sql += "paymentTermDueDays(C_PaymentTerm_ID, DateInvoiced, ?) >= 0";	//	##
			if (p_OnlyDiscount)
				sql += ")";
		}
		//	Business Partner
		if (p_C_BPartner_ID != 0)
			sql += " AND C_BPartner_ID=?";	//	##
		//	Business Partner Group
		else if (p_C_BP_Group_ID != 0)
			sql += " AND EXISTS (SELECT * FROM C_BPartner bp "
				+ "WHERE bp.C_BPartner_ID=i.C_BPartner_ID AND bp.C_BP_Group_ID=?)";	//	##
		//	PO Matching Requiremnent
		if (p_MatchRequirement.equals("P") || p_MatchRequirement.equals("B"))
		{
			sql += " AND EXISTS (SELECT * FROM C_InvoiceLine il "
				+ "WHERE i.C_Invoice_ID=il.C_Invoice_ID"
				+ " AND QtyInvoiced=(SELECT SUM(Qty) FROM M_MatchPO m "
					+ "WHERE il.C_InvoiceLine_ID=m.C_InvoiceLine_ID))";
		}
		//	Receipt Matching Requiremnent
		if (p_MatchRequirement.equals("R") || p_MatchRequirement.equals("B"))
		{
			sql += " AND EXISTS (SELECT * FROM C_InvoiceLine il "
				+ "WHERE i.C_Invoice_ID=il.C_Invoice_ID"
				+ " AND QtyInvoiced=(SELECT SUM(Qty) FROM M_MatchInv m "
					+ "WHERE il.C_InvoiceLine_ID=m.C_InvoiceLine_ID))";
		}
	
		//
		int lines = 0;
		int C_CurrencyTo_ID = psel.getC_Currency_ID();
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, get_TrxName());
			int index = 1;
			pstmt.setInt (index++, C_CurrencyTo_ID);
			pstmt.setTimestamp(index++, psel.getPayDate());
			//
			pstmt.setTimestamp(index++, psel.getPayDate());
			pstmt.setInt (index++, C_CurrencyTo_ID);
			pstmt.setTimestamp(index++, psel.getPayDate());
			//
			pstmt.setInt(index++, psel.getAD_Client_ID());
			if (p_PaymentRule != null)
				pstmt.setString(index++, p_PaymentRule);
			if (p_OnlyDiscount)
				pstmt.setTimestamp(index++, psel.getPayDate());
			if (p_OnlyDue)
				pstmt.setTimestamp(index++, psel.getPayDate());
			if (p_C_BPartner_ID != 0)
				pstmt.setInt (index++, p_C_BPartner_ID);
			else if (p_C_BP_Group_ID != 0)
				pstmt.setInt (index++, p_C_BP_Group_ID);
			//
			ResultSet rs = pstmt.executeQuery ();
			while (rs.next ())
			{
				int C_Invoice_ID = rs.getInt(1);
				BigDecimal PayAmt = rs.getBigDecimal(2);
				if (C_Invoice_ID == 0 || Env.ZERO.compareTo(PayAmt) == 0)
					continue;
				BigDecimal DiscountAmt = rs.getBigDecimal(3);
				String PaymentRule  = rs.getString(4);
				boolean isSOTrx = "Y".equals(rs.getString(5));
				//
				lines++;
				MPaySelectionLine pselLine = new MPaySelectionLine (psel, lines*10, PaymentRule);
				pselLine.setInvoice (C_Invoice_ID, isSOTrx,
					PayAmt, PayAmt.subtract(DiscountAmt), DiscountAmt);
				if (!pselLine.save())
				{
					pstmt.close();
					throw new IllegalStateException ("Cannot save MPaySelectionLine");
				}
			}
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, sql, e);
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
		
		return "@C_PaySelectionLine_ID@  - #" + lines;
	}	//	doIt

}	//	PaySelectionCreateFrom
