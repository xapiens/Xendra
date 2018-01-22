package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_TabInWindow implements ValRule 
{
 	@XendraValRule(Name="AD_Tab in Window",
		AD_Val_Rule_ID=163,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="a240a421-ee6e-2b39-66f7-adbad5ad1f51",
		Synchronized="2012-01-17 10:35:10.0")
	public static final String Identifier = "a240a421-ee6e-2b39-66f7-adbad5ad1f51";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Tab.AD_Window_ID=@AD_Window_ID@");
	return sb.toString();
}
}
