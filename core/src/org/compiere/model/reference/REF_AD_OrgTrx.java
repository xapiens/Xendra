package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_OrgTrx implements Reference 
{
 	@XendraRefTable(TableRef="AD_Org",
		KeyRef="AD_Org_ID",
		DisplayRef="Name",
		IsValueDisplayed=true,
		WhereClause="AD_Org.IsSummary='N' AND AD_Org_ID <> 0",
		OrderByClause="AD_Org.Name",
		Identifier="f18afeb1-92cb-6dfc-00c9-f05d5469aea7")
	@XendraRef(Name="AD_Org (Trx)",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Organization selection, no summary, no 0",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:41.0",
		Extension="",
		Identifier="54e78591-f7f4-c613-ea27-e64b3dac5198")
	public static final String Identifier = "54e78591-f7f4-c613-ea27-e64b3dac5198";

}
