package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_PA_ReportLineOfReportLineSet implements ValRule 
{
 	@XendraValRule(Name="PA_ReportLine of ReportLineSet",
		AD_Val_Rule_ID=157,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="eef9c731-043b-17c9-ea76-6c0faf568470",
		Synchronized="2012-01-17 10:34:38.0")
	public static final String Identifier = "eef9c731-043b-17c9-ea76-6c0faf568470";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("PA_ReportLine.PA_ReportLineSet_ID=@PA_ReportLineSet_ID@");
	return sb.toString();
}
}
