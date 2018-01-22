package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Round0 
{
 
@XendraFunction(Name="round",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="e46b1ed3-ffee-161b-eeec-c5d42dbf25b8",Arguments="numeric, numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "e46b1ed3-ffee-161b-eeec-c5d42dbf25b8";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("BEGIN");
	sb.appendln("RETURN ROUND($1, cast($2 as integer));");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=e46b1ed3-ffee-161b-eeec-c5d42dbf25b8");
	return sb.toString();
}
}
