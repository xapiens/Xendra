package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_M_CostElementsManual implements ValRule 
{
 	@XendraValRule(Name="M_CostElements Manual",
		AD_Val_Rule_ID=241,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="701dee9a-9390-33f9-5ca8-795e9b3ef34f",
		Synchronized="2012-01-17 10:35:29.0")
	public static final String Identifier = "701dee9a-9390-33f9-5ca8-795e9b3ef34f";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("(CostingMethod IS NULL OR CostingMethod='S')");
	return sb.toString();
}
}
