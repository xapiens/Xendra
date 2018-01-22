package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_SubjectEGPF implements Reference 
{
 	@XendraRefTable(TableRef="C_Subject",
		KeyRef="C_Subject_ID",
		DisplayRef="Name",
		IsValueDisplayed=true,
		WhereClause="C_Subject.Type='EGPF' AND C_Subject.IsSummary='N'",
		OrderByClause="C_Subject.Value",
		Identifier="592ef50b-428e-e068-39c1-5fad294ea29c")
	@XendraRef(Name="C_Subject EGPF",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:33:55.0",
		Extension="",
		Identifier="04727e19-8cf0-0f0d-977e-b1393f5e6d19")
	public static final String Identifier = "04727e19-8cf0-0f0d-977e-b1393f5e6d19";

}
