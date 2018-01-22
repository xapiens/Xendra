package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_OrderFreightCostRule implements Reference 
{
 	@XendraRefItem(Name="Freight included",
		Value="I",
		Description="Freight cost included",
		Identifier="4001b719-e6e8-f5b7-8d19-93accbd79b48")
	/** Freight included = I */
	public static final String FreightIncluded = "I";
	@XendraRefItem(Name="Fix price",
		Value="F",
		Description="Fixed freight price",
		Identifier="09690c03-08e1-847a-ffea-f1457c75634b")
	/** Fix price = F */
	public static final String FixPrice = "F";
	@XendraRefItem(Name="Calculated",
		Value="C",
		Description="Calculated based on Product Freight Rule",
		Identifier="536648fa-8f09-1cf2-b7a5-1c48a24e1eb8")
	/** Calculated = C */
	public static final String Calculated = "C";
	@XendraRefItem(Name="Line",
		Value="L",
		Description="Entered at Line level",
		Identifier="c1432338-7995-86c9-a9bb-9d3fe932b1d8")
	/** Line = L */
	public static final String Line = "L";
	@XendraRef(Name="C_Order FreightCostRule",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Freight cost Rule list",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="991b4512-0e0d-3494-3835-cc8ecaf3ab12")
	public static final String Identifier = "991b4512-0e0d-3494-3835-cc8ecaf3ab12";

}
