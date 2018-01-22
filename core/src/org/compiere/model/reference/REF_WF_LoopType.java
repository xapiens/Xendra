package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_WF_LoopType implements Reference 
{
 	@XendraRefItem(Name="While Loop",
		Value="W",
		Description="",
		Identifier="9705ee82-5c44-4051-a846-e1a698b667bd")
	/** While Loop = W */
	public static final String WhileLoop = "W";
	@XendraRefItem(Name="Repeat Until Loop",
		Value="R",
		Description="",
		Identifier="85a2096d-a725-4b31-be1a-42369932a6b1")
	/** Repeat Until Loop = R */
	public static final String RepeatUntilLoop = "R";
	@XendraRef(Name="WF_LoopType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:55:58.0",
		Extension="",
		Identifier="16c3381d-bb84-4d0c-8a9c-d1ce3dbacb96")
	public static final String Identifier = "16c3381d-bb84-4d0c-8a9c-d1ce3dbacb96";

}
