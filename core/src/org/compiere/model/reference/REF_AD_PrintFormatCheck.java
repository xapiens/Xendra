package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_PrintFormatCheck implements Reference 
{
 	@XendraRefTable(TableRef="AD_PrintFormat",
		KeyRef="AD_PrintFormat_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="AD_PrintFormat.AD_Table_ID=498",
		OrderByClause="",
		Identifier="49889a5c-eec8-c3d5-85a3-dede1b06d61e")
	@XendraRef(Name="AD_PrintFormat Check",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:04.0",
		Extension="",
		Identifier="c6373860-2da1-9b9a-fb99-6ddafee99e3f")
	public static final String Identifier = "c6373860-2da1-9b9a-fb99-6ddafee99e3f";

}
