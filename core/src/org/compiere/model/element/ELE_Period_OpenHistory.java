package org.compiere.model.element;


import org.xendra.annotations.*;
public class ELE_Period_OpenHistory 
{
 	@XendraElement(AD_Element_ID=504,
		ColumnName="Period_OpenHistory",
		EntityType="D",
		Name="History Days",
		PrintName="History Days",
		Description="Number of days to be able to post in the past (based on system date)",
		Help="If Automatic Period Control is enabled, the current period is calculated based on the system date and you can always post to all days in the current period.  History Days enable to post to previous periods.  E.g. today is May 15th and History Days is set to 30, you can post back to April 15th",
		PO_Name="",
		PO_PrintName="",
		PO_Description="",
		PO_Help="",
		Identifier="b047ddfe-4156-e10d-980f-273f20958965",
		Synchronized="2012-07-12 00:00:00.0")
	public static final String Identifier = "b047ddfe-4156-e10d-980f-273f20958965";

}
