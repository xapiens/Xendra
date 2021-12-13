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
package org.compiere.process;

import java.io.*;

import org.compiere.util.*;
import org.compiere.model.MClient;
import org.compiere.model.MWebStore;

import org.xendra.annotations.XendraProcess;
/**
 *	Client EMail Test
 *	
 *  @author Jorg Janke
 *  @version $Id: EMailTest.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="AD_Client EMailTest",
name="Test EMail",
description="Test EMail Connection",
help="Test EMail Connection based on info defined. An EMail is sent from the request user to the request user.  Also, the web store mail settings are tested.",
Identifier="d9e8200a-9c54-7104-800d-83eeb2296c32",
classname="org.compiere.process.EMailTest",
updated="2015-06-20 10:10:12")
public class EMailTest extends SvrProcess
{
	/** Client Parameter			*/
	protected int	p_AD_Client_ID = 0;
	
	/**
	 * 	Get Parameters
	 */
	protected void prepare ()
	{
		p_AD_Client_ID = getRecord_ID();
		if (p_AD_Client_ID == 0)
			p_AD_Client_ID = Env.getAD_Client_ID(getCtx());
	}	//	prepare

	/**
	 * 	Process - Test EMail
	 *	@return info
	 */
	public String doIt () throws Exception
	{
		MClient client = MClient.get (getCtx(), p_AD_Client_ID);
		log.info(client.toString());
		
		//	 Test Client Mail
		String clientTest = client.testEMail();
		addLog(0, null, null, client.getName() + ": " + clientTest);
		
		//	Test Client DocumentDir
		if (!Ini.isClient())
		{
			String documentDir = client.getDocumentDir();
			if (documentDir == null || documentDir.length() == 0)
				documentDir = ".";
			File file = new File (documentDir);
			if (file.exists() && file.isDirectory())
				addLog(0, null, null, "Found Directory: " + client.getDocumentDir());
			else
				addLog(0, null, null, "Not Found Directory: " + client.getDocumentDir());
		}

		MWebStore[] wstores = MWebStore.getOfClient(client);
		for (int i = 0; i < wstores.length; i++)
		{
			MWebStore store = wstores[i];
			String test = store.testEMail();
			addLog(0, null, null, store.getName() + ": " + test);
		}
		
		return clientTest;
	}	//	doIt
	
}	//	EMailTest
