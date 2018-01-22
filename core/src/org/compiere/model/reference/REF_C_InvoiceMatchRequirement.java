package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_InvoiceMatchRequirement implements Reference 
{
 	@XendraRefItem(Name="None",
		Value="N",
		Description="",
		Identifier="03388c0b-7f9c-47db-a4cf-3e3272d5b19f")
	/** None = N */
	public static final String None = "N";
	@XendraRefItem(Name="Receipt",
		Value="R",
		Description="",
		Identifier="95cb71ac-2cf5-1149-6966-2213a0d3c0a6")
	/** Receipt = R */
	public static final String Receipt = "R";
	@XendraRefItem(Name="Purchase Order and Receipt",
		Value="B",
		Description="",
		Identifier="b7a10797-f8d1-d96a-bbe1-6c6b5c14d299")
	/** Purchase Order and Receipt = B */
	public static final String PurchaseOrderAndReceipt = "B";
	@XendraRefItem(Name="Purchase Order",
		Value="P",
		Description="",
		Identifier="494fd07d-1ed3-4404-f29c-f4c29aa88199")
	/** Purchase Order = P */
	public static final String PurchaseOrder = "P";
	@XendraRef(Name="C_Invoice MatchRequirement",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-09-19 17:23:37.0",
		Extension="",
		Identifier="4aa120cd-ca1a-cb00-e15e-312b5a9c25a2")
	public static final String Identifier = "4aa120cd-ca1a-cb00-e15e-312b5a9c25a2";

}
