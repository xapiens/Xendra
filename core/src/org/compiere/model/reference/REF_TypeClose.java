package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_TypeClose implements Reference 
{
 	@XendraRefItem(Name="Non in Close",
		Value="N",
		Description="",
		Identifier="d9ac2182-ff4f-b25a-b8a0-d0386898d1a9")
	/** Non in Close = N */
	public static final String NonInClose = "N";
	@XendraRefItem(Name="Only in Close",
		Value="O",
		Description="",
		Identifier="b4d37b04-fd54-a3f7-0b01-cf29ea152a59")
	/** Only in Close = O */
	public static final String OnlyInClose = "O";
	@XendraRefItem(Name="All",
		Value="A",
		Description="",
		Identifier="2fc57739-f395-52ab-2c72-012103fa05e9")
	/** All = A */
	public static final String All = "A";
	@XendraRef(Name="TypeClose",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-08-26 22:05:55.0",
		Extension="",
		Identifier="29486b5d-16b4-4e83-7680-302bfbaad4f9")
	public static final String Identifier = "29486b5d-16b4-4e83-7680-302bfbaad4f9";

}
