package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_PrintFormatNotTableBased implements Reference 
{
 	@XendraRefTable(TableRef="AD_PrintFormat",
		KeyRef="AD_PrintFormat_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="AD_PrintFormat.IsTableBased='N'",
		OrderByClause="AD_PrintFormat.Name",
		Identifier="974f491b-f559-4274-b8d5-9a39ab5f9aee")
	@XendraRef(Name="AD_PrintFormat Not TableBased",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:56:14.0",
		Extension="",
		Identifier="936a0991-17bc-452a-a4be-bab511723944")
	public static final String Identifier = "936a0991-17bc-452a-a4be-bab511723944";

}
