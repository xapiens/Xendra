package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_CommissionFrequency implements Reference 
{
 	@XendraRefItem(Name="Quarterly",
		Value="Q",
		Description="",
		Identifier="a95c19fc-5316-66d9-2b1a-663711b9722a")
	/** Quarterly = Q */
	public static final String Quarterly = "Q";
	@XendraRefItem(Name="Weekly",
		Value="W",
		Description="",
		Identifier="c25fbdb7-c132-e2de-33a0-3f3b0d9b767a")
	/** Weekly = W */
	public static final String Weekly = "W";
	@XendraRefItem(Name="Monthly",
		Value="M",
		Description="",
		Identifier="27f51637-a8d4-f284-8da4-894de5e2e471")
	/** Monthly = M */
	public static final String Monthly = "M";
	@XendraRefItem(Name="Yearly",
		Value="Y",
		Description="",
		Identifier="62b07601-158a-397c-90a4-e98d89873e1d")
	/** Yearly = Y */
	public static final String Yearly = "Y";
	@XendraRef(Name="C_Commission Frequency",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="A",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="1a41086c-5720-12e9-66cf-af748bb125fa")
	public static final String Identifier = "1a41086c-5720-12e9-66cf-af748bb125fa";

}
