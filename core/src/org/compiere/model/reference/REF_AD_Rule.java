package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_Rule implements Reference 
{
 	@XendraRefTable(TableRef="AD_Rule",
		KeyRef="AD_Rule_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="118c985e-4ccc-42db-9488-5cd0a61434f3")
	@XendraRef(Name="AD_Rule",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-04-29 09:55:19.0",
		Extension="",
		Identifier="1b6b7fa4-6b3f-164d-6151-85d9a2225bea")
	public static final String Identifier = "1b6b7fa4-6b3f-164d-6151-85d9a2225bea";

}
