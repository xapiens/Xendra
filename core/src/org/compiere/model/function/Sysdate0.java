package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Sysdate0 
{
 
@XendraFunction(Name="sysdate",Output="timestamp without time zone",Owner="xendra",
Language="plpgsql",Identifier="3127d25d-bd8b-ad10-d101-df71704ef434",Arguments="",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "3127d25d-bd8b-ad10-d101-df71704ef434";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("BEGIN");
	sb.appendln("    RETURN CAST(now() AS TIMESTAMP WITHOUT TIME ZONE);");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=3127d25d-bd8b-ad10-d101-df71704ef434");
	return sb.toString();
}
}
