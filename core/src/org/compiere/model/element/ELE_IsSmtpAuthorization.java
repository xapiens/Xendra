package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IsSmtpAuthorization 
{
 	@XendraElement(AD_Element_ID=1898,
		ColumnName="IsSmtpAuthorization",
		EntityType="D",
		Name="SMTP Authentication",
		PrintName="SMTP Authentication",
		Description="Your mail server requires Authentication",
		Help="Some email servers require authentication before sending emails.  If yes, users are required to define their email user NAME and password.  If authentication is required and no user NAME and password is required, delivery will fail.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="867f8f07-3a8a-5ae7-28f8-29561aecbf90",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "867f8f07-3a8a-5ae7-28f8-29561aecbf90";

}
