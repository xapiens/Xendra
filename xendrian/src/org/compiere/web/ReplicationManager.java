package org.compiere.web;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.Queue;
import javax.jms.QueueConnectionFactory;
import javax.jms.Session;
import javax.management.MBeanServerConnection;
import javax.management.MBeanServerInvocationHandler;
import javax.management.ObjectName;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.compiere.db.CConnection;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_MessageFormat;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_Xendrian_Message;
import org.compiere.model.reference.REF_ReplicationType;
import org.compiere.server.XendraServerMgr;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.compiere.util.WebEnv;
import org.compiere.util.WebUtil;
import org.hornetq.api.core.TransportConfiguration;
import org.hornetq.api.core.management.MessageCounterInfo;
import org.hornetq.api.core.management.ObjectNameBuilder;
import org.hornetq.api.jms.HornetQJMSClient;
import org.hornetq.api.jms.HornetQJMSConstants;
import org.hornetq.api.jms.JMSFactoryType;
import org.hornetq.api.jms.management.JMSQueueControl;
import org.hornetq.api.jms.management.JMSServerControl;
import org.hornetq.core.remoting.impl.netty.NettyConnectorFactory;
import org.hornetq.jms.client.HornetQConnectionFactory;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.xendra.Constants;
import org.xendra.replication.ReplicationEngine;
import javax.naming.Context;

public class ReplicationManager extends HttpServlet {

	private String JMX_URL = "service:jmx:rmi:///jndi/rmi://"+Util.getLocalHostName()+":3000/jmxrmi";

