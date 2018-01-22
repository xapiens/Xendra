package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_FindColumn implements ValRule 
{
 	@XendraValRule(Name="AD_Find Column",
		AD_Val_Rule_ID=136,
		Description="Columns of Table",
		Type="S",
		EntityType="D",
		Identifier="dbd9af1f-cf2f-48d0-d7b5-d77c2703b407",
		Synchronized="2012-01-17 10:34:34.0")
	public static final String Identifier = "dbd9af1f-cf2f-48d0-d7b5-d77c2703b407";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Column.AD_Table_ID=@Find_Table_ID@");
	return sb.toString();
}
}
