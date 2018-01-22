package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_Process_JasperReports implements Reference 
{
 	@XendraRefTable(TableRef="AD_Process",
		KeyRef="AD_Process_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="AD_Process.JasperReport IS NOT NULL",
		OrderByClause="",
		Identifier="e256bc27-7bea-c671-c827-51596a86e264")
	@XendraRef(Name="AD_Process_JasperReports",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:19.0",
		Extension="",
		Identifier="3ad77c2a-8504-6a80-18dd-bd90b6f77a69")
	public static final String Identifier = "3ad77c2a-8504-6a80-18dd-bd90b6f77a69";

}
