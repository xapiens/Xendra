package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IDRangeStart 
{
 	@XendraElement(AD_Element_ID=2156,
		ColumnName="IDRangeStart",
		EntityType="D",
		Name="ID Range Start",
		PrintName="ID Start",
		Description="Start of the ID Range used",
		Help="The ID Range allows to restrict the range of the internally used IDs. The standard rages are 0-899,999 for the Application Dictionary 900,000-999,999 for Application Dictionary customizations/extensions and > 1,000,000 for client data. The standard system limit is 9,999,999,999 but can easily be extended.  The ID range is on a per table basis. Please note that the ID range is NOT enforced.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="0b89c124-6939-2611-72c5-5e946a24790d",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "0b89c124-6939-2611-72c5-5e946a24790d";

}
