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

import org.compiere.model.persistence.X_AD_Element;
import org.compiere.util.*;


/**
 *	System Element Model
 *	
 *  @author Jorg Janke
 *  @version $Id: M_Element.java 5655 2015-08-24 00:00:34Z xapiens $
 */
public class M_Element extends X_AD_Element
{
	/**
	 * 	Get case sensitive Column Name
	 *	@param columnName case insentitive column name
	 *	@return case sensitive column name
	 */
	public static String getColumnName (String columnName)
	{
		if (columnName == null || columnName.length() == 0)
			return columnName;
		String retValue = columnName;
		String sql = "SELECT ColumnName FROM AD_Element WHERE UPPER(ColumnName)=?";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, null);
			pstmt.setString (1, columnName.toUpperCase());
			ResultSet rs = pstmt.executeQuery ();
			if (rs.next ())
			{
				retValue = rs.getString(1);
				if (rs.next())
					s_log.warning("Not unique: " + columnName 
						+ " -> " + retValue + " - " + rs.getString(1));
			}
			else
				s_log.warning("No found: " + columnName);
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			s_log.log (Level.SEVERE, columnName, e);
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
		return retValue;
	}	//	getColumnName


	public static M_Element getbyIdentifier(String identifier, String trxName) {
		if (identifier == null || identifier.length() == 0)
			return null;		
		String query = "Identifier = ? ";
		M_Element retValue = null;
//		String sql = "SELECT * FROM AD_Element WHERE Identifier=?";
//		PreparedStatement pstmt = null;
		try
		{						
			retValue = new Query(Env.getCtx(), X_AD_Element.Table_Name, query, trxName )
			.setParameters(identifier)
			.first();
//			pstmt = DB.prepareStatement (sql, null);
//			pstmt.setString (1, identifier);
//			ResultSet rs = pstmt.executeQuery ();
//			if (rs.next ())
//			{
//				retValue = new M_Element (Env.getCtx(), rs, trxName);
//			}
//			rs.close ();
//			pstmt.close ();
//			pstmt = null;
		}
		catch (Exception e)
		{
//			e.printStackTrace();
			Trx trx = Trx.get(trxName, false);			
			if (trx != null)
				trx.rollback();
		}
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
		return retValue;		
	}
	
	/**
	 * 	Get Element
	 * 	@param ctx context
	 *	@param columnName case insentitive column name
	 *	@return case sensitive column name
	 */
	public static M_Element get (Properties ctx, String columnName, String trxName)
	{
		if (columnName == null || columnName.length() == 0)
			return null;
		String where = "lower(ColumnName)=?";
		M_Element retValue = new Query(Env.getCtx(), X_AD_Element.Table_Name, where, null).setParameters(columnName.toLowerCase()).first();
//		M_Element retValue = null;
//		String sql = "SELECT * FROM AD_Element WHERE lower(ColumnName)=?";
//		PreparedStatement pstmt = null;
//		try
//		{
//			pstmt = DB.prepareStatement (sql, trxName);
//			pstmt.setString (1, columnName.toLowerCase());
//			ResultSet rs = pstmt.executeQuery ();
//			if (rs.next ())
//			{
//				retValue = new M_Element (ctx, rs, trxName);
//				if (rs.next())
//					s_log.warning("Not unique: " + columnName 
//						+ " -> " + retValue + " - " + rs.getString("ColumnName"));
//			}
//			rs.close ();
//			pstmt.close ();
//			pstmt = null;
//		}
//		catch (Exception e)
//		{
//			s_log.log (Level.SEVERE, sql, e);
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
		return retValue;
	}	//	get

	/**
	 * 	Get Element
	 * 	@param ctx context
	 *	@param columnName case insentitive column name
	 *	@return case sensitive column name
	 */
	public static M_Element getOfColumn (Properties ctx, int AD_Column_ID)
	{
		if (AD_Column_ID ==0)
			return null;
		M_Element retValue = null;
		String sql = "SELECT * FROM AD_Element e "
			+ "WHERE EXISTS (SELECT * FROM AD_Column c "
				+ "WHERE c.AD_Element_ID=e.AD_Element_ID AND c.AD_Column_ID=?)";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, null);
			pstmt.setInt (1, AD_Column_ID);
			ResultSet rs = pstmt.executeQuery ();
			if (rs.next ())
				retValue = new M_Element (ctx, rs, null);
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			s_log.log (Level.SEVERE, sql, e);
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
		return retValue;
	}	//	get
	
	/**	Logger	*/
	private static CLogger	s_log	= CLogger.getCLogger (M_Element.class);
	
	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param AD_Element_ID element
	 *	@param trxName transaction
	 */
	public M_Element (Properties ctx, int AD_Element_ID, String trxName)
	{
		super (ctx, AD_Element_ID, trxName);
		if (AD_Element_ID == 0)
		{
		//	setColumnName (null);
		//	setEntityType (null);	// U
		//	setName (null);
		//	setPrintName (null);
		}	
	}	//	M_Element

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public M_Element (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	M_Element

	/**
	 * 	Minimum Constructor
	 *	@param ctx context
	 *	@param columnName column
	 *	@param EntityType entity type
	 *	@param trxName trx
	 */
	public M_Element (Properties ctx, String columnName, String EntityType,
		String trxName)
	{
		super(ctx, 0, trxName);
		setColumnName (columnName);
		setName (columnName);
		setPrintName (columnName);
		//
		setEntityType (EntityType);	// U
	}	//	M_Element

	
	/**
	 * 	After Save
	 *	@param newRecord new
	 *	@param success success
	 *	@return success
	 */
	protected boolean afterSave (boolean newRecord, boolean success)
	{
		//	Update Columns, Fields, Parameters, Print Info
		if (!newRecord && 
				( is_ValueChanged("Name") || is_ValueChanged("Description") || is_ValueChanged("Help") )
			)
		{
			//	Column
			StringBuffer sql = new StringBuffer("UPDATE AD_Column SET ColumnName=")
				.append(DB.TO_STRING(getColumnName()))
				.append(", Name=").append(DB.TO_STRING(getName()))
				.append(", Description=").append(DB.TO_STRING(getDescription()))
				.append(", Help=").append(DB.TO_STRING(getHelp()))
				.append(" WHERE AD_Element_ID=").append(get_ID());
			int no = DB.executeUpdate(sql.toString(), get_TrxName());
			log.fine("afterSave - Columns updated #" + no);
			
			//	Field
			sql = new StringBuffer("UPDATE AD_Field SET Name=")
				.append(DB.TO_STRING(getName()))
				.append(", Description=").append(DB.TO_STRING(getDescription()))
				.append(", Help=").append(DB.TO_STRING(getHelp()))
				.append(" WHERE AD_Column_ID IN (SELECT AD_Column_ID FROM AD_Column WHERE AD_Element_ID=")
				.append(get_ID())
				.append(") AND IsCentrallyMaintained='Y'");
			no = DB.executeUpdate(sql.toString(), get_TrxName());
			log.fine("Fields updated #" + no);
			
			//	Parameter 
			sql = new StringBuffer("UPDATE AD_Process_Para SET ColumnName=")
				.append(DB.TO_STRING(getColumnName()))
				.append(", Name=").append(DB.TO_STRING(getName()))
				.append(", Description=").append(DB.TO_STRING(getDescription()))
				.append(", Help=").append(DB.TO_STRING(getHelp()))
				.append(", AD_Element_ID=").append(get_ID())
				.append(" WHERE UPPER(ColumnName)=")
				.append(DB.TO_STRING(getColumnName().toUpperCase()))
				.append(" AND IsCentrallyMaintained='Y' AND AD_Element_ID IS NULL");
			no = DB.executeUpdate(sql.toString(), get_TrxName());
			sql = new StringBuffer("UPDATE AD_Process_Para SET ColumnName=")
				.append(DB.TO_STRING(getColumnName()))
				.append(", Name=").append(DB.TO_STRING(getName()))
				.append(", Description=").append(DB.TO_STRING(getDescription()))
				.append(", Help=").append(DB.TO_STRING(getHelp()))
				.append(" WHERE AD_Element_ID=").append(get_ID())
				.append(" AND IsCentrallyMaintained='Y'");
			no += DB.executeUpdate(sql.toString(), get_TrxName());
			log.fine("Parameters updated #" + no);
			
			//	Print Info
			sql = new StringBuffer("UPDATE AD_PrintFormatItem pi SET PrintName=")
				.append(DB.TO_STRING(getPrintName()))
				.append(", Name=").append(DB.TO_STRING(getName()))
				.append(" WHERE IsCentrallyMaintained='Y'")	
				.append(" AND EXISTS (SELECT * FROM AD_Column c ")
					.append("WHERE c.AD_Column_ID=pi.AD_Column_ID AND c.AD_Element_ID=")
					.append(get_ID()).append(")");
			no = DB.executeUpdate(sql.toString(), get_TrxName());
			log.fine("PrintFormatItem updated #" + no);
			
			no = DB.executeUpdate(sql.toString(), get_TrxName());
			log.fine("InfoWindow updated #" + no);
		}
		return success;
	}	//	afterSave
	
	/**
	 * 	String Representation
	 *	@return info
	 */
	public String toString()
	{
		StringBuffer sb = new StringBuffer ("M_Element[");
		sb.append (get_ID()).append ("-").append (getColumnName()).append ("]");
		return sb.toString ();
	}	//	toString
	
}	//	M_Element
