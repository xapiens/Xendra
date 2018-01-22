package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_BPartner_Loc_DropShipTo implements ValRule 
{
 	@XendraValRule(Name="C_BPartner_Loc - Drop Ship To",
		AD_Val_Rule_ID=120,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="5df3961e-79ba-4e7c-87e1-07938e56eac5",
		Synchronized="2015-07-22 09:30:47.0")
	public static final String Identifier = "5df3961e-79ba-4e7c-87e1-07938e56eac5";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_BPartner_Location.C_BPartner_ID=@DropShip_BPartner_ID@ AND C_BPartner_Location.IsShipTo='Y'");
	return sb.toString();
}
}
