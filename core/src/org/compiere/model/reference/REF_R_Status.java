package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_R_Status implements Reference 
{
 	@XendraRefTable(TableRef="R_Status",
		KeyRef="R_Status_ID",
		DisplayRef="SeqNo",
		IsValueDisplayed=true,
		WhereClause="",
		OrderByClause="",
		Identifier="0dd3388e-a9fb-89f7-809c-c1e3fe0e90ce")
	@XendraRef(Name="R_Status",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:34:03.0",
		Extension="",
		Identifier="81bbd31b-9a83-4bba-fe09-50c8d5a06a9c")
	public static final String Identifier = "81bbd31b-9a83-4bba-fe09-50c8d5a06a9c";

}
