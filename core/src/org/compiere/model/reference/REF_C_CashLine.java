package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_CashLine implements Reference 
{
 	@XendraRefTable(TableRef="C_CashLine",
		KeyRef="C_CashLine_ID",
		DisplayRef="Line",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="1e8fb957-fbee-47d8-a4b6-f7632d227913")
	@XendraRef(Name="C_CashLine",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:56:00.0",
		Extension="",
		Identifier="42beb971-f65e-475e-9e56-2c441071a71f")
	public static final String Identifier = "42beb971-f65e-475e-9e56-2c441071a71f";

}
