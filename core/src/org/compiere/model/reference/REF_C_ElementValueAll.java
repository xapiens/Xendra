package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_ElementValueAll implements Reference 
{
 	@XendraRefTable(TableRef="C_ElementValue",
		KeyRef="C_ElementValue_ID",
		DisplayRef="Name",
		IsValueDisplayed=true,
		WhereClause="",
		OrderByClause="C_ElementValue.Value",
		Identifier="92b140d8-9327-5c0a-3a30-fd9df51dc43e")
	@XendraRef(Name="C_ElementValue (all)",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Element Values",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:34:49.0",
		Extension="",
		Identifier="4a70ea12-0269-0422-814e-17afaa3a5479")
	public static final String Identifier = "4a70ea12-0269-0422-814e-17afaa3a5479";

}
