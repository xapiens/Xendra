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

import java.lang.management.*;
import java.math.BigDecimal;
import java.sql.*;
import java.util.*;
import java.util.logging.*;
import org.compiere.db.*;
import org.compiere.model.persistence.X_AD_System;
import org.compiere.util.*;
import org.xendra.Constants;

/**
 * 	System Record (just one)
 *
 *  @author Jorg Janke
 *  @version $Id: MSystem.java 5691 2015-10-16 22:11:33Z xapiens $
 */
public class MSystem extends X_AD_System
{
	/**
	 * 	Load System Record
	 *	@param ctx context
	 *	@return System
	 */
	public static MSystem get (Properties ctx)
	{
		if (s_system != null)
			return s_system;
		
		s_system = new Query(ctx, X_AD_System.Table_Name, "", null).first();
//		//
//		String sql = "SELECT * FROM AD_System ORDER BY AD_System_ID";	//	0 first
//		PreparedStatement pstmt = null;
//		try
//		{
//			pstmt = DB.prepareStatement(sql, null);
//			ResultSet rs = pstmt.executeQuery();
//			if (rs.next())
//				s_system = new MSystem (ctx, rs, null);
//			rs.close();
//			pstmt.close();
//			pstmt = null;
//		}
//		catch (SQLException ex)
//		{
//			s_log.log(Level.SEVERE, "get", ex);
//		}
//		try
//		{
//			if (pstmt != null)
//				pstmt.close();
//		}
//		catch (SQLException ex1)
//		{
//		}
//		pstmt = null;
		if (s_system == null)
			return null;
		//
		if (!Ini.isClient() && s_system.setInfo())
			s_system.save();
		return s_system;
	}	//	get

	/**	Logger							*/
	private static CLogger		s_log = CLogger.getCLogger (MSystem.class);
	/** System - cached					*/
	private static MSystem		s_system = null;
	
	/**************************************************************************
	 * 	Default Constructor
	 *	@param ctx context
	 *	@param ignored id
	 *	@param mtrxName transaction
	 */
	public MSystem (Properties ctx, int ignored, String mtrxName)
	{
		super(ctx, 0, mtrxName);
		String trxName = null;
		load(trxName);	//	load ID=0
		if (s_system == null)
			s_system = this;
	}	//	MSystem

	/**
	 * 	Load Constructor
	 * 	@param ctx context
	 * 	@param rs result set
	 * 	@param trxName transaction
	 */
	public MSystem (Properties ctx, ResultSet rs, String trxName)
	{
		super (ctx, rs, trxName);
		if (s_system == null)
			s_system = this;
	}	//	MSystem

	/**
	 * 	Constructor
	 */
	public MSystem ()
	{
		this (new Properties(), 0, null);
	}	//	MSystem

	public int getPoolClient()
	{
		HashMap props = getProperties();
		int value = getPropInt(props,Constants.DBPOOLCLIENT);
		if (value == 0)
		{	
			String val = Ini.getProperty(Constants.DBPOOLCLIENT);
			if (val.length()==0)
			{
				value = 50;
				Ini.setProperty(Constants.DBPOOLCLIENT, String.valueOf(value));
				Ini.saveProperties(true);
			}			
			props.put(Constants.DBPOOLCLIENT, value);
			setProperties(props);
			save();
		}
		return value;		
	}
	
	public int getPoolServer()
	{
		HashMap props = getProperties();
		int value = getPropInt(props,Constants.DBPOOLSERVER);
		if (value == 0)
		{
			String val = Ini.getProperty(Constants.DBPOOLSERVER);
			if (val.length()==0)
			{
				value = 50;
				Ini.setProperty(Constants.DBPOOLSERVER, String.valueOf(value));
				Ini.saveProperties(true);
			}			
			props.put(Constants.DBPOOLSERVER, value);
			setProperties(props);
			save();
		}
		return value;
	}
	
