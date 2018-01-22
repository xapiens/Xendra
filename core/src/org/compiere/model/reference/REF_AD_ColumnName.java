package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_ColumnName implements Reference 
{
 	@XendraRefTable(TableRef="AD_Column",
		KeyRef="AD_Column_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="AD_Column.Name",
		Identifier="f209bf72-98e4-6b41-b4aa-8542620a6ba3")
	@XendraRef(Name="AD_Column Name",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Column selection",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:29.0",
		Extension="",
		Identifier="06ce5e33-2936-71a4-56b8-5876a5a39218")
	public static final String Identifier = "06ce5e33-2936-71a4-56b8-5876a5a39218";

}
