package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_DiscountSchema implements Reference 
{
 	@XendraRefTable(TableRef="M_DiscountSchema",
		KeyRef="M_DiscountSchema_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="1ba28ba8-abaf-8469-8126-6ca6394b6d7b")
	@XendraRef(Name="M_DiscountSchema",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:34:36.0",
		Extension="",
		Identifier="215fba0f-8a91-3201-421e-8c8fb8ae41c0")
	public static final String Identifier = "215fba0f-8a91-3201-421e-8c8fb8ae41c0";

}
