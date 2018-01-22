package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_ProjectTypeCategory implements Reference 
{
 	@XendraRefItem(Name="General",
		Value="N",
		Description="",
		Identifier="b989ee17-3d2b-86a2-089e-11146926ab0a")
	/** General = N */
	public static final String General = "N";
	@XendraRefItem(Name="Asset Project",
		Value="A",
		Description="",
		Identifier="e31713cf-bdcf-3a91-b3dc-cb2918800b4c")
	/** Asset Project = A */
	public static final String AssetProject = "A";
	@XendraRefItem(Name="Work Order (Job)",
		Value="W",
		Description="",
		Identifier="e5842c45-88c5-d3f4-5661-7ae921486619")
	/** Work Order (Job) = W */
	public static final String WorkOrderJob = "W";
	@XendraRefItem(Name="Service (Charge) Project",
		Value="S",
		Description="",
		Identifier="cbbead0c-da9d-e772-5cca-5a05def34733")
	/** Service (Charge) Project = S */
	public static final String ServiceChargeProject = "S";
	@XendraRef(Name="C_ProjectType Category",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="dd876d4c-6a7f-9d8e-4f7c-480645f3079a")
	public static final String Identifier = "dd876d4c-6a7f-9d8e-4f7c-480645f3079a";

}
