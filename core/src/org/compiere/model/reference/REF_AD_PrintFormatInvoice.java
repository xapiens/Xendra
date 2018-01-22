package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_PrintFormatInvoice implements Reference 
{
 	@XendraRefTable(TableRef="AD_PrintFormat",
		KeyRef="AD_PrintFormat_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="AD_PrintFormat.AD_Table_ID=516",
		OrderByClause="",
		Identifier="3db0a33b-f96f-df6a-8238-df6e9ef8aca5")
	@XendraRef(Name="AD_PrintFormat Invoice",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:07.0",
		Extension="",
		Identifier="3fb04288-4549-80e8-1969-6c95b48c8b1a")
	public static final String Identifier = "3fb04288-4549-80e8-1969-6c95b48c8b1a";

}
