package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_WorkflowType implements Reference 
{
 	@XendraRefItem(Name="General",
		Value="G",
		Description="General Workflow",
		Identifier="5b767332-9be1-b839-3175-f5a852f3a408")
	/** General = G */
	public static final String General = "G";
	@XendraRefItem(Name="Document Process",
		Value="P",
		Description="",
		Identifier="0f899d27-6fa0-3d77-472b-f13f724b52a4")
	/** Document Process = P */
	public static final String DocumentProcess = "P";
	@XendraRefItem(Name="Document Value",
		Value="V",
		Description="",
		Identifier="be9be8e1-db4a-859c-2711-81765a82906f")
	/** Document Value = V */
	public static final String DocumentValue = "V";
	@XendraRef(Name="AD_Workflow Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Workflow Type",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="9cff63cf-4649-ca92-f60d-786935680030")
	public static final String Identifier = "9cff63cf-4649-ca92-f60d-786935680030";

}
