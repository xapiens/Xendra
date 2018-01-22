package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_InventoryReportType implements Reference 
{
 	@XendraRefItem(Name="Blind list (w/o book quantity)",
		Value="B",
		Description="",
		Identifier="0bfd279c-b61f-42a6-8e60-dc5e5a3f2c67")
	/** Blind list (w/o book quantity) = B */
	public static final String BlindListWOBookQuantity = "B";
	@XendraRefItem(Name="Count list (with book quantity)",
		Value="L",
		Description="",
		Identifier="9cb82379-b1d9-49b5-989c-60ec9f674802")
	/** Count list (with book quantity) = L */
	public static final String CountListWithBookQuantity = "L";
	@XendraRefItem(Name="Control list",
		Value="C",
		Description="",
		Identifier="de54916b-1b59-4bf9-9c68-667ef3130759")
	/** Control list = C */
	public static final String ControlList = "C";
	@XendraRef(Name="M_Inventory ReportType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:55:58.0",
		Extension="",
		Identifier="3d7d998b-ef94-411d-b697-f36e800c6f94")
	public static final String Identifier = "3d7d998b-ef94-411d-b697-f36e800c6f94";

}
