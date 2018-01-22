package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_InOutConfirmType implements Reference 
{
 	@XendraRefItem(Name="Vendor Confirmation",
		Value="XV",
		Description="",
		Identifier="88d3b07f-38be-63a2-c830-b9103dce9525")
	/** Vendor Confirmation = XV */
	public static final String VendorConfirmation = "XV";
	@XendraRefItem(Name="Customer Confirmation",
		Value="XC",
		Description="",
		Identifier="7f24203e-6e4d-6627-32b5-96d08170ff0e")
	/** Customer Confirmation = XC */
	public static final String CustomerConfirmation = "XC";
	@XendraRefItem(Name="Drop Ship Confirm",
		Value="DS",
		Description="",
		Identifier="e2ca6104-eed7-2707-aca3-bc80ee9717b9")
	/** Drop Ship Confirm = DS */
	public static final String DropShipConfirm = "DS";
	@XendraRefItem(Name="Ship/Receipt Confirm",
		Value="SC",
		Description="",
		Identifier="436a0f5a-8e91-69de-5bfc-202e486bfbdc")
	/** Ship/Receipt Confirm = SC */
	public static final String ShipReceiptConfirm = "SC";
	@XendraRefItem(Name="Pick/QA Confirm",
		Value="PC",
		Description="",
		Identifier="e5d07db8-e880-3237-c8b7-912d74a1258a")
	/** Pick/QA Confirm = PC */
	public static final String PickQAConfirm = "PC";
	@XendraRef(Name="M_InOutConfirm Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="0239f238-ee4d-c963-02f8-4aa1460f1694")
	public static final String Identifier = "0239f238-ee4d-c963-02f8-4aa1460f1694";

}
