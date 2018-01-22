package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_User_Supervisor implements Reference 
{
 	@XendraRefTable(TableRef="AD_User",
		KeyRef="AD_User_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="(AD_User.AD_Client_ID=0 AND AD_User.AD_User_ID=0) OR EXISTS (SELECT * FROM C_BPartner bp WHERE AD_User.C_BPartner_ID=bp.C_BPartner_ID AND (bp.IsEmployee='Y' OR bp.IsSalesRep='Y'))",
		OrderByClause="",
		Identifier="929d016d-c4d1-6c35-05d6-f8392c9f63db")
	@XendraRef(Name="AD_User - Supervisor",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Employee or SalesRep - or System",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:34:58.0",
		Extension="",
		Identifier="65ec50be-ff59-adbc-c1f5-a20495af24e5")
	public static final String Identifier = "65ec50be-ff59-adbc-c1f5-a20495af24e5";

}
