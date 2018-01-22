package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IsDiscountLineAmt 
{
 	@XendraElement(AD_Element_ID=1743,
		ColumnName="IsDiscountLineAmt",
		EntityType="D",
		Name="Discount calculated from Line Amounts",
		PrintName="Discount calculated from Line Amounts",
		Description="Payment Discount calculation does not include Taxes and Charges",
		Help="If the payment discount is calculated from line amounts only, the tax and charge amounts are not included. This is e.g. business practice in the US.  If not selected the total invoice amount is used to calculate the payment discount.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="d046dbce-32d4-20eb-639a-0f51e1e6698d",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "d046dbce-32d4-20eb-639a-0f51e1e6698d";

}
