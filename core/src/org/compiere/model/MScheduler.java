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

import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.model.persistence.X_AD_Scheduler;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.reference.REF_AD_SchedulerType;
import org.compiere.model.reference.REF_Weekdays;
import org.compiere.model.reference.REF__FrequencyType;
import org.compiere.util.*;
import org.xendra.xendrian.Listener;


/**
 *	Scheduler Model
 *	
 *  @author Jorg Janke
 *  @version $Id: MScheduler.java 5822 2016-06-15 22:56:06Z xapiens $
 */
public class MScheduler extends X_AD_Scheduler	implements XendraProcessor
{
	/**
	 * 	Get Active
	 *	@param ctx context
	 *	@return active processors
	 */
	public static MScheduler[] getActive (Properties ctx)
	{
		ArrayList<MScheduler> list = new ArrayList<MScheduler>();
		Machine machine = Env.getMachine();
		if (machine != null)
		{		
			StringBuilder sql = new StringBuilder("SELECT s.* FROM AD_Scheduler s ")
			.append(" LEFT OUTER JOIN AD_Process p ON s.AD_Process_ID = p.AD_Process_ID ")
			.append(" JOIN AD_Process_Machine pm ON p.AD_Process_ID = pm.AD_Process_ID AND pm.A_Machine_ID = ? ")
			.append(" WHERE pm.IsActive='Y' AND s.IsActive = 'Y' ")
			.append("UNION ALL")
			.append(" SELECT s.* FROM AD_Scheduler s  LEFT OUTER JOIN AD_Process p ON s.AD_Process_ID = p.AD_Process_ID")  
			.append(" JOIN ad_schedulermachine sm on s.ad_scheduler_id = sm.ad_scheduler_id")
			.append(" AND sm.a_machine_id = ?")
			.append(" WHERE sm.isactive= 'Y' AND s.IsActive = 'Y'"); 
			PreparedStatement pstmt = null;
			try
			{
				pstmt = DB.prepareStatement (sql.toString(), null);
				pstmt.setInt(1, machine.getA_Machine_ID());
				pstmt.setInt(2, machine.getA_Machine_ID());
				ResultSet rs = pstmt.executeQuery ();
				while (rs.next ())
				{					
					s_log.log(Level.WARNING, String.format("Adding to scheduler %s", rs.getString(X_AD_Scheduler.COLUMNNAME_Name)));
					list.add (new MScheduler (ctx, rs, null));
				}
				rs.close ();
				pstmt.close ();
				pstmt = null;
			}
			catch (Exception e)
			{
				s_log.log(Level.SEVERE, sql.toString(), e);
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
		}
		MScheduler[] retValue = new MScheduler[list.size ()];
		list.toArray (retValue);
		return retValue;		
	}	//	getActive

	public static void startRules(List<Integer> listeners, List<Integer> acceptors)
	{		
		HashMap properties = new HashMap();
		for (Integer listener:listeners)
		{
			//
			String queuename = "";
			String listenerclass = "";
			X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null)
				.setParameters(listener).first();
			if (rule == null)
			{
				System.out.println("Rule not exists");
				s_log.log(Level.WARNING, String.format("%s Rule not exists", listener));
				continue;
			}
			properties = (HashMap) rule.getProperties();
			String type = (String) properties.get("type");		
			System.out.println("type->"+type);
			if (type.equals("kiebase"))
			{
				queuename = (String) properties.get("queuename");
				listenerclass = (String) properties.get("queuelistenerclass");
			}
			else if (type.equals("listen"))
			{
				queuename = (String) properties.get("queuename");
				listenerclass = (String) properties.get("queuelistenerclass");				
			}
			s_log.log(Level.WARNING, String.format("queuename-> %s listenerclass-> %s", queuename, listenerclass));
			if (queuename.length() > 0)
			{				
				s_log.log(Level.WARNING, String.format("Adding Listener %s", listenerclass));
				Env.addlistener(queuename, listenerclass, rule.getAD_Rule_ID());
			}
			
		}
		//boolean startRules = false;
		for (Integer acceptor:acceptors)
		{
			X_AD_Rule startrule = new X_AD_Rule(Env.getCtx(), acceptor, null);			
			List<MRule> rulelist = new Query(Env.getCtx(), X_AD_Rule.Table_Name,"AD_Rule_ID = ? OR Parent_ID = ?", null)
			.setParameters(startrule.getAD_Rule_ID(), startrule.getAD_Rule_ID()).list();
			if (rulelist != null)
			{
				Env.setRules(rulelist, startrule.getAD_Rule_ID());
				s_log.log(Level.WARNING, String.format("Adding Acceptor %s", startrule.getName()));
			}			
		}
		if (listeners != null && listeners.size() > 0)
		{
			for (Object key : Env.getlistener().keySet()) {
				String queuename = (String) key;
				Vector vector = (Vector) Env.getlistener().get(key);
				Listener listener = new Listener(key, vector, "");		
				Thread lpdThread = new Thread(listener);
				//lpdThread.setName("Listener ");
				lpdThread.start();				
			}
		}
//		if (Env.getSessionEntrypoints().size() > 0)
//		{
//			String error = Env.RulesBootstrap();						
//			s_log.log(Level.WARNING, error);
//		}
	}
	/**	Static Logger	*/
	private static CLogger	s_log	= CLogger.getCLogger (MScheduler.class);

	
	/**
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param AD_Scheduler_ID id
	 *	@param trxName transaction
	 */
	public MScheduler (Properties ctx, int AD_Scheduler_ID, String trxName)
	{
		super (ctx, AD_Scheduler_ID, trxName);
		if (AD_Scheduler_ID == 0)
		{
		//	setAD_Process_ID (0);
		//	setName (null);
			setScheduleType (REF_AD_SchedulerType.Frequency);	// F
			setFrequencyType (REF__FrequencyType.Day);
		//	setFrequency (1);
		//	setMonthDay(1);
		//	setWeekDay(WEEKDAY_Monday);
			//
			setKeepLogDays (7);
		//	setSupervisor_ID (0);
		}
	}	//	MScheduler

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MScheduler (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MScheduler

	/**	Process Parameter			*/
	private MSchedulerPara[] m_parameter = null;
	/** Process Recipients			*/
	private MSchedulerRecipient[]	m_recipients = null;
		
	/**
	 * 	Get Server ID
	 *	@return id
	 */
	public String getServerID ()
	{
		return "Scheduler" + get_ID();
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
		ArrayList<MSchedulerLog> list = new ArrayList<MSchedulerLog>();
		String sql = "SELECT * "
			+ "FROM AD_SchedulerLog "
			+ "WHERE AD_Scheduler_ID=? " 
			+ "ORDER BY Created DESC";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, get_TrxName());
			pstmt.setInt (1, getAD_Scheduler_ID());
			ResultSet rs = pstmt.executeQuery ();
			while (rs.next ())
				list.add (new MSchedulerLog (getCtx(), rs, get_TrxName()));
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
		MSchedulerLog[] retValue = new MSchedulerLog[list.size ()];
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
		String sql = "DELETE FROM AD_SchedulerLog "
			+ "WHERE AD_Scheduler_ID=" + getAD_Scheduler_ID() 
			+ " AND (Created+cast('1 day' as interval) *" + getKeepLogDays() + ") < CURRENT_TIMESTAMP";
		int no = DB.executeUpdate(sql, get_TrxName());
		return no;
	}	//	deleteLog

