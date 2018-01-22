package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_User_Internal implements Reference 
{
 	@XendraRefTable(TableRef="AD_User",
		KeyRef="AD_User_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="EXISTS (SELECT * FROM C_BPartner bp WHERE AD_User.C_BPartner_ID=bp.C_BPartner_ID AND (bp.IsEmployee='Y' OR bp.IsSalesRep='Y'))",
		OrderByClause="",
		Identifier="45dd9366-f131-4397-bdc6-351776a3e3ab")
	@XendraRef(Name="AD_User - Internal",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Employee or SalesRep",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:35.0",
		Extension="",
		Identifier="91f52193-02ab-6545-99f8-d6d30b9d03a1")
	public static final String Identifier = "91f52193-02ab-6545-99f8-d6d30b9d03a1";

}
