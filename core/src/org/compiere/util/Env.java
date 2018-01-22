/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
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
package org.compiere.util;

import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.Vector;
import java.util.logging.Level;

import javax.imageio.ImageIO;
import javax.jms.Connection;
import javax.jms.Session;
import javax.naming.InitialContext;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.RepaintManager;
import javax.swing.SwingUtilities;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import org.columba.core.xml.XmlIO;
import org.compiere.Xendra;
import org.compiere.db.CConnection;
import org.compiere.model.MClient;
import org.compiere.model.MLookupCache;
import org.compiere.model.MRole;
import org.compiere.model.MRule;
import org.compiere.model.MSession;
import org.compiere.model.MSystem;
import org.compiere.model.Machine;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Document;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachineServer;
import org.compiere.model.reference.REF_ServerType;
import org.compiere.server.XendraServer;
import org.compiere.swing.CFrame;
import org.kie.api.KieBase;
import org.kie.api.KieBaseConfiguration;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.Message;
import org.kie.api.builder.Results;
import org.kie.api.builder.model.KieBaseModel;
import org.kie.api.builder.model.KieModuleModel;
import org.kie.api.builder.model.KieSessionModel;
import org.kie.api.conf.EqualityBehaviorOption;
import org.kie.api.conf.EventProcessingOption;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.rule.EntryPoint;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xendra.Constants;
import org.xendra.db.PgNotificationPoller;
import org.xendra.db.PgNotificationPoller.PgNotificationExceptionListener;
import org.xendra.db.PgNotificationPoller.PgNotificationListener;
import org.xendra.material.MaterialManager;
import org.xendra.material.MaterialServer;
import org.xml.sax.InputSource;

/**
 *  System Environment and static variables.
 *  
 *  @author     Jorg Janke
 *  @version    $Id: Env.java 5872 2016-06-29 17:36:42Z xapiens $
 * 
 * @author Teo Sarca, www.arhipac.ro
 * 			<li>BF [ 1619390 ] Use default desktop browser as external browser
 * 			<li>BF [ 2017987 ] Env.getContext(TAB_INFO) should NOT use global context
 * 			<li>FR [ 2392044 ] Introduce Env.WINDOW_MAIN
 */
public final class Env
{
	/**	Logging								*/
	private static CLogger				s_log = CLogger.getCLogger(Env.class);

	private static ContextProvider contextProvider = new DefaultContextProvider();

	public static void setContextProvider(ContextProvider provider)
	{
		contextProvider = provider;
		getCtx().put(LANGUAGE, Language.getBaseAD_Language());
	}
	// knowledge
	private static HashMap <Integer, String> sessionEntrypoints = new HashMap<Integer, String>();
	private static HashMap <Integer, String> listagenda = new HashMap<Integer, String>();
	private static Map <String, EntryPoint> Entrypoints = new HashMap<String, EntryPoint>();	
	private static HashMap<Integer, KieBase> kiebases = new HashMap<Integer, KieBase>();
	private static HashMap<Integer, Vector> kieerror = new HashMap<Integer, Vector>();
	private static HashMap<Integer, Boolean> kieactive = new HashMap<Integer, Boolean>();

	/**
	 *	Exit System
	 *  @param status System exit status (usually 0 for no error)
	 */
	public static void exitEnv (int status)
	{
		//hengsin, avoid unncessary query of session when exit without log in
		if (DB.isConnected(false)) {
			//	End Session
			MSession session = MSession.get(Env.getCtx(), false);	//	finish
			if (session != null)
				session.logout();
		}
		//
		reset(true);	// final cache reset
		s_log.info("");
		//
		CLogMgt.shutdown();
		//
		if (Ini.isClient())
			System.exit (status);
	}	//	close

	/**
	 * Logout from the system
	 */
	public static void logout()
	{
		//	End Session
		MSession session = MSession.get(Env.getCtx(), false);	//	finish
		if (session != null)
			session.logout();
		//
		reset(true);	// final cache reset
		//

		CConnection.get().setAppServerCredential(null, null);
	}

	/**
	 * 	Reset Cache
	 * 	@param finalCall everything otherwise login data remains
	 */
	public static void reset (boolean finalCall)
	{
		s_log.info("finalCall=" + finalCall);
		if (Ini.isClient())
		{
			closeWindows();

			//	Dismantle windows
			/**
			for (int i = 0; i < s_windows.size(); i++)
			{
				Container win = (Container)s_windows.get(i);
				if (win.getClass().getName().endsWith("AMenu")) // Null pointer
					;
				else if (win instanceof Window)
					((Window)win).dispose();
				else
					win.removeAll();
			}
			 **/
			//bug [ 1574630 ]
			if (s_windows.size() > 0) {
				if (!finalCall) {
					Container c = s_windows.get(0);
					s_windows.clear();
					createWindowNo(c);
				} else {
					s_windows.clear();
				}
			}
		}

		//	Clear all Context
		if (finalCall)
			getCtx().clear();
		else	//	clear window context only
		{
			Object[] keys = getCtx().keySet().toArray();
			for (int i = 0; i < keys.length; i++)
			{
				String tag = keys[i].toString();
				if (Character.isDigit(tag.charAt(0)))
					getCtx().remove(keys[i]);
			}
		}

		//	Cache
		CacheMgt.get().reset();
		if (Ini.isClient())
			DB.closeTarget();
		//	Reset Role Access
		if (!finalCall)
		{
			if (Ini.isClient())
				DB.setDBTarget(CConnection.get());
			MRole defaultRole = MRole.getDefault(getCtx(), false);
			if (defaultRole != null)
				defaultRole.loadAccess(true);	//	Reload
		}
	}	//	resetAll

	public static EntryPoint getEntrypoint(String Entrypoint)
	{
		EntryPoint point =  Entrypoints.get(Entrypoint);
		return point;
	}

	public static void setRules(List<MRule> rules,  int AD_Rule_ID)
	{
	}

	public static String getSessionEntrypoints(int AD_Rule_ID) {
		String entrypoint = null;
		if (sessionEntrypoints.containsKey(AD_Rule_ID))
			entrypoint = sessionEntrypoints.get(AD_Rule_ID);
		return entrypoint;
	}

	public static String getAgenda(int AD_Rule_ID) {
		String agenda = null;
		if (listagenda.containsKey(AD_Rule_ID))
			agenda = listagenda.get(AD_Rule_ID);
		return agenda;
	}
	public static KieBase initializeRule(int AD_Rule_ID) {
		if (kiebases.containsKey(AD_Rule_ID))
			kiebases.remove(AD_Rule_ID);
		return startRule(AD_Rule_ID);
	}
	public static void resetRule(int AD_Rule_ID) {
		if (kiebases.containsKey(AD_Rule_ID))
		{
			kiebases.remove(AD_Rule_ID);
		}
	}
	public static KieBase startRule(int AD_Rule_ID, boolean reset) {
		if (reset)
		{
			if (kiebases.containsKey(AD_Rule_ID))
			{
				kiebases.remove(AD_Rule_ID);
			}
		}
		return startRule(AD_Rule_ID);
	}

	// some insights.
	// http://stackoverflow.com/questions/27065125/drools-mode-stream-and-containers
	public static KieBase startRule(int AD_Rule_ID) {			
		if (kiebases.containsKey(AD_Rule_ID))
			return kiebases.get(AD_Rule_ID);	
		List<MRule> rules = new Query(Env.getCtx(), X_AD_Rule.Table_Name,"AD_Rule_ID = ? OR Parent_ID = ?", null)
		.setParameters(AD_Rule_ID, AD_Rule_ID).list();
		if (rules.size() == 0)
		{
			Vector vector = new Vector();
			vector.add("the rule don't exist");
			kieerror.put(AD_Rule_ID, vector);
			return null;
		}
		String error = "";
		KieServices ks = KieServices.Factory.get();
		KieFileSystem kfs = ks.newKieFileSystem();
		KieBuilder kieBuilder;
		KieContainer kieContainer;
		KieBase kieBase = null;
		HashMap <String, Vector> activerules = new HashMap<String, Vector>();
		List<String> sessions = new ArrayList<String>();
		List<Vector> ruleitems = new ArrayList<Vector>();
		if (rules != null)
		{
			try 
			{
				HashMap properties = new HashMap();
				EventProcessingOption evtprocopt = EventProcessingOption.CLOUD;
				// take note xapiens
				// 21/6 be careful with the property name of the rule, for some reason in case is not well saved acording hstore
				// el compilador drools no da error, pero tampoco levanta nada, solucion : vuelve a grabar el nombre
				// the drools compiler don't show any error, but still, don't work. fix : save the property name again. ( rare )
				for (MRule rule:rules)
				{
					properties = (HashMap) rule.getProperties();
					String type = (String) properties.get(Constants.XML_ATTRIBUTE_TYPE);				
					if (type.equals("kiebase"))
					{
						String name = rule.getName();
						String entrypoint = (String) properties.get(Constants.XML_ATTRIBUTE_ENTRYPOINT);										
						if (entrypoint != null && entrypoint.length() > 0)
						{
							if (!sessionEntrypoints.containsKey(AD_Rule_ID))
								sessionEntrypoints.put(AD_Rule_ID, entrypoint);
						}
						String agenda = (String) properties.get(Constants.XML_ATTRIBUTE_AGENDA);
						//agenda = (String) properties.get("agenda");
						if (agenda != null && agenda.length() > 0)
						{
							if (!listagenda.containsKey(AD_Rule_ID))
								listagenda.put(AD_Rule_ID, agenda);
						}
						boolean isdefault = Boolean.valueOf((String)properties.get("default"));
						if (isdefault)
						{

						}
						String m_package = (String) properties.get(Constants.XML_ATTRIBUTE_PACKAGE);
						String m_sessionname = (String) properties.get(Constants.XML_ATTRIBUTE_SESSIONNAME);
						sessions.add(m_sessionname);
						String m_EqualsBehavior = (String) properties.get(Constants.XML_ATTRIBUTE_EQUALSBEHAVIOR);
						EqualityBehaviorOption equalbehavopt = EqualityBehaviorOption.EQUALITY ;						
						if (m_EqualsBehavior.equals("EQUALITY"))
							equalbehavopt = EqualityBehaviorOption.EQUALITY;
						else if (m_EqualsBehavior.equals("IDENTITY"))
							equalbehavopt = EqualityBehaviorOption.IDENTITY;
						String m_EventProcessingMode = (String) properties.get(Constants.XML_ATTRIBUTE_EVENTPROCESSINGMODE);
						if (m_EventProcessingMode.equals("STREAM"))
							evtprocopt = EventProcessingOption.STREAM;
						else if (m_EventProcessingMode.equals("CLOUD"))
							evtprocopt = EventProcessingOption.CLOUD;

						Vector kiebase = new Vector();
						kiebase.add(isdefault);
						kiebase.add(m_package);
						kiebase.add(equalbehavopt);
						kiebase.add(evtprocopt);
						kiebase.add(m_sessionname);
						activerules.put(name, kiebase);
					}	
					else if (type.equals("rule"))
					{
						// "name"=>"src/main/resources/org/xendra/rules/messages/sales.drl", "type"=>"rule"
						String m_name = (String) properties.get("name");
						String script = rule.getScript();
						String m_sessionname = (String) properties.get("SessionName");
						Vector ruleitem = new Vector();
						ruleitem.add(m_sessionname);
						ruleitem.add(m_name);
						ruleitem.add(script);
						ruleitems.add(ruleitem);
						//kfs.write(m_name, script);
					}	
				}				
				boolean hasdefault = false;
				boolean forcedefault = false;
				for (String kiebasekey:activerules.keySet())
				{
					Vector kiebase = (Vector) activerules.get(kiebasekey);					
					boolean isdefault = (boolean) kiebase.get(0);
					if (isdefault)
						hasdefault = true;
				}
				//if (!hasdefault && activerules.size() == 1)
				if (!hasdefault)
				{
					forcedefault = true;
				}
				for (String kiebasekey:activerules.keySet())
				{
					Vector kiebase = (Vector) activerules.get(kiebasekey);

					boolean isdefault = (boolean) kiebase.get(0);
					if (forcedefault)
					{
						isdefault = true;
						forcedefault = false;
					}
					String pkgkiebase = (String) kiebase.get(1);
					EqualityBehaviorOption equalbehavopt = (EqualityBehaviorOption) kiebase.get(2);
					//EventProcessingOption evtprocopt = (EventProcessingOption) kiebase.get(3);
					String m_sessionname = (String) kiebase.get(4);

					//					KieBaseModel kieBaseModel1 = kieModuleModel.newKieBaseModel(kiebasekey)
					//							.setDefault(isdefault)
					//							.addPackage(pkgkiebase)
					//							.setEqualsBehavior(equalbehavopt)
					//							.setEventProcessingMode(evtprocopt);
					//					KieSessionModel kieSessionModel1 = kieBaseModel1.newKieSessionModel(m_sessionname);										
				}

				//kfs = kieServices.newKieFileSystem();
				//				System.out.println(kieModuleModel.toXML());				
				//				kfs.writeKModuleXML(kieModuleModel.toXML());											

				for (String session:sessions)
				{
					for (Vector rule:ruleitems)
					{
						String m_sessionname = (String) rule.firstElement();
						if (m_sessionname.equals(session))
						{
							String m_name = (String) rule.get(1);
							String script = (String) rule.lastElement();
							if (kfs != null)
							{
								kfs.write(m_name, script);
							}
						} 
					}
				}
				kieBuilder = ks.newKieBuilder(kfs).buildAll();	    
				Results rs = kieBuilder.getResults();
				List<Message> msgs = rs.getMessages();
				for (Message msg:msgs)
				{
					if (msg.getLevel().equals(Message.Level.ERROR))
					{
						error += msg.getText();						
					}					
				}
				if (error.length() == 0)
				{
					kieContainer = ks.newKieContainer(ks.getRepository().getDefaultReleaseId());
					KieBaseConfiguration config = ks.newKieBaseConfiguration();
					//
					config.setOption(evtprocopt);
					//
					kieBase = kieContainer.newKieBase(config);					
					kiebases.put(AD_Rule_ID,kieBase);
				}
				else
				{
					Vector vector = new Vector();
					vector.add(error);
					vector.add(msgs);
					kieerror.put(AD_Rule_ID, vector);
				}
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}						
		}			
		return kieBase;
	}

