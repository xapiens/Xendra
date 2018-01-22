package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_POSLogPaymentType implements Reference 
{
 	@XendraRefItem(Name="Cash",
		Value="C",
		Description="",
		Identifier="ae4f6d4f-0829-37e0-940c-029b24b1bace")
	/** Cash = C */
	public static final String Cash = "C";
	@XendraRefItem(Name="Credit Card",
		Value="K",
		Description="",
		Identifier="d974beb6-730b-5e90-e950-2e38dc4ea866")
	/** Credit Card = K */
	public static final String CreditCard = "K";
	@XendraRefItem(Name="Credit",
		Value="D",
		Description="",
		Identifier="365c19cc-55cc-c764-8da0-74a5f4bffee5")
	/** Credit = D */
	public static final String Credit = "D";
	@XendraRef(Name="C_POSLog PaymentType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="L",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="b654c04e-2d1c-31b3-ba39-7b474a395f0b")
	public static final String Identifier = "b654c04e-2d1c-31b3-ba39-7b474a395f0b";

}
