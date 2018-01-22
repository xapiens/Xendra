package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_ProductCategory implements Reference 
{
 	@XendraRefTable(TableRef="M_Product_Category",
		KeyRef="M_Product_Category_ID",
		DisplayRef="Name",
		IsValueDisplayed=true,
		WhereClause="",
		OrderByClause="M_Product_Category.Name",
		Identifier="d41e68f5-6c85-6188-0e18-8d5aa2c27388")
	@XendraRef(Name="M_Product Category ",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:15.0",
		Extension="",
		Identifier="36e5e285-96f7-de95-1ec8-5e02581d0f51")
	public static final String Identifier = "36e5e285-96f7-de95-1ec8-5e02581d0f51";

}
