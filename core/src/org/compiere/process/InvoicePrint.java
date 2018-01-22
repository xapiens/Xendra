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

import java.io.*;
import java.sql.*;
import java.util.logging.*;

import org.compiere.model.MClient;
import org.compiere.model.MInvoice;
import org.compiere.model.MMailText;
import org.compiere.model.MQuery;
import org.compiere.model.MUser;
import org.compiere.model.MUserMail;
import org.compiere.model.PrintInfo;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.print.*;
import org.compiere.util.*;

import org.xendra.annotations.*;
/**
 *	Print Invoices on Paperor send PDFs
 *
 * 	@author 	Jorg Janke
 * 	@version 	$Id: InvoicePrint.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="C_Invoice_Print",
name="Print Invoices",
description="Print Invoices to paper or send PDF",
help="(Re)Print Invoices or send them as PDF attachments to the Business Partner Contact with a valid EMail address.	<br> Remark: If you only enter a Document No FROM value, all invoices greater or equal that document number are printed; you can alternatively use the % character as a widcard.",
Identifier="62d2669b-3b48-7f35-dc07-460f6ba54e9a",
classname="org.compiere.process.InvoicePrint",
updated="2015-06-20 10:10:12")	
public class InvoicePrint extends SvrProcess
{
	/**	Mail PDF			*/
	@XendraProcessParameter(Name="EMail PDF",
			                ColumnName="EMailPDF",
			                Description="Email Document PDF files to Business Partner",
			                Help="",
			                AD_Reference_ID=DisplayType.YesNo,
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
			                Identifier="2cbcb89d-ec74-8caf-17a6-a582b36739a6")	
	private boolean		p_EMailPDF = false;
	/** Mail Template		*/
@XendraProcessParameter(Name="Mail Template",
                ColumnName="R_MailText_ID",
                Description="Text templates for mailings",
                Help="The Mail Template indicates the mail template for return messages. Mail text can include variables.  The priority of parsing is User/Contact, Business Partner and then the underlying business object (like Request, Dunning, Workflow object).<br>So, @Name@ would resolve into the User NAME (if user is defined defined), then Business Partner NAME (if business partner is defined) and then the Name of the business object if it has a Name.<br>For Multi-Lingual systems, the template is translated based on the Business Partner's language selection.",
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
                Identifier="fe38683c-cd61-07e9-2303-9e7828e83825")
	private int			p_R_MailText_ID = 0;
