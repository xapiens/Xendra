package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_PaymentTrxType implements Reference 
{
 	@XendraRefItem(Name="Sales",
		Value="S",
		Description="",
		Identifier="54243382-f8f9-5dcb-d705-fb8c8816b330")
	/** Sales = S */
	public static final String Sales = "S";
	@XendraRefItem(Name="Delayed Capture",
		Value="D",
		Description="",
		Identifier="4cf0f0ee-f713-8ec0-85db-a4729424c8d4")
	/** Delayed Capture = D */
	public static final String DelayedCapture = "D";
	@XendraRefItem(Name="Credit (Payment)",
		Value="C",
		Description="",
		Identifier="b2681fe8-570b-5f37-71cd-c7db1803246c")
	/** Credit (Payment) = C */
	public static final String CreditPayment = "C";
	@XendraRefItem(Name="Voice Authorization",
		Value="F",
		Description="",
		Identifier="2b9f2ba0-3322-2384-0854-04e8b82f1fd3")
	/** Voice Authorization = F */
	public static final String VoiceAuthorization = "F";
	@XendraRefItem(Name="Authorization",
		Value="A",
		Description="",
		Identifier="17378327-4cfd-09df-57fe-4ae7acbdbb07")
	/** Authorization = A */
	public static final String Authorization = "A";
	@XendraRefItem(Name="Void",
		Value="V",
		Description="",
		Identifier="d9f3ddec-9bb9-6b52-3839-1e637844e6d8")
	/** Void = V */
	public static final String Void = "V";
	@XendraRef(Name="C_Payment Trx Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="CC Trx Type",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="a083d7a1-2e00-66db-651c-da45d285eb24")
	public static final String Identifier = "a083d7a1-2e00-66db-651c-da45d285eb24";

}
