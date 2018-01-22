package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_FixMonthOffset 
{
 	@XendraElement(AD_Element_ID=893,
		ColumnName="FixMonthOffset",
		EntityType="D",
		Name="Fix month offset",
		PrintName="Fix month offset",
		Description="Number of months (0=same, 1=following)",
		Help="The Fixed Month Offset indicates the number of months from the current month to indicate an invoice is due.  A 0 indicates the same month, a 1 the following month.  This field will only display if the fixed due date checkbox is selected.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="a4bb57a1-f3ea-0cdb-8853-82a8a38e58b5",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "a4bb57a1-f3ea-0cdb-8853-82a8a38e58b5";

}
