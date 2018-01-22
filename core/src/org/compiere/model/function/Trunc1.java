package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Trunc1 
{
 
@XendraFunction(Name="trunc",Output="date",Owner="xendra",Language="plpgsql",
Identifier="4f7e2881-7627-c337-6b52-59e4d3514a88",
Arguments="datetime timestamp without time zone, format character varying",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "4f7e2881-7627-c337-6b52-59e4d3514a88";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("BEGIN");
	sb.appendln("	IF format = 'Q' THEN");
	sb.appendln("		RETURN CAST(DATE_Trunc('quarter',datetime) as DATE);");
	sb.appendln("	ELSIF format = 'Y' THEN");
	sb.appendln("		RETURN CAST(DATE_Trunc('year',datetime) as DATE);");
	sb.appendln("	ELSIF format = 'MM' THEN");
	sb.appendln("		RETURN CAST(DATE_Trunc('month',datetime) as DATE);");
	sb.appendln("	ELSIF format = 'DD' THEN");
	sb.appendln("		RETURN CAST(DATE_Trunc('day',datetime) as DATE);");
	sb.appendln("	ELSIF format = 'DY' THEN");
	sb.appendln("		RETURN CAST(DATE_Trunc('day',datetime) as DATE);");
	sb.appendln("	ELSE");
	sb.appendln("		RETURN CAST(datetime AS DATE);");
	sb.appendln("	END IF;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=4f7e2881-7627-c337-6b52-59e4d3514a88");
	return sb.toString();
}
}
