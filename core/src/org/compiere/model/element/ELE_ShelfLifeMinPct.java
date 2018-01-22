package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_ShelfLifeMinPct 
{
 	@XendraElement(AD_Element_ID=2240,
		ColumnName="ShelfLifeMinPct",
		EntityType="D",
		Name="Min Shelf Life %",
		PrintName="Min Shelf Life %",
		Description="Minimum Shelf Life in percent based on Product Instance Guarantee Date",
		Help="Miminum Shelf Life of products with Guarantee Date instance. If > 0 you cannot select products with a shelf life ((Guarantee Date-Today) / Guarantee Days) less than the minum shelf life, unless you select 'Show All'",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="47d4dbcc-2d80-bdd4-16ca-21dca83a14da",
		Synchronized="2012-07-11 00:00:00.0")
	public static final String Identifier = "47d4dbcc-2d80-bdd4-16ca-21dca83a14da";

}
