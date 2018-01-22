package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_BOMUse implements Reference 
{
 	@XendraRefItem(Name="Master",
		Value="A",
		Description="",
		Identifier="589da47a-007b-f289-df0e-936c9fd92ae8")
	/** Master = A */
	public static final String Master = "A";
	@XendraRefItem(Name="Engineering",
		Value="E",
		Description="",
		Identifier="36bd87ff-5439-8111-bfa8-0fc157db4ed0")
	/** Engineering = E */
	public static final String Engineering = "E";
	@XendraRefItem(Name="Manufacturing",
		Value="M",
		Description="",
		Identifier="6f2e26f6-c1c6-74bf-c33f-0e5e1d14d511")
	/** Manufacturing = M */
	public static final String Manufacturing = "M";
	@XendraRefItem(Name="Planning",
		Value="P",
		Description="",
		Identifier="950d1d78-46b9-ed91-ca0f-71d3bbf5bf16")
	/** Planning = P */
	public static final String Planning = "P";
	@XendraRef(Name="M_BOM Use",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="e25746ad-3956-e607-c12a-677f0da9f3bb")
	public static final String Identifier = "e25746ad-3956-e607-c12a-677f0da9f3bb";

}
