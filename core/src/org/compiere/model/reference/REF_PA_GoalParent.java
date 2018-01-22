package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_PA_GoalParent implements Reference 
{
 	@XendraRefTable(TableRef="PA_Goal",
		KeyRef="PA_Goal_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="PA_Goal.IsSummary='Y'",
		OrderByClause="",
		Identifier="a2e90f66-6f74-5041-895f-9ecc06783ab5")
	@XendraRef(Name="PA_Goal Parent",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:33.0",
		Extension="",
		Identifier="3d6c5f0f-cdfa-12af-375a-fb06f67c30fc")
	public static final String Identifier = "3d6c5f0f-cdfa-12af-375a-fb06f67c30fc";

}
