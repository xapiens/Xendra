package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IsShipConfirm 
{
 	@XendraElement(AD_Element_ID=2522,
		ColumnName="IsShipConfirm",
		EntityType="D",
		Name="Ship/Receipt Confirmation",
		PrintName="Ship/Receipt Confirm",
		Description="Require Ship or Receipt Confirmation before processing",
		Help="The processing of the Shipment (Receipt) requires Ship (Receipt) Confirmation. Note that shipments for automatic documents like POS/Warehouse Orders cannot have confirmations!",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="8d82007a-0c98-4f97-fcee-3f92e3615e8f",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "8d82007a-0c98-4f97-fcee-3f92e3615e8f";

}
