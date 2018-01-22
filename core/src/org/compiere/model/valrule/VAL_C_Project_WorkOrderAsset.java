package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_Project_WorkOrderAsset implements ValRule 
{
 	@XendraValRule(Name="C_Project - WorkOrder/Asset",
		AD_Val_Rule_ID=176,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="306a2671-e21e-5c67-1664-f3e699d2c914",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "306a2671-e21e-5c67-1664-f3e699d2c914";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_Project.IsSummary='N' AND C_Project.ProjectCategory IN ('W','A')");
	return sb.toString();
}
}
