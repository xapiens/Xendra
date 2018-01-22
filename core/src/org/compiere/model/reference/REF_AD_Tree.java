package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_Tree implements Reference 
{
 	@XendraRefTable(TableRef="AD_Tree",
		KeyRef="AD_Tree_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="0aba6031-3719-0716-6adf-b903896a83dd")
	@XendraRef(Name="AD_Tree",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Tree selection",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:34:40.0",
		Extension="",
		Identifier="79a8ec82-b2c4-01ef-3d8c-2a2a8d8a2952")
	public static final String Identifier = "79a8ec82-b2c4-01ef-3d8c-2a2a8d8a2952";

}
