package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_P_InventoryClearing_Acct 
{
 	@XendraElement(AD_Element_ID=2847,
		ColumnName="P_InventoryClearing_Acct",
		EntityType="D",
		Name="Inventory Clearing",
		PrintName="Inventory Clearing",
		Description="Product Inventory Clearing Account",
		Help="Account used for posting matched product (item) expenses (e.g. AP Invoice, Invoice Match).  You would use a different account then Product Expense, if you want to differentate service related costs from item related costs. The balance on the clearing account should be zero and accounts for the timing difference between invoice receipt and matching.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="df102fda-6348-7e51-ccc2-eb5639647e89",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "df102fda-6348-7e51-ccc2-eb5639647e89";

}
