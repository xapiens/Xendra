package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_EventTypeDocumentOrTable implements ValRule 
{
 	@XendraValRule(Name="EventType Document or Table",
		AD_Val_Rule_ID=1000023,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="6e3b61d3-e674-6d25-b8c5-5f0ca5289eb8",
		Synchronized="2012-01-17 10:34:25.0")
	public static final String Identifier = "6e3b61d3-e674-6d25-b8c5-5f0ca5289eb8";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("EventType IN ('D','T')");
	return sb.toString();
}
}
