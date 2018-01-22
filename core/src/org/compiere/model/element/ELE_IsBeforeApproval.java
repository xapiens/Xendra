package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IsBeforeApproval 
{
 	@XendraElement(AD_Element_ID=2872,
		ColumnName="IsBeforeApproval",
		EntityType="D",
		Name="Before Approval",
		PrintName="Before Approval",
		Description="The Check is before the (manual) approval",
		Help="If selected, the Budget Approval is before manual approvals - i.e. is only approved if budget is available.  This may cause that the use of the budget is delayed (after the approval)",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="67bb441d-d288-636e-857b-03604fc0afa3",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "67bb441d-d288-636e-857b-03604fc0afa3";

}
