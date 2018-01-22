package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_R_RequestTypeInvoiced implements ValRule 
{
 	@XendraValRule(Name="R_RequestType invoiced",
		AD_Val_Rule_ID=226,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="56cd758f-3f97-9498-ca42-5366bebfc325",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "56cd758f-3f97-9498-ca42-5366bebfc325";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("R_RequestType.IsInvoiced='Y'");
	return sb.toString();
}
}
