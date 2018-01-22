package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_EventTableRuleList implements Reference 
{
 	@XendraRefItem(Name="Before Save",
		Value="BESA",
		Description="",
		Identifier="13d057f7-1b72-4d9b-987f-4528f152264b")
	/** Before Save = BESA */
	public static final String BeforeSave = "BESA";
	@XendraRef(Name="Event Table Rule List",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2016-09-05 22:44:18.17",
		Extension="",
		Identifier="64aec07a-a34f-4fd7-b4a0-88c09c379e6a")
	public static final String Identifier = "64aec07a-a34f-4fd7-b4a0-88c09c379e6a";

}
