package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_CostPrice implements Reference 
{
 	@XendraRef(Name="Costs+Prices",
		AD_Reference_ID="37",
		ValidationType="D",
		Description="Costs + Prices (minimum currency precision, but if exists more)",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-11 00:00:00.0",
		Extension="",
		Identifier="e83b9481-46ca-b08c-7821-e9740ec9ffed")
	public static final String Identifier = "e83b9481-46ca-b08c-7821-e9740ec9ffed";

}
