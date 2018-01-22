package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_All_PaymentRule_CheckDirectDebitDeposit implements ValRule 
{
 	@XendraValRule(Name="All_Payment Rule - Check/DirectDebit/Deposit",
		AD_Val_Rule_ID=268,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="ce7cf74f-01b2-5710-594b-974aa344584d",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "ce7cf74f-01b2-5710-594b-974aa344584d";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Ref_List.Value IN ('S','T','D')");
	return sb.toString();
}
}
