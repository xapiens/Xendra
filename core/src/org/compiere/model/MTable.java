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
 * Contributor(s): Carlos Ruiz - globalqss                                    *
 *****************************************************************************/
package org.compiere.model;

import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;

import org.adempiere.model.GenericPO;
import org.columba.core.xml.XmlElement;
import org.compiere.model.element.ELE_AD_Client_ID;
import org.compiere.model.element.ELE_AD_Org_ID;
import org.compiere.model.element.ELE_Created;
import org.compiere.model.element.ELE_CreatedBy;
import org.compiere.model.element.ELE_IsActive;
import org.compiere.model.element.ELE_Updated;
import org.compiere.model.element.ELE_UpdatedBy;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.reference.REF_AD_TableAccessLevels;
import org.compiere.model.reference.REF_AD_User;
import org.compiere.model.reference.REF_DateTime;
import org.compiere.model.reference.REF_ID;
import org.compiere.model.reference.REF_Table;
import org.compiere.model.reference.REF_TableDir;
import org.compiere.model.reference.REF_YesNo;
import org.compiere.util.CCache;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.xendra.model.sql;

/**
 *	Persistent Table Model
 * <p>
 * Change log:
 * <ul>
 * <li>2007-02-01 - teo_sarca - [ 1648850 ] MTable.getClass works incorrect for table "Fact_Acct"
 * </ul>
 * <ul>
 * <li>2007-08-30 - vpj-cd - [ 1784588 ] Use ModelPackage of EntityType to Find Model Class
 * </ul>
 *  @author Jorg Janke
 *  @version $Id: MTable.java 5772 2016-03-20 15:33:29Z xapiens $
 */
