package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_ColumnEncrypted implements Reference 
{
 	@XendraRefItem(Name="Encrypted",
		Value="Y",
		Description="",
		Identifier="1de0f05a-2aa0-f12a-bef9-91f6e651718a")
	/** Encrypted = Y */
	public static final String Encrypted = "Y";
	@XendraRefItem(Name="Not Encrypted",
		Value="N",
		Description="",
		Identifier="844f14d0-869b-063d-4169-88976893b255")
	/** Not Encrypted = N */
	public static final String NotEncrypted = "N";
	@XendraRef(Name="AD_Column Encrypted",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="b343e2db-9fa6-9ba8-ce6b-94b768f97f73")
	public static final String Identifier = "b343e2db-9fa6-9ba8-ce6b-94b768f97f73";

}
