package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_BankAccount implements Reference 
{
 	@XendraRefTable(TableRef="C_BankAccount",
		KeyRef="C_BankAccount_ID",
		DisplayRef="AccountNo",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="C_BankAccount.AccountNo",
		Identifier="3d70b0f6-5182-ce36-3046-72649dd40dd7")
	@XendraRef(Name="C_BankAccount",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:34:00.0",
		Extension="",
		Identifier="a43649fa-c8bd-ecd9-6496-45a4d285f2f7")
	public static final String Identifier = "a43649fa-c8bd-ecd9-6496-45a4d285f2f7";

}
