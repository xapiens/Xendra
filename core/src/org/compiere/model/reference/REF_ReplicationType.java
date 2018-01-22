package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_ReplicationType implements Reference 
{
 	@XendraRefItem(Name="Merge",
		Value="M",
		Description="",
		Identifier="8924057e-a718-b1ba-4e4a-7e288244282a")
	/** Merge = M */
	public static final String Merge = "M";
	@XendraRefItem(Name="Reference",
		Value="R",
		Description="",
		Identifier="456141fd-11bf-68dd-66fd-1a621a3bedfa")
	/** Reference = R */
	public static final String Reference = "R";
	@XendraRefItem(Name="Local",
		Value="L",
		Description="",
		Identifier="27a51a6f-6a87-9eb8-5fb0-fdc656c0aef7")
	/** Local = L */
	public static final String Local = "L";
	@XendraRefItem(Name="None",
		Value="N",
		Description="",
		Identifier="7eaf7d6b-9c6f-4408-99dc-25865da5c2b5")
	/** None = N */
	public static final String None = "N";
	@XendraRef(Name="Replication Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Replication Type",
		Help="",
		VFormat="L",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2017-05-08 02:22:58.954",
		Extension="",
		Identifier="b21a4af6-31d2-3c66-8ee7-fca98e903ccb")
	public static final String Identifier = "b21a4af6-31d2-3c66-8ee7-fca98e903ccb";

}
