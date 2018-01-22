package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_DocTypePurchases implements Reference 
{
 	@XendraRefTable(TableRef="C_DocType",
		KeyRef="C_DocType_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="C_DocType.IsSOTrx='N'",
		OrderByClause="",
		Identifier="9b100a55-0c5e-4cec-bbb5-6e47555b475c")
	@XendraRef(Name="C_DocType Purchases",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="L",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:55:59.0",
		Extension="",
		Identifier="a8270c16-458a-4070-a199-73b037d7d080")
	public static final String Identifier = "a8270c16-458a-4070-a199-73b037d7d080";

}