	public static void setActive(int AD_Rule_ID, boolean status)
	{
		kieactive.put(AD_Rule_ID, status);
	}
	public static boolean isActive(int AD_Rule_ID)
	{
		boolean active = false;
		if (kieactive.containsKey(AD_Rule_ID))
			active = kieactive.get(AD_Rule_ID);
		return active;
	}
	public static String getKieError(int AD_Rule_ID)
	{
		String error = "";
		if (kieerror.containsKey(AD_Rule_ID))
		{
			Vector vector = kieerror.get(AD_Rule_ID);
			error = (String) vector.firstElement();
		}
		return error;
	}

	public static List<Message> getKieErrorMsgs(int AD_Rule_ID)
	{
		List<Message> msgs = null;
		if (kieerror.containsKey(AD_Rule_ID))
		{
			Vector vector = kieerror.get(AD_Rule_ID);
			msgs = (List<Message>) vector.lastElement();
		}
		return msgs;		
	}

	public static String RulesBootstrap()
	{		
		String error = "";
		return error;
	}

	//	public static KieBase getkieBase()
	//	{
	//		if (kieBase == null)
	//		{
	//			m_ruleserror = Env.RulesBootstrap();
	//			s_log.warning (m_ruleserror);									
	//		}
	//		return kieBase;
	//	}
	//	public static String getRuleErrors()
	//	{
	//		return m_ruleserror;
	//	}
	//	public static void RulesBootstrap() 
	//	{
	//		try {
	//			X_A_Machine machine = new Query(Env.getCtx(), X_A_Machine.Table_Name, X_A_Machine.COLUMNNAME_Mac_Address+" = ?", null)
	//			.setParameters(Util.getLocalMacAddress()).first();
	//			System.out.println(Util.getLocalMacAddress());
	//			List<X_A_MachineListener> listeners = new Query(Env.getCtx(), X_A_MachineListener.Table_Name, "A_Machine_ID = ?", null)			
	//			.setParameters(machine.getA_Machine_ID()).list();
	//			System.out.println("listener size:"+listeners.size());
	//			for (X_A_MachineListener listener:listeners)
	//			{
	//				int AD_Rule_ID = listener.getAD_Rule_ID();
	//				if (AD_Rule_ID  == 0) 
	//					continue;
	//				String sql = "select * from xendra.ad_rule where AD_Rule_ID = ? OR Parent_ID = ?";
	//				PreparedStatement ps = DB.prepareStatement(sql, null);
	//				ps.setInt(1, AD_Rule_ID);
	//				ps.setInt(2, AD_Rule_ID);
	//				ResultSet rs = ps.executeQuery();
	//				HashMap properties = new HashMap();
	//				List<Vector> rules = new ArrayList<Vector>();			
	//				List<String> sessions = new ArrayList<String>();				
	//				while (rs.next()) 			
	//					//			String sql = "select * from xendra.ad_rule where isactive = 'Y' AND ad_rule_id = ? OR parent_id = ? ";
	//					//			PreparedStatement ps = DB.prepareStatement(sql, null);
	//					//			ps.setInt(1, AD_Rule_ID);
	//					//			ps.setInt(2, AD_Rule_ID);
	//					//			ResultSet rs = ps.executeQuery();
	//					//			HashMap properties = new HashMap();
	//					//			List<Vector> rules = new ArrayList<Vector>();			
	//					//			List<String> sessions = new ArrayList<String>();
	//					//			boolean goahead = true;
	//					//			while (rs.next() && goahead) 
	//				{
	//					properties = (HashMap) rs.getObject("properties");
	//					String type = (String) properties.get("type");				
	//					if (type.equals("kiebase"))
	//					{					
	//						String name = rs.getString(X_AD_Rule.COLUMNNAME_Name);
	//						//					if (activerules.contains(name))
	//						//					{
	//						//						goahead = false;
	//						//						continue;
	//						//					}
	//						String entrypoint = (String) properties.get("EntryPoint");										
	//						//entrypoint = (String) properties.get("EntryPoint");
	//						if (entrypoint != null && entrypoint.length() > 0)
	//						{
	//							if (!sessionEntrypoints.containsKey(name))
	//								sessionEntrypoints.put(name, entrypoint);
	//						}
	//						String agenda = (String) properties.get("agenda");
	//						//agenda = (String) properties.get("agenda");
	//						if (agenda != null && agenda.length() > 0)
	//						{
	//							if (!listagenda.containsKey(name))
	//								listagenda.put(name, agenda);
	//						}
	//						//					String queuename = (String) properties.get("queuename");
	//						//					if (queuename != null && queuename.length() > 0)
	//						//					{
	//						//						if (!sessionqueues.containsKey(queuename))
	//						//							sessionqueues.put(name, queuename);
	//						//					}
	//						//					String queuelistenerclass = (String) properties.get("queuelistenerclass");
	//						//					if (queuelistenerclass != null && queuelistenerclass.length() > 0)
	//						//					{
	//						//						if (!queueslisteners.containsKey(queuename))
	//						//							queueslisteners.put(queuename, queuelistenerclass);
	//						//					}					
	//						boolean isdefault = Boolean.valueOf((String)properties.get("default"));
	//						String m_package = (String) properties.get("package");
	//						String m_sessionname = (String) properties.get("SessionName");
	//						sessions.add(m_sessionname);
	//						String m_EqualsBehavior = (String) properties.get("EqualsBehavior");
	//						EqualityBehaviorOption equalbehavopt = EqualityBehaviorOption.EQUALITY ;
	//						EventProcessingOption evtprocopt = EventProcessingOption.CLOUD;
	//						if (m_EqualsBehavior.equals("EQUALITY"))
	//							equalbehavopt = EqualityBehaviorOption.EQUALITY;
	//						else if (m_EqualsBehavior.equals("IDENTITY"))
	//							equalbehavopt = EqualityBehaviorOption.IDENTITY;
	//						String m_EventProcessingMode = (String) properties.get("EventProcessingMode");
	//						if (m_EventProcessingMode.equals("STREAM"))
	//							evtprocopt = EventProcessingOption.STREAM;
	//						else if (m_EventProcessingMode.equals("CLOUD"))
	//							evtprocopt = EventProcessingOption.CLOUD;
	//						KieBaseModel kieBaseModel1 = kieModuleModel.newKieBaseModel(name)
	//								.setDefault(isdefault)
	//								.addPackage(m_package)
	//								.setEqualsBehavior(equalbehavopt)
	//								.setEventProcessingMode(evtprocopt);
	//						KieSessionModel kieSessionModel1 = kieBaseModel1
	//								.newKieSessionModel(m_sessionname);					
	//						kieBaseConf = kieServices.newKieBaseConfiguration();
	//						kfs = kieServices.newKieFileSystem();
	//						System.out.println(kieModuleModel.toXML());	    
	//						kfs.writeKModuleXML(kieModuleModel.toXML());							
	//						activerules.add(name);
	//					}
	//					else if (type.equals("rule"))
	//					{
	//						// "name"=>"src/main/resources/org/xendra/rules/messages/sales.drl", "type"=>"rule"
	//						String m_name = (String) properties.get("name");
	//						String script = rs.getString(X_AD_Rule.COLUMNNAME_Script);
	//						String m_sessionname = (String) properties.get("SessionName");
	//						Vector rule = new Vector();
	//						rule.add(m_sessionname);
	//						rule.add(m_name);
	//						rule.add(script);
	//						rules.add(rule);
	//						//kfs.write(m_name, script);
	//					}
	//				}
	//				for (String session:sessions)
	//				{
	//					for (Vector rule:rules)
	//					{
	//						String m_sessionname = (String) rule.firstElement();
	//						if (m_sessionname.equals(session))
	//						{
	//							String m_name = (String) rule.get(1);
	//							String script = (String) rule.lastElement();
	//							if (kfs != null)
	//							{
	//								kfs.write(m_name, script);
	//							}
	//						} 
	//					}
	//				}
	//				kieBuilder = kieServices.newKieBuilder(kfs).buildAll();	    
	//				//KieContainer kc = ks.getKieClasspathContainer();
	//				kieContainer = kieServices.newKieContainer(kieServices.getRepository()
	//						.getDefaultReleaseId());
	//				kieBase = kieContainer.newKieBase(kieBaseConf);	    
	//				//kieSession = kieBase.newKieSession();
	//				session = kieBase.newKieSession();
	//				for (String key:sessionEntrypoints.keySet())
	//				{
	//					String Entrypointname = sessionEntrypoints.get(key);
	//					EntryPoint point = session.getEntryPoint(Entrypointname);
	//					Entrypoints.put(Entrypointname, point);
	//				}
	//				
	//				//
	//				//point = session.getEntryPoint(entrypoint);
	//			}
	//		}
	//		catch (Exception e)
	//		{
	//			e.printStackTrace();
	//		}										
	//	}

