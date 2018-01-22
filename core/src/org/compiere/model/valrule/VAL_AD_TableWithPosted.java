package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_AD_TableWithPosted implements ValRule 
{
 	@XendraValRule(Name="AD_Table with Posted",
		AD_Val_Rule_ID=213,
		Description="",
		Type="S",
		EntityType="D",
		Identifier="7dcee7da-621b-b7a7-784d-91a75526fe52",
		Synchronized="2012-01-17 10:35:35.0")
	public static final String Identifier = "7dcee7da-621b-b7a7-784d-91a75526fe52";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("EXISTS (SELECT * FROM AD_Column c WHERE AD_Table.AD_Table_ID=c.AD_Table_ID AND c.IsActive='Y' AND c.ColumnName='Posted') AND AD_Table.IsView='N'");
	return sb.toString();
}
}
