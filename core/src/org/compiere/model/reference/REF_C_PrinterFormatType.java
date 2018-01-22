package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_PrinterFormatType implements Reference 
{
 	@XendraRefItem(Name="Invoice",
		Value="INV",
		Description="",
		Identifier="58ab75ad-98a3-4810-b24f-21432bf10a3f")
	/** Invoice = INV */
	public static final String Invoice = "INV";
	@XendraRefItem(Name="Credit Card List",
		Value="CCL",
		Description="",
		Identifier="059c62be-8ad8-4bdd-b247-c12e320efe9e")
	/** Credit Card List = CCL */
	public static final String CreditCardList = "CCL";
	@XendraRefItem(Name="Void / Canceled List",
		Value="LCL",
		Description="",
		Identifier="8ce99244-3dae-4ef9-a4bf-7e577f4f8d1d")
	/** Void / Canceled List = LCL */
	public static final String VoidCanceledList = "LCL";
	@XendraRefItem(Name="Collection ",
		Value="COL",
		Description="",
		Identifier="acf189c7-b207-4a17-ba5f-0ade6a79401b")
	/** Collection  = COL */
	public static final String Collection = "COL";
	@XendraRefItem(Name="Cash Count ",
		Value="CCF",
		Description="",
		Identifier="e6fedd9d-bc66-4177-bad1-b640e3f1b540")
	/** Cash Count  = CCF */
	public static final String CashCount = "CCF";
	@XendraRefItem(Name="Others",
		Value="OTH",
		Description="",
		Identifier="bf6e3ed1-f7dd-43ba-9558-f3de539d259a")
	/** Others = OTH */
	public static final String Others = "OTH";
	@XendraRefItem(Name="POS Credit Format",
		Value="PCF",
		Description="",
		Identifier="2e4187c6-c022-4ade-992e-3c01c681c7a9")
	/** POS Credit Format = PCF */
	public static final String POSCreditFormat = "PCF";
	@XendraRefItem(Name="InOut",
		Value="OUT",
		Description="",
		Identifier="fa270639-aef0-4d88-90e2-89e5a01d2f2f")
	/** InOut = OUT */
	public static final String InOut = "OUT";
	@XendraRef(Name="C_PrinterFormatType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2016-08-02 14:20:34.748",
		Extension="",
		Identifier="14324025-4700-4e81-9434-3ae76ce146e4")
	public static final String Identifier = "14324025-4700-4e81-9434-3ae76ce146e4";

}
