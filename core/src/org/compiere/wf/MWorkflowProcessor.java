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
package org.compiere.wf;

import java.sql.*;
import java.util.*;

import org.compiere.model.Query;
import org.compiere.model.XendraProcessor;
import org.compiere.model.XendraProcessorLog;
import org.compiere.model.persistence.X_AD_WorkflowProcessor;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_C_AcctProcessor;

import java.util.logging.*;

import org.compiere.util.*;



/**
 *	Workflow Processor Model
 *	
 *  @author Jorg Janke
 *  @version $Id: MWorkflowProcessor.java 5822 2016-06-15 22:56:06Z xapiens $
 */
public class MWorkflowProcessor extends X_AD_WorkflowProcessor
	implements XendraProcessor
{
	/**
	 * 	Get Active
	 *	@param ctx context
	 *	@return active processors
	 */
	public static MWorkflowProcessor[] getActive (Properties ctx)
	{
		MWorkflowProcessor[] retValue = null;
		List<MWorkflowProcessor> list = new ArrayList<MWorkflowProcessor>();
		X_A_Machine machine = new Query(Env.getCtx(), X_A_Machine.Table_Name, "Mac_Address = ?", null)
							.setParameters(Util.getLocalMacAddress()).first();
		if (machine != null)
		{
			list = new Query(Env.getCtx(), X_AD_WorkflowProcessor.Table_Name, "IsActive='Y' AND A_Machine_ID = ?", null)
			.setParameters(machine.getA_Machine_ID())
			.list();
		}
		retValue = new MWorkflowProcessor[list.size ()];
		list.toArray (retValue);		
		return retValue;
	}	//	getActive
	
	
	/**	Static Logger	*/
	private static CLogger	s_log	= CLogger.getCLogger (MWorkflowProcessor.class);
	
	
	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param AD_WorkflowProcessor_ID id
	 * 	@param trxName transaction
	 */
	public MWorkflowProcessor (Properties ctx, int AD_WorkflowProcessor_ID, String trxName)
	{
		super (ctx, AD_WorkflowProcessor_ID, trxName);
	}	//	MWorkflowProcessor

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 * 	@param trxName transaction
	 */
	public MWorkflowProcessor (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MWorkflowProcessor

	/**
	 * 	Get Server ID
	 *	@return id
	 */
	public String getServerID ()
	{
		return "WorkflowProcessor" + get_ID();
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
		ArrayList<MWorkflowProcessorLog> list = new ArrayList<MWorkflowProcessorLog>();
		String sql = "SELECT * "
			+ "FROM AD_WorkflowProcessorLog "
			+ "WHERE AD_WorkflowProcessor_ID=? " 
			+ "ORDER BY Created DESC";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, get_TrxName());
			pstmt.setInt (1, getAD_WorkflowProcessor_ID());
			ResultSet rs = pstmt.executeQuery ();
			while (rs.next ())
				list.add (new MWorkflowProcessorLog (getCtx(), rs, get_TrxName()));
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
		MWorkflowProcessorLog[] retValue = new MWorkflowProcessorLog[list.size ()];
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
		String sql = "DELETE FROM AD_WorkflowProcessorLog "
			+ "WHERE AD_WorkflowProcessor_ID=" + getAD_WorkflowProcessor_ID() 
			+ " AND (Created+cast('1 day' as interval) *" + getKeepLogDays() + ") < CURRENT_TIMESTAMP";
		int no = DB.executeUpdate(sql, get_TrxName());
		return no;
	}	//	deleteLog

}	//	MWorkflowProcessor
