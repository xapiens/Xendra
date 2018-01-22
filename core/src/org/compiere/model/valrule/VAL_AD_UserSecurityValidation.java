package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_UserSecurityValidation implements ValRule 
{
 	@XendraValRule(Name="AD_User Security validation",
		AD_Val_Rule_ID=105,
		Description="Users with access to organization",
		Type="S",
		EntityType="D",
		Identifier="3ec35ccd-e6b3-d5a5-4c64-d26ca1da80e0",
		Synchronized="2012-01-17 10:33:52.0")
	public static final String Identifier = "3ec35ccd-e6b3-d5a5-4c64-d26ca1da80e0";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_User.AD_Client_ID=@AD_Client_ID@ AND AD_User.AD_Org_ID in (@User_Org@)");
	return sb.toString();
}
}
