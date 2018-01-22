package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_SchedulerType implements Reference 
{
 	@XendraRefItem(Name="Frequency",
		Value="F",
		Description="",
		Identifier="f1c9914f-355b-710e-13e6-c46b034c24a9")
	/** Frequency = F */
	public static final String Frequency = "F";
	@XendraRefItem(Name="Week Day",
		Value="W",
		Description="",
		Identifier="9fe30501-a1c6-c93c-cec3-2a006ce303a1")
	/** Week Day = W */
	public static final String WeekDay = "W";
	@XendraRefItem(Name="Month Day",
		Value="M",
		Description="",
		Identifier="3067433e-5bb7-2ba1-f9fe-aa7f5a0407a1")
	/** Month Day = M */
	public static final String MonthDay = "M";
	@XendraRef(Name="AD_Scheduler Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="4c0c19ed-6f41-afdc-47cd-d1649d8b484f")
	public static final String Identifier = "4c0c19ed-6f41-afdc-47cd-d1649d8b484f";

}
