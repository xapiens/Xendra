package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_ColumnInImportTable implements ValRule 
{
 	@XendraValRule(Name="AD_Column in Import Table",
		AD_Val_Rule_ID=214,
		Description="Table must be previously defined",
		Type="S",
		EntityType="D",
		Identifier="d61938b8-7e78-e16a-6382-575651a6421b",
		Synchronized="2012-01-17 10:34:51.0")
	public static final String Identifier = "d61938b8-7e78-e16a-6382-575651a6421b";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("AD_Column.AD_Table_ID=@AD_Table_ID@ AND AD_Column.IsKey='N' AND AD_Column.ColumnName NOT IN ('I_IsImported', 'I_ErrorMsg')");
	return sb.toString();
}
}
