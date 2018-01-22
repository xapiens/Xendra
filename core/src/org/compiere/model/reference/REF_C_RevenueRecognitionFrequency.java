package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_RevenueRecognitionFrequency implements Reference 
{
 	@XendraRefItem(Name="Month",
		Value="M",
		Description="",
		Identifier="5c111071-1957-13dc-8575-af01bf15cca9")
	/** Month = M */
	public static final String Month = "M";
	@XendraRefItem(Name="Quarter",
		Value="Q",
		Description="",
		Identifier="ea52ce2f-0182-6197-0bc1-b32127ba2c5b")
	/** Quarter = Q */
	public static final String Quarter = "Q";
	@XendraRefItem(Name="Year",
		Value="Y",
		Description="",
		Identifier="a38da6fe-99f2-f310-5bc2-3dc9129dc811")
	/** Year = Y */
	public static final String Year = "Y";
	@XendraRef(Name="C_RevenueRecognition Frequency",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Frequency of Revenue Recognition",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="19c5b9f0-1445-8b89-2573-2f4fc66c7a45")
	public static final String Identifier = "19c5b9f0-1445-8b89-2573-2f4fc66c7a45";

}
