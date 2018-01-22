package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF__ErrorType implements Reference 
{
 	@XendraRefItem(Name="Error",
		Value="E",
		Description="",
		Identifier="6c069538-70b5-4065-8be1-38a51998b2f9")
	/** Error = E */
	public static final String Error = "E";
	@XendraRefItem(Name="Warning",
		Value="W",
		Description="",
		Identifier="74dbe2c1-d4c0-4b22-95b5-24a780789cee")
	/** Warning = W */
	public static final String Warning = "W";
	@XendraRefItem(Name="Information",
		Value="I",
		Description="",
		Identifier="da1a5017-62d8-48e4-8f4d-2785e951b779")
	/** Information = I */
	public static final String Information = "I";
	@XendraRef(Name="_ErrorType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="List of type of errors",
		Help="",
		VFormat="L",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:55:57.0",
		Extension="",
		Identifier="fdca0cc4-28c2-4e58-9c7f-7bb0d814571a")
	public static final String Identifier = "fdca0cc4-28c2-4e58-9c7f-7bb0d814571a";

}
