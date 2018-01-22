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

import org.compiere.model.MAllocationHdr;
import org.compiere.model.MAllocationLine;
import org.compiere.model.MInvoice;
import org.compiere.model.MPayment;
import org.compiere.model.reference.REF_C_PaymentTenderType;
import org.compiere.util.*;

import org.xendra.annotations.*;
/**
 *	Write-off Open Invoices
 *	
 *  @author Jorg Janke
 *  @version $Id: InvoiceWriteOff.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="C_Invoice_WriteOff",
name="Receivables Write-Off",
description="Write off open receivables",
help="Write-off receivables causes the invoices selected by the criteria to be marked as paid and the open invoice amount to be written off.  Alternatively you can create payments.",
Identifier="18d2869e-bacb-65d0-f7c4-ba3355886710",
classname="org.compiere.process.InvoiceWriteOff",
updated="2015-06-20 10:10:12")	
public class InvoiceWriteOff extends SvrProcess
{
	/**	BPartner				*/
	@XendraProcessParameter(Name="Business Partner ",
			                ColumnName="C_BPartner_ID",
			                Description="Identifies a Business Partner",
			                Help="A Business Partner is anyone with whom you transact.  This can include Vendor, Customer, Employee or Salesperson",
			                AD_Reference_ID=DisplayType.Search,
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
			                Identifier="49362f5c-8dc7-d141-c964-96d3d7e2a269")	
	private int			p_C_BPartner_ID = 0;
	/** BPartner Group			*/
	@XendraProcessParameter(Name="Business Partner Group",
			                ColumnName="C_BP_Group_ID",
			                Description="Business Partner Group",
			                Help="The Business Partner Group provides a method of defining defaults to be used for individual Business Partners.",
			                AD_Reference_ID=DisplayType.TableDir,
			                SeqNo=15,
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
			                Identifier="e0e1f8ce-6b7d-b10e-2e59-f3644abe4988")	
	private int			p_C_BP_Group_ID = 0;
	/**	Invoice					*/
	@XendraProcessParameter(Name="Invoice",
			                ColumnName="C_Invoice_ID",
			                Description="Invoice Identifier",
			                Help="The Invoice Document.",
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
			                Identifier="3082967a-a940-4c27-fd1e-590d4ffe225c")	
	private int			p_C_Invoice_ID = 0;
	
	/** Max Amt					*/
	@XendraProcessParameter(Name="Maximum write-off per Invoice",
			                ColumnName="MaxInvWriteOffAmt",
			                Description="Maximum invoice amount to be written off in invoice currency",
			                Help="",
			                AD_Reference_ID=DisplayType.Amount,
			                SeqNo=40,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="99999",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="edd7d358-f712-133c-410a-56c489012f33")	
	private BigDecimal	p_MaxInvWriteOffAmt = Env.ZERO;
	/** AP or AR				*/
	@XendraProcessParameter(Name="AP - AR",
			                ColumnName="APAR",
			                Description="Include Receivables and/or Payables transactions",
			                Help="",
			                AD_Reference_ID=DisplayType.List,
			                SeqNo=45,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="R",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="d7324057-d1bd-c928-0ac9-c7ff2c9b722f")	
	private String		p_APAR = "R";
	private static String	ONLY_AP = "P";
	private static String	ONLY_AR = "R";
	
	/** Invoice Date From		*/
	@XendraProcessParameter(Name="Date Invoiced",
			                ColumnName="DateInvoiced",
			                Description="Date printed on Invoice",
			                Help="The Date Invoice indicates the date printed on the invoice.",
			                AD_Reference_ID=DisplayType.Date,
			                SeqNo=50,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=true,
			                IsRange=true,
			                DefaultValue="@#Date@",
			                DefaultValue2="@#Date@",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="d96deda2-e97e-a36d-d299-379004066129")	
	private Timestamp	p_DateInvoiced_From = null;
	/** Invoice Date To			*/
	private Timestamp	p_DateInvoiced_To = null;
	/** Accounting Date			*/
	@XendraProcessParameter(Name="Account Date",
			                ColumnName="DateAcct",
			                Description="Accounting Date",
			                Help="The Accounting Date indicates the date to be used on the General Ledger account entries generated from this document. It is also used for any currency conversion.",
			                AD_Reference_ID=DisplayType.Date,
			                SeqNo=60,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="@#Date@",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="52fed544-c450-8a49-dca6-ef17eaaab0d4")	
	private Timestamp	p_DateAcct = null;
	/** Create Payment			*/
	@XendraProcessParameter(Name="Create Payment",
			                ColumnName="CreatePayment",
			                Description="",
			                Help="",
			                AD_Reference_ID=DisplayType.YesNo,
			                SeqNo=90,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="N",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="994549e6-a5ef-763e-ac99-63035dd38cb2")	
	private boolean		p_CreatePayment = false;
	/** Bank Account			*/
	@XendraProcessParameter(Name="Bank Account",
			                ColumnName="C_BankAccount_ID",
			                Description="Account at the Bank",
			                Help="The Bank Account identifies an account at this Bank.",
			                AD_Reference_ID=DisplayType.TableDir,
			                SeqNo=100,
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
			                Identifier="2834f8d0-6702-db75-1a84-a77a3d2181ee")	
	private int			p_C_BankAccount_ID = 0;
	/** Simulation				*/
	@XendraProcessParameter(Name="Simulation",
			                ColumnName="IsSimulation",
			                Description="Performing the function is only simulated",
			                Help="",
			                AD_Reference_ID=DisplayType.YesNo,
			                SeqNo=110,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=1,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="Y",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="aab24dc3-04f7-a0d0-df0a-5c0c5ce39c94")	
	private boolean		p_IsSimulation = true;

	/**	Allocation Hdr			*/
	private MAllocationHdr	m_alloc = null;
	/**	Payment					*/
	private MPayment		m_payment = null;
	
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
			else if (name.equals("C_BPartner_ID"))
				p_C_BPartner_ID = para[i].getParameterAsInt();
			else if (name.equals("C_BP_Group_ID"))
				p_C_BP_Group_ID = para[i].getParameterAsInt();
			else if (name.equals("C_Invoice_ID"))
				p_C_Invoice_ID = para[i].getParameterAsInt();
			//
			else if (name.equals("MaxInvWriteOffAmt"))
				p_MaxInvWriteOffAmt = (BigDecimal)para[i].getParameter();
			else if (name.equals("APAR"))
				p_APAR = (String)para[i].getParameter();
			//
			else if (name.equals("DateInvoiced"))
			{
				p_DateInvoiced_From = (Timestamp)para[i].getParameter();
				p_DateInvoiced_To = (Timestamp)para[i].getParameter_To();
			}
			else if (name.equals("DateAcct"))
				p_DateAcct = (Timestamp)para[i].getParameter();
			//
			else if (name.equals("CreatePayment"))
				p_CreatePayment = "Y".equals(para[i].getParameter());
			else if (name.equals("C_BankAccount_ID"))
				p_C_BankAccount_ID = para[i].getParameterAsInt();
			//
			else if (name.equals("IsSimulation"))
				p_IsSimulation = "Y".equals(para[i].getParameter());
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}	//	prepare

	/**
	 * 	Execute
	 *	@return message
	 *	@throws Exception
	 */
	public String doIt () throws Exception
	{
		log.info("C_BPartner_ID=" + p_C_BPartner_ID 
			+ ", C_BP_Group_ID=" + p_C_BP_Group_ID
			+ ", C_Invoice_ID=" + p_C_Invoice_ID
			+ "; APAR=" + p_APAR
			+ ", " + p_DateInvoiced_From + " - " + p_DateInvoiced_To
			+ "; CreatePayment=" + p_CreatePayment
			+ ", C_BankAccount_ID=" + p_C_BankAccount_ID);
		//
		if (p_C_BPartner_ID == 0 && p_C_Invoice_ID == 0 && p_C_BP_Group_ID == 0)
			throw new XendraUserError ("@FillMandatory@ @C_Invoice_ID@ / @C_BPartner_ID@ / ");
		//
		if (p_CreatePayment && p_C_BankAccount_ID == 0)
			throw new XendraUserError ("@FillMandatory@  @C_BankAccount_ID@");
		//
		StringBuffer sql = new StringBuffer(
			"SELECT C_Invoice_ID,DocumentNo,DateInvoiced,"
			+ " C_Currency_ID,GrandTotal, invoiceOpen(C_Invoice_ID, 0) AS OpenAmt "
			+ "FROM C_Invoice WHERE ");
		if (p_C_Invoice_ID != 0)
			sql.append("C_Invoice_ID=").append(p_C_Invoice_ID);
		else
		{
			if (p_C_BPartner_ID != 0)
				sql.append("C_BPartner_ID=").append(p_C_BPartner_ID);
			else
				sql.append("EXISTS (SELECT * FROM C_BPartner bp WHERE C_Invoice.C_BPartner_ID=bp.C_BPartner_ID AND bp.C_BP_Group_ID=")
					.append(p_C_BP_Group_ID).append(")");
			//
			if (ONLY_AR.equals(p_APAR))
				sql.append(" AND IsSOTrx='Y'");
			else if (ONLY_AP.equals(p_APAR))
				sql.append(" AND IsSOTrx='N'");
			//
			if (p_DateInvoiced_From != null && p_DateInvoiced_To != null)
				sql.append(" AND TRIM(DateInvoiced) BETWEEN ")
					.append(DB.TO_DATE(p_DateInvoiced_From, true))
					.append(" AND ")
					.append(DB.TO_DATE(p_DateInvoiced_To, true));
			else if (p_DateInvoiced_From != null)
				sql.append(" AND TRIM(DateInvoiced) >= ")
					.append(DB.TO_DATE(p_DateInvoiced_From, true));
			else if (p_DateInvoiced_To != null)
				sql.append(" AND TRIM(DateInvoiced) <= ")
					.append(DB.TO_DATE(p_DateInvoiced_To, true));
		}
		sql.append(" AND IsPaid='N' ORDER BY C_Currency_ID, C_BPartner_ID, DateInvoiced");
		log.finer(sql.toString());
		//
		int counter = 0;
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql.toString(), get_TrxName());
			ResultSet rs = pstmt.executeQuery ();
			while (rs.next ())
			{
				if (writeOff(rs.getInt(1), rs.getString(2), rs.getTimestamp(3),
					rs.getInt(4), rs.getBigDecimal(6)));
					counter++;
			}
			rs.close ();
			pstmt.close ();
			pstmt = null;
		} 
		catch (Exception e)
		{
			log.log(Level.SEVERE, sql.toString(), e);
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
		//	final
		processPayment();
		processAllocation();
		return "#" + counter;
	}	//	doIt

	/**
	 * 	Write Off
	 *	@param C_Invoice_ID invoice
	 *	@param DocumentNo doc no
	 *	@param DateInvoiced date
	 *	@param C_Currency_ID currency
	 *	@param OpenAmt open amt
	 *	@return true if written off
	 */
	private boolean writeOff (int C_Invoice_ID, String DocumentNo, Timestamp DateInvoiced, 
		int C_Currency_ID, BigDecimal OpenAmt)
	{
		//	Nothing to do
		if (OpenAmt == null || OpenAmt.signum() == 0)
			return false;
		if (OpenAmt.abs().compareTo(p_MaxInvWriteOffAmt) >= 0)
			return false;
		//
		if (p_IsSimulation)
		{
			addLog(C_Invoice_ID, DateInvoiced, OpenAmt, DocumentNo);
			return true;
		}
		
		//	Invoice
		MInvoice invoice = new MInvoice(getCtx(), C_Invoice_ID, get_TrxName());
		if (!invoice.isSOTrx())
			OpenAmt = OpenAmt.negate();
		
		//	Allocation
		if (m_alloc == null || C_Currency_ID != m_alloc.getC_Currency_ID())
		{
			processAllocation();
			m_alloc = new MAllocationHdr (getCtx(), true, 
				p_DateAcct, C_Currency_ID,
				getProcessInfo().getTitle() + " #" + getAD_PInstance_ID(), get_TrxName());
			m_alloc.setAD_Org_ID(invoice.getAD_Org_ID());
			if (!m_alloc.save())
			{
				log.log(Level.SEVERE, "Cannot create allocation header");
				return false;
			}
		}
		//	Payment
		if (p_CreatePayment 
			&& (m_payment == null 
				|| invoice.getC_BPartner_ID() != m_payment.getC_BPartner_ID()
				|| C_Currency_ID != m_payment.getC_Currency_ID()))
		{
			processPayment();
			m_payment = new MPayment(getCtx(), 0, get_TrxName());
			m_payment.setAD_Org_ID(invoice.getAD_Org_ID());
			m_payment.setC_BankAccount_ID(p_C_BankAccount_ID);
			m_payment.setTenderType(REF_C_PaymentTenderType.Check);
			m_payment.setDateTrx(p_DateAcct);
			m_payment.setDateAcct(p_DateAcct);
			m_payment.setDescription(getProcessInfo().getTitle() + " #" + getAD_PInstance_ID());
			m_payment.setC_BPartner_ID(invoice.getC_BPartner_ID());
			m_payment.setIsReceipt(true);	//	payments are negative
			m_payment.setC_Currency_ID(C_Currency_ID);
			if (!m_payment.save())
			{
				log.log(Level.SEVERE, "Cannot create payment");
				return false;
			}
		}

		//	Line
		MAllocationLine aLine = null;
		if (p_CreatePayment)
		{
			aLine = new MAllocationLine (m_alloc, OpenAmt,
				Env.ZERO, Env.ZERO, Env.ZERO);
			m_payment.setPayAmt(m_payment.getPayAmt().add(OpenAmt));
			aLine.setC_Payment_ID(m_payment.getC_Payment_ID());
		}
		else
			aLine = new MAllocationLine (m_alloc, Env.ZERO, 
				Env.ZERO, OpenAmt, Env.ZERO);
		aLine.setC_Invoice_ID(C_Invoice_ID);
		if (aLine.save())
		{
			addLog(C_Invoice_ID, DateInvoiced, OpenAmt, DocumentNo);
			return true;
		}
		//	Error
		log.log(Level.SEVERE, "Cannot create allocation line for C_Invoice_ID=" + C_Invoice_ID);
		return false;
	}	//	writeOff
	
	/**
	 * 	Process Allocation
	 *	@return true if processed
	 */
	private boolean processAllocation()
	{
		if (m_alloc == null)
			return true;
		processPayment();
		//	Process It
		if (m_alloc.processIt(DocAction.ACTION_Complete) &&  m_alloc.save())
		{
			m_alloc = null;
			return true;
		}
		//
		m_alloc = null;
		return false;
	}	//	processAllocation

	/**
	 * 	Process Payment
	 *	@return true if processed
	 */
	private boolean processPayment()
	{
		if (m_payment == null)
			return true;
		//	Process It
		if (m_payment.processIt(DocAction.ACTION_Complete) &&  m_payment.save())
		{
			m_payment = null;
			return true;
		}
		//
		m_payment = null;
		return false;
	}	//	processPayment
	
}	//	InvoiceWriteOff
