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
package org.compiere.db;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import javax.swing.JOptionPane;

import org.compiere.Xendra;
import org.compiere.interfaces.Status;
import org.compiere.util.CLogMgt;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.compiere.util.Ini;
import org.compiere.util.Util;

/**
 *  Xendra Connection Descriptor
 *
 *  @author     Jorg Janke
 *  @author     Marek Mosiewicz<marek.mosiewicz@jotel.com.pl> - support for RMI over HTTP
 *  @author  	xapiens, replacing RMI by JMS
 *  @version    $Id: CConnection.java 5762 2016-02-18 02:16:12Z xapiens $
 */
public class CConnection implements Serializable, Cloneable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7893119456331485444L;
	/** Connection      */
	private static CConnection	s_cc = null;
	/** Logger			*/
	private static CLogger 		log = CLogger.getCLogger (CConnection.class);

	private final static String COMPONENT_NS = "java:comp/env";

	/** Prefer component namespace when running at server **/
	private boolean useComponentNamespace = !Ini.isClient();

	/** System property flag to embed server bean in process **/
	public final static String SERVER_EMBEDDED = "org.adempiere.server.embedded";

	/**
	 *  Get/Set default client/server Connection
	 *  @return Connection Descriptor
	 */
	public static CConnection get ()
	{
		return get(null);
	}	//	get

	/**
	 *  Get/Set default client/server Connection
	 *  @param apps_host optional apps host for new connections
	 *  @return Connection Descriptor
	 */
	public static CConnection get (String apps_host)
	{
		if (s_cc == null)
		{
			String attributes = Ini.getProperty (Ini.P_CONNECTION);
			if (attributes == null || attributes.length () == 0)
			{
				s_cc = new CConnection (null);
				s_cc.setAttributes (attributes);				
				try  
				{
					Exception e = s_cc.testDatabase(true);
				}
				catch (Exception e)
				{				
					attributes = null;
				}				
				
			}
			if (attributes == null || attributes.length () == 0)
			{
				//hengsin, zero setup for webstart client
				CConnection cc = null;
				//if (apps_host != null && 
				//		Xendra.isWebStartClient() && 
				//		!CConnection.isServerEmbedded() )
				//{
					cc = new CConnection(apps_host);
					//cc.setConnectionProfile(CConnection.PROFILE_LAN);
					//cc.setAppsPort(ASFactory.getApplicationServer().getDefaultNamingServicePort());
					cc.setAppsPort(1099);
					if (cc.testAppsServer() == null)
					{
						s_cc = cc;
						if (s_cc.isDatabaseOK())
						{
							Ini.setProperty(Ini.P_CONNECTION, cc.toStringLong());
							Ini.saveProperties(Ini.isClient());
						}
					}
				//}
				if (s_cc == null)
				{
					if (cc == null) cc = new CConnection(apps_host);
					CConnectionDialog ccd = new CConnectionDialog (cc);
					s_cc = ccd.getConnection ();
					if (!s_cc.isDatabaseOK() && !ccd.isCancel()) {
						s_cc.testDatabase(true);
					}
					//  set also in ALogin and Ctrl
					Ini.setProperty (Ini.P_CONNECTION, s_cc.toStringLong ());
					Ini.saveProperties (Ini.isClient ());
				}
			}
			else
			{
				s_cc = new CConnection (null);
				s_cc.setAttributes (attributes);
			}
			log.fine(s_cc.toString());
		}

		return s_cc;
	} 	//  get

	/**
	 *  Get specific client connection
	 *  @param type database Type, e.g. Database.DB_ORACLE
	 *  @param db_host db host
	 *  @param db_port db port
	 *  @param db_name db name
	 *  @param db_uid db user id
	 *  @param db_pwd db user password
	 *  @return connection
	 */
	public static CConnection get (String db_host, int db_port,  String db_name, String db_uid, String db_pwd)
	{
		CConnection cc = new CConnection (db_host);
		cc.setAppsHost (db_host); //  set Apps=DB
		cc.setDbHost (db_host);
		cc.setDbPort (db_port);
		cc.setDbName (db_name);
		//
		if (db_uid != null)
			cc.setDbUid (db_uid);
		if (db_pwd != null)
			cc.setDbPwd (db_pwd);
		s_cc = cc;
		Ini.setProperty(Ini.P_CONNECTION, cc.toStringLong());
		//Ini.saveProperties(Ini.isClient());
		return cc;
	}	//  get
	
	/**
	 *  Get specific client connection
	 *  @param type database Type, e.g. Database.DB_ORACLE
	 *  @param db_host db host
	 *  @param db_port db port
	 *  @param db_name db name
	 *  @param db_uid db user id
	 *  @param db_pwd db user password
	 *  @return connection
	 */
