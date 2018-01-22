package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_WorkflowProcess implements ValRule 
{
 	@XendraValRule(Name="AD_Workflow Process",
		AD_Val_Rule_ID=197,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="782a94d5-35b3-a8a4-f708-67e29e850978",
		Synchronized="2012-01-17 10:34:29.0")
	public static final String Identifier = "782a94d5-35b3-a8a4-f708-67e29e850978";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Workflow.AD_Table_ID IS NOT NULL");
	return sb.toString();
}
}
