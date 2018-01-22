package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_TreeActivity implements ValRule 
{
 	@XendraValRule(Name="AD_Tree Activity",
		AD_Val_Rule_ID=245,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="3d37e6f8-5904-2067-5029-ad37232f3a6b",
		Synchronized="2012-01-17 10:34:19.0")
	public static final String Identifier = "3d37e6f8-5904-2067-5029-ad37232f3a6b";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Tree.TreeType='AY' AND AD_Tree.AD_Client_ID=@AD_Client_ID@");
	return sb.toString();
}
}
