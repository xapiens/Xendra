package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Adddays1 
{
 
@XendraFunction(Name="adddays",Output="date",Owner="xendra",Language="plpgsql",
Identifier="fd2b7819-bc22-b493-e734-a615e635afee",
Arguments="datetime timestamp with time zone, days numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "fd2b7819-bc22-b493-e734-a615e635afee";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("declare duration varchar;");
	sb.appendln("BEGIN");
	sb.appendln("if datetime is null or days is null then");
	sb.appendln("return null;");
	sb.appendln("end if;");
	sb.appendln("duration = days || ' day';");
	sb.appendln("return cast(date_trunc('day',datetime) + cast(duration as interval) as date);");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=fd2b7819-bc22-b493-e734-a615e635afee");
	return sb.toString();
}
}
