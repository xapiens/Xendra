package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_ProjectInvoiceRule implements Reference 
{
 	@XendraRefItem(Name="None",
		Value="-",
		Description="",
		Identifier="41d68d4a-9af6-4a33-aab1-d07103398829")
	/** None = - */
	public static final String None = "-";
	@XendraRefItem(Name="Committed Amount",
		Value="C",
		Description="",
		Identifier="d7647c44-3359-e9ec-9ea2-cce5f2451e10")
	/** Committed Amount = C */
	public static final String CommittedAmount = "C";
	@XendraRefItem(Name="Time&Material max Comitted",
		Value="c",
		Description="",
		Identifier="b8c4b2bf-55bd-0653-e60e-0e95293d48e7")
	/** Time&Material max Comitted = c */
	public static final String TimeMaterialMaxComitted = "c";
	@XendraRefItem(Name="Time&Material",
		Value="T",
		Description="",
		Identifier="31e8b125-df06-fcf3-e8dc-f13fd293cce6")
	/** Time&Material = T */
	public static final String TimeMaterial = "T";
	@XendraRefItem(Name="Product  Quantity",
		Value="P",
		Description="",
		Identifier="5e65eb69-98bf-47e8-d731-d0f7d69e4f03")
	/** Product  Quantity = P */
	public static final String ProductQuantity = "P";
	@XendraRef(Name="C_Project InvoiceRule",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="d99f06b4-e2f5-c1c0-def9-657548c5f17d")
	public static final String Identifier = "d99f06b4-e2f5-c1c0-def9-657548c5f17d";

}
