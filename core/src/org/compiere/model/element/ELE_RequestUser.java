package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_RequestUser 
{
 	@XendraElement(AD_Element_ID=1700,
		ColumnName="RequestUser",
		EntityType="D",
		Name="Request User",
		PrintName="Request User",
		Description="User Name (ID) of the email owner",
		Help="EMail user NAME for requests, alerts and escalation are sent from this email address as well as delivery information if the sales rep does not have an email account. Required, if your mail server requires authentification as well as for processing incoming mails.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="802aca3a-f645-7476-a556-e4341f9d67cc",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "802aca3a-f645-7476-a556-e4341f9d67cc";

}
