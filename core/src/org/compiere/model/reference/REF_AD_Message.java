package org.compiere.model.reference;


import org.xendra.annotations.*;
import org.compiere.model.Reference;

public class REF_AD_Message implements Reference 
{
 	@XendraRefTable(TableRef="AD_Message",
		KeyRef="AD_Message_ID",
		DisplayRef="MsgText",
		IsValueDisplayed=false,
		WhereClause="",
		OrderByClause="AD_Message.MsgText",
		Identifier="4be30986-b66b-acfe-2566-5ec2fe267524")
	@XendraRef(Name="AD_Message",
		AD_Reference_ID="0",
		ValidationType="T",
		Description="Message selection",
		Help="",
		VFormat="",
		EntityType="D",
		IsOrderByValue=false,
		Synchronized="2012-01-17 10:34:17.0",
		Extension="",
		Identifier="2c01ec68-5b27-914e-a6ce-60a9b599af92")
	public static final String Identifier = "2c01ec68-5b27-914e-a6ce-60a9b599af92";

}
