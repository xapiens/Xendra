package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_TreeProduct implements ValRule 
{
 	@XendraValRule(Name="AD_Tree Product",
		AD_Val_Rule_ID=247,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="69eb448a-64cf-b54f-12a1-c19ad55dddb1",
		Synchronized="2012-01-17 10:34:19.0")
	public static final String Identifier = "69eb448a-64cf-b54f-12a1-c19ad55dddb1";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Tree.TreeType='PR' AND AD_Tree.AD_Client_ID=@AD_Client_ID@");
	return sb.toString();
}
}
