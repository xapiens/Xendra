package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_AccountType 
{
 	@XendraElement(AD_Element_ID=147,
		ColumnName="AccountType",
		EntityType="D",
		Name="Account Type",
		PrintName="Account Type",
		Description="Indicates the type of account",
		Help="Valid account types are A - Asset, E - Expense, L - Liability, O- Owner's Equity, R -Revenue and M- Memo.  The account type is used to determine what taxes, if any are applicable, validating payables and receivables for business partners.  Note:  Memo account amounts are ignored when checking for balancing",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="ec156e95-2067-29e9-eb38-6c9e67f8a90d",
		Synchronized="2012-07-11 00:00:00.0")
	public static final String Identifier = "ec156e95-2067-29e9-eb38-6c9e67f8a90d";

}
