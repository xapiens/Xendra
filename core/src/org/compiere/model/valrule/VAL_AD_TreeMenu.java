package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_TreeMenu implements ValRule 
{
 	@XendraValRule(Name="AD_Tree Menu",
		AD_Val_Rule_ID=150,
		Description="Only menu items",
		Type="S",
		EntityType="D",
		Identifier="dc8487ba-28fc-411e-cb04-cda616151762",
		Synchronized="2012-01-17 10:33:37.0")
	public static final String Identifier = "dc8487ba-28fc-411e-cb04-cda616151762";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Tree.TreeType='MM'");
	return sb.toString();
}
}