//	//public static CConnection get (String db_host, int db_port, String db_name, String db_uid, String db_pwd, String POS_Queue, String POS_QueueUser)
//	public static CConnection get (String db_host, int db_port, String db_name, String db_uid, String db_pwd)
//	{		
//		CConnection cc = new CConnection (db_host);
//		cc.setAppsHost (db_host); //  set Apps=DB
//		cc.setDbHost (db_host);
//		cc.setDbPort (db_port);
//		cc.setDbName (db_name);
//		//cc.setPoolServer(POS_Queue);
//		cc.setPoolServer(POS_Queue);
//		cc.setPoolClient(POS_QueueUser);
//		//
//		if (db_uid != null)
//			cc.setDbUid (db_uid);
//		if (db_pwd != null)
//			cc.setDbPwd (db_pwd);
//		return cc;
//	}	//  get
//


	/**************************************************************************
	 *  Xendra Connection
	 *  @param	host optional application/db host
	 */
	public CConnection (String host)
	{
		if (host != null)
		{
			m_apps_host = host;
			m_db_host = host;
		}
	} 	//  CConnection
	
	

	/** Default jboss port **/
	private final static int DEFAULT_APP_SERVER_PORT = 1099;
	
	/** Name of Connection  */
	private String 		m_name = "Standard";

	/** Application Host    */
	private String 		m_apps_host = "";
	/** Application Port    */
	private int 		m_apps_port = DEFAULT_APP_SERVER_PORT;

	///** Database Type       */
	//private String 		m_type = "";

	/** Database Host       */
	private String 		m_db_host = Util.getLocalHostName();
	/** Database Port       */
	private int m_db_port = 5432;
	/** Database name       */
	private String 		m_db_name = "xendra";
	
	//private String      m_poolServer = "200";
	
	//private String      m_poolClient = "20";

	/** DB User name        */
	private String 		m_db_uid = "xendra";
	/** DB User password    */
	private String 		m_db_pwd = "xendra";

	/** Database            */
	private XendraDatabase m_db = null;
	/** ConnectionException */
	private Exception 	m_dbException = null;
	private Exception 	m_appsException = null;

	/** Database Connection 	*/
	private boolean 	m_okDB = false;
	/** Apps Server Connection  */
	private boolean 	m_okApps = false;

	/** Info                */
	private String[] 	m_info = new String[2];

	/**	Server Version		*/
	private String 		m_version = null;

	/** DataSource      	*/
	private DataSource	m_ds = null;
	/**	Server Session		*/
	//private Server		m_server = null;
	/** DB Info				*/
	private String		m_dbInfo = null;

	/** Had application server been query **/
	private boolean m_queryAppsServer = false;

	private final static String SECURITY_PRINCIPAL = "org.adempiere.security.principal";

	/*************************************************************************
	 *  Get Name
	 *  @return connection name
	 */
	public String getName ()
	{
		return m_name;
	}

	/**
	 *  Set Name
	 *  @param name connection name
	 */
	public void setName (String name)
	{
		m_name = name;
	}	//  setName

	/**
	 *  Set Name
	 */
	protected void setName ()
	{
		m_name = toString ();
	} 	//  setName


	/*************
	 *  Get Application Host
	 *  @return apps host
	 */
	public String getAppsHost ()
	{
		return m_apps_host;		
	}

	/**
	 *  Set Application Host
	 *  @param apps_host apps host
	 */
	public void setAppsHost (String apps_host)
	{
		//Ini.setProperty(Ini.P_MESSAGEHOST, apps_host);
//		MOrg org = MOrg.get(Env.getCtx(), Env.getAD_Org_ID(Env.getCtx()));
//		org.setMessageHost(apps_host);
//		org.save();
		//
		m_apps_host = apps_host;
		m_name = toString ();
		m_okApps = false;
		m_queryAppsServer = false;
	}

//	/**
//	 * Get Apps Port
//	 * @return port
//	 */
//	public int getAppsPort ()
//	{
//		return m_apps_port;
//	}

	/**
	 * Set Apps Port
	 * @param apps_port apps port
	 */
	public void setAppsPort (int apps_port)
	{
		m_apps_port = apps_port;
		m_okApps = false;
		m_queryAppsServer = false;
	}

	/**
	 * 	Set Apps Port
	 * 	@param apps_portString appd port as String
	 */
	public void setAppsPort (String apps_portString)
	{
		try
		{
			if (apps_portString == null || apps_portString.length() == 0)
				;
			else
				setAppsPort (Integer.parseInt (apps_portString));
		}
		catch (Exception e)
		{
			log.severe(e.toString ());
		}
	} 	//  setAppsPort

	/**
	 *  Is Application Server OK
	 *  @param tryContactAgain try to contact again
	 *  @return true if Apps Server exists
	 */
	public boolean isAppsServerOK (boolean tryContactAgain)
	{
		if (isServerEmbedded())
			return true;
		
		if (Ini.isClient() && !tryContactAgain && m_queryAppsServer)
			return m_okApps;

		// Carlos Ruiz - globalqss - speed up when jnp://MyAppsServer:1099 is set
		if (getAppsHost().equalsIgnoreCase("MyAppsServer")) {
			log.warning (getAppsHost() + " ignored");
			return false;
		}

		m_queryAppsServer = true;

		//	Contact it
		try
		{
			//Status status = (Status)lookup (Status.JNDI_NAME);
			//ConnectToHolon();
			//m_version = status.getDateVersion ();
			//m_okApps = true;
		}
		catch (Exception ce)
		{
			m_okApps = false;
			String connect = (String)m_env.get(Context.PROVIDER_URL);
			if (connect == null || connect.trim().length() == 0)
				connect = getAppsHost() + ":" + Util.getAppsPort();
			log.warning (connect
				+ "\n - " + ce.toString ()
				+ "\n - " + m_env);
			ce.printStackTrace();
		}
		catch (Throwable t)
		{
			m_okApps = false;
			String connect = (String)m_env.get(Context.PROVIDER_URL);
			if (connect == null || connect.trim().length() == 0)
				connect = getAppsHost() + ":" + Util.getAppsPort();
			log.warning (connect
				+ "\n - " + t.toString ()
				+ "\n - " + m_env);
			t.printStackTrace();
		}
		return m_okApps;
	} 	//  isAppsOK

	/**
	 *  Test ApplicationServer
	 *  @return Exception or null
	 */
	public synchronized Exception testAppsServer ()
	{
		queryAppsServerInfo();
		return getAppsServerException ();
	} 	//  testAppsServer

