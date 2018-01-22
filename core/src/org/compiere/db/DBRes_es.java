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
 *  @author     Erwin Cortes
 *  @version    $Id: DBRes_es.java 4589 2013-01-04 16:00:03Z xapiens $
 */
public class DBRes_es extends ListResourceBundle
{
	/** Data        */
	static final Object[][] contents = new String[][]{
	{ "CConnectionDialog",  "Conexi\u00F3n de Xendra" },
	{ "Name",               "Nombre" },
	{ "AppsHost",           "Servidor de Aplicaci\u00F3n" },
	{ "Port",           	"Puerto" },
	{ "AppsPort",           "Puerto de Aplicaci\u00F3n" },	
	{ "DBPort",             "Puerto de Base de Datos" },	
	{ "TestApps",           "Test de Aplicaci\u00F3n" },
	{ "DBHost",             "Host de Base de Datos" },
	{ "DBHostBackup",		"Host Secundario" },
	{ "DBPortBackup",		"Puerto de Base Secundaria"},
	{ "DBName",             "Nombre de Base de datos" },
	{ "DBUid",  	        "Usuario" },
	{ "DBPwd",				"Contrase\u00F1a" },
	{ "ViaFirewall",        "via Firewall" },
	{ "FWHost",             "Servidor de Firewall" },
	{ "FWPort",             "Puerto del Firewall" },
	{ "TestConnection",     "Test de Base de datos" },
	{ "Type",               "Tipo de Base de Datos" },
	{ "BequeathConnection", "Conexi\u00F3n Heredada" },
	{ "Overwrite",          "Sobreescribir" },
	{ "RMIoverHTTP", 		"Tunelizar Objetos via HTTP" },
	{ "ConnectionError",    "Error en conexi\u00F3n" },
	{ "ServerNotActive",    "Servidor inactivo" }};

	/**
	 * Get Contsnts
	 * @return contents
	 */
	public Object[][] getContents()
	{
		return contents;
	}
}   //  Res
