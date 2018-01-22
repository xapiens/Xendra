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

import org.compiere.model.MCommission;

import java.util.logging.*;
import org.compiere.util.*;

import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;


/**
 *	Copy Commission	
 *	
 *  @author Jorg Janke
 *  @version $Id: CommissionCopy.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="C_Commission_Copy",
name="Copy Lines",
description="Copy Commission Lines from other Commission",
help="",
Identifier="197629c5-71d9-a9a7-6c08-fe00ae14cb90",
classname="org.compiere.process.CommissionCopy",
updated="2015-06-20 10:10:12")	
public class CommissionCopy extends SvrProcess
{
	/**	From Commission			*/
	@XendraProcessParameter(Name="Commission",
			                ColumnName="C_Commission_ID",
			                Description="Commission",
			                Help="The Commission Rules or internal or external company agents, sales reps or vendors.",
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
			                Identifier="402bc39d-713e-855f-dff5-90dd6d627ad0")	
	private int 	p_C_Commission_ID = 0;
	/** To Commission			*/
	private int		p_C_CommissionTo_ID = 0;
	
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
			else if (name.equals("C_Commission_ID"))
				p_C_Commission_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "prepare - Unknown Parameter: " + name);
		}
		p_C_CommissionTo_ID = getRecord_ID();
	}	//	prepare

	/**
	 * 	Process - copy
	 *	@return message
	 *	@throws Exception
	 */
	protected String doIt () throws Exception
	{
		log.info("doIt - C_Commission_ID=" + p_C_Commission_ID + " - copy to " + p_C_CommissionTo_ID);
		MCommission comFrom = new MCommission (getCtx(), p_C_Commission_ID, get_TrxName());
		if (comFrom.get_ID() == 0)
			throw new XendraUserError ("No From Commission");
		MCommission comTo = new MCommission (getCtx(), p_C_CommissionTo_ID, get_TrxName());
		if (comTo.get_ID() == 0)
			throw new XendraUserError ("No To Commission");
		
		//
		int no = comTo.copyLinesFrom(comFrom);
		return "@Copied@: " + no;
	}	//	doIt

}	//	CommissionCopy
