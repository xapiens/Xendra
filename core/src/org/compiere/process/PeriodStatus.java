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

import org.compiere.model.MPeriod;
import org.compiere.model.reference.REF_C_PeriodControlAction;
import org.compiere.model.reference.REF_C_PeriodControlStatus;
import org.compiere.util.*;

import org.xendra.annotations.*;

/**
 *	Open/Close all Period (Control)
 *	
 *  @author Jorg Janke
 *  @version $Id: PeriodStatus.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="C_Period_Process",
name="Open/Close All",
description="Change Period Status for all Period Controls of this Period",
help="",
Identifier="07e1b2b2-3185-4ef1-7595-ac94623b5bd4",
classname="org.compiere.process.PeriodStatus",
updated="2015-06-20 10:10:12")	
public class PeriodStatus extends SvrProcess
{
	/** Period						*/
	private int			p_C_Period_ID = 0;
	/** Action						*/
	@XendraProcessParameter(Name="Period Action",
			                ColumnName="PeriodAction",
			                Description="Action taken for this period",
			                Help="The Period Action indicates the action to be taken for this period.  For example 'Close Period' or 'Open Period'.",
			                AD_Reference_ID=DisplayType.List,
			                SeqNo=0,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="O",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="c4ab89f6-25e4-e85d-6ed5-328ac222b0b9")	
	private String		p_PeriodAction = null;
	
	
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
			else if (name.equals("PeriodAction"))
				p_PeriodAction = (String)para[i].getParameter();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
		p_C_Period_ID = getRecord_ID();
	}	//	prepare

	/**
	 * 	Process
	 *	@return message
	 *	@throws Exception
	 */
	protected String doIt() throws Exception
	{
		log.info ("C_Period_ID=" + p_C_Period_ID + ", PeriodAction=" + p_PeriodAction);
		MPeriod period = new MPeriod (getCtx(), p_C_Period_ID, get_TrxName());
		if (period.get_ID() == 0)
			throw new XendraUserError("@NotFound@  @C_Period_ID@=" + p_C_Period_ID);

		StringBuffer sql = new StringBuffer ("UPDATE C_PeriodControl ");
		sql.append("SET PeriodStatus='");
		//	Open
		if (REF_C_PeriodControlAction.OpenPeriod.equals(p_PeriodAction))
			sql.append (REF_C_PeriodControlStatus.Open);
		//	Close
		else if (REF_C_PeriodControlAction.ClosePeriod.equals(p_PeriodAction))
			sql.append (REF_C_PeriodControlStatus.Closed);
		//	Close Permanently
		else if (REF_C_PeriodControlAction.PermanentlyClosePeriod.equals(p_PeriodAction))
			sql.append (REF_C_PeriodControlStatus.PermanentlyClosed);
		else
			return "-";
		//
		sql.append("', PeriodAction='N', Updated=CURRENT_TIMESTAMP,UpdatedBy=").append(getAD_User_ID());
		//	WHERE
		sql.append(" WHERE C_Period_ID=").append(period.getC_Period_ID())
			.append(" AND PeriodStatus<>'P'")
			.append(" AND PeriodStatus<>'").append(p_PeriodAction).append("'");
			
		int no = DB.executeUpdate(sql.toString(), get_TrxName());
		
		CacheMgt.get().reset("C_PeriodControl", 0);
		CacheMgt.get().reset("C_Period", p_C_Period_ID);
		return "@Updated@ #" + no;
	}	//	doIt

}	//	PeriodStatus
