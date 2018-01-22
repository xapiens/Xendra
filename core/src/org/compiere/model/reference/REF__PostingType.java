package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF__PostingType implements Reference 
{
 	@XendraRefItem(Name="Actual",
		Value="A",
		Description="Actual Postings",
		Identifier="2fed1b66-da71-4a25-a814-92076efe269d")
	/** Actual = A */
	public static final String Actual = "A";
	@XendraRefItem(Name="Budget",
		Value="B",
		Description="Budget Postings",
		Identifier="3948c1bd-77e1-6640-d6e5-771329cb3299")
	/** Budget = B */
	public static final String Budget = "B";
	@XendraRefItem(Name="Commitment",
		Value="E",
		Description="External Encumbrance or Commitment Postings",
		Identifier="6ba154f7-af9a-21dc-709d-734e81052325")
	/** Commitment = E */
	public static final String Commitment = "E";
	@XendraRefItem(Name="Statistical",
		Value="S",
		Description="Statistical Postings",
		Identifier="fc20327f-52dc-5508-5b3b-5c8ade040c8e")
	/** Statistical = S */
	public static final String Statistical = "S";
	@XendraRefItem(Name="Reservation",
		Value="R",
		Description="Internal Commitment",
		Identifier="2b5437cf-17df-130d-5a0c-9784dab58b12")
	/** Reservation = R */
	public static final String Reservation = "R";
	@XendraRef(Name="_Posting Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="Posting Type (Actual Budget etc.) list",
		Help="",
		VFormat="L",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="1ad48d23-2ec9-09d0-cb68-38688c5e6ce0")
	public static final String Identifier = "1ad48d23-2ec9-09d0-cb68-38688c5e6ce0";

}