//	public Server getServer()
//	{
//		return null;
//		//return getServer(null);
//	}
//	/**
//	 * 	Get Server
//	 * 	@return Server
//	 */
//	public Server getServer(String name)
//	{
//		//only cache ServerHome for client
//		if (m_server == null || !Ini.isClient())
//		{
//			if (isServerEmbedded())
//			{
//				m_server = (Server)Proxy.newProxyInstance(Server.class.getClassLoader(),
//						new Class[]{Server.class}, new EmbeddedServerProxy());
//				return m_server;
//			}
//
//			try
//			{
//				Server server =  null;
//				if (name != null)
//					server = (Server)lookup(name);
//				else
//					server = (Server)lookup (Server.JNDI_NAME);
//				
//				if (server != null)
//					if (Ini.isClient())
//						m_server = server;
//					else
//						return server;
//			}
//			catch (Exception ex)
//			{
//				log.log(Level.SEVERE, "", ex);
//				m_iContext = null;
//				throw new RuntimeException(ex);
//			}
//		}
//		return m_server;
//	}	//	getServer


	/**
	 *  Get Apps Server Version
	 *  @return db host name
	 */
	public String getServerVersion ()
	{
		return m_version;
	}	//	getServerVersion


	/*************
	 *  Get Database Host name
	 *  @return db host name
	 */
	public String getDbHost ()
	{
		String db_host;
		db_host = m_db_host;
		return db_host;
	}	//	getDbHost
		
	/**
	 *  Set Database host name
	 *  @param db_host db host
	 */
	public void setDbHost (String db_host)
	{
		m_db_host = db_host;
		m_name = toString ();
		m_okDB = false;
	}	//	setDbHost

	/**
	 *  Get Database Name (Service Name)
	 *  @return db name
	 */
	public String getDbName ()
	{
		return m_db_name;
	}	//	getDbName	

