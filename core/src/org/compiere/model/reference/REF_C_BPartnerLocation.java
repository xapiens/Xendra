package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_BPartnerLocation implements Reference 
{
 	@XendraRefTable(TableRef="C_BPartner_Location",
		KeyRef="C_BPartner_Location_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="abd61cad-6a91-4e76-8ef6-67b80fc63537")
	@XendraRef(Name="C_BPartner Location",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Locations of a Business Partner",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:11.0",
		Extension="",
		Identifier="8d01ccac-6606-99a5-ebc2-5a6e01980b37")
	public static final String Identifier = "8d01ccac-6606-99a5-ebc2-5a6e01980b37";

}
