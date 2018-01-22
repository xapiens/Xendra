package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_PosPrintFormat implements Reference 
{
 	@XendraRefTable(TableRef="AD_PosPrintFormat",
		KeyRef="AD_PosPrintFormat_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="f6fed58c-f296-375d-e088-337d897e3007")
	@XendraRef(Name="AD_PosPrintFormat",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:21.0",
		Extension="",
		Identifier="e88a1d0d-c373-b418-2359-964837000a60")
	public static final String Identifier = "e88a1d0d-c373-b418-2359-964837000a60";

}
