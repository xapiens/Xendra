package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF__YesNo implements Reference 
{
 	@XendraRefItem(Name="Yes",
		Value="Y",
		Description="",
		Identifier="72222405-3cb0-18f3-73b5-cf9aedbd37b6")
	/** Yes = Y */
	public static final String Yes = "Y";
	@XendraRefItem(Name="No",
		Value="N",
		Description="",
		Identifier="6ec09db7-0132-2192-3779-28c041892435")
	/** No = N */
	public static final String No = "N";
	@XendraRef(Name="_YesNo",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="9d5d423d-1f38-e653-2094-21cc989d1234")
	public static final String Identifier = "9d5d423d-1f38-e653-2094-21cc989d1234";

}
