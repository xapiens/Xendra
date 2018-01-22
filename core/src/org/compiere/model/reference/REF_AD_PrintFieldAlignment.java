package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_PrintFieldAlignment implements Reference 
{
 	@XendraRefItem(Name="Default",
		Value="D",
		Description="",
		Identifier="8417d105-7ccf-2538-6f79-bb433ee6ed44")
	/** Default = D */
	public static final String Default = "D";
	@XendraRefItem(Name="Leading (left)",
		Value="L",
		Description="",
		Identifier="33b8ff19-7251-2635-6a9f-9f603504a6b1")
	/** Leading (left) = L */
	public static final String LeadingLeft = "L";
	@XendraRefItem(Name="Trailing (right)",
		Value="T",
		Description="",
		Identifier="5e413682-668d-e865-2b3a-d0aa4bee6fb2")
	/** Trailing (right) = T */
	public static final String TrailingRight = "T";
	@XendraRefItem(Name="Block",
		Value="B",
		Description="",
		Identifier="9c27e544-463f-16bc-a8c3-50acfa680db6")
	/** Block = B */
	public static final String Block = "B";
	@XendraRefItem(Name="Center",
		Value="C",
		Description="",
		Identifier="913ea04b-f784-2ab1-7108-0693ff44a6a9")
	/** Center = C */
	public static final String Center = "C";
	@XendraRef(Name="AD_Print Field Alignment",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="dd7c47c9-c630-6c12-8480-b381a87270cc")
	public static final String Identifier = "dd7c47c9-c630-6c12-8480-b381a87270cc";

}
