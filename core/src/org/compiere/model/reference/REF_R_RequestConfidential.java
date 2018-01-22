package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_R_RequestConfidential implements Reference 
{
 	@XendraRefItem(Name="Internal",
		Value="I",
		Description="",
		Identifier="f296cb88-96e8-0869-4d9f-ada47ed09706")
	/** Internal = I */
	public static final String Internal = "I";
	@XendraRefItem(Name="Public Information",
		Value="A",
		Description="",
		Identifier="b12137ba-bb58-65a0-aab9-c09a59e4456f")
	/** Public Information = A */
	public static final String PublicInformation = "A";
	@XendraRefItem(Name="Partner Confidential",
		Value="C",
		Description="",
		Identifier="9848be3a-ab49-a1d8-b409-871ba6acbb89")
	/** Partner Confidential = C */
	public static final String PartnerConfidential = "C";
	@XendraRefItem(Name="Private Information",
		Value="P",
		Description="",
		Identifier="7aec807e-6664-17d4-92ae-1bf628befd99")
	/** Private Information = P */
	public static final String PrivateInformation = "P";
	@XendraRef(Name="R_Request Confidential",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="af038e49-9eea-4e1c-da39-e6d987a12111")
	public static final String Identifier = "af038e49-9eea-4e1c-da39-e6d987a12111";

}
