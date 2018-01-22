package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_WF_SubFlowExecution implements Reference 
{
 	@XendraRefItem(Name="Asynchronously",
		Value="A",
		Description="Fork",
		Identifier="e249e1b7-ff89-727d-c6f4-907073c3eed3")
	/** Asynchronously = A */
	public static final String Asynchronously = "A";
	@XendraRefItem(Name="Synchronously",
		Value="S",
		Description="Serial",
		Identifier="d861226b-4b62-91cf-fca2-b5eac085fd4a")
	/** Synchronously = S */
	public static final String Synchronously = "S";
	@XendraRef(Name="WF_SubFlow Execution",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="d935a599-c6cd-7f8b-02ff-011b87736b21")
	public static final String Identifier = "d935a599-c6cd-7f8b-02ff-011b87736b21";

}
