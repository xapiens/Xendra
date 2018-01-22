package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Subtractdays1 
{
 
@XendraFunction(Name="subtractdays",Output="date",Owner="xendra",Language="plpgsql",
Identifier="4cefd15d-951a-e4f1-f5ba-e89c3c67129e",
Arguments="day timestamp without time zone, days numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "4cefd15d-951a-e4f1-f5ba-e89c3c67129e";

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
	sb.appendln("@Identifier=4cefd15d-951a-e4f1-f5ba-e89c3c67129e");
	return sb.toString();
}
}
