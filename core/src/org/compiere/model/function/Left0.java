package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Left0 
{
 
@XendraFunction(Name="left",Output="text",Owner="postgres",Language="sql",
Identifier="533b7215-98bd-ad6c-6871-f4c1d2b4d8c1",Arguments="text, integer",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "533b7215-98bd-ad6c-6871-f4c1d2b4d8c1";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("    SELECT SUBSTRING($1 FOR $2);");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=533b7215-98bd-ad6c-6871-f4c1d2b4d8c1");
	return sb.toString();
}
}
