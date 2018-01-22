package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_CashInPayment implements ValRule 
{
 	@XendraValRule(Name="C_Cash in Payment",
		AD_Val_Rule_ID=1000014,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="5aad417c-0025-18b8-bcd7-8f599dec57a1",
		Synchronized="2012-01-17 10:33:51.0")
	public static final String Identifier = "5aad417c-0025-18b8-bcd7-8f599dec57a1";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("NOT EXISTS(SELECT * FROM C_CASH c WHERE c.C_PAYMENT_ID = C_Payment.c_payment_ID) AND C_Charge_ID > 0 ");
	return sb.toString();
}
}
