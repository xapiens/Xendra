package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_PeriodOpen implements ValRule 
{
 	@XendraValRule(Name="C_Period Open",
		AD_Val_Rule_ID=215,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="960b4328-66be-fb14-73d5-68009c22064a",
		Synchronized="2012-01-17 10:34:32.0")
	public static final String Identifier = "960b4328-66be-fb14-73d5-68009c22064a";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("EXISTS (SELECT * FROM C_PeriodControl pc WHERE C_Period.C_Period_ID=pc.C_Period_ID AND pc.PeriodStatus='O')");
	return sb.toString();
}
}
