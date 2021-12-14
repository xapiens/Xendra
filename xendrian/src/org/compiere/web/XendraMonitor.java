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
package org.compiere.web;

import java.io.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.jms.Queue;
import javax.jms.QueueConnectionFactory;
import javax.management.MBeanServerConnection;
import javax.management.MBeanServerInvocationHandler;
import javax.management.ObjectName;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;
import javax.servlet.*;
import javax.servlet.http.*;
import org.compiere.db.*;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_MessageFormat;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_Xendrian_Message;
import org.compiere.model.reference.REF_ServerType;
import org.compiere.server.*;
import org.compiere.util.*;
import org.hornetq.api.core.management.MessageCounterInfo;
import org.hornetq.api.core.management.ObjectNameBuilder;
import org.hornetq.api.jms.management.JMSQueueControl;
import org.hornetq.api.jms.management.JMSServerControl;
import org.xendra.Constants;

/**
 *	Xendra Server Monitor
 *	
 *  @author Jorg Janke
 *  @author xapiens
 *  
 *  deprecated the html stuff changed by xml text for internal use of Xendra client
 *  
 *  @version $Id: XendraMonitor.java,v 1.1 2018/06/29 00:04:42 xapiens Exp $
 */
public class XendraMonitor extends HttpServlet 
{
	private Hashtable hashes = new Hashtable();
	private XendraServerMgr	m_serverMgr = null;	
	private String JMX_URL = "service:jmx:rmi:///jndi/rmi://"+Util.getLocalHostName()+":3000/jmxrmi";

