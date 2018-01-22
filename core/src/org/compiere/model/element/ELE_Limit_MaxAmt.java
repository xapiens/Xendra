package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_Limit_MaxAmt 
{
 	@XendraElement(AD_Element_ID=1217,
		ColumnName="Limit_MaxAmt",
		EntityType="D",
		Name="Limit price max Margin",
		PrintName="Limit price max Margin",
		Description="Maximum difference to original limit price: ignored if zero",
		Help="Indicates the maximum margin for a product.  The margin is calculated by subtracting the original limit price from the newly calculated price.  If this field contains 0.00 then it is ignored.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="f3334c83-1b03-a761-7734-62f641f7254b",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "f3334c83-1b03-a761-7734-62f641f7254b";

}
