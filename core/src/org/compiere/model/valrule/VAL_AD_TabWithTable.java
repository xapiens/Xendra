package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_TabWithTable implements ValRule 
{
 	@XendraValRule(Name="AD_Tab with Table",
		AD_Val_Rule_ID=211,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="f5a40c3c-b2e5-1245-92c4-411e1cd04cb5",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "f5a40c3c-b2e5-1245-92c4-411e1cd04cb5";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Tab.AD_Table_ID=@AD_Table_ID@");
	return sb.toString();
}
}
