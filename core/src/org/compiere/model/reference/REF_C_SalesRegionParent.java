package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_SalesRegionParent implements Reference 
{
 	@XendraRefTable(TableRef="C_SalesRegion",
		KeyRef="C_SalesRegion_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="C_SalesRegion.IsSummary='Y'",
		OrderByClause="",
		Identifier="4bf259dd-69f4-4e2b-a95c-4a59f8957c0e")
	@XendraRef(Name="C_SalesRegion Parent",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:56:00.0",
		Extension="",
		Identifier="df83a2ff-6d49-4275-b2de-6cfca0a59e98")
	public static final String Identifier = "df83a2ff-6d49-4275-b2de-6cfca0a59e98";

}
