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
import java.text.*;
import java.util.*;
import java.util.logging.*;
import org.compiere.*;
import org.compiere.model.persistence.X_AD_Language;
import org.compiere.util.*;

/**
 * 	Language Model
 *
 *  @author Jorg Janke
 *  @version $Id: MLanguage.java 4604 2013-01-08 22:04:14Z xapiens $
 */
public class MLanguage extends X_AD_Language
{

	/**
	 * 	Get Language Model from Language
	 * 	@param ctx context
	 * 	@param lang language
	 * 	@return language
	 */
	public static MLanguage get (Properties ctx, Language lang)
	{
		return get (ctx, lang.getAD_Language());
	}	//	getMLanguage

	/**
	 * 	Get Language Model from AD_Language
	 * 	@param ctx context
	 *	@param AD_Language language e.g. en_US
	 *	@return language or null
	 */
	public static MLanguage get (Properties ctx, String AD_Language)
	{
		MLanguage lang = null;
		String sql = "SELECT * FROM AD_Language WHERE AD_Language=?";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql, null);
			pstmt.setString(1, AD_Language);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next())
				lang = new MLanguage (ctx, rs, null);
			rs.close();
			pstmt.close();
			pstmt = null;
		}
		catch (SQLException ex)
		{
			s_log.log(Level.SEVERE, "get", ex);
		}
		try
		{
			if (pstmt != null)
				pstmt.close();
		}
		catch (SQLException ex1)
		{
		}
		pstmt = null;
		return lang;
	}	//	get

	/**
	 * 	Load Languages (variants) with Language
	 * 	@param ctx context
	 *	@param LanguageISO language (2 letter) e.g. en
	 *	@return language
	 */
	public static MLanguage[] getWithLanguage (Properties ctx, String LanguageISO)
	{
		ArrayList<MLanguage> list = new ArrayList<MLanguage>();
		String sql = "SELECT * FROM AD_Language WHERE LanguageISO=?";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql, null);
			pstmt.setString(1, LanguageISO);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
				list.add(new MLanguage (ctx, rs, null));
			rs.close();
			pstmt.close();
			pstmt = null;
		}
		catch (SQLException ex)
		{
			s_log.log(Level.SEVERE, sql, ex);
		}
		try
		{
			if (pstmt != null)
				pstmt.close();
		}
		catch (SQLException ex1)
		{
		}
		pstmt = null;
		//
		MLanguage[] languages = new MLanguage[list.size()];
		list.toArray(languages);
		return languages;
	}	//	get

	/**
	 * 	Maintain all active languages
	 * 	@param ctx context
	 */
	public static void maintain (Properties ctx)
	{
		String sql = "SELECT * FROM AD_Language "
			+ "WHERE IsSystemLanguage='Y' AND IsBaseLanguage='N' AND IsActive='Y'";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, null);
			ResultSet rs = pstmt.executeQuery ();
			while (rs.next ())
			{
				MLanguage language = new MLanguage (ctx, rs, null);
				language.maintain(true);
			}
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
				pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			pstmt = null;
		}
	}	//	maintain

	/**	Logger						*/
	private static CLogger		s_log = CLogger.getCLogger (MLanguage.class);

	
	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param AD_Language_ID id
	 *	@param trxName transaction
	 */
	public MLanguage (Properties ctx, int AD_Language_ID, String trxName)
	{
		super (ctx, AD_Language_ID, trxName);
	}	//	MLanguage

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MLanguage (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MLanguage

	/**
	 *	Create Language
	 *	@param ctx context
	 *	@param AD_Language language code
	 * 	@param Name name
	 * 	@param CountryCode country code
	 * 	@param LanguageISO language code
	 *	@param trxName transaction
	 */
	private MLanguage (Properties ctx, String AD_Language, String Name,
		String CountryCode, String LanguageISO, String trxName)
	{
		super(ctx, 0, trxName);
		setAD_Language (AD_Language);	//	en_US
		setIsBaseLanguage (false);
		setIsSystemLanguage (false);
		setName (Name);
		setCountryCode(CountryCode);	//	US
		setLanguageISO(LanguageISO);	//	en
		String sql = "SELECT COALESCE(MAX(AD_Language_ID),0)+1 AS DefaultValue FROM AD_Language";
		setAD_Language_ID(DB.getSQLValue(trxName, sql));
	}	//	MLanguage

	/**	Locale						*/
	private Locale				m_locale = null;
	/**	Date Format					*/
	private SimpleDateFormat	m_dateFormat = null;
	
	/**
	 * 	String Representation
	 *	@return info
	 */
	public String toString()
	{
		return "MLanguage[" + getAD_Language() + "-" + getName()
			+ ",Language=" + getLanguageISO() + ",Country=" + getCountryCode()
			+ "]";
	}	//	toString

	/**
	 * 	Get Locale
	 *	@return Locale
	 */
	public Locale getLocale()
	{
		if (m_locale == null)
			m_locale = new Locale (getLanguageISO(), getCountryCode());
		return m_locale;
	}	//	getLocale

	
	/**
	 *  Get (Short) Date Format.
	 *  The date format must parseable by org.compiere.grid.ed.MDocDate
	 *  i.e. leading zero for date and month
	 *  @return date format MM/dd/yyyy - dd.MM.yyyy
	 */
	public SimpleDateFormat getDateFormat()
	{
		if (m_dateFormat != null)
			return m_dateFormat;

		if (getDatePattern() != null)
		{
			m_dateFormat = (SimpleDateFormat)DateFormat.getDateInstance
				(DateFormat.SHORT, getLocale());
			try
			{
				m_dateFormat.applyPattern(getDatePattern());
			}
			catch (Exception e)
			{
				log.severe(getDatePattern() + " - " + e);
				m_dateFormat = null;
			}
		}
		
		if (m_dateFormat == null)
		{
			//	Fix Locale Date format
			m_dateFormat = (SimpleDateFormat)DateFormat.getDateInstance
				(DateFormat.SHORT, getLocale());
			String sFormat = m_dateFormat.toPattern();
			//	some short formats have only one M and d (e.g. ths US)
			if (sFormat.indexOf("MM") == -1 && sFormat.indexOf("dd") == -1)
			{
				String nFormat = "";
				for (int i = 0; i < sFormat.length(); i++)
				{
					if (sFormat.charAt(i) == 'M')
						nFormat += "MM";
					else if (sFormat.charAt(i) == 'd')
						nFormat += "dd";
					else
						nFormat += sFormat.charAt(i);
				}
				//	System.out.println(sFormat + " => " + nFormat);
				m_dateFormat.applyPattern(nFormat);
			}
			//	Unknown short format => use JDBC
			if (m_dateFormat.toPattern().length() != 8)
				m_dateFormat.applyPattern("yyyy-MM-dd");

			//	4 digit year
			if (m_dateFormat.toPattern().indexOf("yyyy") == -1)
			{
				sFormat = m_dateFormat.toPattern();
				String nFormat = "";
				for (int i = 0; i < sFormat.length(); i++)
				{
					if (sFormat.charAt(i) == 'y')
						nFormat += "yy";
					else
						nFormat += sFormat.charAt(i);
				}
				m_dateFormat.applyPattern(nFormat);
			}
		}
		//
		m_dateFormat.setLenient(true);
		return m_dateFormat;
	}   //  getDateFormat
	
	/**
	 * 	Set AD_Language_ID
	 */
	private void setAD_Language_ID()
	{
		int AD_Language_ID = getAD_Language_ID();
		if (AD_Language_ID == 0)
		{
			String sql = "SELECT COALESCE(MAX(AD_Language_ID), 999999) FROM AD_Language WHERE AD_Language_ID > 1000";
			AD_Language_ID = DB.getSQLValue (get_TrxName(), sql);
			setAD_Language_ID(AD_Language_ID+1);
		}
	}	//	setAD_Language_ID

	/**
	 * 	Before Save
	 *	@param newRecord new
	 *	@return true/false
	 */
	protected boolean beforeSave (boolean newRecord)
	{
		String dp = getDatePattern();
		if (is_ValueChanged("DatePattern") && dp != null && dp.length() > 0)
		{
			if (dp.indexOf("MM") == -1)
			{
				log.saveError("Error", Msg.parseTranslation(getCtx(), "@Error@ @DatePattern@ - No Month (MM)"));
				return false;
			}
			if (dp.indexOf("dd") == -1)
			{
				log.saveError("Error", Msg.parseTranslation(getCtx(), "@Error@ @DatePattern@ - No Day (dd)"));
				return false;
			}
			if (dp.indexOf("yy") == -1)
			{
				log.saveError("Error", Msg.parseTranslation(getCtx(), "@Error@ @DatePattern@ - No Year (yy)"));
				return false;
			}
			
			m_dateFormat = (SimpleDateFormat)DateFormat.getDateInstance
				(DateFormat.SHORT, getLocale());
			try
			{
				m_dateFormat.applyPattern(dp);
			}
			catch (Exception e)
			{
				log.saveError("Error", Msg.parseTranslation(getCtx(), "@Error@ @DatePattern@ - " + e.getMessage()));
				m_dateFormat = null;
				return false;
			}
		}
		if (newRecord)
			setAD_Language_ID();
		return true;
	}	//	beforeSae
	
	/**
	 * 	AfterSave
	 *	@param newRecord new
	 *	@param success success
	 *	@return true if saved
	 */
	protected boolean afterSave (boolean newRecord, boolean success)
	{
		int no = TranslationTable.getActiveLanguages(true);
		log.fine("Active Languages=" + no);
		return true;
	}	//	afterSave

	
	/**************************************************************************
	 * 	Maintain Translation
	 *	@param add if true add missing records - otherwise delete
	 *	@return number of records deleted/inserted
	 */
	public int maintain (boolean add)
	{
		String sql = "SELECT TableName FROM AD_Table WHERE TableName LIKE '%_Trl' ORDER BY 1";
		PreparedStatement pstmt = null;
		int retNo = 0;
		try
		{
			pstmt = DB.prepareStatement(sql, null);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				if (add)
					retNo += addTable (rs.getString(1));
				else
					retNo += deleteTable (rs.getString(1));
			}
			rs.close();
			pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, sql, e);
		}
		try
		{
			if (pstmt != null)
				pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			pstmt = null;
		}
		return retNo;
	}	//	maintain

	/**
	 * 	Delete Translation
	 *	@param tableName table name
	 *	@return number of records deleted
	 */
	private int deleteTable (String tableName)
	{
		String sql = "DELETE  FROM  " + tableName 
			+ " WHERE AD_Language='" + getAD_Language() + "'";
		int no = DB.executeUpdate(sql, get_TrxName());
		log.fine(tableName + " #" + no);
		return no;
	}	//	deleteTable

	/**
	 * 	Add Translation to table
	 *	@param tableName table name
	 *	@return number of records inserted
	 */
	private int addTable (String tableName)
	{
		String baseTable = tableName.substring(0, tableName.length()-4);
		String relname = DB.getSQLValueString(null, "SELECT relname FROM pg_class WHERE relname=?", baseTable.toLowerCase());
		if (relname == null)
			return 0;
		String sql = "SELECT c.ColumnName "
			+ "FROM AD_Column c"
			+ " INNER JOIN AD_Table t ON (c.AD_Table_ID=t.AD_Table_ID) "
			+ "WHERE t.TableName=?"
			+ "  AND c.IsTranslated='Y' AND c.IsActive='Y' "
			+ "ORDER BY 1";
		ArrayList<String> columns = new ArrayList<String>(5);
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql, null);
			pstmt.setString(1, baseTable);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
				columns.add(rs.getString(1));
			rs.close();
			pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, sql, e);
		}
		try
		{
			if (pstmt != null)
				pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			pstmt = null;
		}
		//	Columns
		if (columns.size() == 0)
		{
			log.log(Level.SEVERE, "No Columns found for " + baseTable);
			return 0;
		}
		StringBuffer cols = new StringBuffer();
		for (int i = 0; i < columns.size(); i++)
			cols.append(",").append(columns.get(i));
			
		//	Insert Statement
		int AD_User_ID = Env.getAD_User_ID(getCtx());
		String keyColumn = baseTable + "_ID";
		String insert = "INSERT INTO " + tableName
			+ "(AD_Language,IsTranslated, AD_Client_ID,AD_Org_ID, "
			+ "Createdby,UpdatedBy, "
			+ keyColumn + cols + ") "
			+ "SELECT '" + getAD_Language() + "','N', AD_Client_ID,AD_Org_ID, "
			+ AD_User_ID + "," + AD_User_ID + ", "
			+ keyColumn + cols
			+ " FROM " + baseTable
			+ " WHERE " + keyColumn + " NOT IN (SELECT " + keyColumn
				+ " FROM " + tableName
				+ " WHERE AD_Language='" + getAD_Language() + "')";
		//	+ " WHERE (" + keyColumn + ",'" + getAD_Language()+ "') NOT IN (SELECT " 
		//		+ keyColumn + ",AD_Language FROM " + tableName + ")";
		int no = DB.executeUpdate(insert, get_TrxName());
		log.fine(tableName + " #" + no);
		return no;
	}	//	addTable


	/**************************************************************************
	 * 	Setup
	 *	@param args args
	 */
	public static void main(String[] args)
	{
		System.out.println("Language");
		Xendra.startup(true);

		System.out.println(MLanguage.get(Env.getCtx(), "de_DE"));
		System.out.println(MLanguage.get(Env.getCtx(), "en_US"));

		/**
		Locale[] locales = Locale.getAvailableLocales();
		for (int i = 0; i < locales.length; i++)
		{
			Locale loc = locales[i];
			if (loc.getVariant() != null && loc.getVariant().length() != 0)
				continue;
			if (loc.getCountry() != null && loc.getCountry().length() != 0)
				continue;

			System.out.println(loc.toString()
				+ " - " + loc.getDisplayName()
				+ " + " + loc.getCountry()
				+ " + " + loc.getLanguage()
			);
			MLanguage lang = new MLanguage (Env.getCtx(), loc.toString(),
				loc.getDisplayName(), loc.getCountry(), loc.getLanguage());
			lang.save();
			System.out.println(lang);
		}
	   /**/
	}	//	main

}	//	MLanguage
