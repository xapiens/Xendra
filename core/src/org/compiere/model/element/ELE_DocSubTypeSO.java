package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_DocSubTypeSO 
{
 	@XendraElement(AD_Element_ID=1018,
		ColumnName="DocSubTypeSO",
		EntityType="D",
		Name="SO Sub Type",
		PrintName="SO Sub Type",
		Description="Sales Order Sub Type",
		Help="The SO Sub Type indicates the type of sales order this document refers to.  This field only appears when the Document Base Type is Sales Order.  The selection made here will determine which documents will be generated when an order is processed and which documents must be generated manually or in batches.  <br> The following outlines this process.<br> SO Sub Type of <b>Standard Order</b> will generate just the <b>Order</b> document when the order is processed.  <br> The <b>Delivery Note</b>, <b>Invoice</b> and <b>Receipt</b> must be generated via other processes.  <br> SO Sub Type of <b>Warehouse Order</b> will generate the <b>Order</b> and <b>Delivery Note</b>. <br> The <b>Invoice</b> and <b>Receipt</b> must be generated via other processes.<br> SO Sub Type of <b>Credit Order</b> will generate the <b>Order</b>, <b>Delivery Note</b> and <b>Invoice</b>. <br> The <b>Reciept</b> must be generated via other processes.<br> SO Sub Type of <b>POS</b> (Point of Sale) will generate all document",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="ab31b2c9-145b-6027-0e71-02999831d402",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "ab31b2c9-145b-6027-0e71-02999831d402";

}
