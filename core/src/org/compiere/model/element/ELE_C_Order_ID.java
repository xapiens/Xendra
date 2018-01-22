package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_C_Order_ID 
{
 	@XendraElement(AD_Element_ID=558,
		ColumnName="C_Order_ID",
		EntityType="D",
		Name="Order",
		PrintName="Order",
		Description="Order",
		Help="The Order is a control document.  The  Order is complete when the quantity ordered is the same as the quantity shipped and invoiced.  When you cloase an order, unshipped (backordered) quantities are cancelled.",
		PO_Name="Purchase Order",
		PO_PrintName="Purchase Order",
		PO_Description="Purchase Order",
		PO_Help="The Purchase Order is a control document.  The Purchase Order is complete when the quantity ordered is the same as the quantity shipped and invoiced.  When you cloase an order, unshipped (backordered) quantities are cancelled.",
		Identifier="cc846c60-90b8-6aad-9d07-b5d0c0328787",
		Synchronized="2012-07-11 00:00:00.0")
	public static final String Identifier = "cc846c60-90b8-6aad-9d07-b5d0c0328787";

}
