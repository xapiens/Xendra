package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_Period_OpenFuture 
{
 	@XendraElement(AD_Element_ID=503,
		ColumnName="Period_OpenFuture",
		EntityType="D",
		Name="Future Days",
		PrintName="Future Days",
		Description="Number of days to be able to post to a future date (based on system date)",
		Help="If Automatic Period Control is enabled, the current period is calculated based on the system date and you can always post to all days in the current period.  Future Days enable to post to future periods. E.g. today is Apr 15th and Future Days is set to 30, you can post up to May 15th",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="7ecbf4a3-c0a1-7276-ee87-993e70ee9994",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "7ecbf4a3-c0a1-7276-ee87-993e70ee9994";

}
