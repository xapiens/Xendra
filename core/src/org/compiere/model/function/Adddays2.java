package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Adddays2 
{
 
@XendraFunction(Name="adddays",Output="date",Owner="xendra",Language="plpgsql",
Identifier="5f1fcad6-7020-33a4-49a8-5a62757219f7",Arguments="day date, days numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "5f1fcad6-7020-33a4-49a8-5a62757219f7";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("BEGIN");
	sb.appendln("    RETURN addDays(CAST(day as timestamp), days);");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=5f1fcad6-7020-33a4-49a8-5a62757219f7");
	return sb.toString();
}
}
