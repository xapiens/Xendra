package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Adddays3 
{
 
@XendraFunction(Name="adddays",Output="integer",Owner="xendra",Language="plpgsql",
Identifier="efc99e2b-2406-1151-ff9b-7c983030bb4d",Arguments="inter interval, days numeric",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "efc99e2b-2406-1151-ff9b-7c983030bb4d";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("BEGIN");
	sb.appendln("RETURN ( EXTRACT( EPOCH FROM ( inter ) ) / 86400 ) + days;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=efc99e2b-2406-1151-ff9b-7c983030bb4d");
	return sb.toString();
}
}
