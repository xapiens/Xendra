package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_PA_AchievementParent implements Reference 
{
 	@XendraRefTable(TableRef="PA_Achievement",
		KeyRef="PA_Achievement_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="PA_Achievement.IsSummary='Y'",
		OrderByClause="",
		Identifier="3605c3ee-6fc6-4daa-9223-6dbb63988322")
	@XendraRef(Name="PA_Achievement Parent",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:55:59.0",
		Extension="",
		Identifier="7b28850c-bea8-430c-888a-764ecdbeaacd")
	public static final String Identifier = "7b28850c-bea8-430c-888a-764ecdbeaacd";

}
