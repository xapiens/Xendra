package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_Client implements Reference 
{
 	@XendraRefTable(TableRef="AD_Client",
		KeyRef="AD_Client_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="AD_Client.Name",
		Identifier="234eb3ce-b5be-ad8e-9cc3-4278992f0d3d")
	@XendraRef(Name="AD_Client",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Client selection",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:34.0",
		Extension="",
		Identifier="dd84397b-63c4-8ffe-5f62-c8d69d925fb7")
	public static final String Identifier = "dd84397b-63c4-8ffe-5f62-c8d69d925fb7";

}
