package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_MessageType implements Reference 
{
 	@XendraRefItem(Name="Error",
		Value="E",
		Description="",
		Identifier="9b38eff9-b83a-228b-df09-c0376ef65f8c")
	/** Error = E */
	public static final String Error = "E";
	@XendraRefItem(Name="Information",
		Value="I",
		Description="",
		Identifier="47dcb065-7f1d-6f33-4db9-8758387a366d")
	/** Information = I */
	public static final String Information = "I";
	@XendraRefItem(Name="Menu",
		Value="M",
		Description="",
		Identifier="910c3a44-bbaa-8f44-250c-ce10b46c6dde")
	/** Menu = M */
	public static final String Menu = "M";
	@XendraRef(Name="AD_Message Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Message Type list",
		Help="",
		VFormat="L",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="c583c177-83fe-ff17-183e-a26d452f08a1")
	public static final String Identifier = "c583c177-83fe-ff17-183e-a26d452f08a1";

}
