package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_Order implements Reference 
{
 	@XendraRefTable(TableRef="C_Order",
		KeyRef="C_Order_ID",
		DisplayRef="DocumentNo",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="C_Order.DocumentNo",
		Identifier="a2111ef6-c84f-7f38-78f0-68dbe9f912cc")
	@XendraRef(Name="C_Order",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Order",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:34:50.0",
		Extension="",
		Identifier="0dbd9edb-94cc-bd5a-1824-0c6381e7976b")
	public static final String Identifier = "0dbd9edb-94cc-bd5a-1824-0c6381e7976b";

}
