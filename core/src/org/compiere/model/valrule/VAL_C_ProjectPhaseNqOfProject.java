package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_ProjectPhaseNqOfProject implements ValRule 
{
 	@XendraValRule(Name="C_ProjectPhase (nq) of Project",
		AD_Val_Rule_ID=262,
		Description="Not Qualified",
		Type="S",
		EntityType="D",
		Identifier="69e5a46c-92d0-8660-9d0d-a7f1b354e9b9",
		Synchronized="2012-01-17 10:35:37.0")
	public static final String Identifier = "69e5a46c-92d0-8660-9d0d-a7f1b354e9b9";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_Project_ID=@C_Project_ID@");
	return sb.toString();
}
}
