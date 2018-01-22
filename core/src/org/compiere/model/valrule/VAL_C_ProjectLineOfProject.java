package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_ProjectLineOfProject implements ValRule 
{
 	@XendraValRule(Name="C_ProjectLine of Project",
		AD_Val_Rule_ID=174,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="727c8f13-87d3-897e-36a9-4dadb5d71cb6",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "727c8f13-87d3-897e-36a9-4dadb5d71cb6";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_ProjectLine.C_Project_ID=@C_Project_ID@");
	return sb.toString();
}
}
