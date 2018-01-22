package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_AcctSchemaTaxCorrectionType implements Reference 
{
 	@XendraRefItem(Name="None",
		Value="N",
		Description="",
		Identifier="12353182-69a9-d5b6-0c3a-b2ae8d050e06")
	/** None = N */
	public static final String None = "N";
	@XendraRefItem(Name="Write-off only",
		Value="W",
		Description="",
		Identifier="98a718b2-f741-ab3d-e110-6f573ccf287c")
	/** Write-off only = W */
	public static final String Write_OffOnly = "W";
	@XendraRefItem(Name="Discount only",
		Value="D",
		Description="",
		Identifier="796cb86a-1f95-c3c0-c018-841ad59924ca")
	/** Discount only = D */
	public static final String DiscountOnly = "D";
	@XendraRefItem(Name="Write-off and Discount",
		Value="B",
		Description="",
		Identifier="280e547e-5040-5f6c-90c1-8b9cd369362c")
	/** Write-off and Discount = B */
	public static final String Write_OffAndDiscount = "B";
	@XendraRef(Name="C_AcctSchema TaxCorrectionType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="12590ff2-3d61-d0fd-e90c-1bda6aa57d6f")
	public static final String Identifier = "12590ff2-3d61-d0fd-e90c-1bda6aa57d6f";

}
