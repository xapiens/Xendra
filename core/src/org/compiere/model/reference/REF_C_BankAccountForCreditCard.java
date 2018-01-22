package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_BankAccountForCreditCard implements Reference 
{
 	@XendraRefTable(TableRef="C_BankAccount",
		KeyRef="C_BankAccount_ID",
		DisplayRef="AccountNo",
		IsValueDisplayed=false,
		WhereClause="C_BankAccount.IsCreditCardAcct='Y'",
		OrderByClause="",
		Identifier="c95b4c68-0877-4fef-8521-46c808b09221")
	@XendraRef(Name="C_BankAccount for Credit Card",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:55:58.0",
		Extension="",
		Identifier="c5106f01-b187-48ca-b4f0-1da0225f656b")
	public static final String Identifier = "c5106f01-b187-48ca-b4f0-1da0225f656b";

}
