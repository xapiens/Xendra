package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_DocTypeInvoicesAndCreditMemos implements ValRule 
{
 	@XendraValRule(Name="C_DocType Invoices and Credit Memos",
		AD_Val_Rule_ID=173,
		Description="Document Type AR/AP Invoice and Credit Memos",
		Type="S",
		EntityType="D",
		Identifier="2d69299a-c4ca-bc09-ad70-5a0009c2e11c",
		Synchronized="2012-01-17 10:34:16.0")
	public static final String Identifier = "2d69299a-c4ca-bc09-ad70-5a0009c2e11c";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_DocType.DocBaseType IN ('ARI', 'API','ARC','APC')");
	return sb.toString();
}
}
