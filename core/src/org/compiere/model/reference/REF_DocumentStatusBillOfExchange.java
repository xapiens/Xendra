package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_DocumentStatusBillOfExchange implements Reference 
{
 	@XendraRefItem(Name="In Cobranza",
		Value="CB",
		Description="",
		Identifier="564f7a52-f977-4f6e-b1f2-3687a2542606")
	/** In Cobranza = CB */
	public static final String InCobranza = "CB";
	@XendraRefItem(Name="In Discount",
		Value="DS",
		Description="",
		Identifier="e707713d-e82b-4b8a-81b2-356c82180dfd")
	/** In Discount = DS */
	public static final String InDiscount = "DS";
	@XendraRefItem(Name="Canceled",
		Value="CN",
		Description="",
		Identifier="13035449-dd02-47d8-925d-6751220b5b6f")
	/** Canceled = CN */
	public static final String Canceled = "CN";
	@XendraRefItem(Name="Protested",
		Value="PT",
		Description="",
		Identifier="85d1c650-3152-47c4-a883-4f36d9a36969")
	/** Protested = PT */
	public static final String Protested = "PT";
	@XendraRefItem(Name="Refinanced",
		Value="RF",
		Description="",
		Identifier="1f184b69-5ffb-48d0-bc72-1106e7c3c27d")
	/** Refinanced = RF */
	public static final String Refinanced = "RF";
	@XendraRefItem(Name="In Portfolio",
		Value="PR",
		Description="",
		Identifier="bccbbed7-8687-409d-b54e-b476a9701b19")
	/** In Portfolio = PR */
	public static final String InPortfolio = "PR";
	@XendraRefItem(Name="In Warranty",
		Value="WR",
		Description="",
		Identifier="cf968237-d757-4490-ac9b-7899c0d3a81b")
	/** In Warranty = WR */
	public static final String InWarranty = "WR";
	@XendraRef(Name="Document Status Bill Of Exchange",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Document Status list",
		Help="",
		VFormat="LL",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:55:58.0",
		Extension="",
		Identifier="701f5c80-724a-4d70-aa8e-1c03377c4fdf")
	public static final String Identifier = "701f5c80-724a-4d70-aa8e-1c03377c4fdf";

}
