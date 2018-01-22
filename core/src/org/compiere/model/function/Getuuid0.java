package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getuuid0 
{
 
@XendraFunction(Name="getuuid",Output="uuid",Owner="xendra",Language="sql",
Identifier="3a8608df-0e0d-6afa-2805-c0e791a646e7",Arguments="",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "3a8608df-0e0d-6afa-2805-c0e791a646e7";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln(" SELECT CAST(md5(current_database()|| user ||current_timestamp ||random()) as uuid)");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=3a8608df-0e0d-6afa-2805-c0e791a646e7");
	return sb.toString();
}
}
