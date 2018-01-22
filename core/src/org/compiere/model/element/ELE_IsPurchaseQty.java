package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IsPurchaseQty 
{
 	@XendraElement(AD_Element_ID=2401,
		ColumnName="IsPurchaseQty",
		EntityType="D",
		Name="Purchase Quantity",
		PrintName="Purchase Qty",
		Description="This quantity is used in the Purchase Order to the Supplier",
		Help="When multiple quantities are used in an Request for Quotation, the selected Quantity is used for generating the purchase order.  If none selected the lowest number is used.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="20dfb065-bec2-6582-779e-a1e8b72d25fa",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "20dfb065-bec2-6582-779e-a1e8b72d25fa";

}
