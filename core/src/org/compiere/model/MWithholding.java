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
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;

import org.compiere.model.persistence.X_C_Withholding;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Util;


/**
 *	Withholding Model
 *	
 *  @author Jorg Janke
 *  @version $Id: MWithholding.java 5105 2013-11-19 20:33:43Z xapiens $
 */
public class MWithholding extends X_C_Withholding
{
	//private Boolean m_BP_Default = false;
	//private Integer m_C_Invoice_ID = 0;
	//private BigDecimal m_Percentfrom3party = Env.ZERO;

	/**
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param C_Withholding_ID id
	 *	@param trxName transaction
	 */
	public MWithholding (Properties ctx, int C_Withholding_ID, String trxName)
	{
		super (ctx, C_Withholding_ID, trxName);
	}	//	MWithholding

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MWithholding (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MWithholding
	
	/**
	 * 	After Save
	 *	@param newRecord new
	 *	@param success success
	 *	@return success
	 */
	protected boolean afterSave (boolean newRecord, boolean success)
	{
		if (newRecord && success)
		{
			insert_Accounting("C_Withholding_Acct", "C_AcctSchema_Default", null);
		}

		return success;
	}	//	afterSave

	/**
	 * 	Before Delete
	 *	@return true
	 */
	protected boolean beforeDelete ()
	{
		return delete_Accounting("C_Withholding_Acct"); 
	}	//	beforeDelete
	
	public BigDecimal calculate(BigDecimal taxBaseAmt) {
		BigDecimal WithHolding = Env.ZERO;
		if (taxBaseAmt.compareTo(getMinAmt()) > 0)
		{
			if (this.getMaxAmt().compareTo(getMinAmt()) > 0)
			{
				if (taxBaseAmt.compareTo(getMaxAmt()) <= 0)
				{
					WithHolding = compute(taxBaseAmt);	
				}				
			}
			else
			{
				WithHolding = compute(taxBaseAmt);
			}
		}
		return WithHolding;
	}

	private BigDecimal compute(BigDecimal taxBaseAmt) {
		BigDecimal WithHolding = Env.ZERO;
		if (isPercentWithholding())
		{
			WithHolding = Util.percent(taxBaseAmt,getPercent());
		}
		else if (getFixAmt().signum() == 0)
		{
			WithHolding = getFixAmt();
		}							
		return WithHolding;
	}
}	//	MWithholding
