package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_ReferenceListOrTable implements ValRule 
{
 	@XendraValRule(Name="AD_Reference List or Table",
		AD_Val_Rule_ID=115,
		Description="List or Table validation choices",
		Type="S",
		EntityType="D",
		Identifier="147ddeef-c150-2ac8-67e8-346cc5225ef4",
		Synchronized="2012-01-17 10:35:41.0")
	public static final String Identifier = "147ddeef-c150-2ac8-67e8-346cc5225ef4";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Reference.ValidationType=CASE WHEN  @AD_Reference_ID@ IN (17,28) THEN 'L' ELSE 'T' END");
	return sb.toString();
}
}
