package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_TaxSPPOType implements Reference 
{
 	@XendraRefItem(Name="Purchase Tax",
		Value="P",
		Description="",
		Identifier="9a3c9c24-aa89-2977-1651-dad663347275")
	/** Purchase Tax = P */
	public static final String PurchaseTax = "P";
	@XendraRefItem(Name="Both",
		Value="B",
		Description="",
		Identifier="2f85f388-d44c-5b06-e514-2f9abf93adee")
	/** Both = B */
	public static final String Both = "B";
	@XendraRefItem(Name="Sales Tax",
		Value="S",
		Description="",
		Identifier="a6a76f7f-aa87-c54c-5129-24ec7c92d6bf")
	/** Sales Tax = S */
	public static final String SalesTax = "S";
	@XendraRef(Name="C_Tax SPPOType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="4cb3fe77-cab1-eb20-7a95-e4bc1213d850")
	public static final String Identifier = "4cb3fe77-cab1-eb20-7a95-e4bc1213d850";

}
