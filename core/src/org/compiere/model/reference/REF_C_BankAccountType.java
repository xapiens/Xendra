package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_BankAccountType implements Reference 
{
 	@XendraRefItem(Name="Checking",
		Value="C",
		Description="",
		Identifier="f93139b1-013b-ee1f-14a2-83bed362f495")
	/** Checking = C */
	public static final String Checking = "C";
	@XendraRefItem(Name="Savings",
		Value="S",
		Description="",
		Identifier="43bdb24f-657f-a698-854c-a87fde5b3399")
	/** Savings = S */
	public static final String Savings = "S";
	@XendraRefItem(Name="Detraccion",
		Value="D",
		Description="",
		Identifier="28d5f066-637b-aa03-ff6d-58124ced7e20")
	/** Detraccion = D */
	public static final String Detraccion = "D";
	@XendraRefItem(Name="Card",
		Value="K",
		Description="",
		Identifier="2613feca-efe4-0762-0d13-568d7f04638a")
	/** Card = K */
	public static final String Card = "K";
	@XendraRef(Name="C_Bank Account Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="acb85a97-8387-31f1-319a-5aec11c0aca3")
	public static final String Identifier = "acb85a97-8387-31f1-319a-5aec11c0aca3";

}
