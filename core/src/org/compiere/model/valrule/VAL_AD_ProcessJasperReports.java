package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_ProcessJasperReports implements ValRule 
{
 	@XendraValRule(Name="AD_Process Jasper Reports",
		AD_Val_Rule_ID=270,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="3b5d421e-9d45-4041-9f66-dea91a3c29d5",
		Synchronized="2015-07-22 09:30:47.0")
	public static final String Identifier = "3b5d421e-9d45-4041-9f66-dea91a3c29d5";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Process.JasperReport IS NOT NULL");
	return sb.toString();
}
}
