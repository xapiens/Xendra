package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IsPrepayment 
{
 	@XendraElement(AD_Element_ID=2663,
		ColumnName="IsPrepayment",
		EntityType="D",
		Name="Prepayment",
		PrintName="Prepayment",
		Description="The Payment/Receipt is a Prepayment",
		Help="Payments not allocated to an invoice with a charge are posted to Unallocated Payments. When setting this flag, the payment is posted to the Customer or Vendor Prepayment account.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="e1a3173b-edea-2b50-947e-f2116229e34b",
		Synchronized="2012-07-11 00:00:00.0")
	public static final String Identifier = "e1a3173b-edea-2b50-947e-f2116229e34b";

}
