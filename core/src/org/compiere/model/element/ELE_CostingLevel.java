package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_CostingLevel 
{
 	@XendraElement(AD_Element_ID=2816,
		ColumnName="CostingLevel",
		EntityType="D",
		Name="Costing Level",
		PrintName="Costing Level",
		Description="The lowest level to accumulate Costing Information",
		Help="If you want to maintain different costs per organization (warehouse) or per Batch/Lot, you need to make sure that you define the costs for each of the organizations or batch/lot. The Costing Level is defined per Accounting Schema and can be overwritten by Product Category and Accounting Schema.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="75255888-a130-58b8-ac62-be5642b80011",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "75255888-a130-58b8-ac62-be5642b80011";

}
