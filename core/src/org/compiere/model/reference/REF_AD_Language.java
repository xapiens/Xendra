package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_Language implements Reference 
{
 	@XendraRefTable(TableRef="AD_Language",
		KeyRef="AD_Language",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="60e3f65e-b07a-68c4-3fbf-9e348402d17c")
	@XendraRef(Name="AD_Language",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Language selection",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:33.0",
		Extension="",
		Identifier="136e26cd-6ffa-f76c-1e63-cce5ed2025b9")
	public static final String Identifier = "136e26cd-6ffa-f76c-1e63-cce5ed2025b9";

}
