package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF__FrequencyType implements Reference 
{
 	@XendraRefItem(Name="Minute",
		Value="M",
		Description="",
		Identifier="4af2fa2a-2cfb-8e0a-a12b-17f8fe692e3f")
	/** Minute = M */
	public static final String Minute = "M";
	@XendraRefItem(Name="Hour",
		Value="H",
		Description="",
		Identifier="5f7a202e-14da-d6bc-2f77-7e0956f951d7")
	/** Hour = H */
	public static final String Hour = "H";
	@XendraRefItem(Name="Day",
		Value="D",
		Description="",
		Identifier="3e385ee4-4dff-4282-9838-4a5d8195a6ca")
	/** Day = D */
	public static final String Day = "D";
	@XendraRefItem(Name="Once",
		Value="O",
		Description="",
		Identifier="")
	/** Once = O */
	public static final String Once = "O";
	@XendraRefItem(Name="Notification",
		Value="N",
		Description="",
		Identifier="e1a1d02f-36d8-48a7-adca-c9b2018ba241")
	/** Notification = N */
	public static final String Notification = "N";
	@XendraRef(Name="_Frequency Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Processor Frequency Type",
		Help="",
		VFormat="L",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2016-12-20 18:51:03.783",
		Extension="",
		Identifier="a8e24598-16fb-a392-7587-12a112938032")
	public static final String Identifier = "a8e24598-16fb-a392-7587-12a112938032";

}
