package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_PA_Goal implements Reference 
{
 	@XendraRefTable(TableRef="PA_Goal",
		KeyRef="PA_Goal_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="7b51939a-7cd1-4d7c-a7a0-c12e189e9256")
	@XendraRef(Name="PA_Goal",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:55:59.0",
		Extension="",
		Identifier="91ce4d54-70ea-4555-9e4f-f42f63ab75b8")
	public static final String Identifier = "91ce4d54-70ea-4555-9e4f-f42f63ab75b8";

}
