package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_InvoiceOfPayment implements ValRule 
{
 	@XendraValRule(Name="C_Invoice of Payment",
		AD_Val_Rule_ID=240,
		Description="Completed, Closed",
		Type="S",
		EntityType="D",
		Identifier="ef3f8528-e3d7-e4bd-825d-3aaa82d823d9",
		Synchronized="2012-01-17 10:34:10.0")
	public static final String Identifier = "ef3f8528-e3d7-e4bd-825d-3aaa82d823d9";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_Invoice.DocStatus IN ('CO', 'CL') AND C_Invoice.C_Currency_ID=@C_Currency_ID@ AND C_Invoice.C_BPartner_ID=@C_BPartner_ID@ AND C_Invoice.IsSOTrx='@IsReceipt@'");
	return sb.toString();
}
}
