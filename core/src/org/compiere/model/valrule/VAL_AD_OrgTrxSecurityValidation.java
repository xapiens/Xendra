package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_OrgTrxSecurityValidation implements ValRule 
{
 	@XendraValRule(Name="AD_Org Trx Security validation",
		AD_Val_Rule_ID=130,
		Description="Not Summary - Not 0",
		Type="S",
		EntityType="D",
		Identifier="3d0ad5c8-6268-7179-e0db-72dfa20ab6a3",
		Synchronized="2012-01-17 10:35:18.0")
	public static final String Identifier = "3d0ad5c8-6268-7179-e0db-72dfa20ab6a3";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Org.AD_Org_ID <> 0  AND AD_Org.IsSummary='N'");
	return sb.toString();
}
}
