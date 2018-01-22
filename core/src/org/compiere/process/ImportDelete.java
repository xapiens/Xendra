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

import org.compiere.model.MTable;

import java.util.logging.*;
import org.compiere.util.*;

import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;
/**
 *	Delete Data in Import Table
 *	
 *  @author Jorg Janke
 *  @version $Id: ImportDelete.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="Import_Delete",
name="Delete Import",
description="Delete all data in Import Table",
help="You would delete all data in an import table, if there was a problem with data loading.  The delete does not distinguish between imported and not imported data.",
Identifier="80654d23-9ef3-8254-8021-edf15bbaba54",
classname="org.compiere.process.ImportDelete",
updated="2015-06-20 10:10:12")
public class ImportDelete extends SvrProcess
{
	/**	Table be deleted		*/
	@XendraProcessParameter(Name="Table",
			                ColumnName="AD_Table_ID",
			                Description="Database Table information",
			                Help="The Database Table provides the information of the table definition",
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
			                Identifier="9c9a4e86-fbb3-eff7-a4cc-26387e2a6c74")	
	private int				p_AD_Table_ID = 0;

	/**
	 *  Prepare - e.g., get Parameters.
	 */
	protected void prepare()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (name.equals("AD_Table_ID"))
				p_AD_Table_ID = ((BigDecimal)para[i].getParameter()).intValue();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}	//	prepare


	/**
	 *  Perrform process.
	 *  @return clear Message
	 *  @throws Exception
	 */
	protected String doIt() throws Exception
	{
		log.info("AD_Table_ID=" + p_AD_Table_ID);
		//	get Table Info
		MTable table = new MTable (getCtx(), p_AD_Table_ID, get_TrxName());
		if (table.get_ID() == 0)
			throw new IllegalArgumentException ("No AD_Table_ID=" + p_AD_Table_ID);
		String tableName = table.getTableName();
		if (!tableName.startsWith("I"))
			throw new IllegalArgumentException ("Not an import table = " + tableName);
		
		//	Delete
		String sql = "DELETE FROM " + tableName + " WHERE AD_Client_ID=" + getAD_Client_ID();
		int no = DB.executeUpdate(sql, get_TrxName());
		String msg = Msg.translate(getCtx(), tableName + "_ID") + " #" + no;
		return msg;
	}	//	ImportDelete

}	//	ImportDelete
