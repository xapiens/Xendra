package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_TreeBPartner implements ValRule 
{
 	@XendraValRule(Name="AD_Tree BPartner",
		AD_Val_Rule_ID=246,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="df866435-c3de-fcaa-a147-47df0e89f72b",
		Synchronized="2012-01-17 10:34:19.0")
	public static final String Identifier = "df866435-c3de-fcaa-a147-47df0e89f72b";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Tree.TreeType='BP' AND AD_Tree.AD_Client_ID=@AD_Client_ID@");
	return sb.toString();
}
}