	/**
	 * 	Get Process
	 *	@return process
	 */
	public MProcess getProcess()
	{
		return MProcess.get(getCtx(), getAD_Process_ID());
	}	//	getProcess
	
	/**
	 * 	Get Parameters
	 *	@param reload reload
	 *	@return parameter
	 */
	public MSchedulerPara[] getParameters (boolean reload)
	{
		if (!reload && m_parameter != null)
			return m_parameter;
		ArrayList<MSchedulerPara> list = new ArrayList<MSchedulerPara>();
		String sql = "SELECT * FROM AD_Scheduler_Para WHERE AD_Scheduler_ID=? AND IsActive='Y'";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, null);
			pstmt.setInt (1, getAD_Scheduler_ID());
			ResultSet rs = pstmt.executeQuery ();
			while (rs.next ())
				list.add (new MSchedulerPara (getCtx(), rs, null));
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log (Level.SEVERE, sql, e);
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
		m_parameter = new MSchedulerPara[list.size()];
		list.toArray(m_parameter);
		return m_parameter;
	}	//	getParameter
	
	/**
	 * 	Get Recipients
	 *	@param reload reload
	 *	@return Recipients
	 */
	public MSchedulerRecipient[] getRecipients (boolean reload)
	{
		if (!reload && m_recipients != null)
			return m_recipients;
		ArrayList<MSchedulerRecipient> list = new ArrayList<MSchedulerRecipient>();
		String sql = "SELECT * FROM AD_SchedulerRecipient WHERE AD_Scheduler_ID=? AND IsActive='Y'";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, null);
			pstmt.setInt (1, getAD_Scheduler_ID());
			ResultSet rs = pstmt.executeQuery ();
			while (rs.next ())
				list.add (new MSchedulerRecipient (getCtx(), rs, null));
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log (Level.SEVERE, sql, e);
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
		m_recipients = new MSchedulerRecipient[list.size()];
		list.toArray(m_recipients);
		return m_recipients;
	}	//	getRecipients
	
	/**
	 * 	Get Recipient AD_User_IDs
	 *	@return array of user IDs
	 */
	public Integer[] getRecipientAD_User_IDs()
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		MSchedulerRecipient[] recipients = getRecipients(false);
		for (int i = 0; i < recipients.length; i++)
		{
			MSchedulerRecipient recipient = recipients[i];
			if (!recipient.isActive())
				continue;
			if (recipient.getAD_User_ID() != 0)
			{
				Integer ii = new Integer(recipient.getAD_User_ID());
				if (!list.contains(ii))
					list.add(ii);
			}
			if (recipient.getAD_Role_ID() != 0)
			{
				MUserRoles[] urs = MUserRoles.getOfRole(getCtx(), recipient.getAD_Role_ID());
				for (int j = 0; j < urs.length; j++)
				{
					MUserRoles ur = urs[j];
					if (!ur.isActive())
						continue;
					Integer ii = new Integer(ur.getAD_User_ID());
					if (!list.contains(ii))
						list.add(ii);
				}
			}
		}
		//	Add Updater
		if (list.size() == 0)
		{
			Integer ii = new Integer(getUpdatedBy());
			list.add(ii);
		}
		//
		Integer[] recipientIDs = new Integer[list.size()];
		list.toArray(recipientIDs);
		return recipientIDs;
	}	//	getRecipientAD_User_IDs
	
	/**
	 * 	Before Save
	 *	@param newRecord new
	 *	@return true
	 */
	protected boolean beforeSave(boolean newRecord) 
	{
		//	Set Schedule Type & Frequencies
		if (REF_AD_SchedulerType.Frequency.equals(getScheduleType()))
		{
			if (getFrequencyType() == null)
				setFrequencyType(REF__FrequencyType.Day);
			if (getFrequency() < 0)
				setFrequency(0);
		}
		else if (REF_AD_SchedulerType.MonthDay.equals(getScheduleType()))
		{
			if (getMonthDay() < 1 || getMonthDay() > 31)
				setMonthDay(1);
		}
		else //	SCHEDULETYPE_WeekDay
		{
			if (getScheduleType() == null)
				setScheduleType(REF_AD_SchedulerType.WeekDay);
			if (getWeekDay() == null)
				setWeekDay(REF_Weekdays.Monday);
		}
		return true;
	}	//	beforeSave
	
	/**
	 * 	String Representation
	 *	@return info
	 */
	public String toString ()
	{
		StringBuffer sb = new StringBuffer ("MScheduler[");
		sb.append (get_ID ()).append ("-").append (getName()).append ("]");
		return sb.toString ();
	}	//	toString
	
}	//	MScheduler
