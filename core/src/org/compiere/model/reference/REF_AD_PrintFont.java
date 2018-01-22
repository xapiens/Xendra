package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_PrintFont implements Reference 
{
 	@XendraRefTable(TableRef="AD_PrintFont",
		KeyRef="AD_PrintFont_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="bfe41e2d-2e8d-c6fc-47c8-280909798c35")
	@XendraRef(Name="AD_PrintFont",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:27.0",
		Extension="",
		Identifier="b6d71c22-8c19-d2cc-36b2-fdb87d405ba2")
	public static final String Identifier = "b6d71c22-8c19-d2cc-36b2-fdb87d405ba2";

}
