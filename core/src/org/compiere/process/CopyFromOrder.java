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

import java.math.*;
import java.util.logging.*;

import org.compiere.model.MOrder;
import org.compiere.util.DisplayType;

import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;
/**
 *  Copy Order Lines
 *
 *	@author Jorg Janke
 *	@version $Id: CopyFromOrder.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="C_Order CopyFrom",
name="Copy Lines",
description="Copy Lines from other Order",
help="",
Identifier="de7e22a0-8b97-ad4e-8439-593479632e55",
classname="org.compiere.process.CopyFromOrder",
updated="2015-06-20 10:10:12")	
public class CopyFromOrder extends SvrProcess
{
	/**	The Order				*/
	@XendraProcessParameter(Name="Order",
			                ColumnName="C_Order_ID",
			                Description="Order",
			                Help="The Order is a control document.  The  Order is complete when the quantity ordered is the same as the quantity shipped and invoiced.  When you cloase an order, unshipped (backordered) quantities are cancelled.",
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
			                Identifier="5055e1c3-c72c-3e7b-d184-49cad44ead76")	
	private int		p_C_Order_ID = 0;

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
			else if (name.equals("C_Order_ID"))
				p_C_Order_ID = ((BigDecimal)para[i].getParameter()).intValue();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}	//	prepare

	/**
	 *  Perrform process.
	 *  @return Message (clear text)
	 *  @throws Exception if not successful
	 */
	protected String doIt() throws Exception
	{
		int To_C_Order_ID = getRecord_ID();
		log.info("From C_Order_ID=" + p_C_Order_ID + " to " + To_C_Order_ID);
		if (To_C_Order_ID == 0)
			throw new IllegalArgumentException("Target C_Order_ID == 0");
		if (p_C_Order_ID == 0)
			throw new IllegalArgumentException("Source C_Order_ID == 0");
		MOrder from = new MOrder (getCtx(), p_C_Order_ID, get_TrxName());
		MOrder to = new MOrder (getCtx(), To_C_Order_ID, get_TrxName());
		//
		int no = to.copyLinesFrom (from, false, false);		//	no Attributes
		//
		return "@Copied@=" + no;
	}	//	doIt

}	//	CopyFromOrder
