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

import org.compiere.model.MEntityType;
import org.compiere.util.*;

import org.xendra.annotations.XendraProcess;
/**
 * 	Register Entity Type
 *	
 *  @author Jorg Janke
 *  @version $Id: EntityTypeRegister.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="AD_EntityType_Register",
name="Register Extension",
description="Register your extension with Adempiere",
help="You can register the four character extension with Adempiere. This makes sure that your extension can be automatically distributed and implemented.  You will also be able to certify extensions.  Contact Adempiere for details.",
Identifier="e5aaf6f0-b975-7960-2bf4-58dafe8f4f17",
classname="org.compiere.process.EntityTypeRegister",
updated="2015-06-20 10:10:12")	
public class EntityTypeRegister extends SvrProcess
{
	/** Register Entity Type			*/
	protected int	p_AD_EntityType_ID = 0;
	
	/**
	 * 	Prepare
	 */
	protected void prepare ()
	{
		p_AD_EntityType_ID = getRecord_ID();
	}	//	prepare

	/**
	 * 	Process
	 *	@return summary
	 *	@throws Exception
	 */
	protected String doIt ()
		throws Exception
	{
		log.info("AD_EntityType_ID=" + p_AD_EntityType_ID);
		MEntityType et = new MEntityType(getCtx(), p_AD_EntityType_ID, get_TrxName());
		if (et.isSystemMaintained())
			throw new XendraUserError("You cannot register a System maintained entity");
		
		throw new XendraSystemError("To register an Entity Type, contact Xendra directly");
		
	//	return "Not Supported Yet";
	}	//	doIt
	
}	//	EntityTypeRegister
