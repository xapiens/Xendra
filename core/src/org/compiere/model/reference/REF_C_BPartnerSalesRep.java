package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_BPartnerSalesRep implements Reference 
{
 	@XendraRefTable(TableRef="C_BPartner",
		KeyRef="C_BPartner_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="C_BPartner.IsSalesRep='Y'",
		OrderByClause="C_BPartner.Value",
		Identifier="0ab61c93-9227-9f83-a4ae-196fc98f6c8c")
	@XendraRef(Name="C_BPartner SalesRep",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="BP SalesRep selection",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:40.0",
		Extension="",
		Identifier="c6cc3f47-f990-9f4c-33c8-27d755ea2c25")
	public static final String Identifier = "c6cc3f47-f990-9f4c-33c8-27d755ea2c25";

}
