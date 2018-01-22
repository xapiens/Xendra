package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_Location implements Reference 
{
 	@XendraRefTable(TableRef="C_Location",
		KeyRef="C_Location_ID",
		DisplayRef="City",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="6694af44-4d9a-5e4d-fec5-c963804caa68")
	@XendraRef(Name="C_Location",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Location selection",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:28.0",
		Extension="",
		Identifier="69189951-7109-d2c7-f034-b4660d43b572")
	public static final String Identifier = "69189951-7109-d2c7-f034-b4660d43b572";

}
