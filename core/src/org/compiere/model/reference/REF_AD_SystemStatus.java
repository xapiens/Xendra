package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_SystemStatus implements Reference 
{
 	@XendraRefItem(Name="Evaluation",
		Value="E",
		Description="",
		Identifier="cd870d2a-be38-8539-3c02-4e49254b49d2")
	/** Evaluation = E */
	public static final String Evaluation = "E";
	@XendraRefItem(Name="Implementation",
		Value="I",
		Description="",
		Identifier="d9cb7953-6f14-2244-88b5-b86250de3ac9")
	/** Implementation = I */
	public static final String Implementation = "I";
	@XendraRefItem(Name="Production",
		Value="P",
		Description="",
		Identifier="51c00d9b-c9ec-05f6-de36-cff0ce7b4446")
	/** Production = P */
	public static final String Production = "P";
	@XendraRef(Name="AD_System Status",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="2aca3aa9-4a75-ed5a-2785-69ad14e5c85d")
	public static final String Identifier = "2aca3aa9-4a75-ed5a-2785-69ad14e5c85d";

}
