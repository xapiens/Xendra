package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_R_RequestDueType implements Reference 
{
 	@XendraRefItem(Name="Overdue",
		Value="3",
		Description="",
		Identifier="5ff5cea6-18ef-0a03-06d0-4614ef1b60db")
	/** Overdue = 3 */
	public static final String Overdue = "3";
	@XendraRefItem(Name="Due",
		Value="5",
		Description="",
		Identifier="f400b480-1b0a-263c-be29-f9f8e4d82624")
	/** Due = 5 */
	public static final String Due = "5";
	@XendraRefItem(Name="Scheduled",
		Value="7",
		Description="",
		Identifier="29479ccc-2474-ffcc-726e-33dcabf0a0ec")
	/** Scheduled = 7 */
	public static final String Scheduled = "7";
	@XendraRef(Name="R_Request Due Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="9",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="0ae60dc4-ed3c-2971-ca47-35954ed98449")
	public static final String Identifier = "0ae60dc4-ed3c-2971-ca47-35954ed98449";

}
