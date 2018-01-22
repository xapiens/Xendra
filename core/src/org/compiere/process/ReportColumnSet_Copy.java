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
 *  Copy Column Set at the end of the Column Set
 *
 *  @author Jorg Janke
 *  @version $Id: ReportColumnSet_Copy.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="PA_ReportColumnSet_Copy",
name="Copy Columns",
description="Copy Report Columns from other Column Set",
help="Copy columns at the end of this Column Set. Please note that you need to re-set the calculation operands.",
Identifier="446ef822-9c87-8b07-0125-162a8c405fa2",
classname="org.compiere.process.ReportColumnSet_Copy",
updated="2015-06-20 10:10:12")
public class ReportColumnSet_Copy extends SvrProcess
{
	/**
	 * 	Constructor
	 */
	public ReportColumnSet_Copy()
	{
		super();
	}	//	ReportColumnSet_Copy

	/**	Source Line Set					*/
	@XendraProcessParameter(Name="Report Column Set",
			                ColumnName="PA_ReportColumnSet_ID",
			                Description="Collection of Columns for Report",
			                Help="The Report Column Set identifies the columns used in a Report.",
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
			                Identifier="b3c444a2-93ee-8b92-3b27-2cef41e04154")	
	private int		m_PA_ReportColumnSet_ID = 0;

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
			else if (name.equals("PA_ReportColumnSet_ID"))
				m_PA_ReportColumnSet_ID = ((BigDecimal)para[i].getParameter()).intValue();
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
		log.info("From PA_ReportColumnSet_ID=" + m_PA_ReportColumnSet_ID + ", To=" + to_ID);
		if (to_ID < 1)
			throw new Exception(MSG_SaveErrorRowNotFound);
		//
		MReportColumnSet to = new MReportColumnSet(getCtx(), to_ID, get_TrxName());
		MReportColumnSet rcSet = new MReportColumnSet(getCtx(), m_PA_ReportColumnSet_ID, get_TrxName());
		MReportColumn[] rcs = rcSet.getColumns();
		for (int i = 0; i < rcs.length; i++)
		{
			MReportColumn rc = MReportColumn.copy (getCtx(), to.getAD_Client_ID(), to.getAD_Org_ID(), to_ID, rcs[i], get_TrxName());
			rc.save();
		}
		//	Oper 1/2 were set to Null !
		return "@Copied@=" + rcs.length;
	}	//	doIt

}	//	ReportColumnSet_Copy
