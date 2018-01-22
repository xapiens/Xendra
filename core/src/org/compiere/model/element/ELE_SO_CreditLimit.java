package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_SO_CreditLimit 
{
 	@XendraElement(AD_Element_ID=553,
		ColumnName="SO_CreditLimit",
		EntityType="D",
		Name="Credit Limit",
		PrintName="Credit Limit",
		Description="Total outstanding invoice amounts allowed",
		Help="The Credit Limit indicates the total amount allowed 'on account' in primary accounting currency.  If the Credit Limit is 0, no ckeck is performed.  Credit Management is based on the Total Open Amount, which includes Vendor activities.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="a208e785-69be-24f1-a54c-9bdc71e5cb35",
		Synchronized="2012-07-11 00:00:00.0")
	public static final String Identifier = "a208e785-69be-24f1-a54c-9bdc71e5cb35";

}
