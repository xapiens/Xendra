package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_SOCreditStatus 
{
 	@XendraElement(AD_Element_ID=2181,
		ColumnName="SOCreditStatus",
		EntityType="D",
		Name="Credit Status",
		PrintName="Credit Status",
		Description="Business Partner Credit Status",
		Help="Credit Management is inactive if Credit Status is No Credit Check, Credit Stop or if the Credit Limit is 0. If active, the status is set automatically set to Credit Hold, if the Total Open Balance (including Vendor activities)  is higher then the Credit Limit. It is set to Credit Watch, if above 90% of the Credit Limit and Credit OK otherwise.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="2fdf1001-d39a-9b45-560c-23ab69712cf5",
		Synchronized="2012-07-11 00:00:00.0")
	public static final String Identifier = "2fdf1001-d39a-9b45-560c-23ab69712cf5";

}
