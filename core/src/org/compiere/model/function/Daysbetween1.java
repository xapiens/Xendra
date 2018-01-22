package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Daysbetween1 
{
 
@XendraFunction(Name="daysbetween",Output="integer",Owner="xendra",Language="plpgsql",
Identifier="39c43341-963b-ccd6-ca3f-1e5249a98b82",
Arguments="p_date1 timestamp with time zone, p_date2 timestamp with time zone",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "39c43341-963b-ccd6-ca3f-1e5249a98b82";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("BEGIN");
	sb.appendln("RETURN CAST(p_date1 AS DATE) - CAST(p_date2 as DATE);");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=39c43341-963b-ccd6-ca3f-1e5249a98b82");
	return sb.toString();
}
}
