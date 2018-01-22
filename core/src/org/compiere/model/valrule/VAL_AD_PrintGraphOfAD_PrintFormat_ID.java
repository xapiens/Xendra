package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_PrintGraphOfAD_PrintFormat_ID implements ValRule 
{
 	@XendraValRule(Name="AD_PrintGraph of AD_PrintFormat_ID",
		AD_Val_Rule_ID=154,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="137d47db-4876-4c7f-dd8f-43f0e103c33f",
		Synchronized="2012-01-17 10:34:25.0")
	public static final String Identifier = "137d47db-4876-4c7f-dd8f-43f0e103c33f";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_PrintGraph.AD_PrintFormat_ID=@AD_PrintFormat_ID@");
	return sb.toString();
}
}
