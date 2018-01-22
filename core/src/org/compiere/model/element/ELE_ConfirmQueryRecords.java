package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_ConfirmQueryRecords 
{
 	@XendraElement(AD_Element_ID=2853,
		ColumnName="ConfirmQueryRecords",
		EntityType="D",
		Name="Confirm Query Records",
		PrintName="Confirm Query Records",
		Description="Require Confirmation if more records will be returned by the query (If not defined 500)",
		Help="Enter the numer of records the query wil return without confirmation to avoid unnecessary system load.  If 0, the system default of 500 is used.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="0e657dbc-3d5c-c78b-9c0e-47bffbd0be3a",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "0e657dbc-3d5c-c78b-9c0e-47bffbd0be3a";

}
