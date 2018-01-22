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
package org.compiere.report;

import java.math.*;
import java.sql.*;
import java.util.*;
import java.util.logging.*;

import org.compiere.model.persistence.X_PA_ReportColumn;
import org.compiere.model.reference.REF_PA_ReportAmountType;
import org.compiere.model.reference.REF_PA_ReportCalculationType;
import org.compiere.model.reference.REF_PA_ReportColumnType;


/**
 *  Report Column Model
 *
 *  @author Jorg Janke
 *  @version $Id: MReportColumn.java 5583 2015-08-05 14:11:58Z xapiens $
 */
public class MReportColumn extends X_PA_ReportColumn
{
	/**
	 * 	Constructor
	 * 	@param ctx context
	 * 	@param PA_ReportColumn_ID id
	 * 	@param trxName transaction
	 */
	public MReportColumn (Properties ctx, int PA_ReportColumn_ID, String trxName)
	{
		super (ctx, PA_ReportColumn_ID, trxName);
		if (PA_ReportColumn_ID == 0)
		{
			setIsPrinted (true);
			setSeqNo (0);
		}
	}	//	MReportColumn

	/**
	 * 	Constructor
	 * 	@param ctx context
	 * 	@param rs ResultSet to load from
	 * 	@param trxName transaction
	 */
	public MReportColumn (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MReportColumn

	/**************************************************************************
	 * 	Get Column SQL Select Clause.
	 * 	@param withSum with SUM() function
	 * 	@return select clause - AmtAcctCR+AmtAcctDR/etc or "null" if not defined
	 */
	public String getSelectClause (boolean withSum)
	{
		//	Amount Type = Period Balance, Period Credit
		String amountType = getAmountType().substring(0,1);	//	first character
		StringBuffer sb = new StringBuffer();
		if (withSum)
			sb.append("SUM(");
		if (AmountType_Balance.equals(amountType))
		//	sb.append("AmtAcctDr-AmtAcctCr");
			sb.append("acctBalance(Account_ID,AmtAcctDr,AmtAcctCr)");
		else if (AmountType_CR.equals(amountType))
			sb.append("AmtAcctCr");
		else if (AmountType_DR.equals(amountType))
			sb.append("AmtAcctDr");
		else if (AmountType_Qty.equals(amountType))
			sb.append("Qty");
		else
		{
			log.log(Level.SEVERE, "AmountType=" + getAmountType () + ", at=" + amountType);
			return "NULL";
		}
		if (withSum)
			sb.append(")");
		return sb.toString();
	}	//	getSelectClause

	/**
	 * 	Is it Period Info ?
	 * 	@return true if Period Amount Type
	 */
	public boolean isPeriod()
	{
		String at = getAmountType();
		if (at == null)
			return false;
		return REF_PA_ReportAmountType.PeriodBalance.equals(at)
			|| REF_PA_ReportAmountType.PeriodCreditOnly.equals(at)
			|| REF_PA_ReportAmountType.PeriodDebitOnly.equals(at)
			|| REF_PA_ReportAmountType.PeriodQuantity.equals(at);
	}	//	isPeriod

	/**
	 * 	Is it Year Info ?
	 * 	@return true if Year Amount Type
	 */
	public boolean isYear()
	{
		String at = getAmountType();
		if (at == null)
			return false;
		return REF_PA_ReportAmountType.YearBalance.equals(at)
			|| REF_PA_ReportAmountType.YearCreditOnly.equals(at)
			|| REF_PA_ReportAmountType.YearDebitOnly.equals(at)
			|| REF_PA_ReportAmountType.YearQuantity.equals(at);
	}	//	isYear

	/**
	 * 	Is it Total Info ?
	 * 	@return true if Year Amount Type
	 */
	public boolean isTotal()
	{
		String at = getAmountType();
		if (at == null)
			return false;
		return REF_PA_ReportAmountType.TotalBalance.equals(at)
			|| REF_PA_ReportAmountType.TotalCreditOnly.equals(at)
			|| REF_PA_ReportAmountType.TotalDebitOnly.equals(at)
			|| REF_PA_ReportAmountType.TotalQuantity.equals(at);
	}	//	isTotalBalance


	/**
	 * 	Get String Representation
	 * 	@return	String Representation
	 */
	public String toString ()
	{
		StringBuffer sb = new StringBuffer ("MReportColumn[")
			.append(get_ID()).append(" - ").append(getName()).append(" - ").append(getDescription())
			.append(", SeqNo=").append(getSeqNo()).append(", AmountType=").append(getAmountType())
			.append(", CurrencyType=").append(getCurrencyType()).append("/").append(getC_Currency_ID())
			.append(" - ColumnType=").append(getColumnType());
		if (isColumnTypeCalculation())
			sb.append(" - Calculation=").append(getCalculationType())
				.append(" - ").append(getOper_1_ID()).append(" - ").append(getOper_2_ID());
		else if (isColumnTypeRelativePeriod())
			sb.append(" - Period=").append(getRelativePeriod());
		else
			sb.append(" - SegmentValue ElementType=").append(getElementType());
		sb.append ("]");
		return sb.toString ();
	}	//	toString

	static final String		AmountType_Balance = "B";
	static final String		AmountType_CR = "C";
	static final String		AmountType_DR = "D";
	static final String		AmountType_Qty = "Q";
	//
	static final String		AmountType_Period = "P";
	static final String		AmountType_Year = "Y";
	static final String		AmountType_Total = "T";

	/**
	 * 	Calculation Type Range
	 *	@return true if range
	 */
	public boolean isCalculationTypeRange()
	{
		return REF_PA_ReportCalculationType.AddRangeOp1ToOp2.equals(getCalculationType());
	}
	/**
	 * 	Calculation Type Add
	 *	@return true id add
	 */
	public boolean isCalculationTypeAdd()
	{
		return REF_PA_ReportCalculationType.AddOp1PlusOp2.equals(getCalculationType());
	}
	/**
	 * 	Calculation Type Subtract
	 *	@return true if subtract
	 */
	public boolean isCalculationTypeSubtract()
	{
		return REF_PA_ReportCalculationType.SubtractOp1_Op2.equals(getCalculationType());
	}
	/**
	 * 	Calculation Type Percent
	 *	@return true if percent
	 */
	public boolean isCalculationTypePercent()
	{
		return REF_PA_ReportCalculationType.PercentageOp1OfOp2.equals(getCalculationType());
	}


	/**
	 * 	Column Type Calculation
	 *	@return true if calculation
	 */
	public boolean isColumnTypeCalculation()
	{
		return REF_PA_ReportColumnType.Calculation.equals(getColumnType());
	}
	/**
	 * 	Column Type Relative Period
	 *	@return true if ralative period
	 */
	public boolean isColumnTypeRelativePeriod()
	{
		return REF_PA_ReportColumnType.RelativePeriod.equals(getColumnType());
	}
	/**
	 * 	Column Type Segment Value
	 *	@return true if segment value
	 */
	public boolean isColumnTypeSegmentValue()
	{
		return REF_PA_ReportColumnType.SegmentValue.equals(getColumnType());
	}
	/**
	 * 	Get Relative Period As Int
	 *	@return relative period
	 */
	public int getRelativePeriodAsInt ()
	{
		BigDecimal bd = getRelativePeriod();
		if (bd == null)
			return 0;
		return bd.intValue();
	}	//	getRelativePeriodAsInt


	/**************************************************************************

	/**
	 * 	Copy
	 * 	@param ctx context
	 * 	@param AD_Client_ID parent
	 * 	@param AD_Org_ID parent
	 * 	@param PA_ReportColumnSet_ID parent
	 * 	@param source copy source
	 * 	@param trxName transaction
	 * 	@return Report Column
	 */
	public static MReportColumn copy (Properties ctx, int AD_Client_ID, int AD_Org_ID, 
		int PA_ReportColumnSet_ID, MReportColumn source, String trxName)
	{
		MReportColumn retValue = new MReportColumn (ctx, 0, trxName);
		MReportColumn.copyValues(source, retValue, AD_Client_ID, AD_Org_ID);
		//
		retValue.setPA_ReportColumnSet_ID(PA_ReportColumnSet_ID);	//	parent
		retValue.setOper_1_ID(0);
		retValue.setOper_2_ID(0);
		return retValue;
	}	//	copy

}	//	MReportColumn
