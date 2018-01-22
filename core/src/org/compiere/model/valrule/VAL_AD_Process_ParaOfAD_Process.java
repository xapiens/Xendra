package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_Process_ParaOfAD_Process implements ValRule 
{
 	@XendraValRule(Name="AD_Process_Para of AD_Process",
		AD_Val_Rule_ID=186,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="7875fd4e-d920-8e85-9e1e-09e9b8029038",
		Synchronized="2012-01-17 10:35:16.0")
	public static final String Identifier = "7875fd4e-d920-8e85-9e1e-09e9b8029038";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Process_Para.AD_Process_ID=@AD_Process_ID@");
	return sb.toString();
}
}
