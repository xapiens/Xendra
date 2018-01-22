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

import org.compiere.model.MPeriodControl;
import org.compiere.model.reference.REF_C_PeriodControlAction;
import org.compiere.model.reference.REF_C_PeriodControlStatus;
import org.compiere.util.*;

import org.xendra.annotations.*;

/**
 *	Open/Close Period Control
 *	
 *  @author Jorg Janke
 *  @version $Id: PeriodControlStatus.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="C_PeriodControl_Process",
name="Open/Close",
description="Change Period Status",
help="",
Identifier="9d722911-3461-4489-e497-210c7badfef3",
classname="org.compiere.process.PeriodControlStatus",
updated="2015-06-20 10:10:12")	
public class PeriodControlStatus extends SvrProcess
{
	/** Period Control				*/
	private int 		p_C_PeriodControl_ID = 0;
	
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
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
		p_C_PeriodControl_ID = getRecord_ID();
	}	//	prepare

	/**
	 * 	Process
	 *	@return message
	 *	@throws Exception
	 */
	protected String doIt() throws Exception
	{
		log.info ("C_PeriodControl_ID=" + p_C_PeriodControl_ID);
		MPeriodControl pc = new MPeriodControl (getCtx(), p_C_PeriodControl_ID, get_TrxName());
		if (pc.get_ID() == 0)
			throw new XendraUserError("@NotFound@  @C_PeriodControl_ID@=" + p_C_PeriodControl_ID);
		//	Permanently closed
		if (REF_C_PeriodControlAction.PermanentlyClosePeriod.equals(pc.getPeriodStatus()))
			throw new XendraUserError("@PeriodStatus@ = " + pc.getPeriodStatus());
		//	No Action
		if (REF_C_PeriodControlAction.NoAction.equals(pc.getPeriodAction()))
			return "@OK@";
	
		//	Open
		if (REF_C_PeriodControlAction.OpenPeriod.equals(pc.getPeriodAction()))
			pc.setPeriodStatus(REF_C_PeriodControlStatus.Open);
		//	Close
		if (REF_C_PeriodControlAction.ClosePeriod.equals(pc.getPeriodAction()))
			pc.setPeriodStatus(REF_C_PeriodControlStatus.Closed);
		//	Close Permanently
		if (REF_C_PeriodControlAction.PermanentlyClosePeriod.equals(pc.getPeriodAction()))
			pc.setPeriodStatus(REF_C_PeriodControlStatus.PermanentlyClosed);
		pc.setPeriodAction(REF_C_PeriodControlAction.NoAction);
		//
		boolean ok = pc.save();
		
		//	Reset Cache
		CacheMgt.get().reset("C_PeriodControl", 0);
		CacheMgt.get().reset("C_Period", pc.getC_Period_ID());

		if (!ok)
			return "@Error@";
		return "@OK@";
	}	//	doIt

}	//	PeriodControlStatus
