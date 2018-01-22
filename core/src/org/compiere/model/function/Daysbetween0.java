package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Daysbetween0 
{
 
@XendraFunction(Name="daysbetween",Output="integer",Owner="xendra",Language="plpgsql",
Identifier="39782e7f-28a6-ab9b-6c37-a9a7c60a4eb2",
Arguments="p_date1 timestamp without time zone, p_date2 timestamp with time zone",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "39782e7f-28a6-ab9b-6c37-a9a7c60a4eb2";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("BEGIN");
	sb.appendln("	RETURN CAST(p_date1 AS DATE) - CAST(p_date2 as DATE);");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=39782e7f-28a6-ab9b-6c37-a9a7c60a4eb2");
	return sb.toString();
}
}
