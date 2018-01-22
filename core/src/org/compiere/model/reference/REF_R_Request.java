package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_R_Request implements Reference 
{
 	@XendraRefTable(TableRef="R_Request",
		KeyRef="R_Request_ID",
		DisplayRef="DocumentNo",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="a1dcddca-03be-4d0a-148d-44a07614a4b9")
	@XendraRef(Name="R_Request",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:15.0",
		Extension="",
		Identifier="ccd480fb-0302-13e0-aac2-37b21533eebf")
	public static final String Identifier = "ccd480fb-0302-13e0-aac2-37b21533eebf";

}
