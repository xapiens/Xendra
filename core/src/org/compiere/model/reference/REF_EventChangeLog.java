package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_EventChangeLog implements Reference 
{
 	@XendraRefItem(Name="Delete",
		Value="D",
		Description="",
		Identifier="5b67bf0b-9e34-b22c-a969-e930f8dd4aff")
	/** Delete = D */
	public static final String Delete = "D";
	@XendraRefItem(Name="Insert",
		Value="I",
		Description="",
		Identifier="b3ec4b51-b115-8ade-1fec-41857e9e7598")
	/** Insert = I */
	public static final String Insert = "I";
	@XendraRefItem(Name="Update",
		Value="U",
		Description="",
		Identifier="f7f969f2-4768-18df-554e-2bfb35a40a8e")
	/** Update = U */
	public static final String Update = "U";
	@XendraRef(Name="EventChangeLog",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="125a0f27-9c53-65e4-ae8b-0bb660485550")
	public static final String Identifier = "125a0f27-9c53-65e4-ae8b-0bb660485550";

}
