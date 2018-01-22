package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_UserBPartnerDrop implements ValRule 
{
 	@XendraValRule(Name="AD_User BPartner Drop",
		AD_Val_Rule_ID=168,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="6495f7f3-9147-42db-9d64-1d395f657759",
		Synchronized="2015-07-22 09:30:47.0")
	public static final String Identifier = "6495f7f3-9147-42db-9d64-1d395f657759";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_User.C_BPartner_ID=@DropShip_BPartner_ID@");
	return sb.toString();
}
}
