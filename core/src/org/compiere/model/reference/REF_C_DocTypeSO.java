package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_DocTypeSO implements Reference 
{
 	@XendraRefTable(TableRef="C_DocType",
		KeyRef="C_DocType_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="C_DocType.DocBaseType='SOO' AND C_DocType.AD_Client_ID=@#AD_Client_ID@",
		OrderByClause="",
		Identifier="72253526-b28e-4d5d-8fd1-a543ecf67893")
	@XendraRef(Name="C_DocType SO",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:55:59.0",
		Extension="",
		Identifier="cd55f1b5-b7eb-4185-9a8a-623fd3182ba9")
	public static final String Identifier = "cd55f1b5-b7eb-4185-9a8a-623fd3182ba9";

}
