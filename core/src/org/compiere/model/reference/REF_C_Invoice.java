package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_Invoice implements Reference 
{
 	@XendraRefTable(TableRef="C_Invoice",
		KeyRef="C_Invoice_ID",
		DisplayRef="DocumentNo",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="C_Invoice.DocumentNo",
		Identifier="2298db77-49a9-f78f-7761-b4f866bb85b7")
	@XendraRef(Name="C_Invoice",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:32.0",
		Extension="",
		Identifier="7fd6a4ea-911e-151b-68bf-3a86cc5f06e3")
	public static final String Identifier = "7fd6a4ea-911e-151b-68bf-3a86cc5f06e3";

}
