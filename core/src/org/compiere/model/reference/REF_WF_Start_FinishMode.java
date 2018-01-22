package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_WF_Start_FinishMode implements Reference 
{
 	@XendraRefItem(Name="Automatic",
		Value="A",
		Description="",
		Identifier="623be5de-b61c-4ecb-beae-47347ca75de1")
	/** Automatic = A */
	public static final String Automatic = "A";
	@XendraRefItem(Name="Manual",
		Value="M",
		Description="",
		Identifier="4b32513d-00be-e178-e89d-7c2a6e442d09")
	/** Manual = M */
	public static final String Manual = "M";
	@XendraRef(Name="WF_Start-Finish Mode",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="79c2f961-e1bf-3839-2291-e2231f520ca5")
	public static final String Identifier = "79c2f961-e1bf-3839-2291-e2231f520ca5";

}
