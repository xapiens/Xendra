package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_RelatedProductType implements Reference 
{
 	@XendraRefItem(Name="Web Promotion",
		Value="P",
		Description="",
		Identifier="8830a159-4d6a-06cf-983e-e6e3368098f4")
	/** Web Promotion = P */
	public static final String WebPromotion = "P";
	@XendraRefItem(Name="Alternative",
		Value="A",
		Description="",
		Identifier="f4f64c0a-d902-3480-305c-8e95cddfe905")
	/** Alternative = A */
	public static final String Alternative = "A";
	@XendraRefItem(Name="Supplemental",
		Value="S",
		Description="",
		Identifier="383a7073-80fd-adaa-8a4b-232f7bfc1664")
	/** Supplemental = S */
	public static final String Supplemental = "S";
	@XendraRef(Name="M_RelatedProduct Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="06e7e690-1ef7-8489-f212-f01f4b924850")
	public static final String Identifier = "06e7e690-1ef7-8489-f212-f01f4b924850";

}
