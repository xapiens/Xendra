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

//import org.compiere.process.*;
import org.compiere.model.MPayment;
import org.compiere.model.MPaymentValidate;

import java.util.logging.*;
import org.compiere.util.*;

import org.xendra.annotations.*;


/**
 *	Online Payment Process
 *
 *  @author Jorg Janke
 *  @version $Id: PaymentOnline.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="C_Payment Online",
name="Online Process",
description="",
help="",
Identifier="6add155b-ffea-9f74-85fb-1f4b1a354325",
classname="org.compiere.process.PaymentOnline",
updated="2015-06-20 10:10:12")	
public class PaymentOnline extends SvrProcess
{
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
			else
				log.log(Level.SEVERE, "prepare - Unknown Parameter: " + name);
		}
	}	//	prepare

	/**
	 *  Perrform process.
	 *  @return Message
	 *  @throws Exception
	 */
	protected String doIt() throws Exception
	{
		log.info("Record_ID=" + getRecord_ID());
		//	get Payment
		MPayment pp = new MPayment (getCtx(), getRecord_ID(), get_TrxName());
		//	Validate Number
		String msg = MPaymentValidate.validateCreditCardNumber(pp.getCreditCardNumber(), pp.getCreditCardType());
		if (msg != null && msg.length() > 0)
			throw new IllegalArgumentException(Msg.getMsg(getCtx(), msg));
		msg = MPaymentValidate.validateCreditCardExp(pp.getCreditCardExpMM(), pp.getCreditCardExpYY());
		if (msg != null && msg.length() > 0)
			throw new IllegalArgumentException(Msg.getMsg(getCtx(), msg));
		if (pp.getCreditCardVV().length() > 0)
		{
			msg = MPaymentValidate.validateCreditCardVV(pp.getCreditCardVV(), pp.getCreditCardType());
			if (msg != null && msg.length() > 0)
				throw new IllegalArgumentException(Msg.getMsg(getCtx(), msg));
		}
		
		//  Process it
		boolean ok = pp.processOnline();
		pp.save();
		if (!ok)
			throw new Exception(pp.getErrorMessage());
		return "OK";
	}	//	doIt

}	//	PaymentOnline
