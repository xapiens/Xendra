package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_MaxQueryRecords 
{
 	@XendraElement(AD_Element_ID=2854,
		ColumnName="MaxQueryRecords",
		EntityType="D",
		Name="Max Query Records",
		PrintName="Max Query Records",
		Description="If defined, you cannot query more records as defined - the query criteria needs to be changed to query less records",
		Help="Enter the numer of records a user will be able to query to avoid unnecessary system load.  If 0, no restrictions are imposed.",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="822029fd-00be-cf0e-6b85-88d4604cf594",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "822029fd-00be-cf0e-6b85-88d4604cf594";

}
