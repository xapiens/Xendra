package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_Tab implements Reference 
{
 	@XendraRefTable(TableRef="AD_Tab",
		KeyRef="AD_Tab_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="a4c70f41-1e70-b06c-c39c-0e18c3ee7686")
	@XendraRef(Name="AD_Tab",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:10.0",
		Extension="",
		Identifier="94560dd8-5e1e-7f77-bc05-3ae635c92f61")
	public static final String Identifier = "94560dd8-5e1e-7f77-bc05-3ae635c92f61";

}
