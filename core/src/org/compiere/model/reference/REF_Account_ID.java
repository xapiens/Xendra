package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_Account_ID implements Reference 
{
 	@XendraRefTable(TableRef="C_ElementValue",
		KeyRef="C_ElementValue_ID",
		DisplayRef="Name",
		IsValueDisplayed=true,
		WhereClause="C_ElementValue.IsActive='Y' AND C_ElementValue.C_Element_ID IN (SELECT C_Element_ID FROM C_AcctSchema_Element ase WHERE ase.ElementType='AC' AND ase.AD_Client_ID=@AD_Client_ID@)",
		OrderByClause="C_ElementValue.Value",
		Identifier="d222381b-1004-bd04-727c-7199de06b94d")
	@XendraRef(Name="Account_ID",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Account selection based on Client",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:34:39.0",
		Extension="",
		Identifier="c63c37c4-7a13-09ab-5af8-48da1b35609d")
	public static final String Identifier = "c63c37c4-7a13-09ab-5af8-48da1b35609d";

}
