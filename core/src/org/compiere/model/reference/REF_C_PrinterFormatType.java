package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_PrinterFormatType implements Reference 
{
 	@XendraRefItem(Name="Header Lines",
		Value="HEL",
		Description="",
		Identifier="2e4187c6-c022-4ade-992e-3c01c681c7a9")
	/** Header Lines = HEL */
	public static final String HeaderLines = "HEL";
	@XendraRefItem(Name="Process",
		Value="PRC",
		Description="",
		Identifier="910687d4-137b-4c61-899c-81ae1477d492")
	/** Process = PRC */
	public static final String Process = "PRC";
	@XendraRef(Name="C_PrinterFormatType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2019-05-20 17:46:04.573",
		Extension="",
		Identifier="14324025-4700-4e81-9434-3ae76ce146e4")
	public static final String Identifier = "14324025-4700-4e81-9434-3ae76ce146e4";

}
