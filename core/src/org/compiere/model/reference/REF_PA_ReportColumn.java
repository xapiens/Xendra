package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_PA_ReportColumn implements Reference 
{
 	@XendraRefTable(TableRef="PA_ReportColumn",
		KeyRef="PA_ReportColumn_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="7b1fc163-caf2-4313-c94b-933d5f0380a9")
	@XendraRef(Name="PA_ReportColumn",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:34:31.0",
		Extension="",
		Identifier="f6b67787-41dd-6bd8-8193-797a7fd5ffb2")
	public static final String Identifier = "f6b67787-41dd-6bd8-8193-797a7fd5ffb2";

}
