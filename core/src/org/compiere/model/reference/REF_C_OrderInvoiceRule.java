package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_OrderInvoiceRule implements Reference 
{
 	@XendraRefItem(Name="After Order delivered",
		Value="O",
		Description="Invoice for every order",
		Identifier="aa43c322-0ed2-255f-3b8d-27f4a6ab23ae")
	/** After Order delivered = O */
	public static final String AfterOrderDelivered = "O";
	@XendraRefItem(Name="Immediate",
		Value="I",
		Description="Immediate Invoice",
		Identifier="bad54265-e711-bd68-69c7-c6f90e1ae268")
	/** Immediate = I */
	public static final String Immediate = "I";
	@XendraRefItem(Name="After Delivery",
		Value="D",
		Description="Invoice per Delivery",
		Identifier="aa1a91b6-b485-2c97-5a67-cafa0f82a31e")
	/** After Delivery = D */
	public static final String AfterDelivery = "D";
	@XendraRefItem(Name="Customer Schedule after Delivery",
		Value="S",
		Description="Invoice per Customer Invoice Schedule",
		Identifier="5bc749bf-7a84-cbb7-c152-22e7d4553769")
	/** Customer Schedule after Delivery = S */
	public static final String CustomerScheduleAfterDelivery = "S";
	@XendraRef(Name="C_Order InvoiceRule",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Invoicing Rules list",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="48d8ab23-89bf-db6f-7a12-1c4d2aa5604f")
	public static final String Identifier = "48d8ab23-89bf-db6f-7a12-1c4d2aa5604f";

}
