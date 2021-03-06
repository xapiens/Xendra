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

import java.math.*;
import java.sql.*;
import java.util.*;
import java.util.logging.*;

import org.compiere.model.persistence.X_C_Charge;
import org.compiere.util.*;

/**
 *	Charge Model
 *	
 *  @author Jorg Janke
 *  @version $Id: MCharge.java 3654 2011-11-04 01:49:49Z xapiens $
 */
public class MCharge extends X_C_Charge
{
	/**
	 *  Get Charge Account
	 *  @param C_Charge_ID charge
	 *  @param as account schema
	 *  @param amount amount for expense(+)/revenue(-)
	 *  @return Charge Account or null
	 */
	public static MAccount getAccount (int C_Charge_ID, MAcctSchema as, BigDecimal amount)
	{
		if (C_Charge_ID == 0 || as == null)
			return null;

		int acct_index = 1;     //  Expense (positive amt)
		if (amount != null && amount.signum() < 0)
			acct_index = 2;     //  Revenue (negative amt)
		String sql = "SELECT CH_Expense_Acct, CH_Revenue_Acct FROM C_Charge_Acct WHERE C_Charge_ID=? AND C_AcctSchema_ID=?";
		int Account_ID = 0;
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql, null);
			pstmt.setInt (1, C_Charge_ID);
			pstmt.setInt (2, as.getC_AcctSchema_ID());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next())
				Account_ID = rs.getInt(acct_index);
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			s_log.log(Level.SEVERE, sql, e);
			return null;
		}
		//	No account
		if (Account_ID == 0)
		{
			s_log.severe ("NO account for C_Charge_ID=" + C_Charge_ID);
			return null;
		}

		//	Return Account
		MAccount acct = MAccount.get (as.getCtx(), Account_ID);
		return acct;
	}   //  getAccount

	/**
	 * 	Get MCharge from Cache
	 *	@param ctx context
	 *	@param C_Charge_ID id
	 *	@return MCharge
	 */
	public static MCharge get (Properties ctx, int C_Charge_ID)
	{
		Integer key = new Integer (C_Charge_ID);
		MCharge retValue = (MCharge)s_cache.get (key);
		if (retValue != null)
			return retValue;
		retValue = new MCharge (ctx, C_Charge_ID, null);
		if (retValue.get_ID() != 0)
			s_cache.put (key, retValue);
		return retValue;
	}	//	get

	/**	Cache						*/
	private static CCache<Integer, MCharge> s_cache 
		= new CCache<Integer, MCharge> ("C_Charge", 10);
	
	/**	Static Logger	*/
	private static CLogger	s_log	= CLogger.getCLogger (MCharge.class);
	
	
	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param C_Charge_ID id
	 *	@param trxName transaction
	 */
	public MCharge (Properties ctx, int C_Charge_ID, String trxName)
	{
		super (ctx, C_Charge_ID, null);
		if (C_Charge_ID == 0)
		{
			setChargeAmt (Env.ZERO);
			setIsSameCurrency (false);
			setIsSameTax (false);
			setIsTaxIncluded (false);	// N
		//	setName (null);
		//	setC_TaxCategory_ID (0);
		}
	}	//	MCharge

	/**
	 * 	Load Constructor
	 *	@param ctx ctx
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MCharge (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MCharge

	/**
	 * 	After Save
	 *	@param newRecord new
	 *	@param success success
	 *	@return success
	 */
	protected boolean afterSave (boolean newRecord, boolean success)
	{
		if (newRecord && success)
			insert_Accounting("C_Charge_Acct", "C_AcctSchema_Default", null);

		return success;
	}	//	afterSave

	/**
	 * 	Before Delete
	 *	@return true
	 */
	protected boolean beforeDelete ()
	{
		return delete_Accounting("C_Charge_Acct"); 
	}	//	beforeDelete

}	//	MCharge
