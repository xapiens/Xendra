package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_EDITrxType implements Reference 
{
 	@XendraRefItem(Name="Inquiry",
		Value="I",
		Description="",
		Identifier="c774edd1-b9af-4935-9cb6-2072795152fb")
	/** Inquiry = I */
	public static final String Inquiry = "I";
	@XendraRefItem(Name="Purchase Order",
		Value="O",
		Description="",
		Identifier="815d4969-df88-4038-a6ef-d2a03616d89c")
	/** Purchase Order = O */
	public static final String PurchaseOrder = "O";
	@XendraRef(Name="M_EDI Trx Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:55:58.0",
		Extension="",
		Identifier="aa874fb2-4ea5-4397-98be-844319667774")
	public static final String Identifier = "aa874fb2-4ea5-4397-98be-844319667774";

}
