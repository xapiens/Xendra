package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IsDocumentLevel 
{
 	@XendraElement(AD_Element_ID=917,
		ColumnName="IsDocumentLevel",
		EntityType="D",
		Name="Document Level",
		PrintName="Doc Level",
		Description="Tax is calculated on document level (rather than line by line)",
		Help="If the tax is calculated on document level, all lines with that tax rate are added before calculating the total tax for the document. Otherwise the tax is calculated per line and then added. Due to rounding, the tax amount can differ.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="f5e0baf2-4bb4-7c1e-81a8-5157e0229af2",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "f5e0baf2-4bb4-7c1e-81a8-5157e0229af2";

}
