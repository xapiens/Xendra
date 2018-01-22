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

import org.compiere.model.MAllocationLine;
import org.compiere.util.*;

/**
 *	Allocation Line
 *	
 *  @author Jorg Janke
 *  @version $Id: DocLine_Allocation.java,v 1.1 2007/06/15 00:03:23 sergioaguayo Exp $
 */
public class DocLine_Allocation extends DocLine
{
	/**
	 * 	DocLine_Allocation
	 *	@param line allocation line
	 *	@param doc header
	 */
	public DocLine_Allocation (MAllocationLine line, Doc doc)
	{
		super (line, doc);
		m_GL_JournalLine_ID = line.getGL_JournalLine_ID();
		m_C_Payment_ID = line.getC_Payment_ID();
		m_C_CashLine_ID = line.getC_CashLine_ID();
		m_C_Invoice_ID = line.getC_Invoice_ID();
		m_C_Order_ID = line.getC_Order_ID();
		m_Table_ID = line.getAD_Table_ID();
		m_Record_ID = line.getRecord_ID();
		m_C_BOE_ID = line.getC_BOE_ID();
                m_C_Project_ID = line.getC_Project_ID();
		m_C_PaymentLine_ID = line.getC_PaymentLine_ID();
		m_C_Currency_ID = line.getC_Currency_ID();
		//setC_ConversionType_ID(1);
		//
		setAmount(line.getAmount());
		m_DiscountAmt = line.getDiscountAmt();
		m_WriteOffAmt = line.getWriteOffAmt();
		m_WithholdingAmt = line.getWithholdingAmt();
		m_OverUnderAmt = line.getOverUnderAmt();
	}	//	DocLine_Allocation

	private int 	    m_GL_JournalLine_ID;
	private int         m_C_Invoice_ID;
	private int         m_C_Payment_ID;
	private int         m_C_CashLine_ID;
	private int         m_C_BOE_ID;
	private int         m_Table_ID;
	private int         m_Record_ID;
	private int         m_C_Order_ID;
    private int         m_C_Project_ID;
	private int         m_C_PaymentLine_ID;
	private int         m_C_Currency_ID;
	private BigDecimal  m_DiscountAmt;
	private BigDecimal  m_WriteOffAmt;	
	private BigDecimal  m_WithholdingAmt;
	private BigDecimal  m_OverUnderAmt;
	
	
	/**
	 * 	Get Invoice C_Currency_ID
	 *	@return 0 if no invoice -1 if not found
	 */
	public int getInvoiceC_Currency_ID()
	{
		if (m_C_Invoice_ID == 0)
			return 0;
		String sql = "SELECT C_Currency_ID "
			+ "FROM C_Invoice "
			+ "WHERE C_Invoice_ID=?";
		return  DB.getSQLValue(null, sql, m_C_Invoice_ID);
	}	//	getInvoiceC_Currency_ID

	/**
	 * 	String Representation
	 *	@return info
	 */
	public String toString ()
	{
		StringBuffer sb = new StringBuffer ("DocLine_Allocation[");
		sb.append(get_ID())
			.append(",Amt=").append(getAmtSource())
			.append(",Discount=").append(getDiscountAmt())
			.append(",WriteOff=").append(getWriteOffAmt())
			.append(",C_ConversionType_ID=").append(getC_ConversionType_ID())
			.append(",OverUnderAmt=").append(getOverUnderAmt())
			.append(" - C_Payment_ID=").append(m_C_Payment_ID)
			.append(",C_CashLine_ID=").append(m_C_CashLine_ID)
			.append(",C_Invoice_ID=").append(m_C_Invoice_ID)
			.append(",C_PaymentLine_ID=").append(m_C_PaymentLine_ID)
			.append(",C_Charge_ID=").append(getC_Charge_ID())
                        .append(",GL_JournalLine_ID=").append(m_GL_JournalLine_ID)
			.append(",C_BOE_ID=").append(m_C_BOE_ID)
                        .append(",C_Project_ID=").append(m_C_Project_ID)
			.append(",C_Currency_ID=").append(getC_Currency_ID())
			.append(",AD_Table_ID=").append(getTable_ID())
			.append("]");
		return sb.toString ();
	}	//	toString
	
	
	/**
	 * @return Returns the c_Order_ID.
	 */
	public int getC_Order_ID ()
	{
		return m_C_Order_ID;
	}
	/**
	 * @return Returns the discountAmt.
	 */
	public BigDecimal getDiscountAmt ()
	{
		return m_DiscountAmt;
	}
	/**
	 * @return Returns the overUnderAmt.
	 */
	public BigDecimal getOverUnderAmt ()
	{
		return m_OverUnderAmt;
	}
	/**
	 * @return Returns the writeOffAmt.
	 */
	public BigDecimal getWriteOffAmt ()
	{
		return m_WriteOffAmt;
	}
	/**
	 * @return Returns the writeOffAmt.
	 */
	public BigDecimal getWithholdingAmt ()
	{		
		 
		return m_WithholdingAmt == null ? BigDecimal.ZERO : m_WithholdingAmt ;
	}	
	
	/**
	 * @return Returns the c_CashLine_ID.
	 */
	public int getC_CashLine_ID ()
	{
		return m_C_CashLine_ID;
	}
	/**
	 * @return Returns the c_Invoice_ID.
	 */
	public int getC_Invoice_ID ()
	{
		return m_C_Invoice_ID;
	}
	/**
	 * @return Returns the c_Payment_ID.
	 */
	public int getC_Payment_ID ()
	{
		return m_C_Payment_ID;
	}
	/**
	 * @return Returns the C_PaymentLine_ID.
	 */
	public int getC_PaymentLine_ID ()
	{
		return m_C_PaymentLine_ID;
	}	
	/**
	 * @return Returns the c_BOE_ID.
	 */
	public int getC_BOE_ID ()
	{
		return m_C_BOE_ID;
	}

	public int getGL_JournalLine_ID()
	{
		return m_GL_JournalLine_ID;
	}
		
	public int getTable_ID ()
	{
		return m_Table_ID;
	}
	public int getRecord_ID()
	{
		return m_Record_ID;
	}
	public int getC_Currency_ID()
	{
		return m_C_Currency_ID;
	}

    public int getC_Project_ID()
    {
    	return m_C_Project_ID;
    }
}	//	DocLine_Allocation


