package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_AcctSchemaCostingLevel implements Reference 
{
 	@XendraRefItem(Name="Batch/Lot",
		Value="B",
		Description="",
		Identifier="87e3fa7c-e4f3-d094-673b-cd47965c6bc4")
	/** Batch/Lot = B */
	public static final String BatchLot = "B";
	@XendraRefItem(Name="Client",
		Value="C",
		Description="",
		Identifier="0dc8e96f-96fe-79be-f9ba-554c4bfeb76b")
	/** Client = C */
	public static final String Client = "C";
	@XendraRefItem(Name="Organization",
		Value="O",
		Description="",
		Identifier="8f7e2ef9-2493-42ea-196e-15a817601859")
	/** Organization = O */
	public static final String Organization = "O";
	@XendraRef(Name="C_AcctSchema CostingLevel",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="50276432-1362-79b4-e882-a2d08541856b")
	public static final String Identifier = "50276432-1362-79b4-e882-a2d08541856b";

}
