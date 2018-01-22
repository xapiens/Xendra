package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_PriceMatchTolerance 
{
 	@XendraElement(AD_Element_ID=2884,
		ColumnName="PriceMatchTolerance",
		EntityType="D",
		Name="Price Match Tolerance",
		PrintName="Price Match Tolerance",
		Description="PO-Invoice Match Price Tolerance in percent of the purchase price",
		Help="Tolerance in Percent of matching the purchase order price to the invoice price.  The difference is posted as Invoice Price Tolerance for Standard Costing.  If defined, the PO-Invoice match must be explicitly approved, if the matching difference is greater then the tolerance.<br> Example: if the purchase price is $100 and the tolerance is 1 (percent), the invoice price must be between $99 and 101 to be automatically approved.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="838e037e-5234-6315-b544-af89507bf24c",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "838e037e-5234-6315-b544-af89507bf24c";

}
