package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_QtyLostSales 
{
 	@XendraElement(AD_Element_ID=2826,
		ColumnName="QtyLostSales",
		EntityType="D",
		Name="Lost Sales Qty",
		PrintName="Lost Sales Qty",
		Description="Quantity of potential sales",
		Help="When an order is closed and there is a difference between the ordered quantity and the delivered (invoiced) quantity is the Lost Sales Quantity.  Note that the Lost Sales Quantity is 0 if you void an order, so close the order if you want to track lost opportunities.  [Void = data entry error - Close = the order is finished]",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="a16fbc85-1e28-a1e0-c277-17b64f097cbf",
		Synchronized="2012-07-11 00:00:00.0")
	public static final String Identifier = "a16fbc85-1e28-a1e0-c277-17b64f097cbf";

}
