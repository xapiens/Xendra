package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_BPartnerVendor implements ValRule 
{
 	@XendraValRule(Name="C_BPartner Vendor",
		AD_Val_Rule_ID=1000022,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="06cdd0ae-2a57-64b8-128b-746c908939bb",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "06cdd0ae-2a57-64b8-128b-746c908939bb";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_Bpartner.IsVendor='Y'");
	return sb.toString();
}
}
