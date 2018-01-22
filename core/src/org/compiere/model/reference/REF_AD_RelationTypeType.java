package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_RelationTypeType implements Reference 
{
 	@XendraRefItem(Name="Explicit",
		Value="E",
		Description="",
		Identifier="d94c8a9e-c900-15e3-740c-618016f8f3e0")
	/** Explicit = E */
	public static final String Explicit = "E";
	@XendraRefItem(Name="Implicit",
		Value="I",
		Description="",
		Identifier="2a38b890-0a7f-a853-2cb7-10c8a721586e")
	/** Implicit = I */
	public static final String Implicit = "I";
	@XendraRef(Name="AD_RelationType Type",
		AD_Reference_ID="0",
		ValidationType="L",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-07-12 00:00:00.0",
		Extension="",
		Identifier="c3039723-e720-0622-e649-ac2d944c0df9")
	public static final String Identifier = "c3039723-e720-0622-e649-ac2d944c0df9";

}
