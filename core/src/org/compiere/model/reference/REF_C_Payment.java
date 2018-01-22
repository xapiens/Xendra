package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_Payment implements Reference 
{
 	@XendraRefTable(TableRef="C_Payment",
		KeyRef="C_Payment_ID",
		DisplayRef="DocumentNo",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="e0b37802-946a-a5b9-831b-6e7bb6c7aa3f")
	@XendraRef(Name="C_Payment",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:34:01.0",
		Extension="",
		Identifier="673fb4cb-023a-7fa1-b83c-5a97d7f5caea")
	public static final String Identifier = "673fb4cb-023a-7fa1-b83c-5a97d7f5caea";

}
