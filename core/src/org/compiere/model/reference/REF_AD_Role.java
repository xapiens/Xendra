package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_Role implements Reference 
{
 	@XendraRefTable(TableRef="AD_Role",
		KeyRef="AD_Role_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="13d655fc-e41d-078e-b717-98988f34754c")
	@XendraRef(Name="AD_Role",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Role selection",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:21.0",
		Extension="",
		Identifier="392cc08e-eea6-2c85-9f18-1c61d58c46cf")
	public static final String Identifier = "392cc08e-eea6-2c85-9f18-1c61d58c46cf";

}
