package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_PA_ReportColumnType implements Reference 
{
 	@XendraRefItem(Name="Segment Value",
		Value="S",
		Description="",
		Identifier="4c0fb280-e377-1b0a-4335-8b6d3633163d")
	/** Segment Value = S */
	public static final String SegmentValue = "S";
	@XendraRefItem(Name="Relative Period",
		Value="R",
		Description="",
		Identifier="f20b1ad5-7d9e-3e7a-9114-00f7a943943a")
	/** Relative Period = R */
	public static final String RelativePeriod = "R";
	@XendraRefItem(Name="Calculation",
		Value="C",
		Description="",
		Identifier="4b77868f-5aac-da74-9851-d1ed4e9766a7")
	/** Calculation = C */
	public static final String Calculation = "C";
	@XendraRef(Name="PA_Report ColumnType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="67329cef-9786-598f-3b28-6bb0c4d31858")
	public static final String Identifier = "67329cef-9786-598f-3b28-6bb0c4d31858";

}
