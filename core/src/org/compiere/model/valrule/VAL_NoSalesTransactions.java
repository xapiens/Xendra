package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_NoSalesTransactions implements ValRule 
{
 	@XendraValRule(Name="No Sales Transactions",
		AD_Val_Rule_ID=142,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="64620b0f-6007-76f1-7b63-bcc193f11c4b",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "64620b0f-6007-76f1-7b63-bcc193f11c4b";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("IsSOTrx='N'");
	return sb.toString();
}
}
