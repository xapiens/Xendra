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

import org.compiere.model.MInvoice;
import org.compiere.util.DisplayType;

import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;

/**
 *  Copy Invoice Lines
 *
 *	@author Jorg Janke
 *	@version $Id: CopyFromInvoice.java 5583 2015-08-05 14:11:58Z xapiens $
 */
@XendraProcess(value="C_Invoice CopyFrom",
name="Copy Lines",
description="Copy Lines from other Invoice",
help="",
Identifier="51c0d58d-737a-c75a-206a-1a9587f32ab7",
classname="org.compiere.process.CopyFromInvoice",
updated="2015-06-20 10:10:12")	
public class CopyFromInvoice extends SvrProcess
{
	@XendraProcessParameter(Name="Invoice",
			                ColumnName="C_Invoice_ID",
			                Description="Invoice Identifier",
			                Help="The Invoice Document.",
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
			                Identifier="b80f2953-bc41-d47c-2b1f-7637346eb16b")	
	private int		m_C_Invoice_ID = 0;

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
			else if (name.equals("C_Invoice_ID"))
				m_C_Invoice_ID = ((BigDecimal)para[i].getParameter()).intValue();
			else
				log.log(Level.SEVERE, "prepare - Unknown Parameter: " + name);
		}
	}	//	prepare

	/**
	 *  Perform process.
	 *  @return Message 
	 *  @throws Exception if not successful
	 */
	protected String doIt() throws Exception
	{
		int To_C_Invoice_ID = getRecord_ID();
		log.info("From C_Invoice_ID=" + m_C_Invoice_ID + " to " + To_C_Invoice_ID);
		if (To_C_Invoice_ID == 0)
			throw new IllegalArgumentException("Target C_Invoice_ID == 0");
		if (m_C_Invoice_ID == 0)
			throw new IllegalArgumentException("Source C_Invoice_ID == 0");
		MInvoice from = new MInvoice (getCtx(), m_C_Invoice_ID, null);
		MInvoice to = new MInvoice (getCtx(), To_C_Invoice_ID, null);
		//
		int no = to.copyLinesFrom (from, false, false);
		//
		return "@Copied@=" + no;
	}	//	doIt

}	//	CopyFromInvoice
