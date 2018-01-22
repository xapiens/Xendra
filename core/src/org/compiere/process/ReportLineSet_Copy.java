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
import org.compiere.report.*;
import org.compiere.util.DisplayType;
import org.xendra.annotations.*;

/**
 *	Copy Line Set at the end of the Line Set
 *
 *  @author Jorg Janke
 *  @version $Id: ReportLineSet_Copy.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="PA_ReportLineSet_Copy",
name="Copy Lines",
description="Copy Report Lines from other Line Set",
help="Copy lines at the end of this Line Set. Please note that you need to re-set the calculation operands.",
Identifier="40d32397-202a-5797-584a-279216901f23",
classname="org.compiere.process.ReportLineSet_Copy",
updated="2015-06-20 10:10:12")
public class ReportLineSet_Copy extends SvrProcess
{
	/**
	 * 	Constructor
	 */
	public ReportLineSet_Copy()
	{
		super();
	}	//	ReportLineSet_Copy

	/**	Source Line Set					*/
	@XendraProcessParameter(Name="Report Line Set",
			                ColumnName="PA_ReportLineSet_ID",
			                Description="",
			                Help="",
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
			                Identifier="2d9528b5-e33a-6b13-4bfa-753477d1dedc")	
	private int		m_PA_ReportLineSet_ID = 0;

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
			else if (name.equals("PA_ReportLineSet_ID"))
				m_PA_ReportLineSet_ID = ((BigDecimal)para[i].getParameter()).intValue();
			else
				log.log(Level.SEVERE, "prepare - Unknown Parameter: " + name);
		}
	}	//	prepare

	/**
	 *  Perrform process.
	 *  @return Message
	 *  @throws Exception
	 */
	protected String doIt() throws Exception
	{
		int to_ID = super.getRecord_ID();
		log.info("From PA_ReportLineSet_ID=" + m_PA_ReportLineSet_ID + ", To=" + to_ID);
		if (to_ID < 1)
			throw new Exception(MSG_SaveErrorRowNotFound);
		//
		MReportLineSet to = new MReportLineSet(getCtx(), to_ID, get_TrxName());
		MReportLineSet rlSet = new MReportLineSet(getCtx(), m_PA_ReportLineSet_ID, get_TrxName());
		MReportLine[] rls = rlSet.getLiness();
		for (int i = 0; i < rls.length; i++)
		{
			MReportLine rl = MReportLine.copy (getCtx(), to.getAD_Client_ID(), to.getAD_Org_ID(), to_ID, rls[i], get_TrxName());
			rl.save();
			MReportSource[] rss = rls[i].getSources();
			if (rss != null)
			{
				for (int ii = 0; ii < rss.length; ii++)
				{
					MReportSource rs = MReportSource.copy (getCtx(), to.getAD_Client_ID(), to.getAD_Org_ID(), rl.get_ID(), rss[ii], get_TrxName());
					rs.save();
				}
			}
			//	Oper 1/2 were set to Null ! 
		}
		return "@Copied@=" + rls.length;
	}	//	doIt

}	//	ReportLineSet_Copy
