package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IsSplitWhenDifference 
{
 	@XendraElement(AD_Element_ID=2547,
		ColumnName="IsSplitWhenDifference",
		EntityType="D",
		Name="Split when Difference",
		PrintName="Split Difference",
		Description="Split document when there is a difference",
		Help="If the confirmation contains differences, the original document is split allowing the original document (shipment) to be processed and updating Inventory - and the newly CREATED document for handling the dispute at a later time. Until the confirmation is processed, the inventory is not UPDATED.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="0eceee7c-3e5d-b5df-12be-cf38b773fe69",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "0eceee7c-3e5d-b5df-12be-cf38b773fe69";

}
