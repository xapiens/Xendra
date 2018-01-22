package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_RemunerationType implements Reference 
{
 	@XendraRefItem(Name="Hourly",
		Value="H",
		Description="",
		Identifier="96dd3767-fe20-68cb-955c-8d38fc5321f7")
	/** Hourly = H */
	public static final String Hourly = "H";
	@XendraRefItem(Name="Daily",
		Value="D",
		Description="",
		Identifier="f8a4d8a7-bbbc-17bd-d183-a90902116a5e")
	/** Daily = D */
	public static final String Daily = "D";
	@XendraRefItem(Name="Weekly",
		Value="W",
		Description="",
		Identifier="2e1d1cb1-c35e-2b70-2d9f-586782ab2cb5")
	/** Weekly = W */
	public static final String Weekly = "W";
	@XendraRefItem(Name="Monthly",
		Value="M",
		Description="",
		Identifier="90d1fb34-6d3f-7222-4a40-e9077e5a7d12")
	/** Monthly = M */
	public static final String Monthly = "M";
	@XendraRefItem(Name="Twice Monthly",
		Value="T",
		Description="",
		Identifier="335b932a-d1ce-8671-e182-91c168951b45")
	/** Twice Monthly = T */
	public static final String TwiceMonthly = "T";
	@XendraRefItem(Name="Bi-Weekly",
		Value="B",
		Description="",
		Identifier="93000c87-85da-2673-7d34-efcfda683b65")
	/** Bi-Weekly = B */
	public static final String Bi_Weekly = "B";
	@XendraRef(Name="C_Remuneration Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="6611551e-81c4-53c9-8768-c3bfde62fcf1")
	public static final String Identifier = "6611551e-81c4-53c9-8768-c3bfde62fcf1";

}
