package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_TableClientPlusOrgAccess implements ValRule 
{
 	@XendraValRule(Name="AD_Table Client+Org Access",
		AD_Val_Rule_ID=256,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="90dd409b-5208-f193-5f70-3b4bb233ca8b",
		Synchronized="2012-01-17 10:34:09.0")
	public static final String Identifier = "90dd409b-5208-f193-5f70-3b4bb233ca8b";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Table.AccessLevel='3' AND AD_Table.IsView='N'");
	return sb.toString();
}
}
