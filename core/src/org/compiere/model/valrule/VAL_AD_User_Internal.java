package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_User_Internal implements ValRule 
{
 	@XendraValRule(Name="AD_User - Internal",
		AD_Val_Rule_ID=164,
		Description="Employees & Sales Reps",
		Type="S",
		EntityType="D",
		Identifier="a1ea6cc6-fa00-1e16-1059-b4df151aaf4b",
		Synchronized="2012-01-17 10:35:43.0")
	public static final String Identifier = "a1ea6cc6-fa00-1e16-1059-b4df151aaf4b";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("EXISTS (SELECT * FROM C_BPartner bp WHERE AD_User.C_BPartner_ID=bp.C_BPartner_ID AND (bp.IsEmployee='Y' OR bp.IsSalesRep='Y'))");
	return sb.toString();
}
}
