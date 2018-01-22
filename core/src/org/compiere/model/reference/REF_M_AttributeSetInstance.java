package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_AttributeSetInstance implements Reference 
{
 	@XendraRefTable(TableRef="M_AttributeInstance",
		KeyRef="M_AttributeSetInstance_ID",
		DisplayRef="Value",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="7ad8c3ae-863b-f216-affc-ea6fd8409258")
	@XendraRef(Name="M_AttributeSetInstance",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:38.0",
		Extension="",
		Identifier="bb57b2f2-25be-b966-04c4-2e0c6ea9b4e2")
	public static final String Identifier = "bb57b2f2-25be-b966-04c4-2e0c6ea9b4e2";

}
