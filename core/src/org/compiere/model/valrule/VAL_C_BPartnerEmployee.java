package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_BPartnerEmployee implements ValRule 
{
 	@XendraValRule(Name="C_BPartner Employee",
		AD_Val_Rule_ID=1000018,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="c5097aa9-96d2-a0b6-cac0-365f01a8225f",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "c5097aa9-96d2-a0b6-cac0-365f01a8225f";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_BPartner.IsEmployee='Y'");
	return sb.toString();
}
}
