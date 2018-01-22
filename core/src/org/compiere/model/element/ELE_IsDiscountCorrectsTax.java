package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IsDiscountCorrectsTax 
{
 	@XendraElement(AD_Element_ID=1622,
		ColumnName="IsDiscountCorrectsTax",
		EntityType="D",
		Name="Correct tax for Discounts/Charges",
		PrintName="Correct tax for Discounts/Charges",
		Description="Correct the tax for payment discount and charges",
		Help="Payment discounts may require to correct the tax.  This primarily applicable in VAT systems.  If the original invoice had tax records, the payment discount, write-off, etc. is corrected by the tax. The calculation of the tax is prorated based on the invoice.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="7f09010f-92dd-44a5-542b-96925bed85c4",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "7f09010f-92dd-44a5-542b-96925bed85c4";

}
