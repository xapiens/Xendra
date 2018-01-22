package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_InvoiceNotPaid implements ValRule 
{
 	@XendraValRule(Name="C_Invoice NotPaid",
		AD_Val_Rule_ID=146,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="f9f66186-56be-4576-a540-b964411c53ef",
		Synchronized="2015-07-22 09:30:47.0")
	public static final String Identifier = "f9f66186-56be-4576-a540-b964411c53ef";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_Invoice.IsPaid<>'Y'");
	return sb.toString();
}
}
