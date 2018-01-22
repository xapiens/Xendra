package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_DocTypeReplenishReport implements ValRule 
{
 	@XendraValRule(Name="C_DocType Replenish Report",
		AD_Val_Rule_ID=229,
		Description="Document Type Replenishment",
		Type="S",
		EntityType="D",
		Identifier="1a6e0fca-de3d-79aa-8f8d-9f5414848b82",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "1a6e0fca-de3d-79aa-8f8d-9f5414848b82";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_DocType.DocBaseType='@ReplenishmentCreate@'");
	return sb.toString();
}
}
