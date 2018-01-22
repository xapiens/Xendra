package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_DocTypeInvoicesAndCreditMemosForPurchases implements ValRule 
{
 	@XendraValRule(Name="C_DocType Invoices and Credit Memos for Purchases",
		AD_Val_Rule_ID=1000006,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="e39bf052-270d-5f9b-f637-ce49c647089f",
		Synchronized="2012-01-17 10:33:52.0")
	public static final String Identifier = "e39bf052-270d-5f9b-f637-ce49c647089f";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_DocType.DocBaseType IN ('ARI', 'API','ARC','APC') AND C_DocType.IsSOTrx='@IsSOTrx@'");
	return sb.toString();
}
}
