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
import java.util.logging.*;

import org.compiere.model.MProject;
import org.compiere.util.DisplayType;

import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;
/**
 *  Copy Project Details
 *
 *	@author Jorg Janke
 *	@version $Id: CopyFromProject.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="C_Project CopyFrom",
name="Copy Details",
description="Copy Lines/Phases/Tasks from other Project",
help="",
Identifier="e01dbbd1-e201-45c7-a622-f4b512d5cb38",
classname="org.compiere.process.CopyFromProject",
updated="2015-06-20 10:10:12")	
public class CopyFromProject extends SvrProcess
{
	@XendraProcessParameter(Name="Project",
			                ColumnName="C_Project_ID",
			                Description="Financial Project",
			                Help="A Project allows you to track and control internal or external activities.",
			                AD_Reference_ID=DisplayType.Search,
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
			                Identifier="eb5c7261-9402-7367-046e-32bd2427dc98")	
	private int		m_C_Project_ID = 0;

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
			else if (name.equals("C_Project_ID"))
				m_C_Project_ID = ((BigDecimal)para[i].getParameter()).intValue();
			else
				log.log(Level.SEVERE, "prepare - Unknown Parameter: " + name);
		}
	}	//	prepare

	/**
	 *  Perrform process.
	 *  @return Message (clear text)
	 *  @throws Exception if not successful
	 */
	protected String doIt() throws Exception
	{
		int To_C_Project_ID = getRecord_ID();
		log.info("doIt - From C_Project_ID=" + m_C_Project_ID + " to " + To_C_Project_ID);
		if (To_C_Project_ID == 0)
			throw new IllegalArgumentException("Target C_Project_ID == 0");
		if (m_C_Project_ID == 0)
			throw new IllegalArgumentException("Source C_Project_ID == 0");
		MProject from = new MProject (getCtx(), m_C_Project_ID, get_TrxName());
		MProject to = new MProject (getCtx(), To_C_Project_ID, get_TrxName());
		//
		int no = to.copyDetailsFrom (from);

		return "@Copied@=" + no;
	}	//	doIt

}	//	CopyFromProject
