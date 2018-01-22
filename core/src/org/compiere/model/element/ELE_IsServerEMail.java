package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IsServerEMail 
{
 	@XendraElement(AD_Element_ID=2808,
		ColumnName="IsServerEMail",
		EntityType="D",
		Name="Server EMail",
		PrintName="Server EMail",
		Description="Send EMail from Server",
		Help="When selected, mail is sent from the server rather then the client.  This decreases availability.  You would select this when you do not want to enable email relay for the client addresses in your mail server.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="cc88e784-dd0e-3c5e-6542-8abb71044ea9",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "cc88e784-dd0e-3c5e-6542-8abb71044ea9";

}
