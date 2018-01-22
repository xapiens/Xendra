package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_ProjectLineLevel implements Reference 
{
 	@XendraRefItem(Name="Project",
		Value="P",
		Description="",
		Identifier="913fa9d7-93f4-7de7-6b5c-378056e6343c")
	/** Project = P */
	public static final String Project = "P";
	@XendraRefItem(Name="Phase",
		Value="A",
		Description="",
		Identifier="4531b968-22ee-4f67-2601-8c982fbccdbf")
	/** Phase = A */
	public static final String Phase = "A";
	@XendraRefItem(Name="Task",
		Value="T",
		Description="",
		Identifier="213ea972-0e2b-c6b7-6faa-903299884289")
	/** Task = T */
	public static final String Task = "T";
	@XendraRef(Name="C_Project LineLevel",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="d73f5ccf-2a32-0ae0-e894-e94ff7a37db6")
	public static final String Identifier = "d73f5ccf-2a32-0ae0-e894-e94ff7a37db6";

}
