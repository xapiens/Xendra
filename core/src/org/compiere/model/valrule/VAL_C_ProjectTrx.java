package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_ProjectTrx implements ValRule 
{
 	@XendraValRule(Name="C_Project (Trx)",
		AD_Val_Rule_ID=232,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="992a8502-7fe8-20b8-6bc5-b5b4b225f1e3",
		Synchronized="2012-01-17 10:34:18.0")
	public static final String Identifier = "992a8502-7fe8-20b8-6bc5-b5b4b225f1e3";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_Project.IsSummary='N' AND C_Project.IsActive='Y' AND C_Project.Processed='N'");
	return sb.toString();
}
}
