package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_TableImportTables implements ValRule 
{
 	@XendraValRule(Name="AD_Table Import Tables",
		AD_Val_Rule_ID=141,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="b58a19eb-4dd6-f9c8-5288-2763af30ceeb",
		Synchronized="2012-01-17 10:33:36.0")
	public static final String Identifier = "b58a19eb-4dd6-f9c8-5288-2763af30ceeb";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Table.TableName LIKE 'I%'");
	return sb.toString();
}
}
