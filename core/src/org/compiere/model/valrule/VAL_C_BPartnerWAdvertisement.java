package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_BPartnerWAdvertisement implements ValRule 
{
 	@XendraValRule(Name="C_BPartner w Advertisement",
		AD_Val_Rule_ID=257,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="ffbce31c-0d8a-2341-f976-669de1dcf02b",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "ffbce31c-0d8a-2341-f976-669de1dcf02b";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("EXISTS (SELECT * FROM W_Advertisement a WHERE C_BPartner.C_BPartner_ID=a.C_BPartner_ID)");
	return sb.toString();
}
}
