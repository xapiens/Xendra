package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_EDIStatus implements Reference 
{
 	@XendraRefItem(Name="Sent",
		Value="S",
		Description="",
		Identifier="bf3c0c18-282b-43a4-83fe-f055fc9519b4")
	/** Sent = S */
	public static final String Sent = "S";
	@XendraRefItem(Name="Acknowledged",
		Value="A",
		Description="",
		Identifier="07358474-9d86-4409-9b27-697827b48aa5")
	/** Acknowledged = A */
	public static final String Acknowledged = "A";
	@XendraRefItem(Name="Draft",
		Value="D",
		Description="",
		Identifier="be4ad994-529f-44f9-8c6b-d60063a6073c")
	/** Draft = D */
	public static final String Draft = "D";
	@XendraRefItem(Name="Answered (complete)",
		Value="C",
		Description="",
		Identifier="68b57cca-d214-4acf-9492-c2d84871de84")
	/** Answered (complete) = C */
	public static final String AnsweredComplete = "C";
	@XendraRef(Name="M_EDI Status",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:55:58.0",
		Extension="",
		Identifier="3554c7e0-2df9-4353-ac1b-73440df5fe3d")
	public static final String Identifier = "3554c7e0-2df9-4353-ac1b-73440df5fe3d";

}
