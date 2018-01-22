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
 *  Connection Resource Strings (German)
 *
 *  @author     Jorg Janke
 *  @version    $Id: DBRes_de.java 508 2007-11-24 23:06:53Z el_man $
 */
public class DBRes_de extends ListResourceBundle
{
	/** Data        */
	static final Object[][] contents = new String[][]
	{
	{ "CConnectionDialog",  "Xendra Verbindung" },
	{ "Name",               "Name" },
	{ "AppsHost",           "Applikationsserver" },
	{ "AppsPort",           "Port Applikationsserver" },
	{ "TestApps",           "Test Applikationsserver" },
	{ "DBHost",             "Datenbank Server" },
	{ "DBPort",             "Datenbank Port" },
	{ "DBName",             "Datenbank Name" },
	{ "DBUidPwd",           "Nutzer / Kennwort" },
	{ "ViaFirewall",        "???ber Firewall" },
	{ "FWHost",             "Firewall Server" },
	{ "FWPort",             "Firewall Port" },
	{ "TestConnection",     "Teste Datenbankverbindung" },
	{ "Type",               "Datenbank Typ" },
	{ "BequeathConnection", "Bequeath Connection" },
	{ "Overwrite",          "ueberschreiben" },
	{ "ConnectionProfile",	"Verbindungsprofil" },
	{ "LAN",		 		"LAN" },
	{ "TerminalServer",		"Terminal Server" },
	{ "VPN",		 		"VPN" },
	{ "WAN", 				"WAN" },
	{ "ConnectionError",    "Verbindungsfehler" },
	{ "ServerNotActive",    "Rechner nicht erreichbar" }
	};

	/**
	 * Get Contents
	 * @return contents
	 */
	public Object[][] getContents()
	{
		return contents;
	}   //  getContents
}   //  Res_de
