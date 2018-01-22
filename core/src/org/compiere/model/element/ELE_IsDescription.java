package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IsDescription 
{
 	@XendraElement(AD_Element_ID=2183,
		ColumnName="IsDescription",
		EntityType="D",
		Name="Description Only",
		PrintName="Description",
		Description="if true, the line is just DESCRIPTION and no transaction",
		Help="If a line is Description Only, e.g. Product Inventory is not corrected. No accounting transactions are CREATED and the amount or totals are not included in the document.  This for including DESCRIPTIONal detail lines, e.g. for an Work Order.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="bd7f450d-a061-1b08-60d8-19c8943042f0",
		Synchronized="2012-07-11 00:00:00.0")
	public static final String Identifier = "bd7f450d-a061-1b08-60d8-19c8943042f0";

}
