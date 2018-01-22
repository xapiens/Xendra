package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_ColumnInteger implements Reference 
{
 	@XendraRefTable(TableRef="AD_Column",
		KeyRef="AD_Column_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="AD_Column.AD_Reference_ID=11",
		OrderByClause="AD_Column.Name",
		Identifier="ffa971b8-ba85-9be8-5ca4-42a38c017e82")
	@XendraRef(Name="AD_Column Integer",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Integer Type only (Name)",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:10.0",
		Extension="",
		Identifier="ca7f71c1-2786-0991-ab6f-55504d012980")
	public static final String Identifier = "ca7f71c1-2786-0991-ab6f-55504d012980";

}
