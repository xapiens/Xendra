package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_LDAPUser 
{
 	@XendraElement(AD_Element_ID=2546,
		ColumnName="LDAPUser",
		EntityType="D",
		Name="LDAP User Name",
		PrintName="LDAP User",
		Description="User Name used for authorization via LDAP (directory) services",
		Help="Optional LDAP system user NAME for the user. If not defined, the normal Name of the user is used. This allows to use the internal (LDAP) user id (e.g. jjanke) and the normal display NAME (e.g. Jorg Janke).  The LDAP User Name can also be used without LDAP enables (see system window).  This would allow to sign in as jjanke and use the display NAME of Jorg Janke.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="44d4e5e5-7be9-5f75-57f8-c5e3bf572c69",
		Synchronized="2012-07-11 00:00:00.0")
	public static final String Identifier = "44d4e5e5-7be9-5f75-57f8-c5e3bf572c69";

}
