package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_PeriodAll implements Reference 
{
 	@XendraRefTable(TableRef="C_Period",
		KeyRef="C_Period_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="C_Period.StartDate",
		Identifier="4017f077-512a-9cad-92a5-8eba23241e6b")
	@XendraRef(Name="C_Period (all)",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Periods Sorted by Date",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:34:32.0",
		Extension="",
		Identifier="3e0cd06a-1e7b-c866-dabc-c97665ee2f08")
	public static final String Identifier = "3e0cd06a-1e7b-c866-dabc-c97665ee2f08";

}
