package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_OrgAll implements Reference 
{
 	@XendraRefTable(TableRef="AD_Org",
		KeyRef="AD_Org_ID",
		DisplayRef="Name",
		IsValueDisplayed=true,
		WhereClause="",
		OrderByClause="AD_Org.Value",
		Identifier="17b61693-63dd-0891-3ce4-b34020d52a49")
	@XendraRef(Name="AD_Org (all)",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Organization selection",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:34.0",
		Extension="",
		Identifier="c51c396d-3026-2c1f-b979-24961a8cd969")
	public static final String Identifier = "c51c396d-3026-2c1f-b979-24961a8cd969";

}
