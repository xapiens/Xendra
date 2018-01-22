package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_PrintTableFormatStroke implements Reference 
{
 	@XendraRefItem(Name="Solid Line",
		Value="S",
		Description="",
		Identifier="0f9f213a-dbfe-586b-caa1-9b8d6861d41d")
	/** Solid Line = S */
	public static final String SolidLine = "S";
	@XendraRefItem(Name="Dashed Line",
		Value="D",
		Description="",
		Identifier="70aee6a7-d7d5-346f-fa15-d4d16337b0ec")
	/** Dashed Line = D */
	public static final String DashedLine = "D";
	@XendraRefItem(Name="Dotted Line",
		Value="d",
		Description="",
		Identifier="db16e8ac-dd2f-2c39-de6d-90e51b9b10be")
	/** Dotted Line = d */
	public static final String DottedLine = "d";
	@XendraRefItem(Name="Dash-Dotted Line",
		Value="2",
		Description="",
		Identifier="3d4de8f1-a603-7932-5a5e-3c12580e233a")
	/** Dash-Dotted Line = 2 */
	public static final String Dash_DottedLine = "2";
	@XendraRef(Name="AD_PrintTableFormat Stroke",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Stroke Type",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="c5c38947-431d-1f7a-0c5d-6c618e6b84fa")
	public static final String Identifier = "c5c38947-431d-1f7a-0c5d-6c618e6b84fa";

}
