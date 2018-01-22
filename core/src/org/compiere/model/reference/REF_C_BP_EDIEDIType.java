package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_BP_EDIEDIType implements Reference 
{
 	@XendraRefItem(Name="ASC X12 ",
		Value="X",
		Description="",
		Identifier="898bc8ea-d482-08cf-cc9a-8d03bd09d3aa")
	/** ASC X12  = X */
	public static final String ASCX12 = "X";
	@XendraRefItem(Name="EDIFACT",
		Value="E",
		Description="",
		Identifier="1438f05f-fb8c-70b1-c1c6-5b9baee79381")
	/** EDIFACT = E */
	public static final String EDIFACT = "E";
	@XendraRefItem(Name="Email EDI",
		Value="M",
		Description="",
		Identifier="be5b7aa9-3f03-d5c6-5069-01c45dcf6cba")
	/** Email EDI = M */
	public static final String EmailEDI = "M";
	@XendraRef(Name="C_BP_EDI EDI Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="d44c2c52-be7b-5b52-291b-20826071df5a")
	public static final String Identifier = "d44c2c52-be7b-5b52-291b-20826071df5a";

}
