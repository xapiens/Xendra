package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Subtractdays2 
{
 
@XendraFunction(Name="subtractdays",Output="date",Owner="xendra",Language="plpgsql",
Identifier="03d402fe-5f22-43e1-a24b-aa837093147b",
Arguments="day timestamp with time zone, days numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "03d402fe-5f22-43e1-a24b-aa837093147b";

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
	sb.appendln("@Identifier=03d402fe-5f22-43e1-a24b-aa837093147b");
	return sb.toString();
}
}
