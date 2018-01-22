package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_Transaction implements Reference 
{
 	@XendraRefTable(TableRef="M_Transaction",
		KeyRef="M_Transaction_ID",
		DisplayRef="MovementDate",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="d8d7d4f1-84d4-4dfb-2813-cba4346ef481")
	@XendraRef(Name="M_Transaction",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:34:56.0",
		Extension="",
		Identifier="859ed0e6-0ba2-1fb0-8b19-4bb3433e134c")
	public static final String Identifier = "859ed0e6-0ba2-1fb0-8b19-4bb3433e134c";

}
