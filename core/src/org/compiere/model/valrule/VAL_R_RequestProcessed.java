package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_R_RequestProcessed implements ValRule 
{
 	@XendraValRule(Name="R_Request Processed",
		AD_Val_Rule_ID=156,
		Description="Processed Requests",
		Type="S",
		EntityType="D",
		Identifier="37961a3c-7070-1046-c9ec-1bb1c4037c65",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "37961a3c-7070-1046-c9ec-1bb1c4037c65";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("R_Request.Processed='Y'");
	return sb.toString();
}
}
