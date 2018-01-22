package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_User_SalesRep implements Reference 
{
 	@XendraRefTable(TableRef="AD_User",
		KeyRef="AD_User_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="EXISTS (SELECT * FROM C_BPartner bp WHERE AD_User.C_BPartner_ID=bp.C_BPartner_ID AND bp.IsSalesRep='Y')",
		OrderByClause="",
		Identifier="4376004d-2631-792b-bbe8-3d82baaf6a76")
	@XendraRef(Name="AD_User - SalesRep",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Sales Representative",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:32.0",
		Extension="",
		Identifier="15251147-a1b6-4a83-a3a5-2d3ae7db69d9")
	public static final String Identifier = "15251147-a1b6-4a83-a3a5-2d3ae7db69d9";

}
