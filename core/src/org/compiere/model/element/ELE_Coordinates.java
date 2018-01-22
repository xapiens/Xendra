package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_Coordinates 
{
 	@XendraElement(AD_Element_ID=1831,
		ColumnName="Coordinates",
		EntityType="D",
		Name="Coordinates",
		PrintName="Coordinates",
		Description="Location coordinate",
		Help="This column contains the geographical coordinates (latitude/longitude) of the location.<p> In order to avoid unnecessary use of non-standard characters and space, the following standard presentation is used:<br> 0000N 00000W 0000S 00000E <br> where the two last digits refer to minutes and the two or three first digits indicate the degrees",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="fc286c62-1ecd-80a7-6fcc-979df324563e",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "fc286c62-1ecd-80a7-6fcc-979df324563e";

}
