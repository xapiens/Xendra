package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Adddays0 
{
 
@XendraFunction(Name="adddays",Output="date",Owner="xendra",Language="plpgsql",
Identifier="c0177001-5cab-868c-68a7-1ee5eca91d88",
Arguments="datetime timestamp without time zone, days numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "c0177001-5cab-868c-68a7-1ee5eca91d88";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("declare duration varchar;");
	sb.appendln("BEGIN");
	sb.appendln("	if datetime is null or days is null then");
	sb.appendln("		return null;");
	sb.appendln("	end if;");
	sb.appendln("	duration = days || ' day';	 ");
	sb.appendln("	return cast(date_trunc('day',datetime) + cast(duration as interval) as date);");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=c0177001-5cab-868c-68a7-1ee5eca91d88");
	return sb.toString();
}
}
