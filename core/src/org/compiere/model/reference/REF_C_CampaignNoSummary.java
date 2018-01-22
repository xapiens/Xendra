package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_CampaignNoSummary implements Reference 
{
 	@XendraRefTable(TableRef="C_Campaign",
		KeyRef="C_Campaign_ID",
		DisplayRef="Name",
		IsValueDisplayed=true,
		WhereClause="C_Campaign.IsSummary='N'",
		OrderByClause="",
		Identifier="06076b0e-5a78-b3f8-44d5-39d2a4276807")
	@XendraRef(Name="C_Campaign (No summary)",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Campaign selection",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:28.0",
		Extension="",
		Identifier="4d82ca8a-79c8-7bf0-4f78-54151e1257f6")
	public static final String Identifier = "4d82ca8a-79c8-7bf0-4f78-54151e1257f6";

}
