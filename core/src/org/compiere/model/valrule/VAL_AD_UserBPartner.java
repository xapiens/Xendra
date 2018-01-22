package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_UserBPartner implements ValRule 
{
 	@XendraValRule(Name="AD_User BPartner",
		AD_Val_Rule_ID=123,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="f4ac36a1-4200-1386-677e-14ac90afb4fe",
		Synchronized="2012-01-17 10:35:41.0")
	public static final String Identifier = "f4ac36a1-4200-1386-677e-14ac90afb4fe";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_User.C_BPartner_ID=@C_BPartner_ID@");
	return sb.toString();
}
}
