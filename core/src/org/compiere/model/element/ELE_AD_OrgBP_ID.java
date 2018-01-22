package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_AD_OrgBP_ID 
{
 	@XendraElement(AD_Element_ID=2354,
		ColumnName="AD_OrgBP_ID",
		EntityType="D",
		Name="Linked Organization",
		PrintName="Linked Org",
		Description="The Business Partner is another Organization for explicit Inter-Org transactions",
		Help="The business partner is another organization in the system. So when performing transactions, the counter-document is CREATED automatically. Example: You have BPartnerA linked to OrgA and BPartnerB linked to OrgB.  If you create a sales order for BPartnerB in OrgA a purchase order is CREATED for BPartnerA in OrgB.  This allows to have explicit documents for Inter-Org transactions.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="d04ed4db-2864-dbe7-9957-f6b745d6766e",
		Synchronized="2012-07-11 00:00:00.0")
	public static final String Identifier = "d04ed4db-2864-dbe7-9957-f6b745d6766e";

}
