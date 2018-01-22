package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_BPartnerBillProxyS implements ValRule 
{
 	@XendraValRule(Name="C_BPartner Bill Proxy's",
		AD_Val_Rule_ID=193,
		Description="All BPartner who are Proxy's",
		Type="S",
		EntityType="D",
		Identifier="ed1cb715-7a87-3dc7-d8a8-2edd40ae4f72",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "ed1cb715-7a87-3dc7-d8a8-2edd40ae4f72";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_BPartner.IsSummary='N'  AND EXISTS (SELECT * FROM C_BP_Relation r WHERE C_BPartner.C_BPartner_ID=r.C_BPartnerRelation_ID)");
	return sb.toString();
}
}