	/**************************************************************************
	 *  Application Context
	 */
	/** WindowNo for Main           */
	public static final int     WINDOW_MAIN = 0;
	/** WindowNo for Find           */
	public static final int     WINDOW_FIND = 1110;
	/** WinowNo for MLookup         */
	public static final int	    WINDOW_MLOOKUP = 1111;
	/** WindowNo for PrintCustomize */
	public static final int     WINDOW_CUSTOMIZE = 1112;
	/** WindowNo for PrintCustomize */
	public static final int     WINDOW_INFO = 1113;

	/** Tab for Info                */
	public static final int     TAB_INFO = 1113;

	/**
	 *  Get Context
	 *  @return Properties
	 */
	public static final Properties getCtx()
	{
		return contextProvider.getContext();
	}   //  getCtx

	/**
	 * Set Context
	 * @param ctx context
	 */
	public static void setCtx (Properties ctx)
	{
		if (ctx == null)
			throw new IllegalArgumentException ("Require Context");
		getCtx().clear();
		getCtx().putAll(ctx);
	}   //  setCtx

	/**
	 *	Set Global Context to Value
	 *  @param ctx context
	 *  @param context context key
	 *  @param value context value
	 */
	public static void setContext (Properties ctx, String context, String value)
	{
		if (ctx == null || context == null)
			return;
		s_log.finer("Context " + context + "==" + value);
		//
		if (value == null || value.length() == 0)
			ctx.remove(context);
		else
			ctx.setProperty(context, value);
	}	//	setContext

	/**
	 *	Set Global Context to Value
	 *  @param ctx context
	 *  @param context context key
	 *  @param value context value
	 */
	public static void setContext (Properties ctx, String context, Timestamp value)
	{
		if (ctx == null || context == null)
			return;
		if (value == null)
		{
			ctx.remove(context);
			s_log.finer("Context " + context + "==" + value);
		}
		else
		{	//	JDBC Format	2005-05-09 00:00:00.0
			String stringValue = value.toString();
			//	Chop off .0 (nanos)
			stringValue = stringValue.substring(0, stringValue.indexOf("."));		
			ctx.setProperty(context, stringValue);
			s_log.finer("Context " + context + "==" + stringValue);
		}
	}	//	setContext

	/**
	 *	Set Global Context to (int) Value
	 *  @param ctx context
	 *  @param context context key
	 *  @param value context value
	 */
	public static void setContext (Properties ctx, String context, int value)
	{
		if (ctx == null || context == null)
			return;
		s_log.finer("Context " + context + "==" + value);
		//
		ctx.setProperty(context, String.valueOf(value));
	}	//	setContext

	/**
	 *	Set Global Context to Y/N Value
	 *  @param ctx context
	 *  @param context context key
	 *  @param value context value
	 */
	public static void setContext (Properties ctx, String context, boolean value)
	{
		setContext (ctx, context, value ? "Y" : "N");
	}	//	setContext

	/**
	 *	Set Context for Window to Value
	 *  @param ctx context
	 *  @param WindowNo window no
	 *  @param context context key
	 *  @param value context value
	 */
	public static void setContext (Properties ctx, int WindowNo, String context, String value)
	{
		if (ctx == null || context == null)
			return;
		if (WindowNo != WINDOW_FIND && WindowNo != WINDOW_MLOOKUP)
			s_log.finer("Context("+WindowNo+") " + context + "==" + value);
		//
		if (value == null || value.equals(""))
			ctx.remove(WindowNo+"|"+context);
		else
			ctx.setProperty(WindowNo+"|"+context, value);
	}	//	setContext

	/**
	 *	Set Context for Window to Value
	 *  @param ctx context
	 *  @param WindowNo window no
	 *  @param context context key
	 *  @param value context value
	 */
	public static void setContext (Properties ctx, int WindowNo, String context, Timestamp value)
	{
		if (ctx == null || context == null)
			return;
		if (value == null)
		{
			ctx.remove(WindowNo+"|"+context);
			s_log.finer("Context("+WindowNo+") " + context + "==" + value);
		}
		else
		{	//	JDBC Format	2005-05-09 00:00:00.0
			String stringValue = value.toString();
			//	Chop off .0 (nanos)
			stringValue = stringValue.substring(0, stringValue.indexOf("."));		
			ctx.setProperty(WindowNo+"|"+context, stringValue);
			s_log.finer("Context("+WindowNo+") " + context + "==" + stringValue);
		}
	}	//	setContext

	/**
	 *	Set Context for Window to int Value
	 *  @param ctx context
	 *  @param WindowNo window no
	 *  @param context context key
	 *  @param value context value
	 */
	public static void setContext (Properties ctx, int WindowNo, String context, int value)
	{
		if (ctx == null || context == null)
			return;
		if (WindowNo != WINDOW_FIND && WindowNo != WINDOW_MLOOKUP)
			s_log.finer("Context("+WindowNo+") " + context + "==" + value);
		//
		ctx.setProperty(WindowNo+"|"+context, String.valueOf(value));
	}	//	setContext

	/**
	 *	Set Context for Window to Y/N Value
	 *  @param ctx context
	 *  @param WindowNo window no
	 *  @param context context key
	 *  @param value context value
	 */
	public static void setContext (Properties ctx, int WindowNo, String context, boolean value)
	{
		setContext (ctx, WindowNo, context, value ? "Y" : "N");
	}	//	setContext

	/**
	 *	Set Context for Window & Tab to Value
	 *  @param ctx context
	 *  @param WindowNo window no
	 *  @param TabNo tab no
	 *  @param context context key
	 *  @param value context value
	 *   */
	public static void setContext (Properties ctx, int WindowNo, int TabNo, String context, String value)
	{
		if (ctx == null || context == null)
			return;
		if (WindowNo != WINDOW_FIND && WindowNo != WINDOW_MLOOKUP)
			s_log.finest("Context("+WindowNo+","+TabNo+") " + context + "==" + value);
		//
		if (value == null)
			if (context.endsWith("_ID"))
				// TODO: Research potential problems with tables with Record_ID=0
				value = new String("0");
			else
				value = new String("");
		ctx.setProperty(WindowNo+"|"+TabNo+"|"+context, value);
	}	//	setContext

	/**
	 *	Set Auto Commit
	 *  @param ctx context
	 *  @param autoCommit auto commit (save)
	 */
	public static void setAutoCommit (Properties ctx, boolean autoCommit)
	{
		if (ctx == null)
			return;
		ctx.setProperty("AutoCommit", autoCommit ? "Y" : "N");
	}	//	setAutoCommit

	/**
	 *	Set Auto Commit for Window
	 *  @param ctx context
	 *  @param WindowNo window no
	 *  @param autoCommit auto commit (save)
	 */
	public static void setAutoCommit (Properties ctx, int WindowNo, boolean autoCommit)
	{
		if (ctx == null)
			return;
		ctx.setProperty(WindowNo+"|AutoCommit", autoCommit ? "Y" : "N");
	}	//	setAutoCommit

	/**
	 *	Set Auto New Record
	 *  @param ctx context
	 *  @param autoNew auto new record
	 */
	public static void setAutoNew (Properties ctx, boolean autoNew)
	{
		if (ctx == null)
			return;
		ctx.setProperty("AutoNew", autoNew ? "Y" : "N");
	}	//	setAutoNew

	/**
	 *	Set Auto New Record for Window
	 *  @param ctx context
	 *  @param WindowNo window no
	 *  @param autoNew auto new record
	 */
	public static void setAutoNew (Properties ctx, int WindowNo, boolean autoNew)
	{
		if (ctx == null)
			return;
		ctx.setProperty(WindowNo+"|AutoNew", autoNew ? "Y" : "N");
	}	//	setAutoNew


	/**
	 *	Set SO Trx
	 *  @param ctx context
	 *  @param isSOTrx SO Context
	 */
	public static void setSOTrx (Properties ctx, boolean isSOTrx)
	{
		if (ctx == null)
			return;
		ctx.setProperty("IsSOTrx", isSOTrx ? "Y" : "N");
	}	//	setSOTrx

	/**
	 *	Get global Value of Context
	 *  @param ctx context
	 *  @param context context key
	 *  @return value or ""
	 */
	public static String getContext (Properties ctx, String context)
	{
		if (ctx == null || context == null)
			throw new IllegalArgumentException ("Require Context");
		return ctx.getProperty(context, "");
	}	//	getContext

	/**
	 *	Get Value of Context for Window.
	 *	if not found global context if available and enabled
	 *  @param ctx context
	 *  @param WindowNo window
	 *  @param context context key
	 *  @param  onlyWindow  if true, no defaults are used unless explicitly asked for
	 *  @return value or ""
	 */
	public static String getContext (Properties ctx, int WindowNo, String context, boolean onlyWindow)
	{
		if (ctx == null)
			throw new IllegalArgumentException ("No Ctx");
		if (context == null)
			throw new IllegalArgumentException ("Require Context");
		String s = ctx.getProperty(WindowNo+"|"+context);
		if (s == null)
		{
			//	Explicit Base Values
			if (context.startsWith("#") || context.startsWith("$"))
				return getContext(ctx, context);
			if (onlyWindow)			//	no Default values
				return "";
			return getContext(ctx, "#" + context);
		}
		return s;
	}	//	getContext

	/**
	 *	Get Value of Context for Window.
	 *	if not found global context if available
	 *  @param ctx context
	 *  @param WindowNo window
	 *  @param context context key
	 *  @return value or ""
	 */
	public static String getContext (Properties ctx, int WindowNo, String context)
	{
		return getContext(ctx, WindowNo, context, false);
	}	//	getContext

