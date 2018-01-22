package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IsPickQAConfirm 
{
 	@XendraElement(AD_Element_ID=2521,
		ColumnName="IsPickQAConfirm",
		EntityType="D",
		Name="Pick/QA Confirmation",
		PrintName="Pick/QA Confirm",
		Description="Require Pick or QA Confirmation before processing",
		Help="The processing of the Shipment (Receipt) requires Pick (QA) Confirmation. Note that shipments for automatic documents like POS/Warehouse Orders cannot have confirmations!",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="c8f7bd6e-a87e-24f3-c324-49ec1383de2f",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "c8f7bd6e-a87e-24f3-c324-49ec1383de2f";

}
