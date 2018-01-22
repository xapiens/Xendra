package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_PrintFormatOrder implements Reference 
{
 	@XendraRefTable(TableRef="AD_PrintFormat",
		KeyRef="AD_PrintFormat_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="AD_PrintFormat.AD_Table_ID=496",
		OrderByClause="",
		Identifier="6c763b15-9cf4-59fd-116c-15537e085446")
	@XendraRef(Name="AD_PrintFormat Order",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:04.0",
		Extension="",
		Identifier="0110e526-2029-dac7-1867-335aaa97f67b")
	public static final String Identifier = "0110e526-2029-dac7-1867-335aaa97f67b";

}
