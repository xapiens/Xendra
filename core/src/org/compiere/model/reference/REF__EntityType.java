package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF__EntityType implements Reference 
{
 	@XendraRefItem(Name="Adempiere",
		Value="C",
		Description="Adempiere Application (synchronized)",
		Identifier="a6db794e-e030-4185-af89-07801fa4256b")
	/** Adempiere = C */
	public static final String Adempiere = "C";
	@XendraRefItem(Name="User maintained",
		Value="U",
		Description="User maintained Entity (not synchronized)",
		Identifier="b899c196-c08a-4865-b448-9a9e7d2c5414")
	/** User maintained = U */
	public static final String UserMaintained = "U";
	@XendraRefItem(Name="Applications",
		Value="A",
		Description="Other Applications (not synchronized)",
		Identifier="417a2c32-c083-4520-9abf-1f3f1abfb0fb")
	/** Applications = A */
	public static final String Applications = "A";
	@XendraRefItem(Name="Dictionary",
		Value="D",
		Description="Application Dictionary (synchronized)",
		Identifier="5b4cbcce-b634-4546-a7f2-6aa3f3e77b9c")
	/** Dictionary = D */
	public static final String Dictionary = "D";
	@XendraRefItem(Name="Customization",
		Value="CUST",
		Description="Distributed Extensions should have 4 characters",
		Identifier="fffe5702-cde7-49cf-860a-79e45a5ed7ca")
	/** Customization = CUST */
	public static final String Customization = "CUST";
	@XendraRef(Name="_Entity Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Entity Type (Dictionary, ..)",
		Help="",
		VFormat="AAAA",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:55:58.0",
		Extension="",
		Identifier="062685e1-a065-43b9-8061-ee81a9ac4275")
	public static final String Identifier = "062685e1-a065-43b9-8061-ee81a9ac4275";

}
