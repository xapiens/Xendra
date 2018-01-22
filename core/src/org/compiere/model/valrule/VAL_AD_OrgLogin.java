package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_OrgLogin implements ValRule 
{
 	@XendraValRule(Name="AD_Org Login",
		AD_Val_Rule_ID=117,
		Description="Not Summary - Restrict to Login Organization",
		Type="S",
		EntityType="D",
		Identifier="d36e8871-a294-4f8e-a8a7-ec7569ebe54c",
		Synchronized="2015-07-22 09:30:47.0")
	public static final String Identifier = "d36e8871-a294-4f8e-a8a7-ec7569ebe54c";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Org.AD_Org_ID=@#AD_Org_ID@ AND AD_Org.IsSummary='N'");
	return sb.toString();
}
}
