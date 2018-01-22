package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IsDropShip 
{
 	@XendraElement(AD_Element_ID=2466,
		ColumnName="IsDropShip",
		EntityType="D",
		Name="Drop Shipment",
		PrintName="Drop Ship",
		Description="Drop Shipments are sent from the Vendor directly to the Customer",
		Help="Drop Shipments do not cause any Inventory reservations or movements as the Shipment is from the Vendor's inventory. The Shipment of the Vendor to the Customer must be confirmed.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="9169ec42-d87e-a73e-8ef5-81b97661ffb5",
		Synchronized="2012-07-11 00:00:00.0")
	public static final String Identifier = "9169ec42-d87e-a73e-8ef5-81b97661ffb5";

}
