package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_AcctSchemaCostingMethod implements ValRule 
{
 	@XendraValRule(Name="C_AcctSchema CostingMethod",
		AD_Val_Rule_ID=242,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="62983f4c-0f5e-8a77-2189-53895351bcb2",
		Synchronized="2012-01-17 10:35:33.0")
	public static final String Identifier = "62983f4c-0f5e-8a77-2189-53895351bcb2";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Ref_List.Value <> 'x'");
	return sb.toString();
}
}
