package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_M_CostElementLandedCosts implements ValRule 
{
 	@XendraValRule(Name="M_CostElement Landed Costs",
		AD_Val_Rule_ID=222,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="6d65eced-52d9-7b4c-0244-8b4e02067511",
		Synchronized="2012-01-17 10:34:54.0")
	public static final String Identifier = "6d65eced-52d9-7b4c-0244-8b4e02067511";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("M_CostElement.CostElementType='M' AND M_CostElement.CostingMethod IS NULL");
	return sb.toString();
}
}
