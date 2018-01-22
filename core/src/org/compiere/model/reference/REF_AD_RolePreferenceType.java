package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_RolePreferenceType implements Reference 
{
 	@XendraRefItem(Name="Client",
		Value="C",
		Description="",
		Identifier="fde8d695-054b-3aaa-8712-065bbca792f4")
	/** Client = C */
	public static final String Client = "C";
	@XendraRefItem(Name="Organization",
		Value="O",
		Description="",
		Identifier="674e6911-431c-f624-12a1-cb3aebaca03b")
	/** Organization = O */
	public static final String Organization = "O";
	@XendraRefItem(Name="User",
		Value="U",
		Description="",
		Identifier="352b244f-0532-fb59-7fe1-940443dbd4cf")
	/** User = U */
	public static final String User = "U";
	@XendraRefItem(Name="None",
		Value="N",
		Description="",
		Identifier="199af268-fa21-c959-9349-5aecf6c606e1")
	/** None = N */
	public static final String None = "N";
	@XendraRef(Name="AD_Role PreferenceType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Preference Type",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="83b3b2cc-4339-890c-90a4-99b01403480b")
	public static final String Identifier = "83b3b2cc-4339-890c-90a4-99b01403480b";

}
