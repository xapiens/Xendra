package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_ProductStocked implements Reference 
{
 	@XendraRefTable(TableRef="M_Product",
		KeyRef="M_Product_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="M_Product.IsStocked='Y' AND M_Product.IsSummary='N'",
		OrderByClause="M_Product.Value",
		Identifier="7940202b-9738-5cb0-8a82-f7d9868eb5e9")
	@XendraRef(Name="M_Product (stocked)",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:01.0",
		Extension="",
		Identifier="716fae5e-de65-cb55-cec9-d3f538d9eff8")
	public static final String Identifier = "716fae5e-de65-cb55-cec9-d3f538d9eff8";

}
