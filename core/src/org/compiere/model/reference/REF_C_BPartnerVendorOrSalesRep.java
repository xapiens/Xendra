package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_BPartnerVendorOrSalesRep implements Reference 
{
 	@XendraRefTable(TableRef="C_BPartner",
		KeyRef="C_BPartner_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="(C_BPartner.IsSalesRep='Y' OR C_BPartner.IsVendor='Y')",
		OrderByClause="C_BPartner.Value",
		Identifier="d5dfa162-3c41-6976-4ab4-520fcd5336ad")
	@XendraRef(Name="C_BPartner Vendor or SalesRep",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Vendor or SalesRep selection",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:20.0",
		Extension="",
		Identifier="60ae0c61-2010-74a0-d56f-a6f27933c4c4")
	public static final String Identifier = "60ae0c61-2010-74a0-d56f-a6f27933c4c4";

}
