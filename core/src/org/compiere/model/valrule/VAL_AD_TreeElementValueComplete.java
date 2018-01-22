package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_TreeElementValueComplete implements ValRule 
{
 	@XendraValRule(Name="AD_Tree Element Value Complete",
		AD_Val_Rule_ID=244,
		Description="Only Element Value items",
		Type="S",
		EntityType="D",
		Identifier="0eab8314-f495-4c79-cfdc-7920053b0e41",
		Synchronized="2012-01-17 10:34:28.0")
	public static final String Identifier = "0eab8314-f495-4c79-cfdc-7920053b0e41";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Tree.TreeType IN ('EV','U1','U2') AND AD_Tree.IsAllNodes='Y'");
	return sb.toString();
}
}
