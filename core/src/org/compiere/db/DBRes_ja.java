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

import java.util.*;

/**
 *  Connection Resource Strings
 *
 *  @author     Stefan Christians 
 *  @version    $Id: DBRes_ja.java 508 2007-11-24 23:06:53Z el_man $
 */
public class DBRes_ja extends ListResourceBundle
{
	/** Data        */
	static final Object[][] contents = new String[][]{
	{ "CConnectionDialog", 	"\u30b3\u30f3\u30d4\u30a8\u30fc\u30ec\u306e\u63a5\u7d9a" },
	{ "Name", 				"\u540d\u524d" },
	{ "AppsHost", 			"\u30a2\u30d7\u30ea\u30b1\u30fc\u30b7\u30e7\u30f3\u30fb\u30b5\u30fc\u30d0" },
	{ "AppsPort", 			"\u30a2\u30d7\u30ea\u30b1\u30fc\u30b7\u30e7\u30f3\u30fb\u30dd\u30fc\u30c8" },
	{ "TestApps", 			"\u30a2\u30d7\u30ea\u30b1\u30fc\u30b7\u30e7\u30f3\u30fb\u30b5\u30fc\u30d0\u306e\u30c6\u30b9\u30c8" },
	{ "DBHost", 			"\u30c7\u30fc\u30bf\u30d9\u30fc\u30b9\u30fb\u30b5\u30fc\u30d0" },
	{ "DBPort", 			"\u30c7\u30fc\u30bf\u30d9\u30fc\u30b9\u30fb\u30dd\u30fc\u30c8" },
	{ "DBName", 			"\u30c7\u30fc\u30bf\u30d9\u30fc\u30b9\u306e\u540d\u524d" },
	{ "DBUidPwd", 			"\u30e6\u30fc\u30b6 / \u30d1\u30b9\u30ef\u30fc\u30c9" },
	{ "ViaFirewall", 		"\u30d5\u30a1\u30a4\u30a2\u30a6\u30a9\u30fc\u30eb" },
	{ "FWHost", 			"\u30d5\u30a1\u30a4\u30a2\u30a6\u30a9\u30fc\u30eb\u30fb\u30b5\u30fc\u30d0" },
	{ "FWPort", 			"\u30d5\u30a1\u30a4\u30a2\u30a6\u30a9\u30fc\u30eb\u30fb\u30dd\u30fc\u30c8" },
	{ "TestConnection", 	"\u30c7\u30fc\u30bf\u30d9\u30fc\u30b9\u30fb\u30b5\u30fc\u30d0\u306e\u30c6\u30b9\u30c8" },
	{ "Type", 				"\u30c7\u30fc\u30bf\u30d9\u30fc\u30b9" },
	{ "BequeathConnection", "\u53e4\u63a5\u7d9a" },
	{ "Overwrite", 			"\u30aa\u30fc\u30f4\u30a1\u30e9\u30a4\u30c8" },
	{ "ConnectionProfile",	"Connection" },
	{ "LAN",		 		"LAN" },
	{ "TerminalServer",		"Terminal Server" },
	{ "VPN",		 		"VPN" },
	{ "WAN", 				"WAN" },
	{ "ConnectionError", 	"\u63a5\u7d9a\u306e\u30a8\u30e9\u30fc" },
	{ "ServerNotActive", 	"\u30b5\u30fc\u30d0\u3092\u898b\u4ed8\u3051\u308c\u306a\u3044" }
	};

	/**
	 * Get Contsnts
	 * @return contents
	 */
	public Object[][] getContents()
	{
		return contents;
	}   //  getContent
}   //  Res
