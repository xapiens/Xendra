package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_ReferenceValidationTypes implements Reference 
{
 	@XendraRefItem(Name="DataType",
		Value="D",
		Description="DataType",
		Identifier="1f955de6-ab4f-8095-e882-5f6078d3767d")
	/** DataType = D */
	public static final String DataType = "D";
	@XendraRefItem(Name="Table Validation",
		Value="T",
		Description="Table Validation",
		Identifier="24093c56-3f47-0977-afe1-2c5b98cd1484")
	/** Table Validation = T */
	public static final String TableValidation = "T";
	@XendraRefItem(Name="List Validation",
		Value="L",
		Description="List Validation",
		Identifier="3722d04f-afa8-3eb1-0fee-767291c15f4f")
	/** List Validation = L */
	public static final String ListValidation = "L";
	@XendraRef(Name="AD_Reference Validation Types",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Reference Validation Type list",
		Help="e.g. I - Independent ",
		VFormat="L",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="994e094c-1e92-8bac-18e9-6c49478f92c1")
	public static final String Identifier = "994e094c-1e92-8bac-18e9-6c49478f92c1";

}
