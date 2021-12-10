package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_ElementValue_OnlyDetail implements ValRule 
{
 	@XendraValRule(Name="C_ElementValue_OnlyDetail",
		AD_Val_Rule_ID=1000030,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="b3b40f2c-c668-4a0b-8914-9ccc07d2f204",
		Synchronized="2015-07-23 09:30:48.0")
	public static final String Identifier = "b3b40f2c-c668-4a0b-8914-9ccc07d2f204";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_ElementValue.IsActive='Y' AND C_ElementValue.IsSummary='N'");
	return sb.toString();
}
}
