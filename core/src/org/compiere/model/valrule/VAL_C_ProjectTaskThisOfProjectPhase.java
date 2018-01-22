package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_ProjectTaskThisOfProjectPhase implements ValRule 
{
 	@XendraValRule(Name="C_ProjectTask (this) of ProjectPhase",
		AD_Val_Rule_ID=166,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="15226120-466d-4ea7-4165-d8f32823be21",
		Synchronized="2012-01-17 10:35:29.0")
	public static final String Identifier = "15226120-466d-4ea7-4165-d8f32823be21";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_ProjectTask.C_ProjectPhase_ID=@C_ProjectPhase_ID@");
	return sb.toString();
}
}
