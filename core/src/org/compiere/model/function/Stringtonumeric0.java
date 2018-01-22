package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Stringtonumeric0 
{
 
@XendraFunction(Name="stringtonumeric",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="32d157a5-06fa-9f8d-3177-189a5f99b37a",Arguments="texttoconvert character varying",
Extension="",Synchronized="2016-08-22 00:11:03.0")
	public static final String Identifier = "32d157a5-06fa-9f8d-3177-189a5f99b37a";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("len integer := 0;");
	sb.appendln("total integer := 0;");
	sb.appendln("BEGIN");
	sb.appendln(" len := length(texttoconvert);");
	sb.appendln(" for j in 1 .. len loop");
	sb.appendln("   total := total + ascii(substring(texttoconvert from j for 1));	   ");
	sb.appendln(" end loop;");
	sb.appendln(" return total;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2016-08-22 00:11:03.0");
	sb.appendln("@Identifier=32d157a5-06fa-9f8d-3177-189a5f99b37a");
	return sb.toString();
}
}
