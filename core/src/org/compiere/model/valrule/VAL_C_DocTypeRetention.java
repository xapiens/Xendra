package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_DocTypeRetention implements ValRule 
{
 	@XendraValRule(Name="C_DocType Retention",
		AD_Val_Rule_ID=1000015,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="90500874-47c0-4b66-59f4-dc0050969a43",
		Synchronized="2012-01-17 10:34:18.0")
	public static final String Identifier = "90500874-47c0-4b66-59f4-dc0050969a43";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_DocType.DocBaseType IN ('RET')");
	return sb.toString();
}
}
