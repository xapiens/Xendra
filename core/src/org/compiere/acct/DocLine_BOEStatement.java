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
package org.compiere.acct;

import java.math.*;

import org.compiere.model.MBOELine;
import org.compiere.util.*;

/**
 *  BOE Statement Line
 *
 *  @author xapiens
 *  @version  $Id: DocLine_Bank.java,v 1.1 2007/06/15 00:03:24 sergioaguayo Exp $
 */
public class DocLine_BOEStatement extends DocLine
{
	/**
	 *  Constructor
	 *  @param line statement line
	 *  @param doc header
	 */	
	public DocLine_BOEStatement (MBOELine line, Doc_BOEStatement doc)
	{
		super (line, doc);
		m_C_BOE_ID = line.getC_BOE_ID();
		m_C_Invoice_ID = line.getC_Invoice_ID();
		setAmount(line.getAmount());
	}   //  DocLine_Bank

	/** Reversal Flag			*/
	private boolean     m_IsReversal = false;
	/** Bill of Exchange					*/
	private int         m_C_BOE_ID = 0;

	private int 		m_C_Invoice_ID = 0;
	
	//private BigDecimal  m_TrxAmt = Env.ZERO;

	/**
	 *  Get Bill of Exchange
	 *  @return C_BOE_ID
	 */
	public int getC_BOE_ID()
	{
		return m_C_BOE_ID;
	}   //  getC_BOE_ID

	/**
	 *  Get Invoice
	 *  @return C_BOE_ID
	 */
	public int getC_Invoice_ID()
	{
		return m_C_Invoice_ID;
	}   //  getC_Invoice_ID
	
	/**
	 * 	Get AD_Org_ID
	 * 	@param payment if true get Org from payment
	 *	@return org
	 */
	public int getAD_Org_ID (boolean payment)
	{
		if (payment && getC_BOE_ID() != 0)
		{
			String sql = "SELECT AD_Org_ID FROM C_BOE WHERE C_Payment_ID=?";
			int id = DB.getSQLValue(null, sql, getC_BOE_ID());
			if (id > 0)
				return id;
		}
		return super.getAD_Org_ID();
	}	//	getAD_Org_ID
	

}   //  DocLine_BOEStatement
