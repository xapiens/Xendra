package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_ProjectOfBPartner implements ValRule 
{
 	@XendraValRule(Name="C_Project of BPartner",
		AD_Val_Rule_ID=227,
		Description="Project of BP or SR or none",
		Type="S",
		EntityType="D",
		Identifier="961cbc99-cc24-46df-b94e-37fe139285bf",
		Synchronized="2012-01-17 10:35:40.0")
	public static final String Identifier = "961cbc99-cc24-46df-b94e-37fe139285bf";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_Project.IsSummary='N' AND (C_Project.C_BPartner_ID IS NULL OR C_Project.C_BPartner_ID=@C_BPartner_ID@ OR C_Project.C_BPartnerSR_ID=@C_BPartner_ID@)");
	return sb.toString();
}
}
