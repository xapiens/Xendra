package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Instr0 
{
 
@XendraFunction(Name="instr",Output="integer",Owner="xendra",Language="plpgsql",
Identifier="8bbcda8a-238d-f0f1-c9d2-94bc51da2bb9",Arguments="character varying, character varying",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "8bbcda8a-238d-f0f1-c9d2-94bc51da2bb9";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("    pos integer;");
	sb.appendln("BEGIN");
	sb.appendln("    pos:= instr($1, $2, 1);");
	sb.appendln("    RETURN pos;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=8bbcda8a-238d-f0f1-c9d2-94bc51da2bb9");
	return sb.toString();
}
}
