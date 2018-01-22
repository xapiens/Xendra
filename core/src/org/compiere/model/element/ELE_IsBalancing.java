package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IsBalancing 
{
 	@XendraElement(AD_Element_ID=355,
		ColumnName="IsBalancing",
		EntityType="D",
		Name="Balancing",
		PrintName="Balancing",
		Description="All transactions within an element value must balance (e.g. cost centers)",
		Help="The Balancing checkbox indicates the this element must balance in each journal transaction.  For example, if cost centers have been defined as an element which is balance then the debits and credits for each unique cost center must net to 0.00.  This is commonly used to define parts of an organization which report as their own entity.  Balancing is not an option for the Account element.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="2ce0569a-c7c8-5caf-4193-07fe3caa6126",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "2ce0569a-c7c8-5caf-4193-07fe3caa6126";

}
