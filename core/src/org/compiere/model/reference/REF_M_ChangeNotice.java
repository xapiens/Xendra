package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_ChangeNotice implements Reference 
{
 	@XendraRefTable(TableRef="M_ChangeNotice",
		KeyRef="M_ChangeNotice_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="10ea23d5-bf7b-d185-136a-934afc0dedc6")
	@XendraRef(Name="M_ChangeNotice",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:15.0",
		Extension="",
		Identifier="71c8e798-e72b-e0db-0a1a-3dc12b8f0b92")
	public static final String Identifier = "71c8e798-e72b-e0db-0a1a-3dc12b8f0b92";

}
