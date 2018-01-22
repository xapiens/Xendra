package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_RecurringType implements Reference 
{
 	@XendraRefItem(Name="Invoice",
		Value="I",
		Description="",
		Identifier="18ee478b-108a-f5f5-d78f-88a8f5cc82aa")
	/** Invoice = I */
	public static final String Invoice = "I";
	@XendraRefItem(Name="Order",
		Value="O",
		Description="",
		Identifier="05afcded-1b5b-820c-d117-c33b0902be25")
	/** Order = O */
	public static final String Order = "O";
	@XendraRefItem(Name="GL Journal",
		Value="G",
		Description="",
		Identifier="8ccfbedc-a2a4-d05a-2191-fea699d9bb69")
	/** GL Journal = G */
	public static final String GLJournal = "G";
	@XendraRefItem(Name="Project",
		Value="J",
		Description="",
		Identifier="c133e899-5986-a67c-739d-c7f8350b3914")
	/** Project = J */
	public static final String Project = "J";
	@XendraRef(Name="C_Recurring Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="83cd0595-4907-b096-73bb-781e5da6ede4")
	public static final String Identifier = "83cd0595-4907-b096-73bb-781e5da6ede4";

}
