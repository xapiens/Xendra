package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_PaymentAVS implements Reference 
{
 	@XendraRefItem(Name="Match",
		Value="Y",
		Description="",
		Identifier="1b666a02-dfd3-4e72-af27-a607d98cef24")
	/** Match = Y */
	public static final String Match = "Y";
	@XendraRefItem(Name="No Match",
		Value="N",
		Description="",
		Identifier="5ff5a5d1-9c88-1f72-b560-9b2c1a56c58d")
	/** No Match = N */
	public static final String NoMatch = "N";
	@XendraRefItem(Name="Unavailable",
		Value="X",
		Description="",
		Identifier="4a437d29-50f5-9127-80d1-7886cf328d75")
	/** Unavailable = X */
	public static final String Unavailable = "X";
	@XendraRef(Name="C_Payment AVS",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="a38caa4a-a80a-342b-7bcf-5e887ef40a4c")
	public static final String Identifier = "a38caa4a-a80a-342b-7bcf-5e887ef40a4c";

}
