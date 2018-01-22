package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_M_Product_BrandActive implements ValRule 
{
 	@XendraValRule(Name="M_Product_Brand Active",
		AD_Val_Rule_ID=1000021,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="bb704698-b278-ab27-455b-4d7d3b9b5b7f",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "bb704698-b278-ab27-455b-4d7d3b9b5b7f";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("M_Product_Brand.IsActive='Y'");
	return sb.toString();
}
}
