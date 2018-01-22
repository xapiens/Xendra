package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_RoleUserLevel implements Reference 
{
 	@XendraRefItem(Name="System",
		Value="S  ",
		Description="",
		Identifier="e1f1d4e7-3636-9ac9-cff4-739a78f57c7f")
	/** System = S   */
	public static final String System = "S  ";
	@XendraRefItem(Name="Client",
		Value=" C ",
		Description="",
		Identifier="38a731d0-cc95-1e66-0469-2b401f045cee")
	/** Client =  C  */
	public static final String Client = " C ";
	@XendraRefItem(Name="Organization",
		Value="  O",
		Description="",
		Identifier="f3b7fc91-ea01-54b7-8861-522e59395b0b")
	/** Organization =   O */
	public static final String Organization = "  O";
	@XendraRefItem(Name="Client+Organization",
		Value=" CO",
		Description="",
		Identifier="d7fe81c7-8a58-11de-a163-1350c25098cc")
	/** Client+Organization =  CO */
	public static final String ClientPlusOrganization = " CO";
	@XendraRef(Name="AD_Role User Level",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="b911f62a-deaa-a655-7d6d-437cb3f05cac")
	public static final String Identifier = "b911f62a-deaa-a655-7d6d-437cb3f05cac";

}
