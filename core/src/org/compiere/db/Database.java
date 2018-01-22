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
package org.compiere.db;

import org.compiere.util.CLogger;

/**
 *  General Database Constants and Utilities
 *
 *  @author     Jorg Janke
 *  @version    $Id: Database.java 3000 2011-05-20 02:56:35Z xapiens $
 */
public class Database
{
	/**	Logger							*/
	private static CLogger			log = CLogger.getCLogger (Database.class);
	
	/** Oracle ID       */
	public static String        DB_ORACLE   = "Oracle";               	
	/** Derby ID		*/
	public static String        DB_DERBY = "Derby";    
    /** PostgreSQL ID   */
	public static String        DB_POSTGRESQL = "PostgreSQL";
        /** Enterprise DB   */
	//public static String        DB_EDB = "EnterpriseDB";


	/** Supported Databases     */
	public static String[]      DB_NAMES = new String[] {
		 DB_ORACLE
	//	,DB_DERBY
		,DB_POSTGRESQL 
        //        ,DB_EDB
	};

	/** Database Classes        */
	//protected static Class[]    DB_CLASSES = new Class[] {
	//	DB_Oracle.class
	//	,DB_Derby.class
	//	DB_PostgreSQL.class
        //        ,DB_EDB.class        
	//};

	/** Connection Timeout in seconds   */
	public static int           CONNECTION_TIMEOUT = 10;
	
	/**
	 *  Get Database by database Id.
	 *  @return database
	 */
	public static XendraDatabase getDatabase (String type)
	throws Exception
	{
//		XendraDatabase db = null;
//		for (int i = 0; i < Database.DB_NAMES.length; i++)
//		{
//			if (Database.DB_NAMES[i].equals (type))
//			{
//				//db = (XendraDatabase)Database.DB_CLASSES[i].
//				db = DB_PostgreSQL.class.newInstance ();
//				break;
//			}
//		}
		return DB_PostgreSQL.class.newInstance ();
	}
	
	/**
	 *  Get Database Driver by url string.
	 *  Access to database specific functionality.
	 *  @param URL JDBC connection url
	 *  @return Adempiere Database Driver
	 */
	public static XendraDatabase getDatabaseFromURL(String url)
	{
		if (url == null)
		{
			log.severe("No Database URL");
			return null;
		}
//		if (url.indexOf("oracle") != -1)
//			return new DB_Oracle();
//		if (URL.indexOf("derby") != -1)
//			return new DB_Derby();
        if (url.indexOf("postgresql") != -1)
			return new DB_PostgreSQL();

		log.severe("No Database for " + url);
		return null;
	}

}   //  Database