public class MTable extends X_AD_Table
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2367316254623142732L;

	/**
	 * 	Get Table from Cache
	 *	@param ctx context
	 *	@param AD_Table_ID id
	 *	@return MTable
	 */
	public static MTable get (Properties ctx, int AD_Table_ID)
	{
		return get (ctx, AD_Table_ID, null);
	}	//	get

	/**
	 * 	Get Table from Cache
	 *	@param ctx context
	 *	@param AD_Table_ID id
	 *	@return MTable
	 */
	public static MTable get (Properties ctx, int AD_Table_ID, String trxName)
	{
		Integer key = new Integer (AD_Table_ID);
		MTable retValue = s_cache.get (key);
		if (retValue != null && retValue.getCtx() == ctx) {
			return retValue;
		}
		retValue = new MTable (ctx, AD_Table_ID, trxName);
		if (retValue.get_ID () != 0) {
			s_cache.put (key, retValue);
		}
		return retValue;
	}	//	get
	
	public static MTable get (Properties ctx, String tableName)
	{
		return get(ctx, tableName, null);
	}
	/**
	 * 	Get Table from Cache
	 *	@param ctx context
	 *	@param tableName case insensitive table name
	 *	@return Table
	 */
	public static MTable get (Properties ctx, String tableName, String trxName)
	{
		if (tableName == null)
			return null;
		if (s_cache != null)
		{
			Iterator<MTable> it = s_cache.values().iterator();
			while (it.hasNext())
			{
				MTable retValue = it.next();
				if (tableName.equalsIgnoreCase(retValue.getTableName()) 
						&& retValue.getCtx() == ctx 
						) 
				{
					return retValue;
				}
			}
		}
		//		
		MTable retValue = null;
		String sql = "SELECT * FROM AD_Table WHERE UPPER(TableName)=?";
		PreparedStatement pstmt = null;
		try
		{
				pstmt = DB.prepareStatement (sql, trxName);
				pstmt.setString(1, tableName.toUpperCase());
				ResultSet rs = pstmt.executeQuery ();
				if (rs.next ())
					retValue = new MTable (ctx, rs, null);
				rs.close ();
				pstmt.close ();
				pstmt = null;
			
		}
		catch (Exception e)
		{
			s_log.log(Level.SEVERE, sql, e);
		}
		try
		{
			if (pstmt != null)
			{
				pstmt.close ();
				pstmt = null;
			}
		}
		catch (Exception e)
		{
			pstmt = null;
		}
		
		if (retValue != null)
		{
			Integer key = new Integer (retValue.getAD_Table_ID());
			s_cache.put (key, retValue);
		}
		return retValue;
	}	//	get
	
	/**
	 * 	Get Table Name
	 *	@param ctx context
	 *	@param AD_Table_ID table
	 *	@return tavle name
	 */
	public static String getTableName (Properties ctx, int AD_Table_ID)
	{
		return MTable.get(ctx, AD_Table_ID).getTableName();
	}	//	getTableName
	
	
	/**	Cache						*/
	private static CCache<Integer,MTable> s_cache = new CCache<Integer,MTable>("AD_Table", 20);
	private static CCache<String,Class<?>> s_classCache = new CCache<String,Class<?>>("PO_Class", 20);
	
	/**	Static Logger	*/
	private static CLogger	s_log	= CLogger.getCLogger (MTable.class);	
	
	/**	Packages for Model Classes	*/
	private static final String[]	s_packages = new String[] {

		"org.compiere.model", "org.compiere.wf", 
		"org.compiere.print", "org.compiere.impexp",
		"compiere.model",			//	globalqss allow compatibility with other plugins 	
		"adempiere.model",			//	Extensions
		"org.adempiere.model"
	};
	
	/**	Special Classes				*/
	private static final String[]	s_special = new String[] {
		"AD_Element", "org.compiere.model.M_Element",
		"AD_Registration", "org.compiere.model.M_Registration",
		"AD_Tree", "org.compiere.model.MTree_Base",
		"R_Category", "org.compiere.model.MRequestCategory",
		"GL_Category", "org.compiere.model.MGLCategory",		
		"C_ValidCombination", "org.compiere.model.MAccount",
		"C_Phase", "org.compiere.model.MProjectTypePhase",
		"C_Task", "org.compiere.model.MProjectTypeTask",
		"E_Message","org.compiere.model.persistence.X_E_Message"
	//	AD_Attribute_Value, AD_TreeNode
	};
	
	/** EntityType */
	private static final  MEntityType[] entityTypes = MEntityType.getEntityTypes(Env.getCtx());

	/**
	 * 	Get Persistency Class for Table
	 *	@param tableName table name
	 *	@return class or null
	 */
	public static Class<?> getClass (String tableName)
	{
		//	Not supported
		if (tableName == null || tableName.endsWith("_Trl"))
			return null;
		
		//	Import Tables (Name conflict)
		if (tableName.startsWith("I_") )
		{
			Class<?> clazz = getPOclass("org.compiere.model.persistence.X_" + tableName);
			if (clazz != null)
				return clazz;
			s_log.warning("No class for table: " + tableName);
			return null;
		}
			

		
		//check cache
		Class<?> cache = s_classCache.get(tableName);
		if (cache != null) 
		{
			//Object.class indicate no generated PO class for tableName
			if (cache.equals(Object.class))
				return null;
			else
				return cache;
		}

		//	Special Naming
		for (int i = 0; i < s_special.length; i++)
		{
			if (s_special[i++].equals(tableName))
			{
				Class<?> clazz = getPOclass(s_special[i]);
				if (clazz != null)
				{
					s_classCache.put(tableName, clazz);
					return clazz;
				}
				break;
			}
		}
		
		//begin [ 1784588 ] Use ModelPackage of EntityType to Find Model Class - vpj-cd 
		MTable table = MTable.get(Env.getCtx(), tableName);
		String entityType = table.getEntityType();
		if (!MEntityType.ENTITYTYPE_Dictionary.equals(entityType))
		{	
			for (int i = 0; i < entityTypes.length; i++)
			{
				if (entityTypes[i].getEntityType().equals(entityType))
				{
					String modelpackage = entityTypes[i].getModelPackage(); 
					if (modelpackage != null)
					{						
						Class<?> clazz = getPOclass(entityTypes[i].getModelPackage() + ".M" + Util.replace(tableName, "_", ""));
						if (clazz != null) {
							s_classCache.put(tableName, clazz);
							return clazz;
						}
						clazz = getPOclass(entityTypes[i].getModelPackage() + ".X_" + tableName);
						if (clazz != null) {
							s_classCache.put(tableName, clazz);
							return clazz;
						}
						s_log.warning("No class for table with it entity: " + tableName);					
					}
				}
			}
		}	
		//end [ 1784588 ] 

		//	Strip table name prefix (e.g. AD_) Customizations are 3/4
		String className = tableName;
		int index = className.indexOf('_');
		if (index > 0)
		{
			if (index < 3)		//	AD_, A_
				 className = className.substring(index+1);
			/* DELETEME: this part is useless - teo_sarca, [ 1648850 ]
			else
			{
				String prefix = className.substring(0,index);
				if (prefix.equals("Fact"))		//	keep custom prefix
					className = className.substring(index+1);
			}
			*/
		}
		//	Remove underlines
		className = Util.replace(className, "_", "");
	
		//	Search packages
		for (int i = 0; i < s_packages.length; i++)
		{
			StringBuffer name = new StringBuffer(s_packages[i]).append(".M").append(className);
			Class<?> clazz = getPOclass(name.toString());
			if (clazz != null)
			{
				s_classCache.put(tableName, clazz);
				return clazz;
			}
		}
		
		
		//	Adempiere Extension
		Class<?> clazz = getPOclass("adempiere.model.X_" + tableName);
		if (clazz != null)
		{
			s_classCache.put(tableName, clazz);
			return clazz;
		}
		
		//hengsin - allow compatibility with compiere plugins
		//Compiere Extension
		clazz = getPOclass("compiere.model.X_" + tableName);
		if (clazz != null)
		{
			s_classCache.put(tableName, clazz);
			return clazz;
		}

		//	Default
		clazz = getPOclass("org.compiere.model.persistence.X_" + tableName);
		if (clazz != null)
		{
			s_classCache.put(tableName, clazz);
			return clazz;
		}

		//Object.class to indicate no PO class for tableName
		s_classCache.put(tableName, Object.class);
		return null;
	}	//	getClass
	
	/**
	 * 	Get PO class
	 *	@param className fully qualified class name
	 *	@return class or null
	 */
	private static Class<?> getPOclass (String className)
	{
		try
		{
			Class<?> clazz = Class.forName(className);
			//	Make sure that it is a PO class
			Class<?> superClazz = clazz.getSuperclass();
			while (superClazz != null)
			{
				if (superClazz == PO.class)
				{
					s_log.fine("Use: " + className);
					return clazz;
				}
				superClazz = superClazz.getSuperclass();
			}
		}
		catch (Exception e)
		{
		}
		s_log.finest("Not found: " + className);
		return null;
	}	//	getPOclass

	
	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param AD_Table_ID id
	 *	@param trxName transaction
	 */
	public MTable (Properties ctx, int AD_Table_ID, String trxName)
	{
		super (ctx, AD_Table_ID, trxName);
		if (AD_Table_ID == 0)
		{
		//	setName (null);
		//	setTableName (null);
			setAccessLevel (REF_AD_TableAccessLevels.SystemOnly);	// 4
			setEntityType (ENTITYTYPE_UserMaintained);	// U
			setIsChangeLog (false);
			setIsDeleteable (false);
			setIsHighVolume (false);
			setIsSecurityEnabled (false);
			setIsView (false);	// N
			//setReplicationType (REPLICATIONTYPE_Local);
		}	
	}	//	MTable

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MTable (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MTable
	
	/**	Columns				*/
	private MColumn[]	m_columns = null;
	
	/**
	 * 	Get Columns
	 *	@param requery requery
	 *	@return array of columns
	 */
	public MColumn[] getColumns (boolean requery)
	{
		if (m_columns != null && !requery)
			return m_columns;
		String sql = "SELECT * FROM AD_Column WHERE AD_Table_ID=? ORDER BY ColumnName";
		ArrayList<MColumn> list = new ArrayList<MColumn>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			pstmt = DB.prepareStatement (sql, get_TrxName());
			pstmt.setInt (1, getAD_Table_ID());
			rs = pstmt.executeQuery ();
			while (rs.next ())
				list.add (new MColumn (getCtx(), rs, get_TrxName()));			
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, sql, e);
		}
		finally
		{
			DB.close(rs, pstmt);
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
		m_columns = new MColumn[list.size ()];
		list.toArray (m_columns);
		return m_columns;
	}	//	getColumns

