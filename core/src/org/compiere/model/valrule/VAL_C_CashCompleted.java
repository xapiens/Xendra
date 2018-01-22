package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_CashCompleted implements ValRule 
{
 	@XendraValRule(Name="C_Cash Completed",
		AD_Val_Rule_ID=1000001,
		Description="Matches completed cash",
		Type="S",
		EntityType="D",
		Identifier="393603dd-4aee-02c6-955f-7383200f5f1c",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "393603dd-4aee-02c6-955f-7383200f5f1c";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_Cash.DocStatus IN ('CO', 'CL')");
	return sb.toString();
}
}
