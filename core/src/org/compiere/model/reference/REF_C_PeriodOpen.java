package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_PeriodOpen implements Reference 
{
 	@XendraRefTable(TableRef="C_Period",
		KeyRef="C_Period_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="EXISTS (SELECT * FROM C_PeriodControl pc WHERE C_Period.C_Period_ID=pc.C_Period_ID AND pc.PeriodStatus='O')",
		OrderByClause="C_Period.StartDate",
		Identifier="9eecb0ad-9101-4d89-898a-2622d64dc717")
	@XendraRef(Name="C_Period (Open)",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Periods Sorted by Date",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2015-07-16 06:56:15.0",
		Extension="",
		Identifier="95aa09db-713c-4dca-bf90-dd3308a297d7")
	public static final String Identifier = "95aa09db-713c-4dca-bf90-dd3308a297d7";

}
