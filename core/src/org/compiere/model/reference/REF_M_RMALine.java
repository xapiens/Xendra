package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_M_RMALine implements Reference 
{
 	@XendraRefTable(TableRef="M_RMALine",
		KeyRef="M_RMALine_ID",
		DisplayRef="Line",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="c490d753-7fe4-66ec-09b3-9076b1e5f6d4")
	@XendraRef(Name="M_RMALine",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:24.0",
		Extension="",
		Identifier="6ab4b59d-04c4-3ae9-0a5c-fca29678e934")
	public static final String Identifier = "6ab4b59d-04c4-3ae9-0a5c-fca29678e934";

}
