package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_UserBPartnerBill implements ValRule 
{
 	@XendraValRule(Name="AD_User BPartner Bill",
		AD_Val_Rule_ID=191,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="abad3cac-0869-b6d0-4b37-c9c74f3243b8",
		Synchronized="2012-01-17 10:33:39.0")
	public static final String Identifier = "abad3cac-0869-b6d0-4b37-c9c74f3243b8";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_User.C_BPartner_ID=@Bill_BPartner_ID@");
	return sb.toString();
}
}
