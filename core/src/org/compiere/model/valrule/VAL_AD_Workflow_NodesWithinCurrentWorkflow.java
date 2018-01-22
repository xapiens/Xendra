package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_Workflow_NodesWithinCurrentWorkflow implements ValRule 
{
 	@XendraValRule(Name="AD_Workflow_Nodes within current Workflow",
		AD_Val_Rule_ID=140,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="0c8cc5a9-f3a1-8403-a56a-f5a4c0ad047e",
		Synchronized="2012-01-17 10:34:46.0")
	public static final String Identifier = "0c8cc5a9-f3a1-8403-a56a-f5a4c0ad047e";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_WF_Node.AD_WorkFlow_ID=@AD_Workflow_ID@");
	return sb.toString();
}
}
