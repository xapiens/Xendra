package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_BPartner_LocBillTo_BillBPartner implements ValRule 
{
 	@XendraValRule(Name="C_BPartner_Loc BillTo - Bill BPartner",
		AD_Val_Rule_ID=119,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="95b6bac7-edb5-4d38-557a-1052567bd5c9",
		Synchronized="2012-01-17 10:33:39.0")
	public static final String Identifier = "95b6bac7-edb5-4d38-557a-1052567bd5c9";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_BPartner_Location.C_BPartner_ID=@Bill_BPartner_ID@ AND C_BPartner_Location.IsBillTo='Y' AND C_BPartner_Location.IsActive='Y'");
	return sb.toString();
}
}
