package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_HRConceptType implements Reference 
{
 	@XendraRefItem(Name="Concept",
		Value="C",
		Description="",
		Identifier="5730c98a-d102-4dc2-b8aa-371e5d4a1ce1")
	/** Concept = C */
	public static final String Concept = "C";
	@XendraRefItem(Name="Rule Engine",
		Value="E",
		Description="",
		Identifier="727e7e75-010e-4c3e-bfdf-315d9a543661")
	/** Rule Engine = E */
	public static final String RuleEngine = "E";
	@XendraRefItem(Name="Information",
		Value="I",
		Description="",
		Identifier="7cf70c2e-229c-4cd5-b0b9-fdedbfeb53f1")
	/** Information = I */
	public static final String Information = "I";
	@XendraRefItem(Name="Reference",
		Value="R",
		Description="",
		Identifier="d732aed2-9d34-45fe-b6d1-0ff072246006")
	/** Reference = R */
	public static final String Reference = "R";
	@XendraRef(Name="HR Concept Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2017-03-13 07:34:30.964",
		Extension="",
		Identifier="fbb0caf4-6137-4a91-b634-f67caf825eb0")
	public static final String Identifier = "fbb0caf4-6137-4a91-b634-f67caf825eb0";

}
