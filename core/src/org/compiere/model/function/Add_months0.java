package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Add_months0 
{
 
@XendraFunction(Name="add_months",Output="date",Owner="xendra",Language="plpgsql",
Identifier="61b03ac7-1dca-5375-c5af-4e8f4ed26326",
Arguments="datetime timestamp with time zone, months numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "61b03ac7-1dca-5375-c5af-4e8f4ed26326";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("declare duration varchar;");
	sb.appendln("BEGIN");
	sb.appendln("if datetime is null or months is null then");
	sb.appendln("return null;");
	sb.appendln("end if;");
	sb.appendln("duration = months || ' month';");
	sb.appendln("return cast(datetime + cast(duration as interval) as date);");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=61b03ac7-1dca-5375-c5af-4e8f4ed26326");
	return sb.toString();
}
}
