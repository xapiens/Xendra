package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_Window implements Reference 
{
 	@XendraRefTable(TableRef="AD_Window",
		KeyRef="AD_Window_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="AD_Window.Name",
		Identifier="24287f94-8c93-13d2-9ffc-a4d139db0b8d")
	@XendraRef(Name="AD_Window",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:33:56.0",
		Extension="",
		Identifier="d814dc80-8931-fe2b-5f95-5a43f13d7530")
	public static final String Identifier = "d814dc80-8931-fe2b-5f95-5a43f13d7530";

}
