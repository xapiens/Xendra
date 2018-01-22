package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getdate0 
{
 
@XendraFunction(Name="getdate",Output="timestamp without time zone",Owner="xendra",
Language="plpgsql",Identifier="a3eed4bc-45b8-4f45-94f9-0b5a405e995c",Arguments="",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "a3eed4bc-45b8-4f45-94f9-0b5a405e995c";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("BEGIN");
	sb.appendln("    RETURN now();");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=a3eed4bc-45b8-4f45-94f9-0b5a405e995c");
	return sb.toString();
}
}
