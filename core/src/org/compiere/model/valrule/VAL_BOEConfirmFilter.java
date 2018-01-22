package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_BOEConfirmFilter implements ValRule 
{
 	@XendraValRule(Name="BOE Confirm Filter",
		AD_Val_Rule_ID=1000010,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="bb038921-7210-c906-47a2-90306ba2a8cb",
		Synchronized="2012-01-17 10:33:51.0")
	public static final String Identifier = "bb038921-7210-c906-47a2-90306ba2a8cb";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_BOE.docstatus !='DR' AND C_BOE.C_Currency_ID=@C_Currency_ID@");
	return sb.toString();
}
}
