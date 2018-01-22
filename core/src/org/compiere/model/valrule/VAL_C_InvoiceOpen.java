package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_InvoiceOpen implements ValRule 
{
 	@XendraValRule(Name="C_Invoice Open",
		AD_Val_Rule_ID=181,
		Description="InProgress, Draft",
		Type="S",
		EntityType="D",
		Identifier="3b590be0-2326-67e7-bed0-5469ee942ee6",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "3b590be0-2326-67e7-bed0-5469ee942ee6";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_Invoice.DocStatus IN ('IP', 'DR')");
	return sb.toString();
}
}
