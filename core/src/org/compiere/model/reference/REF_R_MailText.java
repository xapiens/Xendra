package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_R_MailText implements Reference 
{
 	@XendraRefTable(TableRef="R_MailText",
		KeyRef="R_MailText_ID",
		DisplayRef="Name",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="",
		Identifier="98ada2c9-d1a4-fb87-1cda-c905f7b64aa8")
	@XendraRef(Name="R_MailText",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Mail Text",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:35:04.0",
		Extension="",
		Identifier="989c9ac3-aa0d-186e-5762-5668871e42e4")
	public static final String Identifier = "989c9ac3-aa0d-186e-5762-5668871e42e4";

}
