package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_BPartnerCustomers implements Reference 
{
 	@XendraRefTable(TableRef="C_BPartner",
		KeyRef="C_BPartner_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="C_BPartner.IsCustomer='Y'",
		OrderByClause="",
		Identifier="ae2beb3a-274d-61d9-ac35-920b24797683")
	@XendraRef(Name="C_BPartner Customers",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Customer selection",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:07.0",
		Extension="",
		Identifier="3e4406f7-96ab-1533-375a-4f34b79f0576")
	public static final String Identifier = "3e4406f7-96ab-1533-375a-4f34b79f0576";

}
