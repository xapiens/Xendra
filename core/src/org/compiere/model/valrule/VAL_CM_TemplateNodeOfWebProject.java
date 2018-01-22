package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_CM_TemplateNodeOfWebProject implements ValRule 
{
 	@XendraValRule(Name="CM_Template Node of  WebProject",
		AD_Val_Rule_ID=266,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="d4330999-7683-4c69-93dd-58f5a7344e89",
		Synchronized="2015-07-22 09:30:47.0")
	public static final String Identifier = "d4330999-7683-4c69-93dd-58f5a7344e89";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("CM_Template.CM_WebProject_ID=@CM_WebProject_ID@  AND CM_Template.IsSummary='N' AND CM_Template.IsInclude='N' AND CM_Template.IsValid='N'");
	return sb.toString();
}
}
