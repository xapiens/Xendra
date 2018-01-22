package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_Cash implements Reference 
{
 	@XendraRefTable(TableRef="C_Cash",
		KeyRef="C_Cash_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="caa379b2-f9ec-49d2-ba8a-93550eda3979")
	@XendraRef(Name="C_Cash",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:56:00.0",
		Extension="",
		Identifier="f7d19288-4a1e-407f-8a64-1d3b8c4127a6")
	public static final String Identifier = "f7d19288-4a1e-407f-8a64-1d3b8c4127a6";

}
