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

import org.compiere.model.MIssue;
import org.compiere.model.MSystem;
import org.compiere.util.*;

import org.xendra.annotations.*;
/**
 * 	Report System Issue
 *	
 *  @author Jorg Janke
 *  @version $Id: IssueReport.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="AD_Issue Report",
name="Report or Update Issue",
description="Report Issue to Adempiere",
help="",
Identifier="fa86ef0b-8aab-0729-907e-c452fa29f587",
classname="org.compiere.process.IssueReport",
updated="2015-06-20 10:10:12")	
public class IssueReport extends SvrProcess
{
	/**	Issue to report			*/
	private int	m_AD_Issue_ID = 0;
	
	/**
	 * 	Prepare
	 */
	protected void prepare ()
	{
		m_AD_Issue_ID = getRecord_ID();
	}	//	prepare

	/**
	 * 	Do It
	 *	@return info
	 *	@throws Exception
	 */
	protected String doIt () throws Exception
	{
		log.info("AD_Issue_ID=" + m_AD_Issue_ID);
		if (!MSystem.get(getCtx()).isAutoErrorReport())
			return "NOT reported - Enable Error Reporting in Window System";
		//
		MIssue issue = new MIssue(getCtx(), m_AD_Issue_ID, get_TrxName());
		if (issue.get_ID() == 0)
			return "No Issue to report - ID=" + m_AD_Issue_ID;
		//
		String error = issue.report();
		if (error != null)
			throw new XendraSystemError(error);
		if (issue.save())
			return "Issue Reported: " + issue.getRequestDocumentNo();
		throw new XendraSystemError("Issue Not Saved");
	}	//	doIt
	
}	//	IssueReport
