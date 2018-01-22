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
import org.compiere.util.*;

/**
 *	BOE Confirmation Callouts
 *	
 *  @author Xapiens
 *  @version $Id: CalloutBOEConfirmation.java 1334 2010-06-28 22:19:10Z xapiens $
 */
public class CalloutBOEConfirmation extends CalloutEngine
{
	/**
	 *  BOE Confirmation
	 *  when BOE selected
	 *  - set C_Currency, DiscountAnt, Amount, WriteOffAmt
	 *	@param ctx context
	 *	@param WindowNo window no
	 *	@param mTab tab
	 *	@param mField field
	 *	@param value value
	 *	@return null or error message
	 */
	public String boe (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value)
	{
		if (isCalloutActive())		//	assuming it is resetting value
			return "";
		setCalloutActive(true);
		
		if (value == null)
		{
			mTab.setValue("C_BOE_ID", null);
			setCalloutActive(false);
			return "";
		}
		int C_BOE_ID = (Integer) value;
		//
		int C_Currency_ID = Env.getContextAsInt(ctx, WindowNo, "C_Currency_ID");
		//
		String sql = "SELECT b.C_BPartner_ID,"		//	1..2
			+ "currencyConvert(b.GrandTotal, b.C_Currency_ID, ?, b.DateBOE, null, b.AD_Client_ID, b.AD_Org_ID), b.IsSOTrx "			//	3..4
			+ "FROM C_BOE b WHERE C_BOE_ID=?";
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql, null);
			pstmt.setInt(1, C_Currency_ID);
			pstmt.setInt(2, C_BOE_ID);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next())
			{
				BigDecimal BOEGrandTotal = rs.getBigDecimal(2);
				boolean isSOTrx = "Y".equals(rs.getString(3));
				if (!isSOTrx)
				{
					BOEGrandTotal = BOEGrandTotal.negate();
				}
				mTab.setValue("C_BPartner_ID", new Integer(rs.getInt(1)));
				mTab.setValue("Amount", BOEGrandTotal);
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, "boe", e);
			setCalloutActive(false);
			return e.getLocalizedMessage();
		}
		setCalloutActive(false);
		return "";
	}	//	CashJournal_BOE

}	//	Callout BOE Confirmation
