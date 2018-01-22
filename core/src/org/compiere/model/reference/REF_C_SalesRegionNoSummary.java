package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_SalesRegionNoSummary implements Reference 
{
 	@XendraRefTable(TableRef="C_SalesRegion",
		KeyRef="C_SalesRegion_ID",
		DisplayRef="Name",
		IsValueDisplayed=true,
		WhereClause="C_SalesRegion.IsSummary='N'",
		OrderByClause="",
		Identifier="07a31910-4999-77b3-d2e3-bf331caa6631")
	@XendraRef(Name="C_Sales Region (No summary)",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Sales Region selection (No summary)",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:28.0",
		Extension="",
		Identifier="171f6f27-f3e5-c82c-1cb3-0a78b201c0bc")
	public static final String Identifier = "171f6f27-f3e5-c82c-1cb3-0a78b201c0bc";

}
