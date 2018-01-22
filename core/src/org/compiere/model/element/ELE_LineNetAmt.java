package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_LineNetAmt 
{
 	@XendraElement(AD_Element_ID=441,
		ColumnName="LineNetAmt",
		EntityType="D",
		Name="Line Amount",
		PrintName="Line Amt",
		Description="Line Extended Amount (Quantity * Actual Price) without Freight and Charges",
		Help="Indicates the extended line amount based on the quantity and the actual price.  Any additional charges or freight are not included.  The Amount may or may not include tax.  If the price list is inclusive tax, the line amount is the same as the line total.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="ba57a535-4ae3-c6eb-74ec-3dcb0973d6f6",
		Synchronized="2012-07-11 00:00:00.0")
	public static final String Identifier = "ba57a535-4ae3-c6eb-74ec-3dcb0973d6f6";

}
