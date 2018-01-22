package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IsOneAssetPerUOM 
{
 	@XendraElement(AD_Element_ID=2727,
		ColumnName="IsOneAssetPerUOM",
		EntityType="D",
		Name="One Asset Per UOM",
		PrintName="One Asset Per UOM",
		Description="Create one asset per UOM",
		Help="If selected, one asset per UOM is CREATED, otherwise one asset with the quantity received/shipped.  If you have multiple lines, one asset is CREATED per line.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="d2e2e724-2bbe-3f1c-3f5d-9878494cc5c4",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "d2e2e724-2bbe-3f1c-3f5d-9878494cc5c4";

}
