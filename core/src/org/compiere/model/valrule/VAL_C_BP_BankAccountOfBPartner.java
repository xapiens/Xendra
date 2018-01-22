package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_BP_BankAccountOfBPartner implements ValRule 
{
 	@XendraValRule(Name="C_BP_BankAccount of BPartner",
		AD_Val_Rule_ID=269,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="937cf07b-3e21-96b1-6c4d-e19eb48a2383",
		Synchronized="2012-01-17 10:34:45.0")
	public static final String Identifier = "937cf07b-3e21-96b1-6c4d-e19eb48a2383";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_BP_BankAccount.C_BPartner_ID=@C_BPartner_ID@");
	return sb.toString();
}
}