	public Integer getPropInt(HashMap props, String propname) {
		Integer ret = 0;
		Object value = props.get(propname);
		if (value != null)
		{			

			if (value instanceof String)
			{
				ret = Integer.valueOf((String)value);
			}
			else if (value instanceof BigDecimal)
			{
				ret = ((BigDecimal) value).intValue();
			}
			else if (value instanceof Integer)
			{
				ret = (Integer) value;
			}
			else 
			{
				System.out.println("X21");
			}
		}
		return ret;
	}

	/**
	 * 	Is LDAP Authentification defined
	 *	@return true if ldap defined
	 */
	public boolean isLDAP()
	{
		String host = getLDAPHost();
		if (host == null || host.length() == 0)
			return false;
		String domain = getLDAPDomain();
		return domain != null 
			&& domain.length() > 0;
	}	//	isLDAP	
	
	/**
	 * 	LDAP Authentification. Assumes that LDAP is defined.
	 *	@param userName user name
	 *	@param password password
	 *	@return true if ldap authenticated
	 */
	public boolean isLDAP (String userName, String password)
	{
		return LDAP.validate(getLDAPHost(), getLDAPDomain(), userName, password);
	}	//	isLDAP

	/**
	 * 	Get DB Address
	 *	@return address
	 */
	public String getDBAddress ()
	{
		String s = super.getDBAddress ();
		if (s == null || s.length() == 0)
			s = CConnection.get().getConnectionURL(); 
		return s;
	}	//	getDBAddress
	
//	/**
//	 * 	Get Statistics Info
//	 * 	@param recalc recalculate
//	 *	@return statistics
//	 */
//	public String getStatisticsInfo (boolean recalc)
//	{
//		String s = super.getStatisticsInfo ();
//		if (s == null || recalc)
//		{
//			System.out.print("Si tiene una DB gigantesca en AD_System desactivar estadisticas");
//			String sql = "SELECT 'C'||(SELECT " + DB.TO_CHAR("COUNT(*)", DisplayType.Number, Env.getAD_Language(Env.getCtx())) + " FROM AD_Client)"
//				+ "||'U'|| (SELECT " + DB.TO_CHAR("COUNT(*)", DisplayType.Number, Env.getAD_Language(Env.getCtx())) + " FROM AD_User)"
//				+ "||'B'|| (SELECT " + DB.TO_CHAR("COUNT(*)", DisplayType.Number, Env.getAD_Language(Env.getCtx())) + " FROM C_BPartner)"
//				+ "||'P'|| (SELECT " + DB.TO_CHAR("COUNT(*)", DisplayType.Number, Env.getAD_Language(Env.getCtx())) + " FROM M_Product)"
//				+ "||'I'|| (SELECT " + DB.TO_CHAR("COUNT(*)", DisplayType.Number, Env.getAD_Language(Env.getCtx())) + " FROM C_Invoice)"
//				+ "||'L'|| (SELECT " + DB.TO_CHAR("COUNT(*)", DisplayType.Number, Env.getAD_Language(Env.getCtx())) + " FROM C_InvoiceLine)"
//				+ "||'M'|| (SELECT " + DB.TO_CHAR("COUNT(*)", DisplayType.Number, Env.getAD_Language(Env.getCtx())) + " FROM M_Transaction)"
//				+ " FROM AD_System";
//			PreparedStatement pstmt = null;
//			try
//			{
//				pstmt = DB.prepareStatement (sql, null);
//				ResultSet rs = pstmt.executeQuery ();
//				if (rs.next ())
//					s = rs.getString(1);
//				rs.close ();
//				pstmt.close ();
//				pstmt = null;
//			}
//			catch (Exception e)
//			{
//				log.log (Level.SEVERE, sql, e);
//			}
//			try
//			{
//				if (pstmt != null)
//					pstmt.close ();
//				pstmt = null;
//			}
//			catch (Exception e)
//			{
//				pstmt = null;
//			}
//		}
//		return s;
//	}	//	getStatisticsInfo
	
