package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_OrgAllBut0 implements Reference 
{
 	@XendraRefTable(TableRef="AD_Org",
		KeyRef="AD_Org_ID",
		DisplayRef="Name",
		IsValueDisplayed=true,
		WhereClause="AD_Org.AD_Org_ID<>0",
		OrderByClause="",
		Identifier="a386c5f6-ad8e-34e7-f7fe-14eef4e0f812")
	@XendraRef(Name="AD_Org (all but 0)",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Organization selection",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:26.0",
		Extension="",
		Identifier="03b73d55-8464-9bbd-df2b-d10ff9f3913f")
	public static final String Identifier = "03b73d55-8464-9bbd-df2b-d10ff9f3913f";

}
