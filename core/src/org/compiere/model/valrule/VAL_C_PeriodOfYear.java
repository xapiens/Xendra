package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_PeriodOfYear implements ValRule 
{
 	@XendraValRule(Name="C_Period of Year",
		AD_Val_Rule_ID=199,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="8fc67d78-28c2-35aa-7d21-9b8fc4f92dd7",
		Synchronized="2012-01-17 10:34:45.0")
	public static final String Identifier = "8fc67d78-28c2-35aa-7d21-9b8fc4f92dd7";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_Period.C_Year_ID=@C_Year_ID@");
	return sb.toString();
}
}
