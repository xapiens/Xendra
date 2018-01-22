package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_SubAcctOfAccount implements ValRule 
{
 	@XendraValRule(Name="C_SubAcct of Account",
		AD_Val_Rule_ID=255,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="0ee52933-6c04-66ed-6965-967b6623b014",
		Synchronized="2012-01-17 10:35:28.0")
	public static final String Identifier = "0ee52933-6c04-66ed-6965-967b6623b014";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_SubAcct.C_ElementValue_ID=@Account_ID@");
	return sb.toString();
}
}
