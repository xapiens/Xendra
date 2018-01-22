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
import java.util.*;
import java.util.logging.*;

import org.compiere.model.MBankStatementLoader;
import org.compiere.util.*;

import org.xendra.annotations.*;

/**
 *	Process for loading Bank Statements into I_BankStatement
 *
 *	@author Maarten Klinker, Eldir Tomassen
 *	@version $Id: LoadBankStatement.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="Load_BankStatement",
name="Load Bank Statement",
description="Load Bank Statement",
help="Load the bank statement into the import table. The parameters used depend on the actual loader.",
Identifier="3905cee2-ea8d-796d-4693-fae9331d821e",
classname="org.compiere.process.LoadBankStatement",
updated="2015-06-20 10:10:12")
public class LoadBankStatement extends SvrProcess
{
	public LoadBankStatement()
	{
		super();
		log.info("LoadBankStatement");
	}	//	LoadBankStatement

	/**	Client to be imported to			*/
	private int				m_AD_Client_ID = 0;

	/** Organization to be imported to			*/
	private int				m_AD_Org_ID = 0;
	
	/** Ban Statement Loader				*/
	@XendraProcessParameter(Name="Bank Statement Loader",
			                ColumnName="C_BankStatementLoader_ID",
			                Description="Definition of Bank Statement Loader (SWIFT, OFX)",
			                Help="The loader definition privides the parameters to load bank statements from EFT formats like SWIFT (MT940) or OFX",
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
			                Identifier="f62b02d0-4bb8-aa4c-9e20-ed4b8abcb1dc")	
	private int m_C_BankStmtLoader_ID = 0;

	/** File to be imported					*/
	@XendraProcessParameter(Name="File Name",
			                ColumnName="FileName",
			                Description="Name of the local file or URL",
			                Help="Name of a file in the local directory space - or URL (file://.., http://.., ftp://..)",
			                AD_Reference_ID=DisplayType.FileName,
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
			                Identifier="c42b431e-fa4f-b5bd-ca21-064c3c700c83")	
	private String fileName = "";
	
	/** Current context					*/
	private Properties m_ctx;
	
	/** Current context					*/
	private MBankStatementLoader m_controller = null;
	

	/**
	 *  Prepare - e.g., get Parameters.
	 */
	protected void prepare()
	{
		log.info("");
		m_ctx = Env.getCtx();
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (name.equals("C_BankStatementLoader_ID"))
				m_C_BankStmtLoader_ID = ((BigDecimal)para[i].getParameter()).intValue();
			else if (name.equals("FileName"))
				fileName = (String)para[i].getParameter();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
		m_AD_Client_ID = Env.getAD_Client_ID(m_ctx);
		log.info("AD_Client_ID=" + m_AD_Client_ID);
		m_AD_Org_ID = Env.getAD_Org_ID(m_ctx);
		log.info("AD_Org_ID=" + m_AD_Org_ID);
		log.info("C_BankStatementLoader_ID=" + m_C_BankStmtLoader_ID);
	}	//	prepare


	/**
	 *  Perform process.
	 *  @return Message
	 *  @throws Exception
	 */
	protected String doIt() throws java.lang.Exception
	{
		log.info("LoadBankStatement.doIt");
		String message = "@Error@";
		
		m_controller = new MBankStatementLoader(m_ctx, m_C_BankStmtLoader_ID, fileName, get_TrxName());
		log.info(m_controller.toString());
		
		if (m_controller == null || m_controller.get_ID() == 0)
			log.log(Level.SEVERE, "Invalid Loader");

		// Start loading bank statement lines
		else if (!m_controller.loadLines())
			log.log(Level.SEVERE, m_controller.getErrorMessage() + " - " + m_controller.getErrorDescription());
		
		else
		{
			log.info("Imported=" + m_controller.getLoadCount());
			addLog (0, null, new BigDecimal (m_controller.getLoadCount()), "@Loaded@");
			message = "@OK@";
		}

		return message;
	}	//	doIt

}	//	LoadBankStatement
