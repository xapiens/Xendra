package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_CM_CStageNodeOfWebProject implements ValRule 
{
 	@XendraValRule(Name="CM_CStage node of  WebProject",
		AD_Val_Rule_ID=264,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="4a5e21ba-ece7-4820-8e1b-42406175325b",
		Synchronized="2015-07-22 09:30:47.0")
	public static final String Identifier = "4a5e21ba-ece7-4820-8e1b-42406175325b";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("CM_CStage.CM_WebProject_ID=@CM_WebProject_ID@  AND CM_CStage.IsSummary='N'");
	return sb.toString();
}
}
