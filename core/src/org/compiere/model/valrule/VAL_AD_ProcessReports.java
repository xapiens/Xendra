package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_ProcessReports implements ValRule 
{
 	@XendraValRule(Name="AD_Process Reports",
		AD_Val_Rule_ID=128,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="1af2bc73-25f8-2ea1-4c38-d8a59d7d48c5",
		Synchronized="2012-01-17 10:35:10.0")
	public static final String Identifier = "1af2bc73-25f8-2ea1-4c38-d8a59d7d48c5";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Process.IsReport='Y' AND AD_Process.JasperReport IS NULL");
	return sb.toString();
}
}
