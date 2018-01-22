package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_PricePrecision 
{
 	@XendraElement(AD_Element_ID=2665,
		ColumnName="PricePrecision",
		EntityType="D",
		Name="Price Precision",
		PrintName="Price Precision",
		Description="Precision (number of decimals) for the Price",
		Help="The prices of the price list are rounded to the precision entered.  This allows to have prices with below currency precision, e.g. $0.005. Enter the number of decimals or -1 for no rounding.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="6d85e007-1f35-43fa-d5d7-93f7a1314aa6",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "6d85e007-1f35-43fa-d5d7-93f7a1314aa6";

}
