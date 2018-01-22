package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_M_InOutLineOfM_InOut implements ValRule 
{
 	@XendraValRule(Name="M_InOutLine of M_InOut",
		AD_Val_Rule_ID=190,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="adb6a9a7-f36f-cf40-6dfe-c2c0b1249f3b",
		Synchronized="2012-01-17 10:35:30.0")
	public static final String Identifier = "adb6a9a7-f36f-cf40-6dfe-c2c0b1249f3b";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("M_InOutLine.M_InOut_ID=@M_InOut_ID@");
	return sb.toString();
}
}
