package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_ProductBOMStocked implements Reference 
{
 	@XendraRefTable(TableRef="M_Product",
		KeyRef="M_Product_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="M_Product.IsBOM='Y' AND M_Product.IsStocked='Y' AND M_Product.IsSummary='N'",
		OrderByClause="M_Product.Value",
		Identifier="1231bd08-4c20-f67e-b517-f01a69049c03")
	@XendraRef(Name="M_Product BOM (stocked)",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Products that are BOMs and stocked",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:17.0",
		Extension="",
		Identifier="8b1fe0be-1a6b-167f-67d3-2decbd5cb379")
	public static final String Identifier = "8b1fe0be-1a6b-167f-67d3-2decbd5cb379";

}
