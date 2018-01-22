package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_PaymentCompleted implements ValRule 
{
 	@XendraValRule(Name="C_Payment Completed",
		AD_Val_Rule_ID=1000003,
		Description="Matches a completed payment",
		Type="S",
		EntityType="D",
		Identifier="b58f4607-c4c7-530f-eb94-e789a6064eec",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "b58f4607-c4c7-530f-eb94-e789a6064eec";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_Payment.DocStatus IN ('CO', 'CL')");
	return sb.toString();
}
}
