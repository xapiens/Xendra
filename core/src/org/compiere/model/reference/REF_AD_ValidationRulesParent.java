package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_ValidationRulesParent implements Reference 
{
 	@XendraRefTable(TableRef="AD_Val_Rule",
		KeyRef="AD_Val_Rule_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="AD_Val_Rule.Name",
		Identifier="5c280e9b-d3db-4b5b-88c6-88a0de874cdb")
	@XendraRef(Name="AD_Validation Rules Parent",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Validation rule Parent selection",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:56:14.0",
		Extension="",
		Identifier="99b760e3-f553-440c-aedc-fc7859a263c5")
	public static final String Identifier = "99b760e3-f553-440c-aedc-fc7859a263c5";

}
