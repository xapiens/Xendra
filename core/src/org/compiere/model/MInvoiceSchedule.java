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

import org.compiere.model.persistence.X_C_InvoiceSchedule;
import org.compiere.model.reference.REF_C_InvoiceScheduleInvoiceFrequency;
import org.compiere.model.reference.REF_Weekdays;
import org.compiere.util.*;

/**
 *	Invoice Schedule Model
 *	
 *  @author Jorg Janke
 *  @version $Id: MInvoiceSchedule.java 5583 2015-08-05 14:11:58Z xapiens $
 */
public class MInvoiceSchedule extends X_C_InvoiceSchedule
{
	/**
	 * 	Get MInvoiceSchedule from Cache
	 *	@param ctx context
	 *	@param C_InvoiceSchedule_ID id
	 *	@param trxName transaction
	 *	@return MInvoiceSchedule
	 */
	public static MInvoiceSchedule get (Properties ctx, int C_InvoiceSchedule_ID, String trxName)
	{
		Integer key = new Integer (C_InvoiceSchedule_ID);
		MInvoiceSchedule retValue = (MInvoiceSchedule) s_cache.get (key);
		if (retValue != null)
			return retValue;
		retValue = new MInvoiceSchedule (ctx, C_InvoiceSchedule_ID, trxName);
		if (retValue.get_ID () != 0)
			s_cache.put (key, retValue);
		return retValue;
	}	//	get

	/**	Cache						*/
	private static CCache<Integer,MInvoiceSchedule>	s_cache	= new CCache<Integer,MInvoiceSchedule>("C_InvoiceSchedule", 5);
	
	
	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param C_InvoiceSchedule_ID id
	 *	@param trxName transaction
	 */
	public MInvoiceSchedule (Properties ctx, int C_InvoiceSchedule_ID, String trxName)
	{
		super (ctx, C_InvoiceSchedule_ID, trxName);
	}	//	MInvoiceSchedule

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MInvoiceSchedule (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MInvoiceSchedule
	
	/**
	 * 	Can I send Invoice
	 * 	@param xDate date
	 * 	@param orderAmt order amount
	 *	@return true if I can send Invoice
	 */
	public boolean canInvoice (Timestamp xDate, BigDecimal orderAmt)
	{
		//	Amount
		if (isAmount() && getAmt() != null && orderAmt != null 
			&& orderAmt.compareTo(getAmt()) >= 0)
			return true;
		
		//	Daily
		if (REF_C_InvoiceScheduleInvoiceFrequency.Daily.equals(getInvoiceFrequency()))
			return true;

		//	Remove time
		xDate = TimeUtil.getDay(xDate);
		Calendar today = TimeUtil.getToday();
		
		//	Weekly
		if (REF_C_InvoiceScheduleInvoiceFrequency.Weekly.equals(getInvoiceFrequency()))
		{
			Calendar cutoff = TimeUtil.getToday();
			cutoff.set(Calendar.DAY_OF_WEEK, getCalendarDay(getInvoiceWeekDayCutoff()));
			if (cutoff.after(today))
				cutoff.add(Calendar.DAY_OF_YEAR, -7);
			Timestamp cutoffDate = new Timestamp (cutoff.getTimeInMillis());
			log.fine("canInvoice - Date=" + xDate + " > Cutoff=" + cutoffDate 
				+ " - " + xDate.after(cutoffDate));
			if (xDate.after(cutoffDate))
				return false;
			//
			Calendar invoice = TimeUtil.getToday();
			invoice.set(Calendar.DAY_OF_WEEK, getCalendarDay(getInvoiceWeekDay()));
			if (invoice.after(today))
				invoice.add(Calendar.DAY_OF_YEAR, -7);
			Timestamp invoiceDate = new Timestamp (invoice.getTimeInMillis());
			log.fine("canInvoice - Date=" + xDate + " > Invoice=" + invoiceDate 
				+ " - " + xDate.after(invoiceDate));
			if (xDate.after(invoiceDate))
				return false;
			return true;
		}
		
		//	Monthly
		if (REF_C_InvoiceScheduleInvoiceFrequency.Monthly.equals(getInvoiceFrequency())
			|| REF_C_InvoiceScheduleInvoiceFrequency.TwiceMonthly.equals(getInvoiceFrequency()))
		{
			if (getInvoiceDayCutoff() > 0)
			{
				Calendar cutoff = TimeUtil.getToday();
				cutoff.set(Calendar.DAY_OF_MONTH, getInvoiceDayCutoff());
				if (cutoff.after(today))
					cutoff.add(Calendar.MONTH, -1);
				Timestamp cutoffDate = new Timestamp (cutoff.getTimeInMillis());
				log.fine("canInvoice - Date=" + xDate + " > Cutoff=" + cutoffDate 
					+ " - " + xDate.after(cutoffDate));
				if (xDate.after(cutoffDate))
					return false;
			}
			Calendar invoice = TimeUtil.getToday();
			invoice.set(Calendar.DAY_OF_MONTH, getInvoiceDay());
			if (invoice.after(today))
				invoice.add(Calendar.MONTH, -1);
			Timestamp invoiceDate = new Timestamp (invoice.getTimeInMillis());
			log.fine("canInvoice - Date=" + xDate + " > Invoice=" + invoiceDate 
				+ " - " + xDate.after(invoiceDate));
			if (xDate.after(invoiceDate))
				return false;
			return true;
		}

		//	Bi-Monthly (+15)
		if (REF_C_InvoiceScheduleInvoiceFrequency.TwiceMonthly.equals(getInvoiceFrequency()))
		{
			if (getInvoiceDayCutoff() > 0)
			{
				Calendar cutoff = TimeUtil.getToday();
				cutoff.set(Calendar.DAY_OF_MONTH, getInvoiceDayCutoff() +15);
				if (cutoff.after(today))
					cutoff.add(Calendar.MONTH, -1);
				Timestamp cutoffDate = new Timestamp (cutoff.getTimeInMillis());
				if (xDate.after(cutoffDate))
					return false;
			}
			Calendar invoice = TimeUtil.getToday();
			invoice.set(Calendar.DAY_OF_MONTH, getInvoiceDay() +15);
			if (invoice.after(today))
				invoice.add(Calendar.MONTH, -1);
			Timestamp invoiceDate = new Timestamp (invoice.getTimeInMillis());
			if (xDate.after(invoiceDate))
				return false;
			return true;
		}
		return false;
	}	//	canInvoice
	
	/**
	 * 	Convert to Calendar day
	 *	@param day Invoice Week Day
	 *	@return day
	 */
	private int getCalendarDay (String day)
	{
		if (REF_Weekdays.Friday.equals(day))
			return Calendar.FRIDAY;
		if (REF_Weekdays.Saturday.equals(day))
			return Calendar.SATURDAY;
		if (REF_Weekdays.Sunday.equals(day))
			return Calendar.SUNDAY;
		if (REF_Weekdays.Monday.equals(day))
			return Calendar.MONDAY;
		if (REF_Weekdays.Tuesday.equals(day))
			return Calendar.TUESDAY;
		if (REF_Weekdays.Wednesday.equals(day))
			return Calendar.WEDNESDAY;
	//	if (REF_Weekdays.Thursday.equals(day))
		return Calendar.THURSDAY;
	}	//	getCalendarDay
	
}	//	MInvoiceSchedule
