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

import org.compiere.model.MDistribution;
import org.compiere.util.*;

import org.xendra.annotations.XendraProcess;

/**
 *	Verify GL Distribution
 *	
 *  @author Jorg Janke
 *  @version $Id: DistributionVerify.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="GL_Distribution_Verify",
name="Verify",
description="Verify GL Distribution",
help="",
Identifier="39029466-c4cc-0dc4-e4e3-7de4f7341590",
classname="org.compiere.process.DistributionVerify",
updated="2015-06-20 10:10:12")	
public class DistributionVerify extends SvrProcess
{

	/**
	 * 	Prepare
	 */
	protected void prepare ()
	{
	}	//	prepare

	/**
	 * 	Process
	 *	@return message
	 *	@throws Exception
	 */
	protected String doIt () throws Exception
	{
		log.info("doIt - GL_Distribution_ID=" + getRecord_ID());
		MDistribution distribution = new MDistribution (getCtx(), getRecord_ID(), get_TrxName());
		if (distribution.get_ID() == 0)
			throw new XendraUserError("Not found GL_Distribution_ID=" + getRecord_ID());

		String error = distribution.validate();
		boolean saved = distribution.save();
		if (error != null)
			throw new XendraUserError(error);
		if (!saved)
			throw new XendraSystemError("@NotSaved@");
		
		return "@OK@";
	}	//	doIt

}	//	DistributionVerify
