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

import org.compiere.model.MInOut;
import org.compiere.model.MInOutConfirm;
import org.compiere.util.DisplayType;

import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;
/**
 *	Create Confirmation From Shipment
 *	
 *  @author Jorg Janke
 *  @version $Id: InOutCreateConfirm.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="M_InOut_CreateConfirm",
name="Create Confirmation",
description="Create Confirmations for the Document",
help="The confirmations generated need to be processed (confirmed) before you can process this document",
Identifier="3c35e67b-2010-8ce9-ce87-2629cf658afa",
classname="org.compiere.process.InOutCreateConfirm",
updated="2015-06-20 10:10:12")
public class InOutCreateConfirm extends SvrProcess
{
	/**	Shipment				*/
	private int 	p_M_InOut_ID = 0;
	/**	Confirmation Type		*/
	@XendraProcessParameter(Name="Confirmation Type",
			                ColumnName="ConfirmType",
			                Description="Type of confirmation",
			                Help="",
			                AD_Reference_ID=DisplayType.List,
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
			                Identifier="375da938-fd8a-c120-8153-b15d7a040d31")	
	private String		p_ConfirmType = null;

	
	/**
	 *  Prepare - e.g., get Parameters.
	 */
	protected void prepare()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("ConfirmType"))
				p_ConfirmType = (String)para[i].getParameter();
			else
				log.log(Level.SEVERE, "prepare - Unknown Parameter: " + name);
		}
		p_M_InOut_ID = getRecord_ID();
	}	//	prepare

	/**
	 * 	Create Confirmation
	 *	@return document no
	 *	@throws Exception
	 */
	public String doIt () throws Exception
	{
		log.info("M_InOut_ID=" + p_M_InOut_ID + ", Type=" + p_ConfirmType);
		MInOut shipment = new MInOut (getCtx(), p_M_InOut_ID, null);
		if (shipment.get_ID() == 0)
			throw new IllegalArgumentException("Not found M_InOut_ID=" + p_M_InOut_ID);
		//
		MInOutConfirm confirm = MInOutConfirm.create (shipment, p_ConfirmType, true);
		if (confirm == null)
			throw new Exception ("Cannot create Confirmation for " + shipment.getDocumentNo());
		//
		return confirm.getDocumentNo();
	}	//	doIt
	
}	//	InOutCreateConfirm
