package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_WithholdingType implements Reference 
{
 	@XendraRefItem(Name="Perception",
		Value="P",
		Description="",
		Identifier="63101521-47bf-40ba-ad4b-50c3cb61f9d8")
	/** Perception = P */
	public static final String Perception = "P";
	@XendraRefItem(Name="Detraction",
		Value="D",
		Description="",
		Identifier="6aaee5df-0d93-46e4-8b2b-81d122c6ad2a")
	/** Detraction = D */
	public static final String Detraction = "D";
	@XendraRefItem(Name="Retention",
		Value="R",
		Description="",
		Identifier="746a4fe7-029e-49db-b273-dad058ed1800")
	/** Retention = R */
	public static final String Retention = "R";
	@XendraRefItem(Name="None",
		Value="N",
		Description="",
		Identifier="07142244-b68a-40cf-a71b-e77cc0c99db6")
	/** None = N */
	public static final String None = "N";
	@XendraRef(Name="WithholdingType",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2013-12-04 15:43:00.0",
		Extension="",
		Identifier="843810e4-0376-4299-bd8c-1fc15022d579")
	public static final String Identifier = "843810e4-0376-4299-bd8c-1fc15022d579";

}
