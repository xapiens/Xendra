package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_OverdueAssignDays 
{
 	@XendraElement(AD_Element_ID=1696,
		ColumnName="OverdueAssignDays",
		EntityType="D",
		Name="Escalate after Days Due",
		PrintName="Escalate after Days",
		Description="Escalation to superior after number of due days (0 = no)",
		Help="The item will be escalated and assigned to the supervisor after the number of days over due. If 0, there is no escalation.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="6cb75ab2-c0e8-dff4-0d62-0005e5f7d99e",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "6cb75ab2-c0e8-dff4-0d62-0005e5f7d99e";

}
