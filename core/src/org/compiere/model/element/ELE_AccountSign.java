package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_AccountSign 
{
 	@XendraElement(AD_Element_ID=146,
		ColumnName="AccountSign",
		EntityType="D",
		Name="Account Sign",
		PrintName="Sign",
		Description="Indicates the Natural Sign of the Account as a Debit or Credit",
		Help="Indicates if the expected balance for this account should be a Debit or a Credit. If set to Natural, the account sign for an asset or expense account is Debit Sign (i.e. negative if a credit balance).",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="bec935a6-86d9-7793-51fb-4ce378612a32",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "bec935a6-86d9-7793-51fb-4ce378612a32";

}
