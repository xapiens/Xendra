package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_C_DocTypeDifference_ID 
{
 	@XendraElement(AD_Element_ID=2542,
		ColumnName="C_DocTypeDifference_ID",
		EntityType="D",
		Name="Difference Document",
		PrintName="Difference Doc",
		Description="Document type for generating in dispute Shipments",
		Help="If the confirmation contains differences, the original document is split allowing the original document (shipment) to be processed and updating Inventory - and the newly CREATED document for handling the dispute at a later time. Until the confirmation is processed, the inventory is not UPDATED.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="193fcd10-fa13-afe1-05af-60d0191242a4",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "193fcd10-fa13-afe1-05af-60d0191242a4";

}
