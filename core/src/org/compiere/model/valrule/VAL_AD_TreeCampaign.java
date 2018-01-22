package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_TreeCampaign implements ValRule 
{
 	@XendraValRule(Name="AD_Tree Campaign",
		AD_Val_Rule_ID=250,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="bf228b0c-2548-f234-65bb-e0fe0b2885f2",
		Synchronized="2012-01-17 10:34:19.0")
	public static final String Identifier = "bf228b0c-2548-f234-65bb-e0fe0b2885f2";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Tree.TreeType='MC' AND AD_Tree.AD_Client_ID=@AD_Client_ID@");
	return sb.toString();
}
}
