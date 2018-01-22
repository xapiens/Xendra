package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_TableReplicationType implements Reference 
{
 	@XendraRefItem(Name="Local",
		Value="L",
		Description="Local <-",
		Identifier="3a9b1303-a341-ffb1-f654-c040cec7cd84")
	/** Local = L */
	public static final String Local = "L";
	@XendraRefItem(Name="Merge",
		Value="M",
		Description="Merge <-->",
		Identifier="f8b2d64d-a7ab-9e75-ae21-0a3edca461fb")
	/** Merge = M */
	public static final String Merge = "M";
	@XendraRefItem(Name="Reference",
		Value="R",
		Description="Reference ->",
		Identifier="526cd9c7-2904-b2af-6655-8b5a3c378fca")
	/** Reference = R */
	public static final String Reference = "R";
	@XendraRef(Name="AD_Table Replication Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Replication Type",
		Help="",
		VFormat="L",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="2b40f382-8066-9d78-4fd2-4c52f2918102")
	public static final String Identifier = "2b40f382-8066-9d78-4fd2-4c52f2918102";

}