@XendraProcessParameter(Name="Date Invoiced",
                ColumnName="DateInvoiced",
                Description="Date printed on Invoice",
                Help="The Date Invoice indicates the date printed on the invoice.",
                AD_Reference_ID=DisplayType.Date,
                SeqNo=20,
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
                Identifier="58fc4f0e-0679-f848-8ece-425336bab808")	
	private Timestamp	m_dateInvoiced_From = null;
	private Timestamp	m_dateInvoiced_To = null;
	@XendraProcessParameter(Name="Business Partner ",
			                ColumnName="C_BPartner_ID",
			                Description="Identifies a Business Partner",
			                Help="A Business Partner is anyone with whom you transact.  This can include Vendor, Customer, Employee or Salesperson",
			                AD_Reference_ID=DisplayType.Search,
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
			                Identifier="d702dbcd-921a-2c62-c996-46f503f3c9d8")	
	private int			m_C_BPartner_ID = 0;
	@XendraProcessParameter(Name="Invoice",
			                ColumnName="C_Invoice_ID",
			                Description="Invoice Identifier",
			                Help="The Invoice Document.",
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
			                Identifier="91bacd03-97ac-722a-2f63-8b37eefed2f3")	
	private int			m_C_Invoice_ID = 0;
	@XendraProcessParameter(Name="Document No",
			                ColumnName="DocumentNo",
			                Description="Document sequence number of the document",
			                Help="The document number is usually automatically generated by the system and determined by the document type of the document. If the document is not saved, the preliminary number is displayed in \"<>\".If the document type of your document has no automatic document sequence defined, the field is empty if you create a new document. This is for documents which usually have an external number (like vendor invoice).  If you leave the field empty, the system will generate a document number for you. The document sequence used for this fallback number is defined in the \"Maintain Sequence\" window with the NAME \"DocumentNo_<TableName>\", where TableName is the actual NAME of the table (e.g. C_Order).",
			                AD_Reference_ID=DisplayType.String,
			                SeqNo=50,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=20,
			                IsMandatory=false,
			                IsRange=true,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="b846c1e3-e703-4b08-9d10-1b1b92950602")	
	private String		m_DocumentNo_From = null;
	private String		m_DocumentNo_To = null;

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
			else if (name.equals("DateInvoiced"))
			{
				m_dateInvoiced_From = ((Timestamp)para[i].getParameter());
				m_dateInvoiced_To = ((Timestamp)para[i].getParameter_To());
			}
			else if (name.equals("EMailPDF"))
				p_EMailPDF = "Y".equals(para[i].getParameter());
			else if (name.equals("R_MailText_ID"))
				p_R_MailText_ID = para[i].getParameterAsInt();
			else if (name.equals("C_BPartner_ID"))
				m_C_BPartner_ID = para[i].getParameterAsInt();
			else if (name.equals("C_Invoice_ID"))
				m_C_Invoice_ID = para[i].getParameterAsInt();
			else if (name.equals("DocumentNo"))
			{
				m_DocumentNo_From = (String)para[i].getParameter();
				m_DocumentNo_To = (String)para[i].getParameter_To();
			}
			else
				log.log(Level.SEVERE, "prepare - Unknown Parameter: " + name);
		}
		if (m_DocumentNo_From != null && m_DocumentNo_From.length() == 0)
			m_DocumentNo_From = null;
		if (m_DocumentNo_To != null && m_DocumentNo_To.length() == 0)
			m_DocumentNo_To = null;
	}	//	prepare

	/**
	 *  Perrform process.
	 *  @return Message
	 *  @throws Exception
	 */
	protected String doIt() throws java.lang.Exception
	{
		//	Need to have Template
		if (p_EMailPDF && p_R_MailText_ID == 0)
			throw new XendraUserError ("@NotFound@: @R_MailText_ID@");
		log.info ("C_BPartner_ID=" + m_C_BPartner_ID
			+ ", C_Invoice_ID=" + m_C_Invoice_ID
			+ ", EmailPDF=" + p_EMailPDF + ",R_MailText_ID=" + p_R_MailText_ID
			+ ", DateInvoiced=" + m_dateInvoiced_From + "-" + m_dateInvoiced_To
			+ ", DocumentNo=" + m_DocumentNo_From + "-" + m_DocumentNo_To);
		
		MMailText mText = null;
		if (p_R_MailText_ID != 0)
		{
			mText = new MMailText(getCtx(), p_R_MailText_ID, get_TrxName());
			if (mText.get_ID() != p_R_MailText_ID)
				throw new XendraUserError ("@NotFound@: @R_MailText_ID@ - " + p_R_MailText_ID);
		}

		//	Too broad selection
		if (m_C_BPartner_ID == 0 && m_C_Invoice_ID == 0 && m_dateInvoiced_From == null && m_dateInvoiced_To == null
			&& m_DocumentNo_From == null && m_DocumentNo_To == null)
			throw new XendraUserError ("@RestrictSelection@");

		MClient client = MClient.get(getCtx());
		
		//	Get Info
		StringBuffer sql = new StringBuffer (
			"SELECT i.C_Invoice_ID,bp.AD_Language,c.IsMultiLingualDocument,"		//	1..3
			//	Prio: 1. BPartner 2. DocType, 3. PrintFormat (Org)	//	see ReportCtl+MInvoice
			+ " COALESCE(bp.Invoice_PrintFormat_ID, dt.AD_PrintFormat_ID, pf.Invoice_PrintFormat_ID),"	//	4 
			+ " dt.DocumentCopies+bp.DocumentCopies,"								//	5
			+ " bpc.AD_User_ID, i.DocumentNo,"										//	6..7
			+ " bp.C_BPartner_ID "													//	8
			+ "FROM C_Invoice i"
			+ " INNER JOIN C_BPartner bp ON (i.C_BPartner_ID=bp.C_BPartner_ID)"
			+ " LEFT OUTER JOIN AD_User bpc ON (i.AD_User_ID=bpc.AD_User_ID)"
			+ " INNER JOIN AD_Client c ON (i.AD_Client_ID=c.AD_Client_ID)"
			+ " INNER JOIN AD_PrintForm pf ON (i.AD_Client_ID=pf.AD_Client_ID)"
			+ " INNER JOIN C_DocType dt ON (i.C_DocType_ID=dt.C_DocType_ID)"
		    + " WHERE i.AD_Client_ID=? AND i.AD_Org_ID=? AND i.isSOTrx='Y' AND "
		    + "       pf.AD_Org_ID IN (0,i.AD_Org_ID) AND " );	//	more them 1 PF
		boolean needAnd = false;
		if (m_C_Invoice_ID != 0)
			sql.append("i.C_Invoice_ID=").append(m_C_Invoice_ID);
		else
		{
			if (m_C_BPartner_ID != 0)
			{
				sql.append ("i.C_BPartner_ID=").append (m_C_BPartner_ID);
				needAnd = true;
			}
			if (m_dateInvoiced_From != null && m_dateInvoiced_To != null)
			{
				if (needAnd)
					sql.append(" AND ");
				sql.append("TRUNC(i.DateInvoiced) BETWEEN ")
					.append(DB.TO_DATE(m_dateInvoiced_From, true)).append(" AND ")
					.append(DB.TO_DATE(m_dateInvoiced_To, true));
				needAnd = true;
			}
			else if (m_dateInvoiced_From != null)
			{
				if (needAnd)
					sql.append(" AND ");
				sql.append("TRUNC(i.DateInvoiced) >= ")
					.append(DB.TO_DATE(m_dateInvoiced_From, true));
				needAnd = true;
			}
			else if (m_dateInvoiced_To != null)
			{
				if (needAnd)
					sql.append(" AND ");
				sql.append("TRUNC(i.DateInvoiced) <= ")
					.append(DB.TO_DATE(m_dateInvoiced_To, true));
				needAnd = true;
			}
			else if (m_DocumentNo_From != null && m_DocumentNo_To != null)
			{
				if (needAnd)
					sql.append(" AND ");
				sql.append("i.DocumentNo BETWEEN ")
					.append(DB.TO_STRING(m_DocumentNo_From)).append(" AND ")
					.append(DB.TO_STRING(m_DocumentNo_To));
			}
			else if (m_DocumentNo_From != null)
			{
				if (needAnd)
					sql.append(" AND ");
				if (m_DocumentNo_From.indexOf('%') == -1)
					sql.append("i.DocumentNo >= ")
						.append(DB.TO_STRING(m_DocumentNo_From));
				else
					sql.append("i.DocumentNo LIKE ")
						.append(DB.TO_STRING(m_DocumentNo_From));
			}
			
			if (p_EMailPDF)
			{
				if (needAnd)
				{
					sql.append(" AND ");
				}
				/* if emailed to customer only select COmpleted & CLosed invoices */ 
				sql.append("i.DocStatus IN ('CO','CL') "); 
			}
		}
		sql.append(" ORDER BY i.C_Invoice_ID, pf.AD_Org_ID DESC");	//	more than 1 PF record
		log.fine(sql.toString());

		MPrintFormat format = null;
		int old_AD_PrintFormat_ID = -1;
		int old_C_Invoice_ID = -1;
		int C_BPartner_ID = 0;
		int count = 0;
		int errors = 0;
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), get_TrxName()); 
			pstmt.setInt(1, Env.getAD_Client_ID(Env.getCtx()));
			pstmt.setInt(2, Env.getAD_Org_ID(Env.getCtx()));
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				int C_Invoice_ID = rs.getInt(1);
				if (C_Invoice_ID == old_C_Invoice_ID)	//	multiple pf records
					continue;
				old_C_Invoice_ID = C_Invoice_ID;
				//	Set Language when enabled
				Language language = Language.getLoginLanguage();		//	Base Language
				String AD_Language = rs.getString(2);
				if (AD_Language != null && "Y".equals(rs.getString(3)))
					language = Language.getLanguage(AD_Language);
				//
				int AD_PrintFormat_ID = rs.getInt(4);
				int copies = rs.getInt(5);
				if (copies == 0)
					copies = 1;
				int AD_User_ID = rs.getInt(6);
				MUser to = new MUser (getCtx(), AD_User_ID, get_TrxName());
				String DocumentNo = rs.getString(7);
				C_BPartner_ID = rs.getInt(8);
				//
				String documentDir = client.getDocumentDir();
				if (documentDir == null || documentDir.length() == 0)
					documentDir = ".";
				//
				if (p_EMailPDF && (to.get_ID() == 0 || to.getEMail() == null || to.getEMail().length() == 0))
				{
					addLog (C_Invoice_ID, null, null, DocumentNo + " @RequestActionEMailNoTo@");
					errors++;
					continue;
				}
				if (AD_PrintFormat_ID == 0)
				{
					addLog (C_Invoice_ID, null, null, DocumentNo + " No Print Format");
					errors++;
					continue;
				}
				//	Get Format & Data
				if (AD_PrintFormat_ID != old_AD_PrintFormat_ID)
				{
					format = MPrintFormat.get (getCtx(), AD_PrintFormat_ID, false);
					old_AD_PrintFormat_ID = AD_PrintFormat_ID;
				}
				format.setLanguage(language);
				format.setTranslationLanguage(language);
				//	query
				MQuery query = new MQuery("C_Invoice_Header_v");
				query.addRestriction("C_Invoice_ID", MQuery.EQUAL, new Integer(C_Invoice_ID));

				//	Engine
				PrintInfo info = new PrintInfo(
					DocumentNo,
					X_C_Invoice.Table_ID,
					C_Invoice_ID,
					C_BPartner_ID);
				info.setCopies(copies);
				ReportEngine re = new ReportEngine(getCtx(), format, query, info);
				boolean printed = false;
				if (p_EMailPDF)
				{
					String subject = mText.getMailHeader() + " - " + DocumentNo;
					EMail email = client.createEMail(to.getEMail(), subject, null);
					if (!email.isValid())
					{
						addLog (C_Invoice_ID, null, null,
						  DocumentNo + " @RequestActionEMailError@ Invalid EMail: " + to);
						errors++;
						continue;
					}
					mText.setUser(to);					//	Context
					mText.setBPartner(C_BPartner_ID);	//	Context
					mText.setPO(new MInvoice(getCtx(), C_Invoice_ID, get_TrxName()));
					String message = mText.getMailText(true);
					if (mText.isHtml())
						email.setMessageHTML(subject, message);
					else
					{
						email.setSubject (subject);
						email.setMessageText (message);
					}
					//
					File invoice = null;
					if (!Ini.isClient())
						invoice = new File(MInvoice.getPDFFileName(documentDir, C_Invoice_ID));
					File attachment = re.getPDF(invoice);
					log.fine(to + " - " + attachment);
					email.addAttachment(attachment);
					//
					String msg = email.send();
					MUserMail um = new MUserMail(mText, getAD_User_ID(), email);
					um.save();
					if (msg.equals(EMail.SENT_OK))
					{
						addLog (C_Invoice_ID, null, null,
						  DocumentNo + " @RequestActionEMailOK@ - " + to.getEMail());
						count++;
						printed = true;
					}
					else
					{
						addLog (C_Invoice_ID, null, null,
						  DocumentNo + " @RequestActionEMailError@ " + msg
						  + " - " + to.getEMail());
						errors++;
					}
				}
				else
				{
					re.print();
					count++;
					printed = true;
				}
				//	Print Confirm
				if (printed)
				{
					StringBuffer sb = new StringBuffer ("UPDATE C_Invoice "
						+ "SET DatePrinted=CURRENT_TIMESTAMP, IsPrinted='Y' WHERE C_Invoice_ID=")
						.append (C_Invoice_ID);
					int no = DB.executeUpdate(sb.toString(), get_TrxName());
				}
			}	//	for all entries
			rs.close();
			pstmt.close();
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, "doIt - " + sql, e);
			throw new Exception (e);
		}
		//
		if (p_EMailPDF)
			return "@Sent@=" + count + " - @Errors@=" + errors;
		return "@Printed@=" + count;
	}	//	doIt

}	//	InvoicePrint
