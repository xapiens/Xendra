package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_PriceInvoiced 
{
 	@XendraElement(AD_Element_ID=2539,
		ColumnName="PriceInvoiced",
		EntityType="D",
		Name="Price Invoiced",
		PrintName="Price Invoiced",
		Description="The priced invoiced to the customer (in the currency of the customer's AR price list) - 0 for default price",
		Help="The invoiced price is derived from the Invoice Price entered and can be overwritten.  If the price is 0, the default price on the customer's invoice is used.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="55ed1c0b-31b2-288d-230e-28954d39c99f",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "55ed1c0b-31b2-288d-230e-28954d39c99f";

}
