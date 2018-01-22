package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_Element implements Reference 
{
 	@XendraRefTable(TableRef="C_Element",
		KeyRef="C_Element_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="e6a238d5-f83a-41b0-b612-58d060b0acdf")
	@XendraRef(Name="C_Element",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Element selection",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:55:59.0",
		Extension="",
		Identifier="72674b6e-4ece-45a3-bb42-c313788bee5c")
	public static final String Identifier = "72674b6e-4ece-45a3-bb42-c313788bee5c";

}
