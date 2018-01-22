package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_EnforcePriceLimit 
{
 	@XendraElement(AD_Element_ID=882,
		ColumnName="EnforcePriceLimit",
		EntityType="D",
		Name="Enforce price limit",
		PrintName="Enforce Price Limit",
		Description="Do not allow prices below the limit price",
		Help="The Enforce Price Limit check box indicates that prices cannot be below the limit price in Orders and Invoices.  Ths can be overwritten, if the role allows this.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="70b45046-c441-b7c6-4782-fddda3b8fae8",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "70b45046-c441-b7c6-4782-fddda3b8fae8";

}
