package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_UOM implements Reference 
{
 	@XendraRefTable(TableRef="C_UOM",
		KeyRef="C_UOM_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="1b739588-67f1-6821-e237-bdb3961037e4")
	@XendraRef(Name="C_UOM",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Unit of Measure selection",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:16.0",
		Extension="",
		Identifier="723d7831-ccf2-1634-fe46-62dbc58e9a8e")
	public static final String Identifier = "723d7831-ccf2-1634-fe46-62dbc58e9a8e";

}
