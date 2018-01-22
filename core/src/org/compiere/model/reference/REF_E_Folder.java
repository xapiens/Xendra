package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_E_Folder implements Reference 
{
 	@XendraRefTable(TableRef="E_Folder",
		KeyRef="E_Folder_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="f3b1d537-c815-4b07-b8bc-e89038b59040")
	@XendraRef(Name="E_Folder",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2013-11-04 14:59:22.0",
		Extension="",
		Identifier="78d11f10-7a65-4786-abf0-65f9631dd1f1")
	public static final String Identifier = "78d11f10-7a65-4786-abf0-65f9631dd1f1";

}
