package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_AttributeValueType implements Reference 
{
 	@XendraRefItem(Name="String (max 40)",
		Value="S",
		Description="",
		Identifier="6de21fda-7058-dd33-91bd-f7e2914f2c3a")
	/** String (max 40) = S */
	public static final String StringMax40 = "S";
	@XendraRefItem(Name="Number",
		Value="N",
		Description="",
		Identifier="75d154fa-5e54-6323-70ae-69ef5a3824d7")
	/** Number = N */
	public static final String Number = "N";
	@XendraRefItem(Name="List",
		Value="L",
		Description="",
		Identifier="4011382c-48e4-d82c-247d-29006f6f485a")
	/** List = L */
	public static final String List = "L";
	@XendraRef(Name="M_Attribute Value Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="854efd47-6512-02f8-a5e7-323541c0863c")
	public static final String Identifier = "854efd47-6512-02f8-a5e7-323541c0863c";

}
