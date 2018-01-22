package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_M_ProductTrx implements ValRule 
{
 	@XendraValRule(Name="M_Product (Trx)",
		AD_Val_Rule_ID=231,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="4281f8eb-238e-6b28-eb66-8cc866e6312c",
		Synchronized="2012-01-17 10:35:41.0")
	public static final String Identifier = "4281f8eb-238e-6b28-eb66-8cc866e6312c";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("M_Product.IsSummary='N' AND M_Product.IsActive='Y'");
	return sb.toString();
}
}
