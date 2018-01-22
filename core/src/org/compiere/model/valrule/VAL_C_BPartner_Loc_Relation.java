package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_BPartner_Loc_Relation implements ValRule 
{
 	@XendraValRule(Name="C_BPartner_Loc - Relation",
		AD_Val_Rule_ID=188,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="23dc8fe3-67f0-650b-5c60-ba813a9e627e",
		Synchronized="2012-01-17 10:35:11.0")
	public static final String Identifier = "23dc8fe3-67f0-650b-5c60-ba813a9e627e";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_BPartner_Location.C_BPartner_ID=@C_BPartnerRelation_ID@");
	return sb.toString();
}
}
