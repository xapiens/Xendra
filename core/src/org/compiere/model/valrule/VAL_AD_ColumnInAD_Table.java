package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_ColumnInAD_Table implements ValRule 
{
 	@XendraValRule(Name="AD_Column in AD_Table",
		AD_Val_Rule_ID=100,
		Description="Table must be previously defined",
		Type="S",
		EntityType="D",
		Identifier="084db087-1100-ad15-806b-d1b94a96650c",
		Synchronized="2012-01-17 10:35:36.0")
	public static final String Identifier = "084db087-1100-ad15-806b-d1b94a96650c";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Column.AD_Table_ID=@AD_Table_ID@");
	return sb.toString();
}
}
