package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_PA_RatioElementType implements Reference 
{
 	@XendraRefItem(Name="Ratio",
		Value="R",
		Description="",
		Identifier="dcd54f8e-a6a4-863f-2b58-cba485a6bc74")
	/** Ratio = R */
	public static final String Ratio = "R";
	@XendraRefItem(Name="Constant",
		Value="C",
		Description="",
		Identifier="0c6f9a82-bd30-397b-fbac-74af0b82def0")
	/** Constant = C */
	public static final String Constant = "C";
	@XendraRefItem(Name="Calculation",
		Value="X",
		Description="",
		Identifier="61e6ed62-e468-85c7-aea6-a5e53f5d70ae")
	/** Calculation = X */
	public static final String Calculation = "X";
	@XendraRefItem(Name="Account Value",
		Value="A",
		Description="",
		Identifier="b7b25562-805b-23e7-e3c4-fb949294882b")
	/** Account Value = A */
	public static final String AccountValue = "A";
	@XendraRef(Name="PA_Ratio ElementType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="29462fd0-b2bb-8d8c-fc51-6a41a22f028f")
	public static final String Identifier = "29462fd0-b2bb-8d8c-fc51-6a41a22f028f";

}
