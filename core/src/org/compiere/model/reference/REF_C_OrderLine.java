package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_OrderLine implements Reference 
{
 	@XendraRefTable(TableRef="C_OrderLine",
		KeyRef="C_OrderLine_ID",
		DisplayRef="Line",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="2bdb302d-53da-924d-6be5-f193b62165a8")
	@XendraRef(Name="C_OrderLine",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Order Line",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:38.0",
		Extension="",
		Identifier="8e7a8b36-b7aa-df26-9eda-1d35457a9157")
	public static final String Identifier = "8e7a8b36-b7aa-df26-9eda-1d35457a9157";

}
