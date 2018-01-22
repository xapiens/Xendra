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
 * 	Callout for Charge Payments
 *	
 *  @author xapiens
 */
public class CalloutPaymentCharge extends CalloutEngine
{
	/**
	 *  Payment_Invoice.
	 *  when Invoice selected
	 *  - set InvoiceAmt = invoiceOpen
	 *  	- DiscountAmt = C_Invoice_Discount (ID, DateTrx)
	 *   	- Amount = invoiceOpen (ID) - Discount
	 * 		- WriteOffAmt,OverUnderAmt = 0
	 *  @param ctx context
	 *  @param WindowNo current Window No
	 *  @param mTab Grid Tab
	 *  @param mField Grid Field
	 *  @param value New Value
	 *  @return null or error message
	 */
	public String charge (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value)
	{
		Integer C_Charge_ID = (Integer)value;
		if (isCalloutActive()		//	assuming it is resetting value
			|| C_Charge_ID == null || C_Charge_ID.intValue() == 0)
			return "";

		//	Check Payment
		int C_Payment_ID = Env.getContextAsInt(ctx, WindowNo, "C_Payment_ID");
		MPayment payment = new MPayment (ctx, C_Payment_ID, null);
		if (payment.getC_Charge_ID() != 0 || payment.getC_Invoice_ID() != 0 
			|| payment.getC_Order_ID() != 0)
			return Msg.getMsg(ctx, "PaymentIsAllocated");
		
		setCalloutActive(true);
		//
		//  Payment Date
		Timestamp ts = Env.getContextAsDate(ctx, WindowNo, "DateTrx");
		//
		Env.setContext(ctx, WindowNo, "C_Charge_ID", C_Charge_ID.toString());
		mTab.setValue("C_Charge_ID", C_Charge_ID);

		setCalloutActive(false);
		return "";
	}	//	invoice

	/**
	 *  Payment_Amounts.
	 *	Change of:
	 *		- IsOverUnderPayment -> set OverUnderAmt to 0
	 *		- C_Currency_ID, C_ConvesionRate_ID -> convert all
	 *		- PayAmt, DiscountAmt, WriteOffAmt, OverUnderAmt -> PayAmt
	 *			make sure that add up to InvoiceOpenAmt
	 *  @param ctx context
	 *  @param WindowNo current Window No
	 *  @param mTab Grid Tab
	 *  @param mField Grid Field
	 *  @param value New Value
	 *  @param oldValue Old Value
	 *  @return null or error message
	 */
	public String amounts (Properties ctx, int WindowNo, GridTab mTab, GridField mField, 
		Object value, Object oldValue)
	{
		if (isCalloutActive())		//	assuming it is resetting value
			return "";
		//	No Invoice
		int C_Charge_ID = Env.getContextAsInt(ctx, WindowNo, "C_Charge_ID");
		if (C_Charge_ID == 0)
			return "";
		setCalloutActive(true);
		//	Get Info from Tab
		BigDecimal ChargeAmt = (BigDecimal)mTab.getValue("ChargeAmt");
		log.fine(" Charge =" + ChargeAmt);

		//	Changed Column
		String colName = mField.getColumnName();

		setCalloutActive(false);
		return "";
	}	//	amounts

	
}	//	CalloutPaymentAllocate
