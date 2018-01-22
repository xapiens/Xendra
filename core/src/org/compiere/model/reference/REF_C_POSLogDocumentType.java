package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_POSLogDocumentType implements Reference 
{
 	@XendraRefItem(Name="Cash Boleta",
		Value="BM",
		Description="",
		Identifier="4b228adc-8452-147e-4093-c8c99be69838")
	/** Cash Boleta = BM */
	public static final String CashBoleta = "BM";
	@XendraRefItem(Name="Boleta Credit",
		Value="BC",
		Description="",
		Identifier="bb9e229a-53aa-7b4c-beb4-4fce10a35555")
	/** Boleta Credit = BC */
	public static final String BoletaCredit = "BC";
	@XendraRefItem(Name="Invoice Credit",
		Value="IC",
		Description="",
		Identifier="b350f2fa-9b65-2ec0-079c-ad1b1bbeb2d8")
	/** Invoice Credit = IC */
	public static final String InvoiceCredit = "IC";
	@XendraRefItem(Name="Credit Guide",
		Value="CG",
		Description="",
		Identifier="1338200b-dd05-8ad6-b6f8-e36af1822915")
	/** Credit Guide = CG */
	public static final String CreditGuide = "CG";
	@XendraRefItem(Name="Invoice Cash",
		Value="IM",
		Description="",
		Identifier="64c7d3b9-48d9-d30d-9099-a87e692ddf1d")
	/** Invoice Cash = IM */
	public static final String InvoiceCash = "IM";
	@XendraRef(Name="C_POSLog DocumentType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="LL",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="e8ea1223-028c-8d66-c1dd-6add02d66e6d")
	public static final String Identifier = "e8ea1223-028c-8d66-c1dd-6add02d66e6d";

}
