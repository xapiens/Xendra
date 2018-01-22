package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_OrgOfRemoteClient implements ValRule 
{
 	@XendraValRule(Name="AD_Org of Remote Client",
		AD_Val_Rule_ID=170,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="3bcd093c-47ad-8c4b-fa78-54f574586661",
		Synchronized="2012-01-17 10:35:34.0")
	public static final String Identifier = "3bcd093c-47ad-8c4b-fa78-54f574586661";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Org.AD_Client_ID=@Remote_Client_ID@");
	return sb.toString();
}
}