	public void init(ServletConfig config) throws ServletException
	{
		super.init(config);
		if (!WebEnv.initWeb(config))
			throw new ServletException("ReplicationManager.init");
	}   //  init

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Enumeration<String> parameterNames = request.getParameterNames();
		while (parameterNames.hasMoreElements()) {
			String paramName = parameterNames.nextElement();
			String[] paramValues = request.getParameterValues(paramName);
			for (int i = 0; i < paramValues.length; i++) {
				String paramValue = paramValues[i];
			}
		}
		String action = WebUtil.getParameter (request, "action");
		if (action != null && action.length() > 0) {
			Action(action, request, response);
		}		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String result = req.getParameter("message");
		SAXBuilder builder = new SAXBuilder();
		InputStream stream = new ByteArrayInputStream(result.getBytes("UTF-8"));
		try {
			Document doc = builder.build(stream);
			Element root = doc.getRootElement();
			String destination = root.getAttributeValue("destination");
			List<Element> items = new ArrayList<Element>();
			List list = root.getChildren();
			for (int i = 0; i < list.size(); i++) {
				Element item = (Element) list.get(i);
				items.add(item);
			}
			int i = 0;
			for (Element item:items) {
				String TableName = item.getAttributeValue("name");
				String query = item.getAttributeValue("query");
				ReplicationMessage rm = new ReplicationMessage(TableName, query, destination);
				Thread t = new Thread(rm);
				t.start();
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void Action(String action, HttpServletRequest request, HttpServletResponse response) {
		String result = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
		try {
			if (action.equals("status")) 
				result = getStatus();
			else if (action.equals("list")) 
				result = listreplicationtables();
			else if (action.equals("snapshot")) 
				result = getsnapshot();
			else if (action.equals("checksum")) {
				 
				HashMap<String, String> parameters = new HashMap();
				parameters.put("type", WebUtil.getParameter(request, "type"));
				parameters.put("name", WebUtil.getParameter(request, "name"));				
				result = getchecksum(parameters);
			}
			else if (action.equals("createqueue")) {
				HashMap<String, String> parameters = new HashMap();
				parameters.put("queuename", WebUtil.getParameter(request, "queuename"));
				parameters.put("md5", WebUtil.getParameter(request, "md5"));
				result = createqueue(parameters);
			}				
			else if (action.equals("synchro")) {
				HashMap<String, String> parameters = new HashMap();			
				parameters.put("queuename", WebUtil.getParameter(request, "queuename"));
				parameters.put("machine", WebUtil.getParameter(request, "machine"));
				parameters.put("md5", WebUtil.getParameter(request, "md5"));
				parameters.put("queueremote", WebUtil.getParameter(request, "queueremote"));
				result = synchro(parameters, response);
			}
		} catch (Exception e) {
			String msg = e.getMessage();
			result += String.format("<status>%s</status>", msg);				
		}
		try {
			PrintWriter out = response.getWriter();
			response.setHeader("Content-Type", "text/xml");
			System.out.println(result);
			out.write(result);
			out.close();								
		} catch (Exception e) {

		}				
	}
	private String getchecksum(HashMap parameters) {
		String type = (String) parameters.get("type");
		String name = (String) parameters.get("name");
		String value = "";
		String result = "";
		if (type.equals("queue")) {
			X_AD_MessageFormat mf = new Query(Env.getCtx(), X_AD_MessageFormat.Table_Name, "queuename = ?", null)
			.setParameters(name).first();
			if (mf != null) {
				value = mf.getMD5();
			} 
		}
		result = String.format("<checksum>%s</checksum>", value);
		return result;
	} 
	private String getStatus() {
		String status = "alive";
		try {
            HashMap<String, Object> params = new HashMap<String, Object>();
            params.put("host", Env.getMachine().getName());
            params.put("port", 5445 );            
            TransportConfiguration transportConfiguration = new TransportConfiguration(NettyConnectorFactory.class.getName(), params);
            HornetQConnectionFactory cf = HornetQJMSClient.createConnectionFactoryWithoutHA(JMSFactoryType.CF, transportConfiguration);
            Connection conn = cf.createConnection();
            Session session = conn.createSession(false, HornetQJMSConstants.PRE_ACKNOWLEDGE);
		        
//		        ConnectionFactory cf = (ConnectionFactory) context.lookup("jms/RemoteConnectionFactory");
//		        Destination destination = (Destination) context.lookup("jms/queue/reference");			
			//QueueConnectionFactory cf = (QueueConnectionFactory) CConnection.get().lookup(Util.getLocalHostName(),	Constants.QConnectionFactory);
			//JMXConnector connector =
			//		JMXConnectorFactory.connect(new JMXServiceURL(JMX_URL), new HashMap<String, Object>());
			//MBeanServerConnection mbsc = conn.getMBeanServerConnection();
            conn.close();
			//connector.close();
		} catch (Exception e) {
			status = "dead";
		}
		String result = String.format("<status>%s</status>", status);
		return result;
	}
	private String listreplicationtables() {
		String result = "<tables>";
		List<X_AD_Table> tables = new Query(Env.getCtx(), X_AD_Table.Table_Name, "replicationtype = ?", null)
		.setParameters(REF_ReplicationType.Reference).list();		
		for (X_AD_Table table:tables) {
			result += String.format("<table %s=\"%s\" %s=\"%s\" %s=\"%s\" %s=\"%s\" />",
					X_AD_Table.COLUMNNAME_AD_Table_ID,
					table.getAD_Table_ID(),
					X_AD_Table.COLUMNNAME_Name,
					table.getTableName(),									
					Constants.COLUMNNAME_Updated,
					table.getUpdated(),
					Constants.COLUMNNAME_IsActive,
					table.isActive());
		}
		result += "</tables>";
		return result; 
	}
	private String getsnapshot() {
		String result ="<queues>";
		try {
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
		} catch (Exception e) {

		}
		return result;
	}
	public String createqueue(HashMap parameters) {
		String result = "";
		String status= "";
		try {
			String remotequeuename = (String) parameters.get("queuename");
			String md5 = (String) parameters.get("md5");
			//X_AD_MessageFormat format = new Query(Env.getCtx(), X_AD_MessageFormat.Table_Name, "queuename = ?", null)
			//.setParameters(remotequeuename).first();					
			String JMX_URL = "service:jmx:rmi:///jndi/rmi://"+Util.getLocalHostName()+":3000/jmxrmi";
			JMXConnector connector = JMXConnectorFactory.connect(new JMXServiceURL(JMX_URL), new HashMap());
			MBeanServerConnection mbsc = connector.getMBeanServerConnection();  
			ObjectName name=new ObjectName("org.hornetq:module=JMS,type=Server");  
			JMSServerControl control = (JMSServerControl)MBeanServerInvocationHandler.newProxyInstance(mbsc,name,JMSServerControl.class,false);
			String entryname = String.format("/queue/%s",remotequeuename);
			control.createQueue(remotequeuename,entryname);				
			connector.close();
			X_AD_MessageFormat mf = new X_AD_MessageFormat(Env.getCtx(), 0, null);
			mf.setQueueName(entryname);
			mf.setMD5(md5);
			//mf.setAD_Plugin_ID(format.getAD_Plugin_ID());
			mf.setIsActive(false);
			//mf.setAD_Rule_ID(format.getAD_Rule_ID());
			mf.save();
			status = "created";
		} catch (Exception e) {
			status = e.getMessage();
		}
		result = String.format("<status>%s</status>", status);
		return result;
	}
	public String synchro(HashMap parameters, HttpServletResponse response) {
		String result ="";
		try		
		{	
			String status = "";				
			String queuename = (String) parameters.get("queuename");
			String machinename = (String) parameters.get("machine");
			String md5 = (String) parameters.get("md5");
			String queueremote = (String) parameters.get("queueremote");
			if (queueremote == null) {
				queueremote = queuename;
			}
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
						md5 = "";
					} else if (md5.compareTo(messageformat.getMD5()) != 0) {
						status += String.format("checksum de mensajes no coinciden");
						SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmm");						
						Date today = Calendar.getInstance().getTime();
						String queuetoday = df.format(today);				         
						String newqueuename = String.format("synchro%s", queuetoday);
						queuename = newqueuename ;
						result +="<queues>";
						result += String.format("<queue name=\"%s\"",queuename);
						result += String.format(" md5=\"%s\"", messageformat.getMD5());
						result += String.format(" status=\"%s\"/>",status);
						result +="</queues>";						
					} else if (md5.equals(messageformat.getMD5())) {
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
								if (count > 0 && remote != null) {
									try {
										SynchroMessages asdf = new SynchroMessages(remote, queueremote, messageformat);
										Thread t = new Thread(asdf);
										t.start();
									} catch (Exception e) {

									}
								}								
							}
							result +="<queues>";
							result += String.format("<queue name=\"%s\"",queuename);
							result += String.format(" md5=\"%s\"", messageformat.getMD5());
							result += String.format(" status=\"%s\"/>",status);
							result +="</queues>";
						} else {
							status += "machine no encontrado";
						}						
					}						
				} else {
					status += String.format("el formato de mensaje %s no tiene regla asociada", messageformat.getName());
					result +="<queues>";
					result += String.format("<queue name=\"%s\"",queuename);
					result += String.format(" md5=\"%s\"","");
					result += String.format(" status=\"%s\"/>",status);
					result +="</queues>";
				}
			} else {
				status += String.format("formato de mensaje para %s no encontrado",queuename);
				result +="<queues>";
				result += String.format("<queue name=\"%s\"",queuename);
				result += String.format(" md5=\"%s\"","");
				result += String.format(" status=\"%s\"/>",status);
				result +="</queues>";
			}
			//			} 
			//			else if (asd.equals("status")) {
			//				String status = "alive";
			//				try {
			//					QueueConnectionFactory cf = (QueueConnectionFactory) CConnection.get().lookup(Util.getLocalHostName(),	Constants.QConnectionFactory);
			//					//ObjectName on = ObjectNameBuilder.DEFAULT.getJMSQueueObjectName(queue.getQueueName());
			//					JMXConnector connector =
			//							JMXConnectorFactory.connect(new JMXServiceURL(JMX_URL), new HashMap<String, Object>());
			//					MBeanServerConnection mbsc = connector.getMBeanServerConnection();
			//					connector.close();
			//				} catch (Exception e) {
			//					status = "dead";
			//				}
			//				result += String.format("<status>%s</status>", status);
			//			} else if (asd.equals("snapshot")) {
			//				result +="<queues>";
			//
			//				String JMX_URL = "service:jmx:rmi:///jndi/rmi://"+Util.getLocalHostName()+":3000/jmxrmi";
			//				JMXConnector connector = JMXConnectorFactory.connect(new JMXServiceURL(JMX_URL), new HashMap());
			//				MBeanServerConnection mbsc = connector.getMBeanServerConnection();  
			//				ObjectName name=new ObjectName("org.hornetq:module=JMS,type=Server");  
			//				JMSServerControl control = (JMSServerControl)MBeanServerInvocationHandler.newProxyInstance(mbsc,name,JMSServerControl.class,false);
			//				String[] queues = control.getQueueNames();								
			//				QueueConnectionFactory cf = (QueueConnectionFactory) CConnection.get().lookup(Util.getLocalHostName(),	Constants.QConnectionFactory);
			//				for (String queuename:queues)
			//				{
			//					queuename = String.format("/queue/%s", queuename);
			//					Queue queue = null;
			//					try {
			//						queue = (Queue) CConnection.get().lookup(Util.getLocalHostName(), queuename);
			//					}
			//					catch (Exception e)
			//					{
			//						continue;
			//					}
			//					ObjectName on = ObjectNameBuilder.DEFAULT.getJMSQueueObjectName(queue.getQueueName());
			//					JMSQueueControl queueControl = MBeanServerInvocationHandler.newProxyInstance(mbsc,
			//							on,
			//							JMSQueueControl.class,
			//							false);
			//					Boolean active = false;
			//					String md5 = "";
			//					X_AD_MessageFormat mf = new Query(Env.getCtx(), X_AD_MessageFormat.Table_Name, "queuename = ?", null)
			//						.setParameters(queuename).first();
			//					if (mf != null) {
			//						active = mf.isActive();
			//						md5 = mf.getMD5();
			//					}
			//					String counters = queueControl.listMessageCounter();
			//					MessageCounterInfo counter = MessageCounterInfo.fromJSON(counters);					
			//					result += String.format("<queue name=\"%s\"",queuename);
			//					result += String.format(" md5=\"%s\"",md5);
			//					result += String.format(" count=\"%s\"",counter.getCount());
			//					result += String.format(" countdelta=\"%s\"",counter.getCountDelta());
			//					result += String.format(" depth=\"%s\"",counter.getDepth());
			//					result += String.format(" depthdelta=\"%s\"",counter.getDepthDelta());
			//					result += String.format(" lastupdated=\"%s\"",counter.getLastAddTimestamp());															
			//					result += String.format(" active=\"%s\"/>",active ? "Y":"N");
			//				}		
			//				connector.close();
			//result +="</queues>";
			//			}  
		} catch (Exception e) {
			String msg = e.getMessage();
			result += String.format("<status>%s</status>", msg);					
		}
		return result;
	}

}
