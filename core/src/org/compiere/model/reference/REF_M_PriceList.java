package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_PriceList implements Reference 
{
 	@XendraRefTable(TableRef="M_PriceList",
		KeyRef="M_PriceList_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="1ed9f5ee-d850-6141-4082-aeb0c7e5eec7")
	@XendraRef(Name="M_PriceList",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:21.0",
		Extension="",
		Identifier="a20c07c8-1fb7-74c6-ec9d-66afd2d29682")
	public static final String Identifier = "a20c07c8-1fb7-74c6-ec9d-66afd2d29682";

}
