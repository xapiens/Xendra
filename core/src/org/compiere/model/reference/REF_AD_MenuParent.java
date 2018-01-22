package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_MenuParent implements Reference 
{
 	@XendraRefTable(TableRef="AD_Menu",
		KeyRef="AD_Menu_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="AD_Menu.IsSummary='Y'",
		OrderByClause="",
		Identifier="6baccbfa-d2f5-0d6c-434d-3bd8c9e8e473")
	@XendraRef(Name="AD_Menu Parent",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Menu Parent selection",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:34:44.0",
		Extension="",
		Identifier="732de916-4ff7-1da8-4be7-4ad93ce9a563")
	public static final String Identifier = "732de916-4ff7-1da8-4be7-4ad93ce9a563";

}
