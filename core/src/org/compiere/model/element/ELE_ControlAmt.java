package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_ControlAmt 
{
 	@XendraElement(AD_Element_ID=233,
		ColumnName="ControlAmt",
		EntityType="D",
		Name="Control Amount",
		PrintName="Control Amt",
		Description="If not zero, the Debit amount of the document must be equal this amount",
		Help="If the control amount is zero, no check is performed. Otherwise the total Debit amount must be equal to the control amount, before the document is processed.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="d520c7db-ab46-3aab-ca2d-7ffa7ad5b197",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "d520c7db-ab46-3aab-ca2d-7ffa7ad5b197";

}