//	/**
//	 * 	Get Columns
//	 *	@param requery requery
//	 *	@return array of columns
//	 */
//	public MColumn[] getColumnsWithReplication (boolean requery)
//	{
//		if (m_columns != null && !requery)
//			return m_columns;
//		String sql = "SELECT * FROM AD_Column WHERE AD_Table_ID=?  ORDER BY ColumnName";
//		ArrayList<MColumn> list = new ArrayList<MColumn>();
//		PreparedStatement pstmt = null;
//		try
//		{
//			pstmt = DB.prepareStatement (sql, get_TrxName());
//			pstmt.setInt (1, getAD_Table_ID());
//			ResultSet rs = pstmt.executeQuery ();
//			while (rs.next ())
//				list.add (new MColumn (getCtx(), rs, get_TrxName()));
//			rs.close ();
//			pstmt.close ();
//			pstmt = null;
//		}
//		catch (Exception e)
//		{
//			log.log(Level.SEVERE, sql, e);
//		}
//		try
//		{
//			if (pstmt != null)
//				pstmt.close ();
//			pstmt = null;
//		}
//		catch (Exception e)
//		{
//			pstmt = null;
//		}
//		//
//		m_columns = new MColumn[list.size ()];
//		list.toArray (m_columns);
//		return m_columns;
//	}	//	getColumns
//	
	/**
	 * 	Get Column
	 *	@param columnName (case insensitive)
	 *	@return column if found
	 */
	public MColumn getColumn (String columnName)
	{
		if (columnName == null || columnName.length() == 0)
			return null;
		getColumns(false);
		//
		for (int i = 0; i < m_columns.length; i++)
		{
			if (columnName.equalsIgnoreCase(m_columns[i].getColumnName()))
				return m_columns[i];
		}
		return null;
	}	//	getColumn
	
	/**
	 * 	Table has a single Key
	 *	@return true if table has single key column
	 */
	public boolean isSingleKey()
	{
		String[] keys = getKeyColumns();
		return keys.length == 1;
	}	//	isSingleKey
	
	/**
	 * 	Get Key Columns of Table
	 *	@return key columns
	 */
	public String[] getKeyColumns()
	{
		getColumns(false);
		ArrayList<String> list = new ArrayList<String>();
		//
		for (int i = 0; i < m_columns.length; i++)
		{
			MColumn column = m_columns[i];
			if (column.isKey())
				return new String[]{column.getColumnName()};
			if (column.isParent())
				list.add(column.getColumnName());
		}
		String[] retValue = new String[list.size()];
		retValue = list.toArray(retValue);
		return retValue;
	}	//	getKeyColumns
	
	/**************************************************************************
	 * 	Get PO Class Instance
	 *	@param Record_ID record
	 *	@param trxName
	 *	@return PO for Record or null
	 */
	public PO getPO (int Record_ID, String trxName)
	{
		String tableName = getTableName();
		if (Record_ID != 0 && !isSingleKey())
		{
			log.log(Level.WARNING, "(id) - Multi-Key " + tableName);
			return null;
		}
		Class<?> clazz = getClass(tableName);
		if (clazz == null)
		{
			//log.log(Level.WARNING, "(id) - Class not found for " + tableName);
			//return null;
			log.log(Level.INFO, "Using GenericPO for " + tableName);
			GenericPO po = new GenericPO(tableName, getCtx(), new Integer(Record_ID), trxName);
			return po;
		}
		
		boolean errorLogged = false;
		try
		{
			Constructor<?> constructor = null;
			try
			{
				constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
			}
			catch (Exception e)
			{
				String msg = e.getMessage();
				if (msg == null)
					msg = e.toString();
				log.warning("No transaction Constructor for " + clazz + " (" + msg + ")");
			}
			
			PO po = (PO)constructor.newInstance(new Object[] {getCtx(), new Integer(Record_ID), trxName});
			if (po != null && po.get_ID() != Record_ID && Record_ID > 0)
				return null;
			return po;
		}
		catch (Exception e)
		{
			if (e.getCause() != null)
			{
				Throwable t = e.getCause();
				log.log(Level.SEVERE, "(id) - Table=" + tableName + ",Class=" + clazz, t);
				errorLogged = true;
				if (t instanceof Exception)
					log.saveError("Error", (Exception)e.getCause());
				else
					log.saveError("Error", "Table=" + tableName + ",Class=" + clazz);
			}
			else
			{
				log.log(Level.SEVERE, "(id) - Table=" + tableName + ",Class=" + clazz, e);
				errorLogged = true;
				log.saveError("Error", "Table=" + tableName + ",Class=" + clazz);
			}
		}
		if (!errorLogged)
			log.log(Level.SEVERE, "(id) - Not found - Table=" + tableName 
				+ ", Record_ID=" + Record_ID);
		return null;
	}	//	getPO
	
	/**
	 * 	Get PO Class Instance
	 *	@param rs result set
	 *	@param trxName transaction
	 *	@return PO for Record or null
	 */
	public PO getPO (ResultSet rs, String trxName)
	{
		String tableName = getTableName();
		Class<?> clazz = getClass(tableName);
		if (clazz == null)
		{
			//log.log(Level.SEVERE, "(rs) - Class not found for " + tableName);
			//return null;
			log.log(Level.INFO, "Using GenericPO for " + tableName);
			GenericPO po = new GenericPO(tableName, getCtx(), rs, trxName);
			return po;
		}
		
		boolean errorLogged = false;
		try
		{
			Constructor<?> constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, ResultSet.class, String.class});
			PO po = (PO)constructor.newInstance(new Object[] {getCtx(), rs, trxName});
			return po;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, "(rs) - Table=" + tableName + ",Class=" + clazz, e);
			errorLogged = true;
			log.saveError("Error", "Table=" + tableName + ",Class=" + clazz);
		}
		if (!errorLogged)
			log.log(Level.SEVERE, "(rs) - Not found - Table=" + tableName);
		return null;
	}	//	getPO

	/**
	 * 	Get PO Class Instance
	 *	@param whereClause where clause
	 *	@param trxName transaction
	 *	@return PO for Record or null
	 */
	public PO getPO (String whereClause, String trxName)
	{
		return getPO(whereClause, null, trxName);
	}	//	getPO
	
	/**
	 * Get PO class instance
	 * @param whereClause
	 * @param params
	 * @param trxName
	 * @return
	 */
	public PO getPO(String whereClause, Object[] params, String trxName)
	{
		if (whereClause == null || whereClause.length() == 0)
			return null;
		//
		PO po = null;
		POInfo info = POInfo.getPOInfo(getCtx(), getAD_Table_ID(), trxName);
		if (info == null) return null;
		StringBuffer sqlBuffer = info.buildSelect();
		sqlBuffer.append(" WHERE ").append(whereClause);
		String sql = sqlBuffer.toString(); 
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, trxName);
			if (params != null && params.length > 0) 
			{
				for (int i = 0; i < params.length; i++)
				{
					pstmt.setObject(i+1, params[i]);
				}
			}
			ResultSet rs = pstmt.executeQuery ();
			if (rs.next ())
			{
				po = getPO(rs, trxName);
			}
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, sql, e);
			log.saveError("Error", e);
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
		
		return po;
	}
	
	/**
	 * 	Before Save
	 *	@param newRecord new
	 *	@return true
	 */
	protected boolean beforeSave (boolean newRecord)
	{
		if (isView() && isDeleteable())
			setIsDeleteable(false);
		//
		return true;
	}	//	beforeSave
	
	/**
	 * 	After Save
	 *	@param newRecord new
	 *	@param success success
	 *	@return success
	 */
	protected boolean afterSave (boolean newRecord, boolean success)
	{
		//DB.getNextID(getAD_Client_ID(), getTableName(), get_TrxName());
		//	Sync Table ID
//		if (newRecord)
//		{
//			MSequence seq = MSequence.get(getCtx(), getTableName(), get_TrxName());
//			if (seq == null || seq.get_ID() == 0)
//				MSequence.createTableSequence(getCtx(), getTableName(), get_TrxName());
//		}
//		else
//		{
//			MSequence seq = MSequence.get(getCtx(), getTableName(), get_TrxName());
//			if (seq == null || seq.get_ID() == 0)
//				MSequence.createTableSequence(getCtx(), getTableName(), get_TrxName());
//			else if (!seq.getName().equals(getTableName()))
//			{
//				seq.setName(getTableName());
//				seq.save();
//			}
//		}	
		
		return success;
	}	//	afterSave
	
	/**
	 * 	Get SQL Create
	 *	@return create table DDL
	 */
	public String getSQLCreate()
	{		
		StringBuffer sequence = new StringBuffer("");
		StringBuffer translate = new StringBuffer("");
		StringBuffer sbct = new StringBuffer("CREATE TABLE xendra.")
			.append(getTableName()).append(" (");
		
		StringBuffer sb = new StringBuffer("");
		//
		//boolean hasPK = false;
		boolean hasParents = false;
		//StringBuffer constraints = new StringBuffer();
		getColumns(true);
		
		List<MColumn> PKcolumn = new ArrayList<MColumn>();
		
		for (int i = 0; i < m_columns.length; i++)
		{
			MColumn column = m_columns[i];
			String colSQL = column.getSQLDDL();
			if ( colSQL != null )
			{
				if (i > 0 && sb.length() > 0)
					sb.append(", ");
					sb.append(column.getSQLDDL());
			}
			else // virtual column
				continue;
			//
			if ( column.getAD_Reference_ID() == DisplayType.ID 
				 && 
				 String.format("%s_ID", getTableName()).toLowerCase().equals(column.getColumnName().toLowerCase())
			   )							
			{
				PKcolumn.add(column);
				//System.out.println("X");
				//hasPK = true;
				//String seqname = getTableName()+"_"+getTableName()+"_id_seq";
				String seqname = getTableName()+"_seq";
				seqname = seqname.toLowerCase();
				int no = DB.getSQLValue(null, String.format("SELECT 1 FROM pg_class where relname = '%s'",seqname));
				if (no != 1)
				{
					sequence.append(String.format("CREATE SEQUENCE xendra.%s;",seqname));
					sequence.append(String.format(sql.OWNERTOXENDRA,seqname));			
				}
				
			}
			else if (column.isKey())
			{
				PKcolumn.add(column);
			}
			// if (column.isKey())
			//{
//				hasPK = true;
//				//String seqname = getTableName()+"_"+getTableName()+"_id_seq";
//				String seqname = getTableName()+"_seq";
//				seqname = seqname.toLowerCase();
//				int no = DB.getSQLValue(null, String.format("SELECT 1 FROM pg_class where relname = '%s'",seqname));
//				if (no != 1)
//				{
//					sequence.append(String.format("CREATE SEQUENCE xendra.%s;",seqname));
//					sequence.append(String.format(sql.OWNERTOXENDRA,seqname));			
//				}
				
			//}
			if (column.isTranslated())
			{
				if (translate.length() > 0)
					translate.append(", ");
					translate.append(column.getSQLDDL());									
			}
			if (column.isParent())
				hasParents = true;
//			String constraint = column.getConstraint(getTableName());
//			if (constraint != null && constraint.length() > 0)
//				constraints.append(", ").append(constraint);
		}
		//	Multi Column PK 
		//if (!hasPK && hasParents)
		if (PKcolumn.size() > 1)
		{
			StringBuffer cols = new StringBuffer();
			for (MColumn column:PKcolumn)
			{
				if (cols.length() > 0)
					cols.append(", ");
				cols.append(column.getColumnName());				
			}
			sb.append(", CONSTRAINT ")
			.append(getTableName()).append("_Key PRIMARY KEY (")
			.append(cols).append(")");			
		}
		else if (PKcolumn.size() == 1)
		{
			StringBuffer cols = new StringBuffer();
			cols.append(PKcolumn.get(0).getColumnName());
			sb.append(", CONSTRAINT ")
			.append(getTableName()).append("_Key PRIMARY KEY (")
			.append(cols).append(")");				
		}
		//if (PKcolumn.size() == 0 && hasParents)
		else if (PKcolumn.size() == 0 && hasParents)
		{
			StringBuffer cols = new StringBuffer();
			for (int i = 0; i < m_columns.length; i++)
			{
				MColumn column = m_columns[i];
				if (!column.isParent())
					continue;
				if (cols.length() > 0)
					cols.append(", ");
				cols.append(column.getColumnName());
			}
			sb.append(", CONSTRAINT ")
				.append(getTableName()).append("_Key PRIMARY KEY (")
				.append(cols).append(")");
		}
		if (sequence.length() > 0)
		{
			sbct = sequence.append(sbct);
		}		
		if ( sb.length() > 0 )
		{
			sb = sbct.append(sb);
			//sb.append(constraints)
				sb.append(");")
				.append(String.format(sql.OWNERTOXENDRA, getTableName()));
			if (translate.length() > 0)
			{
				translate = getSQLCreateTranslate(translate);
				sb.append(translate);
			}			
			return sb.toString();
		}
		return null;
	}	//	getSQLCreate
	
	public StringBuffer getSQLCreateTranslate(StringBuffer translate) {
		StringBuffer sb = new StringBuffer("CREATE TABLE IF NOT EXISTS xendra.").append(getTableName()).append("_trl").append(" (");		
		//
		sb
		.append(getTableName()).append("_id numeric(10,0) NOT NULL,")
		.append("ad_language character varying(6) NOT NULL,")
		.append("ad_client_id numeric(10,0) NOT NULL,")
		.append("ad_org_id numeric(10,0) NOT NULL,")
		.append("isactive character(1) NOT NULL DEFAULT 'Y'::bpchar,")
		.append("created timestamp without time zone NOT NULL DEFAULT now(),")
		.append("createdby numeric(10,0) NOT NULL,")
		.append("updated timestamp without time zone NOT NULL DEFAULT now(),")
		.append("updatedby numeric(10,0) NOT NULL,")
		.append(translate)
		//.append("name character varying(60) NOT NULL,")
		//.append("description character varying(255),")
		//.append("help character varying(2000),")
		.append(",istranslated character(1) NOT NULL DEFAULT 'N'::bpchar,")
		.append(" CONSTRAINT ").append(getTableName()).append("_trl_pkey PRIMARY KEY (").append(getTableName()).append("_id").append(", ad_language),")
		.append(" CONSTRAINT ").append(getTableName().replace("_", "")).append("_").append(getTableName()).append("_trl").append(" FOREIGN KEY (").append(getTableName()).append("_id) ")
		.append(" REFERENCES ").append(getTableName()).append(" (").append(getTableName()).append("_id) MATCH SIMPLE ")
		.append(" ON UPDATE NO ACTION ON DELETE NO ACTION DEFERRABLE INITIALLY DEFERRED, ")
		.append(" CONSTRAINT adlanguage_").append(getTableName().replace("_", "")).append("trl").append(" FOREIGN KEY (ad_language)")
		.append(" REFERENCES ad_language (ad_language) MATCH SIMPLE ")
		.append(" ON UPDATE NO ACTION ON DELETE NO ACTION DEFERRABLE INITIALLY DEFERRED")
		.append(" )")
		.append("WITH (")
		.append("OIDS=FALSE")
		.append(");")
		.append(String.format(sql.OWNERTOXENDRA, getTableName()+"_trl"));
		return sb;
	}	
	
	// globalqss
	public static int getTable_ID(String tableName) {
		return getTable_ID(tableName, null);
	}
	/**
	 * 	Grant independence to GenerateModel from AD_Table_ID
	 *	@param String tableName
	 *	@return int retValue
	 */
	public static int getTable_ID(String tableName, String trxName) {
		int retValue = 0;
		String SQL = "";
		try
		{
				SQL = "SELECT AD_Table_ID FROM xendra.AD_Table WHERE tablename = ?";
				PreparedStatement pstmt = DB.prepareStatement(SQL, trxName);
				pstmt.setString(1, tableName);
				ResultSet rs = pstmt.executeQuery();
				if (rs.next())
					retValue = rs.getInt(1);
				rs.close();
				pstmt.close();
		}
		catch (Exception e)
		{
			s_log.log(Level.SEVERE, SQL, e);
			retValue = -1;
		}		
		return retValue;
	}
	
	/**
	 * Create query to retrieve one or more PO.
	 * @param whereClause
	 * @param trxName
	 * @return Query
	 */
	public Query createQuery(String whereClause, String trxName) 
	{
		return new Query(this.getCtx(), this, whereClause, trxName);
	}

	/**
	 * 	String Representation
	 *	@return info
	 */
	public String toString()
	{
		StringBuffer sb = new StringBuffer ("MTable[");
		sb.append (get_ID()).append ("-").append (getTableName()).append ("]");
		return sb.toString ();
	}	//	toString
	
	public void checkdefaults(int keycnt) {
		M_Element element = null;
		MColumn column = null;
		if (keycnt == 1)
		{
			String ID =	getTableName()+"_ID";
			element = M_Element.get (getCtx(), ID, get_TrxName());
			if (element == null)
			{
				element = new M_Element(Env.getCtx(), 0, get_TrxName());		
				element.setName(ID);
				element.setDescription(ID);
				element.setHelp(ID);
				element.setColumnName (ID);
				element.setPrintName(ID);
				element.save();
			}
			column = getColumn(element);
			if (column == null)
				AddColumn(element, REF_ID.Identifier, true, true, true, 22);
		}
		//
		element = M_Element.getbyIdentifier(ELE_AD_Org_ID.Identifier, get_TrxName());
		column = getColumn(element);
		if (column == null)		
			AddColumn(element, "@#AD_Org_ID@", REF_TableDir.Identifier, true, true);		
		//
		element = M_Element.getbyIdentifier(ELE_AD_Client_ID.Identifier, get_TrxName());
		column = getColumn(element);
		if (column == null)		
			AddColumn(element, "@#AD_Client_ID@", REF_TableDir.Identifier, true, true);		
		//
		element = M_Element.getbyIdentifier(ELE_Created.Identifier, get_TrxName()); 
		column = getColumn(element);
		if (column == null)		
			AddColumn(element, REF_DateTime.Identifier, true);
		//
		element = M_Element.getbyIdentifier(ELE_CreatedBy.Identifier, get_TrxName());
		column = getColumn(element);
		if (column == null)
			AddColumn(element, "", REF_Table.Identifier, REF_AD_User.Identifier, false, true, true,  7);				
		//
		element = M_Element.getbyIdentifier(ELE_Updated.Identifier, get_TrxName());		
		column = getColumn(element);
		if (column == null)		
			AddColumn(element, REF_DateTime.Identifier, true);
		//
		element = M_Element.getbyIdentifier(ELE_UpdatedBy.Identifier, get_TrxName());
		column = getColumn(element);
		if (column == null)
			AddColumn(element,"",REF_Table.Identifier, REF_AD_User.Identifier, false, true, true, 7);
		//
		element = M_Element.getbyIdentifier(ELE_IsActive.Identifier, get_TrxName());
		column = getColumn(element);
		if (column == null)
			AddColumn(element,"",REF_YesNo.Identifier, true, true, 1);		
	}
	private MColumn getColumn(M_Element element) {
		String query = "ColumnName = ? AND AD_Table_ID = ?";
		MColumn column = new Query(Env.getCtx(), X_AD_Column.Table_Name, query, null)
		.setParameters(element.getColumnName(), getAD_Table_ID()).first();
		return column;
	}
	private void AddColumn(M_Element element, String defaultvalue, String ref, Boolean mandatory, Boolean internal, int fieldlength)
	{
		AddColumn(element, defaultvalue, ref, "", false, mandatory, internal, fieldlength);
	}
	private void AddColumn(M_Element element, String defaultvalue, String ref, Boolean mandatory, Boolean internal)
	{
		AddColumn(element, defaultvalue, ref, "", false, mandatory, internal, 0);
	}
	private void AddColumn(M_Element element, String ref, Boolean internal)
	{
		AddColumn(element, "", ref, "", false, false, internal, 0);
	}
	private void AddColumn(M_Element element, String ref, boolean iskey, boolean mandatory, boolean internal, int fieldlength) {
		AddColumn(element, "", ref, "", iskey, mandatory, internal, fieldlength);		
	}	
	private void AddColumn(M_Element element, String defaultvalue, String ref, String refvalue, Boolean iskey, Boolean mandatory, Boolean isInternal, int fieldlength) {
		MColumn column = new MColumn(this);
		column.setName(element.getName());
		column.setDescription(element.getDescription());
		column.setHelp (element.getHelp ());
		column.setAD_Element_ID(element.getAD_Element_ID());
		column.setColumnName (element.getColumnName ());
		column.setIsInternal(isInternal);
		column.setIsKey(iskey);
		column.setIsActive(true);
		if (defaultvalue.length() > 0)
			column.setDefaultValue(defaultvalue);
		if (fieldlength > 0)
			column.setFieldLength(fieldlength);
		column.setAD_Reference_ID(Util.getDataReferenceID(ref));
		if (refvalue.length() > 0)
			column.setAD_Reference_Value_ID(Util.getDataReferenceID(refvalue));
		column.setIsMandatory(mandatory);
		column.save();		
	}

	public void createDefaults(int keycnt) {
		//
		M_Element element = null;
		MColumn column = null;
		String query = "ColumnName = ? AND AD_Table_ID = ?";
		
		if (keycnt == 1)
		{
			String ID = getTableName()+"_ID";
			M_Element newID = M_Element.get (getCtx(), ID, get_TrxName());
			if (newID == null)
				newID = new M_Element(Env.getCtx(), 0, get_TrxName());		
			newID.setName(ID);
			newID.setDescription(ID);
			newID.setHelp(ID);
			newID.setColumnName (ID);
			newID.setPrintName(ID);
			newID.save();

			element = M_Element.get (getCtx(), ID, get_TrxName());
			column = new Query(Env.getCtx(), X_AD_Column.Table_Name, query, null)
			.setParameters(element.getColumnName(), getAD_Table_ID()).first();
			if (column == null)
				column = new MColumn(this);
			column.setName(element.getName());
			column.setDescription(element.getDescription());
			column.setHelp (element.getHelp ());
			column.setAD_Element_ID(element.getAD_Element_ID());
			column.setColumnName (element.getColumnName ());
			column.setIsActive(true);
			column.setFieldLength(22);
			column.setIsKey(true);
			column.setIsInternal(false);
			column.setAD_Reference_ID(Util.getDataReferenceID(REF_ID.Identifier));
			column.setIsMandatory(true);
			column.save();
		}
		else
		{
			System.out.println("X");
		}
		
		element = M_Element.getbyIdentifier(ELE_AD_Org_ID.Identifier, get_TrxName());
		column = new Query(Env.getCtx(), X_AD_Column.Table_Name, query, null)
		.setParameters(element.getColumnName(), getAD_Table_ID()).first();
		if (column == null)
			column = new MColumn(this);
		column.setName(element.getName());
		column.setDescription(element.getDescription());
		column.setHelp (element.getHelp ());
		column.setAD_Element_ID(element.getAD_Element_ID());
		column.setColumnName (element.getColumnName ());
		column.setIsActive(true);
		column.setIsInternal(true);
		column.setDefaultValue("@#AD_Org_ID@");
		column.setAD_Reference_ID(Util.getDataReferenceID(REF_TableDir.Identifier));
		column.setIsMandatory(true);
		column.save();
		
		element = M_Element.getbyIdentifier(ELE_AD_Client_ID.Identifier, get_TrxName());
		column = new Query(Env.getCtx(), X_AD_Column.Table_Name, query, null)
		.setParameters(element.getColumnName(), getAD_Table_ID()).first();
		if (column == null)
			column = new MColumn(this);
		column.setName(element.getName());
		column.setDescription(element.getDescription());
		column.setHelp (element.getHelp ());
		column.setAD_Element_ID(element.getAD_Element_ID());
		column.setColumnName (element.getColumnName ());
		column.setIsInternal(true);
		column.setIsActive(true);
		column.setDefaultValue("@#AD_Client_ID@");
		column.setAD_Reference_ID(Util.getDataReferenceID(REF_TableDir.Identifier));
		column.setIsMandatory(true);
		column.save();		

		element = M_Element.getbyIdentifier(ELE_Created.Identifier, get_TrxName()); 
		column = new Query(Env.getCtx(), X_AD_Column.Table_Name, query, null)
		.setParameters(element.getColumnName(), getAD_Table_ID()).first();
		if (column == null)
			column = new MColumn(this);
		column.setName(element.getName());
		column.setDescription(element.getDescription());
		column.setHelp (element.getHelp ());
		column.setIsInternal(true);
		column.setAD_Element_ID(element.getAD_Element_ID());
		column.setColumnName (element.getColumnName ());
		column.setIsActive(true);
		column.setIsMandatory(true);
		column.setFieldLength(7);		
		column.setAD_Reference_ID(Util.getDataReferenceID(REF_DateTime.Identifier));
		column.save();				
		//
		element = M_Element.getbyIdentifier (ELE_CreatedBy.Identifier, get_TrxName());
		column = new Query(Env.getCtx(), X_AD_Column.Table_Name, query, null)
		.setParameters(element.getColumnName(), getAD_Table_ID()).first();
		if (column == null)
			column = new MColumn(this);
		column.setName(element.getName());
		column.setDescription(element.getDescription());
		column.setHelp (element.getHelp ());
		column.setAD_Element_ID(element.getAD_Element_ID());
		column.setColumnName (element.getColumnName ());
		column.setIsActive(true);
		column.setIsInternal(true);
		column.setIsMandatory(true);
		column.setFieldLength(7);		
		column.setAD_Reference_ID(Util.getDataReferenceID(REF_Table.Identifier));
		column.setAD_Reference_Value_ID(Util.getDataReferenceID(REF_AD_User.Identifier));
		column.save();						
		//
		element = M_Element.getbyIdentifier(ELE_Updated.Identifier, get_TrxName());
		column = new Query(Env.getCtx(), X_AD_Column.Table_Name, query, null)
		.setParameters(element.getColumnName(), getAD_Table_ID()).first();
		if (column == null)
			column = new MColumn(this);
		column.setName(element.getName());
		column.setDescription(element.getDescription());
		column.setHelp (element.getHelp ());
		column.setAD_Element_ID(element.getAD_Element_ID());
		column.setIsInternal(true);
		column.setColumnName (element.getColumnName ());
		column.setIsActive(true);		
		column.setIsMandatory(true);
		column.setFieldLength(7);		
		column.setAD_Reference_ID(Util.getDataReferenceID(REF_DateTime.Identifier));
		column.save();		
		//
		element = M_Element.getbyIdentifier(ELE_UpdatedBy.Identifier, get_TrxName());
		column = new Query(Env.getCtx(), X_AD_Column.Table_Name, query, null)
		.setParameters(element.getColumnName(), getAD_Table_ID()).first();
		if (column == null)
			column = new MColumn(this);
		column.setName(element.getName());
		column.setDescription(element.getDescription());
		column.setHelp (element.getHelp ());
		column.setIsInternal(true);
		column.setAD_Element_ID(element.getAD_Element_ID());
		column.setColumnName (element.getColumnName ());
		column.setIsActive(true);
		column.setIsMandatory(true);
		column.setFieldLength(7);		
		column.setAD_Reference_ID(Util.getDataReferenceID(REF_Table.Identifier));
		column.setAD_Reference_Value_ID(Util.getDataReferenceID(REF_AD_User.Identifier));
		column.save();						
		//
		element = M_Element.getbyIdentifier(ELE_IsActive.Identifier, get_TrxName());
		column = new Query(Env.getCtx(), X_AD_Column.Table_Name, query, null)
		.setParameters(element.getColumnName(), getAD_Table_ID()).first();
		if (column == null)
			column = new MColumn(this);		
		column.setName(element.getName());
		column.setDescription(element.getDescription());
		column.setIsInternal(true);
		column.setHelp (element.getHelp ());
		column.setAD_Element_ID(element.getAD_Element_ID());
		column.setColumnName (element.getColumnName ());
		column.setIsActive(true);
		column.setIsMandatory(true);
		column.setFieldLength(1);		
		column.setAD_Reference_ID(Util.getDataReferenceID(REF_YesNo.Identifier));
		column.setAD_Reference_Value_ID(Util.getDataReferenceID(REF_AD_User.Identifier));
		column.setIsUpdateable(true);
		column.save();						
	}

	public static MTable getbyIdentifier(String identifier, String trxName) {
		String where = "Identifier = ? ";
		MTable retValue = new Query(Env.getCtx(), X_AD_Table.Table_Name, where, trxName)
		.setParameters(identifier)
		.first();
		return retValue;
	}

	public static MTable getbyTableName(String name, String trxName) {
		String where = "lower(TableName) = ? ";
		MTable retValue = new Query(Env.getCtx(), X_AD_Table.Table_Name, where, trxName)
		.setParameters(name.toLowerCase())
		.first();
		return retValue;
	}

	public static XmlElement getAll() {
		XmlElement root = new XmlElement();
		String where = "IsActive = 'Y' ";
		String id = "";
		List<X_AD_Table> tables = null;
		try {
		tables  = new Query(Env.getCtx(), X_AD_Table.Table_Name, where, null)
			.setOrderBy("id, name").list();
		} catch (Exception e) {
			return null;
		}		
		XmlElement idcontainer = null;
		for (X_AD_Table table:tables)
		{
			//String type = "";
			if (id.compareTo(table.getID()) != 0)
			{
				id = table.getID();
				idcontainer = new XmlElement("id");			
				idcontainer.addAttribute("uid", "0");
				idcontainer.addAttribute("type", "plugin");
				idcontainer.addAttribute("name", id);
				root.addElement(idcontainer);
			}			
			//XmlElement defaultElement = new XmlElement("folder");		
			//defaultElement.addAttribute("uid", String.valueOf(table.getAD_Table_ID()));
			//defaultElement.addAttribute("type", "table");
			//defaultElement.addAttribute("name", table.getTableName());
			//idcontainer.addElement(defaultElement);
		}
		return root;
	}	
}	//	MTable
