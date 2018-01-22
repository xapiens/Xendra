package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Trunc4 
{
 
@XendraFunction(Name="trunc",Output="integer",Owner="xendra",Language="plpgsql",
Identifier="3863b444-c87d-c7a0-a415-838055c95c12",Arguments="i interval",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "3863b444-c87d-c7a0-a415-838055c95c12";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("BEGIN");
	sb.appendln("RETURN EXTRACT(DAY FROM i);");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=3863b444-c87d-c7a0-a415-838055c95c12");
	return sb.toString();
}
}
