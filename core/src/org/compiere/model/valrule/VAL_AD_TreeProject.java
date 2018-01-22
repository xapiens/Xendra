package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_TreeProject implements ValRule 
{
 	@XendraValRule(Name="AD_Tree Project",
		AD_Val_Rule_ID=248,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="20fc2aa0-b11e-adf8-df71-c836b35c928f",
		Synchronized="2012-01-17 10:34:19.0")
	public static final String Identifier = "20fc2aa0-b11e-adf8-df71-c836b35c928f";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Tree.TreeType='PJ' AND AD_Tree.AD_Client_ID=@AD_Client_ID@");
	return sb.toString();
}
}
