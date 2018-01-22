package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_BPartnerLinkedToAnOrg implements ValRule 
{
 	@XendraValRule(Name="C_BPartner Linked to an Org",
		AD_Val_Rule_ID=195,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="9b51aced-2186-7c97-2dc0-9fa3ef6f9474",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "9b51aced-2186-7c97-2dc0-9fa3ef6f9474";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_BPartner.IsSummary='N'  AND C_BPartner.AD_OrgBP_ID<>0");
	return sb.toString();
}
}
