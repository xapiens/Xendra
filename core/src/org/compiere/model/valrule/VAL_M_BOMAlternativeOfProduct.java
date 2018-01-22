package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_M_BOMAlternativeOfProduct implements ValRule 
{
 	@XendraValRule(Name="M_BOMAlternative of Product",
		AD_Val_Rule_ID=224,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="875d3b3c-81fb-7daa-c66f-f06630e24b40",
		Synchronized="2012-01-17 10:33:40.0")
	public static final String Identifier = "875d3b3c-81fb-7daa-c66f-f06630e24b40";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("M_BOMAlternative.M_Product_ID=@M_Product_ID@");
	return sb.toString();
}
}
