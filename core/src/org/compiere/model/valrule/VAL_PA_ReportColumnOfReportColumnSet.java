package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_PA_ReportColumnOfReportColumnSet implements ValRule 
{
 	@XendraValRule(Name="PA_ReportColumn of ReportColumnSet",
		AD_Val_Rule_ID=160,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="91d4a2fb-eb69-bd8b-06f8-010a1034b428",
		Synchronized="2012-01-17 10:34:31.0")
	public static final String Identifier = "91d4a2fb-eb69-bd8b-06f8-010a1034b428";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("PA_ReportColumn.PA_ReportColumnSet_ID=@PA_ReportColumnSet_ID@");
	return sb.toString();
}
}
