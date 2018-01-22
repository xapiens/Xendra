package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_Product_ProductType_Tax implements Reference 
{
 	@XendraRefItem(Name="Commodity",
		Value="MC",
		Description="",
		Identifier="39f84f1c-3f02-04d6-431b-60b3418312c0")
	/** Commodity = MC */
	public static final String Commodity = "MC";
	@XendraRefItem(Name="Materials",
		Value="MT",
		Description="",
		Identifier="70884514-7811-8991-0649-081dddcba305")
	/** Materials = MT */
	public static final String Materials = "MT";
	@XendraRefItem(Name="Fineshed Product",
		Value="PT",
		Description="",
		Identifier="be7d7f88-7f0c-40b9-253e-65065b76f0bf")
	/** Fineshed Product = PT */
	public static final String FineshedProduct = "PT";
	@XendraRefItem(Name="Various Supplies",
		Value="SD",
		Description="",
		Identifier="1bb4ce23-82ae-15f5-35c5-28fe5d2085f6")
	/** Various Supplies = SD */
	public static final String VariousSupplies = "SD";
	@XendraRefItem(Name="Packaging",
		Value="EE",
		Description="",
		Identifier="b6688846-3c02-a077-37fe-aa3bb0440e00")
	/** Packaging = EE */
	public static final String Packaging = "EE";
	@XendraRefItem(Name="Others",
		Value="OT",
		Description="",
		Identifier="b335fe28-79ee-77cc-1c70-3eedd2d06029")
	/** Others = OT */
	public static final String Others = "OT";
	@XendraRef(Name="M_Product_ProductType_Tax",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="aa86fc62-6f03-d7f8-4cb3-2cdef5206e20")
	public static final String Identifier = "aa86fc62-6f03-d7f8-4cb3-2cdef5206e20";

}
