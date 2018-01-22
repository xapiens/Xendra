package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_Warehouse implements Reference 
{
 	@XendraRefTable(TableRef="M_Warehouse",
		KeyRef="M_Warehouse_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="c2bf22dc-9987-44fe-b436-fbbd1b373554")
	@XendraRef(Name="M_Warehouse",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="2e715ef7-5912-a791-e611-698446ec66e2")
	public static final String Identifier = "2e715ef7-5912-a791-e611-698446ec66e2";

}
