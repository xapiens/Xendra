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

import org.xendra.annotations.XendraProcess;
/**
 * 	Validate Info Window SQL
 *	
 *  @author Jorg Janke
 *  @version $Id: InfoWindowValidate.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="AD_InfoWindow_Validate",
name="Validate",
description="Validate Info Window SQL",
help="Validate generated Info Window SQL",
Identifier="d236ef3a-8fa9-b8dd-c929-76fccbc0cc2d",
classname="org.compiere.process.InfoWindowValidate",
updated="2015-06-20 10:10:12")
public class InfoWindowValidate extends SvrProcess
{
	/**	Info Window			*/
	private int p_AD_InfoWindow_ID = 0;
	
	/**
	 * 	Prepare
	 */
	protected void prepare ()
	{
		p_AD_InfoWindow_ID = getRecord_ID();
	}	//	prepare

	/**
	 * 	Process
	 *	@return info
	 *	@throws Exception
	 */
	protected String doIt ()
		throws Exception
	{
		return null;
	}	//	doIt
	
}	//	InfoWindowValidate
