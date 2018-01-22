package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_Std_MinAmt 
{
 	@XendraElement(AD_Element_ID=1232,
		ColumnName="Std_MinAmt",
		EntityType="D",
		Name="Standard price min Margin",
		PrintName="Standard price min Margin",
		Description="Minimum margin allowed for a product",
		Help="The Standard Price Min Margin indicates the minimum margin for a product.  The margin is calculated by subtracting the original Standard price from the newly calculated price.  If this field contains 0.00 then it is ignored.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="ff4107d4-0b57-bc74-02e0-5c54ff164df4",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "ff4107d4-0b57-bc74-02e0-5c54ff164df4";

}
