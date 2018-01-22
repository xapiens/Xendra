package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_LDAPDomain 
{
 	@XendraElement(AD_Element_ID=2549,
		ColumnName="LDAPDomain",
		EntityType="D",
		Name="LDAP Domain",
		PrintName="LDAP Domain",
		Description="Directory service domain NAME - e.g. adempiere.org",
		Help="If LDAP Host and Domain is specified, the user is authenticated via LDAP. The password in the User table is not used for connecting to Adempiere.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="4b352a77-31e4-6947-3dd2-ccf951b16a09",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "4b352a77-31e4-6947-3dd2-ccf951b16a09";

}
