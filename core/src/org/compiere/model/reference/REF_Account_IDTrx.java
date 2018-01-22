package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_Account_IDTrx implements Reference 
{
 	@XendraRefTable(TableRef="C_ElementValue",
		KeyRef="C_ElementValue_ID",
		DisplayRef="Name",
		IsValueDisplayed=true,
		WhereClause="C_ElementValue.IsActive='Y' AND C_ElementValue.IsSummary='N' AND C_ElementValue.C_Element_ID IN (SELECT C_Element_ID FROM C_AcctSchema_Element ase WHERE ase.ElementType='AC' AND ase.AD_Client_ID=@AD_Client_ID@)",
		OrderByClause="C_ElementValue.Value",
		Identifier="67052191-30d8-dfba-09f8-1b31ed59918c")
	@XendraRef(Name="Account_ID (Trx)",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Account selection based on Client",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:34:55.0",
		Extension="",
		Identifier="fca59846-3472-6195-37e9-9b8f95376f02")
	public static final String Identifier = "fca59846-3472-6195-37e9-9b8f95376f02";

}
