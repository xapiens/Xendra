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
package org.compiere.server;

import java.sql.*;
import java.util.*;
import java.util.logging.*;

import org.compiere.*;
import org.compiere.model.MAcctProcessor;
import org.compiere.model.MAlertProcessor;
import org.compiere.model.MCashFlowProcessor;
import org.compiere.model.MMaterialProcessor;
import org.compiere.model.MProcess;
import org.compiere.model.MRequestProcessor;
import org.compiere.model.MRule;
import org.compiere.model.MScheduler;
import org.compiere.model.MSession;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_MessageFormat;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.model.persistence.X_AD_Scheduler;
import org.compiere.model.persistence.X_A_MachineServer;
import org.compiere.model.reference.REF_RuleType;
import org.compiere.model.reference.REF_ServerType;
import org.compiere.util.*;
import org.compiere.wf.*;

import org.xendra.xendrian.Listener;

/**
 *	Xendra Server Manager
 *	
 *  @author Jorg Janke
 *  @version $Id: XendraServerMgr.java,v 1.1 2007/06/15 00:03:25 sergioaguayo Exp $
 */
public class XendraServerMgr
{
	/**
	 * 	Get Xendra Server Manager
	 *	@return mgr
	 */
	public static XendraServerMgr get()
	{
		if (m_serverMgr == null)
		{
			//	for faster subsequent calls
			m_serverMgr = new XendraServerMgr();
			m_serverMgr.startServers();
			m_serverMgr.log.info(m_serverMgr.toString());
		}
		return m_serverMgr;
	}	//	get

	/**	Singleton					*/
	private static	XendraServerMgr	m_serverMgr = null;
	/**	Logger			*/
	protected CLogger	log = CLogger.getCLogger(getClass());

	/**************************************************************************
	 * 	Adempiere Server Manager
	 */
	private XendraServerMgr ()
	{
		super();
		startEnvironment();
		//	m_serverMgr.startServers();
	}	//	XendraServerMgr

	/**	The Servers				*/
	private ArrayList<XendraServer>	m_servers = new ArrayList<XendraServer>();
	/** Context					*/
	private Properties		m_ctx = Env.getCtx();
	/** Start					*/
	private Timestamp		m_start = new Timestamp(System.currentTimeMillis());
	private ArrayList<Integer> Acceptors;
	private ArrayList<Integer> Listeners;

	/**
	 * 	Start Environment
	 *	@return true if started
	 */
	private boolean startEnvironment()
	{
		Xendra.startup(false);
		log.info("");

		//	Set Session
		MSession session = MSession.get(getCtx(), true);
		session.setWebStoreSession(false);
		session.setWebSession("Server");
		session.save();
		//
		return true;
	}	//	startEnvironment

