package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_PaymentTerm implements Reference 
{
 	@XendraRefTable(TableRef="C_PaymentTerm",
		KeyRef="C_PaymentTerm_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="a21570d3-925a-9914-1869-ecf4bcb235e6")
	@XendraRef(Name="C_PaymentTerm",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:21.0",
		Extension="",
		Identifier="270bb22c-6cc2-0c4d-3be6-25fe6410f4c2")
	public static final String Identifier = "270bb22c-6cc2-0c4d-3be6-25fe6410f4c2";

}
