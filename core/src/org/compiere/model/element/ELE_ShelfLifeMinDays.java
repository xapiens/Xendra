package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_ShelfLifeMinDays 
{
 	@XendraElement(AD_Element_ID=2264,
		ColumnName="ShelfLifeMinDays",
		EntityType="D",
		Name="Min Shelf Life Days",
		PrintName="Min Shelf Life Days",
		Description="Minimum Shelf Life in days based on Product Instance Guarantee Date",
		Help="Miminum Shelf Life of products with Guarantee Date instance. If > 0 you cannot select products with a shelf life less than the minum shelf life, unless you select 'Show All'",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="931716db-4153-fddd-781d-447a1aa761d3",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "931716db-4153-fddd-781d-447a1aa761d3";

}
