package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_DiscountSchemaNotPL implements Reference 
{
 	@XendraRefTable(TableRef="M_DiscountSchema",
		KeyRef="M_DiscountSchema_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="M_DiscountSchema.DiscountType<>'P'",
		OrderByClause="",
		Identifier="d16f94bc-df52-db81-6fe2-f7b6ab0fde47")
	@XendraRef(Name="M_DiscountSchema not PL",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Not Price List Discount Schema",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:08.0",
		Extension="",
		Identifier="3a3974a6-65b9-c98d-24a9-e5218ed456cd")
	public static final String Identifier = "3a3974a6-65b9-c98d-24a9-e5218ed456cd";

}
