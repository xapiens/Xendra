package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_RRAmt 
{
 	@XendraElement(AD_Element_ID=3033,
		ColumnName="RRAmt",
		EntityType="D",
		Name="Revenue Recognition Amt",
		PrintName="RR Amt",
		Description="Revenue Recognition Amount",
		Help="The amount for revenue recognition calculation.  If empty, the complete invoice amount is used.  The difference between Revenue Recognition Amount and Invoice Line Net Amount is immediately recognized as revenue.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="4c89d321-da8c-565e-c050-3172ca737c4b",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "4c89d321-da8c-565e-c050-3172ca737c4b";

}
