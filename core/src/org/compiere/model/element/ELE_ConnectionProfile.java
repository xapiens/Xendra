package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_ConnectionProfile 
{
 	@XendraElement(AD_Element_ID=2880,
		ColumnName="ConnectionProfile",
		EntityType="D",
		Name="Connection Profile",
		PrintName="Connection Profile",
		Description="How a Java Client connects to the server(s)",
		Help="Depending on the connection profile, different protocols are used and tasks are performed on the server rather then the client. Usually the user can select different profiles, unless it is enforced by the User or Role definition. The User level profile overwrites the Role based profile.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="0bedebc6-89fa-ce88-eb93-bbf2207e0485",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "0bedebc6-89fa-ce88-eb93-bbf2207e0485";

}
