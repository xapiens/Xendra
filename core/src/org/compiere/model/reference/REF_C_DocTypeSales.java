package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_DocTypeSales implements Reference 
{
 	@XendraRefTable(TableRef="C_DocType",
		KeyRef="C_DocType_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="C_DocType.IsSOTrx='Y' AND C_DocType.AD_Client_ID=@#AD_Client_ID@",
		OrderByClause="",
		Identifier="44721a64-b03c-88c4-4255-71385f0200d0")
	@XendraRef(Name="C_DocType Sales",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:21.0",
		Extension="",
		Identifier="824b2431-1bad-3402-53e7-d13a2d71b324")
	public static final String Identifier = "824b2431-1bad-3402-53e7-d13a2d71b324";

}
