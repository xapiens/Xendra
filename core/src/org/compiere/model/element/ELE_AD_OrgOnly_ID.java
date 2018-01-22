package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_AD_OrgOnly_ID 
{
 	@XendraElement(AD_Element_ID=2825,
		ColumnName="AD_OrgOnly_ID",
		EntityType="D",
		Name="Only Organization",
		PrintName="Only Org",
		Description="Create posting entries only for this organization",
		Help="When you have multiple accounting schema, you may want to restrict the generation of postings entries for the additional accounting schema (i.e. not for the primary).  Example: You have a US and a FR organization. The primary accounting schema is in USD, the second in EUR.  If for the EUR accounting schema, you select the FR organizations, you would not create accounting entries for the transactions of the US organization in EUR.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="9c30a255-a66a-3df0-779b-6595115e3fe8",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "9c30a255-a66a-3df0-779b-6595115e3fe8";

}
