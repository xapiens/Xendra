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


import java.util.logging.*;

import org.compiere.model.MProject;
import org.compiere.model.MProjectLine;
import org.compiere.model.reference.REF_C_ProjectTypeCategory;

import org.xendra.annotations.*; 
/**
 *  Close Project.
 *
 *	@author Jorg Janke
 *	@version $Id: ProjectClose.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="C_Project Close",
name="Close Project",
description="",
help="",
Identifier="5d84e034-4c0e-71a5-a5b8-9f1670b7007d",
classname="org.compiere.process.ProjectClose",
updated="2015-06-20 10:10:12")
public class ProjectClose extends SvrProcess
{
	/**	Project from Record			*/
	private int 		m_C_Project_ID = 0;

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
			else
				log.log(Level.SEVERE, "prepare - Unknown Parameter: " + name);
		}
		m_C_Project_ID = getRecord_ID();
	}	//	prepare

	/**
	 *  Perrform process.
	 *  @return Message (translated text)
	 *  @throws Exception if not successful
	 */
	protected String doIt() throws Exception
	{
		MProject project = new MProject (getCtx(), m_C_Project_ID, get_TrxName());
		log.info("doIt - " + project);

		MProjectLine[] projectLines = project.getLines();
		if (REF_C_ProjectTypeCategory.WorkOrderJob.equals(project.getProjectCategory())
			|| REF_C_ProjectTypeCategory.AssetProject.equals(project.getProjectCategory()))
		{
			/** @todo Check if we should close it */
		}

		//	Close lines
		for (int line = 0; line < projectLines.length; line++)
		{
			projectLines[line].setProcessed(true);
			projectLines[line].save();
		}

		project.setProcessed(true);
		project.save();

		return "";
	}	//	doIt

}	//	ProjectClose
