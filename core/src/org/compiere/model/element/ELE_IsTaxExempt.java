package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IsTaxExempt 
{
 	@XendraElement(AD_Element_ID=930,
		ColumnName="IsTaxExempt",
		EntityType="D",
		Name="Tax exempt",
		PrintName="Tax exempt",
		Description="Business partner is exempt from tax",
		Help="If a business partner is exempt from tax, the exempt tax rate is used. For this, you need to set up a tax rate with a 0% rate and indicate that this is your tax exempt rate.  This is required for tax reporting, so that you can track tax exempt transactions.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="16f91faf-5980-9ce8-0199-2fad4dad3541",
		Synchronized="2012-07-11 00:00:00.0")
	public static final String Identifier = "16f91faf-5980-9ce8-0199-2fad4dad3541";

}
