package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_WF_DurationUnit implements Reference 
{
 	@XendraRefItem(Name="Year",
		Value="Y",
		Description="",
		Identifier="109940aa-77c1-999a-2ab8-7bdf35effbbc")
	/** Year = Y */
	public static final String Year = "Y";
	@XendraRefItem(Name="Month",
		Value="M",
		Description="",
		Identifier="c34b8a26-e400-959e-a3db-f8505cc11e06")
	/** Month = M */
	public static final String Month = "M";
	@XendraRefItem(Name="Day",
		Value="D",
		Description="",
		Identifier="108a1a95-1a6b-bd07-af40-ba7a57f66aa8")
	/** Day = D */
	public static final String Day = "D";
	@XendraRefItem(Name="hour",
		Value="h",
		Description="",
		Identifier="e50fdae2-98bf-a5e8-0986-48e63e7ccab8")
	/** hour = h */
	public static final String Hour = "h";
	@XendraRefItem(Name="minute",
		Value="m",
		Description="",
		Identifier="8c69d3c8-42ec-ac5a-4dea-52c33e867864")
	/** minute = m */
	public static final String Minute = "m";
	@XendraRefItem(Name="second",
		Value="s",
		Description="",
		Identifier="2e6dc145-021c-dbd5-56f2-4fe0f9f20421")
	/** second = s */
	public static final String Second = "s";
	@XendraRef(Name="WF_DurationUnit",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="ff9fc47e-117f-0c97-65db-b02e392a7e15")
	public static final String Identifier = "ff9fc47e-117f-0c97-65db-b02e392a7e15";

}
