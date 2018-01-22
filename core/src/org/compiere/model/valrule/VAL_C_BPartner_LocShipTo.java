package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_BPartner_LocShipTo implements ValRule 
{
 	@XendraValRule(Name="C_BPartner_Loc Ship To",
		AD_Val_Rule_ID=167,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="94403aa1-55e7-94fb-41a3-ae8d99e809ba",
		Synchronized="2012-01-17 10:35:37.0")
	public static final String Identifier = "94403aa1-55e7-94fb-41a3-ae8d99e809ba";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_BPartner_Location.C_BPartner_ID=@C_BPartner_ID@ AND C_BPartner_Location.IsShipTo='Y' AND C_BPartner_Location.IsActive='Y'");
	return sb.toString();
}
}
