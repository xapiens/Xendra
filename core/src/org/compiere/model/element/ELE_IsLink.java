package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IsLink 
{
 	@XendraElement(AD_Element_ID=1000001,
		ColumnName="IsLink",
		EntityType="D",
		Name="Is linked account",
		PrintName="Is linked account",
		Description="Defines if the distribution process should delete the source element or not.",
		Help="If set, this flag will cause the source accounting element not to be deleted, while the destination element will be created anyway.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="ea23e353-29da-f5ea-a9f1-d34e39dc6bb8",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "ea23e353-29da-f5ea-a9f1-d34e39dc6bb8";

}
