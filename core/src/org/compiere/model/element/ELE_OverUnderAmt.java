package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_OverUnderAmt 
{
 	@XendraElement(AD_Element_ID=1819,
		ColumnName="OverUnderAmt",
		EntityType="D",
		Name="Over/Under Payment",
		PrintName="Over/Under Payment",
		Description="Over-Payment (unallocated) or Under-Payment (partial payment) Amount",
		Help="Overpayments (negative) are unallocated amounts and allow you to receive money for more than the particular invoice.  Underpayments (positive) is a partial payment for the invoice. You do not write off the unpaid amount.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="c1b8d715-3799-d069-9abd-dcbda10d4c2a",
		Synchronized="2012-07-11 00:00:00.0")
	public static final String Identifier = "c1b8d715-3799-d069-9abd-dcbda10d4c2a";

}
