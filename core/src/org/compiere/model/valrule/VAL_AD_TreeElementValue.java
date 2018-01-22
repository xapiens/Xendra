package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_TreeElementValue implements ValRule 
{
 	@XendraValRule(Name="AD_Tree Element Value",
		AD_Val_Rule_ID=159,
		Description="Only Element Value items",
		Type="S",
		EntityType="D",
		Identifier="3b3dc93e-35ae-587a-82f6-333bf12e0787",
		Synchronized="2012-01-17 10:34:19.0")
	public static final String Identifier = "3b3dc93e-35ae-587a-82f6-333bf12e0787";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Tree.TreeType='EV' AND AD_Tree.AD_Client_ID=@AD_Client_ID@");
	return sb.toString();
}
}
