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

import org.compiere.model.MField;
import org.compiere.model.MTab;
import org.compiere.model.MWindow;

import java.util.logging.*;
import org.compiere.util.*;

import org.xendra.annotations.*;

/**
 *	Copy all Tabs of a Window
 *	
 *  @author Jorg Janke
 *  @version $Id: WindowCopy.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="AD_Window_Copy",
name="Copy Window Tabs",
description="Copy all Tabs and Fields from other Window",
help="",
Identifier="f07ce68e-494c-474c-0268-db3dcffca872",
classname="org.compiere.process.WindowCopy",
updated="2015-06-20 10:10:12")	
public class WindowCopy extends SvrProcess
{
	/**	Window To					*/
	@XendraProcessParameter(Name="Window",
			                ColumnName="AD_Window_ID",
			                Description="Data entry or display window",
			                Help="The Window field identifies a unique Window in the system.",
			                AD_Reference_ID=DisplayType.TableDir,
			                SeqNo=0,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=10,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="0e3bac46-e47a-1013-8529-87d9b7412d67")	
	private int			p_AD_WindowTo_ID = 0;
	/**	Window From					*/
	private int			p_AD_WindowFrom_ID = 0;
	
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
			else if (name.equals("AD_Window_ID"))
				p_AD_WindowFrom_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "prepare - Unknown Parameter: " + name);
		}
		p_AD_WindowTo_ID = getRecord_ID();
	}	//	prepare

	/**
	 * 	Process
	 *	@return message
	 *	@throws Exception
	 */
	protected String doIt() throws Exception
	{
		log.info("doIt - To AD_Window_ID=" + p_AD_WindowTo_ID + ", From=" + p_AD_WindowFrom_ID);
		MWindow from = new MWindow (getCtx(), p_AD_WindowFrom_ID, get_TrxName());
		if (from.get_ID() == 0)
			throw new XendraUserError("@NotFound@ (from->) @AD_Window_ID@");
		MWindow to = new MWindow (getCtx(), p_AD_WindowTo_ID, get_TrxName());
		if (to.get_ID() == 0)
			throw new XendraUserError("@NotFound@ (to<-) @AD_Window_ID@");
		
		int tabCount = 0;
		int fieldCount = 0;
		MTab[] oldTabs = from.getTabs(false, get_TrxName());
		for (int i = 0; i < oldTabs.length; i++)
		{
			MTab oldTab = oldTabs[i];
			MTab newTab = new MTab (to, oldTab);
			if (newTab.save())
			{
				tabCount++;
				//	Copy Fields
				MField[] oldFields = oldTab.getFields(false, get_TrxName());
				for (int j = 0; j < oldFields.length; j++)
				{
					MField oldField = oldFields[j];
					MField newField = new MField (newTab, oldField);
					if (newField.save())
						fieldCount++;
					else
						throw new XendraUserError("@Error@ @AD_Field_ID@");
				}
			}
			else
				throw new XendraUserError("@Error@ @AD_Tab_ID@");
		}
		
		return "@Copied@ #" + tabCount + "/" + fieldCount;
	}	//	doIt

}	//	WindowCopy
