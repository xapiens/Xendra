package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_TreeSalesRegion implements ValRule 
{
 	@XendraValRule(Name="AD_Tree Sales Region",
		AD_Val_Rule_ID=249,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="3d58beb4-941c-7504-e320-c14bccf0bdeb",
		Synchronized="2012-01-17 10:34:19.0")
	public static final String Identifier = "3d58beb4-941c-7504-e320-c14bccf0bdeb";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Tree.TreeType='SR' AND AD_Tree.AD_Client_ID=@AD_Client_ID@");
	return sb.toString();
}
}
