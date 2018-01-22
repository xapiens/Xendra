package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_PaymentNotReconciled implements ValRule 
{
 	@XendraValRule(Name="C_Payment Not Reconciled",
		AD_Val_Rule_ID=144,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="5a612adb-9cab-4f1e-9b42-4126ec09a0eb",
		Synchronized="2015-07-22 09:30:48.0")
	public static final String Identifier = "5a612adb-9cab-4f1e-9b42-4126ec09a0eb";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_Payment.IsReconciled='N'");
	return sb.toString();
}
}
