package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_DiscountType implements Reference 
{
 	@XendraRefItem(Name="Flat Percent",
		Value="F",
		Description="",
		Identifier="057b4794-43e9-a062-fcee-941caaabe73f")
	/** Flat Percent = F */
	public static final String FlatPercent = "F";
	@XendraRefItem(Name="Formula",
		Value="S",
		Description="",
		Identifier="280d8e88-1b7e-a0f8-dda3-246dad0e7689")
	/** Formula = S */
	public static final String Formula = "S";
	@XendraRefItem(Name="Breaks",
		Value="B",
		Description="",
		Identifier="783288ee-8d6f-0018-7d6c-6279bcb93e1c")
	/** Breaks = B */
	public static final String Breaks = "B";
	@XendraRefItem(Name="Pricelist",
		Value="P",
		Description="",
		Identifier="794434a0-7b22-3ada-92be-e6ca5728315b")
	/** Pricelist = P */
	public static final String Pricelist = "P";
	@XendraRef(Name="M_Discount Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="L",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="97cc096c-622b-8db5-457c-304917053941")
	public static final String Identifier = "97cc096c-622b-8db5-457c-304917053941";

}
