package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Charat0 
{
 
@XendraFunction(Name="charat",Output="character varying",Owner="xendra",Language="plpgsql",
Identifier="10d8004a-38d7-384a-cb46-fd6373036c54",Arguments="character varying, integer",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "10d8004a-38d7-384a-cb46-fd6373036c54";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("BEGIN");
	sb.appendln("RETURN SUBSTR($1, $2, 1);");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=10d8004a-38d7-384a-cb46-fd6373036c54");
	return sb.toString();
}
}