//	public String getPoolServer() {
//		return m_poolServer;
//	}	
//
//	public String getPoolClient() {
//		return m_poolClient;
//	}
	/**
	 *  Set Database Name (Service Name)
	 *  @param db_name db name
	 */
	public void setDbName (String db_name)
	{
		m_db_name = db_name;
		m_name = toString ();
		m_okDB = false;
	}	//	setDbName

	/**
	 * 	Get DB Port
	 * 	@return port
	 */
	public int getDbPort ()
	{
		return m_db_port;
	}	//	getDbPort

	/**
	 * Set DB Port
	 * @param db_port db port
	 */
	public void setDbPort (int db_port)
	{
		m_db_port = db_port;
		m_okDB = false;
	}	//	setDbPort

	/**
	 * Set DB Port
	 * @param db_portString db port as String
	 */
	public void setDbPort (String db_portString)
	{
		try
		{
			if (db_portString == null || db_portString.length() == 0)
				;
			else
				setDbPort (Integer.parseInt (db_portString));
		}
		catch (Exception e)
		{
			log.severe(e.toString ());
		}
	} 	//  setDbPort

	
	/**
	 *  Get Database Password
	 *  @return db password
	 */
	public String getDbPwd ()
	{
		return m_db_pwd;
	}	//	getDbPwd

	/**
	 *  Set DB password
	 *  @param db_pwd db user password
	 */
	public void setDbPwd (String db_pwd)
	{
		m_db_pwd = db_pwd;
		m_okDB = false;
	}	//	setDbPwd

	/**
	 *  Get Database User
	 *  @return db user
	 */
	public String getDbUid ()
	{
		return m_db_uid;
	}	//	getDbUid

	/**
	 *  Set Database User
	 *  @param db_uid db user id
	 */
	public void setDbUid (String db_uid)
	{
		m_db_uid = db_uid;
		m_name = toString ();
		m_okDB = false;
	}	//	setDbUid

	/**
	 *  Supports BLOB
	 *  @return true if BLOB is supported
	 */
	public boolean supportsBLOB ()
	{
		return m_db.supportsBLOB ();
	} //  supportsBLOB

	/**
	 *  Is Database Connection OK
	 *  @return true if database connection is OK
	 */
	public boolean isDatabaseOK ()
	{
		return m_okDB;
	} 	//  isDatabaseOK

	/**************************************************************************
	 *  Create DB Connection
	 * @return data source != null
	 */
	public boolean setDataSource()
	{
	//	System.out.println ("CConnection.setDataSource - " + m_ds + " - Client=" + Ini.isClient());
		if (m_ds == null && Ini.isClient())
		{
			if (getDatabase() != null)	//	no db selected
				m_ds = getDatabase().getDataSource(this);
		//	System.out.println ("CConnection.setDataSource - " + m_ds);
		}
		return m_ds != null;
	} 	//	setDataSource

	/**
	 * 	Set Data Source
	 *	@param ds data source
	 *	@return data source != null
	 */
	public boolean setDataSource(DataSource ds)
	{
		if (ds == null && m_ds != null)
			getDatabase().close();
		m_ds = ds;
		return m_ds != null;
	} 	//	setDataSource

	/**
	 *  Get Server Connection
	 *  @return DataSource
	 */
	public DataSource getDataSource ()
	{
		return m_ds;
	} 	//	getDataSource

	/**
	 *  Has Server Connection
	 *  @return true if DataSource exists
	 */
	public boolean isDataSource ()
	{
		return m_ds != null;
	} 	//	isDataSource


	/**************************************************************************
	 *  Test Database Connection.
	 *  -- Example --
	 *  Database: PostgreSQL - 7.1.3
	 *  Driver:   PostgreSQL Native Driver - PostgreSQL 7.2 JDBC2
	 *  -- Example --
	 *  Database: Oracle - Oracle8i Enterprise Edition Release 8.1.7.0.0 - Production With the Partitioning option JServer Release 8.1.7.0.0 - Production
	 *  Driver:   Oracle JDBC driver - 9.0.1.1.0
	 *  @param retest
	 *  @return Exception or null
	 */
	public Exception testDatabase(boolean retest)
	{
		if (!retest && m_ds != null && m_okDB)
			return null;

		getDatabase().close();
		m_ds = null;
		if (setDataSource())
		{
			//  the actual test
			Connection conn = getConnection (true, 	Connection.TRANSACTION_READ_COMMITTED);
			if (conn != null)
			{
				try
				{
					readInfo(conn);
					conn.close ();
				}
				catch (Exception e)
				{
					log.severe (e.toString());
					return e;
				}
			}
		}
		else
		{
			m_dbException = new Exception();
		}
		return m_dbException; //  from opening
	} 	//  testDatabase

	public void readInfo(Connection conn) throws SQLException {
		DatabaseMetaData dbmd = conn.getMetaData ();
		m_info[0] = "Database=" + dbmd.getDatabaseProductName ()
					+ " - " + dbmd.getDatabaseProductVersion ();
		m_info[0] = m_info[0].replace ('\n', ' ');
		m_info[1] = "Driver  =" + dbmd.getDriverName ()
					+ " - " + dbmd.getDriverVersion ();
		if (isDataSource())
			m_info[1] += " - via DataSource";
		m_info[1] = m_info[1].replace ('\n', ' ');
		log.config(m_info[0] + " - " + m_info[1]);
	}

	/*************************************************************************
	 *  Short String representation
	 *  @return appsHost{dbHost-dbName-uid}
	 */
	public String toString ()
	{
		StringBuffer sb = new StringBuffer (m_apps_host);
		sb.append ("{").append (m_db_host)
		  .append ("-").append (m_db_name)
		  .append ("-").append (m_db_uid)
		  .append ("}");
		return sb.toString ();
	} 	//  toString

	/**
	 * 	Detail Info
	 *	@return info
	 */
	public String toStringDetail ()
	{
		StringBuffer sb = new StringBuffer (m_apps_host);
		sb.append ("{").append (m_db_host)
		  .append ("-").append (m_db_name)
		  .append ("-").append (m_db_uid)
		  .append ("}");
		//
		Connection conn = getConnection (true,
			Connection.TRANSACTION_READ_COMMITTED);
		if (conn != null)
		{
			try
			{
				DatabaseMetaData dbmd = conn.getMetaData ();
				sb.append("\nDatabase=" + dbmd.getDatabaseProductName ()
							+ " - " + dbmd.getDatabaseProductVersion());
				sb.append("\nDriver  =" + dbmd.getDriverName ()
							+ " - " + dbmd.getDriverVersion ());
				if (isDataSource())
					sb.append(" - via DS");
				conn.close ();
			}
			catch (Exception e)
			{
			}
		}
		conn = null;
		return sb.toString ();
	} 	//  toStringDetail

	/**
	 * 	Get DB Version Info
	 *	@return info
	 */
	public String getDBInfo()
	{
		if (m_dbInfo != null)
			return m_dbInfo;
		StringBuffer sb = new StringBuffer ();
		Connection conn = getConnection (true,
			Connection.TRANSACTION_READ_COMMITTED);
		if (conn != null)
		{
			try
			{
				DatabaseMetaData dbmd = conn.getMetaData ();
				sb.append(dbmd.getDatabaseProductVersion())
					.append(";").append(dbmd.getDriverVersion());
				if (isDataSource())
					sb.append(";DS");
				conn.close ();
				m_dbInfo = sb.toString ();
			}
			catch (Exception e)
			{
				log.log(Level.SEVERE, "", e);
				sb.append(e.getLocalizedMessage());
			}
		}
		conn = null;
		return sb.toString();
	} 	//  toStringDetail


	/**
	 *  String representation.
	 *  Used also for Instanciation
	 *  @return string representation
	 *	@see #setAttributes(String) setAttributes
	 */
	public String toStringLong ()
	{
		StringBuffer sb = new StringBuffer ("CConnection[");
		sb.append ("name=").append (m_name)
		  .append (",AppsHost=").append (m_apps_host)
		  .append (",AppsPort=").append (m_apps_port)
		  .append (",DBhost=").append (m_db_host)
		  .append (",DBport=").append (m_db_port)
		  .append (",DBname=").append (m_db_name)
		  .append (",UID=").append (m_db_uid)
		  .append (",PWD=").append (m_db_pwd)
		  //.append (",POOLServer=").append(m_poolServer)
		  //.append (",POOLClient=").append(m_poolClient)
		  ;		//	the format is read by setAttributes
		sb.append ("]");
		return sb.toString ();
	}	//  toStringLong

	/**
	 *  Set Attributes from String (pares toStringLong())
	 *  @param attributes attributes
	 */
	public void setAttributes (String attributes)
	{
		if (attributes == null || attributes.length() == 0)
			return;
		try
		{
			List<String> attribute = new ArrayList<String>();
			if (attributes.endsWith("]"));
				attributes = attributes.substring(0, attributes.length() - 1);
			StringTokenizer tok = new StringTokenizer(attributes, ",");
			while (tok.hasMoreTokens()) {
				String t = tok.nextToken();
				attribute.add(t);
			}			
	        //String[] attribute = ParserUtil.getArrayOfString();
	        for (String val:attribute)
	        {
				StringTokenizer st = new StringTokenizer(val, "=");
				while (st.hasMoreTokens())
				{
					String name = st.nextToken().toLowerCase().trim();
					if (name.length() == 0)
						continue;					
					else if (name.equals("dbhost"))
					{
						String value = st.nextToken().trim();
						setDbHost(value);
					}
					else if (name.equals("dbport"))
					{
						String value = st.nextToken().trim();
						setDbPort(value);						
					}
					else if (name.equals("dbname"))
					{
						String value = st.nextToken().trim();
						setDbName(value);						
					}					
					else if (name.equals("uid"))
					{
						String value = st.nextToken().trim();
						setDbUid(value);												
					}
					else if (name.equals("pwd"))
					{
						String value = st.nextToken().trim();
						setDbPwd(value);												
					}
//					else if (name.equals("poolserver"))
//					{
//						String value = st.nextToken().trim();
//						value = value.replaceAll("\\D+","");
//						setPoolServer(value);																		
//					}
//					else if (name.equals("poolclient"))
//					{
//						String value = st.nextToken().trim();
//						value = value.replaceAll("\\D+","");
//						setPoolClient(value);																		
//					}					
				}
	        }
//			setName (attributes.substring (attributes.indexOf ("name=") + 5, attributes.indexOf (",AppsHost=")));
//			int index = attributes.indexOf("AppsPort=");
			setAppsPort(1099);
//			setDbHost (attributes.substring (attributes.indexOf ("DBhost=") + 7, attributes.indexOf (",DBport=")));
//			setDbPort (attributes.substring (attributes.indexOf ("DBport=") + 7, attributes.indexOf (",DBname=")));
//			setDbName (attributes.substring (attributes.indexOf ("DBname=") + 7, attributes.indexOf (",UID=")));
//			setDbUid (attributes.substring (attributes.indexOf ("UID=") + 4, attributes.indexOf (",PWD=")));
//			setDbPwd (attributes.substring (attributes.indexOf ("PWD=") + 4, attributes.indexOf (",POOLServer")));
//			setPoolServer(attributes.substring (attributes.indexOf ("POOLServer=") + 11, attributes.indexOf (",POOLClient")));			
//			String poolclient = attributes.substring (attributes.indexOf ("POOLClient=") + 11, attributes.indexOf ("]"));
//			if (poolclient.length() == 0)
//			{
//				System.out.println("X");
//			}
//			setPoolClient(poolclient);
			//
		}
		catch (Exception e)
		{
			log.severe(attributes + " - " + e.toString ());
		}
	}	//  setAttributes

	/**
	 *  Equals
	 *  @param o object
	 *  @return true if o equals this
	 */
	public boolean equals (Object o)
	{
		if (o instanceof CConnection)
		{
			CConnection cc = (CConnection)o;
			if (cc.getAppsHost().equals (m_apps_host)
			  && Util.getAppsPort() == m_apps_port
			  && cc.getDbHost().equals (m_db_host)
			  && cc.getDbPort() == m_db_port
			  && cc.getDbName().equals(m_db_name)
			  && cc.getDbUid().equals(m_db_uid)
			  && cc.getDbPwd().equals(m_db_pwd))
				return true;
		}
		return false;
	}	//  equals

	/**
	 *  Get Info.
	 *  - Database, Driver, Status Info
	 *  @return info
	 */
	public String getInfo ()
	{
		StringBuffer sb = new StringBuffer (m_info[0] != null ? m_info[0] : "");
		sb.append (" - ").append (m_info[1] != null ? m_info[1] : "")
		  .append ("\n").append (getDatabase ().toString ())
		  .append ("\nAppsServerOK=").append (isAppsServerOK (false))
		  .append (", DatabaseOK=").append (isDatabaseOK ());
		return sb.toString ();
	}	//  getInfo


	/*************************************************************************
	 *  Hashcode
	 *  @return hashcode of name
	 */
	public int hashCode ()
	{
		return m_name.hashCode ();
	} 	//  hashCode

	/**
	 *  Get Database
	 *  @return database
	 */
	public XendraDatabase getDatabase ()
	{
		if (m_db == null)
		{
			try
			{
				m_db = (XendraDatabase) DB_PostgreSQL.class.newInstance();
		         if (m_db != null)		//	test class loader ability
		        	 m_db.getDataSource(this);
			}
			catch (NoClassDefFoundError ee)
			{
				System.err.println("Environment Error - Check Xendra.properties - " + ee);
				if (Ini.isClient())
				{
					if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog
						(null, "There is a configuration error:\n" + ee
							+ "\nDo you want to reset the saved configuration?",
							"Xendra Configuration Error",
							JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE))
						Ini.deletePropertyFile();
				}
				System.exit (1);
			}
			catch (Exception e)
			{
				log.severe(e.toString ());
			}
		}
		return m_db;
	} 	//  getDatabase

	/**
	 *  Get Connection String
	 *  @return connection string
	 */
	public String getConnectionURL ()
	{
		getDatabase (); //  updates m_db
		if (m_db != null)
			return m_db.getConnectionURL (this);
		else
			return "";
	} 	//  getConnectionURL

	/**
	 *  Get Server Connection - do close
	 *  @param autoCommit true if autocommit connection
	 *  @param trxLevel Connection transaction level
	 *  @return Connection
	 */
	public Connection getServerConnection (boolean autoCommit, int trxLevel)
	{
		Connection conn = null;
		//	Server Connection
		if (m_ds != null)
		{
			try
			{
				conn = m_ds.getConnection ();
				conn.setAutoCommit (autoCommit);
				conn.setTransactionIsolation (trxLevel);
				m_okDB = true;
			}
			catch (SQLException ex)
			{
				m_dbException = ex;
				log.log(Level.SEVERE, "", ex);
			}
		}

		//	Server
		return conn;
	} 	//	getServerConnection

	/**
	 *  Create Connection - no not close.
	 * 	Sets m_dbException
	 *  @param autoCommit true if autocommit connection
	 *  @param transactionIsolation Connection transaction level
	 *  @return Connection
	 */
	public Connection getConnection (boolean autoCommit, int transactionIsolation)
	//{
	//return getConnection (false, autoCommit, transactionIsolation);
	//}
	//	
	//	public Connection getConnection (boolean isBackup, boolean autoCommit, int transactionIsolation)
	{
		Connection conn = null;
		m_dbException = null;
		m_okDB = false;
		//
		getDatabase (); //  updates m_db
		if (m_db == null)
		{
			m_dbException = new IllegalStateException("No Database Connector");
			return null;
		}
		//

		try
		{
		//	if (!Ini.isClient()			//	Server
		//		&& trxLevel != Connection.TRANSACTION_READ_COMMITTED)		// PO_LOB.save()
		//	{
//			Exception ee = null;
			try
			{
				conn = m_db.getCachedConnection(this, autoCommit, transactionIsolation);
			}
			catch (Exception e)
			{
				//ee = e;
				m_dbException = e;
			}
			//	Verify Connection
			if (conn != null)
			{
				if (conn.getTransactionIsolation() != transactionIsolation)
					conn.setTransactionIsolation (transactionIsolation);
				if (conn.getAutoCommit() != autoCommit)
					conn.setAutoCommit (autoCommit);
				m_okDB = true;
			}
		}
		catch (UnsatisfiedLinkError ule)
		{
			String msg = ule.getLocalizedMessage()
				+ " -> Did you set the LD_LIBRARY_PATH ? - " + getConnectionURL();
			m_dbException = new Exception(msg);
			log.severe(msg);
		}
		catch (SQLException ex)
		{
			m_dbException = ex;
			if (conn == null)
			{
				//log might cause infinite loop since it will try to acquire database connection again
				/*
				log.log(Level.SEVERE, getConnectionURL ()
					+ ", (1) AutoCommit=" + autoCommit + ",TrxIso=" + getTransactionIsolationInfo(transactionIsolation)
					+ " - " + ex.getMessage());
				*/
				System.err.println(getConnectionURL ()
						+ ", (1) AutoCommit=" + autoCommit + ",TrxIso=" + getTransactionIsolationInfo(transactionIsolation)
						+ " - " + ex.getMessage());
			}
			else
			{
				try
				{
					log.severe(getConnectionURL ()
						+ ", (2) AutoCommit=" + conn.getAutoCommit() + "->" + autoCommit
						+ ", TrxIso=" + getTransactionIsolationInfo(conn.getTransactionIsolation()) + "->" + getTransactionIsolationInfo(transactionIsolation)
					//	+ " (" + getDbUid() + "/" + getDbPwd() + ")"
						+ " - " + ex.getMessage());
				}
				catch (Exception ee)
				{
					log.severe(getConnectionURL ()
						+ ", (3) AutoCommit=" + autoCommit + ", TrxIso=" + getTransactionIsolationInfo(transactionIsolation)
					//	+ " (" + getDbUid() + "/" + getDbPwd() + ")"
						+ " - " + ex.getMessage());
				}
			}
		}
		catch (Exception ex)
		{
			m_dbException = ex;
			//log might cause infinite loop since it will try to acquire database connection again
			//log.log(Level.SEVERE, getConnectionURL(), ex);
			System.err.println(getConnectionURL() + " - " + ex.getLocalizedMessage());
		}
	//	System.err.println ("CConnection.getConnection - " + conn);
		return conn;
	}	//  getConnection
	
	/**
	 *  Get Database Exception of last connection attempt
	 *  @return Exception or null
	 */
	public Exception getDatabaseException ()
	{
		return m_dbException;
	} 	//  getConnectionException

	/*************************************************************************/

	private InitialContext m_iContext = null;
	private Hashtable m_env = null;

	public InitialContext getInitialContext(String host, boolean useCache)
	{
		if (host.length() == 0)
			host = getAppsHost();
		//if (useCache && m_iContext != null)
		//	return m_iContext;
		//if (m_iContext != null)
		//		return m_iContext;
		//	Set Environment
		//if (m_env == null || !useCache)
		//{		
		SecurityPrincipal sp = (SecurityPrincipal) Env.getCtx().get(SECURITY_PRINCIPAL);
		String principal = sp != null ? sp.principal : "guest";
		String credential = sp != null ? sp.credential : "guest";
		System.out.println("credential: "+principal+"->"+credential);
		m_env = getInitialEnvironment(host, Util.getAppsPort(), false,
				principal, credential);		
	//}
	String connect = (String)m_env.get(Context.PROVIDER_URL);
	System.out.println("connect : "+connect);
	Env.setContext(Env.getCtx(), Context.PROVIDER_URL, connect);

	//	Get Context	
	m_iContext = null;
	try
	{
		m_iContext = new InitialContext (m_env);
		//ConnectionFactory cf =  (ConnectionFactory) m_iContext.lookup("jms/RemoteConnectionFactory");
	}
	catch (Exception ex)
	{
		m_okApps = false;
		m_appsException = ex;
		if (connect == null)
			connect = (String)m_env.get(Context.PROVIDER_URL);
		log.severe(connect
			+ "\n - " + ex.toString ()
			+ "\n - " + m_env);
		if (CLogMgt.isLevelFinest())
			ex.printStackTrace();
		ex.printStackTrace();
	}
	return m_iContext;		
	}
	/**
	 *  Get Application Server Initial Context
	 *  @param useCache if true, use existing cache
	 *  @return Initial Context or null
	 */
	public InitialContext getInitialContext (boolean useCache)
	{
		return getInitialContext("", useCache);
	}	//	getInitialContext

	/**
	 * 	Get Initial Environment
	 * 	@param AppsHost host
	 * 	@param AppsPort port
	 * 	@param RMIoverHTTP ignore, retained for backward compatibility
	 *  @param principal
	 *  @param credential
	 *	@return environment
	 */
	private Hashtable getInitialEnvironment (String AppsHost, int AppsPort,
		boolean RMIoverHTTP, String principal, String credential)
	{
		return getInitialContextEnvironment(AppsHost, AppsPort, principal, credential);
	}	//	getInitialEnvironment	
	/**
	 * @see IApplicationServer#getInitialContextEnvironment(String, int, String, String)
	 */
	public Hashtable<String, String> getInitialContextEnvironment(
			String AppsHost, int AppsPort, String principal, String credential) {
		Hashtable<String,String> env = new Hashtable<String,String>();
		String connect = AppsHost;
		if (AppsHost.indexOf("://") == -1)
			// HornetQ embebido
			//if (Env.getContext(Env.getCtx(), Env.HOLON).equals("Y"))
			//if (Env.IsHolon())
			//{
				connect = "jnp://" + AppsHost + ":" + AppsPort;
				//env.put (Context.URL_PKG_PREFIXES, "org.jboss.naming.client");
				env.put (Context.URL_PKG_PREFIXES, "org.jboss.naming:org.jnp.interfaces");
				env.put (Context.INITIAL_CONTEXT_FACTORY,"org.jnp.interfaces.NamingContextFactory");
			//}
//			else
//			{
//				connect = "remote://" + AppsHost + ":" + AppsPort;
//				env.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
				if (principal != null)
				env.put(Context.SECURITY_PRINCIPAL, principal);
//				//env.put(Context.SECURITY_CREDENTIALS, "dicoflaxico1!");
				if (credential != null)
					env.put(Context.SECURITY_CREDENTIALS, credential);
				//env.put(Context.SECURITY_CREDENTIALS, "xendra1@");				
//			}
			env.put (Context.PROVIDER_URL, connect);
		// Jboss 7
//		env.put (Context.URL_PKG_PREFIXES, "org.jboss.naming.client");
		//	HTTP - default timeout 0
		// jboss 5
		//env.put (org.jnp.interfaces.TimedSocketFactory.JNP_TIMEOUT, "5000");	//	timeout in ms
		// jboss 7.1 https://issues.jboss.org/browse/AS7-4860
		env.put ("jboss.naming.client.connect.timeout", "5000");
		//env.put (org.jnp.interfaces.TimedSocketFactory.JNP_SO_TIMEOUT, "5000");
		//	JNP - default timeout 5 sec
		//env.put(org.jnp.interfaces.NamingContext.JNP_DISCOVERY_TIMEOUT, "5000");
		
//		if (principal != null && credential != null)
//		{
//			env.put(Context.INITIAL_CONTEXT_FACTORY,"org.jboss.security.jndi.JndiLoginInitialContextFactory");
//			env.put(Context.SECURITY_PRINCIPAL, principal);
//			env.put(Context.SECURITY_CREDENTIALS, credential);
//		}
//		else
//		{
//			env.put (Context.INITIAL_CONTEXT_FACTORY,"org.jnp.interfaces.NamingContextFactory");
//		}
		
		return env;
	}
	/**
	 *  Query Application Server Status.
	 *  update okApps
	 *  @return true ik OK
	 */
	private boolean queryAppsServerInfo ()
	{
		log.finer(getAppsHost());
		long start = System.currentTimeMillis();
		m_okApps = false;
		m_queryAppsServer = true;
		m_appsException = null;

		if (isServerEmbedded())
		{
			m_okApps = true;
		}
		else
		{
			// Carlos Ruiz - globalqss - speed up when jnp://MyAppsServer:1099 is set
			if (getAppsHost().equalsIgnoreCase("MyAppsServer")) {
				log.warning (getAppsHost() + " ignored");
				return m_okApps; // false
			}
			//ConnectToHolon();
		}
		log.fine("Success=" + m_okApps + " - " + (System.currentTimeMillis()-start) + "ms");
		return m_okApps;
	}	//  setAppsServerInfo

	/**
	 *  Get Last Exception of Apps Server Connection attempt
	 *  @return Exception or null
	 */
	public Exception getAppsServerException ()
	{
		return m_appsException;
	} 	//  getAppsServerException

	/**
	 *  Update Connection Info from Apps Server
	 *  @param svr Apps Server Status
	 *  @throws Exception
	 */
	private void updateInfoFromServer (Status svr) throws Exception
	{
		if (svr == null)
			throw new IllegalArgumentException ("AppsServer was NULL");

		setDbHost (svr.getDbHost());
		setDbPort (svr.getDbPort());
		setDbName (svr.getDbName());
		setDbUid (svr.getDbUid());
		setDbPwd (svr.getDbPwd());
//		setPoolServer(svr.getPoolServer());
//		setPoolClient(svr.getPoolClient());
		m_version = svr.getDateVersion ();
		log.config("Server=" + getDbHost() + ", DB=" + getDbName());
	} 	//  update Info

