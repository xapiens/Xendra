package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_Process implements Reference 
{
 	@XendraRefTable(TableRef="AD_Process",
		KeyRef="AD_Process_ID",
		DisplayRef="Value",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="936ff3d1-61ef-4add-9ddb-18c9f5334172")
	@XendraRef(Name="AD_Process",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:56:00.0",
		Extension="",
		Identifier="231cfa60-f092-45cb-a84b-c4dc6c162a57")
	public static final String Identifier = "231cfa60-f092-45cb-a84b-c4dc6c162a57";

}
