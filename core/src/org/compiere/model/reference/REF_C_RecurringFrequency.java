package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_RecurringFrequency implements Reference 
{
 	@XendraRefItem(Name="Daily",
		Value="D",
		Description="",
		Identifier="c1556db4-2ee5-6495-df84-6bd16b9b2209")
	/** Daily = D */
	public static final String Daily = "D";
	@XendraRefItem(Name="Weekly",
		Value="W",
		Description="",
		Identifier="c2271441-704c-358f-f46f-3e22402f2946")
	/** Weekly = W */
	public static final String Weekly = "W";
	@XendraRefItem(Name="Monthly",
		Value="M",
		Description="",
		Identifier="ce57b38b-c4d6-78dd-73ba-ccbe8e0cbde0")
	/** Monthly = M */
	public static final String Monthly = "M";
	@XendraRefItem(Name="Quarterly",
		Value="Q",
		Description="",
		Identifier="0573e5cd-735a-e2ba-196f-d007348bee62")
	/** Quarterly = Q */
	public static final String Quarterly = "Q";
	@XendraRef(Name="C_Recurring Frequency",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="33cfb9f6-5838-6aab-2851-2f9517251d7e")
	public static final String Identifier = "33cfb9f6-5838-6aab-2851-2f9517251d7e";

}
