package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_TypeGroupingClose implements Reference 
{
 	@XendraRefItem(Name="None",
		Value="N",
		Description="",
		Identifier="93d5c115-bf1a-eba4-ef60-9aa097dfcc7a")
	/** None = N */
	public static final String None = "N";
	@XendraRefItem(Name="by Document",
		Value="D",
		Description="",
		Identifier="e5cc214f-7f26-7303-25d3-c515ea9a1c78")
	/** by Document = D */
	public static final String ByDocument = "D";
	@XendraRefItem(Name="by Business Partner",
		Value="B",
		Description="",
		Identifier="e80f72f7-502f-e125-7f1e-c3c249e92181")
	/** by Business Partner = B */
	public static final String ByBusinessPartner = "B";
	@XendraRefItem(Name="by Product",
		Value="P",
		Description="",
		Identifier="6dd126b2-45b0-4353-8f4d-b1aebc0f17b4")
	/** by Product = P */
	public static final String ByProduct = "P";
	@XendraRef(Name="TypeGroupingClose",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-11-05 22:47:02.0",
		Extension="",
		Identifier="6d8e78d8-245d-5cd6-3082-2b2ad6173949")
	public static final String Identifier = "6d8e78d8-245d-5cd6-3082-2b2ad6173949";

}
