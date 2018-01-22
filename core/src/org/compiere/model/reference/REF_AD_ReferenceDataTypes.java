package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_ReferenceDataTypes implements Reference 
{
 	@XendraRefTable(TableRef="AD_Reference",
		KeyRef="AD_Reference_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="AD_Reference.ValidationType='D'",
		OrderByClause="AD_Reference.Name",
		Identifier="5b77b5a4-95d2-1503-d6d9-c91e682945c8")
	@XendraRef(Name="AD_Reference Data Types",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Data Type selection",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:41.0",
		Extension="",
		Identifier="17ec718c-707b-498f-3a6c-e81d1630e510")
	public static final String Identifier = "17ec718c-707b-498f-3a6c-e81d1630e510";

}