	/**
	 * Get Value of Context for Window & Tab,
	 * if not found global context if available.
	 * If TabNo is TAB_INFO only tab's context will be checked.
	 * @param ctx context
	 * @param WindowNo window no
	 * @param TabNo tab no
	 * @param context context key
	 * @return value or ""
	 */
	public static String getContext (Properties ctx, int WindowNo, int TabNo, String context)
	{
		if (ctx == null || context == null)
			throw new IllegalArgumentException ("Require Context");
		String s = ctx.getProperty(WindowNo+"|"+TabNo+"|"+context);
		// If TAB_INFO, don't check Window and Global context - teo_sarca BF [ 2017987 ]
		if (TAB_INFO == TabNo)
			return s != null ? s : "";
		//
		if (s == null)
			return getContext(ctx, WindowNo, context, false);
		return s;
	}	//	getContext

	/**
	 * Get Value of Context for Window & Tab,
	 * if not found global context if available.
	 * If TabNo is TAB_INFO only tab's context will be checked.
	 * @param ctx context
	 * @param WindowNo window no
	 * @param TabNo tab no
	 * @param context context key
	 * @param onlyTab if true, no window value is searched
	 * @return value or ""
	 */
	public static String getContext (Properties ctx, int WindowNo, int TabNo, String context, boolean onlyTab)
	{
		final boolean onlyWindow = onlyTab ? true : false;
		return getContext(ctx, WindowNo, TabNo, context, onlyTab, onlyWindow);
	}

	/**
	 * Get Value of Context for Window & Tab,
	 * if not found global context if available.
	 * If TabNo is TAB_INFO only tab's context will be checked.
	 * @param ctx context
	 * @param WindowNo window no
	 * @param TabNo tab no
	 * @param context context key
	 * @param onlyTab if true, no window value is searched
	 * @param onlyWindow if true, no global context will be searched
	 * @return value or ""
	 */
	public static String getContext (Properties ctx, int WindowNo, int TabNo, String context, boolean onlyTab, boolean onlyWindow)
	{
		if (ctx == null || context == null)
			throw new IllegalArgumentException ("Require Context");
		String s = ctx.getProperty(WindowNo+"|"+TabNo+"|"+context);
		// If TAB_INFO, don't check Window and Global context - teo_sarca BF [ 2017987 ]
		if (TAB_INFO == TabNo)
			return s != null ? s : "";
		//
		if (s == null && ! onlyTab)
			return getContext(ctx, WindowNo, context, onlyWindow);
		return s;
	}	//	getContext

	/**
	 *	Get Context and convert it to an integer (0 if error)
	 *  @param ctx context
	 *  @param context context key
	 *  @return value
	 */
	public static int getContextAsInt(Properties ctx, String context)
	{
		if (ctx == null || context == null)
			throw new IllegalArgumentException ("Require Context");
		String s = getContext(ctx, context);
		if (s.length() == 0)
			s = getContext(ctx, 0, context, false);		//	search 0 and defaults
		if (s.length() == 0)
			return 0;
		//
		try
		{
			return Integer.parseInt(s);
		}
		catch (NumberFormatException e)
		{
			s_log.log(Level.SEVERE, "(" + context + ") = " + s, e);
		}
		return 0;
	}	//	getContextAsInt

	/**
	 *	Get Context and convert it to an integer (0 if error)
	 *  @param ctx context
	 *  @param WindowNo window no
	 *  @param context context key
	 *  @return value or 0
	 */
	public static int getContextAsInt(Properties ctx, int WindowNo, String context)
	{
		String s = getContext(ctx, WindowNo, context, false);
		if (s.length() == 0)
			return 0;
		//
		try
		{
			return Integer.parseInt(s);
		}
		catch (NumberFormatException e)
		{
			s_log.log(Level.SEVERE, "(" + context + ") = " + s, e);
		}
		return 0;
	}	//	getContextAsInt

	/**
	 *	Get Context and convert it to an integer (0 if error)
	 *  @param ctx context
	 *  @param WindowNo window no
	 *  @param context context key
	 *  @param onlyWindow  if true, no defaults are used unless explicitly asked for
	 *  @return value or 0
	 */
	public static int getContextAsInt(Properties ctx, int WindowNo, String context, boolean onlyWindow)
	{
		String s = getContext(ctx, WindowNo, context, onlyWindow);
		if (s.length() == 0)
			return 0;
		//
		try
		{
			return Integer.parseInt(s);
		}
		catch (NumberFormatException e)
		{
			s_log.log(Level.SEVERE, "(" + context + ") = " + s, e);
		}
		return 0;
	}	//	getContextAsInt

	/**
	 *	Get Context and convert it to an integer (0 if error)
	 *  @param ctx context
	 *  @param WindowNo window no
	 *  @param TabNo tab no
	 * 	@param context context key
	 *  @return value or 0
	 */
	public static int getContextAsInt (Properties ctx, int WindowNo, int TabNo, String context)
	{
		String s = getContext(ctx, WindowNo, TabNo, context);
		if (s.length() == 0)
			return 0;
		//
		try
		{
			return Integer.parseInt(s);
		}
		catch (NumberFormatException e)
		{
			s_log.log(Level.SEVERE, "(" + context + ") = " + s, e);
		}
		return 0;
	}	//	getContextAsInt

	/**
	 *	Is AutoCommit
	 *  @param ctx context
	 *  @return true if auto commit
	 */
	public static boolean isAutoCommit (Properties ctx)
	{
		if (ctx == null)
			throw new IllegalArgumentException ("Require Context");
		String s = getContext(ctx, "AutoCommit");
		if (s != null && s.equals("Y"))
			return true;
		return false;
	}	//	isAutoCommit

	/**
	 *	Is Window AutoCommit (if not set use default)
	 *  @param ctx context
	 *  @param WindowNo window no
	 *  @return true if auto commit
	 */
	public static boolean isAutoCommit (Properties ctx, int WindowNo)
	{
		if (ctx == null)
			throw new IllegalArgumentException ("Require Context");
		String s = getContext(ctx, WindowNo, "AutoCommit", false);
		if (s != null)
		{
			if (s.equals("Y"))
				return true;
			else
				return false;
		}
		return isAutoCommit(ctx);
	}	//	isAutoCommit


	/**
	 *	Is Auto New Record
	 *  @param ctx context
	 *  @return true if auto new
	 */
	public static boolean isAutoNew (Properties ctx)
	{
		if (ctx == null)
			throw new IllegalArgumentException ("Require Context");
		String s = getContext(ctx, "AutoNew");
		if (s != null && s.equals("Y"))
			return true;
		return false;
	}	//	isAutoNew

	/**
	 *	Is Window Auto New Record (if not set use default)
	 *  @param ctx context
	 *  @param WindowNo window no
	 *  @return true if auto new record
	 */
	public static boolean isAutoNew (Properties ctx, int WindowNo)
	{
		if (ctx == null)
			throw new IllegalArgumentException ("Require Context");
		String s = getContext(ctx, WindowNo, "AutoNew", false);
		if (s != null)
		{
			if (s.equals("Y"))
				return true;
			else
				return false;
		}
		return isAutoNew(ctx);
	}	//	isAutoNew


	/**
	 *	Is Sales Order Trx
	 *  @param ctx context
	 *  @return true if SO (default)
	 */
	public static boolean isSOTrx (Properties ctx)
	{
		String s = getContext(ctx, "IsSOTrx");
		if (s != null && s.equals("N"))
			return false;
		return true;
	}	//	isSOTrx

	/**
	 *	Is Sales Order Trx
	 *  @param ctx context
	 *  @param WindowNo window no
	 *  @return true if SO (default)
	 */
	public static boolean isSOTrx (Properties ctx, int WindowNo)
	{
		String s = getContext(ctx, WindowNo, "IsSOTrx", true);
		if (s != null && s.equals("N"))
			return false;
		return true;
	}	//	isSOTrx

	/**
	 *	Get Context and convert it to a Timestamp
	 *	if error return today's date
	 *  @param ctx context
	 *  @param context context key
	 *  @return Timestamp
	 */
	public static Timestamp getContextAsDate(Properties ctx, String context)
	{
		return getContextAsDate(ctx, 0, context);
	}	//	getContextAsDate

	/**
	 *	Get Context and convert it to a Timestamp
	 *	if error return today's date
	 *  @param ctx context
	 *  @param WindowNo window no
	 *  @param context context key
	 *  @return Timestamp
	 */
	public static Timestamp getContextAsDate(Properties ctx, int WindowNo, String context)
	{
		if (ctx == null || context == null)
			throw new IllegalArgumentException ("Require Context");
		String s = getContext(ctx, WindowNo, context, false);
		//	JDBC Format YYYY-MM-DD	example 2000-09-11 00:00:00.0
		if (s == null || s.equals(""))
		{
			s_log.log(Level.SEVERE, "No value for: " + context);
			return new Timestamp(System.currentTimeMillis());
		}

		//  timestamp requires time
		if (s.trim().length() == 10)
			s = s.trim() + " 00:00:00.0";
		else if (s.indexOf('.') == -1)
			s = s.trim() + ".0";

		return Timestamp.valueOf(s);
	}	//	getContextAsDate

	/**
	 * 	Get Login AD_Client_ID
	 *	@param ctx context
	 *	@return login AD_Client_ID
	 */
	public static int getAD_Client_ID (Properties ctx)
	{
		return Env.getContextAsInt(ctx, "#AD_Client_ID");
	}	//	getAD_Client_ID

	/**
	 * 	Get Login AD_Org_ID
	 *	@param ctx context
	 *	@return login AD_Org_ID
	 */
	public static int getAD_Org_ID (Properties ctx)
	{
		return Env.getContextAsInt(ctx, "#AD_Org_ID");
	}	//	getAD_Client_ID

	/**
	 * 	Get Login AD_User_ID
	 *	@param ctx context
	 *	@return login AD_User_ID
	 */
	public static int getAD_User_ID (Properties ctx)
	{
		return Env.getContextAsInt(ctx, "#AD_User_ID");
	}	//	getAD_User_ID

	/**
	 * 	Get Login AD_Role_ID
	 *	@param ctx context
	 *	@return login AD_Role_ID
	 */
	public static int getAD_Role_ID (Properties ctx)
	{
		return Env.getContextAsInt(ctx, "#AD_Role_ID");
	}	//	getAD_Role_ID

	/**************************************************************************
	 *	Get Preference.
	 *  <pre>
	 *		0)	Current Setting
	 *		1) 	Window Preference
	 *		2) 	Global Preference
	 *		3)	Login settings
	 *		4)	Accounting settings
	 *  </pre>
	 *  @param  ctx context
	 *	@param	AD_Window_ID window no
	 *	@param	context		Entity to search
	 *	@param	system		System level preferences (vs. user defined)
	 *  @return preference value
	 */
	public static String getPreference (Properties ctx, int AD_Window_ID, String context, boolean system)
	{
		if (ctx == null || context == null)
			throw new IllegalArgumentException ("Require Context");
		String retValue = null;
		//
		if (!system)	//	User Preferences
		{
			retValue = ctx.getProperty("P"+AD_Window_ID+"|"+context);//	Window Pref
			if (retValue == null)
				retValue = ctx.getProperty("P|"+context);  			//	Global Pref
		}
		else			//	System Preferences
		{
			retValue = ctx.getProperty("#"+context);   				//	Login setting
			if (retValue == null)
				retValue = ctx.getProperty("$"+context);   			//	Accounting setting
		}
		//
		return (retValue == null ? "" : retValue);
	}	//	getPreference

