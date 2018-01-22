package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_ElementValueTrx implements Reference 
{
 	@XendraRefTable(TableRef="C_ElementValue",
		KeyRef="C_ElementValue_ID",
		DisplayRef="Name",
		IsValueDisplayed=true,
		WhereClause="C_ElementValue.IsSummary<>'Y'",
		OrderByClause="C_ElementValue.Value",
		Identifier="0fb52375-0212-d079-66b2-111ce0f6e447")
	@XendraRef(Name="C_ElementValue (trx)",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Element Values",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:27.0",
		Extension="",
		Identifier="2c49a6bb-f3ab-0f31-6447-eadfef443fd5")
	public static final String Identifier = "2c49a6bb-f3ab-0f31-6447-eadfef443fd5";

}
