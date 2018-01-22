package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_Fact_Acct implements Reference 
{
 	@XendraRefTable(TableRef="Fact_Acct",
		KeyRef="Fact_Acct_ID",
		DisplayRef="Fact_ID",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="992f5fb5-dc51-8572-27f8-de8dd4595445")
	@XendraRef(Name="Fact_Acct",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:34:55.0",
		Extension="",
		Identifier="b263a96f-dfa5-81c7-3182-c952471719d0")
	public static final String Identifier = "b263a96f-dfa5-81c7-3182-c952471719d0";

}
