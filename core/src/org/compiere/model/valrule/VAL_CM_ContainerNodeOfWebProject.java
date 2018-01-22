package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_CM_ContainerNodeOfWebProject implements ValRule 
{
 	@XendraValRule(Name="CM_Container node of  WebProject",
		AD_Val_Rule_ID=265,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="0259a6bb-98c1-405c-bf64-695c58c81a6c",
		Synchronized="2015-07-22 09:30:47.0")
	public static final String Identifier = "0259a6bb-98c1-405c-bf64-695c58c81a6c";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("CM_Container.CM_WebProject_ID=@CM_WebProject_ID@ AND CM_Container.IsSummary='N'");
	return sb.toString();
}
}
