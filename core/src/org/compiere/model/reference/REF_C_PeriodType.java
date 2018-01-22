package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_PeriodType implements Reference 
{
 	@XendraRefItem(Name="Standard Calendar Period",
		Value="S",
		Description="Periods with non overlapping calendar days",
		Identifier="6adbadce-c948-d418-2010-3d5ae99f8ff8")
	/** Standard Calendar Period = S */
	public static final String StandardCalendarPeriod = "S";
	@XendraRefItem(Name="Adjustment Period",
		Value="A",
		Description="Period without calendar days",
		Identifier="b11c9a84-dfe2-5e7e-a7a6-bc1e3647009b")
	/** Adjustment Period = A */
	public static final String AdjustmentPeriod = "A";
	@XendraRef(Name="C_Period Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Period Type list",
		Help="",
		VFormat="L",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="957da71e-2cc9-3b18-6cdb-f8977df211eb")
	public static final String Identifier = "957da71e-2cc9-3b18-6cdb-f8977df211eb";

}
