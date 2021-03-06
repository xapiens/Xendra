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

import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_C_AcctProcessor;
import org.compiere.model.persistence.X_R_RequestProcessor;
import org.compiere.model.reference.REF__FrequencyType;
import org.compiere.util.*;

/**
 *	Request Processor Model
 *	
 *  @author Jorg Janke
 *  @version $Id: MRequestProcessor.java 5822 2016-06-15 22:56:06Z xapiens $
 */
public class MRequestProcessor extends X_R_RequestProcessor 
	implements XendraProcessor
{
	/**
	 * 	Get Active Request Processors
	 *	@param ctx context
	 *	@return array of Request 
	 */
	public static MRequestProcessor[] getActive (Properties ctx)
	{
		MRequestProcessor[] retValue = null;
		List<MRequestProcessor> list = new ArrayList<MRequestProcessor>();
		X_A_Machine machine = new Query(Env.getCtx(), X_A_Machine.Table_Name, "Mac_Address = ?", null)
							.setParameters(Util.getLocalMacAddress()).first();
		if (machine != null)
		{
			list = new Query(Env.getCtx(), X_R_RequestProcessor.Table_Name, "IsActive='Y' AND A_Machine_ID = ?", null)
			.setParameters(machine.getA_Machine_ID())
			.list();
		}
		retValue = new MRequestProcessor[list.size ()];
		list.toArray (retValue);		
		return retValue;
	}	//	getActive
	
	/**	Static Logger	*/
	private static CLogger	s_log	= CLogger.getCLogger (MRequestProcessor.class);

	
	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param R_RequestProcessor_ID id
	 */
	public MRequestProcessor (Properties ctx, int R_RequestProcessor_ID, String trxName)
	{
		super (ctx, R_RequestProcessor_ID, trxName);
		if (R_RequestProcessor_ID == 0)
		{
		//	setName (null);
			setFrequencyType (REF__FrequencyType.Day);
			setFrequency (0);
			setKeepLogDays (7);
			setOverdueAlertDays (0);
			setOverdueAssignDays (0);
			setRemindDays (0);
		//	setSupervisor_ID (0);
		}	
	}	//	MRequestProcessor

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 */
	public MRequestProcessor (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MRequestProcessor

	/**
	 * 	Parent Constructor
	 *	@param parent parent
	 *	@param Supervisor_ID Supervisor
	 */
	public MRequestProcessor (MClient parent, int Supervisor_ID)
	{
		this (parent.getCtx(), 0, parent.get_TrxName());
		setClientOrg(parent);
		setName (parent.getName() + " - " 
			+ Msg.translate(getCtx(), "R_RequestProcessor_ID"));
		setSupervisor_ID (Supervisor_ID);
	}	//	MRequestProcessor
	
	
	/**	The Lines						*/
	private MRequestProcessorRoute[]	m_routes = null;

	/**
	 * 	Get Routes
	 *	@param reload reload data
	 *	@return array of routes
	 */
	public MRequestProcessorRoute[] getRoutes (boolean reload)
	{
		if (m_routes != null && !reload)
			return m_routes;
		
		String sql = "SELECT * FROM R_RequestProcessor_Route WHERE R_RequestProcessor_ID=? ORDER BY SeqNo";
		ArrayList<MRequestProcessorRoute> list = new ArrayList<MRequestProcessorRoute>();
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, get_TrxName());
			pstmt.setInt (1, getR_RequestProcessor_ID());
			ResultSet rs = pstmt.executeQuery ();
			while (rs.next ())
				list.add (new MRequestProcessorRoute (getCtx(), rs, get_TrxName()));
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, sql, e);
		}
		try
		{
			if (pstmt != null)
				pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			pstmt = null;
		}
		//
		m_routes = new MRequestProcessorRoute[list.size ()];
		list.toArray (m_routes);
		return m_routes;
	}	//	getRoutes
	
	/**
	 * 	Get Logs
	 *	@return Array of Logs
	 */
	public XendraProcessorLog[] getLogs()
	{
		ArrayList<MRequestProcessorLog> list = new ArrayList<MRequestProcessorLog>();
		String sql = "SELECT * "
			+ "FROM R_RequestProcessorLog "
			+ "WHERE R_RequestProcessor_ID=? " 
			+ "ORDER BY Created DESC";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, get_TrxName());
			pstmt.setInt (1, getR_RequestProcessor_ID());
			ResultSet rs = pstmt.executeQuery ();
			while (rs.next ())
				list.add (new MRequestProcessorLog (getCtx(), rs, get_TrxName()));
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, sql, e);
		}
		try
		{
			if (pstmt != null)
				pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			pstmt = null;
		}
		MRequestProcessorLog[] retValue = new MRequestProcessorLog[list.size ()];
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
		String sql = "DELETE FROM R_RequestProcessorLog "
			+ "WHERE R_RequestProcessor_ID=" + getR_RequestProcessor_ID() 
			+ " AND (Created+cast('1 day' as interval) *" + getKeepLogDays() + ") < CURRENT_TIMESTAMP";
		int no = DB.executeUpdate(sql, get_TrxName());
		return no;
	}	//	deleteLog
	
	/**
	 * 	Get the date Next run
	 * 	@param requery requery database
	 * 	@return date next run
	 */
	public Timestamp getDateNextRun (boolean requery)
	{
		if (requery)
			load(get_TrxName());
		return getDateNextRun();
	}	//	getDateNextRun

	/**
	 * 	Get Unique ID
	 *	@return Unique ID
	 */
	public String getServerID()
	{
		return "RequestProcessor" + get_ID();
	}	//	getServerID
	
}	//	MRequestProcessor
