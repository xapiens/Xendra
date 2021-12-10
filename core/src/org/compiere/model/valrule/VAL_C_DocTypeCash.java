package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_DocTypeCash implements ValRule 
{
 	@XendraValRule(Name="C_DocType Cash",
		AD_Val_Rule_ID=1000029,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="1a786e3c-0d6b-4e6d-a33e-b00b4777587e",
		Synchronized="2018-08-20 17:12:21.0")
	public static final String Identifier = "1a786e3c-0d6b-4e6d-a33e-b00b4777587e";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_DocType.DocBaseType IN ('CMC', 'CMR') AND (C_DocType.AD_Org_ID IN (SELECT AD_Org_ID FROM AD_Org WHERE AD_Org_ID=@AD_Org_ID@) OR C_DocType.AD_Org_ID =0)");
	return sb.toString();
}
}
