package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_ProductionLine implements Reference 
{
 	@XendraRefTable(TableRef="M_ProductionLine",
		KeyRef="M_ProductionLine_ID",
		DisplayRef="Line",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="84f9e223-b21a-6d6f-72ec-85dc9f9eac56")
	@XendraRef(Name="M_ProductionLine",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:34:56.0",
		Extension="",
		Identifier="f699853b-860b-22cb-9641-da3d4d63523a")
	public static final String Identifier = "f699853b-860b-22cb-9641-da3d4d63523a";

}
