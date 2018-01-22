package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_CashTrxType implements Reference 
{
 	@XendraRefItem(Name="Invoice",
		Value="I",
		Description="",
		Identifier="64977405-bc8f-f657-a423-295fc4ed9579")
	/** Invoice = I */
	public static final String Invoice = "I";
	@XendraRefItem(Name="Charge",
		Value="C",
		Description="",
		Identifier="086670a6-c65c-19fd-d89e-34b0477f527c")
	/** Charge = C */
	public static final String Charge = "C";
	@XendraRefItem(Name="General Expense",
		Value="E",
		Description="",
		Identifier="468b1bc3-8732-607c-0a14-7314aee07db8")
	/** General Expense = E */
	public static final String GeneralExpense = "E";
	@XendraRefItem(Name="General Receipts",
		Value="R",
		Description="",
		Identifier="4fbbf6b6-8af0-b3c1-dee3-4924716233bf")
	/** General Receipts = R */
	public static final String GeneralReceipts = "R";
	@XendraRefItem(Name="Difference",
		Value="D",
		Description="",
		Identifier="eb4d792a-4a4f-91f0-27f4-271b4658fa7a")
	/** Difference = D */
	public static final String Difference = "D";
	@XendraRefItem(Name="Bank Account Transfer",
		Value="T",
		Description="",
		Identifier="73f7d6c2-8c2b-c0e5-b6a6-cf892b62856e")
	/** Bank Account Transfer = T */
	public static final String BankAccountTransfer = "T";
	@XendraRefItem(Name="Bill of Exchange",
		Value="B",
		Description="",
		Identifier="38cd7dcf-c5f4-c5e1-b036-7490224f8eec")
	/** Bill of Exchange = B */
	public static final String BillOfExchange = "B";
	@XendraRef(Name="C_Cash Trx Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="c8687157-9eab-2d8f-c187-491e339f59bc")
	public static final String Identifier = "c8687157-9eab-2d8f-c187-491e339f59bc";

}
