package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_OrderOpen implements ValRule 
{
 	@XendraValRule(Name="C_Order Open",
		AD_Val_Rule_ID=180,
		Description="InProgress, Draft",
		Type="S",
		EntityType="D",
		Identifier="477e142c-7b40-9de6-c81b-908261e1db3c",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "477e142c-7b40-9de6-c81b-908261e1db3c";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_Order.DocStatus IN ('IP', 'DR')");
	return sb.toString();
}
}
