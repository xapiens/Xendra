package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_ClientLogin implements ValRule 
{
 	@XendraValRule(Name="AD_Client Login",
		AD_Val_Rule_ID=116,
		Description="Restrict to login client",
		Type="S",
		EntityType="D",
		Identifier="5b30c34b-1d0e-3e6d-f3c5-69d27896a0b7",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "5b30c34b-1d0e-3e6d-f3c5-69d27896a0b7";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Client.AD_Client_ID=@#AD_Client_ID@");
	return sb.toString();
}
}