	/**
	 * 	Start Environment
	 *	@return true if started
	 */
	private boolean startServers()
	{
		log.info("");
		int noServers = 0;
		//	Accounting
		MAcctProcessor[] acctModels = MAcctProcessor.getActive(m_ctx);
		for (MAcctProcessor pModel:acctModels)
		{			
			XendraServer server = XendraServer.create(pModel);
			server.start();
			server.setPriority(Thread.NORM_PRIORITY-2);
			m_servers.add(server);
		}		
		//	Request
		MRequestProcessor[] requestModels = MRequestProcessor.getActive(m_ctx);
		if (requestModels != null)
			for (MRequestProcessor pModel:requestModels)
			{
				XendraServer server = XendraServer.create(pModel);
				server.start();
				server.setPriority(Thread.NORM_PRIORITY-2);
				m_servers.add(server);
			}
		//	Workflow
		MWorkflowProcessor[] workflowModels = MWorkflowProcessor.getActive(m_ctx);		
		for (MWorkflowProcessor pModel:workflowModels)
		{
			XendraServer server = XendraServer.create(pModel);
			server.start();
			server.setPriority(Thread.NORM_PRIORITY-2);
			m_servers.add(server);
		}		
		//	Alert
		MAlertProcessor[] alertModels = MAlertProcessor.getActive(m_ctx);
		if (alertModels != null)
			for (MAlertProcessor pModel:alertModels)
			{
				XendraServer server = XendraServer.create(pModel);
				server.start();
				server.setPriority(Thread.NORM_PRIORITY-2);
				m_servers.add(server);
			}		
		//	Scheduler
		MScheduler[] schedulerModels = MScheduler.getActive(m_ctx);
		Acceptors = new ArrayList<Integer>();
		Listeners = new ArrayList<Integer>();
		int incomplete = 0;
		for (MScheduler pModel:schedulerModels)
		{
			if (!AddSchedulerProcess(pModel))
				incomplete++;
		}				
		log.log(Level.WARNING, String.format("%d Listener(s) found(s)", Listeners.size()));
		log.log(Level.WARNING, String.format("%d Acceptor(s) found(s)", Acceptors.size()));
		if (incomplete > 0)
			log.log(Level.WARNING, String.format("%d Listener(s) pending(s)", incomplete));
		//		if (schedulerModels.length > 0)
		//		{
		//			MScheduler.startRules(Listeners, Acceptors);			
		//		}
		//	LDAP
		//		MLdapProcessor[] ldapModels = MLdapProcessor.getActive(m_ctx);
		//		for (int i = 0; i < ldapModels.length; i++)
		//		{
		//			MLdapProcessor lp = ldapModels[i];
		//			XendraServer server = XendraServer.create(lp);
		//			server.start();
		//			server.setPriority(Thread.NORM_PRIORITY-1);
		//			m_servers.add(server);
		//		}
		// Cash Flow
		MCashFlowProcessor[] cashflowModels = MCashFlowProcessor.getActive(m_ctx);
		for (MCashFlowProcessor pModel:cashflowModels)		
		{
			XendraServer server = XendraServer.create(pModel);
			server.start();
			server.setPriority(Thread.NORM_PRIORITY-2);
			m_servers.add(server);
		}
		// Material Processor
		MMaterialProcessor[] storageModels = MMaterialProcessor.getActive(m_ctx);
		for (MMaterialProcessor pModel:storageModels)
		{			
			XendraServer server = XendraServer.create(pModel);
			server.start();
			server.setPriority(Thread.NORM_PRIORITY-2);
			log.log(Level.WARNING, String.format("Material Processor found for %s", pModel.getName()));
			m_servers.add(server);
		}				
		log.log(Level.WARNING, String.format("%d Material Processor(s) found(s)", storageModels.length));
		log.fine("#" + noServers);
		return startAll();
	}	//	startEnvironment

