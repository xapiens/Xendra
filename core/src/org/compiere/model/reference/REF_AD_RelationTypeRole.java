package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_RelationTypeRole implements Reference 
{
 	@XendraRefItem(Name="Invoice",
		Value="Invoice",
		Description="",
		Identifier="bdd503b9-525a-2488-c718-5094ef6e66cc")
	/** Invoice = Invoice */
	public static final String Invoice = "Invoice";
	@XendraRefItem(Name="Order",
		Value="Order",
		Description="",
		Identifier="5ab2b591-2740-3a89-511c-8053e33dc474")
	/** Order = Order */
	public static final String Order = "Order";
	@XendraRef(Name="AD_RelationType Role",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Defines the possible 'roles' a the records of a relation can have",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="9be2af4f-0f91-a3dd-c472-4f14d05e5d5b")
	public static final String Identifier = "9be2af4f-0f91-a3dd-c472-4f14d05e5d5b";

}
