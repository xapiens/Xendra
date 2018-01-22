package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_Greeting implements Reference 
{
 	@XendraRefTable(TableRef="C_Greeting",
		KeyRef="C_Greeting_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="82ec8b81-03ed-df76-87e5-08ddb45f1f26")
	@XendraRef(Name="C_Greeting",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:34:35.0",
		Extension="",
		Identifier="af02f834-1261-546e-c037-a4ec718c981e")
	public static final String Identifier = "af02f834-1261-546e-c037-a4ec718c981e";

}
