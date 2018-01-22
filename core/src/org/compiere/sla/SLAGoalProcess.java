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
package org.compiere.sla;

import java.sql.*;

import org.compiere.model.MSLACriteria;
import org.compiere.model.MSLAGoal;
import org.compiere.process.*;
import java.util.logging.*;
import org.compiere.util.*;

import org.xendra.annotations.XendraProcess;

/**
 *	Service Level Agreement Goal.
 *	If automatic, capture measures - and calculate/update the actual measure.
 *	
 *  @author Jorg Janke
 *  @version $Id: SLAGoalProcess.java 5583 2015-08-05 14:11:58Z xapiens $
 */
public class SLAGoalProcess extends SvrProcess
{
	/** Goal					*/
	private int			p_PA_SLA_Goal_ID;

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
		p_PA_SLA_Goal_ID = getRecord_ID();
	}	//	prepare

	/**
	 * 	Process
	 *	@return info
	 *	@throws Exception
	 */
//	@XendraProcess(value="PA_SLA_Goal_Calculate",
//	name="Capture + Calculate Measures",
//	description="Capture and Calculate Measures",
//	help="If automatic, capture measures - and calculate/update the actual measure.",
//	id="86226409-f60a-4805-6068-af3cffa11e84",
//	ParametersName={""},
//	ParametersType={},
//	ParametersSeqNo={},
//	ParametersReference={""},
//	ParametersReferenceValue={""},
//	ParametersIsMandatory={""},
//	ParametersIsRange={""},
//	ParametersDefaultValue={""},
//	ParametersDefaultValue2={""},
//	ParametersvFormat={""},
//	ParametersvalueMin={""},
//	ParametersvalueMax={""},
//	ParametersDisplayLogic={""},
//	ParametersReadOnlyLogic={""})	
	public String doIt () throws Exception
	{
		log.info ("PA_SLA_Goal_ID=" + p_PA_SLA_Goal_ID);
		MSLAGoal goal = new MSLAGoal(getCtx(), p_PA_SLA_Goal_ID, get_TrxName());
		if (goal.get_ID() == 0)
			throw new XendraUserError("@PA_SLA_Goal_ID@ " + p_PA_SLA_Goal_ID);

		MSLACriteria criteria = MSLACriteria.get(getCtx(), goal.getPA_SLA_Criteria_ID(), get_TrxName());
		if (criteria.get_ID() == 0)
			throw new XendraUserError("@PA_SLA_Criteria_ID@ " + goal.getPA_SLA_Criteria_ID());
		
		SLACriteria pgm = criteria.newInstance();
		int no = pgm.createMeasures(goal);
		//
		goal.setMeasureActual(pgm.calculateMeasure(goal));
		goal.setDateLastRun(new Timestamp(System.currentTimeMillis()));
		goal.save();
		//
		return "@Created@ " + no + " - @MeasureActual@=" + goal.getMeasureActual();
	}	//	doIt

}	//	SLAGoalProcess
