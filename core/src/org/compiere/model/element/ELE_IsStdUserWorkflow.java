package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IsStdUserWorkflow 
{
 	@XendraElement(AD_Element_ID=2501,
		ColumnName="IsStdUserWorkflow",
		EntityType="D",
		Name="Std User Workflow",
		PrintName="Std User Workflow",
		Description="Standard Manual User Approval Workflow",
		Help="If selected, only documents with an open status (drafted, in progress, approved, rejected, invalid) and standard user actions (prepare, complete, approve, reject) are allowed to continue.  Use this to prevent having to define details on how automatic processes (unlock, invalidate, post, re-activate) and when the document is closed for normal user action (completed, waiting, closed, voided, reversed).",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="720ef7e2-3787-08f3-9486-976dcba019e2",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "720ef7e2-3787-08f3-9486-976dcba019e2";

}
