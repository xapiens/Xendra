package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Empty0 
{
 
@XendraFunction(Name="empty",Output="boolean",Owner="xendra",Language="sql",
Identifier="1969c62f-ea65-e04b-17c0-aba97ff5eff7",Arguments="text",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "1969c62f-ea65-e04b-17c0-aba97ff5eff7";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln(" SELECT $1 ~ '^[[:space:]]*$'; ");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=1969c62f-ea65-e04b-17c0-aba97ff5eff7");
	sb.appendln("@comment=Find empty strings or strings containing only whitespace");
	return sb.toString();
}
}
