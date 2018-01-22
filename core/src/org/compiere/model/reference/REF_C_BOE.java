package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_BOE implements Reference 
{
 	@XendraRefTable(TableRef="C_BOE",
		KeyRef="C_BOE_ID",
		DisplayRef="DocumentNo",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="9f208850-d4de-cf08-6c50-100214ea31d6")
	@XendraRef(Name="C_BOE",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:11.0",
		Extension="",
		Identifier="15ad633b-67da-5ecc-9ec0-d9f415de8616")
	public static final String Identifier = "15ad633b-67da-5ecc-9ec0-d9f415de8616";

}
