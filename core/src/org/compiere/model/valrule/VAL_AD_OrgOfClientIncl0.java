package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_OrgOfClientIncl0 implements ValRule 
{
 	@XendraValRule(Name="AD_Org of Client (incl 0)",
		AD_Val_Rule_ID=148,
		Description="All and 0",
		Type="S",
		EntityType="D",
		Identifier="6305846e-79dd-d2ef-04f5-63dc98f76b81",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "6305846e-79dd-d2ef-04f5-63dc98f76b81";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("(AD_Org.AD_Client_ID=@AD_Client_ID@ OR AD_Org.AD_Org_ID=0)");
	return sb.toString();
}
}
