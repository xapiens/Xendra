package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_M_DiscountSchemaOnlyPriceList implements ValRule 
{
 	@XendraValRule(Name="M_DiscountSchema only PriceList",
		AD_Val_Rule_ID=151,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="b23483aa-fc6f-3a35-c703-d22d7c79b7d1",
		Synchronized="2012-01-17 10:35:32.0")
	public static final String Identifier = "b23483aa-fc6f-3a35-c703-d22d7c79b7d1";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("M_DiscountSchema.DiscountType='P'");
	return sb.toString();
}
}
