package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Trunc3 
{
 
@XendraFunction(Name="trunc",Output="date",Owner="xendra",Language="plpgsql",
Identifier="9fd66ab3-bea6-2979-6c34-98bab6978dcc",
Arguments="datetime timestamp with time zone, format character varying",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "9fd66ab3-bea6-2979-6c34-98bab6978dcc";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("BEGIN");
	sb.appendln("IF format = 'Q' THEN");
	sb.appendln("RETURN CAST(DATE_Trunc('quarter',datetime) as DATE);");
	sb.appendln("ELSIF format = 'Y' or format = 'YEAR' THEN");
	sb.appendln("RETURN CAST(DATE_Trunc('year',datetime) as DATE);");
	sb.appendln("ELSIF format = 'MM' or format = 'MONTH' THEN");
	sb.appendln("RETURN CAST(DATE_Trunc('month',datetime) as DATE);");
	sb.appendln("ELSIF format = 'DD' THEN");
	sb.appendln("RETURN CAST(DATE_Trunc('day',datetime) as DATE);");
	sb.appendln("ELSIF format = 'DY' THEN");
	sb.appendln("RETURN CAST(DATE_Trunc('day',datetime) as DATE);");
	sb.appendln("ELSE");
	sb.appendln("RETURN CAST(datetime AS DATE);");
	sb.appendln("END IF;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=9fd66ab3-bea6-2979-6c34-98bab6978dcc");
	return sb.toString();
}
}
