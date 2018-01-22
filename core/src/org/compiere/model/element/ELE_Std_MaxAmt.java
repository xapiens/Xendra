package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_Std_MaxAmt 
{
 	@XendraElement(AD_Element_ID=1231,
		ColumnName="Std_MaxAmt",
		EntityType="D",
		Name="Standard max Margin",
		PrintName="Standard max Margin",
		Description="Maximum margin allowed for a product",
		Help="The Standard Price Max Margin indicates the maximum margin for a product.  The margin is calculated by subtracting the original Standard price from the newly calculated price.  If this field contains 0.00 then it is ignored.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="902328c9-09a4-1f55-533f-0e26b46d497b",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "902328c9-09a4-1f55-533f-0e26b46d497b";

}
