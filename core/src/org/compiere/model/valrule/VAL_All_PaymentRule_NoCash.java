package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_All_PaymentRule_NoCash implements ValRule 
{
 	@XendraValRule(Name="All_Payment Rule - no Cash",
		AD_Val_Rule_ID=161,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="ddb2995e-0325-fcfb-01ce-64a7af71853f",
		Synchronized="2012-01-17 10:35:08.0")
	public static final String Identifier = "ddb2995e-0325-fcfb-01ce-64a7af71853f";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Ref_List.Value <> 'B'");
	return sb.toString();
}
}
