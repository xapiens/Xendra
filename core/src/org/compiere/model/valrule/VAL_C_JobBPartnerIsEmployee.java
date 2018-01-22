package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_JobBPartnerIsEmployee implements ValRule 
{
 	@XendraValRule(Name="C_Job BPartner.IsEmployee",
		AD_Val_Rule_ID=243,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="c0669642-5da2-d5bf-9cdd-7845869027fa",
		Synchronized="2012-01-17 10:35:42.0")
	public static final String Identifier = "c0669642-5da2-d5bf-9cdd-7845869027fa";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_Job.IsEmployee=(SELECT IsEmployee FROM C_BPartner WHERE C_BPartner_ID=@C_BPartner_ID@)");
	return sb.toString();
}
}
