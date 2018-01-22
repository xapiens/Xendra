package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_BPartnerParent implements Reference 
{
 	@XendraRefTable(TableRef="C_BPartner",
		KeyRef="C_BPartner_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="C_BPartner.IsSummary='Y'",
		OrderByClause="",
		Identifier="af75c92b-5dd1-2153-fda3-e0f5fd2c8504")
	@XendraRef(Name="C_BPartner Parent",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Business Partner Parent selection",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:34:35.0",
		Extension="",
		Identifier="f284d599-9026-87ae-ad24-8dd18dcf4a85")
	public static final String Identifier = "f284d599-9026-87ae-ad24-8dd18dcf4a85";

}
