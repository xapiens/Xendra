package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_PrintFormat implements Reference 
{
 	@XendraRefTable(TableRef="AD_PrintFormat",
		KeyRef="AD_PrintFormat_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="99e7dc4e-50e6-18bc-9213-63bc95bf91bf")
	@XendraRef(Name="AD_PrintFormat",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:04.0",
		Extension="",
		Identifier="377b8075-d154-6c3b-1cc0-dea545937fae")
	public static final String Identifier = "377b8075-d154-6c3b-1cc0-dea545937fae";

}
