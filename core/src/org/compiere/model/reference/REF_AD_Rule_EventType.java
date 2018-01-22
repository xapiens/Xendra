package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_Rule_EventType implements Reference 
{
 	@XendraRefItem(Name="Callout",
		Value="C",
		Description="",
		Identifier="dc763c71-04ad-4d4e-b514-789040f4e0c7")
	/** Callout = C */
	public static final String Callout = "C";
	@XendraRefItem(Name="Model Validator Document Event",
		Value="D",
		Description="",
		Identifier="16f68e1b-4a09-40ba-ba27-55844d8fcf6b")
	/** Model Validator Document Event = D */
	public static final String ModelValidatorDocumentEvent = "D";
	@XendraRefItem(Name="Process",
		Value="P",
		Description="",
		Identifier="ccaa09d8-38db-4c3f-8f72-1784a00f22bd")
	/** Process = P */
	public static final String Process = "P";
	@XendraRefItem(Name="Model Validator Table Event",
		Value="T",
		Description="",
		Identifier="1e1f8d43-0cbf-42ff-b7b5-f0def89180a2")
	/** Model Validator Table Event = T */
	public static final String ModelValidatorTableEvent = "T";
	@XendraRefItem(Name="Model Validator Login Event",
		Value="L",
		Description="",
		Identifier="38d4a4b5-3868-4f41-9df2-8fa8c6bc480d")
	/** Model Validator Login Event = L */
	public static final String ModelValidatorLoginEvent = "L";
	@XendraRef(Name="AD_Rule_EventType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:55:59.0",
		Extension="",
		Identifier="96201651-a4d1-4382-be28-793fda1db486")
	public static final String Identifier = "96201651-a4d1-4382-be28-793fda1db486";

}
