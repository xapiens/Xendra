package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_DocTypeRMA implements Reference 
{
 	@XendraRefTable(TableRef="C_DocType",
		KeyRef="C_DocType_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="C_DocType.DocBaseType='SOO' AND C_DocType.DocSubType='RM' AND C_DocType.AD_Client_ID=@#AD_Client_ID@",
		OrderByClause="",
		Identifier="76e28c2b-7a6e-178f-0849-0497a09867b2")
	@XendraRef(Name="C_DocType RMA",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:34:28.0",
		Extension="",
		Identifier="8ed1e524-7705-819d-013c-a3306be80529")
	public static final String Identifier = "8ed1e524-7705-819d-013c-a3306be80529";

}
