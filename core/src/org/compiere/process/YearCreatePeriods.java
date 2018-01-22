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

import org.compiere.model.MYear;
import org.compiere.util.*;

import org.xendra.annotations.*;

/**
 *	Create Periods of year
 *	
 *  @author Jorg Janke
 *  @version $Id: YearCreatePeriods.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="C_Year Create Periods",
name="Create Periods ",
description="Create 12 standard calendar periods (Jan-Dec)",
help="",
Identifier="8e296982-10cd-3044-f422-b56e0f8f943e",
classname="org.compiere.process.YearCreatePeriods",
updated="2015-06-20 10:10:12")	
public class YearCreatePeriods extends SvrProcess
{
	private int	p_C_Year_ID = 0;
	
	/**
	 * 	Prepare
	 */
	protected void prepare ()
	{
		p_C_Year_ID = getRecord_ID();
	}	//	prepare

	/**
	 * 	Process
	 *	@return info
	 *	@throws Exception
	 */
	protected String doIt ()
		throws Exception
	{
		MYear year = new MYear (getCtx(), p_C_Year_ID, get_TrxName());
		if (p_C_Year_ID == 0 || year.get_ID() != p_C_Year_ID)
			throw new XendraUserError ("@NotFound@: @C_Year_ID@ - " + p_C_Year_ID);
		log.info(year.toString());
		//
		if (year.createStdPeriods(null))
			return "@OK@";
		return "@Error@";
	}	//	doIt
	
}	//	YearCreatePeriods
