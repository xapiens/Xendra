package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_I_ElementValueColumn implements Reference 
{
 	@XendraRefTable(TableRef="AD_Column",
		KeyRef="AD_Column_ID",
		DisplayRef="ColumnName",
		IsValueDisplayed=false,
		WhereClause="AD_Column.AD_Table_ID IN (315,266) AND AD_Column.AD_Reference_ID=25",
		OrderByClause="AD_Column.ColumnName",
		Identifier="a77dabaa-5c6b-31ae-e89f-0838aeeb3628")
	@XendraRef(Name="I_ElementValue Column",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:18.0",
		Extension="",
		Identifier="9fc61864-d30f-70d0-3c22-45f1426e8068")
	public static final String Identifier = "9fc61864-d30f-70d0-3c22-45f1426e8068";

}
