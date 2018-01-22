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

//import org.compiere.util.*;
import org.xendra.annotations.XendraProcess;

/**
 * 	Validate Support
 *	
 *  @author Jorg Janke
 *  @version $Id: SystemValidate.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="AD_System Validate Support",
name="Validate Support",
description="Validate Support Contract",
help="The process connects to the Adempiere Support Services server and validates the support contract.  To sign up for support, please go to http://www.adempiere.org",
Identifier="d64de632-c83c-d8c9-e38f-5893d04c2a08",
classname="org.compiere.process.SystemValidate",
updated="2015-06-20 10:10:12")
public class SystemValidate extends SvrProcess
{
	/**
	 * 	Prepare
	 */
	protected void prepare ()
	{
	}	//	prepare

	/**
	 * 	Process
	 *	@return -
	 *	@throws Exception
	 */
	public String doIt () throws Exception
	{
		return "@OK@";
	}	//	doIt
	
}	//	SystemValidate