	public XendraMonitor() {
		super();
	}
	public void init(ServletConfig config) throws ServletException
	{
		super.init(config);
		if (!WebEnv.initWeb(config))
			throw new ServletException("XendraMonitor.init");
		hashes = new Hashtable();
		m_serverMgr = XendraServerMgr.get();
	}   //  init
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Enumeration<String> parameterNames = request.getParameterNames();
		while (parameterNames.hasMoreElements()) {

			String paramName = parameterNames.nextElement();
			System.out.println(paramName);
			String[] paramValues = request.getParameterValues(paramName);
			for (int i = 0; i < paramValues.length; i++) {
				String paramValue = paramValues[i];
				System.out.println(paramValue);
			}
		}
		String action = WebUtil.getParameter (request, "Action");
		if (action != null && action.length() > 0) {
			Action(action, response);
		}
		String serverID = WebUtil.getParameter (request, "RunNow");
		if (serverID != null && serverID.length() > 0) {
			RunNow(serverID, response);
		}
		String asd = WebUtil.getParameter(request, "JMS");
		if (asd != null && asd.length() > 0) {
			HashMap<String, String> parameters = new HashMap();			
			parameters.put("queuename", WebUtil.getParameter(request, "queuename"));
			parameters.put("machine", WebUtil.getParameter(request, "machine"));
			parameters.put("md5", WebUtil.getParameter(request, "md5"));
			MessageSnapshot(asd, parameters, response);
		} 
	}
	public void MessageSnapshot(String asd, HashMap parameters, HttpServletResponse response) {
		String result = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
		try		
		{	
			if (asd.equals("synchro")) {
				String status = "";				
				String queuename = (String) parameters.get("queuename");
				String machinename = (String) parameters.get("machine");
				String md5 = (String) parameters.get("md5");
				X_AD_MessageFormat messageformat = new Query(Env.getCtx(), X_AD_MessageFormat.Table_Name, "queuename = ?", null)
				.setParameters(queuename).first();
				if (messageformat != null) {
					if (messageformat.getMD5() == null || messageformat.getMD5().isEmpty()) {
						MessageDigest m = MessageDigest.getInstance("MD5");
						m.reset();
						m.update(messageformat.getFormat().getBytes());
						byte[] digest = m.digest();
						BigInteger bigInt = new BigInteger(1,digest);
						String hashtext = bigInt.toString(16);
						// Now we need to zero pad it if you actually want the full 32 chars.
						while(hashtext.length() < 32 ){
							hashtext = "0"+hashtext;
						}			
						messageformat.setMD5(hashtext);
						messageformat.save();
					}
					if (messageformat.getAD_Rule_ID() > 0) {
						if (md5 == null) {
							status += String.format("el checksum del solicitante es nulo");
						} 
						if (md5.compareTo(messageformat.getMD5()) != 0) {
							status += String.format("checksum de mensajes no coinciden se creara una cola diferente");
							SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmm");						
							Date today = Calendar.getInstance().getTime();
							String queuetoday = df.format(today);				         
							String newqueuename = String.format("synchro%s", queuetoday);
							queuename = newqueuename ;
						}						
						int count = new Query(Env.getCtx(), X_A_Xendrian_Message.Table_Name, "AD_Process_ID = ?", null)
						.setParameters(messageformat.getAD_Rule_ID()).count();
						status += String.format("%s record(s) found(s)\n", count);
						final X_A_Machine remote = new Query(Env.getCtx(), X_A_Machine.Table_Name, "Name = ?", null)
						.setParameters(machinename).first();
						//int port = 0;
						if (remote != null) {
							if (remote.getName().equals(Env.getMachine().getName())) {
								status += "no es posible sincronizarse a si mismo";
							}
							else {
								status += String.format("synchro to %s",remote.getName());
							}
							result +="<queues>";
							result += String.format("<queue name=\"%s\"",queuename);
							result += String.format(" status=\"%s\"/>",status);
							result +="</queues>";
							if (count > 0 && remote != null) {
								try {
									SynchroMessages asdf = new SynchroMessages(remote, queuename, messageformat);
									Thread t = new Thread(asdf);
									t.start();
								} catch (Exception e) {

								}
							}
						} else {
							status += "machine no encontrado";
						}
					} else {
						status += String.format("el formato de mensaje %s no tiene regla asociada", messageformat.getName());
						result +="<queues>";
						result += String.format("<queue name=\"%s\"",queuename);
						result += String.format(" status=\"%s\"/>",status);
						result +="</queues>";
					}
				} else {
					status += String.format("formato de mensaje para %s no encontrado",queuename);
					result +="<queues>";
					result += String.format("<queue name=\"%s\"",queuename);
					result += String.format(" status=\"%s\"/>",status);
					result +="</queues>";
				}
			} else if (asd.equals("status")) {
				String status = "alive";
				try {
					QueueConnectionFactory cf = (QueueConnectionFactory) CConnection.get().lookup(Util.getLocalHostName(),	Constants.QConnectionFactory);
					//ObjectName on = ObjectNameBuilder.DEFAULT.getJMSQueueObjectName(queue.getQueueName());
					JMXConnector connector =
							JMXConnectorFactory.connect(new JMXServiceURL(JMX_URL), new HashMap<String, Object>());
					MBeanServerConnection mbsc = connector.getMBeanServerConnection();
					connector.close();
				} catch (Exception e) {
					status = "dead";
				}
				result += String.format("<status>%s</status>", status);
			} else if (asd.equals("snapshot")) {
				result +="<queues>";

				String JMX_URL = "service:jmx:rmi:///jndi/rmi://"+Util.getLocalHostName()+":3000/jmxrmi";
				JMXConnector connector = JMXConnectorFactory.connect(new JMXServiceURL(JMX_URL), new HashMap());
				MBeanServerConnection mbsc = connector.getMBeanServerConnection();  
				ObjectName name=new ObjectName("org.hornetq:module=JMS,type=Server");  
				JMSServerControl control = (JMSServerControl)MBeanServerInvocationHandler.newProxyInstance(mbsc,name,JMSServerControl.class,false);
				String[] queues = control.getQueueNames();								
				QueueConnectionFactory cf = (QueueConnectionFactory) CConnection.get().lookup(Util.getLocalHostName(),	Constants.QConnectionFactory);
				for (String queuename:queues)
				{
					queuename = String.format("/queue/%s", queuename);
					Queue queue = null;
					try {
						queue = (Queue) CConnection.get().lookup(Util.getLocalHostName(), queuename);
					}
					catch (Exception e)
					{
						continue;
					}
					ObjectName on = ObjectNameBuilder.DEFAULT.getJMSQueueObjectName(queue.getQueueName());
					JMSQueueControl queueControl = MBeanServerInvocationHandler.newProxyInstance(mbsc,
							on,
							JMSQueueControl.class,
							false);
					Boolean active = false;
					String md5 = "";
					X_AD_MessageFormat mf = new Query(Env.getCtx(), X_AD_MessageFormat.Table_Name, "queuename = ?", null)
						.setParameters(queuename).first();
					if (mf != null) {
						active = mf.isActive();
						md5 = mf.getMD5();
					}
					String counters = queueControl.listMessageCounter();
					MessageCounterInfo counter = MessageCounterInfo.fromJSON(counters);					
					result += String.format("<queue name=\"%s\"",queuename);
					result += String.format(" md5=\"%s\"",md5);
					result += String.format(" count=\"%s\"",counter.getCount());
					result += String.format(" countdelta=\"%s\"",counter.getCountDelta());
					result += String.format(" depth=\"%s\"",counter.getDepth());
					result += String.format(" depthdelta=\"%s\"",counter.getDepthDelta());
					result += String.format(" lastupdated=\"%s\"",counter.getLastAddTimestamp());															
					result += String.format(" active=\"%s\"/>",active ? "Y":"N");
				}		
				connector.close();
				result +="</queues>";
			}  
		} catch (Exception e) {
			String msg = e.getMessage();
			result += String.format("<status>%s</status>", msg);					
		}
		try {
			PrintWriter out = response.getWriter();
			response.setHeader("Content-Type", "text/xml");
			out.write(result);
			out.close();								
		} catch (Exception e) {

		}						 
	}

	public void RunNow(String serverID, HttpServletResponse response) {
		String result = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
		try
		{			
			XendraServer server = m_serverMgr.getServer(serverID);
			if (server == null)		
				throw new Exception ("Server not found: ");
			result += String.format("<status>%s</status>", "invocacion exitosa");
			server.runNow();			
		} catch (Exception e) {
			String msg = e.getMessage();
			result += String.format("<status>%s</status>", msg);					
		}
		try {
			PrintWriter out = response.getWriter();
			response.setHeader("Content-Type", "text/xml");
			out.write(result);
			out.close();								
		} catch (Exception e) {

		}				
	}
	public void Action(String action, HttpServletResponse response) {
		String result = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
		try
		{			
			boolean ok = false;
			String serverID = action.substring(action.indexOf('_')+1);
			if (action.startsWith("Start")) {
				if (serverID.equals("All")) {
					ok = m_serverMgr.startAll();
				} else {
					ok = m_serverMgr.start (serverID);
				}
			} else if (action.startsWith("Stop")) {
				if (serverID.equals("All")) {
					ok = m_serverMgr.stopAll();
				} else {
					ok = m_serverMgr.stop (serverID);
				}				
			} else if (action.startsWith("status")) {
				if (serverID.equals("All")) {
					//ok = m_serverMgr.stopAll();
				} else {					
					XendraServer server = m_serverMgr.getServer(serverID);
					result += "<status>";
					ok = server.isAlive();
					result += ok ? "alive":"dead";
					result += "</status>";
				}								
			}
		}
		catch (Exception e)
		{
			String msg = e.getMessage();
			result += String.format("<status>%s</status>", msg);				
		}
		try {
			PrintWriter out = response.getWriter();
			response.setHeader("Content-Type", "text/xml");
			out.write(result);
			out.close();								
		} catch (Exception e) {

		}		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String process_id = request.getParameter("process_id");
		String parameters = request.getParameter("parameters");
		PrintWriter out = response.getWriter();
	}
}	//	XendraMonitor
