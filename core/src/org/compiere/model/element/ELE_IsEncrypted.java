package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IsEncrypted 
{
 	@XendraElement(AD_Element_ID=374,
		ColumnName="IsEncrypted",
		EntityType="D",
		Name="Encrypted",
		PrintName="Encrypted",
		Description="Display or Storage is encrypted",
		Help="Display encryption (in Window/Tab/Field) - all characters are displayed as '*' - in the database it is stored in clear text. You will not be able to report on these columns.<br> Data storage encryption (in Table/Column) - data is stored encrypted in the database (dangerous!) and you will not be able to report on those columns. Independent from Display encryption.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="c0df59ef-8893-5340-a5d8-c855ca33c9dc",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "c0df59ef-8893-5340-a5d8-c855ca33c9dc";

}
