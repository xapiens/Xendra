package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_C_Country implements Reference 
{
 	@XendraRefTable(TableRef="C_Country",
		KeyRef="C_Country_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="C_Country.Name",
		Identifier="35fa52fd-6b90-7cd2-14b3-abe4908e56f9")
	@XendraRef(Name="C_Country",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Country selection",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:38.0",
		Extension="",
		Identifier="da097900-8f86-9a6d-5a27-605e202ce9a8")
	public static final String Identifier = "da097900-8f86-9a6d-5a27-605e202ce9a8";

}
