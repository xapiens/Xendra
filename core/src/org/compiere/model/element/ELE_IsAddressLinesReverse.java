package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_IsAddressLinesReverse 
{
 	@XendraElement(AD_Element_ID=2623,
		ColumnName="IsAddressLinesReverse",
		EntityType="D",
		Name="Reverse Address Lines",
		PrintName="Reverse Address",
		Description="Print Address in reverse Order",
		Help="If NOT selected the sequence is Address 1, Address 2, Address 3, Address 4, City/Region/Postal, Country. If selected the sequence is Country, City/Region/Postal, Address 4, Address 3, Address 2, Address 1. The sequence of City/Region/Postal is determined by the address format.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="1f3b26c1-eaed-2763-cd5c-540705e8989f",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "1f3b26c1-eaed-2763-cd5c-540705e8989f";

}
