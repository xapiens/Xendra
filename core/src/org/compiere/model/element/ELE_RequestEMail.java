package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_RequestEMail 
{
 	@XendraElement(AD_Element_ID=1698,
		ColumnName="RequestEMail",
		EntityType="D",
		Name="Request EMail",
		PrintName="Request EMail",
		Description="EMail address to send automated mails from or receive mails for automated processing (fully qualified)",
		Help="EMails for requests, alerts and escalation are sent from this email address as well as delivery information if the sales rep does not have an email account. The address must be filly qualified (e.g. joe.smith@company.com) and should be a valid address.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="4c9b4765-1df2-7dbb-165e-43d36e7d63f8",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "4c9b4765-1df2-7dbb-165e-43d36e7d63f8";

}
