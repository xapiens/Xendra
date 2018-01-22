package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_EncryptionKey 
{
 	@XendraElement(AD_Element_ID=2191,
		ColumnName="EncryptionKey",
		EntityType="D",
		Name="Encryption Class",
		PrintName="Encryption Class",
		Description="Encryption Class used for securing data content",
		Help="The class needs to implement the interface org.compiere.util.SecureInterface. You enable it by setting the COMPIERE_SECURE parameter of your Client and Server start scripts to the custom class.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="645db4e9-b31b-4fb5-fb58-60da622e2c23",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "645db4e9-b31b-4fb5-fb58-60da622e2c23";

}
