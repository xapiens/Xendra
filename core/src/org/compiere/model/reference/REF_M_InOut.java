package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_InOut implements Reference 
{
 	@XendraRefTable(TableRef="M_InOut",
		KeyRef="M_InOut_ID",
		DisplayRef="DocumentNo",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="M_InOut.DocumentNo",
		Identifier="d5669de0-b9a8-4cd0-8143-e9ba79e757e4")
	@XendraRef(Name="M_InOut",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-09-19 17:23:37.0",
		Extension="",
		Identifier="779b91e7-abdf-ee0c-5f89-f7ba79e47ee6")
	public static final String Identifier = "779b91e7-abdf-ee0c-5f89-f7ba79e47ee6";

}
