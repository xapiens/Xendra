package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_Limit_MinAmt 
{
 	@XendraElement(AD_Element_ID=1218,
		ColumnName="Limit_MinAmt",
		EntityType="D",
		Name="Limit price min Margin",
		PrintName="Limit price min Margin",
		Description="Minimum difference to original limit price: ignored if zero",
		Help="Indicates the minimum margin for a product.  The margin is calculated by subtracting the original limit price from the newly calculated price.  If this field contains 0.00 then it is ignored.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="bf439f6f-af65-a0d4-ec7f-87f119af37bb",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "bf439f6f-af65-a0d4-ec7f-87f119af37bb";

}
