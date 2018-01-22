package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_BPartnerVendorsAvtive implements Reference 
{
 	@XendraRefTable(TableRef="C_BPartner",
		KeyRef="C_BPartner_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="C_BPartner.IsVendor='Y' AND EXISTS (SELECT * FROM M_Product_PO po WHERE C_BPartner.C_BPartner_ID=po.C_BPartner_ID)",
		OrderByClause="",
		Identifier="b6d7592d-233b-468c-96e1-772d8617b959")
	@XendraRef(Name="C_BPartner Vendors Avtive",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Vendor selection",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-09-19 17:23:37.0",
		Extension="",
		Identifier="60e2b12f-196f-658f-c0d4-7febb9fd017d")
	public static final String Identifier = "60e2b12f-196f-658f-c0d4-7febb9fd017d";

}
