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
 *  @author     Jorg Janke
 *  @version    $Id: DBRes.java 5235 2014-03-03 04:13:51Z xapiens $
 */
public class DBRes extends ListResourceBundle
{
	/** Data        */
	static final Object[][] contents = new String[][]{
	{ "CConnectionDialog", 	"Xendra Connection" },
	{ "Name", 				"Name" },
	{ "AppsHost", 			"Application Host" },
	{ "Port",           	"Port" },
	{ "AppsPort", 			"Application Port" },
	{ "TestApps", 			"Test Application Server" },
	{ "DBHost", 			"Database Host" },
	{ "DBPort", 			"Database Port" },
	{ "DBHostBackup",		"Backup Host" },
	{ "DBPortBackup",		"Backup Port"},	
	{ "DBName", 			"Database Name" },
	{ "DBUid", 				"User" },
	{ "DBPwd", 				"Password" },
	{ "ViaFirewall", 		"via Firewall" },
	{ "FWHost", 			"Firewall Host" },
	{ "FWPort", 			"Firewall Port" },
	{ "TestConnection", 	"Test Database" },
	{ "Type", 				"Database Type" },
	{ "BequeathConnection", "Bequeath Connection" },
	{ "Overwrite", 			"Overwrite" },
	{ "ConnectionProfile",	"Connection" },
	{ "LAN",		 		"LAN" },
	{ "TerminalServer",		"Terminal Server" },
	{ "VPN",		 		"VPN" },
	{ "WAN", 				"WAN" },
	{ "ConnectionError", 	"Connection Error" },
	{ "ServerNotActive", 	"Server Not Active" },
	{ "ServerLocal", 		"Run as Local Server"}
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
