package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IsTradeDiscountPosted 
{
 	@XendraElement(AD_Element_ID=1623,
		ColumnName="IsTradeDiscountPosted",
		EntityType="D",
		Name="Post Trade Discount",
		PrintName="Trade Discount",
		Description="Generate postings for trade discounts",
		Help="If the invoice is based on an item with a list price, the amount based on the list price and the discount is posted instead of the net amount. Example: Quantity 10 - List Price: 20 - Actual Price: 17 If selected for a sales invoice 200 is posted to Product Revenue and 30 to Discount Granted - rather than 170 to Product Revenue. The same applies to vendor invoices.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="9c4a6984-a1c2-bdab-a7a8-1ca8507b6c89",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "9c4a6984-a1c2-bdab-a7a8-1ca8507b6c89";

}
