package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Subtractdays3 
{
 
@XendraFunction(Name="subtractdays",Output="integer",Owner="xendra",Language="plpgsql",
Identifier="552c8603-cb26-b042-e252-f9520050b8e0",Arguments="inter interval, days numeric",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "552c8603-cb26-b042-e252-f9520050b8e0";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("BEGIN");
	sb.appendln("RETURN ( EXTRACT( EPOCH FROM ( inter ) ) / 86400 ) - days;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=552c8603-cb26-b042-e252-f9520050b8e0");
	return sb.toString();
}
}
