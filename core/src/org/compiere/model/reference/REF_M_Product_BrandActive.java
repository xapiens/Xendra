package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_Product_BrandActive implements Reference 
{
 	@XendraRefTable(TableRef="M_Product_Brand",
		KeyRef="M_Product_Brand_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="M_Product_Brand.IsActive='Y'",
		OrderByClause="",
		Identifier="ee031f1e-4a24-4495-b1ce-9bf1e0fedd4b")
	@XendraRef(Name="M_Product_Brand Active",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Product Brand Active",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:56:00.0",
		Extension="",
		Identifier="0e82ea0a-10f0-4e0b-8f1c-7c8b2099e0b8")
	public static final String Identifier = "0e82ea0a-10f0-4e0b-8f1c-7c8b2099e0b8";

}
