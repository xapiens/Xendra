package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_PA_ReportLineType implements Reference 
{
 	@XendraRefItem(Name="Segment Value",
		Value="S",
		Description="",
		Identifier="fd5e8c0e-1dc3-673b-346c-4723ec55093f")
	/** Segment Value = S */
	public static final String SegmentValue = "S";
	@XendraRefItem(Name="Calculation",
		Value="C",
		Description="",
		Identifier="501c5a4e-e21c-87c2-6645-096fb3f64fa1")
	/** Calculation = C */
	public static final String Calculation = "C";
	@XendraRef(Name="PA_Report LineType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="349913c4-1875-0149-824c-1be75fddc6c3")
	public static final String Identifier = "349913c4-1875-0149-824c-1be75fddc6c3";

}
