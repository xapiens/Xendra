package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_Workflow implements Reference 
{
 	@XendraRefTable(TableRef="AD_Workflow",
		KeyRef="AD_Workflow_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="6733e75f-10a9-1a79-cd3f-c0fa5cb9c1d5")
	@XendraRef(Name="AD_Workflow",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Workflows",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:27.0",
		Extension="",
		Identifier="d816afbe-eb9a-f55c-29ca-d18b459a8e3f")
	public static final String Identifier = "d816afbe-eb9a-f55c-29ca-d18b459a8e3f";

}
