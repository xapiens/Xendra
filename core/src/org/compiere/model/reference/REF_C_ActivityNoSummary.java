package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_ActivityNoSummary implements Reference 
{
 	@XendraRefTable(TableRef="C_Activity",
		KeyRef="C_Activity_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="C_Activity.IsSummary='N'",
		OrderByClause="",
		Identifier="44a76b92-8a24-3ace-6270-862b4221a12d")
	@XendraRef(Name="C_Activity (No summary)",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Activity selection",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:28.0",
		Extension="",
		Identifier="ff86bdb6-d331-b535-29d7-9e8692e394b4")
	public static final String Identifier = "ff86bdb6-d331-b535-29d7-9e8692e394b4";

}
