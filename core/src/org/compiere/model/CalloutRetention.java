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
 *  @author Xapiens
 *  @version $Id: CalloutRetention.java 508 2007-11-24 23:06:53Z el_man $
 */
public class CalloutRetention extends CalloutEngine
{
	/**
	 *  Retention_Invoice.
	 *  when Invoice selected
	 *  - set invoiceOpen
	 *   	- Amount = invoiceOpen (ID) - Discount
	 *      - Tax Amount - Amount by % of retention
	 * 		- WriteOffAmt,OverUnderAmt = 0
	 *  @param ctx context
	 *  @param WindowNo current Window No
	 *  @param mTab Grid Tab
	 *  @param mField Grid Field
	 *  @param value New Value
	 *  @return null or error message
	 */
	public String tax (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value)
	{
		if (isCalloutActive())		//	assuming it is resetting value
				return "";		
		
		setCalloutActive(true);
		String column = mField.getColumnName();
		BigDecimal baseAmt = Env.ZERO;
		if (column.equals("C_Invoice_ID"))
			baseAmt = (BigDecimal) mTab.getValue("TaxBaseAmt");
		else if (column.equals("TaxBaseAmt"))
			baseAmt = (BigDecimal)value;
				
		Integer C_Currency_ID = (Integer) mTab.getValue("C_Currency_ID");
		BigDecimal taxAmt = MRetention.calculateRetention(baseAmt, C_Currency_ID);
		mTab.setValue("TaxAmt", taxAmt);				
		setCalloutActive(false);
		return "";		
	}
	/**
	 *  Retention_Invoice.
	 *  when Invoice selected
	 *  - set invoiceOpen
	 *   	- Amount = invoiceOpen (ID) - Discount
	 *      - Tax Amount - Amount by % of retention
	 * 		- WriteOffAmt,OverUnderAmt = 0
	 *  @param ctx context
	 *  @param WindowNo current Window No
	 *  @param mTab Grid Tab
	 *  @param mField Grid Field
	 *  @param value New Value
	 *  @return null or error message
	 */
	public String invoice (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value)
	{
		Integer C_Invoice_ID = (Integer)value;
		if (isCalloutActive()		//	assuming it is resetting value
			|| C_Invoice_ID == null || C_Invoice_ID.intValue() == 0)
			return "";
		
		setCalloutActive(true);
		//
		String sql = "SELECT C_BPartner_ID,C_Currency_ID,"		//	1..2
			+ " invoiceOpen(C_Invoice_ID, null), IsSOTrx"					//	3		#1
			+ " FROM C_Invoice WHERE C_Invoice_ID=?";			//			#4
		try
		{
			PreparedStatement pstmt = DB.prepareStatement(sql, null);
			pstmt.setInt(1, C_Invoice_ID.intValue());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next())
			{
				mTab.setValue("C_BPartner_ID", new Integer(rs.getInt(1)));				
				int C_Currency_ID = rs.getInt(2);					//	Set Invoice Currency
				mTab.setValue("C_Currency_ID", new Integer(C_Currency_ID));
				//
				BigDecimal InvoiceOpen = rs.getBigDecimal(3);		//	Set Invoice OPen Amount
				if (InvoiceOpen == null)
					InvoiceOpen = Env.ZERO;
				mTab.setValue("TaxBaseAmt", InvoiceOpen);
				//  reset as dependent fields get reset
				Env.setContext(ctx, WindowNo, "C_Invoice_ID", C_Invoice_ID.toString());
				mTab.setValue("C_Invoice_ID", C_Invoice_ID);				
			}
			rs.close();
			pstmt.close();
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql, e);
			setCalloutActive(false);
			return e.getLocalizedMessage();
		}

		setCalloutActive(false);
		return tax (ctx, WindowNo, mTab, mField, value);
	}	//	invoice
		
}	//	CalloutRetention
