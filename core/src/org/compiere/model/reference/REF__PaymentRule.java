package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF__PaymentRule implements Reference 
{
 	@XendraRefItem(Name="Cash",
		Value="B",
		Description="",
		Identifier="4098c270-41d5-6c32-3d99-46cd78c09a29")
	/** Cash = B */
	public static final String Cash = "B";
	@XendraRefItem(Name="Credit Card",
		Value="K",
		Description="",
		Identifier="b293fd29-e069-73de-8301-cf061c91586f")
	/** Credit Card = K */
	public static final String CreditCard = "K";
	@XendraRefItem(Name="Direct Deposit",
		Value="T",
		Description="",
		Identifier="4878b93d-7545-da20-0e91-f94b0a18678c")
	/** Direct Deposit = T */
	public static final String DirectDeposit = "T";
	@XendraRefItem(Name="Check",
		Value="S",
		Description="",
		Identifier="40a1f38d-a3e6-3c87-6e2c-1c1d16172983")
	/** Check = S */
	public static final String Check = "S";
	@XendraRefItem(Name="On Credit",
		Value="P",
		Description="",
		Identifier="0946bd6b-5378-635b-cb91-7b7a198c51c2")
	/** On Credit = P */
	public static final String OnCredit = "P";
	@XendraRefItem(Name="Direct Debit",
		Value="D",
		Description="",
		Identifier="f1db9297-597e-3ec7-306e-2ab122871b42")
	/** Direct Debit = D */
	public static final String DirectDebit = "D";
	@XendraRefItem(Name="Advance",
		Value="A",
		Description="",
		Identifier="")
	/** Advance = A */
	public static final String Advance = "A";
	@XendraRefItem(Name="Coupon",
		Value="C",
		Description="",
		Identifier="")
	/** Coupon = C */
	public static final String Coupon = "C";
	@XendraRef(Name="_Payment Rule",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="In & Out Payment Options",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="ac003b85-a929-cc48-3def-1a8f7b1adc7b")
	public static final String Identifier = "ac003b85-a929-cc48-3def-1a8f7b1adc7b";

}
