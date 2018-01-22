package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_Currencies implements Reference 
{
 	@XendraRefTable(TableRef="C_Currency",
		KeyRef="C_Currency_ID",
		DisplayRef="ISO_Code",
		IsValueDisplayed=false,
		WhereClause="C_Currency.IsEMUMember='N' AND C_Currency.IsActive='Y'",
		OrderByClause="C_Currency.ISO_Code",
		Identifier="bd59bd0b-314d-9037-77cb-83f16f85c764")
	@XendraRef(Name="C_Currencies",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Currencies with dynamic exchange rate selection",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:31.0",
		Extension="",
		Identifier="f518e797-c49f-bc60-667a-48fd618f8ee8")
	public static final String Identifier = "f518e797-c49f-bc60-667a-48fd618f8ee8";

}
