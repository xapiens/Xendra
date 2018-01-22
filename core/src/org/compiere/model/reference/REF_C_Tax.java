package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_Tax implements Reference 
{
 	@XendraRefTable(TableRef="C_Tax",
		KeyRef="C_Tax_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="8a75eee9-d384-ae47-071b-f49d212556a8")
	@XendraRef(Name="C_Tax",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Tax selection",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:38.0",
		Extension="",
		Identifier="411ade7b-1736-d48c-6ab6-5608326984b1")
	public static final String Identifier = "411ade7b-1736-d48c-6ab6-5608326984b1";

}
