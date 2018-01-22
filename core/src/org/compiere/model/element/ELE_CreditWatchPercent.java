package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_CreditWatchPercent 
{
 	@XendraElement(AD_Element_ID=2883,
		ColumnName="CreditWatchPercent",
		EntityType="D",
		Name="Credit Watch %",
		PrintName="Credit Watch %",
		Description="Credit Watch - Percent of Credit Limit when OK switches to Watch",
		Help="If Adempiere maintains credit status, the status 'Credit OK' is moved to 'Credit Watch' if the credit available reaches the percent entered.  If not defined, 90% is used.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="4e600b47-b7f9-6df1-37c0-48c219c15de6",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "4e600b47-b7f9-6df1-37c0-48c219c15de6";

}
