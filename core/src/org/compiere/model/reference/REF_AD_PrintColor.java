package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_PrintColor implements Reference 
{
 	@XendraRefTable(TableRef="AD_PrintColor",
		KeyRef="AD_PrintColor_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="7620e39f-0b74-17d6-f66e-952d9f79f27a")
	@XendraRef(Name="AD_PrintColor",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:27.0",
		Extension="",
		Identifier="a7e43a27-3ce0-e9aa-8f3c-78e2921fc1cd")
	public static final String Identifier = "a7e43a27-3ce0-e9aa-8f3c-78e2921fc1cd";

}
