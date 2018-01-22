package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_AcctSchema implements Reference 
{
 	@XendraRefTable(TableRef="C_AcctSchema",
		KeyRef="C_AcctSchema_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="be62eeb9-f958-964b-fcca-dd42eafcdaf3")
	@XendraRef(Name="C_AcctSchema",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Accounting Schema selection",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:34:40.0",
		Extension="",
		Identifier="d6951844-6f79-a10f-bc74-3aaec4f0e638")
	public static final String Identifier = "d6951844-6f79-a10f-bc74-3aaec4f0e638";

}
