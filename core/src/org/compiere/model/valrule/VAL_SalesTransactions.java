package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_SalesTransactions implements ValRule 
{
 	@XendraValRule(Name="Sales Transactions",
		AD_Val_Rule_ID=143,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="a5f4b0f6-74ff-45f3-fd2e-24a03c2cf6e0",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "a5f4b0f6-74ff-45f3-fd2e-24a03c2cf6e0";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("IsSOTrx='Y'");
	return sb.toString();
}
}
