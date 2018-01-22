package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IsPositiveOnly 
{
 	@XendraElement(AD_Element_ID=1562,
		ColumnName="IsPositiveOnly",
		EntityType="D",
		Name="Positive only",
		PrintName="Positive only",
		Description="Do not generate negative commissions",
		Help="The Positive Only check box indicates that if the result of the subtraction is negative, it is ignored.  This would mean that negative commissions would not be generated.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="22937c08-9a90-180d-97b1-9788f277abed",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "22937c08-9a90-180d-97b1-9788f277abed";

}
