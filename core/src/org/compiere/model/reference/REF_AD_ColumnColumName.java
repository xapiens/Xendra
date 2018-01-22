package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_ColumnColumName implements Reference 
{
 	@XendraRefTable(TableRef="AD_Column",
		KeyRef="AD_Column_ID",
		DisplayRef="ColumnName",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="AD_Column.AD_Table_ID,AD_Column.ColumnName",
		Identifier="14dd53df-3362-59c9-d3ae-ff7addbf86f5")
	@XendraRef(Name="AD_Column ColumName",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Column selection",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:34:19.0",
		Extension="",
		Identifier="71e45f6b-5379-d679-4b75-d0871acf908f")
	public static final String Identifier = "71e45f6b-5379-d679-4b75-d0871acf908f";

}
