package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_WindowTypes implements Reference 
{
 	@XendraRefItem(Name="Single Record",
		Value="S",
		Description="",
		Identifier="e8d706b3-87af-61d9-8375-1448beb8ff10")
	/** Single Record = S */
	public static final String SingleRecord = "S";
	@XendraRefItem(Name="Maintain",
		Value="M",
		Description="",
		Identifier="d1e542e1-0bcd-068a-7f3c-340909d82a59")
	/** Maintain = M */
	public static final String Maintain = "M";
	@XendraRefItem(Name="Transaction",
		Value="T",
		Description="",
		Identifier="f5c13f64-88bc-83ad-d045-d483035f94ca")
	/** Transaction = T */
	public static final String Transaction = "T";
	@XendraRefItem(Name="Query Only",
		Value="Q",
		Description="",
		Identifier="d45daaa4-92c2-016c-b697-617e57058faf")
	/** Query Only = Q */
	public static final String QueryOnly = "Q";
	@XendraRef(Name="AD_Window Types",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Window Type list",
		Help="e.g. M = Multi/Single (one uppercase character)",
		VFormat="L",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="245b3e9d-a18e-93e1-9137-e5d618fc7994")
	public static final String Identifier = "245b3e9d-a18e-93e1-9137-e5d618fc7994";

}
