package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IsExcludeAutoDelivery 
{
 	@XendraElement(AD_Element_ID=2867,
		ColumnName="IsExcludeAutoDelivery",
		EntityType="D",
		Name="Exclude Auto Delivery",
		PrintName="Exclude Delivery",
		Description="Exclude from automatic Delivery",
		Help="The product is excluded from generating Shipments.  This allows manual creation of shipments for high demand items. If selected, you need to create the shipment manually. But, the item is always included, when the delivery rule of the Order is Force (e.g. for POS).  This allows finer granularity of the Delivery Rule Manual.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="022c3abd-5296-1249-02a5-52a0b485f47f",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "022c3abd-5296-1249-02a5-52a0b485f47f";

}
