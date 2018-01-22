package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_PA_Ratio implements Reference 
{
 	@XendraRefTable(TableRef="PA_Ratio",
		KeyRef="PA_Ratio_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="0632ed3b-c6f9-bef0-5bca-f697269a879b")
	@XendraRef(Name="PA_Ratio",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:34:38.0",
		Extension="",
		Identifier="ab063eee-ccf8-4f4f-9bad-a7f0d53a14f6")
	public static final String Identifier = "ab063eee-ccf8-4f4f-9bad-a7f0d53a14f6";

}
