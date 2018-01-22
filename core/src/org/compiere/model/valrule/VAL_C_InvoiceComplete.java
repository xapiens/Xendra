package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_InvoiceComplete implements ValRule 
{
 	@XendraValRule(Name="C_Invoice Complete",
		AD_Val_Rule_ID=220,
		Description="Completed, Closed",
		Type="S",
		EntityType="D",
		Identifier="1756545a-9e8f-c0b5-5fd8-598388dea68e",
		Synchronized="2012-01-17 10:34:00.0")
	public static final String Identifier = "1756545a-9e8f-c0b5-5fd8-598388dea68e";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_Invoice.DocStatus IN ('CO', 'CL')");
	return sb.toString();
}
}
