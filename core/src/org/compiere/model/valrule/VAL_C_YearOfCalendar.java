package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_YearOfCalendar implements ValRule 
{
 	@XendraValRule(Name="C_Year of Calendar",
		AD_Val_Rule_ID=198,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="30a559a5-b676-32d1-61bf-2d3c267cfbd1",
		Synchronized="2012-01-17 10:34:59.0")
	public static final String Identifier = "30a559a5-b676-32d1-61bf-2d3c267cfbd1";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_Year.C_Calendar_ID=@C_Calendar_ID@");
	return sb.toString();
}
}
