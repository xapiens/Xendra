package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IsDefaultCounterDoc 
{
 	@XendraElement(AD_Element_ID=2517,
		ColumnName="IsDefaultCounterDoc",
		EntityType="D",
		Name="Default Counter Document",
		PrintName="Default Counter Doc",
		Description="The document type is the default counter document type",
		Help="When using explicit documents for inter-org transaction (after linking a Business Partner to an Organization), you can determine what document type the counter document is based on the document type of the original transaction.  Example: when generating a Sales Order, use this Sales Order document type. This default can be overwritten by defining explicit counter document relationships.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="82567530-531f-bada-e4b1-55d16df61e8e",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "82567530-531f-bada-e4b1-55d16df61e8e";

}
