package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_InviceInvoiceCollectionType implements Reference 
{
 	@XendraRefItem(Name="Collection Agency",
		Value="C",
		Description="",
		Identifier="a044a26a-3156-cfc5-bdc2-756cc7dabfdd")
	/** Collection Agency = C */
	public static final String CollectionAgency = "C";
	@XendraRefItem(Name="Dunning",
		Value="D",
		Description="",
		Identifier="e82a93f7-0539-97d5-32ab-50dea718e474")
	/** Dunning = D */
	public static final String Dunning = "D";
	@XendraRefItem(Name="Legal Procedure",
		Value="L",
		Description="",
		Identifier="e87697d9-dc47-86c7-247b-8b8135bc50eb")
	/** Legal Procedure = L */
	public static final String LegalProcedure = "L";
	@XendraRefItem(Name="Uncollectable",
		Value="U",
		Description="",
		Identifier="c83587e6-4aee-297a-980f-35835e2d7af4")
	/** Uncollectable = U */
	public static final String Uncollectable = "U";
	@XendraRef(Name="C_Invice InvoiceCollectionType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="8fe5b0dc-98b8-a097-8d98-f132c5681115")
	public static final String Identifier = "8fe5b0dc-98b8-a097-8d98-f132c5681115";

}
