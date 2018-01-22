package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_All_PaymentRule_CheckDirectDeposit implements ValRule 
{
 	@XendraValRule(Name="All_Payment Rule - Check/DirectDeposit",
		AD_Val_Rule_ID=162,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="03853674-4a7e-4798-89b0-2c90aaf7fe17",
		Synchronized="2015-07-22 09:30:47.0")
	public static final String Identifier = "03853674-4a7e-4798-89b0-2c90aaf7fe17";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Ref_List.Value IN ('S','T')");
	return sb.toString();
}
}
