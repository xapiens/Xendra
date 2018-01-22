package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_RegionOfCountry implements ValRule 
{
 	@XendraValRule(Name="C_Region of Country",
		AD_Val_Rule_ID=153,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="2f48b18b-cc01-4a24-2f77-91b0071e443b",
		Synchronized="2012-01-17 10:35:38.0")
	public static final String Identifier = "2f48b18b-cc01-4a24-2f77-91b0071e443b";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_Region.C_Country_ID=@C_Country_ID@");
	return sb.toString();
}
}