//	public void setPoolServer(String poolServer) {
//		m_poolServer = poolServer;
//	}
//
//	public void setPoolClient(String poolClient) {
//		m_poolClient = poolClient;
//	}
//	
	/**
	 *  Convert Statement
	 *  @param origStatement original statement (Oracle notation)
	 *  @return converted Statement
	 *  @throws Exception
	 */
	public String convertStatement (String origStatement)
	  throws Exception
	{
		//  make sure we have a good database
		//if (m_db != null && !m_db.getName ().equals (m_type))
		getDatabase ();
		if (m_db != null)
			return m_db.convertStatement (origStatement);
		throw new Exception (
		  "CConnection.convertStatement - No Converstion Database");
	}	//  convertStatement

	/**
	 * 	Get Status Info
	 *	@return info
	 */
	public String getStatus()
	{
		StringBuffer sb = new StringBuffer (m_apps_host);
		sb.append ("{").append (m_db_host)
		  .append ("-").append (m_db_name)
		  .append ("-").append (m_db_uid)
		  .append ("}");
		if (m_db != null)
		  sb.append (m_db.getStatus());
		return sb.toString ();
	}	//	getStatus

	public boolean isActiveDB()
	{
		return m_db != null;
	}
	/**
	 * 	Get Transaction Isolation Info
	 *	@param transactionIsolation trx iso
	 *	@return clear test
	 */
	public static String getTransactionIsolationInfo(int transactionIsolation)
	{
		if (transactionIsolation == Connection.TRANSACTION_NONE)
			return "NONE";
		if (transactionIsolation == Connection.TRANSACTION_READ_COMMITTED)
			return "READ_COMMITTED";
		if (transactionIsolation == Connection.TRANSACTION_READ_UNCOMMITTED)
			return "READ_UNCOMMITTED";
		if (transactionIsolation == Connection.TRANSACTION_REPEATABLE_READ)
			return "REPEATABLE_READ";
		if (transactionIsolation == Connection.TRANSACTION_READ_COMMITTED)
			return "SERIALIZABLE";
		return "<?" + transactionIsolation + "?>";
	}	//	getTransactionIsolationInfo

	/**
	 * @return true if server is embedded in process
	 */
	public static boolean isServerEmbedded() {
		//return "true".equalsIgnoreCase(System.getProperty(SERVER_EMBEDDED));
		//return Ini.isPropertyBool(Ini.P_ISHOLON);
		return true;
	}

	public void setAppServerCredential(String principal, String credential)
	{
		SecurityPrincipal sp = new SecurityPrincipal();
		sp.principal = principal;
		sp.credential = credential;
		Env.getCtx().put(SECURITY_PRINCIPAL, sp);
		m_iContext = null;
		m_env = null;
		//m_server = null;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		CConnection c = (CConnection)super.clone();
		String[] info = new String[2];
		info[0] = m_info[0];
		info[1] = m_info[1];
		c.m_info = info;
		return c;
	}

	public Object lookup(String host, String jndiName) throws NamingException {
		InitialContext ctx = null;
		ctx = getInitialContext(host, Ini.isClient());
		if (useComponentNamespace)
		{
			try
			{
				//return ctx.lookup(COMPONENT_NS + "/" + jndiName);
				return ctx.lookup(jndiName);
			}
			catch (Exception e)
			{
				log.warning("Component name space not available - " + e.getLocalizedMessage());
				//not available
				useComponentNamespace = false;
			}
		}
		//global jndi lookup
		return ctx.lookup(jndiName);		
	}
	
//	public Object lookup(String jndiName) throws NamingException {
//		return lookup("", jndiName);
//	}

	/**************************************************************************
	 *  Testing
	 *  @param args ignored
	 */
	public static void main (String[] args)
	{
		boolean server = true;
		if (args.length == 0)
			System.out.println("CConnection <server|client>");
		else
			server = "server".equals(args[0]);
		System.out.println("CConnection - " + (server ? "server" : "client"));
		//
		if (server) {
			Xendra.startup(false);
		} else {
			Xendra.startup(true);
		}
		//
		System.out.println ("Connection = ");
		//	CConnection[name=localhost{dev-dev1-adempiere},AppsHost=localhost,AppsPort=1099,type=Oracle,DBhost=dev,DBport=1521,DBname=dev1,BQ=false,FW=false,FWhost=,FWport=1630,UID=adempiere,PWD=adempiere]
//		System.out.println (Ini.getProperty (Ini.P_CONNECTION));

		CConnection cc = CConnection.get ();
//		System.out.println (">> " + cc.toStringLong ());
		Connection con = cc.getConnection (false,
						 Connection.TRANSACTION_READ_COMMITTED);
		new CConnectionDialog(cc);
	}	//	main
}	//  CConnection
