package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_InvoiceOfC_BPartner implements ValRule 
{
 	@XendraValRule(Name="C_Invoice of C_BPartner",
		AD_Val_Rule_ID=145,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="1baeb85c-ebba-4f75-9dfc-2a0ce0fabb69",
		Synchronized="2015-07-22 09:30:47.0")
	public static final String Identifier = "1baeb85c-ebba-4f75-9dfc-2a0ce0fabb69";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_Invoice.C_BPartner_ID=@C_BPartner_ID@");
	return sb.toString();
}
}
