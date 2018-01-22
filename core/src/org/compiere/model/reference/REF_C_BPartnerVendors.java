package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_BPartnerVendors implements Reference 
{
 	@XendraRefTable(TableRef="C_BPartner",
		KeyRef="C_BPartner_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="C_BPartner.IsVendor='Y'",
		OrderByClause="",
		Identifier="902bc85d-e3f1-a455-6853-3ceda055d477")
	@XendraRef(Name="C_BPartner Vendors",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Vendor selection",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:40.0",
		Extension="",
		Identifier="e62e2f52-4f98-9202-39f9-f664fd70c2e3")
	public static final String Identifier = "e62e2f52-4f98-9202-39f9-f664fd70c2e3";

}
