package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_PeriodControlAction implements Reference 
{
 	@XendraRefItem(Name="Open Period",
		Value="O",
		Description="",
		Identifier="f4759f8c-56e8-0231-f91e-aa4555f50001")
	/** Open Period = O */
	public static final String OpenPeriod = "O";
	@XendraRefItem(Name="Close Period",
		Value="C",
		Description="Soft close - can be re-opened",
		Identifier="b0f08ecf-f131-513a-cf32-2726c94088f3")
	/** Close Period = C */
	public static final String ClosePeriod = "C";
	@XendraRefItem(Name="<No Action>",
		Value="N",
		Description="",
		Identifier="496627ab-c81d-6389-ece0-0d7a821cd71f")
	/** <No Action> = N */
	public static final String NoAction = "N";
	@XendraRefItem(Name="Permanently Close Period",
		Value="P",
		Description="",
		Identifier="7a2ae2df-c430-0a48-0c59-001895a05285")
	/** Permanently Close Period = P */
	public static final String PermanentlyClosePeriod = "P";
	@XendraRef(Name="C_PeriodControl Action",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="L",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="6d64edf3-1b4f-9316-fe28-18a11e3727de")
	public static final String Identifier = "6d64edf3-1b4f-9316-fe28-18a11e3727de";

}
