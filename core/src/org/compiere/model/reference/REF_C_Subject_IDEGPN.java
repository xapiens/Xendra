package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_Subject_IDEGPN implements Reference 
{
 	@XendraRefTable(TableRef="C_Subject",
		KeyRef="C_Subject_ID",
		DisplayRef="Name",
		IsValueDisplayed=true,
		WhereClause="C_Subject.Type='EGPN' AND C_Subject.IsSummary='N'",
		OrderByClause="C_Subject.Value",
		Identifier="4fe67aaf-8249-d401-0ed5-51c5852ba064")
	@XendraRef(Name="C_Subject_ID EGPN",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:33:55.0",
		Extension="",
		Identifier="e04d59ff-05e3-57f6-56da-18fcb87ee4fa")
	public static final String Identifier = "e04d59ff-05e3-57f6-56da-18fcb87ee4fa";

}
