package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_PrintArea implements Reference 
{
 	@XendraRefItem(Name="Content",
		Value="C",
		Description="",
		Identifier="9b3f75bd-6636-b259-a39b-ee99094ee273")
	/** Content = C */
	public static final String Content = "C";
	@XendraRefItem(Name="Header",
		Value="H",
		Description="",
		Identifier="93db16ba-a450-8b26-17f8-91e7c84e5d10")
	/** Header = H */
	public static final String Header = "H";
	@XendraRefItem(Name="Footer",
		Value="F",
		Description="",
		Identifier="bb7401be-f596-5b13-8931-3dd0126035bf")
	/** Footer = F */
	public static final String Footer = "F";
	@XendraRef(Name="AD_Print Area",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="bd37b9db-379c-e13d-7c91-d2a6f4d08910")
	public static final String Identifier = "bd37b9db-379c-e13d-7c91-d2a6f4d08910";

}
