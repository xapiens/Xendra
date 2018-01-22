package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_OrgParent implements Reference 
{
 	@XendraRefTable(TableRef="AD_Org",
		KeyRef="AD_Org_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="EXISTS (SELECT * FROM AD_OrgInfo WHERE AD_Org.AD_Org_ID=AD_OrgInfo.AD_Org_ID AND AD_OrgInfo.IsSummary='Y')",
		OrderByClause="AD_Org.Name",
		Identifier="9d4568c7-885c-4518-a95e-19373d3335d4")
	@XendraRef(Name="AD_Org Parent",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Organization Parent selection",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:56:14.0",
		Extension="",
		Identifier="b6595ab1-d29c-492a-bede-1d1a6ca4dedc")
	public static final String Identifier = "b6595ab1-d29c-492a-bede-1d1a6ca4dedc";

}
