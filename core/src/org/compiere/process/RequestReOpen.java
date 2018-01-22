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

import org.compiere.model.MRequest;

import java.util.logging.*;
import org.compiere.util.*;

import org.xendra.annotations.*;

/**
 *	Re-Open Request
 *	
 *  @author Jorg Janke
 *  @version $Id: RequestReOpen.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="R_Request_ReOpen",
name="Reopen Request",
description="Reopen closed requests",
help="",
Identifier="b33184aa-ec76-cd67-c85c-ee59c152e8fa",
classname="org.compiere.process.RequestReOpen",
updated="2015-06-20 10:10:12")	
public class RequestReOpen extends SvrProcess
{
	/** Request					*/
	@XendraProcessParameter(Name="Request",
			                ColumnName="R_Request_ID",
			                Description="Request from a Business Partner or Prospect",
			                Help="The Request identifies a unique request from a Business Partner or Prospect.",
			                AD_Reference_ID=DisplayType.Search,
			                SeqNo=10,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="0398e751-26f7-b685-f3d0-af2567207b44")	
	private int	p_R_Request_ID = 0;
	
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
			else if (name.equals("R_Request_ID"))
				p_R_Request_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "prepare - Unknown Parameter: " + name);
		}
	}	//	prepare

	/**
	 * 	Process It
	 *	@return message
	 *	@throws Exception
	 */
	protected String doIt () throws Exception
	{
		MRequest request = new MRequest (getCtx(), p_R_Request_ID, get_TrxName());
		log.info(request.toString());
		if (request.get_ID() == 0)
			throw new XendraUserError("@NotFound@ @R_Request_ID@ " + p_R_Request_ID);
		
		request.setR_Status_ID();	//	set default status
		request.setProcessed(false);
		if (request.save() && !request.isProcessed())
			return "@OK@";
		return "@Error@";
	}	//	doUt

}	//	RequestReOpen
