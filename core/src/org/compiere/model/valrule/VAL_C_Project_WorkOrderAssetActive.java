package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_Project_WorkOrderAssetActive implements ValRule 
{
 	@XendraValRule(Name="C_Project - WorkOrder/Asset active",
		AD_Val_Rule_ID=177,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="98d265b0-5391-7e3e-4907-b8228c0d6d65",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "98d265b0-5391-7e3e-4907-b8228c0d6d65";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_Project.IsSummary='N' AND C_Project.ProjectCategory IN ('W','A') AND C_Project.Processed<>'Y'");
	return sb.toString();
}
}
