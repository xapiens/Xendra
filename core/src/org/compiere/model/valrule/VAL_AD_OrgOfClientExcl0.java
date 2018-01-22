package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_OrgOfClientExcl0 implements ValRule 
{
 	@XendraValRule(Name="AD_Org of Client (excl 0)",
		AD_Val_Rule_ID=202,
		Description="All not 0",
		Type="S",
		EntityType="D",
		Identifier="2a1b4e38-cea8-f188-7693-02a845f6cd28",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "2a1b4e38-cea8-f188-7693-02a845f6cd28";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Org.AD_Client_ID=@AD_Client_ID@ AND AD_Org.AD_Org_ID<>0");
	return sb.toString();
}
}
