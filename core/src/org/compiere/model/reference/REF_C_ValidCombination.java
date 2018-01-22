package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_ValidCombination implements Reference 
{
 	@XendraRefTable(TableRef="C_ValidCombination",
		KeyRef="C_ValidCombination_ID",
		DisplayRef="Account_ID",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="d2952178-8e38-4fe3-89b0-f8b23923ff64")
	@XendraRef(Name="C_ValidCombination",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Valid Account combinations",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:56:00.0",
		Extension="",
		Identifier="9883ee91-9b0d-40ab-8de2-29713bed409d")
	public static final String Identifier = "9883ee91-9b0d-40ab-8de2-29713bed409d";

}
