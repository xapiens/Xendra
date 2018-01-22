package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_BPartnerIsCustomer implements ValRule 
{
 	@XendraValRule(Name="C_BPartner IsCustomer",
		AD_Val_Rule_ID=1000025,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="fb8bd2a4-dcb4-3c1e-477f-f39ec47e5e06",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "fb8bd2a4-dcb4-3c1e-477f-f39ec47e5e06";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_BPartner.IsCustomer='Y'");
	return sb.toString();
}
}
