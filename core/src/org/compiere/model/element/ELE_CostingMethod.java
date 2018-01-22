package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_CostingMethod 
{
 	@XendraElement(AD_Element_ID=241,
		ColumnName="CostingMethod",
		EntityType="D",
		Name="Costing Method",
		PrintName="Costing Method",
		Description="Indicates how Costs will be calculated",
		Help="The Costing Method indicates how costs will be calculated (Standard, Average, Lifo, FoFo).  The default costing method is defined on accounting schema level and can be optionally overwritten in the product category.  The costing method cannot conflict with the Material Movement Policy (defined on Product Category).",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="d3c72366-8d7e-1b49-ef94-f5412c3f434c",
		Synchronized="2012-07-11 00:00:00.0")
	public static final String Identifier = "d3c72366-8d7e-1b49-ef94-f5412c3f434c";

}
