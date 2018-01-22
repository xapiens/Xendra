package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_TotalOpenBalance 
{
 	@XendraElement(AD_Element_ID=2562,
		ColumnName="TotalOpenBalance",
		EntityType="D",
		Name="Open Balance",
		PrintName="Open Balance",
		Description="Total Open Balance Amount in primary Accounting Currency",
		Help="The Total Open Balance Amount is the calculated open item amount for Customer and Vendor activity.  If the Balance is below zero, we owe the Business Partner.  The amout is used for Credit Management. Invoices and Payment Allocations determine the Open Balance (i.e. not Orders or Payments).",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="f41fb79e-da73-0c40-72e6-dd6ef794f2ae",
		Synchronized="2012-07-11 00:00:00.0")
	public static final String Identifier = "f41fb79e-da73-0c40-72e6-dd6ef794f2ae";

}
