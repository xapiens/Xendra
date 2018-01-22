package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_WF_NextNodes implements Reference 
{
 	@XendraRefTable(TableRef="AD_WF_Node",
		KeyRef="AD_WF_Node_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="127f6755-6ecb-f3c7-b84d-12cf2f757b66")
	@XendraRef(Name="AD_WF_Next Nodes",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Next workflow node selection",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:34:19.0",
		Extension="",
		Identifier="b83d1e02-d8f3-33c4-a60e-09af92bdcc12")
	public static final String Identifier = "b83d1e02-d8f3-33c4-a60e-09af92bdcc12";

}
