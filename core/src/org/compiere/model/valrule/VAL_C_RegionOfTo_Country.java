package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_RegionOfTo_Country implements ValRule 
{
 	@XendraValRule(Name="C_Region of To_Country",
		AD_Val_Rule_ID=155,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="a71cc79d-92f5-ea64-3006-a99129b08b2a",
		Synchronized="2012-01-17 10:35:39.0")
	public static final String Identifier = "a71cc79d-92f5-ea64-3006-a99129b08b2a";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_Region.C_Country_ID=@To_Country_ID@");
	return sb.toString();
}
}
