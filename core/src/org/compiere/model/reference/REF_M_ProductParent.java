package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_ProductParent implements Reference 
{
 	@XendraRefTable(TableRef="M_Product",
		KeyRef="M_Product_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="M_Product.IsSummary='Y'",
		OrderByClause="M_Product.Value",
		Identifier="068154c1-55e2-4a7f-85ce-c52a0669886b")
	@XendraRef(Name="M_Product Parent",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:55:59.0",
		Extension="",
		Identifier="29eda9fb-59b3-438f-a69f-909829a256e4")
	public static final String Identifier = "29eda9fb-59b3-438f-a69f-909829a256e4";

}
