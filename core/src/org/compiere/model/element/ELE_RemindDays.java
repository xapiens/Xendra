package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_RemindDays 
{
 	@XendraElement(AD_Element_ID=2631,
		ColumnName="RemindDays",
		EntityType="D",
		Name="Reminder Days",
		PrintName="Reminder Days",
		Description="Days between sending Reminder Emails for a due or inactive Document",
		Help="When a document is due ot too long without activity, a reminder is sent. 0 means no reminders. The Remind Days are the days when the next email reminder is sent.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="61c87de0-a3d9-936a-2dc0-189a6e5e587c",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "61c87de0-a3d9-936a-2dc0-189a6e5e587c";

}