	/**************************************************************************
	 *  Language issues
	 */

	/** Context Language identifier */
	static public final String      LANGUAGE = "#AD_Language";

	/** Context for POS ID */
	//static public final String		HOLON = "#HOLON";

	/**
	 *  Check Base Language
	 *  @param ctx context
	 * 	@param tableName table to be translated
	 * 	@return true if base language and table not translated
	 */
	public static boolean isBaseLanguage (Properties ctx, String tableName)
	{
		/**
		if (isBaseTranslation(tableName))
			return Language.isBaseLanguage (getAD_Language(ctx));
		else	//	No AD Table
			if (!isMultiLingualDocument(ctx))
				return true;		//	access base table
		 **/
		return Language.isBaseLanguage (getAD_Language(ctx));
	}	//	isBaseLanguage

	/**
	 *	Check Base Language
	 * 	@param AD_Language language
	 * 	@param tableName table to be translated
	 * 	@return true if base language and table not translated
	 */
	public static boolean isBaseLanguage (String AD_Language, String tableName)
	{
		/**
		if (isBaseTranslation(tableName))
			return Language.isBaseLanguage (AD_Language);
		else	//	No AD Table
			if (!isMultiLingualDocument(s_ctx))				//	Base Context
				return true;		//	access base table
		 **/
		return Language.isBaseLanguage (AD_Language);
	}	//	isBaseLanguage

	/**
	 *	Check Base Language
	 * 	@param language language
	 * 	@param tableName table to be translated
	 * 	@return true if base language and table not translated
	 */
	public static boolean isBaseLanguage (Language language, String tableName)
	{
		/**
		if (isBaseTranslation(tableName))
			return language.isBaseLanguage();
		else	//	No AD Table
			if (!isMultiLingualDocument(s_ctx))				//	Base Context
				return true;		//	access base table
		 **/
		return language.isBaseLanguage();
	}	//	isBaseLanguage

	/**
	 * 	Table is in Base Translation (AD)
	 *	@param tableName table
	 *	@return true if base trl
	 */
	public static boolean isBaseTranslation (String tableName)
	{
		if (tableName.startsWith("AD") 
				|| tableName.equals("C_Country_Trl") )
			return true;
		return false;
	}	//	isBaseTranslation

	/**
	 * 	Do we have Multi-Lingual Documents.
	 *  Set in DB.loadOrgs
	 * 	@param ctx context
	 * 	@return true if multi lingual documents
	 */
	public static boolean isMultiLingualDocument (Properties ctx)
	{
		return MClient.get(ctx).isMultiLingualDocument();
	}	//	isMultiLingualDocument

	/**
	 *  Get System AD_Language
	 *  @param ctx context
	 *	@return AD_Language eg. en_US
	 */
	public static String getAD_Language (Properties ctx)
	{
		if (ctx != null)
		{
			String lang = getContext(ctx, LANGUAGE);
			if (!Util.isEmpty(lang))
				return lang;
		}
		return Language.getBaseAD_Language();
	}	//	getAD_Language

	/**
	 *  Get System Language
	 *  @param ctx context
	 *	@return Language
	 */
	public static Language getLanguage (Properties ctx)
	{
		if (ctx != null)
		{
			String lang = getContext(ctx, LANGUAGE);
			if (!Util.isEmpty(lang))
				return Language.getLanguage(lang);
		}
		return Language.getBaseLanguage();
	}	//	getLanguage

	/**
	 *  Get Login Language
	 *  @param ctx context
	 *	@return Language
	 */
	public static Language getLoginLanguage (Properties ctx)
	{
		return Language.getLoginLanguage();
	}	//	getLanguage

	/**
	 *  Verify Language.
	 *  Check that language is supported by the system
	 *  @param ctx might be updated with new AD_Language
	 *  @param language language
	 */
	public static void verifyLanguage (Properties ctx, Language language)
	{
		if (language.isBaseLanguage())
			return;

		boolean isSystemLanguage = false;
		ArrayList<String> AD_Languages = new ArrayList<String>();
		String sql = "SELECT DISTINCT AD_Language FROM AD_Message_Trl";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			pstmt = DB.prepareStatement(sql, null);
			rs = pstmt.executeQuery();
			while (rs.next())
			{
				String AD_Language = rs.getString(1);
				if (AD_Language.equals(language.getAD_Language()))
				{
					isSystemLanguage = true;
					break;
				}
				AD_Languages.add(AD_Language);
			}
		}
		catch (SQLException e)
		{
			s_log.log(Level.SEVERE, "", e);
		}
		finally {
			DB.close(rs, pstmt);
			rs = null; pstmt = null;
		}
		//	Found it
		if (isSystemLanguage)
			return;
		//	No Language - set to System
		if (AD_Languages.size() == 0)
		{
			s_log.warning ("NO System Language - Set to Base " + Language.getBaseAD_Language());
			language.setAD_Language(Language.getBaseAD_Language());
			return;
		}

		for (int i = 0; i < AD_Languages.size(); i++)
		{
			String AD_Language = (String)AD_Languages.get(i);	//	en_US
			String lang = AD_Language.substring(0, 2);			//	en
			//
			String langCompare = language.getAD_Language().substring(0, 2);
			if (lang.equals(langCompare))
			{
				s_log.fine("Found similar Language " + AD_Language);
				language.setAD_Language(AD_Language);
				return;
			}
		}

		//	We found same language
		//	if (!"0".equals(Msg.getMsg(AD_Language, "0")))

