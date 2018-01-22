package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_RequestFolder 
{
 	@XendraElement(AD_Element_ID=1699,
		ColumnName="RequestFolder",
		EntityType="D",
		Name="Request Folder",
		PrintName="Request Folder",
		Description="EMail folder to process incoming emails: if empty INBOX is used",
		Help="Email folder used to read emails to process as requests, If left empty the default mailbox (INBOX) will be used. Requires IMAP services.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="0ca9f976-2c86-e976-369b-34644560ec7c",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "0ca9f976-2c86-e976-369b-34644560ec7c";

}
