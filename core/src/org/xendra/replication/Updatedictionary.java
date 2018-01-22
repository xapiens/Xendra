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
package org.xendra.replication;

import java.io.File;
import java.util.logging.Level;
import org.compiere.util.CLogMgt;
import org.compiere.util.DB;

public class Updatedictionary {
	public static void main(String[] args)
	{
		org.compiere.Xendra.startupEnvironment(true);
		CLogMgt.setLevel(Level.FINE);

		//MInvoice invoice = MInvoice.get(Env.getCtx(), 1153450); // any invoice
		//MFactReplication.process((PO) invoice, 99);
		//String path = "/Users/juandamianbernabe/activedictionary/";
		//String path = "c:\\Users\\xapiens\\activedictionary\\";
		String path = "/home/katniss/activedictionary/";
		File dir = new File(path);
		String[] children = dir.list();
		if (children == null) {
			// Either dir does not exist or is not a directory
		} else {
			for (int i=0; i<children.length; i++) {
				// Get filename of file or directory
				String filename = children[i];
				if (filename.indexOf(".") < 0 )
				{
					System.out.println("error en archivo -> "+filename);
					continue;
				}
				String name = "";
				try {
					name = filename.substring(0, filename.indexOf("."));
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
				if (name.length() > 0)
				{
					System.out.println(name);
					String sql = "DELETE from update.activedictionary WHERE name = '"+name+"'";
					int no = DB.executeUpdate(sql, null);
					System.out.println(no);
					sql = "INsert into update.activedictionary (name, content) values ('"+name+"',getXMLDocument('"+filename+"'))";
					no = DB.executeUpdate(sql, null);
					System.out.println(no);
					System.out.println("----");
				}
			}
		}
	}
}

