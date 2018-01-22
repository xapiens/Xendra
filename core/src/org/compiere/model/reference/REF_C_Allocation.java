package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_Allocation implements Reference 
{
 	@XendraRefTable(TableRef="C_AllocationHdr",
		KeyRef="C_AllocationHdr_ID",
		DisplayRef="DocumentNo",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="881a753b-4495-4bd3-afae-adc7ce7a6d42")
	@XendraRef(Name="C_Allocation",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:55:58.0",
		Extension="",
		Identifier="7aaa4262-416e-4f2c-806f-a933a39d011b")
	public static final String Identifier = "7aaa4262-416e-4f2c-806f-a933a39d011b";

}
