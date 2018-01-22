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
package org.compiere.model;

import java.sql.*;
import java.util.*;
import java.util.logging.*;

import org.compiere.model.persistence.X_AD_Alert;
import org.compiere.model.persistence.X_AD_AlertProcessor;
import org.compiere.model.persistence.X_AD_AlertProcessorLog;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_C_AcctProcessor;
import org.compiere.util.*;
import org.compiere.wf.MWorkflowProcessor;


/**
 *	Alert Processor
 *	
 *  @author Jorg Janke
 *  @version $Id: MAlertProcessor.java 5822 2016-06-15 22:56:06Z xapiens $
 */
public class MAlertProcessor extends X_AD_AlertProcessor
	implements XendraProcessor
{
	/**
	 * 	Get Active
	 *	@param ctx context
	 *	@return active processors
	 */
	public static MAlertProcessor[] getActive (Properties ctx)
	{
		MAlertProcessor[] retValue = null;
		List<MAlertProcessor> list = new ArrayList<MAlertProcessor>();
		X_A_Machine machine = new Query(Env.getCtx(), X_A_Machine.Table_Name, "Mac_Address = ?", null)
							.setParameters(Util.getLocalMacAddress()).first();
		if (machine != null)
		{
			list = new Query(Env.getCtx(), X_AD_AlertProcessor.Table_Name, "IsActive='Y' AND A_Machine_ID = ?", null)
			.setParameters(machine.getA_Machine_ID())
			.list();
		}
		retValue = new MAlertProcessor[list.size ()];
		list.toArray (retValue);		
		return retValue;
	}	//	getActive

	/**	Static Logger	*/
	private static CLogger	s_log	= CLogger.getCLogger (MAlertProcessor.class);

	
	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param AD_AlertProcessorLog_ID id
	 *	@param trxName transaction
	 */
	public MAlertProcessor (Properties ctx, int AD_AlertProcessorLog_ID, String trxName)
	{
		super (ctx, AD_AlertProcessorLog_ID, trxName);
	}	//	MAlertProcessor

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MAlertProcessor (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MAlertProcessor

	/**	The Alerts						*/
	private MAlert[]		m_alerts = null;

	/**
	 * 	Get Server ID
	 *	@return id
	 */
	public String getServerID ()
	{
		return "AlertProcessor" + get_ID();
	}	//	getServerID

	/**
	 * 	Get Date Next Run
	 *	@param requery requery
	 *	@return date next run
	 */
	public Timestamp getDateNextRun (boolean requery)
	{
		if (requery)
			load(get_TrxName());
		return getDateNextRun();
	}	//	getDateNextRun

	/**
	 * 	Get Logs
	 *	@return logs
	 */
	public XendraProcessorLog[] getLogs ()
	{
		String where = "";
		List<MAlertProcessorLog> list = new Query(Env.getCtx(), X_AD_AlertProcessorLog.Table_Name, where, null)
			.setParameters(getAD_AlertProcessor_ID()).setOrderBy("Created DESC").list();		
		MAlertProcessorLog[] retValue = new MAlertProcessorLog[list.size ()];
		list.toArray (retValue);
		return retValue;
	}	//	getLogs

	/**
	 * 	Delete old Request Log
	 *	@return number of records
	 */
	public int deleteLog()
	{
		if (getKeepLogDays() < 1)
			return 0;
		String sql = "DELETE FROM AD_AlertProcessorLog "
			+ "WHERE AD_AlertProcessor_ID=" + getAD_AlertProcessor_ID() 
			+ " AND (Created + cast('1 day' as interval) *" + getKeepLogDays() + ") < CURRENT_TIMESTAMP";
		int no = DB.executeUpdate(sql, get_TrxName());
		return no;
	}	//	deleteLog

	
	/**
	 * 	Get Alerts
	 *	@param reload reload data
	 *	@return array of alerts
	 */
	public MAlert[] getAlerts (boolean reload)
	{
		if (m_alerts != null && !reload)
			return m_alerts;
		String where = "AD_AlertProcessor_ID=?";
		List<X_AD_Alert> list = new Query(Env.getCtx(), X_AD_Alert.Table_Name, where, null)
			.setParameters(getAD_AlertProcessor_ID()).list();
		//
		m_alerts = new MAlert[list.size ()];
		list.toArray (m_alerts);
		return m_alerts;
	}	//	getAlerts

}	//	MAlertProcessor
