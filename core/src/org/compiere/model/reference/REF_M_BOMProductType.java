package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_BOMProductType implements Reference 
{
 	@XendraRefItem(Name="Standard Product",
		Value="S",
		Description="",
		Identifier="0141957f-7c00-53c7-65b7-d5aecbd85b96")
	/** Standard Product = S */
	public static final String StandardProduct = "S";
	@XendraRefItem(Name="Optional Product",
		Value="O",
		Description="",
		Identifier="c3f79576-a2c2-9cef-8b11-2ca3eb9f6c23")
	/** Optional Product = O */
	public static final String OptionalProduct = "O";
	@XendraRefItem(Name="Alternative",
		Value="A",
		Description="",
		Identifier="227eb2b4-c61b-8887-4ac5-2c8ef34ac7f4")
	/** Alternative = A */
	public static final String Alternative = "A";
	@XendraRefItem(Name="Alternative (Default)",
		Value="D",
		Description="",
		Identifier="cc772530-8d56-7898-6ff5-7e6121cd6eee")
	/** Alternative (Default) = D */
	public static final String AlternativeDefault = "D";
	@XendraRefItem(Name="Outside Processing",
		Value="X",
		Description="",
		Identifier="6bf73a23-5ff2-96ad-3960-6637feb488a7")
	/** Outside Processing = X */
	public static final String OutsideProcessing = "X";
	@XendraRef(Name="M_BOMProduct Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="22ec8bbd-82a1-ad86-8c53-6cc116ff542d")
	public static final String Identifier = "22ec8bbd-82a1-ad86-8c53-6cc116ff542d";

}
