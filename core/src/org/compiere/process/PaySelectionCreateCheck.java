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

import java.util.*;
import java.util.logging.*;

import org.compiere.model.MBPartner;
import org.compiere.model.MPaySelection;
import org.compiere.model.MPaySelectionCheck;
import org.compiere.model.MPaySelectionLine;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.model.reference.REF__PaymentRule;
import org.compiere.util.DisplayType;
import org.compiere.util.XendraUserError;

import org.xendra.annotations.*;


/**
 *	Create Checks from Payment Selection Line
 *	
 *  @author Jorg Janke
 *  @version $Id: PaySelectionCreateCheck.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="C_PaySelection_CreatePayment",
name="Prepare Payment",
description="Create Prepared Payments (Checks) to be paid",
help="You create the actual Payments via Payment Print/Export",
Identifier="dc8c43e3-c9cb-ccfd-ab35-3ab3645ec155",
classname="org.compiere.process.PaySelectionCreateCheck",
updated="2015-06-20 10:10:12")
public class PaySelectionCreateCheck extends SvrProcess
{
	/**	Target Payment Rule			*/
	@XendraProcessParameter(Name="Overwrite Payment Rule",
			                ColumnName="PaymentRule",
			                Description="Overwrite how to pay the invoice",
			                Help="The Payment Rule indicates how the incoice will be settled - you can overwrite the value from the invoice.",
			                AD_Reference_ID=DisplayType.List,
			                SeqNo=10,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=false,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="4db12abf-36b2-9136-2947-500a00a0c0b6")	
	private String		p_PaymentRule = null;
	/**	Payment Selection			*/
	private int			p_C_PaySelection_ID = 0;
	/** The checks					*/
	private ArrayList<MPaySelectionCheck>	m_list = new ArrayList<MPaySelectionCheck>();
	
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
			else if (name.equals("PaymentRule"))
				p_PaymentRule = (String)para[i].getParameter();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
		p_C_PaySelection_ID = getRecord_ID();
		if (p_PaymentRule != null && p_PaymentRule.equals(REF__PaymentRule.DirectDebit))
			p_PaymentRule = null;
	}	//	prepare

	/**
	 *  Perrform process.
	 *  @return Message (clear text)
	 *  @throws Exception if not successful
	 */
	public String doIt () throws Exception
	{
		log.info ("C_PaySelection_ID=" + p_C_PaySelection_ID
			+ ", PaymentRule=" + p_PaymentRule);
		
		MPaySelection psel = new MPaySelection (getCtx(), p_C_PaySelection_ID, get_TrxName());
		if (psel.get_ID() == 0)
			throw new IllegalArgumentException("Not found C_PaySelection_ID=" + p_C_PaySelection_ID);
		if (psel.isProcessed())
			throw new IllegalArgumentException("@Processed@");
		//
		MPaySelectionLine[] lines = psel.getLines(false);
		for (int i = 0; i < lines.length; i++)
		{
			MPaySelectionLine line = lines[i];
			if (!line.isActive() || line.isProcessed())
				continue;
			createCheck (line);
		}
		//
		psel.setProcessed(true);
		psel.save();
		
		return "@C_PaySelectionCheck_ID@ - #" + m_list.size();
	}	//	doIt

	/**
	 * 	Create Check from line
	 *	@param line
	 *	@throws Exception for invalid bank accounts
	 */
	private void createCheck (MPaySelectionLine line) throws Exception
	{
		//	Try to find one
		for (int i = 0; i < m_list.size(); i++)
		{
			MPaySelectionCheck check = (MPaySelectionCheck)m_list.get(i);
			//	Add to existing
			if (check.getC_BPartner_ID() == line.getInvoice().getC_BPartner_ID())
			{
				check.addLine(line);
				if (!check.save())
					throw new IllegalStateException("Cannot save MPaySelectionCheck");
				line.setC_PaySelectionCheck_ID(check.getC_PaySelectionCheck_ID());
				line.setProcessed(true);
				if (!line.save())
					throw new IllegalStateException("Cannot save MPaySelectionLine");
				return;
			}
		}
		//	Create new
		String PaymentRule = line.getPaymentRule();
		if (p_PaymentRule != null)
		{
			if (!REF__PaymentRule.DirectDebit.equals(PaymentRule))
				PaymentRule = p_PaymentRule;
		}
		MPaySelectionCheck check = new MPaySelectionCheck(line, PaymentRule);
		if (!check.isValid())
		{
			int C_BPartner_ID = check.getC_BPartner_ID();
			MBPartner bp = MBPartner.get(getCtx(), C_BPartner_ID);
			String msg = "@NotFound@ @C_BP_BankAccount@: " + bp.getName();
			throw new XendraUserError(msg);
		}
		if (!check.save())
			throw new IllegalStateException("Cannot save MPaySelectionCheck");
		line.setC_PaySelectionCheck_ID(check.getC_PaySelectionCheck_ID());
		line.setProcessed(true);
		if (!line.save())
			throw new IllegalStateException("Cannot save MPaySelectionLine");
		m_list.add(check);
	}	//	createCheck
	
}	//	PaySelectionCreateCheck
