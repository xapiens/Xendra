package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_EMailType implements Reference 
{
 	@XendraRefItem(Name="House",
		Value="H",
		Description="",
		Identifier="f776de6f-7ed8-45e3-985a-a017924a9a8d")
	/** House = H */
	public static final String House = "H";
	@XendraRefItem(Name="Other",
		Value="O",
		Description="",
		Identifier="48ec405c-2dab-4f04-b9ef-ce167cc23cb3")
	/** Other = O */
	public static final String Other = "O";
	@XendraRefItem(Name="Work",
		Value="W",
		Description="",
		Identifier="ba3184de-0f84-4ada-beba-3f28872f661e")
	/** Work = W */
	public static final String Work = "W";
	@XendraRef(Name="EMailType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2017-07-08 19:07:03.702",
		Extension="",
		Identifier="aa9ed05b-ac7a-4d3d-916a-dcdb623a1082")
	public static final String Identifier = "aa9ed05b-ac7a-4d3d-916a-dcdb623a1082";

}
