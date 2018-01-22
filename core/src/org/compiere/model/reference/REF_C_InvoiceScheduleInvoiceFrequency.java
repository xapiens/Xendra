package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_InvoiceScheduleInvoiceFrequency implements Reference 
{
 	@XendraRefItem(Name="Monthly",
		Value="M",
		Description="",
		Identifier="cfe214ce-0658-7643-e6ca-a072026a2184")
	/** Monthly = M */
	public static final String Monthly = "M";
	@XendraRefItem(Name="Twice Monthly",
		Value="T",
		Description="",
		Identifier="804d57d7-4e4c-7645-b189-715562b7dbf6")
	/** Twice Monthly = T */
	public static final String TwiceMonthly = "T";
	@XendraRefItem(Name="Daily",
		Value="D",
		Description="",
		Identifier="2d3cdf8b-3c71-1d97-d8f1-d31ba0ba1d96")
	/** Daily = D */
	public static final String Daily = "D";
	@XendraRefItem(Name="Weekly",
		Value="W",
		Description="",
		Identifier="a8f0eef1-7d82-91ba-3a7c-f7b29c3cfd83")
	/** Weekly = W */
	public static final String Weekly = "W";
	@XendraRef(Name="C_InvoiceSchedule InvoiceFrequency",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="67d6fd18-7cd1-74b1-b3fb-3a7a52814403")
	public static final String Identifier = "67d6fd18-7cd1-74b1-b3fb-3a7a52814403";

}
