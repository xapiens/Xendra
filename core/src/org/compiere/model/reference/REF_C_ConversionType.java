package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_ConversionType implements Reference 
{
 	@XendraRefTable(TableRef="C_ConversionType",
		KeyRef="C_ConversionType_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="1df20a5e-23ad-0858-3808-035eb316a0c6")
	@XendraRef(Name="C_ConversionType",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:34:43.0",
		Extension="",
		Identifier="41dda287-7ecf-a6d1-d177-b35716a62768")
	public static final String Identifier = "41dda287-7ecf-a6d1-d177-b35716a62768";

}
