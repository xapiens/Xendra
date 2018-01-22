package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_Region implements Reference 
{
 	@XendraRefTable(TableRef="C_Region",
		KeyRef="C_Region_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="4479c3eb-3218-9602-1d3e-fcfef60a02fe")
	@XendraRef(Name="C_Region",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Region selection",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:39.0",
		Extension="",
		Identifier="f560243f-2ea5-bcb4-265f-52555b17a707")
	public static final String Identifier = "f560243f-2ea5-bcb4-265f-52555b17a707";

}
