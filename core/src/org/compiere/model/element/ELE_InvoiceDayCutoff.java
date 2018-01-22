package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_InvoiceDayCutoff 
{
 	@XendraElement(AD_Element_ID=1098,
		ColumnName="InvoiceDayCutoff",
		EntityType="D",
		Name="Invoice day cut-off",
		PrintName="Invoice day cut-off",
		Description="Last day for including shipments",
		Help="The Invoice Day Cut Off indicates the last day for shipments to be included in the current invoice schedule.  For example, if the invoice schedule is defined for the first day of the month, the cut off day may be the 25th of the month.  An shipment on the 24th of May would be included in the invoices sent on June 1st but a shipment on the 26th would be included in the invoices sent on July 1st.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="16f85044-54df-2ce9-23c4-9d3ed1224d3b",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "16f85044-54df-2ce9-23c4-9d3ed1224d3b";

}
