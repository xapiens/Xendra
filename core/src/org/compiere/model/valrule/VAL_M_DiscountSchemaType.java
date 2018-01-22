package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_M_DiscountSchemaType implements ValRule 
{
 	@XendraValRule(Name="M_DiscountSchema Type",
		AD_Val_Rule_ID=205,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="680587ad-efd5-128f-f095-b87e78ae0b00",
		Synchronized="2012-01-17 10:34:27.0")
	public static final String Identifier = "680587ad-efd5-128f-f095-b87e78ae0b00";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("(('@IsSOTrx@'='N' AND Value='P') OR ('@IsSOTrx@'='Y' AND Value<>'P'))");
	return sb.toString();
}
}
