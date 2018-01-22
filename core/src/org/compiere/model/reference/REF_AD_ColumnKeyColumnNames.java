package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_ColumnKeyColumnNames implements Reference 
{
 	@XendraRefTable(TableRef="AD_Column",
		KeyRef="AD_Column_ID",
		DisplayRef="ColumnName",
		IsValueDisplayed=false,
		WhereClause="AD_Column.IsKey='Y'",
		OrderByClause="AD_Column.ColumnName",
		Identifier="f7c65ea4-b670-b3ae-4fd5-be53705e111a")
	@XendraRef(Name="AD_Column Key ColumnNames",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:33:30.0",
		Extension="",
		Identifier="c48bb868-887b-d4f4-81fc-17af38a78354")
	public static final String Identifier = "c48bb868-887b-d4f4-81fc-17af38a78354";

}
