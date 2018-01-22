package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IsOverUnderPayment 
{
 	@XendraElement(AD_Element_ID=1818,
		ColumnName="IsOverUnderPayment",
		EntityType="D",
		Name="Over/Under Payment",
		PrintName="Over/Under Payment",
		Description="Over-Payment (unallocated) or Under-Payment (partial payment)",
		Help="Overpayments (negative) are unallocated amounts and allow you to receive money for more than the particular invoice.  Underpayments (positive) is a partial payment for the invoice. You do not write off the unpaid amount.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="2c24379d-5a56-e5ee-c09f-632905d4e52f",
		Synchronized="2012-07-11 00:00:00.0")
	public static final String Identifier = "2c24379d-5a56-e5ee-c09f-632905d4e52f";

}
