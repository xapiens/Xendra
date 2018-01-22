package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_SubjectBAGN implements Reference 
{
 	@XendraRefTable(TableRef="C_Subject",
		KeyRef="C_Subject_ID",
		DisplayRef="Name",
		IsValueDisplayed=true,
		WhereClause="C_Subject.Type='BAGN' AND C_Subject.IsSummary='N'",
		OrderByClause="C_Subject.Value",
		Identifier="40cd67f6-83ac-6877-05c8-70120e60717d")
	@XendraRef(Name="C_Subject BAGN",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:33:55.0",
		Extension="",
		Identifier="2b999daa-5363-8c8f-d398-3b46c7c257ba")
	public static final String Identifier = "2b999daa-5363-8c8f-d398-3b46c7c257ba";

}
