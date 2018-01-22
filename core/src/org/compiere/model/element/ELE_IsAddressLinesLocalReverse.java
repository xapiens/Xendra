package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IsAddressLinesLocalReverse 
{
 	@XendraElement(AD_Element_ID=2622,
		ColumnName="IsAddressLinesLocalReverse",
		EntityType="D",
		Name="Reverse Local Address Lines",
		PrintName="Reverse Local Address",
		Description="Print Local Address in reverse Order",
		Help="If NOT selected the local sequence is Address 1, Address 2, Address 3, Address 4, City/Region/Postal, Country. If selected the local sequence is Country, City/Region/Postal, Address 4, Address 3, Address 2, Address 1. The sequence of City/Region/Postal is determined by the local address format.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="7c6763b0-4b20-01d8-c8ae-d088b31abb05",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "7c6763b0-4b20-01d8-c8ae-d088b31abb05";

}
