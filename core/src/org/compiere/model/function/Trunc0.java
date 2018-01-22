package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Trunc0 
{
 
@XendraFunction(Name="trunc",Output="date",Owner="xendra",Language="plpgsql",
Identifier="ab7ee10e-8209-d2fd-1ef1-6fb252acdc17",Arguments="datetime timestamp without time zone",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "ab7ee10e-8209-d2fd-1ef1-6fb252acdc17";

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
	sb.appendln("@Identifier=ab7ee10e-8209-d2fd-1ef1-6fb252acdc17");
	return sb.toString();
}
}
