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

import org.compiere.model.MAging;
import org.compiere.model.MRole;
import org.compiere.model.persistence.X_C_BPartner;
import org.compiere.model.persistence.X_C_BankStatement;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.util.*;

import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;

/**
 *	Invoice Aging Report.
 *	Based on RV_Aging.
 *  @author Jorg Janke
 *  @version $Id: Aging.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="RV_T_Aging",
name="Aging",
description="Aging Report",
help="The aging report allows you to report on Open Items (Invoices). Select the aging buckets, you want to have in your report. If you select a currency, you get only invoices of that currency, otherwise the amounts are converted to your primary accounting currency. If you do not select a Statement Date, the system date is used to calculate the buckets. If you do not list the individual invoices, the Due Date is the earliest due date for the business partner and the Due Days are the average due days of all invoices.",
Identifier="1264f601-3877-0f67-af24-aa3e8b75225b",				   
classname="org.compiere.process.Aging",
updated="2015-06-20 10:10:12")				
public class Aging extends SvrProcess
{
	/** The date to calculate the days due from			*/
	@XendraProcessParameter(Name="Statement date",	
	ColumnName="StatementDate",
	Description="Date of the statement",
	Help="The Statement Date field defines the date of the statement.",
	AD_Reference_ID=DisplayType.Date,
	SeqNo=10,
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
	Identifier="f9d3a010-cf23-869f-9cd0-8acb0f29030a")							
	private Timestamp	p_StatementDate = null;
	@XendraProcessParameter(Name="Account Date",	
	ColumnName="DateAcct",
	Description="Accounting Date",
	Help="The Accounting Date indicates the date to be used on the General Ledger account entries generated from this document. It is also used for any currency conversion.",
	AD_Reference_ID=DisplayType.Date,
	SeqNo=20,
	ReferenceValueID="",	
	ValRuleID="",
	FieldLength=7,
	IsMandatory=true,
	IsRange=true,
	DefaultValue="",
	DefaultValue2="",
	vFormat="",
	valueMin="",
	valueMax="",
	DisplayLogic="",
	ReadOnlyLogic="",
	Identifier="20918b4c-48c2-f516-880c-36889732acd0")
	private Timestamp p_DateAcct_From = null;
	private Timestamp p_DateAcct_To = null;
	@XendraProcessParameter(Name="Sales Transaction",	
	ColumnName=X_C_Invoice.COLUMNNAME_IsSOTrx,
	Description="This is a Sales Transaction",
	Help="The Sales Transaction checkbox indicates if this item is a Sales Transaction.",
	AD_Reference_ID=DisplayType.YesNo,
	SeqNo=30,
	ReferenceValueID="",	
	ValRuleID="",
	FieldLength=1,
	IsMandatory=false,
	IsRange=false,
	DefaultValue="Y",
	DefaultValue2="",
	vFormat="",
	valueMin="",
	valueMax="",
	DisplayLogic="",
	ReadOnlyLogic="",
	Identifier="65db7fd9-9fdb-abcd-b4c5-111ae149c4e2")	
	private boolean 	p_IsSOTrx = false;
	@XendraProcessParameter(Name="Currency",	
	ColumnName=X_C_Invoice.COLUMNNAME_C_Currency_ID,
	Description="The Currency for this record",
	Help="Indicates the Currency to be used when processing or reporting on this record",
	AD_Reference_ID=DisplayType.TableDir,
	SeqNo=40,
	ReferenceValueID="",	
	ValRuleID="",
	FieldLength=10,
	IsMandatory=false,
	IsRange=false,
	DefaultValue="",
	DefaultValue2="",
	vFormat="",
	valueMin="",
	valueMax="",
	DisplayLogic="",
	ReadOnlyLogic="",
	Identifier="402081ed-aa89-b3c4-cdf0-6181c481cacc")	
	private int			p_C_Currency_ID = 0;
	@XendraProcessParameter(Name="Business Partner Group",	
	ColumnName=X_C_BPartner.COLUMNNAME_C_BP_Group_ID,
	Description="Business Partner Group",
	Help="The Business Partner Group provides a method of defining defaults to be used for individual Business Partners.",
	AD_Reference_ID=DisplayType.TableDir,
	SeqNo=50,
	ReferenceValueID="",	
	ValRuleID="",
	FieldLength=10,
	IsMandatory=false,
	IsRange=false,
	DefaultValue="",
	DefaultValue2="",
	vFormat="",
	valueMin="",
	valueMax="",
	DisplayLogic="",
	ReadOnlyLogic="",
	Identifier="6e9b7437-6310-987f-2e8e-d2124413e639")		
	private int			p_C_BP_Group_ID = 0;
	@XendraProcessParameter(Name="Business Partner",	
	ColumnName=X_C_BPartner.COLUMNNAME_C_BPartner_ID,
	Description="Identifies a Business Partner",
	Help="A Business Partner is anyone with whom you transact.  This can include Vendor, Customer, Employee or Salesperson",
	AD_Reference_ID=DisplayType.Search,
	SeqNo=60,
	ReferenceValueID="",	
	ValRuleID="",
	FieldLength=10,
	IsMandatory=false,
	IsRange=false,
	DefaultValue="",
	DefaultValue2="",
	vFormat="",
	valueMin="",
	valueMax="",
	DisplayLogic="",
	ReadOnlyLogic="",
	Identifier="473d8e1e-a0cd-b4d6-76bb-5f6715e501c2")			
	private int			p_C_BPartner_ID = 0;
	@XendraProcessParameter(Name="List Invoices",	
	ColumnName="IsListInvoices",
	Description="Include List of Invoices",
	Help="",
	AD_Reference_ID=DisplayType.YesNo,
	SeqNo=70,
	ReferenceValueID="",	
	ValRuleID="",
	FieldLength=10,
	IsMandatory=false,
	IsRange=false,
	DefaultValue="N",
	DefaultValue2="",
	vFormat="",
	valueMin="",
	valueMax="",
	DisplayLogic="",
	ReadOnlyLogic="",
	Identifier="1266f1d4-7ceb-eab7-295b-75b1977a216d")	
	private boolean		p_IsListInvoices = false;
	/** Number of days between today and statement date	*/
	private int			m_statementOffset = 0;
	
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
			
			else if (name.equals(X_C_BankStatement.COLUMNNAME_StatementDate))
				p_StatementDate = (Timestamp)para[i].getParameter();
			else if (name.equals("DateAcct")) {
				p_DateAcct_From = (Timestamp)para[i].getParameter();
				p_DateAcct_To = (Timestamp)para[i].getParameter_To();
			}
			else if (name.equals("IsSOTrx"))
				p_IsSOTrx = "Y".equals(para[i].getParameter());
			else if (name.equals("C_Currency_ID"))
				p_C_Currency_ID = ((BigDecimal)para[i].getParameter()).intValue();
			else if (name.equals("C_BP_Group_ID"))
				p_C_BP_Group_ID = ((BigDecimal)para[i].getParameter()).intValue();
			else if (name.equals("C_BPartner_ID"))
				p_C_BPartner_ID = ((BigDecimal)para[i].getParameter()).intValue();
			else if (name.equals("IsListInvoices"))
				p_IsListInvoices = "Y".equals(para[i].getParameter());
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
		if (p_StatementDate == null)
			p_StatementDate = new Timestamp (System.currentTimeMillis());
		else
			m_statementOffset = TimeUtil.getDaysBetween( 
				new Timestamp(System.currentTimeMillis()), p_StatementDate);
	}	//	prepare

	/**
	 * 	DoIt
	 *	@return Message
	 *	@throws Exception
	 */
	protected String doIt() throws Exception
	{
		log.info("StatementDate=" + p_StatementDate + ", DateAcct=" + p_DateAcct_From + "-" + p_DateAcct_To 
		    + ", IsSOTrx=" + p_IsSOTrx
			+ ", C_Currency_ID=" + p_C_Currency_ID
			+ ", C_BP_Group_ID=" + p_C_BP_Group_ID + ", C_BPartner_ID=" + p_C_BPartner_ID
			+ ", IsListInvoices=" + p_IsListInvoices);
		//
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT bp.C_BP_Group_ID, oi.C_BPartner_ID,oi.C_Invoice_ID,oi.C_InvoicePaySchedule_ID, " 
			+ "oi.C_Currency_ID, oi.IsSOTrx, "								//	5..6
			+ "oi.DateInvoiced, oi.NetDays,oi.DueDate,oi.DaysDue, ");		//	7..10
		if (p_C_Currency_ID == 0) {
			sql.append("oi.GrandTotal,");
			sql.append("invoicePaidAtDate(oi.C_Invoice_ID, oi.C_Currency_ID, 1, ?),");
			sql.append("invoiceOpenToDate(oi.C_Invoice_ID, oi.C_InvoicePaySchedule_ID, ?) ");			//	11..13
		}
		else
		{
			String s = ",0,oi.C_Currency_ID," + p_C_Currency_ID + ",oi.DateAcct,oi.C_ConversionType_ID,oi.AD_Client_ID,oi.AD_Org_ID)";
			sql.append("currencyConvert(oi.GrandTotal").append(s)		//	11..
				.append(", currencyConvert(invoicePaidAtDate(oi.C_Invoice_ID, oi.C_Currency_ID, 1, ?)").append(s)
				.append(", currencyConvert(invoiceOpenToDate(oi.C_Invoice_ID, oi.C_InvoicePaySchedule_ID, ?)").append(s);
		}
		sql.append(",oi.C_Activity_ID,oi.C_Campaign_ID,oi.C_Project_ID, oi.DateAcct, oi.AD_Org_ID, "	//	14
			+ "i.salesrep_id " // 15
			+ "FROM RV_OpenItem oi"
			+ " INNER JOIN C_BPartner bp ON (oi.C_BPartner_ID=bp.C_BPartner_ID) "
			+ " INNER JOIN C_invoice i ON (oi.C_Invoice_ID=i.C_Invoice_ID) "
			+ "WHERE oi.ISSoTrx=").append(p_IsSOTrx ? "'Y'" : "'N'").append(
			" AND invoiceOpenToDate(oi.C_Invoice_ID, oi.C_InvoicePaySchedule_ID, ?)<>0");
		if (p_DateAcct_From != null)
			sql.append(" AND trunc(oi.DateAcct) BETWEEN ? AND ? ");
		if (p_C_BPartner_ID > 0)
			sql.append(" AND oi.C_BPartner_ID=").append(p_C_BPartner_ID);
		else if (p_C_BP_Group_ID > 0)
			sql.append(" AND bp.C_BP_Group_ID=").append(p_C_BP_Group_ID);
		sql.append(" ORDER BY oi.C_BPartner_ID, oi.C_Currency_ID, oi.C_Invoice_ID");
		
		log.finest(sql.toString());
		String finalSql = MRole.getDefault(getCtx(), false).addAccessSQL(
			sql.toString(), "oi", MRole.SQL_FULLYQUALIFIED, MRole.SQL_RO);	
		log.finer(finalSql);

		PreparedStatement pstmt = null;
		//
		MAging aging = null;
		int counter = 0;
		int rows = 0;
		int AD_PInstance_ID = getAD_PInstance_ID();
		//
		try
		{
			pstmt = DB.prepareStatement(finalSql, get_TrxName());
			pstmt.setTimestamp(1, p_StatementDate);
			pstmt.setTimestamp(2, p_StatementDate);
			pstmt.setTimestamp(3, p_StatementDate);
			pstmt.setTimestamp(4, p_DateAcct_From);
			pstmt.setTimestamp(5, p_DateAcct_To);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				int C_BP_Group_ID = rs.getInt(1);
				int C_BPartner_ID = rs.getInt(2);
				int C_Invoice_ID = p_IsListInvoices ? rs.getInt(3) : 0;
				int C_InvoicePaySchedule_ID = p_IsListInvoices ? rs.getInt(4) : 0;
				int C_Currency_ID = rs.getInt(5);
				int SalesRep_ID = rs.getInt("SalesRep_ID");
				boolean IsSOTrx = "Y".equals(rs.getString(6));
				//
				Timestamp DateInvoiced = rs.getTimestamp(7);
				int NetDays = rs.getInt(8);
				Timestamp DueDate = rs.getTimestamp(9);
				//	Days Due
				int DaysDue = rs.getInt(10)		//	based on today
					+ m_statementOffset;
				//
				BigDecimal GrandTotal = rs.getBigDecimal(11);
				BigDecimal PaidAmt = rs.getBigDecimal(12);
				BigDecimal OpenAmt = rs.getBigDecimal(13);
				//
				int C_Activity_ID = p_IsListInvoices ? rs.getInt(14) : 0;
				int C_Campaign_ID = p_IsListInvoices ? rs.getInt(15) : 0;
				int C_Project_ID = p_IsListInvoices ? rs.getInt(16) : 0;
				Timestamp DateAcct = rs.getTimestamp(17);
				int AD_Org_ID = rs.getInt(18);
				
				rows++;
				//	New Aging Row
				if (aging == null 		//	Key
					|| AD_PInstance_ID != aging.getAD_PInstance_ID()
					|| C_BPartner_ID != aging.getC_BPartner_ID()
					|| C_Currency_ID != aging.getC_Currency_ID()
					|| C_Invoice_ID != aging.getC_Invoice_ID()
					|| C_InvoicePaySchedule_ID != aging.getC_InvoicePaySchedule_ID())
				{
					if (aging != null)
					{
						if (aging.save())
							log.fine("#" + ++counter + " - " + aging);
						else
						{
							log.log(Level.SEVERE, "Not saved " + aging);
							break;
						}
					}
					aging = new MAging (getCtx(), AD_PInstance_ID, p_StatementDate, 
						C_BPartner_ID, C_Currency_ID, 
						C_Invoice_ID, C_InvoicePaySchedule_ID, 
						C_BP_Group_ID, DueDate, IsSOTrx, get_TrxName());
					aging.setC_Activity_ID(C_Activity_ID);
					aging.setC_Campaign_ID(C_Campaign_ID);
					aging.setC_Project_ID(C_Project_ID);
					aging.setSalesRep_ID(SalesRep_ID);
					aging.setAD_Org_ID(AD_Org_ID);
					aging.setDateAcct(DateAcct);
				}
				//	Fill Buckets
				aging.add (DueDate, DaysDue, GrandTotal, OpenAmt);
			}
			if (aging != null)
			{
				if (aging.save())
					log.fine("#" + ++counter + " - " + aging);
				else
					log.log(Level.SEVERE, "Not saved " + aging);
			}
			rs.close();
			pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, finalSql, e);
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
		//	
		log.info("#" + counter + " - rows=" + rows);
		return "";
	}	//	doIt

}	//	Aging

