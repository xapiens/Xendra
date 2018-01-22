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

import java.sql.*;
import java.util.*;
import java.math.*;
import java.util.logging.*;

import org.compiere.model.persistence.X_C_PaymentCharge;
import org.compiere.util.*;

/**
 * 	Payment Charge Model
 *	
 *  @author xapiens
 */
public class MPaymentCharge extends X_C_PaymentCharge
{
	/**
	 * 	Get active Payment Charge of Payment
	 *	@param parent payment
	 *	@return array of allocations
	 */
	public static MPaymentCharge[] get (MPayment parent)
	{
		ArrayList<MPaymentCharge> list = new ArrayList<MPaymentCharge>();
		String sql = "SELECT * FROM C_PaymentCharge WHERE C_Payment_ID=? AND IsActive='Y'";
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement (sql, null);
			pstmt.setInt (1, parent.getC_Payment_ID());
			ResultSet rs = pstmt.executeQuery ();
			while (rs.next ())
				list.add (new MPaymentCharge (parent.getCtx(), rs, parent.get_TrxName()));
			rs.close ();
			pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			s_log.log (Level.SEVERE, sql, e);
		}
		try
		{
			if (pstmt != null)
				pstmt.close ();
			pstmt = null;
		}
		catch (Exception e)
		{
			pstmt = null;
		}
		
		MPaymentCharge[] retValue = new MPaymentCharge[list.size ()];
		list.toArray (retValue);
		return retValue;
	}	//	get

	/**	Logger	*/
	private static CLogger s_log = CLogger.getCLogger (MPaymentCharge.class);
	
	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param C_PaymentCharge_ID id
	 *	@param trxName trx
	 */
	public MPaymentCharge (Properties ctx, int C_PaymentCharge_ID, String trxName)
	{
		super (ctx, C_PaymentCharge_ID, trxName);
		if (C_PaymentCharge_ID == 0)
		{
		//	setC_Payment_ID (0);	//	Parent
		//	setC_Invoice_ID (0);
			setChargeAmt(Env.ZERO);
		}	
	}	//	MPaymentAllocate

	/**	The Invoice				*/
	private MCharge	m_charge = null;
	
	/**
	 * 	Load Cosntructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName trx
	 */
	public MPaymentCharge (Properties ctx, ResultSet rs, String trxName)
	{
		super (ctx, rs, trxName);
	}	//	MPaymentCharge
	
	/**
	 * 	Set C_Charge_ID
	 *	@param C_Charge_ID id
	 */
	public void setC_Charge_ID (int C_Charge_ID)
	{
		super.setC_Charge_ID (C_Charge_ID);
		m_charge = null;
	}	//	setC_Charge_ID
	
	/**
	 * 	Get Invoice
	 *	@return invoice
	 */
	public MCharge getCharge()
	{
		if (m_charge == null && getC_Charge_ID() != 0)
			m_charge = new MCharge(getCtx(), getC_Charge_ID(), get_TrxName());
		return m_charge;
	}	//	getInvoice
	
	/**
	 * 	Get BPartner of Charge
	 *	@return bp
	 */
	public int getC_BPartner_ID()
	{
		if (m_charge == null)
			getCharge();
		if (m_charge == null)
			return 0;
		return m_charge.getC_BPartner_ID();
	}	//	getC_BPartner_ID
	
	
	/**
	 * 	Before Save
	 *	@param newRecord new
	 *	@return true
	 */
	protected boolean beforeSave (boolean newRecord)
	{
		MPayment payment = new MPayment (getCtx(), getC_Payment_ID(), get_TrxName());
		if ((newRecord || is_ValueChanged("C_Charge_ID"))
			&& (payment.getC_Charge_ID() != 0 
				|| payment.getC_Invoice_ID() != 0 
				|| payment.getC_Order_ID() != 0))
		{
			log.saveError("PaymentIsAllocated", "");
			return false;
		}
				
		//	Org
		if (newRecord || is_ValueChanged("C_Charge_ID"))
		{
			getCharge();
			if (m_charge != null)
				setAD_Org_ID(m_charge.getAD_Org_ID());
		}
		
		return true;
	}	//	beforeSave
	
}	//	MPaymentCharge
