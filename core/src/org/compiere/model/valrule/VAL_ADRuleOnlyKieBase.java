package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_ADRuleOnlyKieBase implements ValRule 
{
 	@XendraValRule(Name="AD Rule Only KieBase",
		AD_Val_Rule_ID=1000028,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="42e2d04c-574d-4cad-893a-55549ab9889b",
		Synchronized="2018-04-07 21:11:27.021")
	public static final String Identifier = "42e2d04c-574d-4cad-893a-55549ab9889b";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Rule_ID in (SELECT AD_Rule_ID from AD_Rule where properties->'type' = 'kiebase')");
	return sb.toString();
}
}
