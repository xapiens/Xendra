package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_WF_BlockOfWorkflow implements ValRule 
{
 	@XendraValRule(Name="AD_WF_Block of Workflow",
		AD_Val_Rule_ID=185,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="0b6b938c-c896-eae5-4877-798340374247",
		Synchronized="2012-01-17 10:35:26.0")
	public static final String Identifier = "0b6b938c-c896-eae5-4877-798340374247";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_WF_Block.AD_Workflow_ID=@AD_Workflow_ID@");
	return sb.toString();
}
}
