package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_WF_ParticipantType implements Reference 
{
 	@XendraRefItem(Name="Organization",
		Value="O",
		Description="",
		Identifier="b26deabb-f397-c70b-5ac6-9da006c260e1")
	/** Organization = O */
	public static final String Organization = "O";
	@XendraRefItem(Name="Human",
		Value="H",
		Description="",
		Identifier="611c9c86-af16-625d-7a24-6d8ee2518b52")
	/** Human = H */
	public static final String Human = "H";
	@XendraRefItem(Name="Role",
		Value="R",
		Description="",
		Identifier="884ca15f-c887-3548-fa06-6dc2c1df1660")
	/** Role = R */
	public static final String Role = "R";
	@XendraRefItem(Name="System Resource",
		Value="S",
		Description="",
		Identifier="124989f0-5a7a-b0fe-f38c-0fa732c1f061")
	/** System Resource = S */
	public static final String SystemResource = "S";
	@XendraRef(Name="WF_Participant Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="ae7055f1-e121-2966-f907-d95e1d377264")
	public static final String Identifier = "ae7055f1-e121-2966-f907-d95e1d377264";

}
