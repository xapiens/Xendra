package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_WF_EventType implements Reference 
{
 	@XendraRefItem(Name="Process Created",
		Value="PC",
		Description="",
		Identifier="ce21f100-1ddc-4d77-a6da-d5a29b0ac8f0")
	/** Process Created = PC */
	public static final String ProcessCreated = "PC";
	@XendraRefItem(Name="State Changed",
		Value="SC",
		Description="",
		Identifier="bceb1d34-afa9-1768-4bf7-575a1622e065")
	/** State Changed = SC */
	public static final String StateChanged = "SC";
	@XendraRefItem(Name="Process Completed",
		Value="PX",
		Description="",
		Identifier="538dee89-5c23-d1ca-27bf-86a1d7f8aeba")
	/** Process Completed = PX */
	public static final String ProcessCompleted = "PX";
	@XendraRef(Name="WF_EventType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="cd347785-1613-d1ad-918e-848e30db21c1")
	public static final String Identifier = "cd347785-1613-d1ad-918e-848e30db21c1";

}
