package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_ReplenishType 
{
 	@XendraElement(AD_Element_ID=545,
		ColumnName="ReplenishType",
		EntityType="D",
		Name="Replenish Type",
		PrintName="Replenish Type",
		Description="Method for re-ordering a product",
		Help="The Replenish Type indicates if this product will be manually re-ordered, ordered when the quantity is below the minimum quantity or ordered when it is below the maximum quantity. If you select a custom replenishment type, you need to create a class implementing org.compiere.util.ReplenishInterface and set that on warehouse level.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="b40e880b-813a-5bc0-caa7-dd8ed9e21f1d",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "b40e880b-813a-5bc0-caa7-dd8ed9e21f1d";

}
