package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Trunc2 
{
 
@XendraFunction(Name="trunc",Output="date",Owner="xendra",Language="plpgsql",
Identifier="2088d298-7ba5-51fa-4523-1ef51d6eecd1",Arguments="datetime timestamp with time zone",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "2088d298-7ba5-51fa-4523-1ef51d6eecd1";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("BEGIN");
	sb.appendln("	RETURN CAST(datetime AS DATE);");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=2088d298-7ba5-51fa-4523-1ef51d6eecd1");
	return sb.toString();
}
}
