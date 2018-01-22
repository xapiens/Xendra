package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_RoleOfClient implements ValRule 
{
 	@XendraValRule(Name="AD_Role of Client",
		AD_Val_Rule_ID=158,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="b2c9f8b9-88a4-f1f2-30b5-b397993306dd",
		Synchronized="2012-01-17 10:35:36.0")
	public static final String Identifier = "b2c9f8b9-88a4-f1f2-30b5-b397993306dd";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Role.AD_Client_ID=@#AD_Client_ID@");
	return sb.toString();
}
}
