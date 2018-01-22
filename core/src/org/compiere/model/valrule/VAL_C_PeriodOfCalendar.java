package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_PeriodOfCalendar implements ValRule 
{
 	@XendraValRule(Name="C_Period of Calendar",
		AD_Val_Rule_ID=217,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="4931b002-cd2d-6d7d-b2f2-cd8c52955d82",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "4931b002-cd2d-6d7d-b2f2-cd8c52955d82";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("EXISTS (SELECT * FROM C_Year y WHERE C_Period.C_Year_ID=y.C_Year_ID AND y.C_Calendar_ID=@C_Calendar_ID@)");
	return sb.toString();
}
}
