package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_Charge implements Reference 
{
 	@XendraRefTable(TableRef="C_Charge",
		KeyRef="C_Charge_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="C_Charge.AD_Client_ID=@#AD_Client_ID@",
		OrderByClause="",
		Identifier="39886584-7874-9f76-8ac5-8d2494f08c9a")
	@XendraRef(Name="C_Charge",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:31.0",
		Extension="",
		Identifier="f1c5fd9e-f506-616a-8e72-371fc1171092")
	public static final String Identifier = "f1c5fd9e-f506-616a-8e72-371fc1171092";

}
