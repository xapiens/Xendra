package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IsExplicitCostAdjustment 
{
 	@XendraElement(AD_Element_ID=2850,
		ColumnName="IsExplicitCostAdjustment",
		EntityType="D",
		Name="Explicit Cost Adjustment",
		PrintName="Explicit Cost Adjustment",
		Description="Post the cost adjustment explicitly",
		Help="If selected, landed costs are posted to the account in the line and then this posting is reversed by the postings to the cost adjustment accounts.  If not selected, it is directly posted to the cost adjustment accounts.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="2a2e5022-0779-a407-e629-dead8e205aa2",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "2a2e5022-0779-a407-e629-dead8e205aa2";

}
