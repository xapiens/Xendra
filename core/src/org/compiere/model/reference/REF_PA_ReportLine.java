package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_PA_ReportLine implements Reference 
{
 	@XendraRefTable(TableRef="PA_ReportLine",
		KeyRef="PA_ReportLine_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="44d3697d-6b99-4f9f-cc4b-1bd72cead9a8")
	@XendraRef(Name="PA_ReportLine",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:34:38.0",
		Extension="",
		Identifier="9bbbed65-5787-d31e-8c94-be60c7811cf0")
	public static final String Identifier = "9bbbed65-5787-d31e-8c94-be60c7811cf0";

}