	/**
	 * 	Get Profile Info
	 * 	@param recalc recalculate
	 *	@return profile
	 */
	public String getProfileInfo (boolean recalc)
	{
		String s = super.getProfileInfo ();
		if (s == null || recalc)
		{
			String sql = "SELECT Value FROM AD_Client "
				+ "WHERE IsActive='Y' ORDER BY AD_Client_ID DESC";
			PreparedStatement pstmt = null;
			StringBuffer sb = new StringBuffer();
			try
			{
				pstmt = DB.prepareStatement (sql, null);
				ResultSet rs = pstmt.executeQuery ();
				while (rs.next ())
					sb.append(rs.getString(1)).append('|');
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
			s = sb.toString();
		}
		return s;
	}	//	getProfileInfo
	
	/**
	 * 	Before Save
	 *	@param newRecord new
	 *	@return true/false
	 */
	protected boolean beforeSave (boolean newRecord)
	{
		//	Mandatory Values
		if (get_Value("IsAutoErrorReport") == null)
			setIsAutoErrorReport (true);
		//
		boolean userChange = Ini.isClient() &&
			(is_ValueChanged("Name")
			|| is_ValueChanged("UserName")
			|| is_ValueChanged("Password")
			|| is_ValueChanged("LDAPHost")
			|| is_ValueChanged("LDAPDomain")
			|| is_ValueChanged("CustomPrefix")
			);
		if (userChange)
		{
			String name = getName();
			if (name.equals("?") || name.length() < 2)
			{
				log.saveError("Error", "Defina un nombre de sistema unico (ej. Nombre de Empresa) no use " + name);
				return false;
			}
			if (getUserName().equals("?") || getUserName().length() < 2)
			{
				log.saveError("Error", "use un correo electronico valido");
				return false;
			}
			if (getPassword().equals("?") || getPassword().length() < 2)
			{
				log.saveError("Error", "use una contraseña valida");
				return false;
			}
		}
		//
		setInfo();
		return true;
	}	//	beforeSave
	
//	/**
//	 * 	Save Record (ID=0)
//	 * 	@return true if saved
//	 */
//	public boolean save()
//	{
//		if (!beforeSave(false))
//			return false;
//		//return saveUpdate();
//		return save();
//	}	//	save

	/**
	 * 	String Representation
	 *	@return info
	 */
	public String toString()
	{
		return "MSystem[" + getName()
			+ ",User=" + getUserName()
			+ ",ReleaseNo=" + getReleaseNo()
			+ "]";
	}	//	toString

	
	/**************************************************************************
	 * 	Check valididity
	 *	@return true if valid
	 */
	public boolean isValid()
	{
		if (getName() == null || getName().length() < 2)
		{
			log.log(Level.WARNING, "Name not valid: " + getName());
			return false;
		}
		if (getPassword() == null || getPassword().length() < 2)
		{
			log.log(Level.WARNING, "Password not valid: " + getPassword());
			return false;
		}
		if (getInfo() == null || getInfo().length() < 2)
		{
			log.log(Level.WARNING, "Need to run Migration once");
			return false;
		}
		return true;
	}	//	isValid

	/**
	 * 	Is there a PDF License
	 *	@return true if there is a PDF License
	 */
	public boolean isPDFLicense()
	{
		String key = getSummary();
		return key != null && key.length() > 25;
	}	//	isPDFLicense
	
	
	/**************************************************************************
	 * 	Set/Derive Info if more then a day old
	 * 	@return true if set
	 */
	public boolean setInfo()
	{
	//	log.severe("setInfo");
		if (!TimeUtil.getDay(getUpdated()).before(TimeUtil.getDay(null)))
			return false;	
		try
		{
			setDBInfo();
			setInternalUsers();
			if (isAllowStatistics())
			{
				//setStatisticsInfo(getStatisticsInfo(true));
				setProfileInfo(getProfileInfo(true));
			}
		}
		catch (Exception e)
		{
			setSupportUnits(9999);
			setInfo(e.getLocalizedMessage());
			log.log(Level.SEVERE, "", e);
		}
		return true;
	}	//	setInfo
	
	/**
	 * 	Set Internal User Count
	 */
	private void setInternalUsers()
	{
		String sql = "SELECT COUNT(DISTINCT (u.AD_User_ID)) AS iu "
			+ "FROM AD_User u"
			+ " INNER JOIN AD_User_Roles ur ON (u.AD_User_ID=ur.AD_User_ID) "
			+ "WHERE u.AD_Client_ID<>11"			//	no Demo
			+ " AND u.AD_User_ID NOT IN (0,100)";	//	no System/SuperUser
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, null);
			ResultSet rs = pstmt.executeQuery ();
			if (rs.next ())
			{
				int internalUsers = rs.getInt (1);
				setSupportUnits(internalUsers);
			}
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
	}	//	setInternalUsers

