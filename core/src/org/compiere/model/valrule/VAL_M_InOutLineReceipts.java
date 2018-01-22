package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_M_InOutLineReceipts implements ValRule 
{
 	@XendraValRule(Name="M_InOutLine Receipts",
		AD_Val_Rule_ID=234,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="0354c445-4d0b-44ba-a030-d074440b68a4",
		Synchronized="2015-07-22 09:30:48.0")
	public static final String Identifier = "0354c445-4d0b-44ba-a030-d074440b68a4";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("EXISTS (SELECT * FROM M_InOut io WHERE M_InOutLine.M_InOut_ID=io.M_InOut_ID AND io.IsSOTrx='N')");
	return sb.toString();
}
}
