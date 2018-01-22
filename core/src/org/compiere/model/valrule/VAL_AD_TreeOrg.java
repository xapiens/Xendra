package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_TreeOrg implements ValRule 
{
 	@XendraValRule(Name="AD_Tree Org",
		AD_Val_Rule_ID=221,
		Description="Only org items",
		Type="S",
		EntityType="D",
		Identifier="0d0fbf0f-d08c-51a5-6ab9-692a6550b14d",
		Synchronized="2012-01-17 10:34:19.0")
	public static final String Identifier = "0d0fbf0f-d08c-51a5-6ab9-692a6550b14d";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Tree.TreeType='OO' AND AD_Tree.AD_Client_ID=@AD_Client_ID@");
	return sb.toString();
}
}
