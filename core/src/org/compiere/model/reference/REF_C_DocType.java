package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_DocType implements Reference 
{
 	@XendraRefTable(TableRef="C_DocType",
		KeyRef="C_DocType_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="C_DocType.AD_Client_ID=@#AD_Client_ID@",
		OrderByClause="",
		Identifier="568e76f3-b918-0ba2-cc0e-423f12bae1d8")
	@XendraRef(Name="C_DocType",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:31.0",
		Extension="",
		Identifier="f06eaf85-a231-e1cf-ebf8-59d002c13ab4")
	public static final String Identifier = "f06eaf85-a231-e1cf-ebf8-59d002c13ab4";

}
