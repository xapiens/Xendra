package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_DocTypeARAPInvoicesAndCreditMemos implements ValRule 
{
 	@XendraValRule(Name="C_DocType AR/AP Invoices and Credit Memos",
		AD_Val_Rule_ID=124,
		Description="Document Type AR/AP Invoice and Credit Memos",
		Type="S",
		EntityType="D",
		Identifier="3618c2e5-5c32-687f-83f6-d13e5296d9e4",
		Synchronized="2012-01-17 10:35:31.0")
	public static final String Identifier = "3618c2e5-5c32-687f-83f6-d13e5296d9e4";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_DocType.DocBaseType IN ('ARI', 'API','ARC','APC','FPS') AND C_DocType.IsSOTrx='@IsSOTrx@' AND (C_DocType.AD_Org_ID IN (SELECT AD_Org_ID FROM AD_Org WHERE AD_Org_ID=@AD_Org_ID@) OR C_DocType.AD_Org_ID =0)");
	return sb.toString();
}
}
