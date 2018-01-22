package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_PrintFormatItem implements Reference 
{
 	@XendraRefTable(TableRef="AD_PrintFormatItem",
		KeyRef="AD_PrintFormatItem_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="9e711c7e-fe90-7e96-d0df-866bf1deacb3")
	@XendraRef(Name="AD_PrintFormatItem",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:34:25.0",
		Extension="",
		Identifier="3c778fb2-3283-3b68-5942-8a619d40432a")
	public static final String Identifier = "3c778fb2-3283-3b68-5942-8a619d40432a";

}
