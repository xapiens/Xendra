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
import org.compiere.util.*;
import org.xendra.annotations.*;
/**
 *	Delere Notes (Notice)
 *	
 *  @author Jorg Janke
 *  @version $Id: NoteDelete.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="AD_NoteDelete",
name="Delete Notices",
description="Delete all Notices",
help="",
Identifier="9dfe299f-6370-392f-7a2c-3f56fd67b9f5",
classname="org.compiere.process.NoteDelete",
updated="2015-06-20 10:10:12")	
public class NoteDelete extends SvrProcess
{
	@XendraProcessParameter(Name="User/Contact",
			                ColumnName="AD_User_ID",
			                Description="User within the system - Internal or Business Partner Contact",
			                Help="The User identifies a unique user in the system. This could be an internal user or a business partner contact",
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
			                Identifier="fed63f24-ab94-cdcd-708c-b5c5afc7ffb5")	
	private int		p_AD_User_ID = -1;
	
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
			else if (name.equals("AD_User_ID"))
				p_AD_User_ID = ((BigDecimal)para[i].getParameter()).intValue();
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
		log.info("doIt - AD_User_ID=" + p_AD_User_ID);
		
		String sql = "DELETE FROM AD_Note WHERE AD_Client_ID=" + getAD_Client_ID();
		if (p_AD_User_ID > 0)
			sql += " AND AD_User_ID=" + p_AD_User_ID;
		//
		int no = DB.executeUpdate(sql, get_TrxName());
		return "@Deleted@ = " + no;
	}	//	doIt

}	//	NoteDelete
