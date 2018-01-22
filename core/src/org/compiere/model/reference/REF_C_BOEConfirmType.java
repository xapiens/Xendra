package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_BOEConfirmType implements Reference 
{
 	@XendraRefItem(Name="BOE",
		Value="B",
		Description="",
		Identifier="ba6c41a0-1de9-26d8-f437-2504a2d5d0f0")
	/** BOE = B */
	public static final String BOE = "B";
	@XendraRefItem(Name="Payment",
		Value="P",
		Description="",
		Identifier="2ac804d9-dcf4-bc7b-12a3-fcc330eb1ef5")
	/** Payment = P */
	public static final String Payment = "P";
	@XendraRef(Name="C_BOEConfirmType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="2c81b9b3-ffb3-92a1-d2a9-0475101dc44a")
	public static final String Identifier = "2c81b9b3-ffb3-92a1-d2a9-0475101dc44a";

}
