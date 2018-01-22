package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_ProductNoSummary implements Reference 
{
 	@XendraRefTable(TableRef="M_Product",
		KeyRef="M_Product_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="M_Product.IsSummary='N'",
		OrderByClause="M_Product.Value",
		Identifier="15701c94-697c-c7a6-d54c-917563c5f3ac")
	@XendraRef(Name="M_Product (no summary)",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Product selection, no summary",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:28.0",
		Extension="",
		Identifier="28b49c4d-0409-b2e0-b70e-d686f8d6503f")
	public static final String Identifier = "28b49c4d-0409-b2e0-b70e-d686f8d6503f";

}
