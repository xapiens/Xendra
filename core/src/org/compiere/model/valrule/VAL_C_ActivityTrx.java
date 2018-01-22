package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_ActivityTrx implements ValRule 
{
 	@XendraValRule(Name="C_Activity (Trx)",
		AD_Val_Rule_ID=235,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="079b2687-77a7-3004-9b77-18ca68ffe4fc",
		Synchronized="2012-01-17 10:35:37.0")
	public static final String Identifier = "079b2687-77a7-3004-9b77-18ca68ffe4fc";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_Activity.IsActive='Y' AND C_Activity.IsSummary='N'");
	return sb.toString();
}
}
