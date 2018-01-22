package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_BPartner_Loc implements ValRule 
{
 	@XendraValRule(Name="C_BPartner_Loc",
		AD_Val_Rule_ID=131,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="623d98c0-19fc-56a2-f511-8992974d3c05",
		Synchronized="2012-01-17 10:35:42.0")
	public static final String Identifier = "623d98c0-19fc-56a2-f511-8992974d3c05";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_BPartner_Location.C_BPartner_ID=@C_BPartner_ID@");
	return sb.toString();
}
}
