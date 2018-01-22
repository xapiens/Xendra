package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_GoodForDays 
{
 	@XendraElement(AD_Element_ID=2237,
		ColumnName="GoodForDays",
		EntityType="D",
		Name="Good for Days",
		PrintName="Good Days",
		Description="Shelf Life Days remaning to Guarantee Date (minus minimum guarantee days)",
		Help="Shelf Life of products with Guarantee Date instance compared to today minus the minimum guaranteed days. (Guarantee Date-Today) ¿ Min Guarantee Days",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="3e8c6c83-20ed-9cf7-1071-e355c0bbc91f",
		Synchronized="2012-07-11 00:00:00.0")
	public static final String Identifier = "3e8c6c83-20ed-9cf7-1071-e355c0bbc91f";

}
