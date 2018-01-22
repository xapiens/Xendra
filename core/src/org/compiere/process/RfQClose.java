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

import java.util.logging.*;

import org.compiere.model.MRfQ;
import org.compiere.model.MRfQResponse;

import org.xendra.annotations.XendraProcess; 

/**
 *	Close RfQ and Responses	
 *	
 *  @author Jorg Janke
 *  @version $Id: RfQClose.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="C_RfQ_Close",
name="Close RfQ",
description="Close RfQ and Responses",
help="Close the RfQ and all it's Responses",
Identifier="f902021a-dd08-ddd5-c8bf-36cdff8d2d15",
classname="org.compiere.process.RfQClose",
updated="2015-06-20 10:10:12")
public class RfQClose extends SvrProcess
{
	/**	RfQ 			*/
	private int		p_C_RfQ_ID = 0;

	/**
	 * 	Prepare
	 */
	protected void prepare ()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else
				log.log(Level.SEVERE, "prepare - Unknown Parameter: " + name);
		}
		p_C_RfQ_ID = getRecord_ID();
	}	//	prepare

	/**
	 * 	Process
	 *	@see org.compiere.process.SvrProcess#doIt()
	 *	@return message
	 */
	public String doIt () throws Exception
	{
		MRfQ rfq = new MRfQ (getCtx(), p_C_RfQ_ID, get_TrxName());
		if (rfq.get_ID() == 0)
			throw new IllegalArgumentException("No RfQ found");
		log.info("doIt - " + rfq);
		//
		rfq.setProcessed(true);
		rfq.save();
		//
		int counter = 0;
		MRfQResponse[] responses = rfq.getResponses (false, false);
		for (int i = 0; i < responses.length; i++)
		{
			responses[i].setProcessed(false);
			responses[i].save();
			counter++;
		}
		//
		return "# " + counter;
	}	//	doIt
	
}	//	RfQClose
