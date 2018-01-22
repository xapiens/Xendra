package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_User implements Reference 
{
 	@XendraRefTable(TableRef="AD_User",
		KeyRef="AD_User_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="AD_User.Name",
		Identifier="3b2a966d-bc89-974d-b374-8fe5a95e97cc")
	@XendraRef(Name="AD_User",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="User selection",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:42.0",
		Extension="",
		Identifier="606fce88-e8f3-4df6-0617-746fb6a85b2b")
	public static final String Identifier = "606fce88-e8f3-4df6-0617-746fb6a85b2b";

}
