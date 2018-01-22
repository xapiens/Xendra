package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Subtractdays0 
{
 
@XendraFunction(Name="subtractdays",Output="date",Owner="xendra",Language="plpgsql",
Identifier="e43bcbda-7d64-aa81-ef8d-ccf1b8e3e2b6",Arguments="day date, days numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "e43bcbda-7d64-aa81-ef8d-ccf1b8e3e2b6";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("BEGIN");
	sb.appendln("    RETURN addDays(day,(days * -1));");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=e43bcbda-7d64-aa81-ef8d-ccf1b8e3e2b6");
	return sb.toString();
}
}
