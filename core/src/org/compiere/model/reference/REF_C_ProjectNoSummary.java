package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_ProjectNoSummary implements Reference 
{
 	@XendraRefTable(TableRef="C_Project",
		KeyRef="C_Project_ID",
		DisplayRef="Name",
		IsValueDisplayed=true,
		WhereClause="C_Project.IsSummary='N'",
		OrderByClause="",
		Identifier="625e5295-83d9-413a-ef49-4fc64506fbce")
	@XendraRef(Name="C_Project (No summary)",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Project selection",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:28.0",
		Extension="",
		Identifier="f0d2b7ce-fddd-d171-9e31-adfff06b668b")
	public static final String Identifier = "f0d2b7ce-fddd-d171-9e31-adfff06b668b";

}
