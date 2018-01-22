package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_CashbookOrg implements ValRule 
{
 	@XendraValRule(Name="C_Cashbook Org",
		AD_Val_Rule_ID=1000008,
		Description="",
		Type="S",
		EntityType="U",
		Identifier="2254195b-0e6b-fd71-d72f-9016f5594470",
		Synchronized="2012-01-17 10:35:21.0")
	public static final String Identifier = "2254195b-0e6b-fd71-d72f-9016f5594470";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_Cashbook.AD_Org_ID=@AD_Org_ID@");
	return sb.toString();
}
}
