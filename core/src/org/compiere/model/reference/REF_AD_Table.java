package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_Table implements Reference 
{
 	@XendraRefTable(TableRef="AD_Table",
		KeyRef="AD_Table_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="cca00d77-637d-4fa8-af24-8f2ba99b8397")
	@XendraRef(Name="AD_Table",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2016-07-13 14:47:17.116",
		Extension="",
		Identifier="b70d661b-ada2-4363-b08e-cabeae5308b1")
	public static final String Identifier = "b70d661b-ada2-4363-b08e-cabeae5308b1";

}