	public boolean AddSchedulerProcess(MScheduler pModel) {
		// 			
		// analyzing n. of listener and acceptors
		String tag = pModel.getTag();
		MProcess proc = MProcess.get(Env.getCtx(), pModel.getAD_Process_ID());
		if (proc.getID() != null && proc.getID().length() > 0)
		{
			X_AD_Plugin plugin = new Query(Env.getCtx(), X_AD_Plugin.Table_Name, "id = ?", null).setParameters(proc.getID()).first();			
			//if (!plugin.isCompleted())
			if (!plugin.isInstalled())
			{
				//incomplete++;
				return false;
			}
		}
		Boolean goahead = true; 
		if (proc.getRuleType() != null)
		{
			goahead = startRule(proc.getAD_Rule_ID(), proc.getRuleType(), tag);
		}
		if (goahead) {
			log.log(Level.WARNING, String.format("starting %s", pModel.getName()));
			XendraServer server = XendraServer.create(pModel);
			server.start();
			server.setPriority(Thread.NORM_PRIORITY-2);
			m_servers.add(server);
		}
		return true;
	}
	public boolean startRule(int AD_Rule_ID, String RuleType, String tag)
	{
		Boolean isok = true;
		try {
			HashMap properties = new HashMap();		
			if (RuleType.equals(REF_RuleType.Listener))
			{
				String listenerclass = "";
				X_AD_Rule rule = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null)
				.setParameters(AD_Rule_ID).first();
				if (rule == null)
				{
					throw new Exception(String.format("%s Rule not exists", AD_Rule_ID));
				}
				properties = (HashMap) rule.getProperties();
				String type = (String) properties.get("type");		
				System.out.println("type->"+type);
				if (type.equals("kiebase"))
				{
					//queuename = (String) properties.get("queuename");
					listenerclass = (String) properties.get("queuelistenerclass");
				}
				else if (type.equals("listen"))
				{
					//queuename = (String) properties.get("queuename");
					listenerclass = (String) properties.get("queuelistenerclass");				
				}
				if (listenerclass.equals("org.xendra.replication.messages.replmessageListener")) {
					String queuename = (String) properties.get("queuename");
					HashMap map = new HashMap();
					map.put(X_AD_Process.COLUMNNAME_Classname, listenerclass);
					map.put(X_AD_Rule.COLUMNNAME_AD_Rule_ID, AD_Rule_ID);
					map.put(X_AD_MessageFormat.COLUMNNAME_AD_MessageFormat_ID, 0);
					Listener listener = new Listener(queuename, map, tag);				
					Thread lpdThread = new Thread(listener);
					lpdThread.start();											
				}
				else 
				{
					List<X_AD_MessageFormat> mfs = new Query(Env.getCtx(), X_AD_MessageFormat.Table_Name, "AD_Rule_ID = ? AND IsActive = 'Y'", null)
					.setParameters(rule.getAD_Rule_ID()).list();
					if (mfs.size() == 0) {						
						throw new Exception(String.format("MessageFormat not exists for %s ", rule.getName()));
					}
					for (X_AD_MessageFormat mf:mfs) {
						int AD_MessageFormat_ID = mf.getAD_MessageFormat_ID();				
						log.log(Level.WARNING, String.format("queuename-> %s listenerclass-> %s", mf.getQueueName(), listenerclass));
						if (mf.getQueueName() == null || mf.getQueueName().length() == 0) {
							log.log(Level.WARNING, String.format("ERROR: queuename para %s no especificado", rule.getName()));
							continue;
						}
						if (mf.getQueueName().length() > 0)
						{				
							log.log(Level.WARNING, String.format("Adding Listener %s to %s", listenerclass, mf.getQueueName()));
							HashMap map = new HashMap();
							map.put(X_AD_Process.COLUMNNAME_Classname, listenerclass);
							map.put(X_AD_Rule.COLUMNNAME_AD_Rule_ID, AD_Rule_ID);
							map.put(X_AD_MessageFormat.COLUMNNAME_AD_MessageFormat_ID, AD_MessageFormat_ID);
							Listener listener = new Listener(mf.getQueueName(), map, tag);				
							Thread lpdThread = new Thread(listener);
							lpdThread.start();								
						}							
					}
				}
			}
			else if (RuleType.equals(REF_RuleType.Acceptor))
			{
				X_AD_Rule startrule = new X_AD_Rule(Env.getCtx(), AD_Rule_ID, null);			
				List<MRule> rulelist = new Query(Env.getCtx(), X_AD_Rule.Table_Name,"AD_Rule_ID = ? OR Parent_ID = ?", null)
				.setParameters(startrule.getAD_Rule_ID(), startrule.getAD_Rule_ID()).list();
				if (rulelist != null)
				{
					Env.setRules(rulelist, startrule.getAD_Rule_ID());
					log.log(Level.WARNING, String.format("XendraServerMgr::startRule->Adding Acceptor %s", startrule.getName()));					
				}						
			}
		} catch (Exception e) {
			String error = e.getMessage();
			log.log(Level.WARNING, error);
			isok = false;
		}
		return isok;
	}
	/**
	 * 	Get Server Context
	 *	@return ctx
	 */
	public Properties getCtx()
	{
		return m_ctx;
	}	//	getCtx

	/**
	 * 	Start all servers
	 *	@return true if started
	 */
	public boolean startAll()
	{
		log.info ("");
		XendraServer[] servers = getInActive();
		for (int i = 0; i < servers.length; i++)
		{
			XendraServer server = servers[i];
			try
			{
				if (server.isAlive())
					continue;
				//	Wait until dead
				if (server.isInterrupted())
				{
					int maxWait = 10;	//	10 iterations = 1 sec
					while (server.isAlive())
					{
						if (maxWait-- == 0)
						{
							log.severe ("Wait timeout for interruped " + server);
							break;
						}
						try
						{
							Thread.sleep(100);		//	1/10 sec
						}
						catch (InterruptedException e)
						{
							log.log(Level.SEVERE, "While sleeping", e);
						}
					}
				}
				//	Do start
				if (!server.isAlive())
				{
					//	replace
					server = XendraServer.create (server.getModel());
					if (server == null)
						m_servers.remove(i);
					else
						m_servers.set(i, server);
					server.start();
					server.setPriority(Thread.NORM_PRIORITY-2);
				}
			}
			catch (Exception e)
			{
				log.log(Level.SEVERE, "Server: " + server, e);
			}
		}	//	for all servers

		//	Final Check
		int noRunning = 0;
		int noStopped = 0;
		for (int i = 0; i < servers.length; i++)
		{
			XendraServer server = servers[i];
			try
			{
				if (server.isAlive())
				{
					log.info("Alive: " + server);
					noRunning++;
				}
				else
				{
					log.warning("Dead: " + server);
					noStopped++;
				}
			}
			catch (Exception e)
			{
				log.log(Level.SEVERE, "(checking) - " + server, e);
				noStopped++;
			}
		}
		log.fine("Running=" + noRunning + ", Stopped=" + noStopped);
		XendraServerGroup.get().dump();
		return noStopped == 0;
	}	//	startAll

	/**
	 * 	Start Server if not started yet
	 * 	@param serverID server ID
	 *	@return true if started
	 */
	public boolean start (String serverID)
	{
		XendraServer server = getServer(serverID);
		if (server == null)
			return false;
		if (server.isAlive())
			return true;

		try
		{
			//	replace
			int index = m_servers.indexOf(server);
			server = XendraServer.create (server.getModel());
			if (server == null)
				m_servers.remove(index);
			else
				m_servers.set(index, server);
			server.start();
			server.setPriority(Thread.NORM_PRIORITY-2);
			Thread.yield();
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, "Server=" + serverID, e);
			return false;
		}
		log.info(server.toString());
		XendraServerGroup.get().dump();
		if (server == null)
			return false;
		return server.isAlive();
	}	//	startIt

	/**
	 * 	Stop all Servers
	 *	@return true if stopped
	 */
	public boolean stopAll()
	{
		log.info ("");
		XendraServer[] servers = getActive();
		//	Interrupt
		for (int i = 0; i < servers.length; i++)
		{
			XendraServer server = servers[i];
			try
			{
				if (server.isAlive() && !server.isInterrupted())
				{
					server.setPriority(Thread.MAX_PRIORITY-1);
					server.interrupt();
				}
			}
			catch (Exception e)
			{
				log.log(Level.SEVERE, "(interrupting) - " + server, e);
			}
		}	//	for all servers
		Thread.yield();

		//	Wait for death
		for (int i = 0; i < servers.length; i++)
		{
			XendraServer server = servers[i];
			try
			{
				int maxWait = 10;	//	10 iterations = 1 sec
				while (server.isAlive())
				{
					if (maxWait-- == 0)
					{
						log.severe ("Wait timeout for interruped " + server);
						break;
					}
					Thread.sleep(100);		//	1/10
				}
			}
			catch (Exception e)
			{
				log.log(Level.SEVERE, "(waiting) - " + server, e);
			}
		}	//	for all servers

		//	Final Check
		int noRunning = 0;
		int noStopped = 0;
		for (int i = 0; i < servers.length; i++)
		{
			XendraServer server = servers[i];
			try
			{
				if (server.isAlive())
				{
					log.warning ("Alive: " + server);
					noRunning++;
				}
				else
				{
					log.info ("Stopped: " + server);
					noStopped++;
				}
			}
			catch (Exception e)
			{
				log.log(Level.SEVERE, "(checking) - " + server, e);
				noRunning++;
			}
		}
		log.fine("Running=" + noRunning + ", Stopped=" + noStopped);
		XendraServerGroup.get().dump();
		return noRunning == 0;
	}	//	stopAll

	/**
	 * 	Stop Server if not stopped
	 * 	@param serverID server ID
	 *	@return true if interrupted
	 */
	public boolean stop (String serverID)
	{
		XendraServer server = getServer(serverID);
		if (server == null)
			return false;
		if (!server.isAlive())
			return true;

		try
		{
			server.interrupt();
			Thread.sleep(10);	//	1/100 sec
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, "stop", e);
			return false;
		}
		log.info(server.toString());
		XendraServerGroup.get().dump();
		return !server.isAlive();
	}	//	stop


	/**
	 * 	Destroy
	 */
	public void destroy ()
	{
		log.info ("");
		stopAll();
		m_servers.clear();
	}	//	destroy

	/**
	 * 	Get Active Servers
	 *	@return array of active servers
	 */
	protected XendraServer[] getActive()
	{
		ArrayList<XendraServer> list = new ArrayList<XendraServer>();
		for (int i = 0; i < m_servers.size(); i++)
		{
			XendraServer server = (XendraServer)m_servers.get(i);
			if (server != null && server.isAlive() && !server.isInterrupted())
				list.add (server);
		}
		XendraServer[] retValue = new XendraServer[list.size ()];
		list.toArray (retValue);
		return retValue;
	}	//	getActive

	/**
	 * 	Get InActive Servers
	 *	@return array of inactive servers
	 */
	protected XendraServer[] getInActive()
	{
		ArrayList<XendraServer> list = new ArrayList<XendraServer>();
		for (int i = 0; i < m_servers.size(); i++)
		{
			XendraServer server = (XendraServer)m_servers.get(i);
			if (server != null && (!server.isAlive() || !server.isInterrupted()))
				list.add (server);
		}
		XendraServer[] retValue = new XendraServer[list.size()];
		list.toArray (retValue);
		return retValue;
	}	//	getInActive

	/**
	 * 	Get all Servers
	 *	@return array of servers
	 */
	public XendraServer[] getAll()
	{
		XendraServer[] retValue = new XendraServer[m_servers.size()];
		m_servers.toArray (retValue);
		return retValue;
	}	//	getAll

	/**
	 * 	Get Server with ID
	 *	@param serverID server id
	 *	@return server or null
	 */
	public XendraServer getServer (String serverID)
	{
		if (serverID == null)
			return null;
		for (int i = 0; i < m_servers.size(); i++)
		{
			XendraServer server = (XendraServer)m_servers.get(i);
			if (serverID.equals(server.getServerID()))
				return server;
		}
		return null;
	}	//	getServer

	/**
	 * 	String Representation
	 *	@return info
	 */
	public String toString ()
	{
		StringBuffer sb = new StringBuffer ("XendraServerMgr[");
		sb.append("Servers=").append(m_servers.size())
		.append(",ContextSize=").append(m_ctx.size())
		.append(",Started=").append(m_start)
		.append ("]");
		return sb.toString ();
	}	//	toString

	/**
	 * 	Get Description
	 *	@return description
	 */
	public String getDescription()
	{
		return "$Revision: 1.1 $";
	}	//	getDescription

	/**
	 * 	Get Number Servers
	 *	@return no of servers
	 */
	public String getServerCount()
	{
		int noRunning = 0;
		int noStopped = 0;
		for (int i = 0; i < m_servers.size(); i++)
		{
			XendraServer server = (XendraServer)m_servers.get(i);
			if (server.isAlive())
				noRunning++;
			else
				noStopped++;
		}
		String info = String.valueOf(m_servers.size())
				+ " - Running=" + noRunning
				+ " - Stopped=" + noStopped;
		return info;
	}	//	getServerCount

	/**
	 * 	Get start date
	 *	@return start date
	 */
	public Timestamp getStartTime()
	{
		return m_start;
	}	//	getStartTime

	public static void main(String[] args)
	{
		org.compiere.Xendra.startupEnvironment(true);
		CLogMgt.setLevel(Level.FINE);
		XendraServerMgr mgr = new XendraServerMgr();
		mgr.startServers();
	}
}	//	XendraServerMgr
