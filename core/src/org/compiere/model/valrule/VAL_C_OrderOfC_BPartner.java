package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_OrderOfC_BPartner implements ValRule 
{
 	@XendraValRule(Name="C_Order of C_BPartner",
		AD_Val_Rule_ID=147,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="baeaf9a0-8922-4da5-9767-0fd984284883",
		Synchronized="2015-07-22 09:30:48.0")
	public static final String Identifier = "baeaf9a0-8922-4da5-9767-0fd984284883";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_Order.C_BPartner_ID=@C_BPartner_ID@");
	return sb.toString();
}
}
