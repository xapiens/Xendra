package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_FindAndOr implements Reference 
{
 	@XendraRefItem(Name="And",
		Value="A",
		Description="",
		Identifier="91ad05bc-c122-0dd2-4007-7a3dc11f53cc")
	/** And = A */
	public static final String And = "A";
	@XendraRefItem(Name="Or",
		Value="O",
		Description="",
		Identifier="59ed8ab6-5470-e6b7-b033-fd7d92f3f9bb")
	/** Or = O */
	public static final String Or = "O";
	@XendraRef(Name="AD_Find AndOr",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="L",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="115d4f2d-61de-0b53-83b8-d9a24fa54f5b")
	public static final String Identifier = "115d4f2d-61de-0b53-83b8-d9a24fa54f5b";

}