	/**
	 * 	Set DB Info
	 */
	private void setDBInfo()
	{
		if (!DB.isRemoteObjects())
		{
			String dbAddress = CConnection.get().getConnectionURL();
			setDBAddress(dbAddress.toLowerCase());
		}
		//
		if (!Ini.isClient())
		{
			int noProcessors = Runtime.getRuntime().availableProcessors();
			setNoProcessors(noProcessors);
		}
		//
		String dbName = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try
		{
			String dbType = CConnection.get().getDatabase().getName();
			sql = getDBInfoSQL(dbType);
			pstmt = DB.prepareStatement (sql, null);
			ResultSet rs = pstmt.executeQuery ();
			if (rs.next())
			{
			//	dbAddress = rs.getString(1);
				dbName = rs.getString(2);
				setDBInstance(dbName.toLowerCase());
			}
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
	}	//	setDBInfo
	
	/**
	 * 	Get DB Info SQL
	 *	@param dbType database type
	 *	@return sql
	 */
	public static String getDBInfoSQL (String dbType)
	{
		if (Database.DB_ORACLE.equals(dbType))
			return "SELECT SYS_CONTEXT('USERENV','HOST') || '/' || SYS_CONTEXT('USERENV','IP_ADDRESS') AS DBAddress,"
				+ "	SYS_CONTEXT('USERENV','CURRENT_USER') || '.' || SYS_CONTEXT('USERENV','DB_NAME')"
				+ " || '.' || SYS_CONTEXT('USERENV','DB_DOMAIN') AS DBName "
				+ "";
		//
		return "SELECT NULL,NULL FROM AD_System WHERE AD_System_ID=-1";
	}	//	getDBInfoSQL
	
	
	/**
	 * 	Print info
	 */
	public void info()
	{
		if (!CLogMgt.isLevelFine())
			return;
		//	OS
	//	OperatingSystemMXBean os = ManagementFactory.getOperatingSystemMXBean();
	//	log.fine(os.getName() + " " + os.getVersion() + " " + os.getArch() 
	//		+ " Processors=" + os.getAvailableProcessors());
		//	Runtime
		RuntimeMXBean rt = ManagementFactory.getRuntimeMXBean();
		log.fine(rt.getName() + " (" + rt.getVmVersion() + ") Up=" + TimeUtil.formatElapsed(rt.getUptime()));
		//	Memory
		if (CLogMgt.isLevelFiner())
		{
			List<MemoryPoolMXBean> list = ManagementFactory.getMemoryPoolMXBeans();
			Iterator it = list.iterator();
			while (it.hasNext())
			{
				MemoryPoolMXBean pool = (MemoryPoolMXBean)it.next();
				log.finer(pool.getName() + " " + pool.getType() 
					+ ": " + new CMemoryUsage(pool.getUsage()));
			}
		}
		else
		{
			MemoryMXBean memory = ManagementFactory.getMemoryMXBean();
			log.fine("VM: " + new CMemoryUsage(memory.getNonHeapMemoryUsage()));
			log.fine("Heap: " + new CMemoryUsage(memory.getHeapMemoryUsage()));
		}
		//	Thread
		ThreadMXBean th = ManagementFactory.getThreadMXBean();
		log.fine("Threads=" + th.getThreadCount()
			+ ", Peak=" + th.getPeakThreadCount()
			+ ", Demons=" + th.getDaemonThreadCount()
			+ ", Total=" + th.getTotalStartedThreadCount()
		);
	}	//	info
	
	
	/**
	 * 	Test
	 *	@param args
	 */
	public static void main (String[] args)
	{
		new MSystem();
	}	//	main
	
}	//	MSystem
