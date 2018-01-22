package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_PrintPaperUnits implements Reference 
{
 	@XendraRefItem(Name="MM",
		Value="M",
		Description="",
		Identifier="95dca456-fa67-db3c-bb6c-b20171963b89")
	/** MM = M */
	public static final String MM = "M";
	@XendraRefItem(Name="Inch",
		Value="I",
		Description="",
		Identifier="da358c4f-f754-3ee8-601f-d47de131dbb0")
	/** Inch = I */
	public static final String Inch = "I";
	@XendraRef(Name="AD_PrintPaper Units",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="36fe46fb-48ed-3eea-df0d-46fae64af9d5")
	public static final String Identifier = "36fe46fb-48ed-3eea-df0d-46fae64af9d5";

}
