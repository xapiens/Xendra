package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_OrgNotLinked implements ValRule 
{
 	@XendraValRule(Name="AD_Org Not Linked",
		AD_Val_Rule_ID=196,
		Description="Not Summary - Not 0 - Not linked to BP",
		Type="S",
		EntityType="D",
		Identifier="9dbf8683-c8aa-6f13-181e-13acba98f3c5",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "9dbf8683-c8aa-6f13-181e-13acba98f3c5";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Org.AD_Org_ID <> 0  AND AD_Org.IsSummary='N' ");
	sb.append("AND NOT EXISTS (SELECT * FROM C_BPartner bp WHERE AD_Org.AD_Org_ID=bp.AD_OrgBP_ID)");
	return sb.toString();
}
}
