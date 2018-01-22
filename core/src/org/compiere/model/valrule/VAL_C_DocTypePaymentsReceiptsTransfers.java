package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_DocTypePaymentsReceiptsTransfers implements ValRule 
{
 	@XendraValRule(Name="C_DocType Payments/Receipts/Transfers",
		AD_Val_Rule_ID=149,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="757105c8-f6b5-223c-c6c4-1c7d6405b50e",
		Synchronized="2012-01-17 10:34:00.0")
	public static final String Identifier = "757105c8-f6b5-223c-c6c4-1c7d6405b50e";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_DocType.DocBaseType IN ('ARR', 'APP','BAT')");
	return sb.toString();
}
}
