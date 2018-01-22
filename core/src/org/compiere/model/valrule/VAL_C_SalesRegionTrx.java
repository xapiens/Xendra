package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_SalesRegionTrx implements ValRule 
{
 	@XendraValRule(Name="C_SalesRegion (Trx)",
		AD_Val_Rule_ID=238,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="33328ea1-ec77-2fd1-e3bb-d2e42a80b138",
		Synchronized="2012-01-17 10:34:04.0")
	public static final String Identifier = "33328ea1-ec77-2fd1-e3bb-d2e42a80b138";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_SalesRegion.IsActive='Y' AND C_SalesRegion.IsSummary='N'");
	return sb.toString();
}
}
