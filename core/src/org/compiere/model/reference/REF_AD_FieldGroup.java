package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_FieldGroup implements Reference 
{
 	@XendraRefItem(Name="Collapse",
		Value="C",
		Description="",
		Identifier="c638c105-3de4-8179-51ba-dba2e9b00ef1")
	/** Collapse = C */
	public static final String Collapse = "C";
	@XendraRefItem(Name="Tab",
		Value="T",
		Description="",
		Identifier="8ef0d535-10d8-2512-c0cd-678f76aa7208")
	/** Tab = T */
	public static final String Tab = "T";
	@XendraRefItem(Name="Label",
		Value="L",
		Description="",
		Identifier="cf5c7da0-23b6-326f-6af7-320e629950e8")
	/** Label = L */
	public static final String Label = "L";
	@XendraRef(Name="AD_FieldGroup",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Field Group Type",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="2facbaf0-81ba-f4b5-7557-afda96edfe71")
	public static final String Identifier = "2facbaf0-81ba-f4b5-7557-afda96edfe71";

}