		s_log.warning ("Not System Language=" + language
				+ " - Set to Base Language " + Language.getBaseAD_Language());
		language.setAD_Language(Language.getBaseAD_Language());
	}   //  verifyLanguage

	/**************************************************************************
	 *	Get Context as String array with format: key == value
	 *  @param ctx context
	 *  @return context string
	 */
	public static String[] getEntireContext(Properties ctx)
	{
		if (ctx == null)
			throw new IllegalArgumentException ("Require Context");
		Iterator<?> keyIterator = ctx.keySet().iterator();
		String[] sList = new String[ctx.size()];
		int i = 0;
		while (keyIterator.hasNext())
		{
			Object key = keyIterator.next();
			sList[i++] = key.toString() + " == " + ctx.get(key).toString();
		}

		return sList;
	}	//	getEntireContext

	/**
	 *	Get Header info (connection, org, user)
	 *  @param ctx context
	 *  @param WindowNo window
	 *  @return Header String
	 */
	public static String getHeader(Properties ctx, int WindowNo)
	{
		StringBuffer sb = new StringBuffer();
		if (WindowNo > 0){
			sb.append(getContext(ctx, WindowNo, "WindowName", false)).append("  ");
			final String documentNo = getContext(ctx, WindowNo, "DocumentNo", false);
			final String value = getContext(ctx, WindowNo, "Value", false);
			final String name = getContext(ctx, WindowNo, "Name", false);
			if(!"".equals(documentNo)) {
				sb.append(documentNo).append("  ");
			}
			if(!"".equals(value)) {
				sb.append(value).append("  ");
			}
			if(!"".equals(name)) {
				sb.append(name).append("  ");
			}
		}
		sb.append(getContext(ctx, "#AD_User_Name")).append("@")
		.append(getContext(ctx, "#AD_Client_Name")).append(".")
		.append(getContext(ctx, "#AD_Org_Name"))
		.append(" [").append(CConnection.get().toString()).append("]");
		return sb.toString();
	}	//	getHeader

	/**
	 *	Clean up context for Window (i.e. delete it)
	 *  @param ctx context
	 *  @param WindowNo window
	 */
	public static void clearWinContext(Properties ctx, int WindowNo)
	{
		if (ctx == null)
			throw new IllegalArgumentException ("Require Context");
		//
		Object[] keys = ctx.keySet().toArray();
		for (int i = 0; i < keys.length; i++)
		{
			String tag = keys[i].toString();
			if (tag.startsWith(WindowNo+"|"))
				ctx.remove(keys[i]);
		}
		//  Clear Lookup Cache
		MLookupCache.cacheReset(WindowNo);
		//	MLocator.cacheReset(WindowNo);
		//
		if (Ini.isClient())
			removeWindow(WindowNo);
	}	//	clearWinContext

	/**
	 * Clean up context for Window Tab (i.e. delete it).
	 * Please note that this method is not clearing the tab info context (i.e. _TabInfo).
	 * @param ctx context
	 * @param WindowNo window
	 * @param TabNo tab
	 */
	public static void clearTabContext(Properties ctx, int WindowNo, int TabNo)
	{
		if (ctx == null)
			throw new IllegalArgumentException ("Require Context");
		//
		Object[] keys = ctx.keySet().toArray();
		for (int i = 0; i < keys.length; i++)
		{
			String tag = keys[i].toString();
			if (tag.startsWith(WindowNo+"|"+TabNo+"|")
					&& !tag.startsWith(WindowNo+"|"+TabNo+"|_TabInfo"))
			{
				ctx.remove(keys[i]);
			}
		}
	}

	/**
	 *	Clean up all context (i.e. delete it)
	 *  @param ctx context
	 */
	public static void clearContext(Properties ctx)
	{
		if (ctx == null)
			throw new IllegalArgumentException ("Require Context");
		ctx.clear();
	}	//	clearContext


	public static String parseContext (Properties ctx, int WindowNo, String value,
			boolean onlyWindow, boolean ignoreUnparsable)
	{
		return parseContext (ctx, WindowNo, -1, value, onlyWindow, ignoreUnparsable);

	}	
	/**
	 *	Parse Context replaces global or Window context @tag@ with actual value.
	 *
	 *  @tag@ are ignored otherwise "" is returned
	 *  @param ctx context
	 *	@param WindowNo	Number of Window
	 *	@param value Message to be parsed
	 *  @param onlyWindow if true, no defaults are used
	 * 	@param ignoreUnparsable if true, unsuccessful @return parsed String or "" if not successful and ignoreUnparsable
	 *	@return parsed context 
	 */
	public static String parseContext (Properties ctx, int WindowNo, int TabNo, String value,
			boolean onlyWindow, boolean ignoreUnparsable)
	{
		if (value == null || value.length() == 0)
			return "";

		String token;
		String inStr = new String(value);
		StringBuffer outStr = new StringBuffer();

		int i = inStr.indexOf('@');
		while (i != -1)
		{
			outStr.append(inStr.substring(0, i));			// up to @
			inStr = inStr.substring(i+1, inStr.length());	// from first @

			int j = inStr.indexOf('@');						// next @
			if (j < 0)
			{
				s_log.log(Level.SEVERE, "No second tag: " + inStr);
				return "";						//	no second tag
			}

			token = inStr.substring(0, j);

			String ctxInfo = null;
			if (TabNo == -1)
				ctxInfo = getContext(ctx, WindowNo, token, onlyWindow);	// get context
			else
				ctxInfo = getContext(ctx, WindowNo, TabNo, token, onlyWindow);	// get context
			if (ctxInfo.length() == 0 && (token.startsWith("#") || token.startsWith("$")) )
				ctxInfo = getContext(ctx, token);	// get global context
			if (ctxInfo.length() == 0)
			{
				s_log.config("No Context Win=" + WindowNo + " for: " + token);
				if (!ignoreUnparsable)
					return "";						//	token not found
			}
			else
				outStr.append(ctxInfo);				// replace context with Context

			inStr = inStr.substring(j+1, inStr.length());	// from second @
			i = inStr.indexOf('@');
		}
		outStr.append(inStr);						// add the rest of the string

		return outStr.toString();
	}	//	parseContext

	/**
	 *	Parse Context replaces global or Window context @tag@ with actual value.
	 *
	 *  @param ctx context
	 *	@param	WindowNo	Number of Window
	 *	@param	value		Message to be parsed
	 *  @param  onlyWindow  if true, no defaults are used
	 *  @return parsed String or "" if not successful
	 */
	public static String parseContext (Properties ctx, int WindowNo, int TabNo, String value,
			boolean onlyWindow)
	{
		return parseContext(ctx, WindowNo, TabNo, value, onlyWindow, false);
	}	//	parseContext

	public static String parseContext (Properties ctx, int WindowNo, String value,
			boolean onlyWindow)
	{
		return parseContext(ctx, WindowNo, -1, value, onlyWindow, false);
	}	//	parseContext

	/**
	 * Parse expression, replaces global or PO properties @tag@ with actual value. 
	 * @param expression
	 * @param po
	 * @param trxName
	 * @return String
	 */
	public static String parseVariable(String expression, PO po, String trxName, boolean keepUnparseable) {
		if (expression == null || expression.length() == 0)
			return "";

		String token;
		String inStr = new String(expression);
		StringBuffer outStr = new StringBuffer();

		int i = inStr.indexOf('@');
		while (i != -1)
		{
			outStr.append(inStr.substring(0, i));			// up to @
			inStr = inStr.substring(i+1, inStr.length());	// from first @

			int j = inStr.indexOf('@');						// next @
			if (j < 0)
			{
				s_log.log(Level.SEVERE, "No second tag: " + inStr);
				return "";						//	no second tag
			}

			token = inStr.substring(0, j);

			//format string
			String format = "";
			int f = token.indexOf('<');
			if (f > 0 && token.endsWith(">")) {
				format = token.substring(f+1, token.length()-1);
				token = token.substring(0, f);
			}

			if (token.startsWith("#") || token.startsWith("$")) {
				//take from context
				Properties ctx = po != null ? po.getCtx() : Env.getCtx();
				String v = Env.getContext(ctx, token);
				if (v != null && v.length() > 0)
					outStr.append(v);
				else if (keepUnparseable)
					outStr.append("@"+token+"@");
			} else if (po != null) {
				//take from po
				Object v = po.get_Value(token);
				if (v != null) {
					if (format != null && format.length() > 0) {
						if (v instanceof Integer && token.endsWith("_ID")) {
							int tblIndex = format.indexOf(".");
							String table = tblIndex > 0 ? format.substring(0, tblIndex) : token.substring(0, token.length() - 3);
							String column = tblIndex > 0 ? format.substring(tblIndex + 1) : format;
							outStr.append(DB.getSQLValueString(trxName, 
									"select " + column + " from  " + table + " where " + table + "_id = ?", (Integer)v));
						} else if (v instanceof Date) {
							SimpleDateFormat df = new SimpleDateFormat(format);
							outStr.append(df.format((Date)v));
						} else if (v instanceof Number) {
							DecimalFormat df = new DecimalFormat(format);
							outStr.append(df.format(((Number)v).doubleValue()));
						} else {
							MessageFormat mf = new MessageFormat(format);
							outStr.append(mf.format(v));
						}
					} else {
						outStr.append(v.toString());
					}
				}
				else if (keepUnparseable) {
					outStr.append("@"+token+"@");
				}
			}

			inStr = inStr.substring(j+1, inStr.length());	// from second @
			i = inStr.indexOf('@');
		}
		outStr.append(inStr);						// add the rest of the string

		return outStr.toString();
	}

	/*************************************************************************/

	//	Array of active Windows
	private static ArrayList<Container>	s_windows = new ArrayList<Container>(20);

	/**
	 *	Add Container and return WindowNo.
	 *  The container is a APanel, AWindow or JFrame/JDialog
	 *  @param win window
	 *  @return WindowNo used for context
	 */
	public static int createWindowNo(Container win)
	{
		int retValue = s_windows.size();
		s_windows.add(win);
		return retValue;
	}	//	createWindowNo

	/**
	 *	Search Window by comparing the Frames
	 *  @param container container
	 *  @return WindowNo of container or 0
	 */
	public static int getWindowNo (Container container)
	{
		if (container == null)
			return 0;
		JFrame winFrame = getFrame(container);
		if (winFrame == null)
			return 0;

		//  loop through windows
		for (int i = 0; i < s_windows.size(); i++)
		{
			Container cmp = (Container)s_windows.get(i);
			if (cmp != null)
			{
				JFrame cmpFrame = getFrame(cmp);
				if (winFrame.equals(cmpFrame))
					return i;
			}
		}
		return 0;
	}	//	getWindowNo

	/**
	 *	Return the JFrame pointer of WindowNo - or null
	 *  @param WindowNo window
	 *  @return JFrame of WindowNo
	 */
	public static JFrame getWindow (int WindowNo)
	{
		JFrame retValue = null;
		try
		{
			retValue = getFrame ((Container)s_windows.get(WindowNo));
		}
		catch (Exception e)
		{
			s_log.log(Level.SEVERE, e.toString());
		}
		return retValue;
	}	//	getWindow

	/**
	 *	Remove window from active list
	 *  @param WindowNo window
	 */
	private static void removeWindow (int WindowNo)
	{
		if (WindowNo < s_windows.size())
			s_windows.set(WindowNo, null);
	}	//	removeWindow

	/**
	 *	Clean up context for Window (i.e. delete it)
	 *  @param WindowNo window
	 */
	public static void clearWinContext(int WindowNo)
	{
		clearWinContext (getCtx(), WindowNo);
	}	//	clearWinContext

	/**
	 *	Clean up all context (i.e. delete it)
	 */
	public static void clearContext()
	{
		getCtx().clear();
	}	//	clearContext


	/**************************************************************************
	 *	Get Frame of Window
	 *  @param container Container
	 *  @return JFrame of container or null
	 */
	public static JFrame getFrame (Container container)
	{
		Container element = container;
		while (element != null)
		{
			if (element instanceof JFrame)
				return (JFrame)element;
			element = element.getParent();
		}
		return null;
	}	//	getFrame

	/**
	 *	Get Graphics of container or its parent.
	 *  The element may not have a Graphic if not displayed yet,
	 * 	but the parent might have.
	 *  @param container Container
	 *  @return Graphics of container or null
	 */
	public static Graphics getGraphics (Container container)
	{
		Container element = container;
		while (element != null)
		{
			Graphics g = element.getGraphics();
			if (g != null)
				return g;
			element = element.getParent();
		}
		return null;
	}	//	getFrame

	/**
	 *  Return JDialog or JFrame Parent
	 *  @param container Container
	 *  @return JDialog or JFrame of container
	 */
	public static Window getParent (Container container)
	{
		Container element = container;
		while (element != null)
		{
			if (element instanceof JDialog || element instanceof JFrame)
				return (Window)element;
			if (element instanceof Window)
				return (Window)element;
			element = element.getParent();
		}
		return null;
	}   //  getParent

	/**************************************************************************
	 *  Get Image with File name
	 *
	 *  @param fileNameInImageDir full file name in imgaes folder (e.g. Bean16.gif)
	 *  @return image
	 */
	public static Image getImage (String fileNameInImageDir)
	{
		URL url = Xendra.class.getResource("images/" + fileNameInImageDir);
		if (url == null)
		{
			s_log.log(Level.SEVERE, "Not found: " +  fileNameInImageDir);
			return null;
		}
		Toolkit tk = Toolkit.getDefaultToolkit();
		return tk.getImage(url);
	}   //  getImage

	public static BufferedImage getBufferedImage (String fileNameInImageDir)
	{
		URL url = Xendra.class.getResource("images/" + fileNameInImageDir);
		if (url == null)
		{
			s_log.log(Level.SEVERE, "Not found: " +  fileNameInImageDir);
			return null;
		}		
		BufferedImage img = null;
		try {
			img = ImageIO.read(url);
		}
		catch (Exception e)
		{

		}
		return img;
	}   //  getImage

	/**
	 *  Get ImageIcon.
	 *
	 *  @param fileNameInImageDir full file name in imgaes folder (e.g. Bean16.gif)
	 *  @return image
	 */
	public static ImageIcon getImageIcon (String fileNameInImageDir)
	{
		URL url = Xendra.class.getResource("images/" + fileNameInImageDir);
		if (url == null)
		{
			s_log.log(Level.INFO, "Not found: " +  fileNameInImageDir);
			return null;
		}
		return new ImageIcon(url);
	}   //  getImageIcon

	/**
	 *  Get ImageIcon. This method different from getImageIcon
	 *  where the fileName parameter is without extension. The
	 *  method will first try .gif and then .png if .gif does not
	 *  exists.
	 *
	 *  @param fileName file name in imgaes folder without the extension(e.g. Bean16)
	 *  @return image
	 */
	public static ImageIcon getImageIcon2 (String fileName)
	{
		URL url = Xendra.class.getResource("images/" + fileName+".gif");
		if (url == null)
			url = Xendra.class.getResource("images/" + fileName+".png");
		if (url == null)
		{
			s_log.log(Level.INFO, "GIF/PNG Not found: " + fileName);
			return null;
		}
		return new ImageIcon(url);
	}   //  getImageIcon2


	/***************************************************************************
	 *  Start Browser
	 *  @param url url
	 */
	public static void startBrowser (String url)
	{
		s_log.info(url);
		contextProvider.showURL(url);
	}   //  startBrowser

	/**
	 * 	Do we run on Apple
	 *	@return true if Mac
	 */
	public static boolean isMac() 
	{
		String osName = System.getProperty ("os.name");
		osName = osName.toLowerCase();
		return osName.indexOf ("mac") != -1;
	}	//	isMac

	/**
	 * 	Do we run on Windows
	 *	@return true if windows
	 */
	public static boolean isWindows()
	{
		String osName = System.getProperty ("os.name");
		osName = osName.toLowerCase();
		return osName.indexOf ("windows") != -1;
	}	//	isWindows


	/** Array of hidden Windows				*/
	private static ArrayList<CFrame>	s_hiddenWindows = new ArrayList<CFrame>();
	/** Closing Window Indicator			*/
	private static boolean 				s_closingWindows = false;

	public static Timestamp TODAY = new Timestamp(System.currentTimeMillis());

	private static DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

	private static String messageserver = null;
	private static X_A_Machine webserver = null;
	private static X_A_Machine xendrianserver = null;
	private static X_A_Machine materialserver = null;
	private static X_A_Machine replicationserver = null;
	private static X_A_Machine transferenceserver = null;
	private static Machine machine = null;

	private static Session m_session;

	private static Connection m_connection;

	private static InitialContext ic;

	private static Hashtable m_listener = new Hashtable();

	private static int m_tAcceptors = 0;

	private static List<Integer> Rules = new ArrayList<Integer>();
	private static List<Vector> ruleitems = new ArrayList<Vector>();

	private static PgNotificationPoller poller;

	private static HashMap DocStates = new HashMap();

	//private static MaterialServer materialServer;
	//private static MaterialManager materialmanager;

	/**
	 * 	Hide Window
	 *	@param window window
	 *	@return true if window is hidden, otherwise close it
	 */
	static public boolean hideWindow(CFrame window)
	{
		if (!Ini.isCacheWindow() || s_closingWindows)
			return false;
		for (int i = 0; i < s_hiddenWindows.size(); i++)
		{
			CFrame hidden = s_hiddenWindows.get(i);
			s_log.info(i + ": " + hidden);
			if (hidden.getAD_Window_ID() == window.getAD_Window_ID())
				return false;	//	already there
		}
		if (window.getAD_Window_ID() != 0)	//	workbench
		{
			if (s_hiddenWindows.add(window))
			{
				window.setVisible(false);
				s_log.info(window.toString());
				//	window.dispatchEvent(new WindowEvent(window, WindowEvent.WINDOW_ICONIFIED));
				if (s_hiddenWindows.size() > 10) {
					CFrame toClose = s_hiddenWindows.remove(0);		//	sort of lru
					try {
						s_closingWindows = true;
						toClose.dispose();
					} finally {
						s_closingWindows = false;
					}
				}
				return true;
			}
		}
		return false;
	}	//	hideWindow

	/**
	 * 	Show Window
	 *	@param AD_Window_ID window
	 *	@return true if window re-displayed
	 */
	static public CFrame showWindow (int AD_Window_ID)
	{
		for (int i = 0; i < s_hiddenWindows.size(); i++)
		{
			CFrame hidden = s_hiddenWindows.get(i);
			if (hidden.getAD_Window_ID() == AD_Window_ID)
			{
				s_hiddenWindows.remove(i);
				s_log.info(hidden.toString());
				hidden.setVisible(true);
				// De-iconify window - teo_sarca [ 1707221 ]
				int state = hidden.getExtendedState();
				if ((state & CFrame.ICONIFIED) > 0)
					hidden.setExtendedState(state & ~CFrame.ICONIFIED);
				//
				hidden.toFront();
				return hidden;
			}
		}
		return null;
	}	//	showWindow

	/**
	 * 	Clode Windows.
	 */
	static void closeWindows ()
	{
		s_closingWindows = true;
		for (int i = 0; i < s_hiddenWindows.size(); i++)
		{
			CFrame hidden = s_hiddenWindows.get(i);
			hidden.dispose();
		}
		s_hiddenWindows.clear();
		s_closingWindows = false;
	}	//	closeWindows

	/**
	 * 	Sleep
	 *	@param sec seconds
	 */
	public static void sleep (int sec)
	{
		s_log.info("Start - Seconds=" + sec);
		try
		{
			Thread.sleep(sec*1000);
		}
		catch (Exception e)
		{
			s_log.log(Level.WARNING, "", e);
		}
		s_log.info("End");
	}	//	sleep

	/**
	 * Update all windows after look and feel changes.
	 * @since 2006-11-27 
	 */
	public static Set<Window>updateUI() 
	{
		Set<Window> updated = new HashSet<Window>();
		for (Container c : s_windows)
		{
			Window w = getFrame(c);
			if (w == null) continue;
			if (updated.contains(w)) continue;
			SwingUtilities.updateComponentTreeUI(w);
			w.validate();
			RepaintManager mgr = RepaintManager.currentManager(w);
			Component childs[] = w.getComponents();
			for (Component child : childs) {
				if (child instanceof JComponent)
					mgr.markCompletelyDirty((JComponent)child);
			}
			w.repaint();
			updated.add(w);
		}
		for (Window w : s_hiddenWindows)
		{
			if (updated.contains(w)) continue;
			SwingUtilities.updateComponentTreeUI(w);
			w.validate();
			RepaintManager mgr = RepaintManager.currentManager(w);
			Component childs[] = w.getComponents();
			for (Component child : childs) {
				if (child instanceof JComponent)
					mgr.markCompletelyDirty((JComponent)child);
			}
			w.repaint();
			updated.add(w);
		}
		return updated;
	}

	/**
	 * Prepare the context for calling remote server (for e.g, ejb), 
	 * only default and global variables are pass over.
	 * It is too expensive and also can have serialization issue if 
	 * every remote call to server is passing the whole client context.
	 * @param ctx
	 * @return Properties
	 */
	public static Properties getRemoteCallCtx(Properties ctx) 
	{
		Properties p = new Properties();
		Set<Object> keys = ctx.keySet();
		for (Object key : keys) 
		{
			String s = key.toString();
			if (s.startsWith("#") || s.startsWith("$"))
			{
				p.put(key, ctx.get(key));
			}
		}

		return p;
	}

	public static Properties SetXMLToProperties(String ctx)
	{
		Properties p = new Properties();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			StringReader reader = new StringReader( ctx );			
			InputSource inputSource = new InputSource( reader);
			Document doc = builder.parse(inputSource);
			NodeList poslist = doc.getElementsByTagName("Property");
			for (int k=0; k < poslist.getLength(); k++)
			{
				Element pos = (Element) poslist.item(k);
				String key = Util.getattrStr(pos, "key");
				String value = Util.getattrStr(pos, "value");
				p.put(key, value);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return p;
	}
	/**
	 * Prepare the context for calling remote server (for e.g, ejb), 
	 * only default and global variables are pass over.
	 * It is too expensive and also can have serialization issue if 
	 * every remote call to server is passing the whole client context.
	 * @param ctx
	 * @return Properties
	 */
	public static String getRemoteContextToXML(Properties ctx) 
	{
		StringBuffer txtxml = null; // writer.getBuffer();
		try {			
			Set<Object> keys = ctx.keySet();
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument();
			TransformerFactory tFactory = TransformerFactory.newInstance();
			Element prop = document.createElement("Properties");
			document.appendChild(prop);		
			for (Object key : keys) 
			{
				String s = key.toString();
				if (s.startsWith("#") || s.startsWith("$"))
				{	
					Element property = document.createElement("Property");
					property.setAttribute("key", s);
					property.setAttribute("value", (String) ctx.get(key));
					prop.appendChild(property);
				}
			}
			DOMSource source = new DOMSource(document);
			StringWriter writer = new StringWriter();
			StreamResult result = new StreamResult(writer);												
			writer = new StringWriter();
			result = new StreamResult(writer);
			Transformer transformer = tFactory.newTransformer();
			transformer.setOutputProperty(javax.xml.transform.OutputKeys.INDENT, "yes");
			transformer.transform (source, result);
			txtxml = writer.getBuffer();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return txtxml.toString();
	}	

	/**************************************************************************
	 *  Static Variables
	 */

	/**	Big Decimal 0	 */
	static final public BigDecimal ZERO = new BigDecimal(0.0);
	/**	Big Decimal 1	 */
	static final public BigDecimal ONE = new BigDecimal(1.0);
	/**	Big Decimal 100	 */
	static final public BigDecimal ONEHUNDRED = new BigDecimal(100.0);

	static final public BigDecimal TWOHUNDREDS = new BigDecimal(200.0);

	static final public Integer divideprecision = 20;

	/**	New Line 		 */
	public static final String	NL = System.getProperty("line.separator");

	public static final String RefID = "RefID";
	/**
	 *  Static initializer
	 */
	static
	{
		//  Set English as default Language
		getCtx().put(LANGUAGE, Language.getBaseAD_Language());
		//getCtx().put(HOLON, "N");
	}   //  static

	public static X_A_Machine getServerXendrian() {
		if (xendrianserver == null)
		{
			X_A_MachineServer server = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, "ServerType = ?", null)
			.setParameters(REF_ServerType.XendrianServer).first();
			if (server != null)
			{
				X_A_Machine machine = new X_A_Machine(Env.getCtx(), server.getA_Machine_ID(), null);
				xendrianserver = machine;
			}
			//			 List<X_A_Machine> machines = getMachineByProperty("xendrianserver","true");
			//			 for (X_A_Machine machine:machines)
			//			 {
			//				xendrianserver = machine;
			//				if (xendrianserver.getA_Machine_ID() == Env.getMachine().getA_Machine_ID())
			//					break;
			//			 }
			//		}				
			//		if (xendrianserver != null && xendrianserver.getA_Machine_ID() != Env.getMachine().getA_Machine_ID())
			//			if (!IsAlive(xendrianserver))
			//				xendrianserver = null;
			//		if (xendrianserver == null)
			//		{
			//			List<X_A_Machine>  machines = new Query(Env.getCtx(), X_A_Machine.Table_Name, "IsActive = 'Y'", null).list();
			//			for (X_A_Machine machine:machines)
			//			{		
			//				if (IsAlive(machine, 6666))
			//				{					
			//					xendrianserver = machine;
			//					break;
			//				}
			//			}
		}		
		return xendrianserver;
	}

	private static boolean IsAlive(X_A_Machine webserver, int port) {
		boolean ok = false;
		try  
		{					
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress(webserver.getName(), port), 1000);
			socket.close();			
			ok = true;
		} 
		catch (Exception e)
		{
			// 
		}				
		return ok;
	}

	private static boolean IsAlive(X_A_Machine webserver) {
		boolean ok = false;
		try  
		{					
			ok = IsAlive(webserver, 8080);
			if (ok)
			{
				String url = String.format("http://%s:%s/plugin?type=alive", webserver.getName(),8080);
				OkHttpClient client = new OkHttpClient();
				Request request = new Request.Builder().url(url).build();
				try {
					Response response = client.newCall(request).execute();
					String result = response.body().string();
					XmlIO io = new XmlIO();
					io.load(new ByteArrayInputStream(result.getBytes("UTF-8")));
					String dbname = io.getRoot().getElement("info").getElement("databasename").getData();
					String dbhost = io.getRoot().getElement("info").getElement("databasehost").getData();
					String version = io.getRoot().getElement("info").getElement("version").getData();
					if (version.equals(Xendra.DATE_VERSION))
					{
						CConnection m_cc = CConnection.get();
						if ( m_cc.getDbHost().equals(dbhost) && m_cc.getDbName().equals(dbname))
						{
							ok = true;
						}
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		} 
		catch (Exception e)
		{
			// 
		}				
		return ok;
	}
	public static void setServerMaterial(X_A_Machine machine) {
		materialserver = machine;
	}
	public static X_A_Machine getServerMaterial() {		
		if (materialserver == null) 
		{
			X_A_MachineServer server = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, "ServerType = ?", null)
			.setParameters(REF_ServerType.MaterialServer).first();
			if (server != null)
			{
				X_A_Machine machine = new X_A_Machine(Env.getCtx(), server.getA_Machine_ID(), null);
				materialserver = machine;
			}			
		}		
		return materialserver;
	}

	public static X_A_Machine getserverTransference() {
		if (transferenceserver == null)
		{
			X_A_MachineServer server = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, "ServerType = ?", null)
			.setParameters(REF_ServerType.TransferenceServer).first();
			if (server != null)
			{
				X_A_Machine machine = new X_A_Machine(Env.getCtx(), server.getA_Machine_ID(), null);
				transferenceserver = machine;				
			}
		}
		return transferenceserver;
	}
	public static X_A_Machine getServerReplication() {
		if (replicationserver == null)
		{
			X_A_MachineServer server = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, "ServerType = ?", null)
			.setParameters(REF_ServerType.ReplicationServer).first();
			if (server != null)
			{
				X_A_Machine machine = new X_A_Machine(Env.getCtx(), server.getA_Machine_ID(), null);
				replicationserver = machine;
			}
		}
		return replicationserver; 
	}

	public static X_A_Machine getServerWeb() {
		if (webserver == null)
		{
			X_A_MachineServer server = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, "ServerType = ?", null)
			.setParameters(REF_ServerType.WebServer).first();
			if (server != null)
			{
				X_A_Machine webmachine = new Query(Env.getCtx(), X_A_Machine.Table_Name, "A_Machine_ID = ?", null)
				.setParameters(server.getA_Machine_ID()).first();
				if (webmachine != null) 
					webserver = webmachine;				
			}
		}
		return webserver;
	}

	public static int getServerWebPort() {
		int port = 0;
		X_A_MachineServer server = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, "ServerType = ?", null)
		.setParameters(REF_ServerType.WebServer).first();
		if (server != null)
		{
			port = server.getHostPort();
		}		
		return port;
	}

	public static List<X_A_Machine> getMachineByProperty(String property, String value)
	{
		List<X_A_Machine> retval = null;
		String query = String.format("properties->'%s' = '%s' AND IsActive = 'Y'",property, value);
		retval = new Query(Env.getCtx(), X_A_Machine.Table_Name, query, null).list();
		return retval;
	}	

	public static Machine getMachine() {		
		if (machine == null)
		{			
			X_A_Machine current = new Query(Env.getCtx(), X_A_Machine.Table_Name, "Mac_Address = ? AND IsActive = 'Y'", null)
			.setParameters(Util.getLocalMacAddress()).first();

			if (current == null)
			{
				current = new Machine(Env.getCtx(), 0, null);
				current.setAD_Org_ID(0);
				current.set_ValueOfColumn(Constants.COLUMNNAME_AD_Client_ID, 0);
				current.setName(Util.getLocalHostName());
				current.setMac_Address(Util.getLocalMacAddress());				
				current.save();				
			}			
			if (!current.isLockout()) {
				if (current.getName().compareTo(Util.getLocalHostName()) != 0)
				{
					current.setName(Util.getLocalHostName());
					current.save();
				}
			}
			machine = new Machine(Env.getCtx(), current.getA_Machine_ID(), null);
			ValidateDirectories(machine);
		}
		return machine;
	}

	public static void ValidateDirectories(Machine machine) {
		ValidateDirectories(machine, false);
	}

	public static void ValidateDirectories(Machine machine, boolean server) {

		HashMap props = machine.getProperties();		

		if (server)
		{
			Ini.getXendraFolder(Constants.TRASH, true);
			if (!props.containsKey(Constants.TRASH))
				props.put(Constants.TRASH, Ini.getXendraFolder(Constants.TRASH));

			Ini.getXendraFolder(Constants.REPLICATION, true);
			if (!props.containsKey(Constants.REPLICATION))
				props.put(Constants.REPLICATION, Ini.getXendraFolder(Constants.REPLICATION));
			
		}
		
		Ini.getXendraFolder(Constants.KEYSTORE, true);
		if (!props.containsKey(Constants.KEYSTORE))
			props.put(Constants.KEYSTORE, Ini.getXendraFolder(Constants.KEYSTORE));
		
		Ini.getXendraFolder(Constants.REPORTS, true);
		if (!props.containsKey(Constants.REPORTS))
			props.put(Constants.REPORTS, Ini.getXendraFolder(Constants.REPORTS));

		//		Ini.getXendraFolder(Constants.COREPLUGINS, true);
		//		if (!props.containsKey(Constants.COREPLUGINS))
		//			props.put(Constants.COREPLUGINS, Ini.getXendraFolder(Constants.COREPLUGINS));
		Ini.getXendraFolder(Constants.PLUGINS, true);
		if (!props.containsKey(Constants.PLUGINS))
			props.put(Constants.PLUGINS, Ini.getXendraFolder(Constants.PLUGINS));


		Ini.getXendraFolder(Constants.PLUGINS, true);
		if (!props.containsKey(Constants.PLUGINS))
			props.put(Constants.PLUGINS, Ini.getXendraFolder(Constants.PLUGINS));

		Ini.getXendraFolder(Constants.XENDRIAN, true);
		if (!props.containsKey(Constants.XENDRIAN))
			props.put(Constants.XENDRIAN, Ini.getXendraFolder(Constants.XENDRIAN));					

		Ini.getXendraFolder(Constants.STORE, true);
		if (!props.containsKey(Constants.STORE))
			props.put(Constants.STORE, Ini.getXendraFolder(Constants.STORE));					

		//		Ini.getXendraFolder(Constants.COREINSTALLED, true);					
		//		if (!props.containsKey(Constants.COREINSTALLED))
		//			props.put(Constants.COREINSTALLED, Ini.getXendraFolder(Constants.COREINSTALLED));

		Ini.getXendraFolder(Constants.INSTALLED, true);
		if (!props.containsKey(Constants.INSTALLED))
			props.put(Constants.INSTALLED, Ini.getXendraFolder(Constants.INSTALLED));																

		machine.setProperties(props);		
		machine.save();
	}

	public static String getMessageHost() {
		System.out.println("entrando a Env.getMessageHost()");
		if (messageserver == null)
		{
			X_A_Machine machine = new Query(Env.getCtx(), X_A_Machine.Table_Name, X_A_Machine.COLUMNNAME_IsServerMessage+" = 'Y'", null)
			.first();
			if (machine != null)
			{
				messageserver = machine.getName();
			}
			else
			{
				machine = new Query(Env.getCtx(), X_A_Machine.Table_Name, "mac_address = ?", null)
				.setParameters(Util.getLocalMacAddress()).first();
				if (machine != null)
					messageserver = machine.getName();
			}
		}
		System.out.println("server message is ->"+messageserver);
		return messageserver;
	}

	public static boolean isServerEmbedded() {
		return true;
	}

	//	public static void addqueuename(String queuename) {
	//		m_queuenames.add(queuename);		
	//	}

	public static void addlistener(String queuename, String listenerclass, int m_AD_Rule_ID) {
		Vector vector = new Vector();
		//vector.add(queuename);
		vector.add(listenerclass);
		vector.add(m_AD_Rule_ID);
		if (!m_listener.containsKey(queuename))
			m_listener.put(queuename, vector);				
	}	
	public static Hashtable getlistener()
	{
		return m_listener;
	}

	public static void setAcceptors(int tacceptors) {
		m_tAcceptors = tacceptors;		
	}

	public static String getResource(String packname, String resource) {		
		//String pluginpath = (String) Env.getMachine().getProperties().get(Constants.PLUGINS);        
		//String respath = packname + File.separator + "resource" + File.separator;		
		//return pluginpath + File.separator + respath + resource;
		return getResource(packname, "resource", resource, null);
	}

	public static String getResource(String packname, String resource, String subfolder) {
		return getResource(packname, "resource", resource, subfolder);
	}

	public static String getResource(String packname, String folder, String resource, String subfolder) {		
		String pluginpath = (String) Env.getMachine().getProperties().get(Constants.PLUGINS);        
		String respath = packname + File.separator + folder + File.separator ;
		if (subfolder != null && subfolder.length() > 0)
			respath = respath + subfolder + File.separator;
		return pluginpath + File.separator + respath +  resource; 
	}

	public static void addPrinterNotification(PgNotificationListener server, String listen) {
		if (poller == null)
		{
			poller = new PgNotificationPoller(CConnection.get().getConnectionURL(), CConnection.get().getDbUid(), CConnection.get().getDbPwd());	
			((PgNotificationPoller) poller).start();			
		}
		((PgNotificationPoller) poller).addNotificationListener(server);
		((PgNotificationPoller) poller).setPgNotificationExceptionListener((PgNotificationExceptionListener) server);
		((PgNotificationPoller) poller).listen(listen);

	}

	public static Integer getPoolClient() {
		int value = 50;
		String val = Ini.getProperty(Constants.DBPOOLCLIENT);
		if (val.length()==0)
		{			
			Ini.setProperty(Constants.DBPOOLCLIENT, String.valueOf(value));
			Ini.saveProperties(true);
		}
		else
		{
			value = Integer.valueOf(val);
		}
		return value;
	}

	public static Integer getPoolServer() {
		int value = 200;
		String val = Ini.getProperty(Constants.DBPOOLSERVER);
		if (val.length()==0)
		{			
			Ini.setProperty(Constants.DBPOOLSERVER, String.valueOf(value));
			Ini.saveProperties(true);
		}
		else
		{
			value = Integer.valueOf(val);
		}
		return value;
	}

	public static void getMaterialManager(MClient m_client, int frequencystart) {		
		MaterialManager.getInstance().get(m_client, frequencystart);
		//materialmanager = MaterialManager.get(m_client);		
	}

	public static HashMap getstates(int m_AD_Table_ID) {
		HashMap docstates = (HashMap) DocStates.get(m_AD_Table_ID);
		if (docstates == null)
		{
			List<X_AD_Document> documents = new Query(Env.getCtx(), X_AD_Document.Table_Name, "AD_Table_ID = ? ", null)
			.setParameters(m_AD_Table_ID).list();
			HashMap state = new HashMap();
			for (X_AD_Document document:documents)
			{					
				if (!state.containsKey(document.getDocStatus()))
				{
					List<String> nextstates = new ArrayList<String>();
					nextstates.add(document.getNextStatus());
					state.put(document.getDocStatus(), nextstates);
				}					
				else
				{
					List<String>  nextstates = (List<String>) state.get(document.getDocStatus());
					if (!nextstates.contains(document.getNextStatus()))
					{
						nextstates.add(document.getNextStatus());
						state.put(document.getDocStatus(), nextstates);
					}							
				}
			}
			DocStates.put(m_AD_Table_ID, state);
			docstates = (HashMap) DocStates.get(m_AD_Table_ID);
		}					
		return docstates;
	}
}   //  Env