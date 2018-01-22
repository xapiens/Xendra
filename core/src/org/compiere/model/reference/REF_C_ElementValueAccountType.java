package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_ElementValueAccountType implements Reference 
{
 	@XendraRefItem(Name="Owner's Equity",
		Value="O",
		Description="Owner's Equity (Balance Sheet) Account",
		Identifier="218ea568-1c36-374c-effa-040d1e3b1187")
	/** Owner's Equity = O */
	public static final String OwnerSEquity = "O";
	@XendraRefItem(Name="Memo",
		Value="M",
		Description="Memo (Non Balance Sheet nor P&L) Account",
		Identifier="d0d931ec-ea00-41cb-3664-690a92fcbb87")
	/** Memo = M */
	public static final String Memo = "M";
	@XendraRefItem(Name="Asset",
		Value="A",
		Description="Asset (Balance Sheet) Account",
		Identifier="9b364c24-97c1-afae-ba5c-a84852b35d3d")
	/** Asset = A */
	public static final String Asset = "A";
	@XendraRefItem(Name="Liability",
		Value="L",
		Description="Liability (Balance Sheet) Account",
		Identifier="b14bbaae-a9f6-b499-a5b3-e7b8ecb684f2")
	/** Liability = L */
	public static final String Liability = "L";
	@XendraRefItem(Name="Expense",
		Value="E",
		Description="Expense (P&L) Account",
		Identifier="e6ebf8da-07bf-24e8-4f07-6013fd1189ee")
	/** Expense = E */
	public static final String Expense = "E";
	@XendraRefItem(Name="Revenue",
		Value="R",
		Description="Revenue (P&L) Account",
		Identifier="f74d4fc4-ce9d-76cd-5f3c-9982abf103ce")
	/** Revenue = R */
	public static final String Revenue = "R";
	@XendraRef(Name="C_ElementValue AccountType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Account Type list",
		Help="",
		VFormat="L",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="c9364c64-6481-06c6-6a91-931ae4cfdb71")
	public static final String Identifier = "c9364c64-6481-06c6-6a91-931ae4cfdb71";

}
