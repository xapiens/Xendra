package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_MMPolicy 
{
 	@XendraElement(AD_Element_ID=2685,
		ColumnName="MMPolicy",
		EntityType="D",
		Name="Material Policy",
		PrintName="Mat Policy",
		Description="Material Movement Policy",
		Help="The Material Movement Policy determines how the stock is flowing (FiFo or LiFo) if a specific Product Instance was not selected.  The policy can not contradict the costing method (e.g. FiFo movement policy and LiFo costing method).",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="835a2dfb-454a-24bc-fd20-11ca86233a2b",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "835a2dfb-454a-24bc-fd20-11ca86233a2b";

}
