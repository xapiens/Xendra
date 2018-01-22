package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_PA_BenschmarkAccumulationType implements Reference 
{
 	@XendraRefItem(Name="Average",
		Value="A",
		Description="",
		Identifier="2581e204-d2a1-ed6a-1028-783089be9b9b")
	/** Average = A */
	public static final String Average = "A";
	@XendraRefItem(Name="Sum",
		Value="S",
		Description="",
		Identifier="5df87b94-22c1-308f-94b2-c9ebf50c8ea7")
	/** Sum = S */
	public static final String Sum = "S";
	@XendraRef(Name="PA_Benschmark Accumulation Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="fde92be7-ff52-1bd2-9186-e27f63637854")
	public static final String Identifier = "fde92be7-ff52-1bd2-9186-e27f63637854";

}
