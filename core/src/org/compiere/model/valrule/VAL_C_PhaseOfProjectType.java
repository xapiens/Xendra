package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_PhaseOfProjectType implements ValRule 
{
 	@XendraValRule(Name="C_Phase of Project Type",
		AD_Val_Rule_ID=171,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="ff0311a7-6311-e435-9673-f5c9cb82d7d9",
		Synchronized="2012-01-17 10:34:10.0")
	public static final String Identifier = "ff0311a7-6311-e435-9673-f5c9cb82d7d9";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_Phase.C_ProjectType_ID=@C_ProjectType_ID@");
	return sb.toString();
}
}
