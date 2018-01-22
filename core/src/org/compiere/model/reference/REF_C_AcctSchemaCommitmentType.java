package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_AcctSchemaCommitmentType implements Reference 
{
 	@XendraRefItem(Name="Commitment only",
		Value="C",
		Description="",
		Identifier="182c2e31-5eaf-4145-a98e-31686aca95eb")
	/** Commitment only = C */
	public static final String CommitmentOnly = "C";
	@XendraRefItem(Name="Commitment & Reservation",
		Value="B",
		Description="",
		Identifier="4835aed1-8ff3-6f82-80f8-4c371ec1c6ff")
	/** Commitment & Reservation = B */
	public static final String CommitmentReservation = "B";
	@XendraRefItem(Name="None",
		Value="N",
		Description="",
		Identifier="ba63a1f4-7bc3-19c6-745a-be160a8c581c")
	/** None = N */
	public static final String None = "N";
	@XendraRef(Name="C_AcctSchema CommitmentType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="02423143-0566-ffd3-86cd-8a9e29dfa190")
	public static final String Identifier = "02423143-0566-ffd3-86cd-8a9e29dfa190";

}
