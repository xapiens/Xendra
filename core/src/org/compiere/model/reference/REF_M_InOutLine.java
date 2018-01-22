package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_InOutLine implements Reference 
{
 	@XendraRefTable(TableRef="M_InOutLine",
		KeyRef="M_InOutLine_ID",
		DisplayRef="Line",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="f3c8bf04-ca7d-138b-ab06-1d4f8ecf5088")
	@XendraRef(Name="M_InOutLine",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:34:56.0",
		Extension="",
		Identifier="09bcaf38-49c7-0311-4a15-1296d9699294")
	public static final String Identifier = "09bcaf38-49c7-0311-4a15-1296d9699294";

}
