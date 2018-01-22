package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_BankAccountOrg implements ValRule 
{
 	@XendraValRule(Name="C_BankAccount Org",
		AD_Val_Rule_ID=1000013,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="97425762-0a99-5f8b-5219-df2cd66343cd",
		Synchronized="2012-01-17 10:35:21.0")
	public static final String Identifier = "97425762-0a99-5f8b-5219-df2cd66343cd";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_BankAccount.AD_Org_ID=@AD_Org_ID@");
	return sb.toString();
}
}
