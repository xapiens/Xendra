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
import java.util.logging.*;

import org.compiere.model.MBPartner;
import org.compiere.model.MClient;
import org.compiere.model.MDunningLevel;
import org.compiere.model.MDunningRun;
import org.compiere.model.MDunningRunEntry;
import org.compiere.model.MMailText;
import org.compiere.model.MQuery;
import org.compiere.model.MUser;
import org.compiere.model.MUserMail;
import org.compiere.model.PrintInfo;
import org.compiere.model.persistence.X_C_DunningRunEntry;
import org.compiere.print.*;
import org.compiere.util.*;

import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;



/**
 *	Dunning Letter Print
 *	
 *  @author Jorg Janke
 *  @version $Id: DunningPrint.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="C_DunningPrint",
name="Print Dunning Letters",
description="Print Dunning letters to paper or send PDF",
help="(Re)Print Dunning Letters or send them as PDF attachments to the Business Partner Contact with a valid EMail addres.",
Identifier="19bd9aae-c01f-cb5f-9f3d-2fd9ffe42d8d",
classname="org.compiere.process.DunningPrint",
updated="2015-06-20 10:10:12")	
public class DunningPrint extends SvrProcess
{
	/**	Mail PDF				*/
	@XendraProcessParameter(Name="EMail PDF",
			                ColumnName="EMailPDF",
			                Description="Email Document PDF files to Business Partner",
			                Help="",
			                AD_Reference_ID=DisplayType.YesNo,
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
			                Identifier="d6dd73e5-7c34-3e04-75ff-35e43f947214")	
	private boolean		p_EMailPDF = false;
	/** Mail Template			*/
	@XendraProcessParameter(Name="Mail Template",
			                ColumnName="R_MailText_ID",
			                Description="Text templates for mailings",
			                Help="The Mail Template indicates the mail template for return messages. Mail text can include variables.  The priority of parsing is User/Contact, Business Partner and then the underlying business object (like Request, Dunning, Workflow object).<br>So, @Name@ would resolve into the User NAME (if user is defined defined), then Business Partner NAME (if business partner is defined) and then the Name of the business object if it has a Name.<br>For Multi-Lingual systems, the template is translated based on the Business Partner's language selection.",
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
			                Identifier="2ad68066-c7f5-69a5-aa86-37a9db9b06aa")	
	private int			p_R_MailText_ID = 0;
	/** Dunning Run				*/
	@XendraProcessParameter(Name="Dunning Run",
			                ColumnName="C_DunningRun_ID",
			                Description="Dunning Run",
			                Help="",
			                AD_Reference_ID=DisplayType.TableDir,
			                SeqNo=30,
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
			                Identifier="c9a7f156-1529-99d1-9b5e-9ea148e084c6")	
	private int			p_C_DunningRun_ID = 0;
	/** Print only Outstanding	*/
    @XendraProcessParameter(Name="Only If BP has Balance",
                ColumnName="IsOnlyIfBPBalance",
                Description="Include only if Business Partner has outstanding Balance",
                Help="",
                AD_Reference_ID=DisplayType.YesNo,
                SeqNo=40,
                ReferenceValueID="",
                ValRuleID="",
                FieldLength=0,
                IsMandatory=false,
                IsRange=false,
                DefaultValue="Y",
                DefaultValue2="",
                vFormat="",
                valueMin="",
                valueMax="",
                DisplayLogic="",
                ReadOnlyLogic="",
                Identifier="ee810d0c-3b8f-ac43-014a-1f564f710324")
	private boolean		p_IsOnlyIfBPBalance = true;
	
	
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
			else if (name.equals("EMailPDF"))
				p_EMailPDF = "Y".equals(para[i].getParameter());
			else if (name.equals("R_MailText_ID"))
				p_R_MailText_ID = para[i].getParameterAsInt();
			else if (name.equals("C_DunningRun_ID"))
				p_C_DunningRun_ID = para[i].getParameterAsInt();
			else if (name.equals("IsOnlyIfBPBalance"))
				p_IsOnlyIfBPBalance = "Y".equals(para[i].getParameter());
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}	//	prepare

	/**
	 * 	Pocess
	 *	@return info
	 *	@throws Exception
	 */
	public String doIt () throws Exception
	{
		log.info("C_DunningRun_ID=" + p_C_DunningRun_ID + ",R_MailText_ID=" + p_R_MailText_ID 
			+ ", EmailPDF=" + p_EMailPDF + ",IsOnlyIfBPBalance=" + p_IsOnlyIfBPBalance);
		
		//	Need to have Template
		if (p_EMailPDF && p_R_MailText_ID == 0)
			throw new XendraUserError ("@NotFound@: @R_MailText_ID@");
		String subject = "";
		MMailText mText = null;
		if (p_EMailPDF)
		{
			mText = new MMailText (getCtx(), p_R_MailText_ID, get_TrxName());
			if (p_EMailPDF && mText.get_ID() == 0)
				throw new XendraUserError ("@NotFound@: @R_MailText_ID@ - " + p_R_MailText_ID);
			subject = mText.getMailHeader();
		}
		//
		MDunningRun run = new MDunningRun (getCtx(), p_C_DunningRun_ID, get_TrxName());
		if (run.get_ID() == 0)
			throw new XendraUserError ("@NotFound@: @C_DunningRun_ID@ - " + p_C_DunningRun_ID);
		//	Print Format on Dunning Level
		MDunningLevel level = new MDunningLevel (getCtx(), run.getC_DunningLevel_ID(), get_TrxName());
		MPrintFormat format = MPrintFormat.get (getCtx(), level.getDunning_PrintFormat_ID(), false);
		
		MClient client = MClient.get(getCtx());
		
		int count = 0;
		int errors = 0;
		MDunningRunEntry[] entries = run.getEntries(false);
		for (int i = 0; i < entries.length; i++)
		{
			MDunningRunEntry entry = entries[i];
			if (p_IsOnlyIfBPBalance && entry.getAmt().signum() <= 0)
				continue;
			//	To BPartner
			MBPartner bp = new MBPartner (getCtx(), entry.getC_BPartner_ID(), get_TrxName());
			if (bp.get_ID() == 0)
			{
				addLog (entry.get_ID(), null, null, "@NotFound@: @C_BPartner_ID@ " + entry.getC_BPartner_ID());
				errors++;
				continue;
			}
			//	To User
			MUser to = new MUser (getCtx(), entry.getAD_User_ID(), get_TrxName());
			if (p_EMailPDF)
			{
				if (to.get_ID() == 0)
				{
					addLog (entry.get_ID(), null, null, "@NotFound@: @AD_User_ID@ - " + bp.getName());
					errors++;
					continue;
				}
				else if (to.getEMail() == null || to.getEMail().length() == 0)
				{
					addLog (entry.get_ID(), null, null, "@NotFound@: @EMail@ - " + to.getName());
					errors++;
					continue;
				}
			}
			//	BP Language
			Language language = Language.getLoginLanguage();		//	Base Language
			String tableName = "C_Dunning_Header_v";
			if (client.isMultiLingualDocument())
			{
				tableName += "t";
				String AD_Language = bp.getAD_Language();
				if (AD_Language != null)
					language = Language.getLanguage(AD_Language);
			}
			format.setLanguage(language);
			format.setTranslationLanguage(language);
			//	query
			MQuery query = new MQuery(tableName);
			query.addRestriction("C_DunningRunEntry_ID", MQuery.EQUAL, 
				new Integer(entry.getC_DunningRunEntry_ID()));

			//	Engine
			PrintInfo info = new PrintInfo(
				bp.getName(),
				X_C_DunningRunEntry.Table_ID,
				entry.getC_DunningRunEntry_ID(),
				entry.getC_BPartner_ID());
			info.setDescription(bp.getName() + ", Amt=" + entry.getAmt());
			ReportEngine re = new ReportEngine(getCtx(), format, query, info);
			boolean printed = false;
			if (p_EMailPDF)
			{
				EMail email = client.createEMail(to.getEMail(), null, null);
				if (!email.isValid())
				{
					addLog (entry.get_ID(), null, null, 
						"@RequestActionEMailError@ Invalid EMail: " + to);
					errors++;
					continue;
				}
				mText.setUser(to);	//	variable context
				mText.setBPartner(bp);
				mText.setPO(entry);
				String message = mText.getMailText(true);
				if (mText.isHtml())
					email.setMessageHTML(mText.getMailHeader(), message);
				else
				{
					email.setSubject (mText.getMailHeader());
					email.setMessageText (message);
				}
				//
				File attachment = re.getPDF(File.createTempFile("Dunning", ".pdf"));
				log.fine(to + " - " + attachment);
				email.addAttachment(attachment);
				//
				String msg = email.send();
				MUserMail um = new MUserMail(mText, entry.getAD_User_ID(), email);
				um.save();
				if (msg.equals(EMail.SENT_OK))
				{
					addLog (entry.get_ID(), null, null,
						bp.getName() + " @RequestActionEMailOK@");
					count++;
					printed = true;
				}
				else
				{
					addLog (entry.get_ID(), null, null,
						bp.getName() + " @RequestActionEMailError@ " + msg);
					errors++;
				}
			}
			else
			{
				re.print ();
				count++;
				printed = true;
			}
			if (printed)
			{
				entry.setProcessed (true);
				entry.save ();
			}

		}	//	for all dunning letters
		if (p_EMailPDF)
			return "@Sent@=" + count + " - @Errors@=" + errors;
		return "@Printed@=" + count;
	}	//	doIt
	
}	//	DunningPrint
